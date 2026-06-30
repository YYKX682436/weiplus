package rb2;

/* loaded from: classes2.dex */
public final class y1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f475368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f475371g;

    public y1(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, in5.s0 s0Var, so2.y0 y0Var, rb2.z2 z2Var) {
        this.f475368d = c19786x6a1e2862;
        this.f475369e = s0Var;
        this.f475370f = y0Var;
        this.f475371g = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String m75945x2fec83072 = null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f475368d;
        in5.s0 s0Var = this.f475369e;
        so2.y0 y0Var = this.f475370f;
        if (c19786x6a1e2862 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            java.lang.String Z0 = y0Var.f492236d.Z0();
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            i0Var.Bk(Z0, context);
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zi(1, y0Var.f492236d.f68959xf9a02e3e, nyVar.V6(), 2, y0Var.f492236d.Z0());
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.content.Context context3 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
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
        p0Var.f534777f = this.f475371g.f475219e.f0();
        xc2.y2.i(y2Var, context3, p0Var, 0, null, 12, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
