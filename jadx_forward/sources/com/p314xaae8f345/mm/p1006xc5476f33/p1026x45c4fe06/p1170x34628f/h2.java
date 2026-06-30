package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class h2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f168190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168191c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u65.a f168192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 f168193e;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, long j17, java.lang.String str, u65.a aVar) {
        this.f168193e = y1Var;
        this.f168189a = v5Var;
        this.f168190b = j17;
        this.f168191c = str;
        this.f168192d = aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a0
    /* renamed from: onReady */
    public void mo32095xb03baf04() {
        this.f168189a.G(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMultiplePage", "Tab[%s][%s] onReady received, time: %d", this.f168193e.m52222x74292566(), this.f168191c, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f168190b));
        this.f168192d.b();
    }
}
