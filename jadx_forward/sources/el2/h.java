package el2;

/* loaded from: classes3.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f335336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(el2.i0 i0Var) {
        super(1);
        this.f335336d = i0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.h32 info = (r45.h32) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        el2.i0 i0Var = this.f335336d;
        wt2.a aVar = i0Var.I;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        r45.a52 a52Var = new r45.a52();
        a52Var.set(0, 1);
        a52Var.set(1, 1);
        a52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(info.mo14344x5f01b1f6()));
        wt2.a.m4(aVar, a52Var, null, 2, null);
        wt2.a aVar2 = i0Var.I;
        if (aVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        gk2.e q57 = aVar2.q5();
        if (q57 != null) {
            bf2.c.b(bf2.c.f101131a, q57, 3, 1, null, 0, 24, null);
        }
        return jz5.f0.f384359a;
    }
}
