package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.dbbackup.DBRecoveryUI f96866d;

    public l(com.tencent.mm.plugin.dbbackup.DBRecoveryUI dBRecoveryUI) {
        this.f96866d = dBRecoveryUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.dbbackup.DBRecoveryUI dBRecoveryUI = this.f96866d;
        if (dBRecoveryUI.f96786m == 0) {
            com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec = com.tencent.mm.plugin.dbbackup.e0.f96841m;
            com.tencent.mm.ui.vb.h(true);
            return;
        }
        android.view.View view = dBRecoveryUI.f96781e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = dBRecoveryUI.f96782f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
