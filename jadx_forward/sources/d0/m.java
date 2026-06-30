package d0;

/* loaded from: classes14.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final d0.m f306703d = new d0.m();

    public m() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        p2.s layoutDirection = (p2.s) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        int i17 = z0.d.f550436a;
        return java.lang.Integer.valueOf(a06.d.b(((intValue + 0) / 2.0f) * (1 + (layoutDirection != p2.s.Ltr ? (-1.0f) * (-1) : -1.0f))));
    }
}
