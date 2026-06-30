package pk2;

/* loaded from: classes3.dex */
public final class p2 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437672h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437673i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437672h = helper.f437638q0;
        this.f437673i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        sf2.x xVar = (sf2.x) this.f445960a.e(sf2.x.class);
        if (xVar != null) {
            xVar.r7();
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437673i;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f445960a;
        if (zl2.r4.F1(o9Var.f437607b)) {
            return false;
        }
        return !((mm2.e1) o9Var.f437607b.a(mm2.e1.class)).b7() && zl2.r4.f555483a.M();
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        java.lang.String string = o9Var.f437611d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e8j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        s(menu, this.f437672h, string, com.p314xaae8f345.mm.R.raw.f79512x9519a6ef);
    }

    @Override // qk2.h
    public int y() {
        return this.f437672h;
    }
}
