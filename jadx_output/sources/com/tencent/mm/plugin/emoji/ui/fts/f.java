package com.tencent.mm.plugin.emoji.ui.fts;

/* loaded from: classes15.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI f98015d;

    public f(com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI) {
        this.f98015d = fTSEmojiDetailPageUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI.P;
        com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI = this.f98015d;
        fTSEmojiDetailPageUI.getClass();
        ((sg0.q3) ((tg0.v1) i95.n0.c(tg0.v1.class))).wi(fTSEmojiDetailPageUI.f98003u, fTSEmojiDetailPageUI.f98004v, fTSEmojiDetailPageUI.f98006x, 2, 0, 0, fTSEmojiDetailPageUI.f98005w);
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = fTSEmojiDetailPageUI.H == 1 ? fTSEmojiDetailPageUI.f98000r : fTSEmojiDetailPageUI.f97999q;
        emojiInfo.K2 = qk.z6.SEND_FROM_SCENE_FORWARD_FROM_GLOBAL_SEARCH;
        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).hj(fTSEmojiDetailPageUI, emojiInfo.field_md5, emojiInfo);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
