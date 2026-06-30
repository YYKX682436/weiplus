package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class cf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qf f215550d;

    public cf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qf qfVar) {
        this.f215550d = qfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.text.TextPaint paint;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qf qfVar = this.f215550d;
        if (qfVar.m158354x19263085().isFinishing() || qfVar.m158354x19263085().isDestroyed()) {
            return;
        }
        android.view.View inflate = android.view.View.inflate(qfVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.aco, null);
        db5.d5 d5Var = qfVar.f217231h;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        db5.d5 d5Var2 = new db5.d5(inflate);
        d5Var2.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f576349x2);
        qfVar.f217231h = d5Var2;
        android.widget.TextView textView = inflate != null ? (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.g2p) : null;
        android.widget.TextView textView2 = inflate != null ? (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.g2q) : null;
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.p314xaae8f345.mm.R.id.g2n) : null;
        java.lang.String string = qfVar.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cox);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        int measureText = (textView2 == null || (paint = textView2.getPaint()) == null) ? 0 : (int) paint.measureText(string);
        java.lang.String string2 = qfVar.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573605f51, qfVar.f217230g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        if (textView != null) {
            int b17 = (com.p314xaae8f345.mm.ui.bh.a(qfVar.m80379x76847179()).f278668a - i65.a.b(qfVar.m80379x76847179(), 136)) - measureText;
            if (b17 <= 0) {
                qfVar.f217231h = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedShareDescToCommentUIC", "showTipsBar error, availableWidth:" + b17);
                return;
            }
            android.text.TextPaint paint2 = textView.getPaint();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint2, "getPaint(...)");
            android.text.StaticLayout staticLayout = new android.text.StaticLayout(string2, 0, string2.length(), paint2, b17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
            if (staticLayout.getLineCount() > 2) {
                java.lang.String string3 = textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573606f52);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                int measureText2 = (int) textView.getPaint().measureText(string3);
                int lineEnd = staticLayout.getLineEnd(0);
                java.lang.String substring = string2.substring(0, lineEnd);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                int lineStart = staticLayout.getLineStart(1);
                java.lang.String substring2 = string2.substring(lineStart, string2.length());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                int i17 = b17 - measureText2;
                if (i17 <= 0) {
                    qfVar.f217231h = null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedShareDescToCommentUIC", "showTipsBar error, leftAvailableWidth:" + i17);
                    return;
                }
                android.text.TextPaint paint3 = textView.getPaint();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint3, "getPaint(...)");
                int lineEnd2 = new android.text.StaticLayout(substring2, 0, substring2.length(), paint3, i17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true).getLineEnd(0);
                java.lang.String substring3 = substring2.substring(0, lineEnd2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
                android.text.SpannableString spannableString = new android.text.SpannableString(substring + substring3 + string3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedShareDescToCommentUIC", lineEnd + ' ' + lineStart + ' ' + lineEnd2 + " textLine0=" + substring + " textLine1=" + substring3 + " textStartFromLine1=" + substring2);
                textView.setText(spannableString);
            } else {
                textView.setText(string2);
            }
        }
        if (textView2 != null) {
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.of(qfVar));
        }
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pf(qfVar));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = qfVar.f217229f;
        java.lang.String u17 = pm0.v.u(c14994x9b99c079 != null ? c14994x9b99c079.m59233x87980ca() : 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        qfVar.P6(inflate, "guide_bubble", u17, qfVar.f217230g, 32);
        if (textView2 != null) {
            qfVar.P6(textView2, "guide_bubble_comment_button", u17, qfVar.f217230g, 8);
        }
        if (findViewById != null) {
            qfVar.P6(findViewById, "guide_bubble_close_button", u17, qfVar.f217230g, 8);
        }
        db5.d5 d5Var3 = qfVar.f217231h;
        if (d5Var3 != null) {
            d5Var3.setWidth(-1);
        }
        db5.d5 d5Var4 = qfVar.f217231h;
        if (d5Var4 != null) {
            d5Var4.setHeight(-2);
        }
        int dimensionPixelSize = qfVar.m80379x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561183ab4);
        db5.d5 d5Var5 = qfVar.f217231h;
        if (d5Var5 != null) {
            d5Var5.showAtLocation(qfVar.m80379x76847179().getWindow().getDecorView(), 80, 0, dimensionPixelSize);
        }
        qfVar.Q6(true);
    }
}
