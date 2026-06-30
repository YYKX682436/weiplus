package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class y4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d5 f199076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f199077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d5 d5Var, int i17) {
        super(0);
        this.f199076d = d5Var;
        this.f199077e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f199076d.f198565i = true;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_TEST_MODE_GUIDE_TIMESTAMP_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_TEST_MODE_GUIDE_COUNT_INT_SYNC, java.lang.Integer.valueOf(this.f199077e + 1));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 78L, jSONObject.toString(), null, 4, null);
        return jz5.f0.f384359a;
    }
}
