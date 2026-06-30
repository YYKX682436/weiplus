package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class u implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI f74233d;

    public u(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI) {
        this.f74233d = baseLoginVoiceUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18;
        com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI = this.f74233d;
        int i19 = baseLoginVoiceUI.F;
        if (i19 == 0) {
            i18 = !u11.c.i() ? 7 : 6;
        } else {
            int i27 = ((i19 & 2) == 0 && (i19 & 4) == 0) ? 0 : 2;
            if ((i19 & 4) != 0) {
                i27 |= 4;
            }
            i18 = (i19 & 1) != 0 ? i27 | 1 : i27;
        }
        android.view.LayoutInflater.from(baseLoginVoiceUI);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) baseLoginVoiceUI, 1, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        new java.util.ArrayList();
        com.tencent.mm.plugin.account.ui.n1 n1Var = new com.tencent.mm.plugin.account.ui.n1(i18 | 8, baseLoginVoiceUI);
        com.tencent.mm.plugin.account.ui.o1 o1Var = new com.tencent.mm.plugin.account.ui.o1(baseLoginVoiceUI, null, null, null);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
            h4Var.f228381y = null;
            h4Var.f228382z = null;
        }
        arrayList.clear();
        db5.g4 g4Var = new db5.g4(baseLoginVoiceUI);
        n1Var.onCreateMMMenu(g4Var);
        if (g4Var.z()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            return;
        }
        k0Var.f211872n = n1Var;
        k0Var.f211881s = o1Var;
        k0Var.f211854d = null;
        k0Var.G = null;
        k0Var.v();
    }
}
