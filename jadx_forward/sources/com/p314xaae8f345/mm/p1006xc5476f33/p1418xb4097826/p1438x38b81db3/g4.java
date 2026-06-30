package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f184982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f184984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 f184985g;

    public g4(so2.y0 y0Var, in5.s0 s0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 u4Var) {
        this.f184982d = y0Var;
        this.f184983e = s0Var;
        this.f184984f = c19786x6a1e2862;
        this.f184985g = u4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        so2.y0 y0Var = this.f184982d;
        boolean j17 = y0Var.f492236d.j1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 u4Var = this.f184985g;
        in5.s0 s0Var = this.f184983e;
        if (j17) {
            if (y0Var.f492236d.a1()) {
                android.content.Context context = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                android.content.Context context2 = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u) a17).O6(s0Var, V6, y0Var, 1);
            } else if (y0Var.f492236d.i1()) {
                android.content.Context context3 = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p093xedfae76a.c1 a18 = zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x) a18).P6(pm0.v.u(y0Var.f492236d.f68959xf9a02e3e), 1);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f184984f;
            if (c19786x6a1e2862 != null) {
                xc2.y2 y2Var = xc2.y2.f534876a;
                android.content.Context context4 = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
                xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
                r45.ky0 m76052x34c6289e = y0Var.f492236d.u0().m76052x34c6289e();
                if (m76052x34c6289e == null || (m75945x2fec83072 = m76052x34c6289e.m75945x2fec8307(4)) == null) {
                    r45.qy0 m76085x188a5bc0 = y0Var.f492236d.u0().m76085x188a5bc0();
                    m75945x2fec8307 = m76085x188a5bc0 != null ? m76085x188a5bc0.m75945x2fec8307(4) : null;
                } else {
                    m75945x2fec8307 = m75945x2fec83072;
                }
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                p0Var.f534787p = m75945x2fec8307;
                p0Var.f534777f = u4Var.f186205g;
                xc2.y2.i(y2Var, context4, p0Var, 0, null, 12, null);
                yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        u4Var.W(y0Var, s0Var, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
