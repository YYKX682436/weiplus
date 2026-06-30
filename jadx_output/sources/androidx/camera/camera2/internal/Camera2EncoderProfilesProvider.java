package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public class Camera2EncoderProfilesProvider implements androidx.camera.core.impl.EncoderProfilesProvider {
    private static final java.lang.String TAG = "Camera2EncoderProfilesProvider";
    private final java.lang.String mCameraId;
    private final androidx.camera.core.impl.Quirks mCameraQuirks;
    private final java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> mEncoderProfilesCache = new java.util.HashMap();
    private final boolean mHasValidCameraId;
    private final int mIntCameraId;

    /* loaded from: classes14.dex */
    public static class Api31Impl {
        private Api31Impl() {
        }

        public static android.media.EncoderProfiles getAll(java.lang.String str, int i17) {
            return android.media.CamcorderProfile.getAll(str, i17);
        }
    }

    public Camera2EncoderProfilesProvider(java.lang.String str, androidx.camera.core.impl.Quirks quirks) {
        boolean z17;
        int i17;
        this.mCameraId = str;
        try {
            i17 = java.lang.Integer.parseInt(str);
            z17 = true;
        } catch (java.lang.NumberFormatException unused) {
            androidx.camera.core.Logger.w(TAG, "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z17 = false;
            i17 = -1;
        }
        this.mHasValidCameraId = z17;
        this.mIntCameraId = i17;
        this.mCameraQuirks = quirks;
    }

    private androidx.camera.core.impl.EncoderProfilesProxy createProfilesFromCamcorderProfile(int i17) {
        android.media.CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = android.media.CamcorderProfile.get(this.mIntCameraId, i17);
        } catch (java.lang.RuntimeException e17) {
            androidx.camera.core.Logger.w(TAG, "Unable to get CamcorderProfile by quality: " + i17, e17);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return androidx.camera.core.impl.compat.EncoderProfilesProxyCompat.from(camcorderProfile);
        }
        return null;
    }

    private androidx.camera.core.impl.EncoderProfilesProxy findHighestQualityProfiles() {
        java.util.Iterator<java.lang.Integer> it = androidx.camera.core.impl.EncoderProfilesProvider.QUALITY_HIGH_TO_LOW.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.EncoderProfilesProxy all = getAll(it.next().intValue());
            if (all != null) {
                return all;
            }
        }
        return null;
    }

    private androidx.camera.core.impl.EncoderProfilesProxy findLowestQualityProfiles() {
        for (int size = androidx.camera.core.impl.EncoderProfilesProvider.QUALITY_HIGH_TO_LOW.size() - 1; size >= 0; size--) {
            androidx.camera.core.impl.EncoderProfilesProxy all = getAll(size);
            if (all != null) {
                return all;
            }
        }
        return null;
    }

    private androidx.camera.core.impl.EncoderProfilesProxy getProfilesInternal(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            android.media.EncoderProfiles all = androidx.camera.camera2.internal.Camera2EncoderProfilesProvider.Api31Impl.getAll(this.mCameraId, i17);
            if (all == null) {
                return null;
            }
            if (androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.class) != null) {
                androidx.camera.core.Logger.d(TAG, "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return androidx.camera.core.impl.compat.EncoderProfilesProxyCompat.from(all);
                } catch (java.lang.NullPointerException e17) {
                    androidx.camera.core.Logger.w(TAG, "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e17);
                }
            }
        }
        return createProfilesFromCamcorderProfile(i17);
    }

    private boolean isEncoderProfilesResolutionValidInQuirk(androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy) {
        androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk) this.mCameraQuirks.get(androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk.class);
        if (camcorderProfileResolutionQuirk == null) {
            return true;
        }
        java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> videoProfiles = encoderProfilesProxy.getVideoProfiles();
        if (videoProfiles.isEmpty()) {
            return true;
        }
        androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = videoProfiles.get(0);
        return camcorderProfileResolutionQuirk.getSupportedResolutions().contains(new android.util.Size(videoProfileProxy.getWidth(), videoProfileProxy.getHeight()));
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public androidx.camera.core.impl.EncoderProfilesProxy getAll(int i17) {
        androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy = null;
        if (!this.mHasValidCameraId || !android.media.CamcorderProfile.hasProfile(this.mIntCameraId, i17)) {
            return null;
        }
        if (this.mEncoderProfilesCache.containsKey(java.lang.Integer.valueOf(i17))) {
            return this.mEncoderProfilesCache.get(java.lang.Integer.valueOf(i17));
        }
        androidx.camera.core.impl.EncoderProfilesProxy profilesInternal = getProfilesInternal(i17);
        if (profilesInternal == null || isEncoderProfilesResolutionValidInQuirk(profilesInternal)) {
            encoderProfilesProxy = profilesInternal;
        } else if (i17 == 1) {
            encoderProfilesProxy = findHighestQualityProfiles();
        } else if (i17 == 0) {
            encoderProfilesProxy = findLowestQualityProfiles();
        }
        this.mEncoderProfilesCache.put(java.lang.Integer.valueOf(i17), encoderProfilesProxy);
        return encoderProfilesProxy;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i17) {
        return this.mHasValidCameraId && getAll(i17) != null;
    }
}
