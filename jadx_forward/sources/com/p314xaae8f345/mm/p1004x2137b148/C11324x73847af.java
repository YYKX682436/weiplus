package com.p314xaae8f345.mm.p1004x2137b148;

/* renamed from: com.tencent.mm.platformtools.BroadcastHelper */
/* loaded from: classes8.dex */
public class C11324x73847af implements com.p314xaae8f345.mm.p642xad8b531f.k {
    private static final java.lang.String TAG = "MicroMsg.BroadcastHelper";

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f153933a = 0;

    /* renamed from: broadcastReceiverHashMap */
    private static java.util.HashMap<java.lang.String, android.content.BroadcastReceiver> f33340xb2acb17e = new java.util.HashMap<>();

    /* renamed from: registerBroadcast */
    public static void m48607xf4aea15e(android.content.BroadcastReceiver broadcastReceiver, java.lang.String str) {
        m48611xf4aea15e(broadcastReceiver, new java.lang.String[]{str}, new java.lang.String[0], 0);
    }

    /* renamed from: unRegisterBroadcast */
    public static void m48612x5500b7c5(android.content.BroadcastReceiver broadcastReceiver) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "unRegisterBroadcast: ".concat(broadcastReceiver.getClass().getSimpleName()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(broadcastReceiver);
    }

    @Override // com.p314xaae8f345.mm.p642xad8b531f.k
    /* renamed from: registerBroadcasts */
    public void mo43387xa1258ad5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "registerBroadcasts(), process:%s", bm5.f1.a());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            if (fp.h.c(24)) {
                android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.booter.MMReceivers$ConnectionReceiver
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(android.content.Context context, android.content.Intent intent) {
                        android.net.NetworkInfo networkInfo;
                        android.os.Process.myPid();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectionReceiver", "onReceive threadID: " + java.lang.Thread.currentThread().getId());
                        if (context == null) {
                            return;
                        }
                        if (!com.p314xaae8f345.mm.p642xad8b531f.n.a(context, "connection", true)) {
                            com.p314xaae8f345.mm.p642xad8b531f.C10290xfadc4140.c(context);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
                            return;
                        }
                        if (((java.util.ArrayList) com.p314xaae8f345.mm.p971x6de15a2e.x2.k().f153709e).isEmpty()) {
                            return;
                        }
                        try {
                            networkInfo = ((android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity")).getActiveNetworkInfo();
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConnectionReceiver", "getActiveNetworkInfo failed. exception: %s", e17.getMessage());
                            networkInfo = null;
                        }
                        if (networkInfo != null && networkInfo.getState() == android.net.NetworkInfo.State.CONNECTED) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectionReceiver", "NetworkAvailable: true");
                            com.p314xaae8f345.mm.p971x6de15a2e.x2.l(context, true, networkInfo.getTypeName(), networkInfo.getSubtypeName());
                            return;
                        }
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        objArr[0] = networkInfo == null ? "null" : networkInfo.getState();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectionReceiver", "NetworkAvailable: false, state:%s", objArr);
                        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc;
                        java.lang.String typeName = networkInfo == null ? com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc : networkInfo.getTypeName();
                        if (networkInfo != null) {
                            str = networkInfo.getSubtypeName();
                        }
                        com.p314xaae8f345.mm.p971x6de15a2e.x2.l(context, false, typeName, str);
                    }
                };
                f33340xb2acb17e.put(com.p314xaae8f345.mm.p642xad8b531f.C10292xc832e10d.class.getSimpleName(), broadcastReceiver);
                m48607xf4aea15e(broadcastReceiver, io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.l();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.l();
            if (fp.h.c(26)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.EntryReceiver entryReceiver = new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.EntryReceiver();
                f33340xb2acb17e.put(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.EntryReceiver.class.getSimpleName(), entryReceiver);
                if (fp.h.a(33)) {
                    m48609xf4aea15e(entryReceiver, new java.lang.String[]{com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32757x65d6144f, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32758xe9ebbae8});
                } else {
                    m48610xf4aea15e(entryReceiver, new java.lang.String[]{com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32757x65d6144f, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32758xe9ebbae8}, 2);
                }
                ((sy.x) ((ty.n0) i95.n0.c(ty.n0.class))).getClass();
                com.p314xaae8f345.mm.ui.p2740x696c9db.C22519x47cc53ab c22519x47cc53ab = new com.p314xaae8f345.mm.ui.p2740x696c9db.C22519x47cc53ab();
                f33340xb2acb17e.put("com.tencent.mm.ui.tools.QbCallBackBroadcast", c22519x47cc53ab);
                if (fp.h.a(33)) {
                    m48607xf4aea15e(c22519x47cc53ab, "com.tencent.mm.qb");
                } else {
                    m48608xf4aea15e(c22519x47cc53ab, "com.tencent.mm.qb", 2);
                }
            }
        }
        ((ku5.t0) ku5.t0.f394148d).g(new x51.j(this));
    }

    @Override // com.p314xaae8f345.mm.p642xad8b531f.k
    /* renamed from: unRegisterBroadcasts */
    public void mo43388x4b16414e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "unRegisterBroadcasts()");
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
                if (fp.h.c(24)) {
                    m48612x5500b7c5((com.p314xaae8f345.mm.p642xad8b531f.C10292xc832e10d) f33340xb2acb17e.get(com.p314xaae8f345.mm.p642xad8b531f.C10292xc832e10d.class.getSimpleName()));
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.m();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.m();
                if (fp.h.c(26)) {
                    m48612x5500b7c5((com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.EntryReceiver) f33340xb2acb17e.get(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.EntryReceiver.class.getSimpleName()));
                    m48612x5500b7c5(f33340xb2acb17e.get("com.tencent.mm.ui.tools.QbCallBackBroadcast"));
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "unRegisterBroadcasts() Exception = %s ", e17.getMessage());
        }
    }

    /* renamed from: registerBroadcast */
    public static void m48608xf4aea15e(android.content.BroadcastReceiver broadcastReceiver, java.lang.String str, int i17) {
        m48611xf4aea15e(broadcastReceiver, new java.lang.String[]{str}, new java.lang.String[0], i17);
    }

    /* renamed from: registerBroadcast */
    public static void m48609xf4aea15e(android.content.BroadcastReceiver broadcastReceiver, java.lang.String[] strArr) {
        m48611xf4aea15e(broadcastReceiver, strArr, new java.lang.String[0], 0);
    }

    /* renamed from: registerBroadcast */
    public static void m48610xf4aea15e(android.content.BroadcastReceiver broadcastReceiver, java.lang.String[] strArr, int i17) {
        m48611xf4aea15e(broadcastReceiver, strArr, new java.lang.String[0], i17);
    }

    /* renamed from: registerBroadcast */
    public static void m48611xf4aea15e(android.content.BroadcastReceiver broadcastReceiver, java.lang.String[] strArr, java.lang.String[] strArr2, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "registerBroadcast: ".concat(broadcastReceiver.getClass().getSimpleName()));
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(strArr)) {
            for (java.lang.String str : strArr) {
                intentFilter.addAction(str);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(strArr2)) {
            for (java.lang.String str2 : strArr2) {
                intentFilter.addCategory(str2);
            }
        }
        if (!fp.h.a(33) && i17 != 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(broadcastReceiver, intentFilter, i17);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
