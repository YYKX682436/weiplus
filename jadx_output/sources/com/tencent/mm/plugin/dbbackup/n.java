package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.dbbackup.DBRecoveryUI f96868d;

    public n(com.tencent.mm.plugin.dbbackup.DBRecoveryUI dBRecoveryUI) {
        this.f96868d = dBRecoveryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/dbbackup/DBRecoveryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (gm0.j1.u().m() == null) {
            db5.e1.i(this.f96868d, com.tencent.mm.R.string.bn9, 0);
            yj0.a.h(this, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.dbbackup.DBRecoveryUI dBRecoveryUI = this.f96868d;
        if (dBRecoveryUI.f96786m != 0) {
            db5.e1.l(dBRecoveryUI, com.tencent.mm.R.string.f491034bn2, 0, com.tencent.mm.R.string.bnb, com.tencent.mm.R.string.f491037bn5, false, new com.tencent.mm.plugin.dbbackup.m(this), null, com.tencent.mm.R.color.f478702ej);
        } else {
            dBRecoveryUI.V6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
