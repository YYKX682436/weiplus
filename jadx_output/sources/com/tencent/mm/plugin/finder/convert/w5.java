package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class w5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f104844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.z0 f104846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f104847g;

    public w5(com.tencent.mm.plugin.finder.convert.q6 q6Var, in5.s0 s0Var, so2.z0 z0Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f104844d = q6Var;
        this.f104845e = s0Var;
        this.f104846f = z0Var;
        this.f104847g = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshMoreView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f104847g;
        com.tencent.mm.plugin.finder.convert.q6 q6Var = this.f104844d;
        q6Var.getClass();
        boolean z17 = ((java.lang.Number) hc2.g0.c(finderJumpInfo).f302834e).intValue() == 1;
        in5.s0 s0Var = this.f104845e;
        android.content.Context context = s0Var.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        so2.z0 z0Var = this.f104846f;
        com.tencent.mm.plugin.finder.storage.FinderItem feed = z0Var.E;
        com.tencent.mm.plugin.finder.convert.e5 e5Var = new com.tencent.mm.plugin.finder.convert.e5(z17, finderJumpInfo, q6Var, s0Var, z0Var);
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.b9c, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf)).setText(context.getResources().getString(z17 ? com.tencent.mm.R.string.cpy : com.tencent.mm.R.string.cpj));
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.k0m);
        if (textView != null) {
            float f17 = com.tencent.mm.ui.bh.a(context).f197135a;
            java.lang.String str = " " + ((java.lang.Object) android.text.TextUtils.ellipsize(finderJumpInfo != null ? xc2.y2.f453343a.s(context, finderJumpInfo) : null, textView.getPaint(), f17, android.text.TextUtils.TruncateAt.END)) + (char) 12301;
            android.text.SpannableString spannableString = new android.text.SpannableString("「 " + str);
            int color = context.getResources().getColor(com.tencent.mm.R.color.FG_1);
            android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_music4, color);
            int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
            e17.setBounds(0, 0, (int) (((dimension * 1.0f) * e17.getIntrinsicWidth()) / e17.getIntrinsicHeight()), dimension);
            spannableString.setSpan(new al5.w(e17, 1), 1, 2, 17);
            spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(str, color, color, false, false, com.tencent.mm.plugin.finder.convert.m6.f103975d, 24, null), 2, str.length() + 2, 17);
            textView.setText(spannableString);
        }
        k0Var.s(inflate, false);
        inflate.setOnClickListener(new com.tencent.mm.plugin.finder.convert.l6(q6Var, context, feed, z17, e5Var, k0Var));
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshMoreView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
