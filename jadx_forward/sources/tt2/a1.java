package tt2;

/* loaded from: classes3.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f503365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f503366f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(tt2.e1 e1Var, l81.b1 b1Var, so2.j5 j5Var) {
        super(2);
        this.f503364d = e1Var;
        this.f503365e = b1Var;
        this.f503366f = j5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        zl2.r4 r4Var = zl2.r4.f555483a;
        tt2.e1 e1Var = this.f503364d;
        r4Var.h3(e1Var.f503413h, false);
        st2.c2 c2Var = st2.c2.f493782a;
        l81.b1 b1Var = this.f503365e;
        c2Var.k(b1Var);
        yz5.p pVar = e1Var.f503425w;
        if (pVar != null) {
            pVar.mo149xb9724478(1, b1Var);
        }
        yz5.l lVar = e1Var.f503428z;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Long.valueOf(((cm2.m0) this.f503366f).f124902w));
        }
        return jz5.f0.f384359a;
    }
}
