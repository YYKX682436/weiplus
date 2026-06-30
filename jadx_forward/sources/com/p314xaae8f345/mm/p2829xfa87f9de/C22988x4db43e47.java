package com.p314xaae8f345.mm.p2829xfa87f9de;

/* renamed from: com.tencent.mm.xwebutil.XWebAudioPlayerProgressBall */
/* loaded from: classes13.dex */
public class C22988x4db43e47 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f296350d;

    /* renamed from: e, reason: collision with root package name */
    public float f296351e;

    /* renamed from: f, reason: collision with root package name */
    public float f296352f;

    /* renamed from: g, reason: collision with root package name */
    public float f296353g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f296354h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f296355i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f296356m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2829xfa87f9de.y f296357n;

    public C22988x4db43e47(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        this.f296350d = 0;
        this.f296351e = 0.0f;
        this.f296352f = 0.0f;
        this.f296353g = 0.0f;
        this.f296354h = false;
        this.f296355i = new int[2];
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f296356m = paint;
        this.f296357n = null;
        android.content.Context context2 = getContext();
        int i17 = 8;
        if (context2 != null && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            i17 = (int) android.util.TypedValue.applyDimension(1, 8, displayMetrics);
        }
        this.f296352f = i17;
        paint.setAntiAlias(true);
        paint.setColor(-1);
    }

    public boolean a(float f17, boolean z17) {
        com.p314xaae8f345.mm.p2829xfa87f9de.y yVar;
        long width = this.f296350d - getWidth();
        if (width <= 0) {
            return false;
        }
        if (this.f296354h && !z17) {
            return false;
        }
        if (f17 < 0.0f) {
            this.f296351e = 0.0f;
        } else if (f17 > 1.0f) {
            this.f296351e = 1.0f;
        } else {
            this.f296351e = f17;
        }
        setTranslationX(this.f296351e * ((float) width));
        if (!z17 || (yVar = this.f296357n) == null) {
            return true;
        }
        com.p314xaae8f345.mm.p2829xfa87f9de.C22987x97ad1828 c22987x97ad1828 = (com.p314xaae8f345.mm.p2829xfa87f9de.C22987x97ad1828) yVar;
        c22987x97ad1828.f296343f.setText(c22987x97ad1828.a(this.f296351e * ((float) c22987x97ad1828.f296342e)));
        return true;
    }

    /* renamed from: getTotalLength */
    public int m83869xa137c614() {
        return this.f296350d;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.f296352f, this.f296356m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r0 != 6) goto L40;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2829xfa87f9de.C22988x4db43e47.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setOperationCallback */
    public void m83870x695f968a(com.p314xaae8f345.mm.p2829xfa87f9de.y yVar) {
        this.f296357n = yVar;
    }

    /* renamed from: setTotalLength */
    public void m83871x379d3988(int i17) {
        if (this.f296350d != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerProgressBall", "setTotalLength " + i17);
            this.f296350d = i17;
            a(this.f296351e, false);
        }
    }

    public C22988x4db43e47(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        this.f296350d = 0;
        this.f296351e = 0.0f;
        this.f296352f = 0.0f;
        this.f296353g = 0.0f;
        this.f296354h = false;
        this.f296355i = new int[2];
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f296356m = paint;
        this.f296357n = null;
        android.content.Context context2 = getContext();
        int i18 = 8;
        if (context2 != null && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            i18 = (int) android.util.TypedValue.applyDimension(1, 8, displayMetrics);
        }
        this.f296352f = i18;
        paint.setAntiAlias(true);
        paint.setColor(-1);
    }
}
