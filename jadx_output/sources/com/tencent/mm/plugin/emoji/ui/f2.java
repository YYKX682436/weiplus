package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes8.dex */
public final class f2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f97973d;

    public f2(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity) {
        this.f97973d = emojiEditorActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f97973d;
        emojiEditorActivity.setResult(0);
        emojiEditorActivity.finish();
        return true;
    }
}
