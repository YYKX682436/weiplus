package n06;

/* loaded from: classes15.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n06.o f415525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n06.o oVar) {
        super(0);
        this.f415525d = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        n06.o oVar = this.f415525d;
        yz5.a aVar = oVar.f415531f;
        if (aVar == null) {
            throw new java.lang.AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        n06.k kVar = (n06.k) aVar.mo152xb9724478();
        oVar.f415531f = null;
        return kVar;
    }
}
