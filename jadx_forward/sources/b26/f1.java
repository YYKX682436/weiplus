package b26;

/* loaded from: classes16.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b26.j1 f98970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(b26.j1 j1Var) {
        super(1);
        this.f98970d = j1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        b26.t tVar = this.f98970d.f98982a;
        n16.b a17 = b26.t0.a(tVar.f99049b, intValue);
        if (!a17.f415691c) {
            o06.v0 v0Var = tVar.f99048a.f99017b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v0Var, "<this>");
            o06.j b17 = o06.l0.b(v0Var, a17);
            if (b17 instanceof o06.d2) {
                return (o06.d2) b17;
            }
        }
        return null;
    }
}
