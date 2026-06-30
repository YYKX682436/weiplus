package c55;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.recovery.ui.RecoveryToolsUI f38716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.io.File f38717e;

    public a(com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI, java.io.File file) {
        this.f38716d = recoveryToolsUI;
        this.f38717e = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI = this.f38716d;
        sb6.append(recoveryToolsUI.getPackageName());
        sb6.append(".external.recovery.provider");
        android.net.Uri uriForFile = androidx.core.content.FileProvider.getUriForFile(recoveryToolsUI, sb6.toString(), this.f38717e);
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        intent.setType("application/zip");
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        android.content.Intent createChooser = android.content.Intent.createChooser(intent, recoveryToolsUI.getString(com.tencent.recovery.wx.R.string.recovery_forward_logs));
        com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI2 = this.f38716d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(createChooser);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recoveryToolsUI2, arrayList.toArray(), "com/tencent/mm/recovery/ui/RecoveryToolsUI$initForwardLogs$1$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        recoveryToolsUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(recoveryToolsUI2, "com/tencent/mm/recovery/ui/RecoveryToolsUI$initForwardLogs$1$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
