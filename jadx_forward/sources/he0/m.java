package he0;

/* loaded from: classes.dex */
public class m extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListener");
        if (gm0.j1.a()) {
            int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsHEVCSwitch", 0);
            int b18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsWXPCSwitch", 0);
            boolean z17 = b17 == 1;
            boolean z18 = b18 == 1;
            android.content.SharedPreferences.Editor edit = com.p314xaae8f345.mm.sdk.p2603x2137b148.l4.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "sp_sns_dynswitch_stg", 4, false).edit();
            edit.putBoolean("sw_use_vcodec_img", z17);
            edit.putBoolean("sw_use_wxpc_img", z18);
            edit.commit();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListener");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DynamicConfigUpdatedListener", "PostSyncTaskEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListener");
        return false;
    }
}
