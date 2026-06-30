package pk2;

/* loaded from: classes3.dex */
public final class x9 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437909h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437910i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437909h = helper.f437627l;
        this.f437910i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        ((mm2.c1) o9Var.c(mm2.c1.class)).N1 = true;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) o9Var.c(mm2.c1.class)).N1);
        o9Var.j(qo0.b.Z2, bundle);
        if (o9Var.f437609c == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).zj(((mm2.c1) o9Var.c(mm2.c1.class)).N1 ? ml2.o1.f409302g : ml2.o1.f409301f);
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437910i;
    }

    @Override // qk2.f
    public boolean o() {
        return !((mm2.c1) this.f445960a.c(mm2.c1.class)).N1;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573233dy5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        menu.g(this.f437909h, string, com.p314xaae8f345.mm.R.raw.f79198xcadaea78);
    }

    @Override // qk2.h
    public int y() {
        return this.f437909h;
    }
}
