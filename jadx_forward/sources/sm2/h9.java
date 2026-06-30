package sm2;

/* loaded from: classes3.dex */
public final class h9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f491027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f491026d = o4Var;
        this.f491027e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sm2.g9 g9Var = new sm2.g9(this.f491027e);
        sm2.o4 o4Var = this.f491026d;
        qn2.n nVar = (qn2.n) o4Var.N(g9Var);
        o4Var.C = nVar;
        return nVar;
    }
}
