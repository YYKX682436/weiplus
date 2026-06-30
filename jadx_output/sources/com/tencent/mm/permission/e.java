package com.tencent.mm.permission;

/* loaded from: classes5.dex */
public class e implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.permission.PermissionWarningDialog f72375d;

    public e(com.tencent.mm.permission.PermissionWarningDialog permissionWarningDialog) {
        this.f72375d = permissionWarningDialog;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f72375d.finish();
    }
}
