package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f192987a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.m f192988b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f192989c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.l f192990d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f192991e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d f192992f;

    /* renamed from: g, reason: collision with root package name */
    public xc2.p0 f192993g;

    /* renamed from: h, reason: collision with root package name */
    public int f192994h;

    public p(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f192987a = context;
        this.f192989c = new java.util.ArrayList();
        this.f192994h = -1;
    }

    public final void a(r45.gb1 gb1Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        xc2.p0 p0Var = this.f192993g;
        if (p0Var == null || (abstractC14490x69736cb5 = p0Var.f534777f) == null) {
            return;
        }
        android.content.Context context = this.f192987a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (V6 != null) {
            java.lang.String ek6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.w(), V6.m75939xb282bd08(5));
            java.util.Iterator it = this.f192989c.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d) it.next()).f192960d, gb1Var)) {
                    break;
                } else {
                    i17++;
                }
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("watch_point_anchor", str, kz5.c1.k(new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2)), new jz5.l("finder_context_id", V6.m75945x2fec8307(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5))), new jz5.l("session_buffer", ek6), new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84())), new jz5.l("extra_info", V6.m75945x2fec8307(11)), new jz5.l("anchor_id", java.lang.String.valueOf(i17)), new jz5.l("uniq_id", gb1Var.m75945x2fec8307(4))), 1, false);
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d dVar) {
        if (dVar == null) {
            if (this.f192994h != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.l lVar = this.f192990d;
                if (lVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallBack");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = lVar.g().m82555x4905e9fa();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m82555x4905e9fa, arrayList.toArray(), "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerPresenter", "scrollToHighlightPosition", "(Lcom/tencent/mm/plugin/finder/highlight/FinderLiveHighlight;)V", "Undefined", "scrollToPosition", "(I)V");
                m82555x4905e9fa.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(m82555x4905e9fa, "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerPresenter", "scrollToHighlightPosition", "(Lcom/tencent/mm/plugin/finder/highlight/FinderLiveHighlight;)V", "Undefined", "scrollToPosition", "(I)V");
                this.f192994h = 0;
                return;
            }
            return;
        }
        java.util.Iterator it = this.f192989c.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d) it.next()).f192960d.m75939xb282bd08(0) == dVar.f192960d.m75939xb282bd08(0)) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 == -1 || i17 == this.f192994h) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.l lVar2 = this.f192990d;
        if (lVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallBack");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa2 = lVar2.g().m82555x4905e9fa();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m82555x4905e9fa2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerPresenter", "scrollToHighlightPosition", "(Lcom/tencent/mm/plugin/finder/highlight/FinderLiveHighlight;)V", "Undefined", "scrollToPosition", "(I)V");
        m82555x4905e9fa2.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(m82555x4905e9fa2, "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerPresenter", "scrollToHighlightPosition", "(Lcom/tencent/mm/plugin/finder/highlight/FinderLiveHighlight;)V", "Undefined", "scrollToPosition", "(I)V");
        this.f192994h = i17;
    }
}
