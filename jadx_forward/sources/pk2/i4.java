package pk2;

/* loaded from: classes3.dex */
public final class i4 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437369h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437370i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437369h = helper.f437608b0;
        this.f437370i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) this.f445960a.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class);
        if (r5Var != null) {
            ll2.e.b(ll2.e.f400666a, "startlive.bottom.shopping", false, false, 6, null);
            qo0.b bVar = qo0.b.f446882f2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", true);
            r5Var.X6(bVar, bundle);
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437370i;
    }

    @Override // qk2.f
    public boolean o() {
        r45.q12 q12Var = (r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) this.f445960a.c(mm2.g1.class)).f410601f).mo144003x754a37bb();
        if (q12Var == null) {
            return false;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        return (r4Var.p2(q12Var) || r4Var.X1(q12Var)) ? false : true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437369h;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dug);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f81041x8e782e0e, o9Var.f437611d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }

    @Override // qk2.h
    public int y() {
        return this.f437369h;
    }
}
