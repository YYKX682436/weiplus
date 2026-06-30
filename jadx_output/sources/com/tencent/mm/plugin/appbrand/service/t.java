package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class t implements yg.b0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f88783d = null;

    /* renamed from: e, reason: collision with root package name */
    public final hh.g f88784e = new hh.g();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.v f88785f;

    public t(com.tencent.mm.plugin.appbrand.service.v vVar) {
        this.f88785f = vVar;
    }

    @Override // yg.b0
    public void M(com.tencent.magicbrush.ui.MagicBrushView magicBrushView, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
    }

    @Override // yg.b0
    public com.tencent.magicbrush.ui.MagicBrushView Z() {
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = new com.tencent.magicbrush.ui.MagicBrushView(((com.tencent.mm.plugin.appbrand.service.c0) this.f88785f.f88797g.F()).getContext(), gh.y.TextureView);
        com.tencent.magicbrush.MagicBrush magicBrush = this.f88785f.f426569c;
        kotlin.jvm.internal.o.d(magicBrush);
        magicBrushView.setMagicBrush(magicBrush);
        magicBrushView.setUseRawAxisTouchEvent(true);
        return magicBrushView;
    }

    @Override // yg.b0
    public void a0(com.tencent.magicbrush.ui.MagicBrushView magicBrushView, int i17, int i18, int i19, int i27, int i28) {
        com.tencent.mm.plugin.appbrand.service.v vVar = this.f88785f;
        if (vVar.f88797g.S() != null) {
            vVar.f88797g.S().m(new com.tencent.mm.plugin.appbrand.service.q(this, magicBrushView, i28, i19, i27, i17, i18));
        }
    }

    @Override // yg.b0
    public void q0(com.tencent.magicbrush.ui.MagicBrushView magicBrushView, int i17, int i18, int i19, int i27, int i28) {
        com.tencent.mm.plugin.appbrand.service.v vVar = this.f88785f;
        if (vVar.f88797g.S() != null) {
            vVar.f88797g.S().m(new com.tencent.mm.plugin.appbrand.service.r(this, i19, i27, i17, i18, magicBrushView, i28));
        }
    }

    @Override // yg.b0
    public void w0(com.tencent.magicbrush.ui.MagicBrushView magicBrushView) {
        com.tencent.mm.plugin.appbrand.service.v vVar = this.f88785f;
        if (vVar.f88797g.S() != null) {
            vVar.f88797g.S().m(new com.tencent.mm.plugin.appbrand.service.s(this, magicBrushView));
        }
    }
}
