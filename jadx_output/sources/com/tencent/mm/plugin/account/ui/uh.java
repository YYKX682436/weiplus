package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class uh implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.SetPwdUI f74257d;

    public uh(com.tencent.mm.plugin.account.ui.SetPwdUI setPwdUI) {
        this.f74257d = setPwdUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f74257d.b7();
        return true;
    }
}
