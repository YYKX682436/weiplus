package com.tencent.mm.plugin.emoji.ui.fts;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI f98012d;

    public c(com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI) {
        this.f98012d = fTSEmojiDetailPageUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        tg0.v1 v1Var = (tg0.v1) i95.n0.c(tg0.v1.class);
        com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI = this.f98012d;
        ((sg0.q3) v1Var).wi(fTSEmojiDetailPageUI.f98003u, fTSEmojiDetailPageUI.f98004v, fTSEmojiDetailPageUI.f98006x, 4, 0, 0, fTSEmojiDetailPageUI.f98005w);
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(fTSEmojiDetailPageUI.f97999q.getMd5());
        if (u17 != null) {
            fTSEmojiDetailPageUI.f97999q = u17;
        }
        if (!wq.a.f().a(fTSEmojiDetailPageUI.f97999q)) {
            if (com.tencent.mm.vfs.w6.j(fTSEmojiDetailPageUI.f98001s)) {
                java.lang.String str = fTSEmojiDetailPageUI.f98001s;
                ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                com.tencent.mm.pluginsdk.ui.tools.l7.a(str, fTSEmojiDetailPageUI, null);
                return;
            }
            return;
        }
        java.lang.String str2 = fTSEmojiDetailPageUI.f97999q.N0() + "_decode";
        if (com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mm.vfs.w6.h(str2);
        }
        com.tencent.mm.vfs.w6.e(str2);
        com.tencent.mm.vfs.w6.R(str2, wq.a.f().c(fTSEmojiDetailPageUI.f97999q));
        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.a(str2, fTSEmojiDetailPageUI, null);
    }
}
