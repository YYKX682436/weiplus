package av3;

/* loaded from: classes10.dex */
public class h extends av3.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f95765e;

    /* renamed from: f, reason: collision with root package name */
    public int f95766f;

    /* renamed from: g, reason: collision with root package name */
    public long f95767g;

    /* renamed from: h, reason: collision with root package name */
    public long f95768h;

    /* renamed from: i, reason: collision with root package name */
    public int f95769i;

    /* renamed from: j, reason: collision with root package name */
    public int f95770j;

    /* renamed from: k, reason: collision with root package name */
    public final long f95771k;

    /* renamed from: l, reason: collision with root package name */
    public final long f95772l;

    /* renamed from: m, reason: collision with root package name */
    public final long f95773m;

    /* renamed from: n, reason: collision with root package name */
    public final long f95774n;

    /* renamed from: o, reason: collision with root package name */
    public final int f95775o;

    /* renamed from: p, reason: collision with root package name */
    public final float f95776p;

    /* renamed from: q, reason: collision with root package name */
    public final float f95777q;

    /* renamed from: r, reason: collision with root package name */
    public final int f95778r;

    /* renamed from: s, reason: collision with root package name */
    public final float f95779s;

    /* renamed from: t, reason: collision with root package name */
    public final float f95780t;

    /* renamed from: u, reason: collision with root package name */
    public final float f95781u;

    /* renamed from: v, reason: collision with root package name */
    public final int f95782v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.RectF[] f95783w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f95784x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Paint f95785y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.util.List lyricsBitmaps, android.graphics.Matrix matrix) {
        super(matrix);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricsBitmaps, "lyricsBitmaps");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        this.f95765e = lyricsBitmaps;
        this.f95771k = 16L;
        this.f95772l = 50L;
        this.f95773m = 200L;
        this.f95774n = 3000L;
        this.f95775o = 11;
        int a17 = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1);
        float f17 = a17;
        float f18 = 1.5f * f17;
        this.f95776p = f18;
        this.f95777q = 9.0f * f17;
        this.f95778r = a17;
        this.f95779s = f18;
        this.f95780t = 12.0f * f17;
        this.f95781u = f17 * 2.0f;
        this.f95782v = a17;
        android.graphics.RectF[] rectFArr = new android.graphics.RectF[11];
        for (int i17 = 0; i17 < 11; i17++) {
            rectFArr[i17] = new android.graphics.RectF();
        }
        this.f95783w = rectFArr;
        this.f95784x = new float[this.f95775o];
        this.f95785y = new android.graphics.Paint();
    }

    @Override // av3.a
    public void b() {
    }

    @Override // av3.a
    public void c(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        canvas.save();
        android.graphics.Bitmap bitmap = ((av3.g) this.f95765e.get(this.f95766f)).f95764b;
        if (bitmap != null) {
            this.f95767g += this.f95745b;
            k();
            i();
            paint.setAlpha(this.f95769i);
            canvas.concat(this.f95744a);
            h(canvas);
            canvas.drawBitmap(bitmap, 0.0f, this.f95780t, paint);
            paint.setAlpha(255);
        }
        canvas.restore();
    }

    @Override // av3.a
    public void d() {
        this.f95785y.setColor(android.graphics.Color.parseColor("#CCFFFFFF"));
    }

    @Override // av3.a
    public long e() {
        return this.f95771k;
    }

    public void h(android.graphics.Canvas canvas) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        java.util.List list = this.f95765e;
        if (list.isEmpty()) {
            return;
        }
        long j17 = this.f95768h;
        android.graphics.RectF[] rectFArr = this.f95783w;
        if (j17 == 0 || this.f95767g - j17 > this.f95772l) {
            this.f95768h = this.f95767g;
            int length = rectFArr.length;
            float f17 = 0.0f;
            int i18 = 0;
            int i19 = 0;
            while (i18 < length) {
                android.graphics.RectF rectF = rectFArr[i18];
                int i27 = i19 + 1;
                float height = rectF.height();
                int i28 = this.f95778r;
                float f18 = i28;
                float f19 = this.f95777q;
                float[] fArr = this.f95784x;
                if (height <= f18) {
                    i17 = i19;
                    fArr[i17] = (float) (f19 * java.lang.Math.random());
                } else {
                    i17 = i19;
                    if (height >= fArr[i17]) {
                        fArr[i17] = i28;
                    }
                }
                float min = height <= fArr[i17] ? java.lang.Math.min(height + this.f95781u, f19) : java.lang.Math.max(height - this.f95782v, i28);
                float f27 = this.f95779s;
                float f28 = 2;
                float f29 = min / f28;
                rectF.set(f17 + f27, (f19 / f28) - f29, f17 + f27 + this.f95776p, (f19 / f28) + f29);
                f17 = rectF.right;
                i18++;
                i19 = i27;
            }
        }
        j(((av3.g) list.get(0)).f95763a.f456701e);
        android.graphics.Paint paint = this.f95785y;
        paint.setAlpha(this.f95770j);
        for (android.graphics.RectF rectF2 : rectFArr) {
            canvas.drawRect(rectF2, paint);
        }
    }

    public void i() {
        r45.ge4 ge4Var;
        int i17 = this.f95766f;
        java.util.List list = this.f95765e;
        if (i17 < list.size()) {
            long j17 = ((av3.g) list.get(this.f95766f)).f95763a.f456701e;
            av3.g gVar = (av3.g) kz5.n0.a0(list, this.f95766f + 1);
            long j18 = (gVar == null || (ge4Var = gVar.f95763a) == null) ? ((av3.g) list.get(this.f95766f)).f95763a.f456701e + this.f95774n : ge4Var.f456701e;
            long j19 = this.f95767g;
            long j27 = j19 - j17;
            long j28 = this.f95773m;
            if (0 <= j27 && j27 <= j28) {
                this.f95769i = (int) ((255 * ((float) (j19 - j17))) / ((float) j28));
                return;
            }
            long j29 = j18 - j19;
            if (0 <= j29 && j29 <= j28) {
                this.f95769i = (int) (255 * (((float) (j18 - j19)) / ((float) j28)));
            } else {
                if (j19 - j17 <= j28 || j18 - j19 <= j28) {
                    return;
                }
                this.f95769i = 255;
            }
        }
    }

    public void j(long j17) {
        if (this.f95770j < 255) {
            long j18 = this.f95767g;
            long j19 = j18 - j17;
            boolean z17 = false;
            long j27 = this.f95773m;
            if (0 <= j19 && j19 <= j27) {
                z17 = true;
            }
            if (z17) {
                this.f95770j = (int) ((255 * ((float) (j18 - j17))) / ((float) j27));
            } else if (j18 - j17 > j27) {
                this.f95770j = 255;
            }
        }
    }

    public void k() {
        r45.ge4 ge4Var;
        int i17 = this.f95766f + 1;
        java.util.List list = this.f95765e;
        av3.g gVar = (av3.g) kz5.n0.a0(list, i17);
        if (this.f95767g >= ((gVar == null || (ge4Var = gVar.f95763a) == null) ? ((av3.g) list.get(this.f95766f)).f95763a.f456701e + this.f95774n : ge4Var.f456701e)) {
            int i18 = this.f95766f + 1;
            this.f95766f = i18;
            if (i18 >= list.size()) {
                this.f95766f = 0;
                this.f95767g = 0L;
                this.f95768h = 0L;
            }
        }
    }
}
