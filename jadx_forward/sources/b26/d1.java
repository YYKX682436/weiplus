package b26;

/* loaded from: classes16.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b26.j1 f98958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(b26.j1 j1Var) {
        super(1);
        this.f98958d = j1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        b26.t tVar = this.f98958d.f98982a;
        n16.b a17 = b26.t0.a(tVar.f99049b, intValue);
        boolean z17 = a17.f415691c;
        b26.q qVar = tVar.f99048a;
        return z17 ? qVar.b(a17) : o06.l0.b(qVar.f99017b, a17);
    }
}
