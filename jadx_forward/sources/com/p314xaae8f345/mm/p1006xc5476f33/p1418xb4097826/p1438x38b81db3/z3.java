package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class z3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f186610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f186612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 f186613g;

    public z3(so2.y0 y0Var, in5.s0 s0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 u4Var) {
        this.f186610d = y0Var;
        this.f186611e = s0Var;
        this.f186612f = c19786x6a1e2862;
        this.f186613g = u4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        so2.y0 y0Var = this.f186610d;
        boolean a17 = y0Var.f492236d.a1();
        java.lang.String m75945x2fec83072 = null;
        in5.s0 s0Var = this.f186611e;
        if (a17) {
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
            p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u) a18).O6(s0Var, V6, y0Var, 1);
        } else if (y0Var.f492236d.i1()) {
            android.content.Context context3 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a19 = zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x) a19).P6(pm0.v.u(y0Var.f492236d.f68959xf9a02e3e), 1);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f186612f;
        if (c19786x6a1e2862 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            java.lang.String Z0 = y0Var.f492236d.Z0();
            android.content.Context context4 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
            i0Var.Bk(Z0, context4);
            android.content.Context context5 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context5 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context5).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zi(1, y0Var.f492236d.f68959xf9a02e3e, nyVar2.V6(), 2, y0Var.f492236d.Z0());
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.content.Context context6 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context6, "getContext(...)");
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        r45.ky0 m76052x34c6289e = y0Var.f492236d.u0().m76052x34c6289e();
        if (m76052x34c6289e == null || (m75945x2fec8307 = m76052x34c6289e.m75945x2fec8307(4)) == null) {
            r45.qy0 m76085x188a5bc0 = y0Var.f492236d.u0().m76085x188a5bc0();
            if (m76085x188a5bc0 != null) {
                m75945x2fec83072 = m76085x188a5bc0.m75945x2fec8307(4);
            }
        } else {
            m75945x2fec83072 = m75945x2fec8307;
        }
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        p0Var.f534787p = m75945x2fec83072;
        p0Var.f534777f = this.f186613g.f186205g;
        xc2.y2.i(y2Var, context6, p0Var, 0, null, 12, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
