package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeScrollbar */
/* loaded from: classes5.dex */
public class C16132x1cb7ea88 extends android.view.View {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f224099r = {p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, "B", "C", "D", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3048xa13f9cad, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3025x7c20d01a, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "U", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2967xc3bba14a, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3049xa147da5f, "X", "Y", "Z"};

    /* renamed from: d, reason: collision with root package name */
    public float f224100d;

    /* renamed from: e, reason: collision with root package name */
    public int f224101e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String[] f224102f;

    /* renamed from: g, reason: collision with root package name */
    public int f224103g;

    /* renamed from: h, reason: collision with root package name */
    public float f224104h;

    /* renamed from: i, reason: collision with root package name */
    public float f224105i;

    /* renamed from: m, reason: collision with root package name */
    public float f224106m;

    /* renamed from: n, reason: collision with root package name */
    public db5.d5 f224107n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f224108o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j1 f224109p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Paint f224110q;

    public C16132x1cb7ea88(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f224105i = 0.0f;
        this.f224102f = new java.lang.String[]{"↑"};
        this.f224100d = 1.3f;
        this.f224101e = 79;
        setFocusable(true);
        setFocusableInTouchMode(true);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 3.0f);
        android.view.View inflate = android.view.View.inflate(context, m65176x34508176(), null);
        int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, this.f224101e);
        this.f224107n = new db5.d5(inflate, d17, d17);
        this.f224108o = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mvd);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f224110q = paint;
        paint.setAntiAlias(true);
        this.f224110q.setColor(-11119018);
        this.f224110q.setTextAlign(android.graphics.Paint.Align.CENTER);
    }

    /* renamed from: getToastLayoutId */
    public int m65176x34508176() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cna;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f17 = measuredHeight;
        this.f224104h = f17 / (this.f224102f.length * this.f224100d);
        float dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
        if (this.f224104h > dimensionPixelSize) {
            this.f224104h = dimensionPixelSize;
        }
        this.f224110q.setTextSize(this.f224104h);
        float f18 = this.f224105i;
        float f19 = this.f224104h;
        if (f18 != f19) {
            this.f224105i = f19;
            post(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i1(this, measuredWidth, measuredHeight));
        }
        float f27 = this.f224104h;
        int i17 = 0;
        if (f27 == dimensionPixelSize) {
            float length = (f17 - ((this.f224102f.length * f27) * this.f224100d)) / 2.0f;
            while (true) {
                java.lang.String[] strArr = this.f224102f;
                if (i17 >= strArr.length) {
                    return;
                }
                float f28 = this.f224104h;
                canvas.drawText(strArr[i17], measuredWidth / 2.0f, length + f28 + (i17 * f28 * this.f224100d), this.f224110q);
                i17++;
            }
        } else {
            while (true) {
                java.lang.String[] strArr2 = this.f224102f;
                if (i17 >= strArr2.length) {
                    return;
                }
                float f29 = this.f224104h;
                canvas.drawText(strArr2[i17], measuredWidth / 2.0f, f29 + (i17 * f29 * this.f224100d), this.f224110q);
                i17++;
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            float y17 = motionEvent.getY();
            this.f224106m = y17;
            if (y17 < 0.0f) {
                this.f224106m = 0.0f;
            }
            if (this.f224106m > getMeasuredHeight()) {
                this.f224106m = getMeasuredHeight();
            }
            setBackgroundDrawable(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.aye));
            float f17 = this.f224106m;
            float f18 = this.f224104h * this.f224100d;
            float measuredHeight = getMeasuredHeight();
            java.lang.String[] strArr = this.f224102f;
            int length = (int) ((f17 - ((measuredHeight - (strArr.length * f18)) / 2.0f)) / f18);
            if (length < 0) {
                length = 0;
            }
            if (length >= strArr.length) {
                length = strArr.length - 1;
            }
            this.f224103g = length;
            if (length == -1) {
                this.f224108o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ibx);
            } else {
                this.f224108o.setText(strArr[length]);
            }
            this.f224107n.showAtLocation(this, 17, 0, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j1 j1Var = this.f224109p;
            if (j1Var != null) {
                int i17 = this.f224103g;
                if (i17 == -1) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m1) j1Var).a(i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.ibx));
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m1) j1Var).a(this.f224102f[i17]);
                }
            }
            invalidate();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            setBackgroundResource(0);
            this.f224107n.dismiss();
        }
        return true;
    }

    /* renamed from: setOnScrollBarTouchListener */
    public void m65177x40d747ee(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j1 j1Var) {
        this.f224109p = j1Var;
    }
}
