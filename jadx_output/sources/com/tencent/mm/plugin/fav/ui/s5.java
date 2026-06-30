package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class s5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavSelectUI f101435d;

    public s5(com.tencent.mm.plugin.fav.ui.FavSelectUI favSelectUI) {
        this.f101435d = favSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f101435d.finish();
        return true;
    }
}
