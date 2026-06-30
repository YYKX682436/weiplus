package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes12.dex */
public class i implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f98057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI f98058b;

    public i(com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        this.f98058b = emojiAddCustomDialogUI;
        this.f98057a = emojiInfo;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.ri0 ri0Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI = this.f98058b;
        if (i18 == -434) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd error over size.");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN, java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(emojiAddCustomDialogUI.f97668g);
            java.lang.String md52 = emojiAddCustomDialogUI.f97671m.getMd5();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = emojiAddCustomDialogUI.f97671m;
            g0Var.d(10431, valueOf, md52, emojiInfo.field_designerID, emojiInfo.field_groupId, 1, 1, java.lang.Integer.valueOf(emojiAddCustomDialogUI.f97671m.field_size), emojiAddCustomDialogUI.f97669h, emojiAddCustomDialogUI.f97671m.field_activityid, emojiAddCustomDialogUI.f97670i, emojiAddCustomDialogUI.V6(), "");
            if (emojiAddCustomDialogUI.G) {
                emojiAddCustomDialogUI.I++;
                emojiAddCustomDialogUI.W6();
            } else {
                emojiAddCustomDialogUI.R6();
                emojiAddCustomDialogUI.Z6(null);
            }
        } else if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd ok.");
            r45.bd bdVar = (r45.bd) fVar.f70618d;
            if (bdVar != null && (linkedList2 = bdVar.f370672e) != null && linkedList2.size() > 0) {
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    ri0Var = (r45.ri0) it.next();
                    if (this.f98057a.getMd5().equals(ri0Var.f384886d)) {
                        break;
                    }
                }
            }
            ri0Var = null;
            if (bdVar == null || (linkedList = bdVar.f370671d) == null || linkedList.size() <= 0) {
                com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.O6(emojiAddCustomDialogUI, null, ri0Var, "", "");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "upload size is %d", java.lang.Integer.valueOf(linkedList.size()));
                int i19 = com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.L;
                emojiAddCustomDialogUI.U6(ri0Var);
            }
        } else if (i18 == -2049) {
            emojiAddCustomDialogUI.Q6(emojiAddCustomDialogUI.f97674p.getString(com.tencent.mm.R.string.bul));
        } else {
            java.lang.String str = fVar.f70617c;
            int i27 = com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.L;
            emojiAddCustomDialogUI.Q6(str);
        }
        return null;
    }
}
