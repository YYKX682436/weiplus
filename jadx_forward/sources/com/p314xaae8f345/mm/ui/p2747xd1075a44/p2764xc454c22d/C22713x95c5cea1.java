package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d;

/* renamed from: com.tencent.mm.ui.widget.progress.RoundProgressBtn */
/* loaded from: classes4.dex */
public class C22713x95c5cea1 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f293926d;

    /* renamed from: e, reason: collision with root package name */
    public int f293927e;

    /* renamed from: f, reason: collision with root package name */
    public float f293928f;

    /* renamed from: g, reason: collision with root package name */
    public int f293929g;

    /* renamed from: h, reason: collision with root package name */
    public float f293930h;

    /* renamed from: i, reason: collision with root package name */
    public int f293931i;

    /* renamed from: m, reason: collision with root package name */
    public int f293932m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f293933n;

    /* renamed from: o, reason: collision with root package name */
    public int f293934o;

    /* renamed from: p, reason: collision with root package name */
    public int f293935p;

    /* renamed from: q, reason: collision with root package name */
    public int f293936q;

    public C22713x95c5cea1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f293935p = 0;
        this.f293936q = 0;
        com.p314xaae8f345.mm.ui.zk.e(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        a(context, attributeSet, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this.f293926d = new android.graphics.Paint();
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544646t, i17, 0);
            this.f293927e = obtainStyledAttributes.getColor(5, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a3d));
            this.f293928f = obtainStyledAttributes.getDimension(6, 0.0f);
            this.f293929g = obtainStyledAttributes.getColor(3, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq));
            this.f293930h = obtainStyledAttributes.getDimension(4, this.f293928f);
            this.f293931i = obtainStyledAttributes.getInt(1, 100);
            this.f293934o = obtainStyledAttributes.getInt(2, 0);
            this.f293932m = obtainStyledAttributes.getInt(7, -90);
            this.f293933n = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: getProgress */
    public int m82111x402effa3() {
        return this.f293934o;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        if (this.f293928f == 0.0f) {
            this.f293928f = (int) ((getWidth() / 2) * 0.167d);
        }
        float f17 = this.f293928f;
        this.f293930h = f17;
        this.f293935p = (int) f17;
        float f18 = width;
        this.f293936q = (int) (0.667f * f18);
        int i17 = (int) (f18 - (f17 / 2.0f));
        this.f293926d.setStrokeWidth(f17);
        this.f293926d.setColor(this.f293927e);
        this.f293926d.setAntiAlias(true);
        this.f293926d.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawCircle(f18, f18, i17, this.f293926d);
        this.f293926d.setStrokeWidth(this.f293930h);
        this.f293926d.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f293926d.setColor(this.f293929g);
        float f19 = width - i17;
        float f27 = i17 + width;
        canvas.drawArc(new android.graphics.RectF(f19, f19, f27, f27), this.f293932m, (this.f293934o * com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) / this.f293931i, false, this.f293926d);
        this.f293926d.setStrokeWidth(0.0f);
        this.f293926d.setStyle(android.graphics.Paint.Style.FILL);
        if (this.f293933n) {
            float f28 = this.f293928f;
            int i18 = this.f293936q;
            canvas.drawRect(f18 - (f28 * 1.5f), width - (i18 / 2), f18 - (f28 * 0.5f), (i18 / 2) + width, this.f293926d);
            int i19 = this.f293935p;
            int i27 = this.f293936q;
            canvas.drawRect(f18 + (i19 * 0.5f), width - (i27 / 2), f18 + (i19 * 1.5f), width + (i27 / 2), this.f293926d);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(((this.f293934o * 100) / this.f293931i) + "%");
    }

    /* renamed from: setHasPause */
    public void m82112x7e1bd1fe(boolean z17) {
        this.f293933n = z17;
        invalidate();
    }

    /* renamed from: setProgress */
    public void m82113x3ae760af(int i17) {
        this.f293934o = java.lang.Math.max(0, i17);
        this.f293934o = java.lang.Math.min(i17, this.f293931i);
        invalidate();
    }

    /* renamed from: setProgressColor */
    public void m82114x7d38f3f4(int i17) {
        this.f293929g = i17;
    }

    public C22713x95c5cea1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f293935p = 0;
        this.f293936q = 0;
        com.p314xaae8f345.mm.ui.zk.e(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        a(context, attributeSet, i17);
    }
}
