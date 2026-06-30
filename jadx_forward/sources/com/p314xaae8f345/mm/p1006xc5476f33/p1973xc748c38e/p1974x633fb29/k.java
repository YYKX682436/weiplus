package com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29;

/* loaded from: classes.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f236497d;

    public k(java.lang.Runnable runnable) {
        this.f236497d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable = this.f236497d;
        if (runnable != null) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50297x7c4d7ca2(runnable, 200L);
        }
    }
}
