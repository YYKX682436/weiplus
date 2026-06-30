package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class e6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f188159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f188160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f188161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f188162g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm f188163h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f188164i;

    public e6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, android.widget.TextView textView, android.content.Context context, android.widget.TextView textView2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm rmVar, r45.qt2 qt2Var) {
        this.f188159d = a7Var;
        this.f188160e = textView;
        this.f188161f = context;
        this.f188162g = textView2;
        this.f188163h = rmVar;
        this.f188164i = qt2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$showCommentSelectPopupWindow$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f188159d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f7 f7Var = a7Var.X;
        if (!(f7Var != null && f7Var.a())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7.u0(this.f188159d, false, 0, 1, 3, null);
            android.content.Context context = this.f188161f;
            this.f188160e.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            this.f188162g.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
            this.f188163h.dismiss();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[5];
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = a7Var.f187745i;
            if (c14994x9b99c079 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(c14994x9b99c079.m59251x5db1b11()));
            java.lang.String str2 = "";
            r45.qt2 qt2Var = this.f188164i;
            if (qt2Var == null || (str = qt2Var.m75945x2fec8307(1)) == null) {
                str = "";
            }
            lVarArr[1] = new jz5.l("finder_context_id", str);
            if (qt2Var != null && (m75945x2fec8307 = qt2Var.m75945x2fec8307(2)) != null) {
                str2 = m75945x2fec8307;
            }
            lVarArr[2] = new jz5.l("finder_tab_context_id", str2);
            lVarArr[3] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
            lVarArr[4] = new jz5.l("comment_area_filter_type", 1);
            ((cy1.a) rVar).Bj("finder_comment_area_filter", "view_clk", kz5.c1.k(lVarArr), 1, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f7 f7Var2 = a7Var.X;
        if (f7Var2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CommentSelectCache", "setPublic ori type=" + f7Var2.f188242a);
            f7Var2.f188242a = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e7.f188165d;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$showCommentSelectPopupWindow$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
