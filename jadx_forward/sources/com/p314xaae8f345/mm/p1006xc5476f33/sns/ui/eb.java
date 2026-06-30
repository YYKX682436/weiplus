package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class eb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fb f249765d;

    public eb(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fb fbVar) {
        this.f249765d = fbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fb fbVar = this.f249765d;
        android.content.Context applicationContext = fbVar.f249870a.getApplicationContext();
        if (applicationContext != null) {
            db5.t7.g(applicationContext, "广告无效，已为你关闭");
        }
        fbVar.f249870a.l8();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12$1");
    }
}
