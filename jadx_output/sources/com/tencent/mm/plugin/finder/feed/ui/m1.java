package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class m1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderEmojiSelectUI f110290d;

    public m1(com.tencent.mm.plugin.finder.feed.ui.FinderEmojiSelectUI finderEmojiSelectUI) {
        this.f110290d = finderEmojiSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110290d.finish();
        return true;
    }
}
