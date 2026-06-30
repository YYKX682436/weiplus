package d0;

/* loaded from: classes14.dex */
public final class w2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.d f306767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(z0.d dVar) {
        super(2);
        this.f306767d = dVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((p2.q) obj).f432929a;
        p2.s layoutDirection = (p2.s) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        return new p2.m(((z0.g) this.f306767d).a(0L, j17, layoutDirection));
    }
}
