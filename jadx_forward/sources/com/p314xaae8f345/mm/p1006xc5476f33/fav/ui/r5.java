package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class r5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13571xe8c83cab f182907d;

    public r5(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13571xe8c83cab activityC13571xe8c83cab) {
        this.f182907d = activityC13571xe8c83cab;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13571xe8c83cab activityC13571xe8c83cab = this.f182907d;
        intent.putExtra("key_to_user", activityC13571xe8c83cab.T);
        intent.putExtra("key_fav_item_id", activityC13571xe8c83cab.S);
        intent.putExtra("key_search_type", 1);
        intent.putExtra("key_enter_fav_search_from", 1);
        o72.x1.M0(activityC13571xe8c83cab.mo55332x76847179(), ".ui.FavSearchUI", intent, 0, !com.p314xaae8f345.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(activityC13571xe8c83cab, new android.util.Pair[0]).toBundle() : null);
        return true;
    }
}
