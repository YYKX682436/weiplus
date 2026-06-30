package sp4;

/* loaded from: classes5.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp4.b f492843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f492844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f492845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f492846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f492847h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f492848i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f492849m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f492850n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f492851o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f492852p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sp4.b bVar, android.view.View view, float f17, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, float f18, float f19, int i17, float f27, float f28, float f29) {
        super(1);
        this.f492843d = bVar;
        this.f492844e = view;
        this.f492845f = f17;
        this.f492846g = e0Var;
        this.f492847h = f18;
        this.f492848i = f19;
        this.f492849m = i17;
        this.f492850n = f27;
        this.f492851o = f28;
        this.f492852p = f29;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        this.f492843d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewTransformCalculateHandler", "onDrawerTranslation closePercent:" + floatValue);
        float f17 = (!java.lang.Float.isNaN(floatValue) && floatValue <= 1.0f) ? floatValue < 0.0f ? 0.0f : floatValue : 1.0f;
        float f18 = this.f492846g.f391648d;
        float f19 = this.f492849m;
        float f27 = this.f492847h;
        float f28 = f27 > 1.0f ? ((f27 - 1.0f) * f17) + 1.0f : f27 < 1.0f ? 1.0f - ((1.0f - f27) * f17) : 1.0f;
        float f29 = this.f492848i;
        float f37 = f29 > 1.0f ? ((f29 - 1.0f) * f17) + 1.0f : f29 < 1.0f ? 1.0f - ((1.0f - f29) * f17) : 1.0f;
        float f38 = this.f492851o + (f19 * f17);
        float f39 = this.f492852p + (f17 * this.f492850n);
        android.view.View view = this.f492844e;
        view.setPivotX(this.f492845f);
        view.setPivotY(f18);
        view.setScaleX(f28);
        view.setScaleY(f37);
        view.setTranslationX(f38);
        view.setTranslationY(f39);
        if (floatValue == 0.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewTransformCalculateHandler", "onDrawerTranslation end");
        } else {
            if (floatValue == 1.0f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewTransformCalculateHandler", "onDrawerTranslation start");
            }
        }
        return jz5.f0.f384359a;
    }
}
