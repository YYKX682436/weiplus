package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class pl extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl f190265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f190266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f190267f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f190268g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar, so2.u1 u1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, in5.s0 s0Var) {
        super(0);
        this.f190265d = tlVar;
        this.f190266e = u1Var;
        this.f190267f = c14994x9b99c079;
        this.f190268g = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = this.f190265d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = tlVar.f190602d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("first_feedid", pm0.v.u(tlVar.f190617v));
        jSONObject.put("feedid", pm0.v.u(((so2.j5) this.f190268g.f374658i).mo2128x1ed62e84()));
        so2.u1 u1Var = this.f190266e;
        jSONObject.put("next_feedid", pm0.v.u(u1Var.mo2128x1ed62e84()));
        r45.ru2 m76771x17e42f9f = u1Var.getFeedObject().getFeedObject().m76771x17e42f9f();
        if (m76771x17e42f9f == null || (str = m76771x17e42f9f.m75945x2fec8307(0)) == null) {
            str = "";
        }
        jSONObject.put("recommend_reason", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, V6, "next_feed_play", 1, jSONObject, false, null, 48, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl.b(this.f190265d, this.f190266e, null, 0, 6, null);
        vn2.u0 u0Var = vn2.u0.f519920a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f190267f;
        long j17 = u0Var.j(c14994x9b99c079);
        if (j17 <= 0) {
            r45.no2 m76812x1c39ba23 = c14994x9b99c079.getFeedObject().m76812x1c39ba23();
            j17 = m76812x1c39ba23 != null ? m76812x1c39ba23.m75939xb282bd08(0) : 0;
        }
        long j18 = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) tlVar.f().p(com.p314xaae8f345.mm.R.id.e_k);
        if (c15196x85976f5f != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f.Z(c15196x85976f5f, j18, 3, 0.0f, false, null, 28, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a.a(tlVar.f190602d, u1Var, 54);
        return jz5.f0.f384359a;
    }
}
