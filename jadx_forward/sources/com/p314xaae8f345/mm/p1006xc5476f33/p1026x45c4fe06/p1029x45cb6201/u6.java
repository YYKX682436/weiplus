package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes12.dex */
public class u6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f157522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v6 f157523e;

    public u6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v6 v6Var, yz5.a aVar) {
        this.f157523e = v6Var;
        this.f157522d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Thread onExecute finish");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v6 v6Var = this.f157523e;
        sb6.append(v6Var.f157539a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AsyncTaskQueue", sb6.toString());
        this.f157522d.mo152xb9724478();
        v6Var.f157541c.f157558h.countDown();
    }
}
