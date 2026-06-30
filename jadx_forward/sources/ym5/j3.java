package ym5;

/* loaded from: classes15.dex */
public class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f544926d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.OverScroller f544927e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.OverScroller f544928f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.Scroller f544929g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.Scroller f544930h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.Scroller f544931i;

    /* renamed from: m, reason: collision with root package name */
    public ym5.d3 f544932m;

    /* renamed from: n, reason: collision with root package name */
    public int f544933n;

    /* renamed from: o, reason: collision with root package name */
    public int f544934o;

    /* renamed from: p, reason: collision with root package name */
    public int f544935p;

    /* renamed from: q, reason: collision with root package name */
    public int f544936q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.RectF f544937r = new android.graphics.RectF();

    /* renamed from: s, reason: collision with root package name */
    public final ym5.f3 f544938s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 f544939t;

    public j3(com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7) {
        this.f544939t = c22796x44e7a3d7;
        ym5.f3 f3Var = new ym5.f3(c22796x44e7a3d7, null);
        this.f544938s = f3Var;
        android.content.Context context = c22796x44e7a3d7.getContext();
        this.f544927e = new android.widget.OverScroller(context, f3Var);
        this.f544929g = new android.widget.Scroller(context, f3Var);
        this.f544928f = new android.widget.OverScroller(context, f3Var);
        this.f544930h = new android.widget.Scroller(context, f3Var);
        this.f544931i = new android.widget.Scroller(context, f3Var);
    }

    public final void a() {
        com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7 = this.f544939t;
        c22796x44e7a3d7.f294920o.reset();
        android.graphics.Matrix matrix = c22796x44e7a3d7.f294920o;
        android.graphics.RectF rectF = c22796x44e7a3d7.K;
        matrix.postTranslate(-rectF.left, -rectF.top);
        android.graphics.Matrix matrix2 = c22796x44e7a3d7.f294920o;
        android.graphics.PointF pointF = c22796x44e7a3d7.R;
        matrix2.postTranslate(pointF.x, pointF.y);
        c22796x44e7a3d7.f294920o.postTranslate(-c22796x44e7a3d7.H, -c22796x44e7a3d7.I);
        android.graphics.Matrix matrix3 = c22796x44e7a3d7.f294920o;
        float f17 = c22796x44e7a3d7.D;
        android.graphics.PointF pointF2 = c22796x44e7a3d7.R;
        matrix3.postRotate(f17, pointF2.x, pointF2.y);
        android.graphics.Matrix matrix4 = c22796x44e7a3d7.f294920o;
        float f18 = c22796x44e7a3d7.E;
        android.graphics.PointF pointF3 = c22796x44e7a3d7.Q;
        matrix4.postScale(f18, f18, pointF3.x, pointF3.y);
        c22796x44e7a3d7.f294920o.postTranslate(c22796x44e7a3d7.F, c22796x44e7a3d7.G);
        c22796x44e7a3d7.u();
    }

    public void b() {
        this.f544939t.removeCallbacks(this);
        this.f544927e.abortAnimation();
        this.f544929g.abortAnimation();
        this.f544928f.abortAnimation();
        this.f544931i.abortAnimation();
        this.f544926d = false;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        boolean computeScrollOffset = this.f544929g.computeScrollOffset();
        boolean z18 = false;
        com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7 = this.f544939t;
        boolean z19 = true;
        if (computeScrollOffset) {
            c22796x44e7a3d7.E = r0.getCurrX() / 10000.0f;
            z17 = false;
        } else {
            z17 = true;
        }
        android.widget.OverScroller overScroller = this.f544927e;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX() - this.f544935p;
            int currY = overScroller.getCurrY() - this.f544936q;
            c22796x44e7a3d7.F += currX;
            c22796x44e7a3d7.G += currY;
            this.f544935p = overScroller.getCurrX();
            this.f544936q = overScroller.getCurrY();
            z17 = false;
        }
        android.widget.OverScroller overScroller2 = this.f544928f;
        if (overScroller2.computeScrollOffset()) {
            int currX2 = overScroller2.getCurrX() - this.f544933n;
            int currY2 = overScroller2.getCurrY() - this.f544934o;
            this.f544933n = overScroller2.getCurrX();
            this.f544934o = overScroller2.getCurrY();
            c22796x44e7a3d7.F += currX2;
            c22796x44e7a3d7.G += currY2;
            z17 = false;
        }
        if (this.f544931i.computeScrollOffset()) {
            c22796x44e7a3d7.D = r1.getCurrX();
            z17 = false;
        }
        if (this.f544930h.computeScrollOffset() || c22796x44e7a3d7.T != null) {
            float currX3 = r1.getCurrX() / 10000.0f;
            float currY3 = r1.getCurrY() / 10000.0f;
            android.graphics.Matrix matrix = c22796x44e7a3d7.f294924q;
            android.graphics.RectF rectF = c22796x44e7a3d7.L;
            matrix.setScale(currX3, currY3, (rectF.left + rectF.right) / 2.0f, this.f544932m.a());
            android.graphics.Matrix matrix2 = c22796x44e7a3d7.f294924q;
            android.graphics.RectF rectF2 = this.f544937r;
            matrix2.mapRect(rectF2, c22796x44e7a3d7.L);
            if (currX3 == 1.0f) {
                android.graphics.RectF rectF3 = c22796x44e7a3d7.f294912J;
                rectF2.left = rectF3.left;
                rectF2.right = rectF3.right;
            }
            if (currY3 == 1.0f) {
                android.graphics.RectF rectF4 = c22796x44e7a3d7.f294912J;
                rectF2.top = rectF4.top;
                rectF2.bottom = rectF4.bottom;
            }
            c22796x44e7a3d7.T = rectF2;
        }
        if (!z17) {
            a();
            if (this.f544926d) {
                c22796x44e7a3d7.post(this);
                return;
            }
            return;
        }
        this.f544926d = false;
        if (c22796x44e7a3d7.B) {
            android.graphics.RectF rectF5 = c22796x44e7a3d7.L;
            float f17 = rectF5.left;
            if (f17 > 0.0f) {
                c22796x44e7a3d7.F = (int) (c22796x44e7a3d7.F - f17);
            } else if (rectF5.right < c22796x44e7a3d7.f294912J.width()) {
                c22796x44e7a3d7.F -= (int) (c22796x44e7a3d7.f294912J.width() - c22796x44e7a3d7.L.right);
            }
            z18 = true;
        }
        if (c22796x44e7a3d7.C) {
            android.graphics.RectF rectF6 = c22796x44e7a3d7.L;
            float f18 = rectF6.top;
            if (f18 > 0.0f) {
                c22796x44e7a3d7.G = (int) (c22796x44e7a3d7.G - f18);
            } else if (rectF6.bottom < c22796x44e7a3d7.f294912J.height()) {
                c22796x44e7a3d7.G -= (int) (c22796x44e7a3d7.f294912J.height() - c22796x44e7a3d7.L.bottom);
            }
        } else {
            z19 = z18;
        }
        if (z19) {
            a();
        }
        c22796x44e7a3d7.invalidate();
        if (c22796x44e7a3d7.W != null) {
            c22796x44e7a3d7.post(new ym5.i3(this));
        }
    }
}
