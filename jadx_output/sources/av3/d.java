package av3;

/* loaded from: classes10.dex */
public final class d extends av3.a {

    /* renamed from: e, reason: collision with root package name */
    public final zu3.d f14219e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f14220f;

    /* renamed from: g, reason: collision with root package name */
    public final wu3.h f14221g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14222h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Matrix f14223i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14224j;

    /* renamed from: k, reason: collision with root package name */
    public final float f14225k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zu3.d captionItem) {
        super(captionItem.f475763f);
        kotlin.jvm.internal.o.g(captionItem, "captionItem");
        this.f14219e = captionItem;
        this.f14220f = new android.graphics.Paint();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f14221g = new wu3.h(context);
        this.f14222h = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        this.f14223i = new android.graphics.Matrix();
        float[] fArr = new float[9];
        this.f14211a.getValues(fArr);
        double d17 = fArr[0];
        double d18 = fArr[3];
        this.f14225k = (float) java.lang.Math.sqrt((d17 * d17) + (d18 * d18));
    }

    @Override // av3.a
    public void b() {
    }

    @Override // av3.a
    public void c(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        if (this.f14224j) {
            canvas.save();
            android.graphics.Matrix matrix = this.f14223i;
            matrix.reset();
            float f17 = this.f14222h;
            wu3.h hVar = this.f14221g;
            matrix.postTranslate((f17 - (hVar.getMeasuredWidth() * this.f14225k)) / 2.0f, 0.0f);
            canvas.concat(matrix);
            canvas.concat(this.f14211a);
            hVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override // av3.a
    public void d() {
        this.f14220f.setAntiAlias(true);
        wu3.h hVar = this.f14221g;
        zu3.d dVar = this.f14219e;
        hVar.setCaptionItem(dVar);
        hVar.setTag(dVar);
    }

    @Override // av3.a
    public long e() {
        return com.tencent.wcdb.core.Database.DictDefaultMatchValue;
    }

    @Override // av3.a
    public void f(long j17) {
        boolean z17;
        this.f14214d = j17;
        wu3.h hVar = this.f14221g;
        if (hVar.a(j17)) {
            zu3.d dVar = hVar.f449749n;
            if (dVar != null) {
                r45.is i17 = dVar.i(j17);
                z17 = !(i17 != null ? i17.f377300g : true);
            } else {
                z17 = false;
            }
            if (z17) {
                this.f14224j = true;
                hVar.measure(0, 0);
                hVar.layout(0, 0, hVar.getMeasuredWidth(), hVar.getMeasuredHeight());
                return;
            }
        }
        this.f14224j = false;
    }
}
