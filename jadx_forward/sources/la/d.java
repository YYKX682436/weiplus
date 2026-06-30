package la;

/* loaded from: classes15.dex */
public class d extends la.f {

    /* renamed from: h, reason: collision with root package name */
    public static final android.graphics.RectF f398975h = new android.graphics.RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f398976b;

    /* renamed from: c, reason: collision with root package name */
    public final float f398977c;

    /* renamed from: d, reason: collision with root package name */
    public final float f398978d;

    /* renamed from: e, reason: collision with root package name */
    public final float f398979e;

    /* renamed from: f, reason: collision with root package name */
    public float f398980f;

    /* renamed from: g, reason: collision with root package name */
    public float f398981g;

    public d(float f17, float f18, float f19, float f27) {
        this.f398976b = f17;
        this.f398977c = f18;
        this.f398978d = f19;
        this.f398979e = f27;
    }

    @Override // la.f
    public void a(android.graphics.Matrix matrix, android.graphics.Path path) {
        android.graphics.Matrix matrix2 = this.f398984a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        android.graphics.RectF rectF = f398975h;
        rectF.set(this.f398976b, this.f398977c, this.f398978d, this.f398979e);
        path.arcTo(rectF, this.f398980f, this.f398981g, false);
        path.transform(matrix);
    }
}
