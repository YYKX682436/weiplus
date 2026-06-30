package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class e5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f73818d;

    public e5(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI) {
        this.f73818d = loginHistoryUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        this.f73818d.f7(menuItem.getItemId());
    }
}
