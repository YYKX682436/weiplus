package com.tencent.mm.network;

/* loaded from: classes.dex */
public class v2 implements com.tencent.mm.modelbase.u0 {
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.setHasCallbackToQueue(true);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPushCore", "[+] Run successfully: %s, funcId: %s", m1Var, java.lang.Integer.valueOf(m1Var.getType()));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMPushCore", "[-] Run failed: %s, funcId: %s, errType:%s, errCode: %s", m1Var, java.lang.Integer.valueOf(m1Var.getType()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }
}
