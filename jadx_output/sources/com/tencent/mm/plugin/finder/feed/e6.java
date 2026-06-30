package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class e6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f106627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f106628f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f106629g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.rm f106630h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f106631i;

    public e6(com.tencent.mm.plugin.finder.feed.a7 a7Var, android.widget.TextView textView, android.content.Context context, android.widget.TextView textView2, com.tencent.mm.plugin.finder.view.rm rmVar, r45.qt2 qt2Var) {
        this.f106626d = a7Var;
        this.f106627e = textView;
        this.f106628f = context;
        this.f106629g = textView2;
        this.f106630h = rmVar;
        this.f106631i = qt2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$showCommentSelectPopupWindow$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f106626d;
        com.tencent.mm.plugin.finder.feed.f7 f7Var = a7Var.X;
        if (!(f7Var != null && f7Var.a())) {
            com.tencent.mm.plugin.finder.feed.a7.u0(this.f106626d, false, 0, 1, 3, null);
            android.content.Context context = this.f106628f;
            this.f106627e.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
            this.f106629g.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.abw));
            this.f106630h.dismiss();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[5];
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
            if (finderItem == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(finderItem.getId()));
            java.lang.String str2 = "";
            r45.qt2 qt2Var = this.f106631i;
            if (qt2Var == null || (str = qt2Var.getString(1)) == null) {
                str = "";
            }
            lVarArr[1] = new jz5.l("finder_context_id", str);
            if (qt2Var != null && (string = qt2Var.getString(2)) != null) {
                str2 = string;
            }
            lVarArr[2] = new jz5.l("finder_tab_context_id", str2);
            lVarArr[3] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
            lVarArr[4] = new jz5.l("comment_area_filter_type", 1);
            ((cy1.a) rVar).Bj("finder_comment_area_filter", "view_clk", kz5.c1.k(lVarArr), 1, false);
        }
        com.tencent.mm.plugin.finder.feed.f7 f7Var2 = a7Var.X;
        if (f7Var2 != null) {
            com.tencent.mars.xlog.Log.i("Finder.CommentSelectCache", "setPublic ori type=" + f7Var2.f106709a);
            f7Var2.f106709a = com.tencent.mm.plugin.finder.feed.e7.f106632d;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$showCommentSelectPopupWindow$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
