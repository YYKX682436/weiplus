package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class i5 implements nl1.d {
    public void a(android.view.ViewGroup viewGroup, nl1.b bVar) {
        if (bVar != null) {
            o05.l lVar = (o05.l) i95.n0.c(o05.l.class);
            android.view.inputmethod.InputConnection a17 = bVar.a();
            ((ps4.g) lVar).getClass();
            if (viewGroup instanceof com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) {
                ((com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) viewGroup).m82982xa13e6986(a17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletService", "setNumKeyboardInputConnection error, kbView is not WcPayKeyboard");
            }
        }
    }
}
