package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public class a extends x92.e {
    public java.lang.String B;
    public long C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public org.json.JSONObject G;
    public r45.qt2 H;
    public final int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.B = "";
        this.C = c01.id.c();
        this.D = xy2.c.e(activity) + '-' + this.C;
        this.E = "";
        this.F = "";
        this.G = new org.json.JSONObject();
        this.I = -1;
    }

    @Override // x92.e, x92.r
    public void R6() {
        super.R6();
        android.widget.LinearLayout linearLayout = this.f534211n;
        if (linearLayout != null) {
            s92.g.d(s92.g.f486539a, m158354x19263085(), linearLayout, "activity_more", 0, 8, null);
        }
    }

    @Override // x92.r
    public void S6(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.e21 e21Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        r45.r03 r03Var = (r45.r03) fVar;
        super.S6(r03Var);
        java.lang.String m76197x6c03c64c = (r03Var == null || (e21Var = (r45.e21) r03Var.m75936x14adae67(16)) == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c();
        if (m76197x6c03c64c == null) {
            m76197x6c03c64c = "";
        }
        this.B = m76197x6c03c64c;
    }

    @Override // x92.e
    public v92.g X6() {
        return new aa2.j((r45.r03) this.f534252d, m158354x19263085());
    }

    @Override // x92.e
    public java.lang.String Y6() {
        r45.e21 e21Var;
        r45.r03 r03Var = (r45.r03) this.f534252d;
        java.lang.String m75945x2fec8307 = (r03Var == null || (e21Var = (r45.e21) r03Var.m75936x14adae67(16)) == null) ? null : e21Var.m75945x2fec8307(2);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // x92.e, x92.r, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        long longExtra = m158359x1e885992().getLongExtra("start_time", -1L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("vst_id");
        if (longExtra > 0) {
            if (stringExtra == null || stringExtra.length() == 0) {
                return;
            }
            this.C = longExtra;
            this.D = stringExtra;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.H = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        this.F = pm0.v.u(m158359x1e885992().getLongExtra("key_feed_report_id", -1L));
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_activity_profile_src_type");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.E = stringExtra;
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("key_extra_report_info");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        int intExtra = m158359x1e885992().getIntExtra("key_enter_scene", 0);
        java.lang.String stringExtra3 = m158359x1e885992().getStringExtra("key_extra_info");
        java.lang.String str = stringExtra3 != null ? stringExtra3 : "";
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.E, "1")) {
            this.G.put("src_type", this.E).put("vst_id", this.D).put("src_ext_info", new org.json.JSONObject().put("feedid", this.F));
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.E, "2")) {
            this.G.put("src_type", this.E).put("vst_id", this.D).put("src_ext_info", new org.json.JSONObject().put("finderusername", this.B));
        } else {
            this.G.put("src_type", this.E).put("vst_id", this.D);
        }
        if (intExtra == 15) {
            this.G = new org.json.JSONObject(stringExtra2);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        org.json.JSONObject jSONObject = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o.class)).X;
        if (jSONObject != null) {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                this.G.put(next, jSONObject.opt(next));
            }
        }
        int i17 = this.I;
        if (i17 != -1) {
            this.G.put("activity_entry_type", i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d3 d3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d3.f206528a;
        d3Var.a(m80379x76847179(), this.G, true, 0L, this.C, this.H, str);
        this.G = new org.json.JSONObject();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.E, "1")) {
            this.G.put("src_type", this.E).put("vst_id", this.D).put("src_ext_info", new org.json.JSONObject().put("feedid", this.F));
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.E, "2")) {
            this.G.put("src_type", this.E).put("vst_id", this.D).put("src_ext_info", new org.json.JSONObject().put("finderusername", this.B));
        } else {
            this.G.put("src_type", this.E).put("vst_id", this.D);
        }
        if (intExtra == 15) {
            this.G = new org.json.JSONObject(stringExtra2);
        }
        if (i17 != -1) {
            this.G.put("activity_entry_type", i17);
        }
        d3Var.a(m80379x76847179(), this.G, false, c01.id.c() - this.C, -1L, this.H, str);
    }
}
