package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView */
/* loaded from: classes3.dex */
public class C16553x9b9a9a23 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f230750d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f230751e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f230752f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f230753g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f230754h;

    /* renamed from: i, reason: collision with root package name */
    public long f230755i;

    /* renamed from: m, reason: collision with root package name */
    public long f230756m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f230757n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f230758o;

    /* renamed from: p, reason: collision with root package name */
    public final android.animation.ObjectAnimator f230759p;

    public C16553x9b9a9a23(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f230750d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f230757n = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t0(this);
        this.f230758o = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u0(this);
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c1u, (android.view.ViewGroup) this, true);
        this.f230751e = findViewById(com.p314xaae8f345.mm.R.id.bdq);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.cjt);
        this.f230752f = imageView;
        this.f230753g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cju);
        this.f230754h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cjq);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f, 1.0f);
        this.f230759p = ofFloat;
        ofFloat.setDuration(2000L);
        ofFloat.setInterpolator(new android.view.animation.AccelerateInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        setBackgroundColor(android.graphics.Color.argb(java.lang.Math.round(127.5f), 0, 0, 0));
        a();
        setVisibility(4);
    }

    public void a() {
        android.content.Context context = getContext();
        if (context instanceof android.app.Activity) {
            android.graphics.Rect m17 = com.p314xaae8f345.mm.ui.bk.m((android.app.Activity) context);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            if (m17 != null) {
                paddingTop += m17.top;
            }
            setPadding(paddingLeft, paddingTop, getPaddingRight(), getPaddingBottom());
        }
    }

    public void b() {
        if (this.f230756m > 0) {
            java.lang.Runnable runnable = this.f230758o;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f230750d;
            n3Var.mo50300x3fa464aa(runnable);
            n3Var.mo50300x3fa464aa(this.f230757n);
            this.f230759p.cancel();
            this.f230752f.setAlpha(1.0f);
            this.f230753g.setText(java.lang.String.format(java.util.Locale.US, "%02d:%02d", 0, 0));
            this.f230756m = 0L;
            this.f230755i = 0L;
        }
        setVisibility(4);
    }

    public void c(long j17) {
        setVisibility(0);
        this.f230755i = 0L;
        long j18 = 1000 * j17;
        this.f230756m = j18;
        java.lang.Runnable runnable = this.f230758o;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f230750d;
        n3Var.mo50300x3fa464aa(runnable);
        java.lang.Runnable runnable2 = this.f230757n;
        n3Var.mo50300x3fa464aa(runnable2);
        android.view.View view = this.f230751e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView", "switchToNormalState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView", "switchToNormalState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f230754h.setVisibility(8);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f230753g.getLayoutParams();
        layoutParams.removeRule(2);
        layoutParams.addRule(13);
        requestLayout();
        invalidate();
        this.f230759p.start();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u0) runnable).run();
        n3Var.mo50297x7c4d7ca2(runnable2, java.lang.Math.max(0L, j18 - 5000));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.lang.Runnable runnable = this.f230758o;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f230750d;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50300x3fa464aa(this.f230757n);
        this.f230759p.cancel();
    }

    public C16553x9b9a9a23(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f230750d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f230757n = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t0(this);
        this.f230758o = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u0(this);
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c1u, (android.view.ViewGroup) this, true);
        this.f230751e = findViewById(com.p314xaae8f345.mm.R.id.bdq);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.cjt);
        this.f230752f = imageView;
        this.f230753g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cju);
        this.f230754h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cjq);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f, 1.0f);
        this.f230759p = ofFloat;
        ofFloat.setDuration(2000L);
        ofFloat.setInterpolator(new android.view.animation.AccelerateInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        setBackgroundColor(android.graphics.Color.argb(java.lang.Math.round(127.5f), 0, 0, 0));
        a();
        setVisibility(4);
    }
}
