package com.tencent.mm.permission;

/* loaded from: classes5.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.permission.PermissionWarningDialog f72374d;

    public d(com.tencent.mm.permission.PermissionWarningDialog permissionWarningDialog) {
        this.f72374d = permissionWarningDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f72374d.finish();
    }
}
