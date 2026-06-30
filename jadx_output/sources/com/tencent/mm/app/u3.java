package com.tencent.mm.app;

/* loaded from: classes.dex */
public final class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f53821d;

    public u3(java.lang.Runnable runnable) {
        this.f53821d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f53821d.run();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.executeSafely", "execute failed: " + e17.getMessage());
        }
    }
}
