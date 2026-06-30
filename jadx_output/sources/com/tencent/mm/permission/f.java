package com.tencent.mm.permission;

/* loaded from: classes5.dex */
public class f implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.permission.PermissionWarningDialog f72376a;

    public f(com.tencent.mm.permission.PermissionWarningDialog permissionWarningDialog) {
        this.f72376a = permissionWarningDialog;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PermissionWarningDialog", "set MicroPhone unmute.");
            ((android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio")).setMicrophoneMute(false);
        }
        this.f72376a.finish();
    }
}
