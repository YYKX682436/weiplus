package c55;

/* loaded from: classes12.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.recovery.ui.RecoveryToolsUI f38735d;

    public g(com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI) {
        this.f38735d = recoveryToolsUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/recovery/ui/RecoveryToolsUI$initSaveLogsToDownloadDir$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.recovery.ui.RecoveryToolsUI.f192186i;
        com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI = this.f38735d;
        recoveryToolsUI.getClass();
        boolean z17 = true;
        if (android.os.Build.VERSION.SDK_INT < 29 && b3.l.checkSelfPermission(recoveryToolsUI, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            z2.h.a(recoveryToolsUI, new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            z17 = false;
        }
        if (z17) {
            recoveryToolsUI.O6();
        }
        yj0.a.h(this, "com/tencent/mm/recovery/ui/RecoveryToolsUI$initSaveLogsToDownloadDir$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
