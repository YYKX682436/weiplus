package d0;

/* loaded from: classes14.dex */
public final class y2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.b f306780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(z0.b bVar) {
        super(2);
        this.f306780d = bVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((p2.q) obj).f432929a;
        p2.s layoutDirection = (p2.s) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        return new p2.m(p2.n.a(((z0.e) this.f306780d).a(0, (int) (j17 >> 32), layoutDirection), 0));
    }
}
