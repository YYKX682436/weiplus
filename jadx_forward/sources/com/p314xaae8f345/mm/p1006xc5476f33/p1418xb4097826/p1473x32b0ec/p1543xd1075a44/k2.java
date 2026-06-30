package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s2 f200332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf2.h0 f200333e;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s2 s2Var, yf2.h0 h0Var) {
        this.f200332d = s2Var;
        this.f200333e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s2 s2Var = this.f200332d;
        android.widget.TextView textView = s2Var.f201243l;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkboxText");
            throw null;
        }
        android.text.TextPaint paint = textView.getPaint();
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f17 = fontMetrics.bottom - fontMetrics.top;
        if (s2Var.f201242k == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
        float height = (f17 - r3.getHeight()) / 2;
        android.widget.CheckBox checkBox = s2Var.f201242k;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = checkBox.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = (int) height;
        android.widget.CheckBox checkBox2 = s2Var.f201242k;
        if (checkBox2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
        checkBox2.setLayoutParams(layoutParams2);
        java.lang.String obj = this.f200333e.f543240c.toString();
        float measureText = paint.measureText(obj);
        android.widget.LinearLayout linearLayout = s2Var.f201241j;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkboxContainer");
            throw null;
        }
        float width = linearLayout.getWidth();
        if (measureText > width) {
            int length = obj.length();
            float f18 = 0.0f;
            int i17 = 0;
            float f19 = 0.0f;
            while (i17 < length) {
                f19 += paint.measureText(java.lang.String.valueOf(obj.charAt(i17)));
                if (f19 > width) {
                    break;
                }
                i17++;
                f18 = f19;
            }
            measureText = f18;
        }
        android.widget.CheckBox checkBox3 = s2Var.f201242k;
        if (checkBox3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = checkBox3.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        int marginEnd = ((android.widget.LinearLayout.LayoutParams) layoutParams3).getMarginEnd();
        android.widget.CheckBox checkBox4 = s2Var.f201242k;
        if (checkBox4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
        int width2 = checkBox4.getWidth() + marginEnd + ((int) measureText);
        android.widget.LinearLayout linearLayout2 = s2Var.f201241j;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkboxContainer");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams4 = linearLayout2.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams5 = (android.widget.LinearLayout.LayoutParams) layoutParams4;
        layoutParams5.width = width2;
        android.widget.LinearLayout linearLayout3 = s2Var.f201241j;
        if (linearLayout3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkboxContainer");
            throw null;
        }
        linearLayout3.setLayoutParams(layoutParams5);
        android.widget.LinearLayout linearLayout4 = s2Var.f201241j;
        if (linearLayout4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkboxContainer");
            throw null;
        }
        android.view.ViewParent parent = linearLayout4.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((android.widget.LinearLayout) parent).setGravity(1);
    }
}
