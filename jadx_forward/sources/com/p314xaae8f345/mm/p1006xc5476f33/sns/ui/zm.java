package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class zm {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ym f253233a;

    /* renamed from: b, reason: collision with root package name */
    public int f253234b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.BroadcastReceiver f253235c;

    public zm() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xm xmVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xm(this);
        this.f253235c = xmVar;
        this.f253234b = b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("registerBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unregisterBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(xmVar);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unregisterBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(xmVar, intentFilter);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
    }

    public static /* synthetic */ int a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zm zmVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        int i17 = zmVar.f253234b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        return i17;
    }

    public final int b() {
        android.net.NetworkInfo networkInfo;
        boolean m40092xb9aa8b5f;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("currentNetworkStatus", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!r75.d.f474794h) {
            networkInfo = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40058x63929c60(context);
        } else if (r75.d.f474789c == null) {
            networkInfo = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40058x63929c60(context);
            r75.d.f474789c = networkInfo;
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetWorkCache", "getActiveNetworkInfoFromCache");
            networkInfo = r75.d.f474789c;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40081x23b734ff(networkInfo)) {
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (!r75.d.f474792f) {
                m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context2);
            } else if (r75.d.f474790d == -100) {
                int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context2);
                r75.d.f474790d = m40067xab9ed241;
                m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(m40067xab9ed241);
            } else {
                ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context2), "SystemServiceCallingCache-UpdateNetWorkCache");
                m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(r75.d.f474790d);
            }
            if (m40092xb9aa8b5f) {
                i17 = 5;
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                i17 = 2;
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                i17 = 3;
            } else {
                if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsNetworkMgr", "failed and return 4g");
                }
                i17 = 4;
            }
        } else {
            i17 = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsNetworkMgr", "currentNetworkStatus:%s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("currentNetworkStatus", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        return i17;
    }
}
