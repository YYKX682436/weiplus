package b26;

/* loaded from: classes16.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b26.b f17409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b26.b bVar) {
        super(1);
        this.f17409d = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n16.c fqName = (n16.c) obj;
        kotlin.jvm.internal.o.g(fqName, "fqName");
        b26.b bVar = this.f17409d;
        b26.v d17 = bVar.d(fqName);
        if (d17 == null) {
            return null;
        }
        b26.q qVar = bVar.f17415d;
        if (qVar != null) {
            d17.u0(qVar);
            return d17;
        }
        kotlin.jvm.internal.o.o("components");
        throw null;
    }
}
