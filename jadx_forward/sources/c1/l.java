package c1;

/* loaded from: classes14.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1.p f119288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c1.p pVar) {
        super(1);
        this.f119288d = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        c1.p destination = (c1.p) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destination, "destination");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(destination, this.f119288d)) {
            return java.lang.Boolean.FALSE;
        }
        if (destination.f119298d == null) {
            throw new java.lang.IllegalStateException("Move focus landed at the root.".toString());
        }
        c1.k0.f(destination);
        return java.lang.Boolean.TRUE;
    }
}
