package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes11.dex */
public final class d4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmoticonNewPersonCenterManagerActivity f97930d;

    public d4(com.tencent.mm.plugin.emoji.ui.EmoticonNewPersonCenterManagerActivity emoticonNewPersonCenterManagerActivity) {
        this.f97930d = emoticonNewPersonCenterManagerActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        int size = com.tencent.mm.storage.n5.f().b().k1().size();
        com.tencent.mm.plugin.emoji.ui.EmoticonNewPersonCenterManagerActivity emoticonNewPersonCenterManagerActivity = this.f97930d;
        if (size <= 1) {
            db5.e1.i(emoticonNewPersonCenterManagerActivity.getContext(), com.tencent.mm.R.string.buu, com.tencent.mm.R.string.f490573yv);
            return true;
        }
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            int i17 = com.tencent.mm.plugin.emoji.ui.EmoticonNewPersonCenterManagerActivity.f97868u;
            db5.e1.y(emoticonNewPersonCenterManagerActivity, emoticonNewPersonCenterManagerActivity.getString(com.tencent.mm.R.string.bya), "", emoticonNewPersonCenterManagerActivity.getString(com.tencent.mm.R.string.by_), com.tencent.mm.plugin.emoji.ui.e4.f97954d);
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(emoticonNewPersonCenterManagerActivity, com.tencent.mm.plugin.emoji.ui.EmojiSortUI.class);
        emoticonNewPersonCenterManagerActivity.startActivityForResult(intent, 100);
        java.util.HashMap hashMap = new java.util.HashMap();
        int i18 = com.tencent.mm.plugin.emoji.ui.EmoticonNewPersonCenterManagerActivity.f97868u;
        emoticonNewPersonCenterManagerActivity.T6("emo_album_manage_page_sort_button", "view_clk", hashMap);
        return true;
    }
}
