package im2;

/* loaded from: classes3.dex */
public final class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3 f373800d;

    public b7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3 c14385xe1b728f3) {
        this.f373800d = c14385xe1b728f3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3 c14385xe1b728f3 = this.f373800d;
        if (c14385xe1b728f3.f198538m == null) {
            android.app.Activity m80379x76847179 = c14385xe1b728f3.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type android.app.Activity");
            c14385xe1b728f3.f198538m = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(m80379x76847179);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3 c14385xe1b728f32 = this.f373800d;
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = c14385xe1b728f32.f198538m;
            if (f5Var != null) {
                f5Var.f291933e = new im2.a7(c14385xe1b728f32);
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = this.f373800d.f198538m;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
