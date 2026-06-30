package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public class k implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI f78416e;

    public k(com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI appBrandProcessProxyUI, java.lang.String str) {
        this.f78416e = appBrandProcessProxyUI;
        this.f78415d = str;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f78415d);
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI appBrandProcessProxyUI = this.f78416e;
        if (!K0) {
            com.tencent.mm.plugin.appbrand.ipc.m mVar = appBrandProcessProxyUI.f78356o;
            com.tencent.mm.ui.widget.dialog.j0 j0Var = appBrandProcessProxyUI.f78355n;
            mVar.a(-3);
            dialogInterface.dismiss();
        }
        appBrandProcessProxyUI.T6(null);
        return false;
    }
}
