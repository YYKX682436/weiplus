package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes5.dex */
public final class u0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiDesignerPackInfoUI f98205d;

    public u0(com.tencent.mm.plugin.emoji.ui.EmojiDesignerPackInfoUI emojiDesignerPackInfoUI) {
        this.f98205d = emojiDesignerPackInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f98205d.finish();
        return false;
    }
}
