package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public class y6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72900d;

    public y6(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        this.f72900d = paylistAAUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f72900d.finish();
        return false;
    }
}
