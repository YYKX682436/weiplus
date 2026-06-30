package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class c3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p13.c f72590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72591e;

    public c3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, p13.c cVar) {
        this.f72591e = launchAAUI;
        this.f72590d = cVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72591e;
        android.app.Dialog dialog = launchAAUI.A1;
        if (dialog != null && dialog.isShowing()) {
            launchAAUI.A1.dismiss();
        }
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f72590d);
        launchAAUI.B1 = false;
    }
}
