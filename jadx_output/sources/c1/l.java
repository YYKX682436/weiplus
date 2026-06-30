package c1;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1.p f37755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c1.p pVar) {
        super(1);
        this.f37755d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        c1.p destination = (c1.p) obj;
        kotlin.jvm.internal.o.g(destination, "destination");
        if (kotlin.jvm.internal.o.b(destination, this.f37755d)) {
            return java.lang.Boolean.FALSE;
        }
        if (destination.f37765d == null) {
            throw new java.lang.IllegalStateException("Move focus landed at the root.".toString());
        }
        c1.k0.f(destination);
        return java.lang.Boolean.TRUE;
    }
}
