package o06;

/* loaded from: classes15.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o06.c1 f423459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(o06.c1 c1Var) {
        super(1);
        this.f423459d = c1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        o06.m mVar;
        o06.y0 y0Var = (o06.y0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y0Var, "<name for destructuring parameter 0>");
        n16.b bVar = y0Var.f423539a;
        if (bVar.f415691c) {
            throw new java.lang.UnsupportedOperationException("Unresolved local class: " + bVar);
        }
        n16.b g17 = bVar.g();
        o06.c1 c1Var = this.f423459d;
        java.util.List list = y0Var.f423540b;
        if (g17 == null || (mVar = c1Var.a(g17, kz5.n0.R(list, 1))) == null) {
            e26.v vVar = c1Var.f423469c;
            n16.c h17 = bVar.h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getPackageFqName(...)");
            mVar = (o06.i) ((e26.r) vVar).mo146xb9724478(h17);
        }
        o06.m mVar2 = mVar;
        boolean k17 = bVar.k();
        e26.c0 c0Var = c1Var.f423467a;
        n16.g j17 = bVar.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getShortClassName(...)");
        java.lang.Integer num = (java.lang.Integer) kz5.n0.Z(list);
        return new o06.z0(c0Var, mVar2, j17, k17, num != null ? num.intValue() : 0);
    }
}
