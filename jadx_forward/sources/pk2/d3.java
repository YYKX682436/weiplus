package pk2;

/* loaded from: classes3.dex */
public final class d3 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437183h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437184i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437183h = helper.f437610c0;
        this.f437184i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        df2.gq gqVar = (df2.gq) this.f445960a.e(df2.gq.class);
        if (gqVar != null) {
            gqVar.b7();
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437184i;
    }

    @Override // qk2.f
    public boolean o() {
        return (((mm2.e1) this.f445960a.f437607b.a(mm2.e1.class)).b7() || (((mm2.n0) this.f445960a.f437607b.a(mm2.n0.class)).f410806r)) ? false : true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437183h;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f80372x61b6c14a, o9Var.f437611d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }

    @Override // qk2.h
    public int y() {
        return this.f437183h;
    }
}
