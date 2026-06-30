package yb4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final yb4.a f542230a = new yb4.a();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f542231b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f542232c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f542233d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f542234e;

    /* renamed from: f, reason: collision with root package name */
    public static long f542235f;

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canBrowseCmtImgOrEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
        boolean z17 = true;
        if (!b()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canBrowseCmtImg", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            boolean z18 = f542233d || f542234e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canBrowseCmtImg", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            if (!z18) {
                z17 = false;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canBrowseCmtImgOrEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
        return z17;
    }

    public final boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canBrowseEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
        c();
        boolean z17 = f542231b || f542232c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canBrowseEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
        return z17;
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkUpdateConfig", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f542235f >= 600000) {
            boolean a07 = c01.e2.a0();
            f542235f = currentTimeMillis;
            f542231b = j62.e.g().c(a07 ? new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17835xa8fde97() : new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17834xf0ba01ee()) == 1;
            f542232c = j62.e.g().c(a07 ? new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17829x19caed59() : new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17828x1d6c6830()) == 1;
            f542233d = j62.e.g().c(a07 ? new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17837xd76d689e() : new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17836xfc5d2635()) == 1;
            f542234e = j62.e.g().c(a07 ? new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17831x60d0a89c() : new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17830xb9f05eb3()) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCmtEmoticonConfig", "checkUpdateConfig is time to update canSendEmoticon: " + f542231b + " canBrowseEmoticon: " + f542232c + " canSendCmtImg: " + f542233d + " canBrowseCmtImg: " + f542234e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUpdateConfig", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
    }
}
