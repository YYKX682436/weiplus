package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.Camera2EncoderProfilesProvider */
/* loaded from: classes14.dex */
public class C0200x3c74ccea implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0706x20a07517 {
    private static final java.lang.String TAG = "Camera2EncoderProfilesProvider";

    /* renamed from: mCameraId */
    private final java.lang.String f334x1c133ead;

    /* renamed from: mCameraQuirks */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 f335x5c91e907;

    /* renamed from: mEncoderProfilesCache */
    private final java.util.Map<java.lang.Integer, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08> f336x72d18a09 = new java.util.HashMap();

    /* renamed from: mHasValidCameraId */
    private final boolean f337x3eb8c14f;

    /* renamed from: mIntCameraId */
    private final int f338xdd5b4582;

    /* renamed from: androidx.camera.camera2.internal.Camera2EncoderProfilesProvider$Api31Impl */
    /* loaded from: classes14.dex */
    public static class Api31Impl {
        private Api31Impl() {
        }

        /* renamed from: getAll */
        public static android.media.EncoderProfiles m3278xb5882a6b(java.lang.String str, int i17) {
            return android.media.CamcorderProfile.getAll(str, i17);
        }
    }

    public C0200x3c74ccea(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95) {
        boolean z17;
        int i17;
        this.f334x1c133ead = str;
        try {
            i17 = java.lang.Integer.parseInt(str);
            z17 = true;
        } catch (java.lang.NumberFormatException unused) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z17 = false;
            i17 = -1;
        }
        this.f337x3eb8c14f = z17;
        this.f338xdd5b4582 = i17;
        this.f335x5c91e907 = c0744x90dabc95;
    }

    /* renamed from: createProfilesFromCamcorderProfile */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08 m3271xb40404df(int i17) {
        android.media.CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = android.media.CamcorderProfile.get(this.f338xdd5b4582, i17);
        } catch (java.lang.RuntimeException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Unable to get CamcorderProfile by quality: " + i17, e17);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p040xaf3f3382.C0772xb6fc56aa.m5766x3017aa(camcorderProfile);
        }
        return null;
    }

    /* renamed from: findHighestQualityProfiles */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08 m3272xdf00adde() {
        java.util.Iterator<java.lang.Integer> it = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0706x20a07517.f1653x6178ed4d.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08 mo3276xb5882a6b = mo3276xb5882a6b(it.next().intValue());
            if (mo3276xb5882a6b != null) {
                return mo3276xb5882a6b;
            }
        }
        return null;
    }

    /* renamed from: findLowestQualityProfiles */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08 m3273x2317e1be() {
        for (int size = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0706x20a07517.f1653x6178ed4d.size() - 1; size >= 0; size--) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08 mo3276xb5882a6b = mo3276xb5882a6b(size);
            if (mo3276xb5882a6b != null) {
                return mo3276xb5882a6b;
            }
        }
        return null;
    }

    /* renamed from: getProfilesInternal */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08 m3274x6ca7b43d(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            android.media.EncoderProfiles m3278xb5882a6b = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0200x3c74ccea.Api31Impl.m3278xb5882a6b(this.f334x1c133ead, i17);
            if (m3278xb5882a6b == null) {
                return null;
            }
            if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0370xcf1a968b.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0387x921e0770.class) != null) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p040xaf3f3382.C0772xb6fc56aa.m5767x3017aa(m3278xb5882a6b);
                } catch (java.lang.NullPointerException e17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e17);
                }
            }
        }
        return m3271xb40404df(i17);
    }

    /* renamed from: isEncoderProfilesResolutionValidInQuirk */
    private boolean m3275xe137d285(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08 interfaceC0707x16701d08) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0360x35ff0b63 c0360x35ff0b63 = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0360x35ff0b63) this.f335x5c91e907.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0360x35ff0b63.class);
        if (c0360x35ff0b63 == null) {
            return true;
        }
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy> mo5134x71ba35cf = interfaceC0707x16701d08.mo5134x71ba35cf();
        if (mo5134x71ba35cf.isEmpty()) {
            return true;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy videoProfileProxy = mo5134x71ba35cf.get(0);
        return c0360x35ff0b63.m3923x2103142f().contains(new android.util.Size(videoProfileProxy.mo5147x755bd410(), videoProfileProxy.mo5144x1c4fb41d()));
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0706x20a07517
    /* renamed from: getAll */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08 mo3276xb5882a6b(int i17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08 interfaceC0707x16701d08 = null;
        if (!this.f337x3eb8c14f || !android.media.CamcorderProfile.hasProfile(this.f338xdd5b4582, i17)) {
            return null;
        }
        if (this.f336x72d18a09.containsKey(java.lang.Integer.valueOf(i17))) {
            return this.f336x72d18a09.get(java.lang.Integer.valueOf(i17));
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08 m3274x6ca7b43d = m3274x6ca7b43d(i17);
        if (m3274x6ca7b43d == null || m3275xe137d285(m3274x6ca7b43d)) {
            interfaceC0707x16701d08 = m3274x6ca7b43d;
        } else if (i17 == 1) {
            interfaceC0707x16701d08 = m3272xdf00adde();
        } else if (i17 == 0) {
            interfaceC0707x16701d08 = m3273x2317e1be();
        }
        this.f336x72d18a09.put(java.lang.Integer.valueOf(i17), interfaceC0707x16701d08);
        return interfaceC0707x16701d08;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0706x20a07517
    /* renamed from: hasProfile */
    public boolean mo3277x66b24daf(int i17) {
        return this.f337x3eb8c14f && mo3276xb5882a6b(i17) != null;
    }
}
