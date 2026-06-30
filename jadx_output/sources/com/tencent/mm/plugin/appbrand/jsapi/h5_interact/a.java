package com.tencent.mm.plugin.appbrand.jsapi.h5_interact;

/* loaded from: classes7.dex */
public class a implements com.tencent.mm.plugin.appbrand.ipc.l0 {
    @Override // com.tencent.mm.plugin.appbrand.ipc.l0
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.o6 b17;
        if (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event) {
            com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event sendDataToMiniProgramFromH5Event = (com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event) obj;
            java.lang.String str = sendDataToMiniProgramFromH5Event.f81271d;
            java.lang.String str2 = sendDataToMiniProgramFromH5Event.f81272e;
            int i17 = sendDataToMiniProgramFromH5Event.f81273f;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (b17 = com.tencent.mm.plugin.appbrand.l.b(str)) == null || !b17.J0()) {
                return;
            }
            try {
                org.json.JSONObject put = new org.json.JSONObject().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str2).put("webviewId", java.lang.String.valueOf(i17));
                com.tencent.mm.plugin.appbrand.jsapi.h5_interact.c cVar = new com.tencent.mm.plugin.appbrand.jsapi.h5_interact.c();
                cVar.u(b17.C0());
                cVar.f82374f = put.toString();
                cVar.m();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.EventOnH5Data", "dispatch ex = %s", e17);
            }
        }
    }
}
