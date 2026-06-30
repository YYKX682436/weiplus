package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI f97938d;

    public e(com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI baseEmojiStoreUI, com.tencent.mm.plugin.emoji.ui.a aVar) {
        this.f97938d = baseEmojiStoreUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f97938d.finish();
        return true;
    }
}
