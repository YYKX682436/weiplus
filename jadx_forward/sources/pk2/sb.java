package pk2;

/* loaded from: classes3.dex */
public final class sb extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437783h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437784i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437783h = helper.A;
        this.f437784i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        pk2.d9 d9Var = o9Var.f437615f;
        if (d9Var == null || (g8Var = d9Var.f437191a) == null) {
            return;
        }
        pk2.g8.a(g8Var, null, null, new pk2.rb(o9Var, this, null), 3, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437784i;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f445960a;
        if (((mm2.d1) o9Var.c(mm2.d1.class)).O6()) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            if (!r4Var.w1() && !r4Var.X1(((mm2.e1) o9Var.c(mm2.e1.class)).f410522s)) {
                return true;
            }
        }
        return false;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        menu.b(this.f437783h, com.p314xaae8f345.mm.R.C30867xcad56011.egf, com.p314xaae8f345.mm.R.raw.f79299x90587a79);
        r45.b84 b84Var = (r45.b84) ((mm2.e1) o9Var.c(mm2.e1.class)).f410521r.m75936x14adae67(47);
        if (b84Var == null || (str = b84Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).jk(3, str);
    }

    @Override // qk2.h
    public int y() {
        return this.f437783h;
    }
}
