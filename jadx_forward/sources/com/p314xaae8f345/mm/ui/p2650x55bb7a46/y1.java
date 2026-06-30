package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public final class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f287780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ot0.q f287782f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f287783g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 f287784h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6254x6dec987f f287785i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f287786m;

    public y1(p3325xe03a0797.p3326xc267989b.y0 y0Var, java.lang.String str, ot0.q qVar, yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6254x6dec987f c6254x6dec987f, boolean z17) {
        this.f287780d = y0Var;
        this.f287781e = str;
        this.f287782f = qVar;
        this.f287783g = dVar;
        this.f287784h = a4Var;
        this.f287785i = c6254x6dec987f;
        this.f287786m = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        am.x10 x10Var;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f287780d;
        if (y0Var == null || !p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2CAppMsgUtilNew", "[doSetExclusiveHongBaoStyle] downloadScope == null || !downloadScope.isActive");
            return;
        }
        yb5.d dVar = this.f287783g;
        java.lang.String x17 = dVar.x();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var = this.f287784h;
        android.widget.TextView textView = a4Var.f284792c;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ot0.q qVar = this.f287782f;
        ot0.c cVar = qVar != null ? (ot0.c) qVar.y(ot0.c.class) : null;
        java.lang.String str3 = this.f287781e;
        if (cVar == null) {
            str = str3;
        } else {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str4 = cVar.f429954n;
            ((sg3.a) v0Var).getClass();
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjf, c01.a2.f(str4, x17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            if (textView == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtilNew", "[getExclusiveHongBaoTitle] titleTv == null");
                str = string + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjg);
            } else {
                int width = textView.getWidth();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtilNew", "[getExclusiveHongBaoTitle] viewWidth: %s", java.lang.Integer.valueOf(width));
                if (width <= 0) {
                    width = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561200c4);
                }
                java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjg);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                android.text.TextPaint paint = textView.getPaint();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append((java.lang.Object) string);
                sb6.append((java.lang.Object) string2);
                java.lang.String sb7 = sb6.toString();
                float measureText = paint.measureText(sb7) + i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtilNew", "[adaptiveConcatString] originalText：%s, viewWidth：%s, originalTextWidth: %s", sb7, java.lang.Integer.valueOf(width), java.lang.Float.valueOf(measureText));
                if (width > 0) {
                    float f17 = width;
                    if (measureText >= f17) {
                        java.lang.String str5 = "..." + ((java.lang.Object) string2);
                        float measureText2 = paint.measureText(str5);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtilNew", "[adaptiveConcatString] suffixTextWidth: %s", java.lang.Float.valueOf(measureText2));
                        if (measureText2 > f17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2CAppMsgUtilNew", "[adaptiveConcatString] suffixTextWidth > viewWidth");
                        } else {
                            sb7 = ((java.lang.Object) string) + str5;
                            float measureText3 = paint.measureText(sb7);
                            for (int i17 = 1; measureText3 > f17 && i17 < 100 && i17 < string.length(); i17++) {
                                sb7 = ((java.lang.Object) string.subSequence(0, string.length() - i17)) + str5;
                                measureText3 = paint.measureText(sb7);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtilNew", "[adaptiveConcatString] finalText: %s", sb7);
                        }
                    }
                }
                str = sb7;
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6254x6dec987f c6254x6dec987f = this.f287785i;
        int i18 = (c6254x6dec987f == null || (x10Var = c6254x6dec987f.f136503h) == null) ? 0 : x10Var.f89869b;
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (i18 == 5) {
            str2 = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gji);
        } else {
            if (i18 == 4) {
                ot0.c cVar2 = qVar != null ? (ot0.c) qVar.y(ot0.c.class) : null;
                if (this.f287786m || cVar2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar2.f429954n) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar2.f429954n, c01.z1.r())) {
                    str3 = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o7u);
                } else {
                    str2 = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjj);
                }
            }
            str2 = str3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtilNew", "[doSetExclusiveHongBaoStyle] post, title:" + str + ", desc: " + str2);
        android.widget.TextView textView2 = a4Var.f284792c;
        if (textView2 != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g17 = dVar.g();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            float textSize = a4Var.f284792c.getTextSize();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(g17, str, textSize));
        }
        android.widget.TextView textView3 = a4Var.f284793d;
        if (textView3 != null) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g18 = dVar.g();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            float textSize2 = a4Var.f284793d.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(g18, str2, textSize2));
        }
        android.widget.TextView textView4 = a4Var.f284793d;
        if (textView4 == null) {
            return;
        }
        textView4.setVisibility(0);
    }
}
