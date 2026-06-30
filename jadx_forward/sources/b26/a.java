package b26;

/* loaded from: classes16.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b26.b f98942d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b26.b bVar) {
        super(1);
        this.f98942d = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n16.c fqName = (n16.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        b26.b bVar = this.f98942d;
        b26.v d17 = bVar.d(fqName);
        if (d17 == null) {
            return null;
        }
        b26.q qVar = bVar.f98948d;
        if (qVar != null) {
            d17.u0(qVar);
            return d17;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("components");
        throw null;
    }
}
