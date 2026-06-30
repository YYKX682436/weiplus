package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes5.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h4 f183754a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h4();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f183755b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g4.f183722d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f183756c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f4.f183694d);

    public static int c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h4 h4Var, float f17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b.H;
            f17 = 14.0f;
        }
        h4Var.getClass();
        float q17 = i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (q17 > 1.4f) {
            q17 = 1.4f;
        }
        return mo0.h.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, f17 * q17);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(zy2.t r23, java.lang.Integer r24) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h4.a(zy2.t, java.lang.Integer):int");
    }

    public final int b(zy2.t source, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        jz5.g gVar = f183755b;
        java.lang.Integer num2 = (java.lang.Integer) ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) gVar).mo141623x754a37bb()).get(source);
        if (num2 == null) {
            num2 = 0;
        }
        f0Var.f391649d = num2.intValue();
        try {
            try {
                f0Var.f391649d = a(source, num);
                ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) gVar).mo141623x754a37bb()).put(source, java.lang.Integer.valueOf(f0Var.f391649d));
                if (f0Var.f391649d <= 0 && !java.lang.Thread.currentThread().isInterrupted()) {
                    pm0.z.b(xy2.b.f539688b, source + "-getRedDotSingleLineMaxWords-zero", false, null, null, false, false, null, 124, null);
                }
                return f0Var.f391649d;
            } catch (java.lang.RuntimeException e17) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                    pm0.z.b(xy2.b.f539688b, source + "-getRedDotSingleLineMaxWords-RE", false, null, null, false, false, null, 124, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("getRedDotSingleLineMaxWordsInMainThread", "get maxWords=" + f0Var.f391649d + '(' + java.lang.Thread.currentThread() + ")," + e17.getMessage());
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(source + " start(" + java.lang.Thread.currentThread() + "),");
                    if (java.lang.Thread.currentThread().isInterrupted()) {
                        sb6.append("thread is interrupted,");
                    } else {
                        try {
                            p3325xe03a0797.p3326xc267989b.l.f(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c4(sb6, f0Var, source, num, null), 1, null);
                        } catch (java.lang.InterruptedException e18) {
                            sb6.append("InterruptedException:" + e18.getMessage() + ',');
                            pm0.z.b(xy2.b.f539688b, source + "-getRedDotSingleLineMaxWords-IE", false, null, null, false, false, null, 124, null);
                        }
                    }
                    sb6.append("maxWords=" + f0Var.f391649d + ',');
                    sb6.append("end(" + java.lang.Thread.currentThread() + ')');
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("getRedDotSingleLineMaxWordsInMainThread", sb6.toString());
                }
                if (f0Var.f391649d <= 0 && !java.lang.Thread.currentThread().isInterrupted()) {
                    pm0.z.b(xy2.b.f539688b, source + "-getRedDotSingleLineMaxWords-zero", false, null, null, false, false, null, 124, null);
                }
                return f0Var.f391649d;
            }
        } catch (java.lang.Throwable unused) {
            if (f0Var.f391649d <= 0 && !java.lang.Thread.currentThread().isInterrupted()) {
                pm0.z.b(xy2.b.f539688b, source + "-getRedDotSingleLineMaxWords-zero", false, null, null, false, false, null, 124, null);
            }
            return f0Var.f391649d;
        }
    }

    public final int d(android.content.Context context, int i17, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (i17 <= 0) {
            return 0;
        }
        if (f17 <= 0.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMeasureManager", "getTvMaxWords but textviewSize is " + f17 + '!');
            return 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        try {
            try {
                int e17 = e(context, i17, f17);
                f0Var.f391649d = e17;
                return e17;
            } catch (java.lang.RuntimeException e18) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e() || java.lang.Thread.currentThread().isInterrupted()) {
                    hc2.c.a(e18, "getTvMaxWords_main");
                } else {
                    try {
                        p3325xe03a0797.p3326xc267989b.l.f(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e4(f0Var, context, i17, f17, null), 1, null);
                    } catch (java.lang.InterruptedException e19) {
                        hc2.c.a(e19, "getTvMaxWords_blocking");
                    }
                }
                return f0Var.f391649d;
            }
        } catch (java.lang.Throwable unused) {
            return f0Var.f391649d;
        }
    }

    public final int e(android.content.Context context, int i17, float f17) {
        boolean z17;
        java.lang.String str = "mw" + i17 + "_tvs" + f17;
        jz5.g gVar = f183756c;
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) ((jz5.n) gVar).mo141623x754a37bb()).get(str);
        boolean z18 = false;
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue();
        if (intValue > 0) {
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f387758a;
            }
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMeasureManager", "measureTvMaxWords cacheMaxWords=" + intValue + '!');
            }
            return intValue;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("我");
        for (int i18 = 0; i18 < 40; i18++) {
            sb6.append("我");
        }
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setMaxWidth(i17);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setText(sb6);
        textView.setTextSize(1, f17);
        textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int ellipsisStart = textView.getLayout().getEllipsisStart(0);
        ((java.util.HashMap) ((jz5.n) gVar).mo141623x754a37bb()).put(str, java.lang.Integer.valueOf(ellipsisStart));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMeasureManager", "measureTvMaxWords maxWords:" + ellipsisStart + " maxWidth:" + i17 + ",key=" + str);
        return ellipsisStart;
    }
}
