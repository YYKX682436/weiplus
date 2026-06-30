package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class fk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f184928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184929e;

    public fk(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, in5.s0 s0Var) {
        this.f184928d = c1163xf1deaba4;
        this.f184929e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedSearchConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f184928d;
        android.content.Context context = c1163xf1deaba4.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209185d4).mo141623x754a37bb()).r()).intValue() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Context context2 = c1163xf1deaba4.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            i0Var.getClass();
            hz2.d dVar = hz2.d.f367846a;
            if (dVar.b(ya.a.f77450x918d59a8) != 0) {
                db5.e1.y(context2, dVar.c(ya.a.f77450x918d59a8), "", context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
            } else {
                jx3.f.INSTANCE.mo68477x336bdfd8(1265L, 0L, 1L, false);
                intent.setClass(context2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13973x24fcfd83.class);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderHotSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderHotSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else {
            android.content.Context context3 = this.f184929e.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            boolean z17 = xy2.c.e(context3).length() > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = 2;
            objArr[1] = java.lang.Integer.valueOf(z17 ? 1 : 2);
            objArr[2] = 2;
            g0Var.d(20971, objArr);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Context context4 = c1163xf1deaba4.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
            i0Var2.Vj(context4, intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedSearchConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
