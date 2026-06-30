package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes12.dex */
public class j extends qr.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.k f98066a;

    public j(com.tencent.mm.plugin.emoji.ui.k kVar) {
        this.f98066a = kVar;
    }

    @Override // qr.k
    public void a(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(str2 == null ? 0 : str2.length());
        objArr[3] = java.lang.Integer.valueOf(str3 != null ? str3.length() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "upload result: errorType=%d, md5=%s, token:%d, url %d", objArr);
        com.tencent.mm.plugin.emoji.ui.k kVar = this.f98066a;
        if (i17 == 0) {
            com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.O6(kVar.f98074b, str, kVar.f98073a, str2, str3);
            return;
        }
        com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI = kVar.f98074b;
        boolean z17 = emojiAddCustomDialogUI.G;
        com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI2 = kVar.f98074b;
        if (z17) {
            emojiAddCustomDialogUI.I++;
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "batch upload fail: errType=" + i17 + ", md5=" + emojiAddCustomDialogUI2.f97666e);
            emojiAddCustomDialogUI2.W6();
            return;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.P6(emojiAddCustomDialogUI);
            return;
        }
        if (i17 != 1) {
            emojiAddCustomDialogUI.Q6(null);
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(emojiAddCustomDialogUI.f97668g);
        java.lang.String md52 = emojiAddCustomDialogUI2.f97671m.getMd5();
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = emojiAddCustomDialogUI2.f97671m;
        java.lang.String str4 = emojiInfo.field_designerID;
        java.lang.String str5 = emojiInfo.field_groupId;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(emojiInfo.field_size);
        java.lang.String str6 = emojiAddCustomDialogUI2.f97669h;
        java.lang.String str7 = emojiAddCustomDialogUI2.f97671m.field_activityid;
        java.lang.String str8 = emojiAddCustomDialogUI2.f97670i;
        java.lang.String V6 = emojiAddCustomDialogUI2.V6();
        emojiAddCustomDialogUI2.getClass();
        g0Var.d(10431, valueOf, md52, str4, str5, 1, 1, valueOf2, str6, str7, str8, V6, "");
        emojiAddCustomDialogUI2.Z6(str);
    }
}
