package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes9.dex */
public final class y2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI f98564d;

    public y2(com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI emojiRecommendPrivacySettingsUI) {
        this.f98564d = emojiRecommendPrivacySettingsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f98564d.finish();
        return true;
    }
}
