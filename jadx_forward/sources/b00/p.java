package b00;

/* loaded from: classes9.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.y f98277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b00.r f98278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f98279f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e00.y yVar, b00.r rVar, yz5.l lVar) {
        super(1);
        this.f98277d = yVar;
        this.f98278e = rVar;
        this.f98279f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.x7 x7Var = (bw5.x7) obj;
        e00.y yVar = this.f98277d;
        yVar.f327366d = null;
        b00.r rVar = this.f98278e;
        c00.y2 y2Var = rVar.f98291e;
        java.lang.String mo126544xb5884f29 = yVar.mo126544xb5884f29();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo126544xb5884f29, "<get-key>(...)");
        ((e00.e) y2Var).b(x7Var, mo126544xb5884f29);
        b00.r.wi(rVar, yVar);
        this.f98279f.mo146xb9724478(x7Var);
        return jz5.f0.f384359a;
    }
}
