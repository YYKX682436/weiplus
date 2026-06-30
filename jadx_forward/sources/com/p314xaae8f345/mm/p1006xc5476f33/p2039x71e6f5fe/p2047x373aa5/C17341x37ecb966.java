package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* renamed from: com.tencent.mm.plugin.scanner.view.CardHighLightEdgeView */
/* loaded from: classes13.dex */
public class C17341x37ecb966 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public boolean[] f241394d;

    /* renamed from: e, reason: collision with root package name */
    public boolean[] f241395e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Rect f241396f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f241397g;

    /* renamed from: h, reason: collision with root package name */
    public int f241398h;

    /* renamed from: i, reason: collision with root package name */
    public long f241399i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f241400m;

    public C17341x37ecb966(android.content.Context context) {
        super(context);
        this.f241394d = new boolean[4];
        this.f241395e = new boolean[4];
        this.f241400m = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.a(this);
        a();
    }

    public final void a() {
        this.f241398h = bp.b.m10969xb866ec1c(getResources(), com.p314xaae8f345.mm.R.C30861xcebc809e.ceu, null).getWidth() / 4;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f241397g = paint;
        paint.setColor(508256);
        this.f241397g.setAlpha(255);
        this.f241397g.setStrokeWidth(this.f241398h);
        this.f241397g.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Rect rect = this.f241396f;
        if (rect != null) {
            if (this.f241394d[0]) {
                int i17 = rect.left;
                int i18 = this.f241398h;
                canvas.drawLine((i18 / 2) + i17, rect.top, i17 + (i18 / 2), rect.bottom, this.f241397g);
            }
            if (this.f241394d[1]) {
                int i19 = this.f241396f.right;
                int i27 = this.f241398h;
                canvas.drawLine(i19 - (i27 / 2), r0.top, i19 - (i27 / 2), r0.bottom, this.f241397g);
            }
            if (this.f241394d[2]) {
                android.graphics.Rect rect2 = this.f241396f;
                float f17 = rect2.left;
                int i28 = rect2.top;
                int i29 = this.f241398h;
                canvas.drawLine(f17, (i29 / 2) + i28, rect2.right, i28 + (i29 / 2), this.f241397g);
            }
            if (this.f241394d[3]) {
                android.graphics.Rect rect3 = this.f241396f;
                float f18 = rect3.left;
                int i37 = rect3.bottom;
                int i38 = this.f241398h;
                canvas.drawLine(f18, i37 - (i38 / 2), rect3.right, i37 - (i38 / 2), this.f241397g);
            }
        }
    }

    /* renamed from: setCardRect */
    public void m68902x7613df96(android.graphics.Rect rect) {
        this.f241396f = new android.graphics.Rect(rect);
    }

    /* renamed from: setHighLightEdges */
    public void m68903x4ab5af24(boolean[] zArr) {
        if (zArr.length == 4) {
            boolean z17 = false;
            boolean z18 = zArr[0];
            boolean z19 = zArr[1];
            boolean z27 = zArr[2];
            boolean z28 = zArr[3];
            int i17 = 0;
            while (true) {
                if (i17 >= 4) {
                    z17 = true;
                    break;
                } else if (this.f241394d[i17]) {
                    break;
                } else {
                    i17++;
                }
            }
            long currentTimeMillis = !z17 ? 600 - (java.lang.System.currentTimeMillis() - this.f241399i) : 0L;
            this.f241395e = java.util.Arrays.copyOf(zArr, 4);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f241400m;
            n3Var.mo50303x856b99f0(1);
            n3Var.mo50307xb9e94560(1, currentTimeMillis > 0 ? currentTimeMillis : 0L);
        }
    }

    public C17341x37ecb966(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f241394d = new boolean[4];
        this.f241395e = new boolean[4];
        this.f241400m = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.a(this);
        a();
    }

    public C17341x37ecb966(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f241394d = new boolean[4];
        this.f241395e = new boolean[4];
        this.f241400m = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.a(this);
        a();
    }
}
