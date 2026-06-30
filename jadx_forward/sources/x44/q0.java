package x44;

/* loaded from: classes4.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w44.b f533411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x44.r0 f533412e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(w44.b bVar, x44.r0 r0Var) {
        super(0);
        this.f533411d = bVar;
        this.f533412e = r0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.NotifyTimelineComment$doAction$1");
        x44.r0 r0Var = this.f533412e;
        w44.b bVar = this.f533411d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.NotifyTimelineComment$doAction$1");
        try {
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17750xfe564190) bVar.a()).isFinishing() && !((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17750xfe564190) bVar.a()).isDestroyed()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17750xfe564190) bVar.a()).V6();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 209);
            java.lang.String k17 = bVar.b().k();
            if (k17 == null) {
                k17 = "";
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6041x7b842b40 c6041x7b842b40 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6041x7b842b40();
            c6041x7b842b40.f136330g.f88242a = k17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.NotifyTimelineComment", "event publish, snsId is ".concat(k17));
            c6041x7b842b40.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.NotifyTimelineComment");
            org.json.JSONObject l17 = r0Var.l();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.NotifyTimelineComment");
            r0Var.b(l17);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdJs.NotifyTimelineComment failed", th6);
            r0Var.b(r0Var.g("SnsAdJs.NotifyTimelineComment failed: " + th6.getMessage()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.NotifyTimelineComment$doAction$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.NotifyTimelineComment$doAction$1");
        return f0Var;
    }
}
