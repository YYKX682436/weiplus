package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class x6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginSelectUI f74314d;

    public x6(com.tencent.mm.plugin.account.ui.LoginSelectUI loginSelectUI) {
        this.f74314d = loginSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f74314d.finish();
        return true;
    }
}
