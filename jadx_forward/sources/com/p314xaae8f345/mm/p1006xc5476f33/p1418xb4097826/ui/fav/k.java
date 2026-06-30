package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes8.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p f210713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f210714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f210715f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p pVar, so2.j5 j5Var, long j17) {
        super(1);
        this.f210713d = pVar;
        this.f210714e = j5Var;
        this.f210715f = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f it = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("is_from_finder", 1);
        z30.u uVar = (z30.u) i95.n0.c(z30.u.class);
        java.lang.String y17 = this.f210713d.y(this.f210714e, this.f210715f);
        java.lang.String jSONObject2 = jSONObject.toString();
        ((y30.q) uVar).getClass();
        ((a82.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).mj()).T6(y17, jSONObject2, null);
        return jz5.f0.f384359a;
    }
}
