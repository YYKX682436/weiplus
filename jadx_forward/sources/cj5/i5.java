package cj5;

/* loaded from: classes.dex */
public final class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.k5 f123679d;

    public i5(cj5.k5 k5Var) {
        this.f123679d = k5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cj5.k5 k5Var = this.f123679d;
        java.util.Iterator it = k5Var.f123706d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.util.ArrayList arrayList = (java.util.ArrayList) k5Var.f123707e.get((java.lang.String) it.next());
            i17 += arrayList != null ? arrayList.size() : 0;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = k5Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        if (i17 == 0) {
            abstractActivityC21394xb3d2c0cf.mo54450xbf7c1df6(k5Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.njd));
        } else {
            java.lang.String string = k5Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.njf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            abstractActivityC21394xb3d2c0cf.mo54450xbf7c1df6(format);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) k5Var.f123710h).mo141623x754a37bb()).k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
        if (a17 != null) {
            a17.z(new cj5.h5(k5Var));
        }
    }
}
