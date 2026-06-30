package rb2;

/* loaded from: classes2.dex */
public final class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f475382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475384f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475385g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f475386h;

    public z1(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, in5.s0 s0Var, java.lang.String str, so2.y0 y0Var, rb2.z2 z2Var) {
        this.f475382d = c19786x6a1e2862;
        this.f475383e = s0Var;
        this.f475384f = str;
        this.f475385g = y0Var;
        this.f475386h = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        so2.y0 y0Var = this.f475385g;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f475382d;
        rb2.z2 z2Var = this.f475386h;
        in5.s0 s0Var = this.f475383e;
        if (c19786x6a1e2862 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            i0Var.ql(context, this.f475384f, this.f475385g, z2Var.f475219e.a0(), z2Var.f475219e.k0());
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).Gk(context2, y0Var.f492236d.f68959xf9a02e3e, (r18 & 4) != 0 ? false : true, (r18 & 8) != 0 ? false : false, 2, (r18 & 32) != 0 ? false : true);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.content.Context context3 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        r45.ky0 m76052x34c6289e = y0Var.f492236d.u0().m76052x34c6289e();
        if (m76052x34c6289e == null || (m75945x2fec8307 = m76052x34c6289e.m75945x2fec8307(4)) == null) {
            r45.qy0 m76085x188a5bc0 = y0Var.f492236d.u0().m76085x188a5bc0();
            m75945x2fec8307 = m76085x188a5bc0 != null ? m76085x188a5bc0.m75945x2fec8307(4) : null;
        }
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        p0Var.f534787p = m75945x2fec8307;
        p0Var.f534777f = z2Var.f475219e.f0();
        xc2.y2.i(y2Var, context3, p0Var, 0, null, 12, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
