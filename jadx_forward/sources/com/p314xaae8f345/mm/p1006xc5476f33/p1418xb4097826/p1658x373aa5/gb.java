package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class gb {
    public gb(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static int a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gb gbVar, android.content.Context context, float f17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            gbVar.getClass();
            f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1.f212675p;
        }
        gbVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (f17 <= 0.0f) {
            return 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        try {
            try {
                int b17 = gbVar.b(context, f17);
                f0Var.f391649d = b17;
                return b17;
            } catch (java.lang.RuntimeException e17) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e() || java.lang.Thread.currentThread().isInterrupted()) {
                    hc2.c.a(e17, "getBubbleSingleLineMaxWords_main");
                } else {
                    try {
                        p3325xe03a0797.p3326xc267989b.l.f(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fb(f0Var, context, f17, null), 1, null);
                    } catch (java.lang.InterruptedException e18) {
                        hc2.c.a(e18, "getBubbleSingleLineMaxWords_blocking");
                    }
                }
                return f0Var.f391649d;
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public final int b(android.content.Context context, float f17) {
        int i17;
        boolean z17;
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1.f212674o).mo141623x754a37bb()).get(java.lang.Float.valueOf(f17));
        boolean z18 = false;
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue();
        if (intValue > 0) {
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f387758a;
            }
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeTabRedDotTipsBubbleView", "measureBubbleSingleLineMaxWords cacheMaxWords=" + intValue + '!');
            }
            return intValue;
        }
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        boolean z19 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i18 = a17.f278668a;
        if (!z19 && i18 > (i17 = a17.f278669b)) {
            i18 = i17;
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570354aj5, (android.view.ViewGroup) null, false);
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.p314xaae8f345.mm.R.id.f565669d52) : null;
        float paddingLeft = ((i18 * f17) - (findViewById != null ? findViewById.getPaddingLeft() : 0)) - (findViewById != null ? findViewById.getPaddingRight() : 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("我");
        for (int i19 = 0; i19 < 40; i19++) {
            sb6.append("我");
        }
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setMaxWidth(a06.d.b(paddingLeft));
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        android.text.SpannableString spannableString = new android.text.SpannableString(sb6);
        spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b.AlignAbsoluteSizeSpan(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h4.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h4.f183754a, 0.0f, 1, null), 0.5f, 0), 0, spannableString.length(), 33);
        textView.setText(spannableString);
        textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int ellipsisStart = textView.getLayout().getEllipsisStart(0);
        ((java.util.HashMap) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1.f212674o).mo141623x754a37bb()).put(java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(ellipsisStart));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("measureBubbleSingleLineMaxWords maxWords:");
        sb7.append(ellipsisStart);
        sb7.append(" maxWidth:");
        sb7.append(paddingLeft);
        sb7.append(",dslContainer.padding:");
        sb7.append(findViewById != null ? java.lang.Integer.valueOf(findViewById.getPaddingLeft()) : null);
        sb7.append('-');
        sb7.append(findViewById != null ? java.lang.Integer.valueOf(findViewById.getPaddingRight()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeTabRedDotTipsBubbleView", sb7.toString());
        return ellipsisStart;
    }
}
