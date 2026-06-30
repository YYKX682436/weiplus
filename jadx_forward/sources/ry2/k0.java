package ry2;

/* loaded from: classes10.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.q0 f482935d;

    public k0(ry2.q0 q0Var) {
        this.f482935d = q0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.mb4 f17;
        java.util.ArrayList arrayList;
        java.lang.String str;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$postToShowThumb$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ry2.q0 q0Var = this.f482935d;
        q0Var.getClass();
        r45.kb4 kb4Var = new r45.kb4();
        r45.dd4 dd4Var = q0Var.R;
        android.content.Context context = q0Var.f482907d;
        if (dd4Var == null && (arrayList = q0Var.f482990y) != null && (str = (java.lang.String) kz5.n0.X(arrayList)) != null) {
            r45.dd4 dd4Var2 = new r45.dd4();
            qc0.d1 wi6 = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).wi(str);
            if (wi6 != null) {
                int mo10218x9787f6ed = ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10218x9787f6ed(str);
                int i17 = wi6.f442897b;
                int i18 = wi6.f442896a;
                if (mo10218x9787f6ed != 90 && mo10218x9787f6ed != 270) {
                    i18 = i17;
                    i17 = i18;
                }
                com.p314xaae8f345.mm.ui.bl.b(context);
                float f18 = i17;
                float f19 = i18;
                float f27 = f18 / f19;
                if (0.5625f <= f27 && f27 <= 1.7777778f) {
                    r45.c07 c07Var = new r45.c07();
                    c07Var.set(0, 0);
                    c07Var.set(1, java.lang.Integer.valueOf(i18));
                    c07Var.set(2, java.lang.Integer.valueOf(i17));
                    c07Var.set(3, 0);
                    dd4Var2.set(0, c07Var);
                    dd4Var2.set(6, c07Var);
                    java.util.List i19 = kz5.c0.i(java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(1.0f));
                    r45.s23 s23Var = new r45.s23();
                    s23Var.m75941xfb821914(0).addAll(kz5.n0.S0(i19));
                    dd4Var2.set(1, s23Var);
                } else if (f27 > 1.7777778f) {
                    int i27 = (int) ((f19 * 16.0f) / 9.0f);
                    r45.c07 c07Var2 = new r45.c07();
                    c07Var2.set(0, java.lang.Integer.valueOf((i17 - i27) / 2));
                    c07Var2.set(1, java.lang.Integer.valueOf(i18));
                    c07Var2.set(2, java.lang.Integer.valueOf(i17 - c07Var2.m75939xb282bd08(0)));
                    c07Var2.set(3, 0);
                    dd4Var2.set(0, c07Var2);
                    dd4Var2.set(6, c07Var2);
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    matrix.postTranslate(-c07Var2.m75939xb282bd08(0), 0.0f);
                    r45.s23 s23Var2 = new r45.s23();
                    float[] fArr = new float[9];
                    matrix.getValues(fArr);
                    s23Var2.m75941xfb821914(0).addAll(kz5.z.w0(fArr));
                    dd4Var2.set(1, s23Var2);
                    i17 = i27;
                } else {
                    int i28 = (int) ((f18 * 16.0f) / 9.0f);
                    r45.c07 c07Var3 = new r45.c07();
                    c07Var3.set(0, 0);
                    c07Var3.set(3, java.lang.Integer.valueOf((i18 - i28) / 2));
                    c07Var3.set(2, java.lang.Integer.valueOf(i17));
                    c07Var3.set(1, java.lang.Integer.valueOf(i18 - c07Var3.m75939xb282bd08(3)));
                    dd4Var2.set(0, c07Var3);
                    dd4Var2.set(6, c07Var3);
                    android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                    matrix2.postTranslate(0.0f, -c07Var3.m75939xb282bd08(3));
                    r45.s23 s23Var3 = new r45.s23();
                    float[] fArr2 = new float[9];
                    matrix2.getValues(fArr2);
                    s23Var3.m75941xfb821914(0).addAll(kz5.z.w0(fArr2));
                    dd4Var2.set(1, s23Var3);
                    i18 = i28;
                }
                dd4Var2.set(2, 0);
                dd4Var2.set(3, java.lang.Integer.valueOf((int) wi6.f442899d));
                dd4Var2.set(4, java.lang.Integer.valueOf(i17));
                dd4Var2.set(5, java.lang.Integer.valueOf(i18));
                dd4Var2.set(7, 0);
                q0Var.R = dd4Var2;
            }
        }
        java.util.ArrayList arrayList3 = q0Var.f482990y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList3);
        int i29 = 0;
        for (java.lang.Object obj : arrayList3) {
            int i37 = i29 + 1;
            if (i29 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.LinkedList m75941xfb821914 = kb4Var.m75941xfb821914(0);
            f17 = mv2.f0.f413094a.f((java.lang.String) obj, "", (r16 & 4) != 0 ? null : q0Var.R, (r16 & 8) != 0 ? "" : null, (r16 & 16) != 0 ? "" : null, (r16 & 32) != 0 ? null : null);
            m75941xfb821914.add(f17);
            i29 = i37;
        }
        android.content.Intent intent = new android.content.Intent();
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.Qj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17, (android.app.Activity) context, intent, kb4Var, null, true, true, 8, null);
        android.widget.ImageView imageView = q0Var.f482983r;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbIv");
            throw null;
        }
        q0Var.A(imageView, "view_clk");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$postToShowThumb$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
