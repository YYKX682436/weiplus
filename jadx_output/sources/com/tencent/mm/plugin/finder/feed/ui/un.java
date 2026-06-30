package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class un implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderWxProfileShowUI f110624d;

    public un(com.tencent.mm.plugin.finder.feed.ui.FinderWxProfileShowUI finderWxProfileShowUI) {
        this.f110624d = finderWxProfileShowUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderWxProfileShowUI finderWxProfileShowUI = this.f110624d;
        finderWxProfileShowUI.setResult(-1);
        finderWxProfileShowUI.finish();
        return true;
    }
}
