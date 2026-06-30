package pk2;

/* loaded from: classes3.dex */
public final class fa extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437281h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437282i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437281h = helper.f437636p0;
        this.f437282i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f445960a.f437611d;
        if (abstractActivityC21394xb3d2c0cf.isFinishing() || abstractActivityC21394xb3d2c0cf.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(o9Var.f437605a, "onItemClicked: activity is finishing or destroyed");
            return;
        }
        pk2.d9 d9Var = o9Var.f437615f;
        if (d9Var == null || (g8Var = d9Var.f437191a) == null) {
            return;
        }
        pk2.g8.a(g8Var, null, null, new pk2.ea(abstractActivityC21394xb3d2c0cf, o9Var, null), 3, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437282i;
    }

    @Override // qk2.f
    public boolean o() {
        return hc2.o0.a(((mm2.c1) this.f445960a.c(mm2.c1.class)).f410379n);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437281h;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
        java.lang.String string = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.owj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f80145xebd70552, abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }

    @Override // qk2.h
    public int y() {
        return this.f437281h;
    }
}
