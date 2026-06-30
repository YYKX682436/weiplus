package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class ma implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.na f85730d;

    public ma(com.tencent.mm.plugin.appbrand.na naVar) {
        this.f85730d = naVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmbedHalfScreenWxaManager", "page view destroyed, don't resume embed wxa for this page view  [" + hashCode() + ']');
        com.tencent.mm.plugin.appbrand.na naVar = this.f85730d;
        naVar.f86059b = "";
        naVar.f86060c = 0;
        naVar.f86061d.set(false);
    }
}
