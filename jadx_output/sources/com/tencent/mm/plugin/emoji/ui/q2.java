package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes11.dex */
public class q2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiMineUI f98169d;

    public q2(com.tencent.mm.plugin.emoji.ui.EmojiMineUI emojiMineUI) {
        this.f98169d = emojiMineUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f98169d.finish();
        return true;
    }
}
