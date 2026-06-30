package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class ie implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI f73936d;

    public ie(com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI regAffiliateAccountUI) {
        this.f73936d = regAffiliateAccountUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f73936d.onBackPressed();
        return true;
    }
}
