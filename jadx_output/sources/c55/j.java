package c55;

/* loaded from: classes12.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.recovery.ui.RecoveryToolsUI f38739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38740e;

    public j(com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI, java.lang.String str) {
        this.f38739d = recoveryToolsUI;
        this.f38740e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI = this.f38739d;
        android.widget.TextView textView = recoveryToolsUI.f192190g;
        if (textView == null) {
            kotlin.jvm.internal.o.o("saveLogToDownloadDirStatus");
            throw null;
        }
        textView.setText(recoveryToolsUI.getString(com.tencent.recovery.wx.R.string.recovery_msg_package_failed));
        textView.setTextColor(recoveryToolsUI.getColor(com.tencent.recovery.wx.R.color.recovery_hint_red));
        android.widget.TextView textView2 = recoveryToolsUI.f192191h;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("saveLogToDownloadDirError");
            throw null;
        }
        textView2.setText(this.f38740e);
        textView2.setVisibility(0);
    }
}
