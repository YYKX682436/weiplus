package d26;

/* loaded from: classes16.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.i0 f307525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(d26.i0 i0Var) {
        super(1);
        this.f307525d = i0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n16.g it = (n16.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        d26.i0 i0Var = this.f307525d;
        java.util.Map map = i0Var.f307537b;
        p16.j0 PARSER = i16.u0.B;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PARSER, "PARSER");
        byte[] bArr = (byte[]) ((java.util.LinkedHashMap) map).get(it);
        d26.l0 l0Var = i0Var.f307544i;
        java.util.Collection<i16.u0> y17 = bArr != null ? q26.h0.y(q26.y.e(new d26.c0(PARSER, new java.io.ByteArrayInputStream(bArr), l0Var))) : kz5.p0.f395529d;
        java.util.ArrayList arrayList = new java.util.ArrayList(y17.size());
        for (i16.u0 u0Var : y17) {
            b26.s0 s0Var = l0Var.f307554b.f99056i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            arrayList.add(s0Var.f(u0Var));
        }
        l0Var.k(it, arrayList);
        return o26.a.b(arrayList);
    }
}
