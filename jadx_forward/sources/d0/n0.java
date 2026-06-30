package d0;

/* loaded from: classes14.dex */
public final class n0 extends d0.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0.b f306710a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(z0.b horizontal) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(horizontal, "horizontal");
        this.f306710a = horizontal;
    }

    @Override // d0.p0
    public int a(int i17, p2.s layoutDirection, s1.o1 placeable, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(placeable, "placeable");
        return ((z0.e) this.f306710a).a(0, i17, layoutDirection);
    }
}
