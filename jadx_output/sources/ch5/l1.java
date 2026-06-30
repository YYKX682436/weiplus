package ch5;

/* loaded from: classes14.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f41601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout f41602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f41603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f41604g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(float f17, com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout, float f18, float f19) {
        super(0);
        this.f41601d = f17;
        this.f41602e = wSHalfScreenDraggableLayout;
        this.f41603f = f18;
        this.f41604g = f19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float f17;
        float f18 = this.f41601d;
        double d17 = f18;
        com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout = this.f41602e;
        if (d17 >= 0.0d) {
            f17 = wSHalfScreenDraggableLayout.getPixelDensity();
        } else {
            f18 = wSHalfScreenDraggableLayout.f208850o;
            f17 = this.f41603f;
        }
        int i17 = (int) (f18 * f17);
        android.view.View view = wSHalfScreenDraggableLayout.f208846h;
        if (view != null) {
            com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout.e(wSHalfScreenDraggableLayout, (int) view.getTranslationY(), 0, this.f41604g * 1000, new ch5.j1(wSHalfScreenDraggableLayout), null, new ch5.k1(wSHalfScreenDraggableLayout, i17), 16, null);
        }
        return jz5.f0.f302826a;
    }
}
