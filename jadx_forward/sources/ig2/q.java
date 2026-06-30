package ig2;

/* loaded from: classes10.dex */
public final class q extends android.view.TextureView {

    /* renamed from: d, reason: collision with root package name */
    public int f372947d;

    /* renamed from: e, reason: collision with root package name */
    public int f372948e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        setOpaque(false);
        setSurfaceTextureListener(new ig2.p("FluentSwitchTextureView", false));
    }

    public final void a(int i17, int i18) {
        float f17 = i17;
        float f18 = f17 / this.f372947d;
        float f19 = i18;
        float f27 = f19 / this.f372948e;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (f18 < f27) {
            f18 = f27;
        }
        float f28 = 2;
        matrix.preTranslate((f17 - this.f372947d) / f28, (f19 - this.f372948e) / f28);
        matrix.preScale(this.f372947d / f17, this.f372948e / f19);
        matrix.postScale(f18, f18, f17 / f28, f19 / f28);
        setTransform(matrix);
        postInvalidate();
    }

    /* renamed from: getVideoHeight */
    public final int m136594x463504c() {
        return this.f372948e;
    }

    /* renamed from: getVideoWidth */
    public final int m136595x8d5c7601() {
        return this.f372947d;
    }

    /* renamed from: setVideoHeight */
    public final void m136596x9ac8c3c0(int i17) {
        this.f372948e = i17;
    }

    /* renamed from: setVideoWidth */
    public final void m136597xbb80c40d(int i17) {
        this.f372947d = i17;
    }
}
