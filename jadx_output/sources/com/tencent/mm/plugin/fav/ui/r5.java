package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class r5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavSelectUI f101374d;

    public r5(com.tencent.mm.plugin.fav.ui.FavSelectUI favSelectUI) {
        this.f101374d = favSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.fav.ui.FavSelectUI favSelectUI = this.f101374d;
        intent.putExtra("key_to_user", favSelectUI.T);
        intent.putExtra("key_fav_item_id", favSelectUI.S);
        intent.putExtra("key_search_type", 1);
        intent.putExtra("key_enter_fav_search_from", 1);
        o72.x1.M0(favSelectUI.getContext(), ".ui.FavSearchUI", intent, 0, !com.tencent.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(favSelectUI, new android.util.Pair[0]).toBundle() : null);
        return true;
    }
}
