package d26;

/* loaded from: classes16.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.i0 f307523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(d26.i0 i0Var) {
        super(1);
        this.f307523d = i0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n16.g it = (n16.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        d26.i0 i0Var = this.f307523d;
        java.util.Map map = i0Var.f307536a;
        p16.j0 PARSER = i16.j0.B;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PARSER, "PARSER");
        byte[] bArr = (byte[]) ((java.util.LinkedHashMap) map).get(it);
        d26.l0 l0Var = i0Var.f307544i;
        java.util.Collection<i16.j0> y17 = bArr != null ? q26.h0.y(q26.y.e(new d26.c0(PARSER, new java.io.ByteArrayInputStream(bArr), l0Var))) : kz5.p0.f395529d;
        java.util.ArrayList arrayList = new java.util.ArrayList(y17.size());
        for (i16.j0 j0Var : y17) {
            b26.s0 s0Var = l0Var.f307554b.f99056i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
            o06.v1 e17 = s0Var.e(j0Var);
            if (!l0Var.r(e17)) {
                e17 = null;
            }
            if (e17 != null) {
                arrayList.add(e17);
            }
        }
        l0Var.j(it, arrayList);
        return o26.a.b(arrayList);
    }
}
