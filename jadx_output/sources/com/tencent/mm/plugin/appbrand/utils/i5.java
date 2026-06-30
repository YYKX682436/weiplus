package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class i5 implements nl1.d {
    public void a(android.view.ViewGroup viewGroup, nl1.b bVar) {
        if (bVar != null) {
            o05.l lVar = (o05.l) i95.n0.c(o05.l.class);
            android.view.inputmethod.InputConnection a17 = bVar.a();
            ((ps4.g) lVar).getClass();
            if (viewGroup instanceof com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) {
                ((com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) viewGroup).setInputConnection(a17);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletService", "setNumKeyboardInputConnection error, kbView is not WcPayKeyboard");
            }
        }
    }
}
