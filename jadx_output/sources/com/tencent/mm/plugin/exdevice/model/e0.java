package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes.dex */
public class e0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ExDeviceGetTicketEvent f98880d;

    public e0(com.tencent.mm.plugin.exdevice.model.o0 o0Var, com.tencent.mm.autogen.events.ExDeviceGetTicketEvent exDeviceGetTicketEvent) {
        this.f98880d = exDeviceGetTicketEvent;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.autogen.events.ExDeviceGetTicketEvent exDeviceGetTicketEvent = this.f98880d;
        if (m1Var == null || m1Var.getType() != 543) {
            am.a6 a6Var = exDeviceGetTicketEvent.f54140h;
            a6Var.f6128a = true;
            a6Var.f6129b = null;
            java.lang.Runnable runnable = exDeviceGetTicketEvent.f192364d;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        gm0.j1.n().f273288b.q(543, this);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceEventManager", "getTicketSceneEndImpl errType = [%s], errCode = [%s]， errMsg = [%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            am.a6 a6Var2 = exDeviceGetTicketEvent.f54140h;
            a6Var2.f6128a = true;
            a6Var2.f6129b = null;
            java.lang.Runnable runnable2 = exDeviceGetTicketEvent.f192364d;
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "getTicketSceneEndImpl errType = [%s], errCode = [%s]， errMsg = [%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.modelbase.o oVar = ((com.tencent.mm.plugin.exdevice.model.t2) m1Var).f99066d;
        java.util.Iterator it = ((oVar == null || (fVar = oVar.f70711b.f70700a) == null) ? null : (r45.wg3) fVar).f389144d.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            r45.xg3 xg3Var = (r45.xg3) it.next();
            if (xg3Var != null) {
                r45.nv3 nv3Var = xg3Var.f390071e;
                if (nv3Var != null) {
                    str3 = nv3Var.f381692e;
                    str2 = nv3Var.f381691d;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if (xg3Var.f390070d != 0 || com.tencent.mm.sdk.platformtools.t8.K0(xg3Var.f390072f)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceEventManager", "deviceId(%s) get ticket fail. ret=%d, ticket=%s", str3, java.lang.Integer.valueOf(xg3Var.f390070d), xg3Var.f390072f);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "GetHardDeviceOperTicket end. deviceId=%s, deviceType=%s, ticket=%s, oper=%d", str3, str2, xg3Var.f390072f, java.lang.Integer.valueOf(xg3Var.f390073g));
                    am.a6 a6Var3 = exDeviceGetTicketEvent.f54140h;
                    a6Var3.f6128a = true;
                    a6Var3.f6129b = xg3Var.f390072f;
                    java.lang.Runnable runnable3 = exDeviceGetTicketEvent.f192364d;
                    if (runnable3 != null) {
                        runnable3.run();
                        z17 = true;
                    }
                }
            }
        }
        if (z17) {
            return;
        }
        am.a6 a6Var4 = exDeviceGetTicketEvent.f54140h;
        a6Var4.f6128a = true;
        a6Var4.f6129b = null;
        java.lang.Runnable runnable4 = exDeviceGetTicketEvent.f192364d;
        if (runnable4 != null) {
            runnable4.run();
        }
    }
}
