package ox1;

/* loaded from: classes12.dex */
public class b extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f431102d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f431103e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f431104f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f431105g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f431106h;

    /* renamed from: i, reason: collision with root package name */
    public final int f431107i;

    /* renamed from: m, reason: collision with root package name */
    public final int f431108m;

    /* renamed from: n, reason: collision with root package name */
    public final int f431109n;

    /* renamed from: o, reason: collision with root package name */
    public final int f431110o;

    /* renamed from: p, reason: collision with root package name */
    public final int f431111p;

    /* renamed from: q, reason: collision with root package name */
    public final int f431112q;

    /* renamed from: r, reason: collision with root package name */
    public final ox1.a f431113r;

    public b(android.content.Context context, int i17, int i18, int i19, int i27, ox1.a aVar) {
        super(context);
        this.f431112q = 2;
        this.f431112q = i17;
        this.f431108m = i18;
        this.f431109n = i19;
        int i28 = (i18 * 2) / 5;
        this.f431107i = i28;
        this.f431110o = i28;
        this.f431111p = (i28 * 3) / 4;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f431102d = paint;
        paint.setColor(i27);
        this.f431113r = aVar;
        this.f431103e = new android.graphics.RectF(i28, i18, (i28 * 2) + i28, (i28 * 2) + i18);
        this.f431104f = new android.graphics.RectF(r0 - i28, i18, r0 + i28, (i28 * 2) + i18);
        this.f431105g = new android.graphics.RectF(i28, i18, (i28 * 2) + i28, (i28 * 2) + i18);
        this.f431106h = new android.graphics.RectF(i28 + i19, i18, i19 + i28 + (i28 * 2), i18 + (i28 * 2));
    }

    /* renamed from: getOffsetForCursorMid */
    public int m157329xf3330e72() {
        return this.f431110o + this.f431107i + 1;
    }

    /* renamed from: getType */
    public int m157330xfb85f7b0() {
        return this.f431112q;
    }

    /* renamed from: getViewHeight */
    public int m157331x6ba62022() {
        return this.f431108m + (this.f431107i * 2) + this.f431110o;
    }

    /* renamed from: getViewPadding */
    public int m157332xa9348c76() {
        return this.f431110o;
    }

    /* renamed from: getViewWidth */
    public int m157333xa135536b() {
        int i17 = this.f431107i;
        int i18 = this.f431110o;
        int i19 = this.f431112q;
        if (i19 == 3 || i19 == 4) {
            return i18 + i17 + this.f431111p;
        }
        return this.f431109n + ((i18 + i17) * 2);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17 = this.f431109n;
        int i18 = this.f431110o;
        int i19 = this.f431107i;
        int i27 = this.f431108m;
        android.graphics.Paint paint = this.f431102d;
        int i28 = this.f431112q;
        if (i28 == 2) {
            canvas.drawRect(i18 + i19, 0.0f, i18 + i19 + i17, i27 + (i19 * 2), paint);
            canvas.drawArc(this.f431105g, 90.0f, 180.0f, true, paint);
            canvas.drawArc(this.f431106h, 270.0f, 180.0f, true, paint);
            return;
        }
        int i29 = this.f431111p;
        if (i28 == 3) {
            canvas.drawRect(((i18 + i19) + i29) - i17, 0.0f, i18 + i19 + i29, i27, paint);
            canvas.drawArc(this.f431103e, 90.0f, 180.0f, true, paint);
            canvas.drawRect(i18 + i19, i27, i18 + i19 + i29, i27 + (i19 * 2), paint);
        } else {
            if (i28 != 4) {
                return;
            }
            canvas.drawRect(0.0f, 0.0f, i17, i27, paint);
            canvas.drawRect(0.0f, i27, i29, i27 + (i19 * 2), paint);
            canvas.drawArc(this.f431104f, 270.0f, 180.0f, true, paint);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r2 != 3) goto L50;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox1.b.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
