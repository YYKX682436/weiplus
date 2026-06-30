package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class n implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardDetailPreference f95081d;

    public n(com.tencent.mm.plugin.card.ui.CardDetailPreference cardDetailPreference) {
        this.f95081d = cardDetailPreference;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f95081d.finish();
        return true;
    }
}
