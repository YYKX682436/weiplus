package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes5.dex */
public final class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f239192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7 f239193e;

    public c7(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7 abstractActivityC17142x347c74c7) {
        this.f239192d = textView;
        this.f239193e = abstractActivityC17142x347c74c7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        android.widget.TextView textView = this.f239192d;
        textPaint.setTextSize(textView.getTextSize());
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7 abstractActivityC17142x347c74c7 = this.f239193e;
        java.lang.String string = abstractActivityC17142x347c74c7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hya, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(abstractActivityC17142x347c74c7.f238972g));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        int breakText = textPaint.breakText(string, true, textView.getWidth(), null);
        if (breakText > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String substring = string.substring(0, breakText);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            sb6.append(substring);
            sb6.append((char) 8203);
            java.lang.String substring2 = string.substring(breakText);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
            sb6.append(substring2);
            string = sb6.toString();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceNewBaseUtilUIC", "paint.breakText fail, singleLineLength <= 0");
        }
        java.lang.String format = java.lang.String.format("(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{abstractActivityC17142x347c74c7.L}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractActivityC17142x347c74c7.L)) {
            if (textPaint.measureText(string + format) > textView.getWidth() * 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceNewBaseUtilUIC", "dynamicFinalNameWidth greater than mReceiverNameTv width");
                float measureText = textPaint.measureText(format);
                float measureText2 = textPaint.measureText("...");
                float width = (((textView.getWidth() * 2) - measureText) - measureText2) - i65.a.b(abstractActivityC17142x347c74c7, 8);
                int breakText2 = textPaint.breakText(string, true, width, null);
                if (breakText2 >= 1) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    java.lang.String substring3 = string.substring(0, breakText2 - 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
                    sb7.append(substring3);
                    sb7.append("...(");
                    sb7.append(abstractActivityC17142x347c74c7.L);
                    sb7.append(')');
                    string = sb7.toString();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceNewBaseUtilUIC", "paint.breakText fail, len < 1");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceNewBaseUtilUIC", "calculate result: targetStr is %s, realNameWidth is %s, pointWidth is %s, remainingWidth is %s, len is %s", string, java.lang.Float.valueOf(measureText), java.lang.Float.valueOf(measureText2), java.lang.Float.valueOf(width), java.lang.Integer.valueOf(breakText2));
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                float textSize = textView.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(abstractActivityC17142x347c74c7, string, textSize));
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractActivityC17142x347c74c7.L)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceNewBaseUtilUIC", "real name is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceNewBaseUtilUIC", "width enough");
            string = string + format;
        }
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        float textSize2 = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(abstractActivityC17142x347c74c7, string, textSize2));
    }
}
