package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes7.dex */
public class c8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 f274038d;

    public c8(com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 d8Var) {
        this.f274038d = d8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("task run manualFinish = ");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 d8Var = this.f274038d;
        sb6.append(d8Var.f274068f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.SyncTask", sb6.toString());
        if (d8Var.f274068f) {
            d8Var.b();
        } else {
            d8Var.c(d8Var.b());
        }
        long j17 = d8Var.f274066d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        d8Var.f274067e = android.os.SystemClock.elapsedRealtime() - j17;
    }
}
