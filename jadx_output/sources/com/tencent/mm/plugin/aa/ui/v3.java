package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class v3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72852d;

    public v3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72852d = launchAAUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f72852d.finish();
        return false;
    }
}
