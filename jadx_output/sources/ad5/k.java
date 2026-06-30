package ad5;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f3274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad5.q f3275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3276f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yz5.q qVar, ad5.q qVar2, java.util.List list) {
        super(2);
        this.f3274d = qVar;
        this.f3275e = qVar2;
        this.f3276f = list;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ad5.j result = (ad5.j) obj;
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g((java.util.List) obj2, "<anonymous parameter 1>");
        yz5.q qVar = this.f3274d;
        if (qVar != null) {
            qVar.invoke(this.f3275e, result, this.f3276f);
        }
        return jz5.f0.f302826a;
    }
}
