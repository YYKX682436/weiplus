package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView */
/* loaded from: classes8.dex */
public class C13241xdbd8cf0 extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f178895o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f178896d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f178897e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f178898f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f178899g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f178900h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f178901i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f178902m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r f178903n;

    public C13241xdbd8cf0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f178901i = true;
        this.f178902m = false;
        this.f178903n = new r02.d(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178867c.add(this.f178903n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178867c.remove(this.f178903n);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a3q, (android.view.ViewGroup) this, true);
        this.f178896d = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.bsd);
        this.f178897e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bsc);
        this.f178896d.setOnClickListener(new r02.e(this));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.ct7);
        this.f178898f = linearLayout;
        linearLayout.setOnClickListener(new r02.f(this));
        this.f178898f.setClickable(false);
        this.f178899g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565572ct2);
        this.f178900h = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ct9);
    }
}
