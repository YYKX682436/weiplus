package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class xm extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zm f253105a;

    public xm(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zm zmVar) {
        this.f253105a = zmVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceive", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr$1");
        if (intent.getAction().equals(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsNetworkMgr", "connChangedBroadcastReceiver");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zm zmVar = this.f253105a;
            int a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zm.a(zmVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            int b17 = zmVar.b();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            zmVar.f253234b = b17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsNetworkMgr", "network change current:%s change:%s", java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zm.a(zmVar)));
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zm.a(zmVar) != a17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ym ymVar = zmVar.f253233a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                if (ymVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ym ymVar2 = zmVar.f253233a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zm.a(zmVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sv svVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sv) ymVar2;
                    svVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNetWorkChange", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager$init$1");
                    je4.b bVar = je4.b.f380849a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSnsNetworkMgr$p", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uv uvVar = svVar.f252020a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zm zmVar2 = uvVar.f252130a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSnsNetworkMgr$p", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
                    boolean a18 = bVar.a(zmVar2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setSnsAutoPlay$p", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
                    uvVar.f252131b = a18;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setSnsAutoPlay$p", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNetWorkChange", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager$init$1");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceive", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr$1");
    }
}
