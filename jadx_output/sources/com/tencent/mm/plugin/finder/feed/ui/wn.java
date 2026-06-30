package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class wn implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderWxSettingUI f110710d;

    public wn(com.tencent.mm.plugin.finder.feed.ui.FinderWxSettingUI finderWxSettingUI) {
        this.f110710d = finderWxSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110710d.finish();
        return true;
    }
}
