package n50;

/* loaded from: classes9.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n50.i f416635d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n50.i iVar) {
        super(0);
        this.f416635d = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        n50.i iVar = this.f416635d;
        long b17 = iVar.b();
        jz5.g gVar = iVar.f416639d;
        if (b17 <= 0 && ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).longValue() == 0) {
            return null;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        jz5.g gVar2 = iVar.f416640e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k((java.lang.String) ((jz5.n) gVar2).mo141623x754a37bb(), iVar.b());
        return k17 == null ? e0Var.l((java.lang.String) ((jz5.n) gVar2).mo141623x754a37bb(), ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).longValue()) : k17;
    }
}
