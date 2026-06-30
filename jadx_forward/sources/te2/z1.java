package te2;

/* loaded from: classes3.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328 f500088d;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328 c14186x18d3b328) {
        this.f500088d = c14186x18d3b328;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328 c14186x18d3b328 = this.f500088d;
        if (c14186x18d3b328.f193088g == null) {
            android.app.Activity m80379x76847179 = c14186x18d3b328.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type android.app.Activity");
            c14186x18d3b328.f193088g = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(m80379x76847179);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328 c14186x18d3b3282 = this.f500088d;
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = c14186x18d3b3282.f193088g;
            if (f5Var != null) {
                f5Var.f291933e = new te2.x1(c14186x18d3b3282);
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = this.f500088d.f193088g;
            if (f5Var2 != null) {
                f5Var2.f291934f = te2.y1.f500074a;
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var3 = this.f500088d.f193088g;
        if (f5Var3 != null) {
            f5Var3.f();
        }
    }
}
