package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMProgressBar */
/* loaded from: classes11.dex */
public class C21509xb4b2d0e6 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f279051d;

    /* renamed from: e, reason: collision with root package name */
    public int f279052e;

    /* renamed from: f, reason: collision with root package name */
    public int f279053f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f279054g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f279055h;

    /* renamed from: i, reason: collision with root package name */
    public db5.f5 f279056i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f279057m;

    public C21509xb4b2d0e6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279051d = 100;
        this.f279052e = 0;
        this.f279053f = 0;
        this.f279057m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new db5.e5(this), false);
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.c19, this);
        this.f279054g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jm8);
        this.f279055h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jm9);
    }

    public static void a(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21509xb4b2d0e6 c21509xb4b2d0e6, int i17) {
        c21509xb4b2d0e6.f279054g.setWidth(c21509xb4b2d0e6.m79065x70bea069());
        db5.f5 f5Var = c21509xb4b2d0e6.f279056i;
        if (f5Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18771x75e3b580 activityC18771x75e3b580 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.s) f5Var).f256869a;
            if (i17 < 5) {
                activityC18771x75e3b580.f256848h.setText(activityC18771x75e3b580.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bb_));
            } else if (i17 < 5 || i17 >= 95) {
                activityC18771x75e3b580.f256848h.setText(activityC18771x75e3b580.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k49));
            } else {
                activityC18771x75e3b580.f256848h.setText(activityC18771x75e3b580.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573777fs0));
            }
        }
    }

    /* renamed from: getProgressLength */
    private int m79065x70bea069() {
        int width = (getWidth() * this.f279052e) / this.f279051d;
        return width < com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 20.0f) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 20.0f) : width;
    }

    /* renamed from: getMax */
    public int m79066xb588562e() {
        return this.f279051d;
    }

    /* renamed from: getProgress */
    public int m79067x402effa3() {
        return this.f279053f;
    }

    /* renamed from: setAutoProgress */
    public void m79068x5133727e(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f279057m;
        if (z17) {
            b4Var.c(40L, 40L);
        } else {
            b4Var.d();
        }
    }

    /* renamed from: setMax */
    public void m79069xca027da2(int i17) {
        this.f279051d = i17;
    }

    /* renamed from: setOnProgressChangedListener */
    public void m79070xa4ffe27a(db5.f5 f5Var) {
        this.f279056i = f5Var;
    }

    /* renamed from: setProgress */
    public void m79071x3ae760af(int i17) {
        int i18 = this.f279051d;
        if (i17 > i18) {
            i17 = i18;
        }
        this.f279053f = i17;
        if (this.f279057m.e()) {
            m79068x5133727e(true);
        }
    }

    /* renamed from: setTips */
    public void m79072x765082ba(java.lang.CharSequence charSequence) {
        this.f279055h.setText(charSequence);
    }
}
