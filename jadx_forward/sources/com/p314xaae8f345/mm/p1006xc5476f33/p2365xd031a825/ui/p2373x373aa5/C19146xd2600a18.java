package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView */
/* loaded from: classes9.dex */
public class C19146xd2600a18 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f262235d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f262236e;

    /* renamed from: f, reason: collision with root package name */
    public q35.d f262237f;

    /* renamed from: g, reason: collision with root package name */
    public long f262238g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f262239h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f262240i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f262241m;

    /* renamed from: n, reason: collision with root package name */
    public int f262242n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f262243o;

    /* renamed from: p, reason: collision with root package name */
    public int f262244p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.ValueAnimator f262245q;

    /* renamed from: r, reason: collision with root package name */
    public gt4.x f262246r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f262247s;

    public C19146xd2600a18(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f262239h = false;
        this.f262240i = false;
        this.f262242n = 0;
        this.f262244p = 0;
        this.f262247s = new gt4.t(this);
        c();
    }

    public void a() {
        q35.d dVar = this.f262237f;
        if (dVar != null) {
            dVar.b();
            this.f262237f = null;
        }
        this.f262240i = false;
        this.f262239h = false;
        android.animation.ValueAnimator valueAnimator = this.f262245q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f262235d.setRotation(0.0f);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262241m)) {
            this.f262236e.setText(getResources().getText(com.p314xaae8f345.mm.R.C30867xcad56011.kzw));
        } else {
            this.f262236e.setText(this.f262241m);
        }
        int i17 = this.f262242n;
        if (i17 != 0) {
            this.f262236e.setTextColor(i17);
        } else {
            this.f262236e.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f262247s);
    }

    public final void b() {
        android.animation.ValueAnimator valueAnimator = this.f262245q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(-30.0f, 30.0f);
        this.f262245q = ofFloat;
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f262245q.setRepeatMode(2);
        this.f262245q.setRepeatCount(-1);
        this.f262245q.setDuration(300L);
        this.f262245q.addUpdateListener(new gt4.w(this));
        this.f262245q.start();
    }

    public final void c() {
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571143d55, this);
        findViewById(com.p314xaae8f345.mm.R.id.aai).setBackground(getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f81358x29318030));
        this.f262235d = findViewById(com.p314xaae8f345.mm.R.id.mqq);
        this.f262236e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mqp);
    }

    /* renamed from: setAfterHintWording */
    public void m73919x8d23d17(java.lang.String str) {
        this.f262243o = str;
    }

    /* renamed from: setAfterHintWordingColor */
    public void m73920xed2f988c(int i17) {
        this.f262244p = i17;
    }

    /* renamed from: setShakeHintWording */
    public void m73921x86175ad(java.lang.String str) {
        this.f262241m = str;
        this.f262236e.setText(str);
    }

    /* renamed from: setShakeHintWordingColor */
    public void m73922xde5a4db6(int i17) {
        this.f262242n = i17;
        this.f262236e.setTextColor(i17);
    }

    /* renamed from: setShakeOrClickCallback */
    public void m73923x6af7f466(gt4.x xVar) {
        this.f262246r = xVar;
    }

    public C19146xd2600a18(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f262239h = false;
        this.f262240i = false;
        this.f262242n = 0;
        this.f262244p = 0;
        this.f262247s = new gt4.t(this);
        c();
    }
}
