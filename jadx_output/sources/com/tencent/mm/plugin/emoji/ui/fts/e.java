package com.tencent.mm.plugin.emoji.ui.fts;

/* loaded from: classes15.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI f98014d;

    public e(com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI) {
        this.f98014d = fTSEmojiDetailPageUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI = this.f98014d;
        java.lang.String md52 = fTSEmojiDetailPageUI.f97999q.getMd5();
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = fTSEmojiDetailPageUI.f97999q;
        java.lang.String str = emojiInfo.field_designerID;
        java.lang.String str2 = emojiInfo.field_thumbUrl;
        java.lang.String str3 = emojiInfo.field_activityid;
        fTSEmojiDetailPageUI.getClass();
        ((sg0.q3) ((tg0.v1) i95.n0.c(tg0.v1.class))).wi(fTSEmojiDetailPageUI.f98003u, fTSEmojiDetailPageUI.f98004v, fTSEmojiDetailPageUI.f98006x, 1, 0, 0, fTSEmojiDetailPageUI.f98005w);
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(md52);
        java.lang.String p17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(n22.m.g(), "", md52);
        if (u17 == null) {
            int i17 = com.tencent.mm.sdk.platformtools.y1.c(p17) ? 2 : 1;
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = new com.tencent.mm.storage.emotion.EmojiInfo();
            emojiInfo2.field_md5 = md52;
            emojiInfo2.field_catalog = 65;
            emojiInfo2.field_type = i17;
            emojiInfo2.field_size = (int) com.tencent.mm.vfs.w6.k(p17);
            emojiInfo2.field_temp = 1;
            emojiInfo2.field_designerID = str;
            emojiInfo2.field_thumbUrl = str2;
            emojiInfo2.field_activityid = str3;
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().c().J0(emojiInfo2);
            u17 = emojiInfo2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "doAddAction %b", java.lang.Boolean.valueOf(((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni().U(fTSEmojiDetailPageUI, u17, 18, c01.z1.r())));
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
