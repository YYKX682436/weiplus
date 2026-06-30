package c55;

/* loaded from: classes12.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.recovery.ui.RecoveryToolsUI f38737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f38738e;

    public i(com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI, kotlin.jvm.internal.h0 h0Var) {
        this.f38737d = recoveryToolsUI;
        this.f38738e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI = this.f38737d;
        android.widget.TextView textView = recoveryToolsUI.f192190g;
        if (textView == null) {
            kotlin.jvm.internal.o.o("saveLogToDownloadDirStatus");
            throw null;
        }
        textView.setText(this.f38738e.f310123d != null ? recoveryToolsUI.getString(com.tencent.recovery.wx.R.string.recovery_msg_success) : recoveryToolsUI.getString(com.tencent.recovery.wx.R.string.recovery_msg_no_logs));
        textView.setTextColor(recoveryToolsUI.getColor(com.tencent.recovery.wx.R.color.recovery_hint_green));
        android.widget.TextView textView2 = recoveryToolsUI.f192191h;
        if (textView2 != null) {
            textView2.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("saveLogToDownloadDirError");
            throw null;
        }
    }
}
