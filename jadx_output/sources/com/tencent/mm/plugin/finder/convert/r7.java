package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class r7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.s7 f104449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean[] f104450f;

    public r7(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.s7 s7Var, boolean[] zArr) {
        this.f104448d = s0Var;
        this.f104449e = s7Var;
        this.f104450f = zArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$refreshAwesomeIv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f104448d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.a_z);
        so2.y0 y0Var = (so2.y0) s0Var.f293125i;
        nv2.h1 h1Var = nv2.n1.f340550g;
        nv2.n1 n1Var = nv2.n1.f340551h;
        com.tencent.mm.plugin.finder.convert.s7 s7Var = this.f104449e;
        boolean i17 = n1Var.i(s7Var.f104528e.z0().field_id, y0Var.f410703d, s7Var.f104528e.W());
        if (s7Var.f104528e.h0()) {
            if (i17) {
                db5.t7.makeText(s0Var.f293121e, com.tencent.mm.R.string.m7l, 0).show();
            } else {
                db5.t7.makeText(s0Var.f293121e, com.tencent.mm.R.string.m7j, 0).show();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$refreshAwesomeIv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z18 = !i17;
        if (z18) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_good);
            weImageView.setIconColor(s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.Red_90));
        } else {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_star_new);
            weImageView.setIconColor(s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.f478714f5));
        }
        com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = s7Var.f104528e;
        kotlin.jvm.internal.o.d(weImageView);
        nPresenter.R(weImageView, s0Var.getAdapterPosition());
        int b17 = n1Var.b(s7Var.f104528e.z0().field_id, y0Var.f410703d, s7Var.f104528e.W());
        if (b17 > 0) {
            s0Var.w(com.tencent.mm.R.id.f483312aa0, 0);
            s0Var.s(com.tencent.mm.R.id.f483312aa0, java.lang.String.valueOf(b17));
        } else {
            s0Var.w(com.tencent.mm.R.id.f483312aa0, 8);
            s0Var.s(com.tencent.mm.R.id.f483312aa0, "");
        }
        if (z18) {
            ((android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f483312aa0)).setTextColor(s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.Red_100));
        } else {
            ((android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f483312aa0)).setTextColor(s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.aju));
        }
        if (z18) {
            z17 = false;
            str = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$refreshAwesomeIv$3";
            str2 = "android/view/View$OnClickListener";
            uw2.h0.o(uw2.h0.f431674a, weImageView, 0L, 2, null);
            hc2.f1.d(weImageView);
        } else {
            z17 = false;
            str = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$refreshAwesomeIv$3";
            str2 = "android/view/View$OnClickListener";
        }
        if (z18) {
            boolean[] zArr = this.f104450f;
            if (zArr[z17 ? 1 : 0]) {
                zArr[z17 ? 1 : 0] = z17;
            } else {
                fo3.s sVar = fo3.s.INSTANCE;
                sVar.Z7("ce_feed_comment_like", "<FeedCommentLike>");
                sVar.H2("ce_feed_comment_like", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
                sVar.Qa("ce_feed_comment_like");
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(s0Var.p(com.tencent.mm.R.id.a_z), "finder_feed_second_comment_awesome_iv");
        view.setTag(com.tencent.mm.R.id.e5w, java.lang.Boolean.valueOf(z18));
        view.setTag(com.tencent.mm.R.id.f484408e61, java.lang.Integer.valueOf(b17));
        yj0.a.h(this, str, str2, "onClick", "(Landroid/view/View;)V");
    }
}
