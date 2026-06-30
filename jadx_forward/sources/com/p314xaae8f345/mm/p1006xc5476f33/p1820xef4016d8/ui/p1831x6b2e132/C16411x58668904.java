package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout */
/* loaded from: classes12.dex */
public class C16411x58668904 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f229137d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jp f229138e;

    /* renamed from: f, reason: collision with root package name */
    public tl.d f229139f;

    /* renamed from: g, reason: collision with root package name */
    public f25.m0 f229140g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f229141h;

    /* renamed from: i, reason: collision with root package name */
    public long f229142i;

    /* renamed from: m, reason: collision with root package name */
    public long f229143m;

    /* renamed from: n, reason: collision with root package name */
    public int f229144n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f229145o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.e1 f229146p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnTouchListener f229147q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f229148r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f229149s;

    public C16411x58668904(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f229139f = null;
        this.f229141h = "";
        this.f229144n = 1;
        this.f229145o = new gc3.f(this);
        this.f229146p = new gc3.g(this);
        this.f229147q = new gc3.h(this);
        this.f229148r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new gc3.l(this), true);
        this.f229149s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new gc3.m(this), true);
        a(context);
    }

    public void a(android.content.Context context) {
        android.view.View findViewById = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bv_, this).findViewById(com.p314xaae8f345.mm.R.id.f569152p73);
        this.f229137d = findViewById;
        findViewById.setLayerType(1, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jp jpVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jp(context);
        this.f229138e = jpVar;
        this.f229137d.setBackground(jpVar);
        this.f229137d.setEnabled(true);
        this.f229137d.setOnTouchListener(this.f229147q);
        this.f229137d.setOnLongClickListener(this.f229145o);
    }

    public final void b(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: getUseTime */
    public long m66249x34faacbe() {
        return this.f229143m;
    }

    public C16411x58668904(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f229139f = null;
        this.f229141h = "";
        this.f229144n = 1;
        this.f229145o = new gc3.f(this);
        this.f229146p = new gc3.g(this);
        this.f229147q = new gc3.h(this);
        this.f229148r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new gc3.l(this), true);
        this.f229149s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new gc3.m(this), true);
        a(context);
    }
}
