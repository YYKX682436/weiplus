package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class s7 extends com.tencent.mm.plugin.finder.convert.x1 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter f104528e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed f104529f;

    public s7(com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter presenter, com.tencent.mm.plugin.finder.model.BaseFinderFeed feedObj) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        this.f104528e = presenter;
        this.f104529f = feedObj;
    }

    public final void J(in5.s0 s0Var, so2.y0 y0Var) {
        F(s0Var, this.f104529f.getFeedObject(), y0Var);
        s0Var.p(com.tencent.mm.R.id.uca).setOnClickListener(new com.tencent.mm.plugin.finder.convert.x6(s0Var, y0Var, this));
    }

    public final void K(android.view.View view, java.lang.String str, so2.y0 y0Var, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mvi)).setText(str);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.mvf);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.mvh);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setOnClickListener(new com.tencent.mm.plugin.finder.convert.y6(findViewById, findViewById2, this, y0Var, i17));
    }

    public final boolean L() {
        return this.f104528e.W() == 2;
    }

    public final void M(so2.y0 y0Var, in5.s0 s0Var, boolean z17) {
        jz5.f0 f0Var;
        r45.xk bizInfo = y0Var.f410703d.getBizInfo();
        if (bizInfo != null) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String string = bizInfo.getString(0);
            java.lang.String str = string == null ? "" : string;
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = this.f104528e;
            so2.g0.b(y0Var, context, str, nPresenter.getCommentScene(), nPresenter.z0(), "");
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.String Z0 = y0Var.f410703d.Z0();
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            so2.g0.d(y0Var, Z0, context2, "");
        }
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        android.content.Context context3 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        o3Var.Gk(context3, y0Var.f410703d.field_feedId, true, true, 1, z17);
    }

    public final void N(boolean z17, in5.s0 s0Var) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.a_z);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.iht);
        boolean[] zArr = {false};
        p17.setOnTouchListener(new com.tencent.mm.plugin.finder.convert.q7(zArr));
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int s17 = s(context, z17, this.f104528e);
        weImageView.setImageResource(z17 ? com.tencent.mm.R.raw.icons_filled_good : com.tencent.mm.R.raw.icons_outlined_star_new);
        weImageView.setIconColor(s17);
        android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
        if (layoutParams != null) {
            int h17 = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479691cq);
            layoutParams.width = h17;
            layoutParams.height = h17;
        }
        p17.setOnClickListener(new com.tencent.mm.plugin.finder.convert.r7(s0Var, this, zArr));
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487835d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x06b8, code lost:
    
        if (((r11.b().z0() & 16) != 0) != false) goto L185;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0719  */
    /* JADX WARN: Type inference failed for: r2v17, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r58, in5.c r59, int r60, int r61, boolean r62, java.util.List r63) {
        /*
            Method dump skipped, instructions count: 3995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.s7.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.c6d);
        finderCollapsibleTextView.setLimitLine(4);
        finderCollapsibleTextView.setCollapse(true);
        finderCollapsibleTextView.f(false, true);
        finderCollapsibleTextView.setOnCollapse(new com.tencent.mm.plugin.finder.convert.o7(holder, this));
        com.tencent.mm.plugin.finder.view.FinderInterceptFrameLayout finderInterceptFrameLayout = (com.tencent.mm.plugin.finder.view.FinderInterceptFrameLayout) holder.p(com.tencent.mm.R.id.rrw);
        if (finderInterceptFrameLayout != null) {
            finderInterceptFrameLayout.setInterceptListener(new com.tencent.mm.plugin.finder.convert.p7(this));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.p(com.tencent.mm.R.id.a_z), "finder_feed_second_comment_awesome_iv");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.v2_);
        if (weImageView != null) {
            java.lang.Object tag = weImageView.getTag();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (kotlin.jvm.internal.o.b(tag, bool)) {
                return;
            }
            weImageView.setTag(bool);
            weImageView.post(new d92.a(weImageView));
        }
    }
}
