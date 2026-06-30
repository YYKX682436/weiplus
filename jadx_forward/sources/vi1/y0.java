package vi1;

/* loaded from: classes7.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.b1 f519039d;

    public y0(vi1.b1 b1Var) {
        this.f519039d = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vi1.l2 l2Var = vi1.l2.f518934a;
        vi1.b1 b1Var = this.f519039d;
        vi1.j2 a17 = l2Var.a(b1Var.f518807b);
        if (a17 != null) {
            vi1.j2 a18 = l2Var.a(b1Var.f518807b);
            java.lang.Long valueOf = a18 != null ? java.lang.Long.valueOf(a18.f518901q) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            a17.f518901q = valueOf.longValue() + 1;
        }
        java.lang.String string = b1Var.f518806a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571684mc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        b1Var.a(string);
    }
}
