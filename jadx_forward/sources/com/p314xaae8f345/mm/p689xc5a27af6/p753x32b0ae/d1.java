package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes15.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q80.e0 f148674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f148677g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i f148678h;

    public d1(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, q80.e0 e0Var, java.lang.String str, java.lang.String str2, android.app.Activity activity) {
        this.f148678h = iVar;
        this.f148674d = e0Var;
        this.f148675e = str;
        this.f148676f = str2;
        this.f148677g = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f148678h.f148711p;
        q80.e0 e0Var = this.f148674d;
        java.util.Map map2 = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map).get(e0Var.f442208a);
        java.lang.String str = this.f148675e;
        if (map2 != null && map2.get(str) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppFeatureService", "preloadLiteApp second, ignore! appId:%s page:%s", e0Var.f442208a, str);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
        oVar.b(6, new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943());
        oVar.d();
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(e0Var.f442208a, null);
        if (y17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppFeatureService", "cannot find liteapp appID:%s", e0Var.f442208a);
            return;
        }
        long m65288x9f34180c = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65288x9f34180c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp appId:%s page:%s appUuid:%d, preloadData:%s", e0Var.f442208a, str, java.lang.Long.valueOf(m65288x9f34180c), null);
        if ((kx5.n.h().f394854k != null) && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            kx5.n.h().n(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.c1(this, y17, m65288x9f34180c));
            return;
        }
        int c17 = e0Var.f442212e ? kx5.n.h().c() : kx5.n.h().o(true, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65420xd9c4f04e(e0Var.f442208a, this.f148675e, this.f148676f, y17.f14369x346425, y17.f14372xa8503287, c17, m65288x9f34180c);
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i.Ai(this.f148678h, this.f148674d, c17, m65288x9f34180c, this.f148677g, y17.f14369x346425, y17.f14372xa8503287, this.f148676f);
    }
}
