package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class e implements pd1.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.i f87450a;

    public e(com.tencent.mm.plugin.appbrand.pip.i iVar) {
        this.f87450a = iVar;
    }

    @Override // pd1.i
    public void a(int i17, int i18) {
        if (this.f87450a.f87479i) {
            com.tencent.mars.xlog.Log.i(this.f87450a.f87471a, "onConfigurationChanged, onVideoPositionGot, released");
            return;
        }
        com.tencent.mm.plugin.appbrand.pip.i iVar = this.f87450a;
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView = iVar.f87473c;
        if (iVar.f87482l == null) {
            iVar.f87482l = new com.tencent.mm.plugin.appbrand.pip.h(iVar, null);
        }
        com.tencent.mm.plugin.appbrand.pip.h hVar = iVar.f87482l;
        hVar.f87464a = i17;
        hVar.f87465b = i18;
        hVar.f87466c = null;
        appBrandPipContainerView.a(hVar);
    }
}
