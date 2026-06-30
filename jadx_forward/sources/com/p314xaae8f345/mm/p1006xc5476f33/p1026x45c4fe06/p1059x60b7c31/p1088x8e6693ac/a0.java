package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* loaded from: classes7.dex */
public class a0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f162466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162470h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.i0 f162471i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162472m;

    public a0(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.i0 i0Var, java.lang.String str5) {
        this.f162466d = i17;
        this.f162467e = str;
        this.f162468f = str2;
        this.f162469g = str3;
        this.f162470h = str4;
        this.f162471i = i0Var;
        this.f162472m = str5;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        r45.bl blVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12096x58b075a5 c12096x58b075a5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12096x58b075a5) obj;
        if (c12096x58b075a5 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c12096x58b075a5.f162427d) || c12096x58b075a5.f162430g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenBusinessViewUtil", "onCallback, data or cacheKey or respBuff is null");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.a(this.f162466d, this.f162467e, this.f162468f, this.f162469g, this.f162470h, this.f162471i, true, this.f162472m);
            return;
        }
        long H1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(c12096x58b075a5.f162429f);
        long j17 = c12096x58b075a5.f162428e;
        if (j17 <= 0) {
            j17 = 864000;
        }
        boolean z17 = false;
        boolean z18 = H1 > j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "expireTime:%d, duration:%d", java.lang.Long.valueOf(H1), java.lang.Long.valueOf(c12096x58b075a5.f162428e));
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenBusinessViewUtil", "onCallback, data exceed the expire time, it will be deleted!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.a(this.f162466d, this.f162467e, this.f162468f, this.f162469g, this.f162470h, this.f162471i, true, this.f162472m);
            return;
        }
        r45.q54 q54Var = new r45.q54();
        try {
            q54Var.mo11468x92b714fd(c12096x58b075a5.f162430g);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenBusinessViewUtil", e17, "parse response from respBuff", new java.lang.Object[0]);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q54Var.f465225i)) {
            str = (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q54Var.f465225i) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q54Var.f465221e)) ? "" : q54Var.f465221e;
        } else {
            str = q54Var.f465225i + "?" + this.f162468f;
        }
        java.lang.String str2 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "transBusinessAppInfo, request success, appId:%s, new path:%s, old path:%s", q54Var.f465220d, str2, q54Var.f465221e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.i0 i0Var = this.f162471i;
        if (i0Var != null) {
            r45.ge7 ge7Var = q54Var.f465226m;
            if (ge7Var != null) {
                r45.bl blVar2 = ge7Var.f456713e;
                z17 = ge7Var.f456712d;
                blVar = blVar2;
            } else {
                blVar = null;
            }
            i0Var.b(q54Var.f465220d, str2, q54Var.f465222f, z17, blVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.a(this.f162466d, this.f162467e, this.f162468f, this.f162469g, this.f162470h, this.f162471i, false, this.f162472m);
        }
    }
}
