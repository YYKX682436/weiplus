package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes3.dex */
public class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAEntranceUI f72618d;

    public e(com.tencent.mm.plugin.aa.ui.AAEntranceUI aAEntranceUI) {
        this.f72618d = aAEntranceUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f72618d.finish();
        return false;
    }
}
