package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.ui.MagicBrushView f88744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f88745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f88746f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f88747g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f88748h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88749i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.t f88750m;

    public q(com.tencent.mm.plugin.appbrand.service.t tVar, com.tencent.magicbrush.ui.MagicBrushView magicBrushView, int i17, int i18, int i19, int i27, int i28) {
        this.f88750m = tVar;
        this.f88744d = magicBrushView;
        this.f88745e = i17;
        this.f88746f = i18;
        this.f88747g = i19;
        this.f88748h = i27;
        this.f88749i = i28;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.service.t tVar = this.f88750m;
        if (tVar.f88783d == null) {
            tVar.f88783d = new android.widget.FrameLayout(tVar.f88785f.f88796f);
            com.tencent.mm.plugin.appbrand.page.he.a(((com.tencent.mm.plugin.appbrand.service.c0) tVar.f88785f.f88797g.F()).V0().getCustomViewContainer(), tVar.f88783d);
        }
        hh.g gVar = tVar.f88784e;
        android.widget.FrameLayout frameLayout = tVar.f88783d;
        int i17 = this.f88745e;
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = this.f88744d;
        int a17 = gVar.a(frameLayout, magicBrushView, i17);
        magicBrushView.setOpaque(false);
        int i18 = (int) ((com.tencent.mm.plugin.appbrand.service.c0) tVar.f88785f.f88797g.F()).getF147807d().getResources().getDisplayMetrics().density;
        int i19 = this.f88746f;
        if (i19 <= 0) {
            i19 = i18 * 100;
        }
        int i27 = this.f88747g;
        if (i27 <= 0) {
            i27 = i18 * 100;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i19, i27);
        layoutParams.setMargins(this.f88748h, this.f88749i, 0, 0);
        tVar.f88783d.addView(magicBrushView, a17, layoutParams);
        magicBrushView.setOpaque(false);
    }
}
