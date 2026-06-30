package bs3;

/* loaded from: classes.dex */
public final class f implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.PermissionSettingUI f23994a;

    public f(com.tencent.mm.plugin.profile.ui.PermissionSettingUI permissionSettingUI) {
        this.f23994a = permissionSettingUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.profile.ui.PermissionSettingUI permissionSettingUI = this.f23994a;
        permissionSettingUI.hideVKB();
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "Dialog clicked, bOk: " + z17);
        if (z17) {
            return;
        }
        java.lang.String str2 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=" + com.tencent.mm.sdk.platformtools.m2.f(permissionSettingUI);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str2);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "Opening help URL: " + str2);
        j45.l.j(permissionSettingUI, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
