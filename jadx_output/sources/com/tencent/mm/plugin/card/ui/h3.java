package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class h3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardNewMsgUI f95024d;

    public h3(com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI) {
        this.f95024d = cardNewMsgUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f95024d.finish();
        return true;
    }
}
