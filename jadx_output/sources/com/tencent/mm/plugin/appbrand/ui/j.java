package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes15.dex */
public class j implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI f89796d;

    public j(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI appBrandAuthorizeDetailUI) {
        this.f89796d = appBrandAuthorizeDetailUI;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeDetailUI", "initLocationForOverseaUser getLocation:%b", java.lang.Boolean.valueOf(z17));
        ((i11.h) this.f89796d.f89293o).m(this);
        if (!z17) {
            return false;
        }
        u60.h hVar = new u60.h(f18, f17);
        hVar.f424870c = 11;
        hVar.f424873f = java.lang.Integer.valueOf(hashCode());
        hVar.f424874g = true;
        ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).b(hVar, new com.tencent.mm.plugin.appbrand.ui.i(this));
        return false;
    }
}
