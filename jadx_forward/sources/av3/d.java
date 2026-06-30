package av3;

/* loaded from: classes10.dex */
public final class d extends av3.a {

    /* renamed from: e, reason: collision with root package name */
    public final zu3.d f95752e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f95753f;

    /* renamed from: g, reason: collision with root package name */
    public final wu3.h f95754g;

    /* renamed from: h, reason: collision with root package name */
    public final int f95755h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Matrix f95756i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f95757j;

    /* renamed from: k, reason: collision with root package name */
    public final float f95758k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zu3.d captionItem) {
        super(captionItem.f557296f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(captionItem, "captionItem");
        this.f95752e = captionItem;
        this.f95753f = new android.graphics.Paint();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f95754g = new wu3.h(context);
        this.f95755h = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        this.f95756i = new android.graphics.Matrix();
        float[] fArr = new float[9];
        this.f95744a.getValues(fArr);
        double d17 = fArr[0];
        double d18 = fArr[3];
        this.f95758k = (float) java.lang.Math.sqrt((d17 * d17) + (d18 * d18));
    }

    @Override // av3.a
    public void b() {
    }

    @Override // av3.a
    public void c(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        if (this.f95757j) {
            canvas.save();
            android.graphics.Matrix matrix = this.f95756i;
            matrix.reset();
            float f17 = this.f95755h;
            wu3.h hVar = this.f95754g;
            matrix.postTranslate((f17 - (hVar.getMeasuredWidth() * this.f95758k)) / 2.0f, 0.0f);
            canvas.concat(matrix);
            canvas.concat(this.f95744a);
            hVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override // av3.a
    public void d() {
        this.f95753f.setAntiAlias(true);
        wu3.h hVar = this.f95754g;
        zu3.d dVar = this.f95752e;
        hVar.m174470xfa82e057(dVar);
        hVar.setTag(dVar);
    }

    @Override // av3.a
    public long e() {
        return com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
    }

    @Override // av3.a
    public void f(long j17) {
        boolean z17;
        this.f95747d = j17;
        wu3.h hVar = this.f95754g;
        if (hVar.a(j17)) {
            zu3.d dVar = hVar.f531282n;
            if (dVar != null) {
                r45.is i17 = dVar.i(j17);
                z17 = !(i17 != null ? i17.f458833g : true);
            } else {
                z17 = false;
            }
            if (z17) {
                this.f95757j = true;
                hVar.measure(0, 0);
                hVar.layout(0, 0, hVar.getMeasuredWidth(), hVar.getMeasuredHeight());
                return;
            }
        }
        this.f95757j = false;
    }
}
