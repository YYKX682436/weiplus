package fk3;

/* loaded from: classes8.dex */
public final class j implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f345096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f345097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f345098c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f345099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f345100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk3.o f345101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f345102g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f345103h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f345104i;

    public j(boolean z17, int i17, int i18, float f17, android.graphics.Rect rect, fk3.o oVar, int i19, int i27, int i28) {
        this.f345096a = z17;
        this.f345097b = i17;
        this.f345098c = i18;
        this.f345099d = f17;
        this.f345100e = rect;
        this.f345101f = oVar;
        this.f345102g = i19;
        this.f345103h = i27;
        this.f345104i = i28;
    }

    @Override // oa5.a
    public final void a(float f17) {
        float f18;
        float f19;
        float f27;
        boolean z17 = this.f345096a;
        float f28 = 0.0f;
        android.graphics.Rect rect = this.f345100e;
        int i17 = this.f345098c;
        int i18 = this.f345097b;
        float f29 = this.f345099d;
        if (z17) {
            float width = (((i18 * f29) - rect.width()) / 2) * f17 * (1 / f29);
            float f37 = i18 - width;
            f18 = 0.0f;
            f28 = width;
            f19 = f37;
            f27 = i17 - 0.0f;
        } else {
            f19 = i18;
            f18 = (((i17 * f29) - rect.height()) / 2) * f17 * (1 / f29);
            f27 = i17 - f18;
        }
        fk3.o oVar = this.f345101f;
        ek3.e eVar = oVar.f345121d;
        if (eVar != null) {
            eVar.m127797x57005f90((int) (255 * f17));
        }
        ek3.e eVar2 = oVar.f345121d;
        if (eVar2 != null) {
            eVar2.a(f28, f18, f19, f27);
        }
        int i19 = ek3.e.f335142u;
        float f38 = (ek3.e.f335142u * f17) / f29;
        ek3.e eVar3 = oVar.f345121d;
        if (eVar3 != null) {
            eVar3.b(f38, f38, f38, f38, f38, f38, f38, f38);
        }
        ek3.e eVar4 = oVar.f345121d;
        if (eVar4 != null) {
            eVar4.setPivotX(this.f345102g);
        }
        ek3.e eVar5 = oVar.f345121d;
        if (eVar5 != null) {
            eVar5.setPivotY(this.f345103h);
        }
        ek3.e eVar6 = oVar.f345121d;
        if (eVar6 != null) {
            eVar6.m127798x2127345d(this.f345104i * f17);
        }
        ek3.e eVar7 = oVar.f345121d;
        if (eVar7 != null) {
            eVar7.postInvalidate();
        }
    }
}
