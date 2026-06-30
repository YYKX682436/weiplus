package com.tencent.kinda.framework.module.impl;

/* loaded from: classes9.dex */
public class KindaResultImpl implements com.tencent.kinda.gen.IKindaResult {
    @Override // com.tencent.kinda.gen.IKindaResult
    public void apppayEnd(int i17, java.lang.String str) {
        com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent = new com.tencent.mm.autogen.events.WalletPayResultEvent();
        am.s10 s10Var = walletPayResultEvent.f54965g;
        if (i17 == 0) {
            s10Var.f7863c = -1;
        } else {
            s10Var.f7863c = 0;
        }
        s10Var.f7864d = str;
        walletPayResultEvent.e();
    }
}
