package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptAppDebugUI f99821d;

    public a(com.tencent.mm.plugin.expt.ui.ExptAppDebugUI exptAppDebugUI) {
        this.f99821d = exptAppDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f99821d.finish();
        return true;
    }
}
