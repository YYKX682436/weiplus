package com.tencent.mm.platformtools;

/* loaded from: classes8.dex */
public class BroadcastHelper implements com.tencent.mm.booter.k {
    private static final java.lang.String TAG = "MicroMsg.BroadcastHelper";

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f72400a = 0;
    private static java.util.HashMap<java.lang.String, android.content.BroadcastReceiver> broadcastReceiverHashMap = new java.util.HashMap<>();

    public static void registerBroadcast(android.content.BroadcastReceiver broadcastReceiver, java.lang.String str) {
        registerBroadcast(broadcastReceiver, new java.lang.String[]{str}, new java.lang.String[0], 0);
    }

    public static void unRegisterBroadcast(android.content.BroadcastReceiver broadcastReceiver) {
        com.tencent.mars.xlog.Log.i(TAG, "unRegisterBroadcast: ".concat(broadcastReceiver.getClass().getSimpleName()));
        com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(broadcastReceiver);
    }

    @Override // com.tencent.mm.booter.k
    public void registerBroadcasts() {
        com.tencent.mars.xlog.Log.i(TAG, "registerBroadcasts(), process:%s", bm5.f1.a());
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            if (fp.h.c(24)) {
                android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.booter.MMReceivers$ConnectionReceiver
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(android.content.Context context, android.content.Intent intent) {
                        android.net.NetworkInfo networkInfo;
                        android.os.Process.myPid();
                        com.tencent.mars.xlog.Log.i("MicroMsg.ConnectionReceiver", "onReceive threadID: " + java.lang.Thread.currentThread().getId());
                        if (context == null) {
                            return;
                        }
                        if (!com.tencent.mm.booter.n.a(context, "connection", true)) {
                            com.tencent.mm.booter.MMReceivers$AlarmReceiver.c(context);
                            com.tencent.mars.xlog.Log.appenderFlush();
                            return;
                        }
                        if (((java.util.ArrayList) com.tencent.mm.network.x2.k().f72176e).isEmpty()) {
                            return;
                        }
                        try {
                            networkInfo = ((android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity")).getActiveNetworkInfo();
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ConnectionReceiver", "getActiveNetworkInfo failed. exception: %s", e17.getMessage());
                            networkInfo = null;
                        }
                        if (networkInfo != null && networkInfo.getState() == android.net.NetworkInfo.State.CONNECTED) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ConnectionReceiver", "NetworkAvailable: true");
                            com.tencent.mm.network.x2.l(context, true, networkInfo.getTypeName(), networkInfo.getSubtypeName());
                            return;
                        }
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        objArr[0] = networkInfo == null ? "null" : networkInfo.getState();
                        com.tencent.mars.xlog.Log.i("MicroMsg.ConnectionReceiver", "NetworkAvailable: false, state:%s", objArr);
                        java.lang.String str = com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
                        java.lang.String typeName = networkInfo == null ? com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE : networkInfo.getTypeName();
                        if (networkInfo != null) {
                            str = networkInfo.getSubtypeName();
                        }
                        com.tencent.mm.network.x2.l(context, false, typeName, str);
                    }
                };
                broadcastReceiverHashMap.put(com.tencent.mm.booter.MMReceivers$ConnectionReceiver.class.getSimpleName(), broadcastReceiver);
                registerBroadcast(broadcastReceiver, io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
            }
            com.tencent.mm.sdk.platformtools.v0.f193027a.l();
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.sdk.platformtools.v0.f193027a.l();
            if (fp.h.c(26)) {
                com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver entryReceiver = new com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver();
                broadcastReceiverHashMap.put(com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver.class.getSimpleName(), entryReceiver);
                if (fp.h.a(33)) {
                    registerBroadcast(entryReceiver, new java.lang.String[]{com.tencent.mm.opensdk.constants.ConstantsAPI.ACTION_HANDLE_APP_REGISTER, com.tencent.mm.opensdk.constants.ConstantsAPI.ACTION_HANDLE_APP_UNREGISTER});
                } else {
                    registerBroadcast(entryReceiver, new java.lang.String[]{com.tencent.mm.opensdk.constants.ConstantsAPI.ACTION_HANDLE_APP_REGISTER, com.tencent.mm.opensdk.constants.ConstantsAPI.ACTION_HANDLE_APP_UNREGISTER}, 2);
                }
                ((sy.x) ((ty.n0) i95.n0.c(ty.n0.class))).getClass();
                com.tencent.mm.ui.tools.QbCallBackBroadcast qbCallBackBroadcast = new com.tencent.mm.ui.tools.QbCallBackBroadcast();
                broadcastReceiverHashMap.put("com.tencent.mm.ui.tools.QbCallBackBroadcast", qbCallBackBroadcast);
                if (fp.h.a(33)) {
                    registerBroadcast(qbCallBackBroadcast, "com.tencent.mm.qb");
                } else {
                    registerBroadcast(qbCallBackBroadcast, "com.tencent.mm.qb", 2);
                }
            }
        }
        ((ku5.t0) ku5.t0.f312615d).g(new x51.j(this));
    }

    @Override // com.tencent.mm.booter.k
    public void unRegisterBroadcasts() {
        com.tencent.mars.xlog.Log.i(TAG, "unRegisterBroadcasts()");
        try {
            if (com.tencent.mm.sdk.platformtools.x2.p()) {
                if (fp.h.c(24)) {
                    unRegisterBroadcast((com.tencent.mm.booter.MMReceivers$ConnectionReceiver) broadcastReceiverHashMap.get(com.tencent.mm.booter.MMReceivers$ConnectionReceiver.class.getSimpleName()));
                }
                com.tencent.mm.sdk.platformtools.v0.f193027a.m();
            }
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                com.tencent.mm.sdk.platformtools.v0.f193027a.m();
                if (fp.h.c(26)) {
                    unRegisterBroadcast((com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver) broadcastReceiverHashMap.get(com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver.class.getSimpleName()));
                    unRegisterBroadcast(broadcastReceiverHashMap.get("com.tencent.mm.ui.tools.QbCallBackBroadcast"));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "unRegisterBroadcasts() Exception = %s ", e17.getMessage());
        }
    }

    public static void registerBroadcast(android.content.BroadcastReceiver broadcastReceiver, java.lang.String str, int i17) {
        registerBroadcast(broadcastReceiver, new java.lang.String[]{str}, new java.lang.String[0], i17);
    }

    public static void registerBroadcast(android.content.BroadcastReceiver broadcastReceiver, java.lang.String[] strArr) {
        registerBroadcast(broadcastReceiver, strArr, new java.lang.String[0], 0);
    }

    public static void registerBroadcast(android.content.BroadcastReceiver broadcastReceiver, java.lang.String[] strArr, int i17) {
        registerBroadcast(broadcastReceiver, strArr, new java.lang.String[0], i17);
    }

    public static void registerBroadcast(android.content.BroadcastReceiver broadcastReceiver, java.lang.String[] strArr, java.lang.String[] strArr2, int i17) {
        com.tencent.mars.xlog.Log.i(TAG, "registerBroadcast: ".concat(broadcastReceiver.getClass().getSimpleName()));
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        if (!com.tencent.mm.sdk.platformtools.t8.N0(strArr)) {
            for (java.lang.String str : strArr) {
                intentFilter.addAction(str);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.N0(strArr2)) {
            for (java.lang.String str2 : strArr2) {
                intentFilter.addCategory(str2);
            }
        }
        if (!fp.h.a(33) && i17 != 0) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(broadcastReceiver, intentFilter, i17);
        } else {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
