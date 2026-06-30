package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes.dex */
public class e0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5347xe7151721 f180413d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0 o0Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5347xe7151721 c5347xe7151721) {
        this.f180413d = c5347xe7151721;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5347xe7151721 c5347xe7151721 = this.f180413d;
        if (m1Var == null || m1Var.mo808xfb85f7b0() != 543) {
            am.a6 a6Var = c5347xe7151721.f135673h;
            a6Var.f87661a = true;
            a6Var.f87662b = null;
            java.lang.Runnable runnable = c5347xe7151721.f273897d;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        gm0.j1.n().f354821b.q(543, this);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceEventManager", "getTicketSceneEndImpl errType = [%s], errCode = [%s]， errMsg = [%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            am.a6 a6Var2 = c5347xe7151721.f135673h;
            a6Var2.f87661a = true;
            a6Var2.f87662b = null;
            java.lang.Runnable runnable2 = c5347xe7151721.f273897d;
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "getTicketSceneEndImpl errType = [%s], errCode = [%s]， errMsg = [%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.t2) m1Var).f180599d;
        java.util.Iterator it = ((oVar == null || (fVar = oVar.f152244b.f152233a) == null) ? null : (r45.wg3) fVar).f470677d.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            r45.xg3 xg3Var = (r45.xg3) it.next();
            if (xg3Var != null) {
                r45.nv3 nv3Var = xg3Var.f471604e;
                if (nv3Var != null) {
                    str3 = nv3Var.f463225e;
                    str2 = nv3Var.f463224d;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if (xg3Var.f471603d != 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xg3Var.f471605f)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceEventManager", "deviceId(%s) get ticket fail. ret=%d, ticket=%s", str3, java.lang.Integer.valueOf(xg3Var.f471603d), xg3Var.f471605f);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "GetHardDeviceOperTicket end. deviceId=%s, deviceType=%s, ticket=%s, oper=%d", str3, str2, xg3Var.f471605f, java.lang.Integer.valueOf(xg3Var.f471606g));
                    am.a6 a6Var3 = c5347xe7151721.f135673h;
                    a6Var3.f87661a = true;
                    a6Var3.f87662b = xg3Var.f471605f;
                    java.lang.Runnable runnable3 = c5347xe7151721.f273897d;
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
        am.a6 a6Var4 = c5347xe7151721.f135673h;
        a6Var4.f87661a = true;
        a6Var4.f87662b = null;
        java.lang.Runnable runnable4 = c5347xe7151721.f273897d;
        if (runnable4 != null) {
            runnable4.run();
        }
    }
}
