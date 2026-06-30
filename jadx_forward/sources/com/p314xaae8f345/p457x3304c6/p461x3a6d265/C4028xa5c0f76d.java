package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJCaptureSession */
/* loaded from: classes5.dex */
public class C4028xa5c0f76d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f129446a;

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f15915x39e86013 = m32877xfce9a72c();

    public C4028xa5c0f76d(boolean z17, rg.c cVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.w0 w0Var) {
        this.f129446a = false;
        if (w0Var != null) {
            m32881xde67b186(z17, cVar.f476682d);
            boolean m32879x3fa2cbca = m32879x3fa2cbca();
            this.f129446a = m32879x3fa2cbca;
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136903x3164ae("MJCaptureSession", "canUseNativeCamera: " + m32879x3fa2cbca);
            if (m32879x3fa2cbca) {
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m32880xb17ff728 = m32880xb17ff728();
                int i17 = (int) m32880xb17ff728.f129332x;
                int i18 = (int) m32880xb17ff728.f129333y;
                if (i17 <= 0 || i18 <= 0) {
                    io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208("MJCaptureSession", "Invalid capture size: " + i17 + "x" + i18);
                    this.f129446a = false;
                    return;
                }
                az0.w2.f97537t = i17;
                az0.w2.f97538u = i18;
                android.graphics.SurfaceTexture surfaceTexture = az0.w2.f97529i;
                if (surfaceTexture != null) {
                    surfaceTexture.setDefaultBufferSize(i17, i18);
                }
                io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136903x3164ae("MJCaptureSession", "captureWidth " + i17 + " capture height " + i18);
                boolean m32878x2aab2e46 = m32879x3fa2cbca & m32878x2aab2e46(az0.w2.f97534q);
                this.f129446a = m32878x2aab2e46;
                m32882xac46d0b4();
                this.f129446a = m32878x2aab2e46 & m32879x3fa2cbca();
            }
        }
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m32877xfce9a72c();

    /* renamed from: nativeCameraAddOutput */
    private native boolean m32878x2aab2e46(android.view.Surface surface);

    /* renamed from: nativeCanUseNativeCamera */
    private native boolean m32879x3fa2cbca();

    /* renamed from: nativeGetCaptureSize */
    private native com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m32880xb17ff728();

    /* renamed from: nativeOpenCamera */
    private native boolean m32881xde67b186(boolean z17, int i17);

    /* renamed from: nativeStartRunning */
    private native void m32882xac46d0b4();

    public void a() {
        this.f15915x39e86013.m16727xc85fe246();
    }

    public void b() {
        m32882xac46d0b4();
    }
}
