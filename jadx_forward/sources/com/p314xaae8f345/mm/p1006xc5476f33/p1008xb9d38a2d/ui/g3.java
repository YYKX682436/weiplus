package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes13.dex */
public final class g3 {
    public g3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.g3 g3Var) {
        g3Var.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.f155507g.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.f155507g = g3Var.b() + '_' + java.lang.System.currentTimeMillis();
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.f155507g;
    }

    public final java.lang.String b() {
        try {
            return wo.w0.c();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LoginAgreeSyncMsgUIC", "getDeviceId failed: " + e17.getMessage());
            return "";
        }
    }
}
