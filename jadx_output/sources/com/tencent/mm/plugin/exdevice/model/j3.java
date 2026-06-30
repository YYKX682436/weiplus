package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes11.dex */
public class j3 implements l75.z0 {
    public j3(com.tencent.mm.plugin.exdevice.model.l3 l3Var) {
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        try {
            if (!gm0.j1.a()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.SubCoreExDevice", "onNotifyChange,acc has not ready");
            } else if (obj instanceof java.lang.String) {
                gm0.j1.e().k(new com.tencent.mm.plugin.exdevice.model.i3(this, obj), 2000L);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.SubCoreExDevice", "ap : onNotifyChange exception %s", e17.getMessage());
        }
    }
}
