package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes11.dex */
public final class m2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiMineListFragment f98091d;

    public m2(com.tencent.mm.plugin.emoji.ui.EmojiMineListFragment emojiMineListFragment) {
        this.f98091d = emojiMineListFragment;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f98091d.finish();
        return true;
    }
}
