package pk2;

/* loaded from: classes3.dex */
public final class bb extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437122h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437123i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437122h = helper.H;
        this.f437123i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        pk2.f8.f437280a.c(3, 2, null);
        if (!o9Var.h()) {
            r45.j52 j52Var = ((mm2.c1) o9Var.c(mm2.c1.class)).X;
            if (j52Var != null) {
                zl2.r4.f555483a.q2(j52Var, "clickVisitorPromotionMiniApp", o9Var.f437611d);
                return;
            }
            return;
        }
        pk2.d9 d9Var = o9Var.f437615f;
        if (d9Var == null || (g8Var = d9Var.f437191a) == null) {
            return;
        }
        ((pk2.k9) g8Var).b(new pk2.ab(o9Var));
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437123i;
    }

    @Override // qk2.f
    public boolean o() {
        return zl2.r4.f555483a.m2(((mm2.c1) this.f445960a.c(mm2.c1.class)).X);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        menu.k(this.f437122h, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ei8), com.p314xaae8f345.mm.R.raw.f80273xdbf6a1ad, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832), zl2.r4.f555483a.q(o9Var.f437607b), ((mm2.c1) o9Var.c(mm2.c1.class)).W);
        ((mm2.c1) o9Var.c(mm2.c1.class)).W = false;
        pk2.f8.f437280a.c(3, 1, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f437122h;
    }
}
