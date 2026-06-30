package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes12.dex */
public class v6 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f157540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w6 f157541c;

    public v6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w6 w6Var, int i17, long j17) {
        this.f157541c = w6Var;
        this.f157539a = i17;
        this.f157540b = j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p4
    public void a(yz5.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Thread onExecute ");
        int i17 = this.f157539a;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AsyncTaskQueue", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w6 w6Var = this.f157541c;
        w6Var.f157556f.add(java.lang.Integer.valueOf(i17));
        w6Var.f157557g.schedule(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u6(this, aVar), this.f157540b, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
