package c55;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f38722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f38723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.recovery.ui.RecoveryToolsUI f38724f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38725g;

    public c(android.widget.TextView textView, android.widget.TextView textView2, com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI, java.lang.String str) {
        this.f38722d = textView;
        this.f38723e = textView2;
        this.f38724f = recoveryToolsUI;
        this.f38725g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.recovery.wx.R.string.recovery_msg_package_failed;
        com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI = this.f38724f;
        java.lang.String string = recoveryToolsUI.getString(i17);
        android.widget.TextView textView = this.f38722d;
        textView.setText(string);
        textView.setTextColor(recoveryToolsUI.getColor(com.tencent.recovery.wx.R.color.recovery_hint_red));
        java.lang.String str = this.f38725g;
        android.widget.TextView textView2 = this.f38723e;
        textView2.setText(str);
        textView2.setVisibility(0);
    }
}
