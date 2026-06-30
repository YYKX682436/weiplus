package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class e7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f245709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 f245710f;

    public e7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var, java.lang.String str, java.lang.Object[] objArr) {
        this.f245710f = i7Var;
        this.f245708d = str;
        this.f245709e = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$6");
        t21.o2.Di().g(this.f245708d, this.f245709e);
        if (this.f245710f.f245841a != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f245710f.f245841a.f246346b, this.f245708d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var = this.f245710f;
            i7Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadVideoFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            cp.e.b("SnsVideoService", new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h7(i7Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadVideoFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var2 = this.f245710f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        java.util.Map map = i7Var2.f245843c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.c(this.f245710f).remove((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z7) ((java.util.concurrent.ConcurrentHashMap) map).get(this.f245708d));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$6");
    }
}
