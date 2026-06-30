package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public final class q0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavChangeTagUI f101348d;

    public q0(com.tencent.mm.plugin.fav.ui.FavChangeTagUI favChangeTagUI) {
        this.f101348d = favChangeTagUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f101348d.finish();
        return true;
    }
}
