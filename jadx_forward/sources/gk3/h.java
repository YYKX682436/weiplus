package gk3;

/* loaded from: classes8.dex */
public final class h implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f354037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f354038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f354039c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f354040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk3.m f354041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f354042f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f354043g;

    public h(int i17, int i18, float f17, android.graphics.Rect rect, gk3.m mVar, int i19, int i27) {
        this.f354037a = i17;
        this.f354038b = i18;
        this.f354039c = f17;
        this.f354040d = rect;
        this.f354041e = mVar;
        this.f354042f = i19;
        this.f354043g = i27;
    }

    @Override // oa5.a
    public final void a(float f17) {
        float f18 = this.f354037a;
        int i17 = this.f354038b;
        float f19 = this.f354039c;
        float height = (((i17 * f19) - this.f354040d.height()) / 2) * f17 * (1 / f19);
        float f27 = i17 - height;
        gk3.m mVar = this.f354041e;
        ek3.e eVar = mVar.f354061d;
        if (eVar != null) {
            eVar.m127797x57005f90((int) (255 * f17));
        }
        ek3.e eVar2 = mVar.f354061d;
        if (eVar2 != null) {
            eVar2.a(0.0f, height, f18, f27);
        }
        int i18 = ek3.e.f335142u;
        float f28 = (ek3.e.f335142u * f17) / f19;
        ek3.e eVar3 = mVar.f354061d;
        if (eVar3 != null) {
            eVar3.b(f28, f28, f28, f28, f28, f28, f28, f28);
        }
        ek3.e eVar4 = mVar.f354061d;
        if (eVar4 != null) {
            eVar4.setPivotX(this.f354042f);
        }
        ek3.e eVar5 = mVar.f354061d;
        if (eVar5 != null) {
            eVar5.setPivotY(this.f354043g);
        }
        ek3.e eVar6 = mVar.f354061d;
        if (eVar6 != null) {
            eVar6.postInvalidate();
        }
    }
}
