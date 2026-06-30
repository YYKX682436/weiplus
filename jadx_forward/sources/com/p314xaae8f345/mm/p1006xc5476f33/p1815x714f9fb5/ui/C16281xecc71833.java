package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui;

/* renamed from: com.tencent.mm.plugin.location.ui.MyLocationButton */
/* loaded from: classes13.dex */
public class C16281xecc71833 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f226141d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageButton f226142e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f226143f;

    /* renamed from: g, reason: collision with root package name */
    public ab3.h f226144g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f226145h;

    /* renamed from: i, reason: collision with root package name */
    public final i11.c f226146i;

    public C16281xecc71833(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f226145h = true;
        this.f226146i = new za3.f(this);
        this.f226141d = context;
        a();
    }

    public final void a() {
        android.view.View inflate = android.view.View.inflate(this.f226141d, com.p314xaae8f345.mm.R.C30864xbddafb2a.c5t, this);
        this.f226142e = (android.widget.ImageButton) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567219in1);
        this.f226143f = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.lbl);
    }

    /* renamed from: getMyLocationBtn */
    public android.widget.ImageButton m65934x7275a165() {
        return this.f226142e;
    }

    /* renamed from: getProgressBar */
    public android.widget.LinearLayout m65935x1d47bd70() {
        return this.f226143f;
    }

    /* renamed from: setAnimToSelf */
    public void m65936x189dbfda(boolean z17) {
        this.f226145h = z17;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f226142e.setOnClickListener(onClickListener);
    }

    /* renamed from: setProgressBar */
    public void m65937xb3ad30e4(ab3.h hVar) {
        this.f226144g = hVar;
        this.f226143f.setVisibility(0);
        this.f226142e.setVisibility(8);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().j(this.f226146i, true);
    }

    public C16281xecc71833(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f226145h = true;
        this.f226146i = new za3.f(this);
        this.f226141d = context;
        a();
    }
}
