package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f88757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f88758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f88759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f88760g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.ui.MagicBrushView f88761h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88762i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.t f88763m;

    public r(com.tencent.mm.plugin.appbrand.service.t tVar, int i17, int i18, int i19, int i27, com.tencent.magicbrush.ui.MagicBrushView magicBrushView, int i28) {
        this.f88763m = tVar;
        this.f88757d = i17;
        this.f88758e = i18;
        this.f88759f = i19;
        this.f88760g = i27;
        this.f88761h = magicBrushView;
        this.f88762i = i28;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.f88757d, this.f88758e);
        layoutParams.setMargins(this.f88759f, this.f88760g, 0, 0);
        com.tencent.mm.plugin.appbrand.service.t tVar = this.f88763m;
        hh.g gVar = tVar.f88784e;
        android.widget.FrameLayout frameLayout = tVar.f88783d;
        int i17 = this.f88762i;
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = this.f88761h;
        int a17 = gVar.a(frameLayout, magicBrushView, i17);
        if (a17 == -2) {
            magicBrushView.setLayoutParams(layoutParams);
            magicBrushView.requestLayout();
        } else {
            tVar.f88783d.removeView(magicBrushView);
            tVar.f88783d.addView(magicBrushView, a17, layoutParams);
        }
        magicBrushView.setOpaque(false);
    }
}
