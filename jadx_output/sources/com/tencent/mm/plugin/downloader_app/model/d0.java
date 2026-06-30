package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes14.dex */
public class d0 extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.l0 f97263d;

    public d0(com.tencent.mm.plugin.downloader_app.model.l0 l0Var) {
        this.f97263d = l0Var;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mm.plugin.downloader_app.model.l0 l0Var = this.f97263d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = l0Var.f97300y;
        if (u1Var == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = u1Var.f211998c;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        l0Var.f97300y = null;
        l0Var.A.dead();
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
    }
}
