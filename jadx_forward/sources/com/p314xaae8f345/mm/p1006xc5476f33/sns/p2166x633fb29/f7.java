package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class f7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z7 f245726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f245727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 f245728f;

    public f7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z7 z7Var, boolean z17) {
        this.f245728f = i7Var;
        this.f245726d = z7Var;
        this.f245727e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z7 z7Var = this.f245726d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$7");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(ca4.m0.k(z7Var.f246350f, z7Var.f246348d.f459388d + "_"));
            z7Var.f246345a = k17 != null ? k17.m70374x6bf53a6c() : "";
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoService", e17.toString());
        }
        boolean z17 = this.f245727e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "offer [%b] video task[%s] to queue ", java.lang.Boolean.valueOf(z17), z7Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var = this.f245728f;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.c(i7Var).offerFirst(z7Var);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.c(i7Var).offerLast(z7Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        java.util.Map map = i7Var.f245843c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        ((java.util.concurrent.ConcurrentHashMap) map).put(z7Var.f246346b, z7Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$7");
    }
}
