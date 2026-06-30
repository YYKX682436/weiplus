package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes12.dex */
public class k implements ck5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ri0 f98073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI f98074b;

    public k(com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI, r45.ri0 ri0Var) {
        this.f98074b = emojiAddCustomDialogUI;
        this.f98073a = ri0Var;
    }

    @Override // ck5.b
    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "doWhenIllegal");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI = this.f98074b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(emojiAddCustomDialogUI.f97668g);
        java.lang.String md52 = emojiAddCustomDialogUI.f97671m.getMd5();
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = emojiAddCustomDialogUI.f97671m;
        g0Var.d(10431, valueOf, md52, emojiInfo.field_designerID, emojiInfo.field_groupId, 1, 2, java.lang.Integer.valueOf(emojiAddCustomDialogUI.f97671m.field_size), emojiAddCustomDialogUI.f97669h, emojiAddCustomDialogUI.f97671m.field_activityid, emojiAddCustomDialogUI.f97670i, emojiAddCustomDialogUI.V6(), "");
        if (emojiAddCustomDialogUI.G) {
            emojiAddCustomDialogUI.I++;
            emojiAddCustomDialogUI.W6();
        } else {
            emojiAddCustomDialogUI.R6();
            com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.P6(emojiAddCustomDialogUI);
        }
    }

    @Override // ck5.b
    public void b(ck5.c cVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "doWhenOK");
        com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI = this.f98074b;
        qr.y yVar = emojiAddCustomDialogUI.E == 11 ? qr.y.f366053e : qr.y.f366052d;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = emojiAddCustomDialogUI.f97671m;
        boolean z17 = emojiAddCustomDialogUI.f97672n;
        java.util.List list = emojiAddCustomDialogUI.f97678t;
        int i17 = emojiAddCustomDialogUI.f97679u;
        r45.uu6 uu6Var = emojiAddCustomDialogUI.f97680v;
        r45.sj0 sj0Var = emojiAddCustomDialogUI.f97684z;
        java.util.List list2 = emojiAddCustomDialogUI.f97683y;
        com.tencent.mm.plugin.emoji.ui.j jVar = new com.tencent.mm.plugin.emoji.ui.j(this);
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        emojiAddCustomDialogUI.f97673o = new qr.o(emojiInfo, z17, list, i17, uu6Var, sj0Var, list2, yVar == qr.y.f366053e, jVar);
    }
}
