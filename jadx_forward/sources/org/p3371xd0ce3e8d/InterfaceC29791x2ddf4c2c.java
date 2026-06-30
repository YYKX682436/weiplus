package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.IRenderer */
/* loaded from: classes7.dex */
public interface InterfaceC29791x2ddf4c2c {

    /* renamed from: org.webrtc.IRenderer$OnCaptureListener */
    /* loaded from: classes7.dex */
    public interface OnCaptureListener {
        /* renamed from: onCapture */
        void mo145457x7095c867(android.graphics.Bitmap bitmap);
    }

    /* renamed from: getFrameWithGLCallback */
    org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.OnFrameInGLEnv mo155619x2fdd9927();

    /* renamed from: init */
    void mo155620x316510(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents);

    /* renamed from: init */
    void mo155621x316510(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents, int[] iArr, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer);

    /* renamed from: requestCaptureOnce */
    void mo155622x299f1cd8(org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c.OnCaptureListener onCaptureListener);

    /* renamed from: setFrameWithGLCallback */
    void mo155623x7e22589b(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.OnFrameInGLEnv onFrameInGLEnv);
}
