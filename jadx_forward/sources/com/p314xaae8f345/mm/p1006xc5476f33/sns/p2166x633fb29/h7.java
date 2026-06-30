package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class h7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 f245775d;

    public h7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var) {
        this.f245775d = i7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$9");
        if (this.f245775d.f245841a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "download video finish cdnmediaId %s", this.f245775d.f245841a.f246346b);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var = this.f245775d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            java.util.Map map = i7Var.f245843c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            ((java.util.concurrent.ConcurrentHashMap) map).remove(this.f245775d.f245841a.f246346b);
        }
        this.f245775d.f245841a = null;
        this.f245775d.w();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$9");
    }
}
