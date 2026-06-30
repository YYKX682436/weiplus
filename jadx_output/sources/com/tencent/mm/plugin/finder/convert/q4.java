package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class q4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u4 f104315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean[] f104316f;

    public q4(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.u4 u4Var, boolean[] zArr) {
        this.f104314d = s0Var;
        this.f104315e = u4Var;
        this.f104316f = zArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        boolean z18;
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$refreshAwesomeIv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f104314d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.a_z);
        so2.y0 y0Var = (so2.y0) s0Var.f293125i;
        nv2.h1 h1Var = nv2.n1.f340550g;
        nv2.n1 n1Var = nv2.n1.f340551h;
        com.tencent.mm.plugin.finder.convert.u4 u4Var = this.f104315e;
        boolean i17 = n1Var.i(u4Var.f104670e.z0().field_id, y0Var.f410703d, u4Var.f104670e.W());
        if (u4Var.f104670e.h0()) {
            if (i17) {
                db5.t7.makeText(s0Var.f293121e, com.tencent.mm.R.string.m7l, 0).show();
            } else {
                db5.t7.makeText(s0Var.f293121e, com.tencent.mm.R.string.m7j, 0).show();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$refreshAwesomeIv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z19 = !i17;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int s17 = u4Var.s(context, z19, u4Var.f104670e);
        weImageView.setImageDrawable(z19 ? com.tencent.mm.ui.uk.e(s0Var.f293121e, com.tencent.mm.R.raw.icons_filled_good, s17) : com.tencent.mm.ui.uk.e(s0Var.f293121e, com.tencent.mm.R.raw.icons_outlined_star_new, s17));
        u4Var.f104670e.R(weImageView, s0Var.getAdapterPosition());
        int b17 = n1Var.b(u4Var.f104670e.z0().field_id, y0Var.f410703d, u4Var.f104670e.W());
        if (b17 > 0) {
            z17 = false;
            s0Var.w(com.tencent.mm.R.id.f483312aa0, 0);
            s0Var.s(com.tencent.mm.R.id.f483312aa0, java.lang.String.valueOf(b17));
        } else {
            z17 = false;
            s0Var.w(com.tencent.mm.R.id.f483312aa0, 8);
            s0Var.s(com.tencent.mm.R.id.f483312aa0, "");
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f483312aa0);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        textView.setTextColor(u4Var.s(context2, z19, u4Var.f104670e));
        if (z19) {
            z18 = z17;
            str = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$refreshAwesomeIv$3";
            str2 = "android/view/View$OnClickListener";
            uw2.h0.o(uw2.h0.f431674a, weImageView, 0L, 2, null);
            hc2.f1.d(weImageView);
        } else {
            z18 = z17;
            str = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$refreshAwesomeIv$3";
            str2 = "android/view/View$OnClickListener";
        }
        if (z19) {
            boolean[] zArr = this.f104316f;
            if (zArr[z18 ? 1 : 0]) {
                zArr[z18 ? 1 : 0] = z18;
            } else {
                fo3.s sVar = fo3.s.INSTANCE;
                sVar.Z7("ce_feed_comment_like", "<FeedCommentLike>");
                sVar.H2("ce_feed_comment_like", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
                sVar.Qa("ce_feed_comment_like");
            }
        }
        view.setTag(com.tencent.mm.R.id.e5w, java.lang.Boolean.valueOf(z19));
        view.setTag(com.tencent.mm.R.id.f484408e61, java.lang.Integer.valueOf(b17));
        view.announceForAccessibility(s0Var.f293121e.getString(z19 ? com.tencent.mm.R.string.mgl : com.tencent.mm.R.string.mgm));
        yj0.a.h(this, str, str2, "onClick", "(Landroid/view/View;)V");
    }
}
