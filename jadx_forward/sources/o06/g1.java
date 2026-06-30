package o06;

/* loaded from: classes15.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n16.c f423491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(n16.c cVar) {
        super(1);
        this.f423491d = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n16.c it = (n16.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return java.lang.Boolean.valueOf(!it.d() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.e(), this.f423491d));
    }
}
