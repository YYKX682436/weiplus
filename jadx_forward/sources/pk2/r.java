package pk2;

/* loaded from: classes3.dex */
public final class r extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437738h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437739i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437738h = helper.f437626k0;
        this.f437739i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "clickBeauty");
        boolean n17 = n();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_FINDER_LIVE_CAMERA_OPT_SCENE", n17 ? 1 : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) o9Var.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class);
        if (r5Var != null) {
            r5Var.d7(bundle);
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437739i;
    }

    @Override // qk2.f
    public boolean o() {
        mm2.h7 h7Var = (mm2.h7) dk2.ef.f314905a.i(mm2.h7.class);
        if (h7Var != null && h7Var.O6()) {
            return false;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        pk2.o9 o9Var = this.f445960a;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = ((mm2.g1) o9Var.f437607b.a(mm2.g1.class)).f410601f;
        if (r4Var.G1(j2Var != null ? (r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb() : null)) {
            return true;
        }
        return ((mm2.e1) o9Var.f437607b.a(mm2.e1.class)).d7();
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437738h;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.otq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f78616x1a5f9ad9, o9Var.f437611d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }

    @Override // qk2.h
    public int y() {
        return this.f437738h;
    }
}
