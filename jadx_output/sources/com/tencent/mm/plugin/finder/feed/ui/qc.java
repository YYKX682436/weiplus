package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class qc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveSelectRoomForLuckMoneyUI f110452d;

    public qc(com.tencent.mm.plugin.finder.feed.ui.FinderLiveSelectRoomForLuckMoneyUI finderLiveSelectRoomForLuckMoneyUI) {
        this.f110452d = finderLiveSelectRoomForLuckMoneyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveSelectRoomForLuckMoneyUI.F;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveSelectRoomForLuckMoneyUI finderLiveSelectRoomForLuckMoneyUI = this.f110452d;
        finderLiveSelectRoomForLuckMoneyUI.getClass();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(finderLiveSelectRoomForLuckMoneyUI.D);
        android.content.Intent intent = new android.content.Intent();
        intent.putStringArrayListExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME", arrayList);
        finderLiveSelectRoomForLuckMoneyUI.setResult(-1, intent);
        finderLiveSelectRoomForLuckMoneyUI.finish();
        finderLiveSelectRoomForLuckMoneyUI.x7();
        finderLiveSelectRoomForLuckMoneyUI.b7().notifyDataSetChanged();
        return true;
    }
}
