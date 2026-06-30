package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class w5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 f186377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.z0 f186379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f186380g;

    public w5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var, in5.s0 s0Var, so2.z0 z0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f186377d = q6Var;
        this.f186378e = s0Var;
        this.f186379f = z0Var;
        this.f186380g = c19786x6a1e2862;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshMoreView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f186380g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var = this.f186377d;
        q6Var.getClass();
        boolean z17 = ((java.lang.Number) hc2.g0.c(c19786x6a1e2862).f384367e).intValue() == 1;
        in5.s0 s0Var = this.f186378e;
        android.content.Context context = s0Var.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        so2.z0 z0Var = this.f186379f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feed = z0Var.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e5 e5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e5(z17, c19786x6a1e2862, q6Var, s0Var, z0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b9c, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf)).setText(context.getResources().getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.cpy : com.p314xaae8f345.mm.R.C30867xcad56011.cpj));
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.k0m);
        if (textView != null) {
            float f17 = com.p314xaae8f345.mm.ui.bh.a(context).f278668a;
            java.lang.String str = " " + ((java.lang.Object) android.text.TextUtils.ellipsize(c19786x6a1e2862 != null ? xc2.y2.f534876a.s(context, c19786x6a1e2862) : null, textView.getPaint(), f17, android.text.TextUtils.TruncateAt.END)) + (char) 12301;
            android.text.SpannableString spannableString = new android.text.SpannableString("「 " + str);
            int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
            android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79825xf91463c7, color);
            int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            e17.setBounds(0, 0, (int) (((dimension * 1.0f) * e17.getIntrinsicWidth()) / e17.getIntrinsicHeight()), dimension);
            spannableString.setSpan(new al5.w(e17, 1), 1, 2, 17);
            spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(str, color, color, false, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.m6.f185508d, 24, null), 2, str.length() + 2, 17);
            textView.setText(spannableString);
        }
        k0Var.s(inflate, false);
        inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.l6(q6Var, context, feed, z17, e5Var, k0Var));
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshMoreView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
