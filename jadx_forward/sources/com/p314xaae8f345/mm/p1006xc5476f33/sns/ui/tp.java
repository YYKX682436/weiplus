package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class tp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f252075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.up f252076e;

    public tp(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.up upVar, android.content.Intent intent) {
        this.f252076e = upVar;
        this.f252075d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$2$1");
        com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
        android.content.Intent intent = this.f252075d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.up upVar = this.f252076e;
        y7Var.D(intent, upVar.f252125f);
        upVar.f252125f.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$2$1");
    }
}
