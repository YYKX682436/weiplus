package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class w10 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 f192481a;

    public w10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var) {
        this.f192481a = x10Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        android.text.SpannableString i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var = this.f192481a;
        if (x10Var.f187718r == null) {
            return;
        }
        jz5.g gVar = x10Var.A;
        if (z17) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb).setVisibility(8);
            return;
        }
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb2).setVisibility(0);
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        android.widget.TextView textView = (android.widget.TextView) mo141623x754a37bb3;
        boolean A = r26.i0.A(x10Var.F, "#", false, 2, null);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = x10Var.f187707d;
        if (A) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = x10Var.F;
            ((ke0.e) xVar).getClass();
            i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(abstractActivityC21394xb3d2c0cf, str);
        } else {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = "#" + x10Var.F;
            ((ke0.e) xVar2).getClass();
            i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(abstractActivityC21394xb3d2c0cf, str2);
        }
        textView.setText(i17);
    }
}
