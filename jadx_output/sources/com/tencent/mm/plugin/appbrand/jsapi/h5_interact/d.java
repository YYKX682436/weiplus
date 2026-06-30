package com.tencent.mm.plugin.appbrand.jsapi.h5_interact;

/* loaded from: classes3.dex */
final class d implements com.tencent.mm.ipcinvoker.j {
    private d() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent sendDataToH5FromMiniProgramEvent = (com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent) obj;
        if (sendDataToH5FromMiniProgramEvent != null) {
            sendDataToH5FromMiniProgramEvent.e();
        }
    }
}
