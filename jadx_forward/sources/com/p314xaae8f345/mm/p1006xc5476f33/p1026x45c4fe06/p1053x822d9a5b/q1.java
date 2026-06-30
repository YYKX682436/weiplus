package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t1 f159669d;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t1 t1Var) {
        this.f159669d = t1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t1 t1Var = this.f159669d;
        int t07 = t1Var.t0();
        android.os.Handler handler = t1Var.f159678x;
        if (handler != null) {
            handler.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.p1(this, t07));
        }
    }
}
