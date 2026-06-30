package pk2;

/* loaded from: classes3.dex */
public final class c3 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437136h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437137i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437136h = helper.f437634o0;
        this.f437137i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        pk2.o9 o9Var2 = this.f445960a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = ((mm2.c1) o9Var2.c(mm2.c1.class)).f410450y0;
        if (c19786x6a1e2862 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "AnchorPopularActivityOption onClick");
            if (((zy2.b6) i95.n0.c(zy2.b6.class)) != null) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = o9Var2.f437611d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                xc2.y2 y2Var = xc2.y2.f534876a;
                xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
                p0Var.f534785n = 0;
                xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
            }
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437137i;
    }

    @Override // qk2.f
    public boolean o() {
        return ((mm2.c1) this.f445960a.c(mm2.c1.class)).f410450y0 != null;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437136h;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.owu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f79353xe5f199c9, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }

    @Override // qk2.h
    public int y() {
        return this.f437136h;
    }
}
