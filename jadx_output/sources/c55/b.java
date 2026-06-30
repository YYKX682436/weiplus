package c55;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f38718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f38719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.io.File f38720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.recovery.ui.RecoveryToolsUI f38721g;

    public b(android.widget.TextView textView, android.widget.TextView textView2, java.io.File file, com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI) {
        this.f38718d = textView;
        this.f38719e = textView2;
        this.f38720f = file;
        this.f38721g = recoveryToolsUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.io.File file = this.f38720f;
        com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI = this.f38721g;
        java.lang.String string = file != null ? recoveryToolsUI.getString(com.tencent.recovery.wx.R.string.recovery_msg_success) : recoveryToolsUI.getString(com.tencent.recovery.wx.R.string.recovery_msg_no_logs);
        android.widget.TextView textView = this.f38718d;
        textView.setText(string);
        textView.setTextColor(recoveryToolsUI.getColor(com.tencent.recovery.wx.R.color.recovery_hint_green));
        this.f38719e.setVisibility(8);
    }
}
