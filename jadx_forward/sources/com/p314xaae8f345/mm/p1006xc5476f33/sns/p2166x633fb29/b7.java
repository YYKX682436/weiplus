package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 f245634d;

    public b7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var) {
        this.f245634d = i7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$3");
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.b(this.f245634d)) {
            while (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.b(this.f245634d).size() > 0) {
                try {
                    ((t21.v0) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.b(this.f245634d).poll()).e();
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$3");
                    throw th6;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$3");
    }
}
