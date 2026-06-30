package n22;

/* loaded from: classes9.dex */
public final class i {
    public i(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a() {
        if (n22.j.f415827b == -1) {
            n22.j.f415827b = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_FIRST_CLICK_WECOIN_PAY_BUTTON_INT, 0);
        }
        return n22.j.f415827b == 0;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 b(android.content.Context mContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(mContext, 2, 0);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(mContext);
        linearLayout.setOrientation(1);
        java.lang.String string = mContext.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.widget.TextView textView = new android.widget.TextView(mContext);
        linearLayout.addView(textView);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(textView.getLayoutParams());
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.topMargin = i65.a.f(mContext, com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        layoutParams.bottomMargin = i65.a.f(mContext, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        textView.setTextColor(i65.a.d(mContext, com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
        textView.setTextSize(1, 17.0f);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setText(string);
        textView.setLayoutParams(layoutParams);
        java.lang.String string2 = mContext.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        android.widget.TextView textView2 = new android.widget.TextView(mContext);
        linearLayout.addView(textView2);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(textView2.getLayoutParams());
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        layoutParams2.bottomMargin = i65.a.f(mContext, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        textView2.setTextColor(i65.a.d(mContext, com.p314xaae8f345.mm.R.C30859x5a72f63.f560405ji));
        textView2.setTextSize(1, 17.0f);
        textView2.setText(string2);
        textView2.setLayoutParams(layoutParams2);
        z2Var.j(linearLayout);
        z2Var.y(mContext.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0o));
        z2Var.x(1);
        z2Var.F = new n22.g(z2Var);
        return z2Var;
    }

    public final java.lang.String c(java.lang.String str) {
        if (str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            return "";
        }
        try {
            java.lang.String format = new java.text.DecimalFormat("#.#").format(java.lang.Double.parseDouble(str));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
            return format;
        } catch (java.lang.NumberFormatException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiWecoinTool", "formatOriginPrice error, priceNum:".concat(str));
            return str;
        }
    }

    public final java.lang.CharSequence d(android.content.Context context, int i17, java.lang.String suffix, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suffix, "suffix");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(format.concat(suffix));
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        int L = r26.n0.L(spannableString, string2, 0, false, 6, null);
        int intrinsicWidth = context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f81416xc219f617).getIntrinsicWidth();
        int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        android.graphics.drawable.Drawable e17 = m95.a.e(context.getResources(), com.p314xaae8f345.mm.R.raw.f81416xc219f617, (h17 * 1.0f) / intrinsicWidth);
        e17.setColorFilter(new android.graphics.PorterDuffColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP));
        e17.setBounds(0, 0, h17, h17);
        spannableString.setSpan(new ym5.c1(e17), L, string2.length() + L, 17);
        return spannableString;
    }

    public final void e(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && gm0.j1.a()) {
            n22.j.f415827b = z17 ? 1 : 0;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_FIRST_CLICK_WECOIN_PAY_BUTTON_INT, java.lang.Integer.valueOf(n22.j.f415827b));
        }
    }
}
