package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t1 f252806d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t1();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$clearExpiredItem$1");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.q7.c("timeline_emoticon_cache"));
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        int i17 = 0;
        int length = G != null ? G.length : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1 x1Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1.f252839a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getEmotionCacheLimitCount$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getEmotionCacheLimitCount$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1.f252841c;
        if (length > i18) {
            com.p314xaae8f345.mm.vfs.r6[] G2 = r6Var.G();
            if (G2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$clearExpiredItem$1");
                return;
            }
            java.util.List z07 = kz5.z.z0(G2);
            kz5.n0.F0(z07, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.s1());
            int size = z07.size();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getEmotionCacheLimitCount$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getEmotionCacheLimitCount$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            int i19 = size - i18;
            if (i19 > 0 && i19 >= 0) {
                while (true) {
                    com.p314xaae8f345.mm.vfs.r6 r6Var2 = (com.p314xaae8f345.mm.vfs.r6) z07.get(i17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "clearExpiredItem path:" + r6Var2.u());
                    r6Var2.l();
                    if (i17 == i19) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$clearExpiredItem$1");
    }
}
