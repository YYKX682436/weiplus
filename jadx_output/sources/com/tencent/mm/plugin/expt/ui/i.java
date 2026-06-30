package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes.dex */
public class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptDebugUI f99837d;

    public i(com.tencent.mm.plugin.expt.ui.ExptDebugUI exptDebugUI) {
        this.f99837d = exptDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f99837d.finish();
        return true;
    }
}
