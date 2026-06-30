package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.NoTaskLayout */
/* loaded from: classes8.dex */
public class C13246x8af2e5d0 extends android.widget.RelativeLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f178921d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13240x9c8ab066 f178922e;

    public C13246x8af2e5d0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f178921d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ha_);
        this.f178922e = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13240x9c8ab066) findViewById(com.p314xaae8f345.mm.R.id.aua);
        l02.n.a(this.f178921d, "download_non_task");
    }

    /* renamed from: setData */
    public void m54716x76491f2c(c02.g gVar) {
        this.f178922e.m54712x76491f2c(gVar);
    }
}
