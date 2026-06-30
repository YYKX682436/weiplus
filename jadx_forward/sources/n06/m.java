package n06;

/* loaded from: classes15.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n06.o f415526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e26.c0 f415527e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n06.o oVar, e26.c0 c0Var) {
        super(0);
        this.f415526d = oVar;
        this.f415527e = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        n06.o oVar = this.f415526d;
        r06.x0 l17 = oVar.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "getBuiltInsModule(...)");
        return new n06.b0(l17, this.f415527e, new n06.l(oVar));
    }
}
