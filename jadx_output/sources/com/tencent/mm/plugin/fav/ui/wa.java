package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class wa implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavoriteIndexUI f101518d;

    public wa(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI) {
        this.f101518d = favoriteIndexUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.f100436y1;
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = this.f101518d;
        favoriteIndexUI.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "gotoWNNotePage: favLocalid:%s", java.lang.Long.valueOf(currentTimeMillis));
        com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent();
        am.zl zlVar = notifyWNNoteOperationEvent.f54554g;
        zlVar.field_localId = currentTimeMillis;
        zlVar.f8581d = favoriteIndexUI.getContext();
        notifyWNNoteOperationEvent.f54554g.f8578a = 9;
        notifyWNNoteOperationEvent.e();
        return true;
    }
}
