package fk3;

/* loaded from: classes8.dex */
public final class a implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f345065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f345066b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f345067c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f345068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f345069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f345070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f345071g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ek3.e f345072h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f345073i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f345074j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f345075k;

    public a(float f17, boolean z17, int i17, int i18, float f18, android.graphics.Rect rect, float f19, ek3.e eVar, int i19, int i27, int i28) {
        this.f345065a = f17;
        this.f345066b = z17;
        this.f345067c = i17;
        this.f345068d = i18;
        this.f345069e = f18;
        this.f345070f = rect;
        this.f345071g = f19;
        this.f345072h = eVar;
        this.f345073i = i19;
        this.f345074j = i27;
        this.f345075k = i28;
    }

    @Override // oa5.a
    public final void a(float f17) {
        float f18;
        float f19;
        float f27;
        float f28 = 1;
        float f29 = this.f345065a;
        float f37 = f29 + ((f28 - f29) * f17);
        boolean z17 = this.f345066b;
        android.graphics.Rect rect = this.f345070f;
        float f38 = 0.0f;
        int i17 = this.f345067c;
        int i18 = this.f345068d;
        float f39 = this.f345069e;
        if (z17) {
            float f47 = i18;
            float height = (((i17 * f39) - rect.height()) / 2) * f37 * (f28 / this.f345071g);
            float f48 = i17 - height;
            f18 = 0.0f;
            f38 = height;
            f19 = f48;
            f27 = f47;
        } else {
            f19 = i17;
            f18 = (((i18 * f39) - rect.height()) / 2) * f37 * (f28 / f39);
            f27 = i18 - f18;
        }
        float f49 = this.f345073i;
        ek3.e eVar = this.f345072h;
        eVar.setPivotX(f49);
        eVar.setPivotY(this.f345074j);
        eVar.m127797x57005f90((int) (255 * f37));
        eVar.a(f38, f18, f19, f27);
        int i19 = ek3.e.f335142u;
        float f57 = (ek3.e.f335142u * f37) / f39;
        this.f345072h.b(f57, f57, f57, f57, f57, f57, f57, f57);
        eVar.m127798x2127345d(this.f345075k * f17);
        eVar.postInvalidate();
    }
}
