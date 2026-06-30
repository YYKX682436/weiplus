package ad5;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f84807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad5.q f84808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84809f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yz5.q qVar, ad5.q qVar2, java.util.List list) {
        super(2);
        this.f84807d = qVar;
        this.f84808e = qVar2;
        this.f84809f = list;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ad5.j result = (ad5.j) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((java.util.List) obj2, "<anonymous parameter 1>");
        yz5.q qVar = this.f84807d;
        if (qVar != null) {
            qVar.mo147xb9724478(this.f84808e, result, this.f84809f);
        }
        return jz5.f0.f384359a;
    }
}
