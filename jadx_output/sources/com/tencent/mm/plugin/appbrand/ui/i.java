package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes15.dex */
public class i implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.j f89768a;

    public i(com.tencent.mm.plugin.appbrand.ui.j jVar) {
        this.f89768a = jVar;
    }

    @Override // u60.e
    public void onLocationAddr(com.tencent.mm.modelgeo.Addr addr) {
        com.tencent.mm.plugin.appbrand.ui.j jVar = this.f89768a;
        jVar.f89796d.f89294p = addr.f71212e + " " + addr.f71213f;
        com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.AppBrandAuthorizeDetailUI").putString("KEY_ADDRESS", jVar.f89796d.f89294p);
        jVar.f89796d.V6();
    }
}
