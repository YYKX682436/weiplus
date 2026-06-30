package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class m0 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p0 {
    public m0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.a aVar, kb0.g gVar) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p0, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.o0, in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w data, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.Object obj2;
        java.lang.String str2;
        lb0.d dVar;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.h(holder, data, i17, i18, z17, list);
        xj.m mVar = data.f272555o;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.tab);
        if (linearLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(layoutParams, "getLayoutParams(...)");
            int f17 = i65.a.f(linearLayout.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.als);
            if (f17 > layoutParams.height) {
                layoutParams.height = f17;
                linearLayout.setLayoutParams(layoutParams);
            }
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.e1t);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.e1s);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.taa);
        xj.m mVar2 = data.f272555o;
        java.lang.Object obj3 = jz5.f0.f384359a;
        if (mVar2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adInfo hintText: ");
            java.lang.String str3 = mVar2.f536287b;
            sb6.append(str3);
            sb6.append(", adDescText: ");
            java.lang.String str4 = mVar2.f536288c;
            sb6.append(str4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenWayAdLineItemConvert", sb6.toString());
            java.lang.Integer num = data.f272560t;
            java.lang.String str5 = "";
            if (num != null) {
                if (((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Bi(num.intValue()) && (c17 = (dVar = lb0.d.f399202a).c(data.f272554n)) != null) {
                    java.lang.String d17 = dVar.d(c17, textView2 != null ? textView2.getContext() : null);
                    if (d17 != null) {
                        str5 = d17;
                    }
                }
            }
            if (textView != null) {
                if (!r26.n0.N(str5)) {
                    str3 = str5;
                }
                textView.setText(str3);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar = data.f272547d;
            if (xVar == null || (str2 = xVar.f272564g) == null || imageView == null) {
                obj2 = null;
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.o0.f272515e.c(str2, imageView, 0.0f, false);
                obj2 = obj3;
            }
            if (obj2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenWayAdLineItemConvert", "onBindViewHolder iconUrl is null");
            }
            if (!r26.n0.N(str4)) {
                if (textView2 != null) {
                    textView2.setText(str4);
                }
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            } else if (textView2 != null) {
                textView2.setVisibility(8);
            }
            obj = obj3;
        } else {
            obj = null;
        }
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenWayAdLineItemConvert", "onBindViewHolder adInfo is null");
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.tac);
        if (textView3 != null) {
            textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ocr);
            android.text.TextPaint paint = textView3.getPaint();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(0.8f);
            textView3.setVisibility(0);
        }
        if (mVar != null && (str = mVar.f536286a) != null) {
            i95.m c18 = i95.n0.c(xj.i.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            xj.i.gg((xj.i) c18, str, wj.w0.f528074d, null, 4, null);
            java.lang.Integer num2 = data.f272560t;
            if (num2 != null) {
                int intValue = num2.intValue();
                lb0.d dVar2 = lb0.d.f399202a;
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a c19 = dVar2.c(data.f272554n);
                if (c19 != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("recent_use_app_mmkv", 2, null);
                    if (N != null) {
                        r45.mk5 mk5Var = new r45.mk5();
                        long c27 = c01.id.c();
                        byte[] j17 = N.j(str);
                        if ((j17 != null ? mk5Var.mo11468x92b714fd(j17) : null) == null) {
                            mk5Var.f462138d = c27;
                            mk5Var.f462140f = dVar2.e(intValue, c19) + c27;
                        }
                        if (mk5Var.f462138d == 0) {
                            mk5Var.f462138d = c27;
                        }
                        if (mk5Var.f462140f == 0) {
                            mk5Var.f462140f = dVar2.e(intValue, c19) + c27;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenByOtherMMKV", "addExposeRecord: " + str + " firstExposedTime: " + mk5Var.f462138d + " expiredTime: " + mk5Var.f462140f + " lastClickedTime: " + mk5Var.f462139e + ", curTimeMs: " + c27);
                        N.H(str, mk5Var.mo14344x5f01b1f6());
                    }
                } else {
                    obj3 = null;
                }
                r10 = obj3;
            }
        }
        if (r10 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenWayAdLineItemConvert", "ad expose report adInfo is null");
        }
    }
}
