package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes11.dex */
public class j3 implements l75.z0 {
    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3 l3Var) {
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        try {
            if (!gm0.j1.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.SubCoreExDevice", "onNotifyChange,acc has not ready");
            } else if (obj instanceof java.lang.String) {
                gm0.j1.e().k(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.i3(this, obj), 2000L);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.SubCoreExDevice", "ap : onNotifyChange exception %s", e17.getMessage());
        }
    }
}
