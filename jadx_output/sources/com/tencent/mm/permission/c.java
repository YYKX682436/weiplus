package com.tencent.mm.permission;

/* loaded from: classes5.dex */
public class c implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.permission.PermissionWarningDialog f72373d;

    public c(com.tencent.mm.permission.PermissionWarningDialog permissionWarningDialog) {
        this.f72373d = permissionWarningDialog;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f72373d.finish();
    }
}
