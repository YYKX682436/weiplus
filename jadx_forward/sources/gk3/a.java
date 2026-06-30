package gk3;

/* loaded from: classes8.dex */
public final class a implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f354015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f354016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f354017c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f354018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f354019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ek3.e f354020f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f354021g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f354022h;

    public a(float f17, int i17, int i18, float f18, android.graphics.Rect rect, ek3.e eVar, int i19, int i27) {
        this.f354015a = f17;
        this.f354016b = i17;
        this.f354017c = i18;
        this.f354018d = f18;
        this.f354019e = rect;
        this.f354020f = eVar;
        this.f354021g = i19;
        this.f354022h = i27;
    }

    @Override // oa5.a
    public final void a(float f17) {
        float f18 = 1;
        float f19 = this.f354015a;
        float f27 = f19 + ((f18 - f19) * f17);
        float f28 = this.f354016b;
        int i17 = this.f354017c;
        float f29 = this.f354018d;
        float height = (((i17 * f29) - this.f354019e.height()) / 2) * f27 * (f18 / f29);
        float f37 = i17 - height;
        float f38 = this.f354021g;
        ek3.e eVar = this.f354020f;
        eVar.setPivotX(f38);
        eVar.setPivotY(this.f354022h);
        eVar.m127797x57005f90((int) (255 * f27));
        eVar.a(0.0f, height, f28, f37);
        int i18 = ek3.e.f335142u;
        float f39 = (ek3.e.f335142u * f27) / f29;
        this.f354020f.b(f39, f39, f39, f39, f39, f39, f39, f39);
        eVar.postInvalidate();
    }
}
