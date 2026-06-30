package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class x6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w6 f173910d;

    public x6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w6 w6Var) {
        this.f173910d = w6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        android.os.Looper myLooper = android.os.Looper.myLooper();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w6 w6Var = this.f173910d;
        if (mainLooper == myLooper && !android.os.Looper.myQueue().isIdle()) {
            w6Var.f172483d.o(this);
        } else {
            w6Var.f172483d.K0(true);
            w6Var.d();
        }
    }
}
