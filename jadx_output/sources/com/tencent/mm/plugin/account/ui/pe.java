package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class pe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.qe f74114d;

    public pe(com.tencent.mm.plugin.account.ui.qe qeVar) {
        this.f74114d = qeVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.account.ui.qe qeVar = this.f74114d;
        android.view.View findViewById = qeVar.f74145e.findViewById(com.tencent.mm.R.id.mnr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$8$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$8$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.ImageView) qeVar.f74145e.findViewById(com.tencent.mm.R.id.mnp)).setImageBitmap(com.tencent.mm.graphics.e.c(qeVar.f74144d));
        com.tencent.mm.ui.widget.dialog.u3 u3Var = qeVar.f74145e.f73555n;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        qeVar.f74145e.f73555n.dismiss();
    }
}
