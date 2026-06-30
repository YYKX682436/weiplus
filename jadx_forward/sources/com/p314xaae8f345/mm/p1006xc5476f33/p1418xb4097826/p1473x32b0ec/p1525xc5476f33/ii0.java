package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ii0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ji0 f194512d;

    public ii0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ji0 ji0Var) {
        this.f194512d = ji0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ji0 ji0Var = this.f194512d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = ji0Var.f194642r;
        if (c22613xe7040d9c != null) {
            c22613xe7040d9c.f();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ji0Var.f194640p, "show");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Rj((ml2.r0) c17, 1, null, 0, 6, null);
        r45.a73 a73Var = ((mm2.c1) ji0Var.P0(mm2.c1.class)).f410363k3;
        if (a73Var != null) {
            android.widget.TextView textView = ji0Var.f194643s;
            if (textView != null) {
                java.lang.String m75945x2fec8307 = a73Var.m75945x2fec8307(3);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                textView.setText(m75945x2fec8307);
            }
            android.widget.ImageView imageView = ji0Var.f194644t;
            if (imageView != null) {
                mn2.g1 g1Var = mn2.g1.f411508a;
                vo0.d e17 = g1Var.e();
                java.lang.String m75945x2fec83072 = a73Var.m75945x2fec8307(4);
                e17.c(new mn2.q3(m75945x2fec83072 != null ? m75945x2fec83072 : "", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), imageView, g1Var.h(mn2.f1.f411498s));
            }
        }
    }
}
