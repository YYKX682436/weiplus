package com.tencent.mm.plugin.account.ui;

/* loaded from: classes13.dex */
public final class g3 {
    public g3(kotlin.jvm.internal.i iVar) {
    }

    public static final java.lang.String a(com.tencent.mm.plugin.account.ui.g3 g3Var) {
        g3Var.getClass();
        if (com.tencent.mm.plugin.account.ui.k3.f73974g.length() == 0) {
            com.tencent.mm.plugin.account.ui.k3.f73974g = g3Var.b() + '_' + java.lang.System.currentTimeMillis();
        }
        return com.tencent.mm.plugin.account.ui.k3.f73974g;
    }

    public final java.lang.String b() {
        try {
            return wo.w0.c();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LoginAgreeSyncMsgUIC", "getDeviceId failed: " + e17.getMessage());
            return "";
        }
    }
}
