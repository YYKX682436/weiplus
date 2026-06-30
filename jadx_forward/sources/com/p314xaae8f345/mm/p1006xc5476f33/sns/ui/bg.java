package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class bg implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 f249445a;

    public bg(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662) {
        this.f249445a = c18037xf8026662;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("append", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.l(this.f249445a).n(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsCommentFooter", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("append", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("del", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = this.f249445a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.l(c18037xf8026662) != null) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.l(c18037xf8026662).mo81352x6a67d012() == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("del", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.l(c18037xf8026662).mo81352x6a67d012().sendKeyEvent(new android.view.KeyEvent(0, 67));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.l(c18037xf8026662).mo81352x6a67d012().sendKeyEvent(new android.view.KeyEvent(1, 67));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("del", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onToSendTextEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.I1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = this.f249445a;
        boolean z18 = c18037xf8026662.I;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (!z18) {
            c18037xf8026662.m70733xbe62a411(z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onToSendTextEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("performSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("performSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
    }
}
