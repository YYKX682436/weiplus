package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class d5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f73796d;

    public d5(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI) {
        this.f73796d = loginHistoryUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.size() == 0) {
            java.util.Iterator it = ((java.util.ArrayList) this.f73796d.V).iterator();
            while (it.hasNext()) {
                g4Var.v((db5.h4) it.next());
            }
        }
    }
}
