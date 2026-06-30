package com.tencent.mm.plugin.appbrand.wxassistant;

@j95.b(dependencies = {wx.c1.class})
/* loaded from: classes4.dex */
public final class p extends i95.w implements com.tencent.mm.plugin.appbrand.service.s5, wx.g1 {
    public p() {
        jz5.h.b(com.tencent.mm.plugin.appbrand.wxassistant.o.f92250d);
    }

    @Override // wx.g1
    public void R9() {
        com.tencent.mars.xlog.Log.i("AppBrandWxAssistantRUDPService", "onCallEnd");
    }

    @Override // wx.g1
    public void lb(com.tencent.wechat.aff.chatbot.u uVar, java.lang.String str, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("AppBrandWxAssistantRUDPService", "onRecvWeAppCdp: cdpAction = " + uVar + ", callId = " + str + ", context = " + bArr);
        if (uVar == null) {
            com.tencent.mars.xlog.Log.w("AppBrandWxAssistantRUDPService", "onRecvWeAppCdp cdpAction is null");
            return;
        }
        if (str != null) {
            if (!(str.length() == 0)) {
                com.tencent.mm.plugin.appbrand.service.u5 u5Var = (com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class);
                boolean[] zArr = uVar.f216477i;
                java.lang.String i17 = (zArr[1] ? uVar.f216472d : com.tencent.mm.protobuf.g.f192155b).i();
                java.lang.String i18 = (zArr[2] ? uVar.f216473e : com.tencent.mm.protobuf.g.f192155b).i();
                java.util.LinkedList linkedList = uVar.f216474f;
                kotlin.jvm.internal.o.f(linkedList, "getCdpRequest(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.tencent.mm.protobuf.g) it.next()).i());
                }
                r45.w3 w3Var = new r45.w3();
                com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = (com.tencent.mm.plugin.appbrand.wxassistant.u0) u5Var;
                u0Var.getClass();
                com.tencent.mm.plugin.appbrand.wxassistant.x1 x1Var = u0Var.f92317d;
                x1Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "onReceive: command:" + i18 + ' ' + i17 + ' ' + kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null));
                kotlinx.coroutines.l.d(x1Var.f92341b, null, null, new com.tencent.mm.plugin.appbrand.wxassistant.o1(arrayList, str, x1Var, i17, i18, w3Var, null), 3, null);
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("AppBrandWxAssistantRUDPService", "onRecvWeAppCdp callId is null");
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("AppBrandWxAssistantRUDPService", "onAccountInitialized");
        com.tencent.mars.xlog.Log.i("AppBrandWxAssistantRUDPService", "install");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("AppBrandWxAssistantRUDPService", "onAccountReleased");
        com.tencent.mars.xlog.Log.i("AppBrandWxAssistantRUDPService", "uninstall");
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mars.xlog.Log.i("AppBrandWxAssistantRUDPService", "onCreate");
        com.tencent.mars.xlog.Log.i("AppBrandWxAssistantRUDPService", "install");
    }

    public void wi(java.lang.String callId, byte[] resp) {
        kotlin.jvm.internal.o.g(callId, "callId");
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("AppBrandWxAssistantRUDPService", "sendCdpResp callId:" + callId + " cdpResp:" + resp.length);
        com.tencent.mars.xlog.Log.w("AppBrandWxAssistantRUDPService", "sendCdpResp: no active session");
    }
}
