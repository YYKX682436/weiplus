package pk2;

/* loaded from: classes3.dex */
public final class qb extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437736h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437737i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437736h = helper.B;
        this.f437737i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        pk2.f8.f437280a.c(6, 2, null);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.n6) o9Var.c(mm2.n6.class)).f410827g.mo3195x754a37bb(), java.lang.Boolean.TRUE);
        ((mm2.n6) o9Var.c(mm2.n6.class)).f410827g.mo7808x76db6cb1(java.lang.Boolean.valueOf(!b17));
        db5.t7.h(this.f445960a.f437611d, b17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dah) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dai));
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437737i;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f445960a;
        mm2.n6 n6Var = (mm2.n6) o9Var.c(mm2.n6.class);
        return (n6Var.f410826f && n6Var.f410828h) && !zl2.r4.f555483a.X1(((mm2.e1) o9Var.c(mm2.e1.class)).f410522s);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        boolean f86 = ((mm2.c1) o9Var.c(mm2.c1.class)).f8();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.n6) o9Var.c(mm2.n6.class)).f410827g.mo3195x754a37bb(), java.lang.Boolean.TRUE);
        pk2.o9 o9Var2 = this.f445960a;
        int i17 = this.f437736h;
        if (b17) {
            menu.l(i17, o9Var2.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.efu), com.p314xaae8f345.mm.R.raw.f79336x68cd3c41, f86);
        } else {
            menu.l(i17, o9Var2.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.efv), com.p314xaae8f345.mm.R.raw.f79337x76fe5ccd, f86);
        }
        pk2.f8.f437280a.c(6, 1, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f437736h;
    }
}
