package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class n2 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o2 {

    /* renamed from: s, reason: collision with root package name */
    public final int f251494s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f251494s = 43;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o2
    public int o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsType", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsType", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        return this.f251494s;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o2
    public void p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 packHelper) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packHelper, "packHelper");
        android.content.Intent intent = context.getIntent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(intent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j2 j2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j2(packHelper);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        q(intent, "Ksnsupload_title", new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m2(j2Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k2 k2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k2(packHelper);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        q(intent, "Ksnsupload_link", new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m2(k2Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        q(intent, "Ksnsupload_imgurl", new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l2(packHelper));
        super.p(context, packHelper);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
    }

    public final java.lang.String q(android.content.Intent intent, java.lang.String str, yz5.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        java.lang.String stringExtra = intent.getStringExtra(str);
        java.lang.String str2 = null;
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                lVar.mo146xb9724478(stringExtra);
                str2 = stringExtra;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        return str2;
    }
}
