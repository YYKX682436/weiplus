package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public class j0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163772f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f163773g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f163774h;

    public j0(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        this.f163770d = str;
        this.f163771e = str2;
        this.f163772f = str3;
        this.f163773g = j17;
        this.f163774h = c12559xbdae8559;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        java.lang.String str = this.f163770d;
        h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(str), str, this.f163771e, this.f163772f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var) {
        h(w0Var, this.f163770d, this.f163771e, this.f163772f);
    }

    public final void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i17;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f163773g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniProgramNavigatorAdReportHelper", "[rewardAD] doReport appId: %s, adInfo: %s", str, str3);
        int ordinal = w0Var.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            i17 = 1;
        } else {
            i17 = ordinal != 4 ? ordinal != 7 ? 0 : 3 : 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.k0.b(i17, str, str2, str3, currentTimeMillis);
        this.f163774h.f169327m = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(str, this);
    }
}
