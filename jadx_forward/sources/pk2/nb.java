package pk2;

/* loaded from: classes3.dex */
public final class nb extends qk2.h {

    /* renamed from: j, reason: collision with root package name */
    public static final pk2.mb f437577j = new pk2.mb(null);

    /* renamed from: h, reason: collision with root package name */
    public final int f437578h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437579i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437578h = helper.f437633o;
        this.f437579i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        pk2.f8.f437280a.c(2, 2, null);
        f437577j.a(o9Var.f437611d, "onItemClicked");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f408810x2;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "2");
        gVar.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "1");
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437579i;
    }

    @Override // qk2.f
    public boolean o() {
        zl2.r4 r4Var = zl2.r4.f555483a;
        pk2.o9 o9Var = this.f445960a;
        gk2.e buContext = o9Var.f437607b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        boolean z17 = pm0.v.z(((mm2.c1) buContext.a(mm2.c1.class)).Q1, 67108864);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "[isDisableContactSwitch] isDisable = " + z17 + ", flag = " + ((mm2.c1) buContext.a(mm2.c1.class)).Q1);
        if (z17) {
            return false;
        }
        pk2.d9 d9Var = o9Var.f437615f;
        return d9Var != null && d9Var.f437192b;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        java.lang.String m75945x2fec8307 = ((mm2.c1) o9Var.c(mm2.c1.class)).I7().m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String str = m75945x2fec8307;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eio, str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        menu.g(this.f437578h, pk2.o9.b(o9Var, string, str, 0, 4, null), com.p314xaae8f345.mm.R.raw.f80100xa2e3777b);
        pk2.f8.f437280a.c(2, 1, null);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f408810x2;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "1");
        gVar.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "1");
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f437578h;
    }
}
