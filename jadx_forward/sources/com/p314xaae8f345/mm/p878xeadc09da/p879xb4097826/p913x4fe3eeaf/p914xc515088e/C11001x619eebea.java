package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p914xc515088e;

/* renamed from: com.tencent.mm.mj_publisher.finder.widgets.picker.MJCustomDatePicker */
/* loaded from: classes5.dex */
public class C11001x619eebea extends android.widget.FrameLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f151227t = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f151228d;

    /* renamed from: e, reason: collision with root package name */
    public final w51.g f151229e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f151230f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Date f151231g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Date f151232h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f151233i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f151234m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f151235n;

    /* renamed from: o, reason: collision with root package name */
    public int f151236o;

    /* renamed from: p, reason: collision with root package name */
    public int f151237p;

    /* renamed from: q, reason: collision with root package name */
    public int f151238q;

    /* renamed from: r, reason: collision with root package name */
    public v51.e f151239r;

    /* renamed from: s, reason: collision with root package name */
    public v51.f f151240s;

    public C11001x619eebea(android.content.Context context) {
        super(new android.view.ContextThemeWrapper(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576289ve));
        this.f151228d = null;
        this.f151233i = true;
        this.f151234m = true;
        this.f151235n = true;
        this.f151230f = context;
        this.f151229e = new w51.g(context, false);
    }

    /* renamed from: getView */
    public android.view.View m47421xfb86a31b() {
        if (this.f151228d == null) {
            this.f151228d = this.f151229e.d();
        }
        return this.f151228d;
    }

    /* renamed from: setMaxDate */
    public void m47422xe3874070(java.lang.Long l17) {
        this.f151232h = new java.util.Date(l17.longValue());
    }

    /* renamed from: setMinDate */
    public void m47423xf0a11a5e(java.lang.Long l17) {
        this.f151231g = new java.util.Date(l17.longValue());
    }

    /* renamed from: setOnTimeSelectListener */
    public void m47424x57fdf1be(v51.f fVar) {
        this.f151240s = fVar;
    }

    /* renamed from: setTimeSelectChangeListener */
    public void m47425xb2c39d8f(v51.e eVar) {
        this.f151239r = eVar;
    }

    public C11001x619eebea(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(new android.view.ContextThemeWrapper(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576289ve), attributeSet);
        this.f151228d = null;
        this.f151233i = true;
        this.f151234m = true;
        this.f151235n = true;
        this.f151230f = context;
        this.f151229e = new w51.g(context, false);
    }

    public C11001x619eebea(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f151228d = null;
        this.f151233i = true;
        this.f151234m = true;
        this.f151235n = true;
        this.f151230f = context;
        this.f151229e = new w51.g(context, false);
    }
}
