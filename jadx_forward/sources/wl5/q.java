package wl5;

/* loaded from: classes15.dex */
public class q extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.PopupWindow f528663d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f528664e;

    /* renamed from: f, reason: collision with root package name */
    public final int f528665f;

    /* renamed from: g, reason: collision with root package name */
    public final int f528666g;

    /* renamed from: h, reason: collision with root package name */
    public final int f528667h;

    /* renamed from: i, reason: collision with root package name */
    public final int f528668i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f528669m;

    /* renamed from: n, reason: collision with root package name */
    public int f528670n;

    /* renamed from: o, reason: collision with root package name */
    public int f528671o;

    /* renamed from: p, reason: collision with root package name */
    public int f528672p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f528673q;

    /* renamed from: r, reason: collision with root package name */
    public xl5.c f528674r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Rect f528675s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Point f528676t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f528677u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f528678v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f528679w;

    /* renamed from: x, reason: collision with root package name */
    public wl5.r f528680x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ wl5.x f528681y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(wl5.x xVar, boolean z17) {
        super(xVar.f528697i);
        this.f528681y = xVar;
        int i17 = xVar.f528714z / 2;
        this.f528665f = i17;
        int i18 = i17 * 2;
        this.f528666g = i18;
        int i19 = i17 * 2;
        this.f528667h = i19;
        this.f528668i = 20;
        this.f528673q = new int[2];
        this.f528675s = new android.graphics.Rect();
        this.f528676t = new android.graphics.Point();
        this.f528677u = false;
        this.f528678v = new int[2];
        this.f528679w = false;
        this.f528669m = z17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f528664e = paint;
        paint.setColor(xVar.f528697i.getResources().getColor(xVar.f528713y));
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(this);
        this.f528663d = popupWindow;
        popupWindow.setClippingEnabled(false);
        popupWindow.setWidth(i18 + (20 * 3));
        popupWindow.setHeight(i19 + (20 * 2));
    }

    public int a() {
        return (this.f528673q[0] - (this.f528668i * 2)) + this.f528681y.f528698j.getPaddingLeft();
    }

    public int b() {
        return this.f528673q[1] + this.f528681y.f528698j.getPaddingTop();
    }

    public void c(int i17, int i18) {
        wl5.x xVar = this.f528681y;
        android.view.View view = xVar.f528698j;
        int[] iArr = this.f528673q;
        view.getLocationInWindow(iArr);
        boolean z17 = this.f528669m;
        wl5.w wVar = xVar.f528691c;
        int i19 = z17 ? wVar.f528684a : wVar.f528685b;
        int a17 = wl5.y.a(xVar.f528698j, i17, i18 - iArr[1], i19);
        if (a17 != i19) {
            xVar.f528706r = 0;
            xVar.k();
            boolean z18 = this.f528669m;
            if (z18) {
                if (a17 > this.f528672p) {
                    wl5.q qVar = xVar.f528688a;
                    if (qVar.f528669m) {
                        qVar = xVar.f528690b;
                    }
                    this.f528669m = !z18;
                    invalidate();
                    qVar.f528669m = !qVar.f528669m;
                    qVar.invalidate();
                    int i27 = this.f528672p;
                    this.f528671o = i27;
                    xVar.f528702n = a17 - i27 < 1;
                    xVar.l(i27, a17);
                    qVar.d();
                } else {
                    xVar.f528702n = wVar.f528685b - a17 < 1;
                    xVar.l(a17, -1);
                }
                d();
                return;
            }
            int i28 = this.f528671o;
            if (a17 < i28) {
                wl5.q qVar2 = xVar.f528688a;
                if (!qVar2.f528669m) {
                    qVar2 = xVar.f528690b;
                }
                qVar2.f528669m = !qVar2.f528669m;
                qVar2.invalidate();
                this.f528669m = !this.f528669m;
                invalidate();
                int i29 = this.f528671o;
                this.f528672p = i29;
                xVar.f528702n = i29 - a17 < 1;
                xVar.l(a17, i29);
                qVar2.d();
            } else {
                xVar.f528702n = a17 - i28 < 1;
                xVar.l(i28, a17);
            }
            d();
        }
    }

    public final void d() {
        wl5.x xVar = this.f528681y;
        xVar.f528701m = false;
        xVar.f528698j.getLocationInWindow(this.f528673q);
        android.text.TextPaint l17 = wl5.y.l(xVar.f528698j);
        if (l17 != null) {
            int i17 = (int) l17.getFontMetrics().descent;
            boolean z17 = this.f528669m;
            android.widget.PopupWindow popupWindow = this.f528663d;
            if (z17) {
                int m17 = (((int) wl5.y.m(xVar.f528698j, xVar.f528691c.f528684a)) - this.f528666g) + a();
                android.view.View view = xVar.f528698j;
                popupWindow.update(m17, wl5.y.b(view, wl5.y.d(view, xVar.f528691c.f528684a)) + i17 + b(), -1, -1);
            } else {
                int m18 = (int) wl5.y.m(xVar.f528698j, xVar.f528691c.f528685b);
                android.view.View view2 = xVar.f528698j;
                int[] e17 = e(m18, wl5.y.b(view2, wl5.y.d(view2, xVar.f528691c.f528685b)) + i17);
                popupWindow.update(e17[0] + this.f528668i + a(), e17[1] + b(), -1, -1);
            }
        }
    }

    public final int[] e(int i17, int i18) {
        int[] iArr = new int[2];
        if (i17 == 0) {
            wl5.x xVar = this.f528681y;
            if (xVar.f528691c.f528685b > 1) {
                xVar.f528698j.getLocationInWindow(this.f528673q);
                android.text.TextPaint l17 = wl5.y.l(xVar.f528698j);
                if (l17 != null) {
                    int i19 = (int) l17.getFontMetrics().descent;
                    int j17 = (int) wl5.y.j(xVar.f528698j, wl5.y.d(xVar.f528698j, xVar.f528691c.f528685b - 1));
                    android.view.View view = xVar.f528698j;
                    i18 = i19 + wl5.y.b(view, wl5.y.d(view, xVar.f528691c.f528685b - 1));
                    i17 = j17;
                }
            }
        }
        iArr[0] = i17;
        iArr[1] = i18;
        return iArr;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        int i18;
        wl5.x xVar = this.f528681y;
        if (xVar.f528699k != null) {
            int i19 = this.f528669m ? xVar.f528691c.f528684a : xVar.f528691c.f528685b;
            android.text.TextPaint l17 = wl5.y.l(xVar.f528698j);
            if (l17 != null) {
                android.view.View view = xVar.f528698j;
                i18 = wl5.y.b(view, wl5.y.d(view, i19)) + ((int) l17.getFontMetrics().descent);
                i17 = (int) wl5.y.m(xVar.f528698j, i19);
            } else {
                i17 = 0;
                i18 = 0;
            }
            android.view.View view2 = xVar.f528698j;
            int[] iArr = this.f528673q;
            view2.getLocationInWindow(iArr);
            xVar.f528698j.getLocationInWindow(iArr);
            if (!this.f528669m) {
                i18 = e(i17, i18)[1];
            }
            int b17 = i18 + b();
            android.view.View view3 = xVar.f528698j;
            android.graphics.Point point = this.f528676t;
            android.graphics.Rect rect = this.f528675s;
            if (!view3.getGlobalVisibleRect(rect, point)) {
                com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "view invisible.", new java.lang.Object[0]);
                return;
            }
            if (b17 > rect.bottom) {
                if (this.f528669m) {
                    com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "start below bottom, dismiss all.", new java.lang.Object[0]);
                    xVar.k();
                    xVar.M = true;
                    xVar.N = true;
                    xVar.i();
                    xVar.f528699k.a();
                }
                com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "cursor invisible.", new java.lang.Object[0]);
                return;
            }
            if (b17 < rect.top) {
                if (!this.f528669m) {
                    com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "end above top, dismiss all.", new java.lang.Object[0]);
                    xVar.k();
                    xVar.M = true;
                    xVar.N = true;
                    xVar.i();
                    xVar.f528699k.a();
                }
                com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "cursor invisible.", new java.lang.Object[0]);
                return;
            }
        }
        boolean z17 = this.f528669m;
        android.graphics.Paint paint = this.f528664e;
        int i27 = this.f528668i;
        int i28 = this.f528665f;
        if (z17) {
            canvas.drawCircle((i27 * 2) + i28, i28, i28, paint);
            canvas.drawRect((i27 * 2) + i28, 0.0f, (i28 * 2) + (i27 * 2), i28, paint);
        } else {
            canvas.drawCircle(i28 + i27, i28, i28, paint);
            canvas.drawRect(i27, 0.0f, i27 + i28, i28, paint);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r1 != 3) goto L56;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wl5.q.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
