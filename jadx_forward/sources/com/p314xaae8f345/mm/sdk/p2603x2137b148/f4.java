package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.k4 f274202d;

    public f4(com.p314xaae8f345.mm.sdk.p2603x2137b148.j4 j4Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.k4 k4Var) {
        this.f274202d = k4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f274202d.f274340e.await();
        } catch (java.lang.InterruptedException unused) {
        }
    }
}
