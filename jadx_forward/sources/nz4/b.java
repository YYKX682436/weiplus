package nz4;

/* loaded from: classes12.dex */
public class b extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f423117d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f423118e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f423119f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f423120g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f423121h;

    /* renamed from: i, reason: collision with root package name */
    public final int f423122i;

    /* renamed from: m, reason: collision with root package name */
    public final int f423123m;

    /* renamed from: n, reason: collision with root package name */
    public final int f423124n;

    /* renamed from: o, reason: collision with root package name */
    public final int f423125o;

    /* renamed from: p, reason: collision with root package name */
    public final int f423126p;

    /* renamed from: q, reason: collision with root package name */
    public final int f423127q;

    /* renamed from: r, reason: collision with root package name */
    public final nz4.a f423128r;

    public b(android.content.Context context, int i17, int i18, int i19, int i27, nz4.a aVar) {
        super(context);
        this.f423127q = 2;
        this.f423127q = i17;
        this.f423123m = i18;
        this.f423124n = i19;
        int i28 = (i18 * 2) / 5;
        this.f423122i = i28;
        this.f423125o = i28;
        this.f423126p = (i28 * 3) / 4;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f423117d = paint;
        paint.setColor(i27);
        this.f423128r = aVar;
        this.f423118e = new android.graphics.RectF(i28, i18, (i28 * 2) + i28, (i28 * 2) + i18);
        this.f423119f = new android.graphics.RectF(r0 - i28, i18, r0 + i28, (i28 * 2) + i18);
        this.f423120g = new android.graphics.RectF(i28, i18, (i28 * 2) + i28, (i28 * 2) + i18);
        this.f423121h = new android.graphics.RectF(i28 + i19, i18, i19 + i28 + (i28 * 2), i18 + (i28 * 2));
    }

    /* renamed from: getOffsetForCursorMid */
    public int m150324xf3330e72() {
        return this.f423125o + this.f423122i + 1;
    }

    /* renamed from: getType */
    public int m150325xfb85f7b0() {
        return this.f423127q;
    }

    /* renamed from: getViewHeight */
    public int m150326x6ba62022() {
        return this.f423123m + (this.f423122i * 2) + this.f423125o;
    }

    /* renamed from: getViewPadding */
    public int m150327xa9348c76() {
        return this.f423125o;
    }

    /* renamed from: getViewWidth */
    public int m150328xa135536b() {
        int i17 = this.f423122i;
        int i18 = this.f423125o;
        int i19 = this.f423127q;
        if (i19 == 3 || i19 == 4) {
            return i18 + i17 + this.f423126p;
        }
        return this.f423124n + ((i18 + i17) * 2);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17 = this.f423124n;
        int i18 = this.f423125o;
        int i19 = this.f423122i;
        int i27 = this.f423123m;
        android.graphics.Paint paint = this.f423117d;
        int i28 = this.f423127q;
        if (i28 == 2) {
            canvas.drawRect(i18 + i19, 0.0f, i18 + i19 + i17, i27 + (i19 * 2), paint);
            canvas.drawArc(this.f423120g, 90.0f, 180.0f, true, paint);
            canvas.drawArc(this.f423121h, 270.0f, 180.0f, true, paint);
            return;
        }
        int i29 = this.f423126p;
        if (i28 == 3) {
            canvas.drawRect(((i18 + i19) + i29) - i17, 0.0f, i18 + i19 + i29, i27, paint);
            canvas.drawArc(this.f423118e, 90.0f, 180.0f, true, paint);
            canvas.drawRect(i18 + i19, i27, i18 + i19 + i29, i27 + (i19 * 2), paint);
        } else {
            if (i28 != 4) {
                return;
            }
            canvas.drawRect(0.0f, 0.0f, i17, i27, paint);
            canvas.drawRect(0.0f, i27, i29, i27 + (i19 * 2), paint);
            canvas.drawArc(this.f423119f, 270.0f, 180.0f, true, paint);
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
        throw new UnsupportedOperationException("Method not decompiled: nz4.b.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
