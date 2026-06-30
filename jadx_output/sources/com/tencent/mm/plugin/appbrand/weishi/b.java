package com.tencent.mm.plugin.appbrand.weishi;

/* loaded from: classes7.dex */
class b implements com.tencent.mm.ipcinvoker.j {
    private b() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            return;
        }
        new com.tencent.mm.plugin.appbrand.weishi.AppBrandWeishiUIReadyEvent().e();
    }
}
