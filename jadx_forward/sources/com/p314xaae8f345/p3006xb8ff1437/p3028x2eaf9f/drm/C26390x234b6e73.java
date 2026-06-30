package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm;

/* renamed from: com.tencent.thumbplayer.core.drm.TPMediaDrmPool */
/* loaded from: classes16.dex */
public final class C26390x234b6e73 {
    private static final java.lang.String TAG = "TPMediaDrmManager";

    /* renamed from: sInstance */
    private static final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26390x234b6e73 f53069xbfaed628 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26390x234b6e73();

    /* renamed from: mIsMediaDrmReuse */
    private boolean f53070x563a92e2 = false;

    private C26390x234b6e73() {
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26390x234b6e73 m102528x9cf0d20b() {
        return f53069xbfaed628;
    }

    /* renamed from: createTPDirectMediaDrm */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0 m102529x6359e0bc(java.util.UUID uuid) {
        return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26387x8bfdb7c0(uuid);
    }

    /* renamed from: createTPMediaDrm */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0 m102530x41a2abb3(java.util.UUID uuid) {
        if (this.f53070x563a92e2) {
            try {
                return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893(uuid);
            } catch (android.media.MediaDrmException | com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26389xaaa43542 e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "reset error:" + e17);
            }
        }
        return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26387x8bfdb7c0(uuid);
    }

    /* renamed from: preload */
    public void m102531xed046e09() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.m102569x5db601f3();
    }

    /* renamed from: setMediaDrmReuseEnable */
    public void m102532x2f3e833a(boolean z17) {
        this.f53070x563a92e2 = z17;
        if (z17) {
            m102531xed046e09();
        }
    }
}
