package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class r3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f168586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd f168587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168588c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u65.a f168590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 f168591f;

    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, u65.a aVar) {
        this.f168591f = i3Var;
        this.f168586a = j17;
        this.f168587b = wdVar;
        this.f168588c = str;
        this.f168589d = v5Var;
        this.f168590e = aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a0
    /* renamed from: onReady */
    public void mo32095xb03baf04() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.Long valueOf = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f168586a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var = this.f168591f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainer", "navigateToNext, onReady cost[%dms], appId[%s] type[%s], url[%s]", valueOf, i3Var.m52168x74292566(), this.f168587b, this.f168588c);
        this.f168589d.G(this);
        this.f168590e.b();
        i3Var.I();
    }
}
