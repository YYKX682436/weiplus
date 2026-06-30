package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class x implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAQueryListUI f72878d;

    public x(com.tencent.mm.plugin.aa.ui.AAQueryListUI aAQueryListUI) {
        this.f72878d = aAQueryListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f72878d.finish();
        return false;
    }
}
