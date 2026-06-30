package b26;

/* loaded from: classes16.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b26.j1 f17425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(b26.j1 j1Var) {
        super(1);
        this.f17425d = j1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        b26.t tVar = this.f17425d.f17449a;
        n16.b a17 = b26.t0.a(tVar.f17516b, intValue);
        boolean z17 = a17.f334158c;
        b26.q qVar = tVar.f17515a;
        return z17 ? qVar.b(a17) : o06.l0.b(qVar.f17484b, a17);
    }
}
