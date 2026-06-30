package d0;

/* loaded from: classes14.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.b f306709d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(z0.b bVar) {
        super(2);
        this.f306709d = bVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        p2.s layoutDirection = (p2.s) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        return java.lang.Integer.valueOf(((z0.e) this.f306709d).a(0, intValue, layoutDirection));
    }
}
