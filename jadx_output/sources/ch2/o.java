package ch2;

/* loaded from: classes3.dex */
public final class o implements mh2.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ch2.q f41415a;

    public o(ch2.q qVar) {
        this.f41415a = qVar;
    }

    @Override // mh2.y
    public kotlinx.coroutines.y0 a() {
        kotlinx.coroutines.y0 y0Var = this.f41415a.f41438n;
        if (y0Var != null) {
            return y0Var;
        }
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        return kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
    }

    @Override // mh2.y
    public void b(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ya2.b2 b17 = ya2.h.f460484a.b(((mm2.c1) this.f41415a.business(mm2.c1.class)).f328852o);
        if (b17 != null) {
            zl2.r4.f473950a.Y(b17.y0(), new ch2.n(callback));
        }
    }

    @Override // mh2.y
    public java.lang.String c() {
        ya2.g gVar = ya2.h.f460484a;
        mm2.c1 c1Var = (mm2.c1) this.f41415a.business(mm2.c1.class);
        ya2.b2 b17 = gVar.b(c1Var != null ? c1Var.f328852o : null);
        return b17 != null ? b17.y0() : "";
    }
}
