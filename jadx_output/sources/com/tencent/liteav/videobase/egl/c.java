package com.tencent.liteav.videobase.egl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final /* synthetic */ class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videobase.egl.EGLCore f46754a;

    private c(com.tencent.liteav.videobase.egl.EGLCore eGLCore) {
        this.f46754a = eGLCore;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videobase.egl.EGLCore eGLCore) {
        return new com.tencent.liteav.videobase.egl.c(eGLCore);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videobase.egl.EGLCore.lambda$destroyAsync$0(this.f46754a);
    }
}
