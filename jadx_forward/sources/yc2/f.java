package yc2;

/* loaded from: classes2.dex */
public class f extends xc2.o {

    /* renamed from: g, reason: collision with root package name */
    public long f542362g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f542363h = "";

    @Override // xc2.j, xc2.z2
    public void f(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.f(holder, jumpView, infoEx);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        if (abstractC14490x69736cb5 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.er.f213585f.b(jumpView, abstractC14490x69736cb5, "view_exp");
        }
    }

    @Override // xc2.j, xc2.z2
    public void h(boolean z17, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        java.lang.String m77225xe7ed3fec;
        java.lang.String str = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.h(z17, holder, jumpView, infoEx);
        if (z17) {
            this.f542362g = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = infoEx.f534767a.m76506x42318aa0();
            if (m76506x42318aa0 != null && (m77225xe7ed3fec = m76506x42318aa0.m77225xe7ed3fec()) != null) {
                try {
                    cl0.g gVar = new cl0.g(m77225xe7ed3fec);
                    java.lang.String str2 = null;
                    try {
                        if (gVar.has("object_id")) {
                            str2 = gVar.getString("object_id");
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", e17);
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                    this.f542363h = str;
                } catch (org.json.JSONException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderJumperLivingBaseEventHandler", "Failed to parse JSON from necessary_params:".concat(m77225xe7ed3fec));
                }
            }
        }
        if (z17 && ((java.lang.Number) ae2.in.f85221a.u().r()).intValue() == 1 && (abstractC14490x69736cb5 = infoEx.f534777f) != null) {
            so2.k2 k2Var = so2.o2.f492050f;
            so2.o2 a17 = k2Var.a();
            so2.o2 a18 = k2Var.a();
            long m59251x5db1b11 = abstractC14490x69736cb5.getFeedObject().m59251x5db1b11();
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            a17.h(0, a18.c(m59251x5db1b11, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n), null, null, jumpView);
        }
    }

    @Override // xc2.o, xc2.j
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.r(holder, jumpView, infoEx);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        if (abstractC14490x69736cb5 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.er.f213585f.b(jumpView, abstractC14490x69736cb5, "view_clk");
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            if (V6 != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("feed_living_item", "view_clk", kz5.c1.k(new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84())), new jz5.l("finder_context_id", V6.m75945x2fec8307(1)), new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5))), new jz5.l("session_buffer", r26.i0.t(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.w(), V6.m75939xb282bd08(5)), ",", ";", false)), new jz5.l("expose_time_ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f542362g)), new jz5.l("live_object_id", this.f542363h), new jz5.l("finder_username", abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c()), new jz5.l("extra_info", V6.m75945x2fec8307(11))), 1, false);
            }
        }
    }
}
