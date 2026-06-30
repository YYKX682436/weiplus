package com.p314xaae8f345.mm.app;

/* loaded from: classes.dex */
public final class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f135354d;

    public u3(java.lang.Runnable runnable) {
        this.f135354d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f135354d.run();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.executeSafely", "execute failed: " + e17.getMessage());
        }
    }
}
