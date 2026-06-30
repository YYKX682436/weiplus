package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes7.dex */
class g implements com.tencent.mm.ipcinvoker.j {
    private g() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap.KeySetView) com.tencent.mm.plugin.appbrand.jsapi.appdownload.i.f78959n).add(iPCString.f68406d);
    }
}
