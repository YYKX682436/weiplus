package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class x6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLikePrivacyUI f110724d;

    public x6(com.tencent.mm.plugin.finder.feed.ui.FinderLikePrivacyUI finderLikePrivacyUI) {
        this.f110724d = finderLikePrivacyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110724d.finish();
        return true;
    }
}
