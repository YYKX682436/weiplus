package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes2.dex */
public final class s50 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s50 f201256a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s50();

    public final void a(android.view.View optionView, android.content.Context context, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(optionView, "optionView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "updateOptionAppearance: option=" + optionView.getTag() + ", isSelected=" + z17 + ", isDisabled=" + z18);
        int color = z18 ? context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d) : z17 ? context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77744x91fa6289) : context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "setOptionBackgroundColor: color=" + ((!z18 && z17) ? "Brand_Alpha_0_1" : "BG_3") + ", isSelected=" + z17 + ", isDisabled=" + z18);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(context.getResources().getDisplayMetrics().density * 8.0f);
        optionView.setBackground(gradientDrawable);
        android.widget.TextView textView = (android.widget.TextView) optionView.findViewById(com.p314xaae8f345.mm.R.id.kk9);
        java.lang.String str = "Brand_100";
        if (textView != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "setOptionTextColor: color=" + (z18 ? "Glyph_2" : z17 ? "Brand_100" : "Glyph_1") + ", isSelected=" + z17 + ", isDisabled=" + z18);
            int color2 = z18 ? context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84) : z17 ? context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19) : context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg);
            int currentTextColor = textView.getCurrentTextColor();
            if (currentTextColor != color2) {
                android.animation.ValueAnimator ofArgb = android.animation.ValueAnimator.ofArgb(currentTextColor, color2);
                ofArgb.setDuration(200L);
                ofArgb.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                ofArgb.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r50(textView));
                ofArgb.start();
            } else {
                textView.setTextColor(color2);
            }
            if (z17) {
                com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
            } else {
                com.p314xaae8f345.mm.ui.bk.t0(textView.getPaint());
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) optionView.findViewById(com.p314xaae8f345.mm.R.id.f567732kk2);
        if (imageView != null) {
            if (z18) {
                str = "Glyph_2";
            } else if (!z17) {
                str = "Glyph_1";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "setOptionIconColor: color=" + str + ", isSelected=" + z17 + ", isDisabled=" + z18);
            imageView.setColorFilter(z18 ? context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84) : z17 ? context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19) : context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg), android.graphics.PorterDuff.Mode.SRC_IN);
        }
    }
}
