package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class a implements com.tencent.mm.plugin.appbrand.jsapi.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.d f87424d;

    public a(com.tencent.mm.plugin.appbrand.pip.d dVar) {
        this.f87424d = dVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.x
    public void b() {
        com.tencent.mm.plugin.appbrand.pip.d dVar = this.f87424d;
        com.tencent.mars.xlog.Log.i(dVar.f87439a, "markCurPageForeground");
        dVar.f87441c = true;
    }
}
