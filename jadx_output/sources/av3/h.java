package av3;

/* loaded from: classes10.dex */
public class h extends av3.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f14232e;

    /* renamed from: f, reason: collision with root package name */
    public int f14233f;

    /* renamed from: g, reason: collision with root package name */
    public long f14234g;

    /* renamed from: h, reason: collision with root package name */
    public long f14235h;

    /* renamed from: i, reason: collision with root package name */
    public int f14236i;

    /* renamed from: j, reason: collision with root package name */
    public int f14237j;

    /* renamed from: k, reason: collision with root package name */
    public final long f14238k;

    /* renamed from: l, reason: collision with root package name */
    public final long f14239l;

    /* renamed from: m, reason: collision with root package name */
    public final long f14240m;

    /* renamed from: n, reason: collision with root package name */
    public final long f14241n;

    /* renamed from: o, reason: collision with root package name */
    public final int f14242o;

    /* renamed from: p, reason: collision with root package name */
    public final float f14243p;

    /* renamed from: q, reason: collision with root package name */
    public final float f14244q;

    /* renamed from: r, reason: collision with root package name */
    public final int f14245r;

    /* renamed from: s, reason: collision with root package name */
    public final float f14246s;

    /* renamed from: t, reason: collision with root package name */
    public final float f14247t;

    /* renamed from: u, reason: collision with root package name */
    public final float f14248u;

    /* renamed from: v, reason: collision with root package name */
    public final int f14249v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.RectF[] f14250w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f14251x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Paint f14252y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.util.List lyricsBitmaps, android.graphics.Matrix matrix) {
        super(matrix);
        kotlin.jvm.internal.o.g(lyricsBitmaps, "lyricsBitmaps");
        kotlin.jvm.internal.o.g(matrix, "matrix");
        this.f14232e = lyricsBitmaps;
        this.f14238k = 16L;
        this.f14239l = 50L;
        this.f14240m = 200L;
        this.f14241n = 3000L;
        this.f14242o = 11;
        int a17 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 1);
        float f17 = a17;
        float f18 = 1.5f * f17;
        this.f14243p = f18;
        this.f14244q = 9.0f * f17;
        this.f14245r = a17;
        this.f14246s = f18;
        this.f14247t = 12.0f * f17;
        this.f14248u = f17 * 2.0f;
        this.f14249v = a17;
        android.graphics.RectF[] rectFArr = new android.graphics.RectF[11];
        for (int i17 = 0; i17 < 11; i17++) {
            rectFArr[i17] = new android.graphics.RectF();
        }
        this.f14250w = rectFArr;
        this.f14251x = new float[this.f14242o];
        this.f14252y = new android.graphics.Paint();
    }

    @Override // av3.a
    public void b() {
    }

    @Override // av3.a
    public void c(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        canvas.save();
        android.graphics.Bitmap bitmap = ((av3.g) this.f14232e.get(this.f14233f)).f14231b;
        if (bitmap != null) {
            this.f14234g += this.f14212b;
            k();
            i();
            paint.setAlpha(this.f14236i);
            canvas.concat(this.f14211a);
            h(canvas);
            canvas.drawBitmap(bitmap, 0.0f, this.f14247t, paint);
            paint.setAlpha(255);
        }
        canvas.restore();
    }

    @Override // av3.a
    public void d() {
        this.f14252y.setColor(android.graphics.Color.parseColor("#CCFFFFFF"));
    }

    @Override // av3.a
    public long e() {
        return this.f14238k;
    }

    public void h(android.graphics.Canvas canvas) {
        int i17;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        java.util.List list = this.f14232e;
        if (list.isEmpty()) {
            return;
        }
        long j17 = this.f14235h;
        android.graphics.RectF[] rectFArr = this.f14250w;
        if (j17 == 0 || this.f14234g - j17 > this.f14239l) {
            this.f14235h = this.f14234g;
            int length = rectFArr.length;
            float f17 = 0.0f;
            int i18 = 0;
            int i19 = 0;
            while (i18 < length) {
                android.graphics.RectF rectF = rectFArr[i18];
                int i27 = i19 + 1;
                float height = rectF.height();
                int i28 = this.f14245r;
                float f18 = i28;
                float f19 = this.f14244q;
                float[] fArr = this.f14251x;
                if (height <= f18) {
                    i17 = i19;
                    fArr[i17] = (float) (f19 * java.lang.Math.random());
                } else {
                    i17 = i19;
                    if (height >= fArr[i17]) {
                        fArr[i17] = i28;
                    }
                }
                float min = height <= fArr[i17] ? java.lang.Math.min(height + this.f14248u, f19) : java.lang.Math.max(height - this.f14249v, i28);
                float f27 = this.f14246s;
                float f28 = 2;
                float f29 = min / f28;
                rectF.set(f17 + f27, (f19 / f28) - f29, f17 + f27 + this.f14243p, (f19 / f28) + f29);
                f17 = rectF.right;
                i18++;
                i19 = i27;
            }
        }
        j(((av3.g) list.get(0)).f14230a.f375168e);
        android.graphics.Paint paint = this.f14252y;
        paint.setAlpha(this.f14237j);
        for (android.graphics.RectF rectF2 : rectFArr) {
            canvas.drawRect(rectF2, paint);
        }
    }

    public void i() {
        r45.ge4 ge4Var;
        int i17 = this.f14233f;
        java.util.List list = this.f14232e;
        if (i17 < list.size()) {
            long j17 = ((av3.g) list.get(this.f14233f)).f14230a.f375168e;
            av3.g gVar = (av3.g) kz5.n0.a0(list, this.f14233f + 1);
            long j18 = (gVar == null || (ge4Var = gVar.f14230a) == null) ? ((av3.g) list.get(this.f14233f)).f14230a.f375168e + this.f14241n : ge4Var.f375168e;
            long j19 = this.f14234g;
            long j27 = j19 - j17;
            long j28 = this.f14240m;
            if (0 <= j27 && j27 <= j28) {
                this.f14236i = (int) ((255 * ((float) (j19 - j17))) / ((float) j28));
                return;
            }
            long j29 = j18 - j19;
            if (0 <= j29 && j29 <= j28) {
                this.f14236i = (int) (255 * (((float) (j18 - j19)) / ((float) j28)));
            } else {
                if (j19 - j17 <= j28 || j18 - j19 <= j28) {
                    return;
                }
                this.f14236i = 255;
            }
        }
    }

    public void j(long j17) {
        if (this.f14237j < 255) {
            long j18 = this.f14234g;
            long j19 = j18 - j17;
            boolean z17 = false;
            long j27 = this.f14240m;
            if (0 <= j19 && j19 <= j27) {
                z17 = true;
            }
            if (z17) {
                this.f14237j = (int) ((255 * ((float) (j18 - j17))) / ((float) j27));
            } else if (j18 - j17 > j27) {
                this.f14237j = 255;
            }
        }
    }

    public void k() {
        r45.ge4 ge4Var;
        int i17 = this.f14233f + 1;
        java.util.List list = this.f14232e;
        av3.g gVar = (av3.g) kz5.n0.a0(list, i17);
        if (this.f14234g >= ((gVar == null || (ge4Var = gVar.f14230a) == null) ? ((av3.g) list.get(this.f14233f)).f14230a.f375168e + this.f14241n : ge4Var.f375168e)) {
            int i18 = this.f14233f + 1;
            this.f14233f = i18;
            if (i18 >= list.size()) {
                this.f14233f = 0;
                this.f14234g = 0L;
                this.f14235h = 0L;
            }
        }
    }
}
