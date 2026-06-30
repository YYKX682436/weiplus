package rb2;

/* loaded from: classes2.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.v f475262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475263e;

    public q(rb2.v vVar, so2.y0 y0Var) {
        this.f475262d = vVar;
        this.f475263e = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderAdCommentConvert$refreshAdContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter = this.f475262d.f475219e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        so2.y0 y0Var = this.f475263e;
        nPresenter.e(view, y0Var);
        if (y0Var.f492236d.i1()) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("feedid", pm0.v.u(y0Var.f492236d.f68959xf9a02e3e));
            r45.qy0 m76085x188a5bc0 = y0Var.f492236d.u0().m76085x188a5bc0();
            if (m76085x188a5bc0 == null || (str = m76085x188a5bc0.m75945x2fec8307(4)) == null) {
                str = "";
            }
            lVarArr[1] = new jz5.l("promotion_buffer", str);
            ((cy1.a) rVar).Bj("promotion_comment_ad_label", "view_clk", kz5.c1.k(lVarArr), 1, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderAdCommentConvert$refreshAdContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
