package pk2;

/* loaded from: classes3.dex */
public final class u1 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437810h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437811i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437810h = helper.f437620h0;
        this.f437811i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        mf2.b0 b0Var = (if2.b) o9Var.e(yf2.t1.class);
        if (b0Var == null || !(b0Var instanceof jm2.d)) {
            return;
        }
        yf2.t1 t1Var = (yf2.t1) ((jm2.d) b0Var);
        t1Var.a7(false, t1Var.f543322m);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437811i;
    }

    @Override // qk2.f
    public boolean o() {
        if (((r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) this.f445960a.c(mm2.g1.class)).f410601f).mo144003x754a37bb()) != null) {
            return !zl2.r4.f555483a.T1(r0);
        }
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437810h;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ozh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f80479xb7e760ee, o9Var.f437611d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }

    @Override // qk2.h
    public int y() {
        return this.f437810h;
    }
}
