package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class w1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f252262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f252263e;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v1 v1Var, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f252262d = list;
        this.f252263e = c17933xe8d1b226;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public void mo889xb349b3ab() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDismiss", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager$1");
        if (this.f252262d.contains(2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiscroMsg.CommentDetailMenuManager", "[dismiss] didShow edit sns group");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.G(2, false, ca4.z0.T(this.f252263e));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDismiss", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager$1");
    }
}
