package xk0;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xk0.n f536528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f536529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(xk0.n nVar, android.graphics.Rect rect) {
        super(0);
        this.f536528d = nVar;
        this.f536529e = rect;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.util.Size size;
        xk0.n nVar = this.f536528d;
        android.graphics.Rect safeInteractRect = nVar.G;
        android.graphics.Rect layerRect = this.f536529e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layerRect, "layerRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(safeInteractRect, "safeInteractRect");
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(nVar.H);
        int min = java.lang.Math.min(safeInteractRect.width(), safeInteractRect.height());
        if (n07.outWidth >= n07.outHeight) {
            float height = safeInteractRect.height() * 0.2f;
            float f17 = n07.outWidth;
            float f18 = n07.outHeight;
            float f19 = (f17 * height) / f18;
            float f27 = min;
            if (f19 >= f27) {
                f19 = f27 * 0.95f;
                height = (f18 * f19) / f17;
            }
            size = new android.util.Size((int) f19, (int) height);
        } else {
            float width = safeInteractRect.width() * 0.3f;
            float f28 = n07.outHeight;
            float f29 = n07.outWidth;
            float f37 = (f28 * width) / f29;
            float f38 = min;
            if (f37 >= f38) {
                f37 = f38 * 0.95f;
                width = (f29 * f37) / f28;
            }
            size = new android.util.Size((int) width, (int) f37);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.F(), "createDefaultThumbBitmapSize: result:[w:" + size.getWidth() + " h:" + size.getHeight() + "], decode:[w:" + n07.outWidth + ",h:" + n07.outHeight + "], safeInteractRect:[w:" + safeInteractRect.width() + ",h:" + safeInteractRect.height() + ']');
        return size;
    }
}
