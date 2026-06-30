package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class s6 implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.w6 f90203d;

    public s6(com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI appBrandProcessShareMessageProxyUI, com.tencent.mm.plugin.appbrand.ui.w6 w6Var) {
        this.f90203d = w6Var;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4 && keyEvent.getAction() == 1) {
            this.f90203d.b(false, null, 0);
            dialogInterface.dismiss();
        }
        return false;
    }
}
