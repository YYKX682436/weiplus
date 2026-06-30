package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class a00 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f199244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f199245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199246c;

    public a00(yz5.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var, java.lang.String str) {
        this.f199244a = pVar;
        this.f199245b = m10Var;
        this.f199246c = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "team up, check minor result: errCode: " + fVar.f152149b + ", errType: " + fVar.f152148a + ", errMsg: " + fVar.f152150c);
        int i17 = fVar.f152149b;
        yz5.p pVar = this.f199244a;
        if (i17 != -1) {
            java.lang.String str = fVar.f152150c;
            if (str == null) {
                str = "";
            }
            if (!(str.length() > 0)) {
                java.util.Map map = this.f199245b.O;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                map.put(this.f199246c, bool);
                pVar.mo149xb9724478(bool, null);
                return jz5.f0.f384359a;
            }
        }
        pVar.mo149xb9724478(java.lang.Boolean.FALSE, fVar.f152150c);
        return jz5.f0.f384359a;
    }
}
