package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class h1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.DisasterUI f73896d;

    public h1(com.tencent.mm.plugin.account.ui.DisasterUI disasterUI) {
        this.f73896d = disasterUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13939, 3);
        com.tencent.mars.xlog.Log.i("MicroMsg.DisasterUI", "summerdiz back");
        this.f73896d.finish();
        return true;
    }
}
