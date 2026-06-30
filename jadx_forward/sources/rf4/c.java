package rf4;

/* loaded from: classes3.dex */
public final class c implements android.view.animation.Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.PointF f476559a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.PointF f476560b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.PointF f476561c;

    public c(android.graphics.PointF divide) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(divide, "divide");
        this.f476559a = divide;
        float f17 = 1;
        float f18 = f17 - 0.2f;
        this.f476560b = new android.graphics.PointF(divide.x * f18, divide.y * f18);
        float f19 = divide.x;
        float f27 = divide.y;
        this.f476561c = new android.graphics.PointF(f19 + ((f17 - f19) * 0.2f), f27 + ((f17 - f27) * 0.2f));
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        float f18;
        float f19;
        android.graphics.PointF pointF = this.f476560b;
        float f27 = pointF.x;
        android.graphics.PointF pointF2 = this.f476559a;
        if (f17 < f27) {
            return (f17 * pointF2.y) / pointF2.x;
        }
        android.graphics.PointF pointF3 = this.f476561c;
        float f28 = pointF3.x;
        if (f17 < f28) {
            f18 = pointF.y;
            f19 = ((f17 - f27) / (f28 - f27)) * (pointF3.y - f18);
        } else {
            f18 = pointF2.y;
            float f29 = pointF2.x;
            float f37 = 1;
            f19 = ((f17 - f29) / (f37 - f29)) * (f37 - f18);
        }
        return f18 + f19;
    }
}
