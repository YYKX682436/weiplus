package nl5;

/* loaded from: classes15.dex */
public final class c extends android.view.View {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f419781v = 0;

    /* renamed from: d, reason: collision with root package name */
    public final nl5.s0 f419782d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f419783e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.PopupWindow f419784f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f419785g;

    /* renamed from: h, reason: collision with root package name */
    public final int f419786h;

    /* renamed from: i, reason: collision with root package name */
    public final int f419787i;

    /* renamed from: m, reason: collision with root package name */
    public final int f419788m;

    /* renamed from: n, reason: collision with root package name */
    public final int f419789n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f419790o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f419791p;

    /* renamed from: q, reason: collision with root package name */
    public int f419792q;

    /* renamed from: r, reason: collision with root package name */
    public int f419793r;

    /* renamed from: s, reason: collision with root package name */
    public int f419794s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f419795t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f419796u;

    static {
        new nl5.a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(nl5.s0 selectableEditTextHelper, boolean z17) {
        super(selectableEditTextHelper.f419889g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectableEditTextHelper, "selectableEditTextHelper");
        this.f419782d = selectableEditTextHelper;
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(this);
        this.f419784f = popupWindow;
        this.f419789n = 25;
        this.f419791p = jz5.h.b(new nl5.b(this));
        this.f419795t = new int[2];
        this.f419796u = new int[2];
        this.f419783e = z17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f419785g = paint;
        paint.setColor(selectableEditTextHelper.f419903u);
        int i17 = selectableEditTextHelper.f419904v / 2;
        this.f419786h = i17;
        int i18 = i17 * 2;
        this.f419787i = i18;
        int i19 = i17 * 2;
        this.f419788m = i19;
        popupWindow.setClippingEnabled(false);
        popupWindow.setWidth(i18 + (25 * 2));
        popupWindow.setHeight(i19 + (25 / 2));
        invalidate();
    }

    /* renamed from: getMTextMagnifierHelper */
    private final xl5.c m149733x8015eb28() {
        return (xl5.c) ((jz5.n) this.f419791p).mo141623x754a37bb();
    }

    public final int a(int i17, android.text.Layout layout) {
        int lineBottom = layout.getLineBottom(layout.getLineForOffset(i17)) + m149735x1842113f();
        int[] iArr = this.f419796u;
        int i18 = iArr[1];
        nl5.s0 s0Var = this.f419782d;
        int height = (i18 + s0Var.f419890h.getHeight()) - s0Var.f419890h.getPaddingBottom();
        if (lineBottom > height) {
            lineBottom = height;
        }
        int i19 = iArr[1];
        return lineBottom < i19 ? i19 : lineBottom;
    }

    public final void b(int i17, int i18) {
        nl5.s0 s0Var = this.f419782d;
        android.widget.TextView textView = s0Var.f419890h;
        int[] iArr = this.f419796u;
        textView.getLocationInWindow(iArr);
        int m149734x1842113e = (i17 - (this.f419783e ? this.f419787i : 0)) + m149734x1842113e();
        int m149735x1842113f = i18 + m149735x1842113f();
        int i19 = iArr[1];
        if (m149735x1842113f >= i19 && m149735x1842113f <= ((i19 + s0Var.f419890h.getHeight()) - s0Var.f419890h.getPaddingBottom()) + com.p314xaae8f345.mm.ui.zk.a(s0Var.f419889g, 5)) {
            c(m149734x1842113e, m149735x1842113f);
        }
    }

    public final void c(int i17, int i18) {
        android.widget.PopupWindow popupWindow = this.f419784f;
        try {
            if (popupWindow.isShowing()) {
                popupWindow.update(i17, i18, -1, -1);
            } else {
                popupWindow.showAtLocation(this.f419782d.f419890h, 0, i17, i18);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.ui.yk.b("SelectableEditTextHelper", "cursor error!: %s.", e17.getMessage());
        }
    }

    public final void d() {
        nl5.s0 s0Var = this.f419782d;
        s0Var.f419890h.getLocationInWindow(this.f419796u);
        android.text.Layout layout = s0Var.f419890h.getLayout();
        if (this.f419783e) {
            int i17 = s0Var.f419888f.f419778a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(layout);
            c((((int) layout.getPrimaryHorizontal(s0Var.f419888f.f419778a)) - this.f419787i) + m149734x1842113e(), a(i17, layout));
            return;
        }
        int i18 = s0Var.f419888f.f419779b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(layout);
        c(((int) layout.getPrimaryHorizontal(s0Var.f419888f.f419779b)) + m149734x1842113e(), a(i18, layout));
    }

    /* renamed from: getExtraX */
    public final int m149734x1842113e() {
        return (this.f419796u[0] - this.f419789n) + this.f419782d.f419890h.getPaddingLeft();
    }

    /* renamed from: getExtraY */
    public final int m149735x1842113f() {
        int i17 = this.f419796u[1];
        nl5.s0 s0Var = this.f419782d;
        return (i17 + s0Var.f419890h.getPaddingTop()) - s0Var.f419890h.getScrollY();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int i17 = this.f419786h;
        int i18 = this.f419789n;
        android.graphics.Paint paint = this.f419785g;
        canvas.drawCircle(i17 + i18, i17, i17, paint);
        if (this.f419783e) {
            canvas.drawRect(i17 + i18, 0.0f, (i17 * 2) + i18, i17, paint);
        } else {
            canvas.drawRect(i18, 0.0f, i18 + i17, i17, paint);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r1 != 3) goto L70;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nl5.c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setLeft */
    public final void m149736x764ccf89(boolean z17) {
        this.f419783e = z17;
    }

    /* renamed from: setMoving */
    public final void m149737x189fff50(boolean z17) {
        this.f419790o = z17;
    }
}
