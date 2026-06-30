package d0;

/* loaded from: classes14.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.d f306706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(d0.d dVar) {
        super(5);
        this.f306706d = dVar;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        int intValue = ((java.lang.Number) obj).intValue();
        int[] size = (int[]) obj2;
        p2.s layoutDirection = (p2.s) obj3;
        p2.f density = (p2.f) obj4;
        int[] outPosition = (int[]) obj5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(density, "density");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outPosition, "outPosition");
        this.f306706d.c(density, intValue, size, layoutDirection, outPosition);
        return jz5.f0.f384359a;
    }
}
