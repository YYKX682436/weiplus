package com.tencent.mm.plugin.fcm;

/* loaded from: classes8.dex */
public class WCFirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.List f101690n = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mars.comm.MMWakerLock f101691m;

    public static void i() {
        android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.booter.NotifyReceiver.NotifyService.class);
        intent.putExtra("notify_option_type", 2);
        intent.putExtra("notify_uin", gm0.m.i());
        intent.putExtra("notify_respType", 2147480001);
        intent.putExtra("notify_respBuf", new byte[0]);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        intent.putExtra("notfiy_recv_time", java.lang.System.currentTimeMillis());
        gm0.j1.i();
        intent.putExtra("notify_skey", gm0.j1.n().c(1));
        j45.l.A(intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "summerauths tryDoSync end!");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "Deleted messages on server.");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(11250, "1," + java.lang.String.valueOf(1));
        jx3.f.INSTANCE.idkeyStat(901L, 31L, 1L, false);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void f(com.google.firebase.messaging.RemoteMessage remoteMessage) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "on message received");
        if (a92.b.b() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FCM.WCFirebaseMessagingService", "fcmRegister is null");
            jx3.f.INSTANCE.idkeyStat(901L, 26L, 1L, false);
            return;
        }
        if (!(!android.text.TextUtils.isEmpty(a92.f.b()))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FCM.WCFirebaseMessagingService", "fcm push not reg to server.");
            jx3.f.INSTANCE.idkeyStat(901L, 25L, 1L, false);
            return;
        }
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (gm0.k2.c(context)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "Logout or exit MM. no need show Notification.");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(11250, "1," + java.lang.String.valueOf(2));
                jx3.f.INSTANCE.idkeyStat(901L, 28L, 1L, false);
                return;
            }
            java.util.Map D = remoteMessage.D();
            if (D.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "msg data is empty: ");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(11250, "1," + java.lang.String.valueOf(0));
                jx3.f.INSTANCE.idkeyStat(901L, 29L, 1L, false);
                return;
            }
            java.lang.String str = (java.lang.String) D.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ);
            java.lang.String str2 = (java.lang.String) D.get("uin");
            java.lang.String str3 = (java.lang.String) D.get("cmd");
            java.lang.String str4 = (java.lang.String) D.get(dm.i4.COL_USERNAME);
            java.lang.String str5 = (java.lang.String) D.get("time");
            java.lang.String str6 = (java.lang.String) D.get("collapse_key");
            java.lang.String str7 = (java.lang.String) D.get("sound");
            java.lang.String str8 = (java.lang.String) D.get("alert");
            java.lang.String str9 = (java.lang.String) D.get("msgType");
            java.lang.String str10 = (java.lang.String) D.get("badge");
            java.lang.String str11 = (java.lang.String) D.get("from");
            if (D.containsKey("rurl")) {
                try {
                    if (D.containsKey("rdata")) {
                        final java.lang.String str12 = (java.lang.String) D.get("rurl");
                        final java.lang.String str13 = (java.lang.String) D.get("rdata");
                        if (!android.text.TextUtils.isEmpty(str12) && !android.text.TextUtils.isEmpty(str13)) {
                            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: a92.i$$a
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Removed duplicated region for block: B:62:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:68:? A[SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:69:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                /* JADX WARN: Type inference failed for: r1v3 */
                                /* JADX WARN: Type inference failed for: r1v5, types: [com.tencent.mm.network.h2] */
                                /* JADX WARN: Type inference failed for: r1v7 */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void run() {
                                    /*
                                        Method dump skipped, instructions count: 308
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: a92.i$$a.run():void");
                                }
                            });
                        }
                    }
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.tencent.mars.xlog.Log.e("MicroMsg.FCM.WCFirebaseMessagingService", "onMessageReceived error :" + e.toString());
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FCM.WCFirebaseMessagingService", e, "", new java.lang.Object[0]);
                    jx3.f.INSTANCE.idkeyStat(901L, 36L, 1L, false);
                }
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(901L, 32L, 1L, false);
            java.lang.Object[] objArr = new java.lang.Object[11];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = str3;
            objArr[3] = com.tencent.mm.sdk.platformtools.t8.G1(str4);
            objArr[4] = str5;
            objArr[5] = str6;
            objArr[6] = str7;
            objArr[7] = java.lang.Integer.valueOf(str8 == null ? -1 : str8.length());
            objArr[8] = str9;
            objArr[9] = str10;
            objArr[10] = str11;
            com.tencent.mars.xlog.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "Received gcm msg. seq[%s] uin[%s] cmd[%s] username[%s] time[%s] collapse_key[%s] sound[%s] alert len[%s], msgType[%s], badge[%s], from[%s]", objArr);
            long V = com.tencent.mm.sdk.platformtools.t8.K0(str2) ? 0L : com.tencent.mm.sdk.platformtools.t8.V(str2, 0L);
            long V2 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? 0L : com.tencent.mm.sdk.platformtools.t8.V(str, 0L);
            long V3 = com.tencent.mm.sdk.platformtools.t8.K0(str3) ? 0L : com.tencent.mm.sdk.platformtools.t8.V(str3, 0L);
            int i17 = gm0.m.i();
            try {
                if (V != 0 && java.lang.Integer.toHexString(i17).equals(java.lang.Long.toHexString(V))) {
                    java.util.Iterator it = f101690n.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z17 = false;
                            break;
                        }
                        android.util.Pair pair = (android.util.Pair) it.next();
                        if (((java.lang.Long) pair.first).longValue() == V3 && ((java.lang.Long) pair.second).longValue() == V2) {
                            z17 = true;
                            break;
                        }
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.FCM.WCFirebaseMessagingService", "already has this seq:" + V2);
                        jx3.f.INSTANCE.idkeyStat(901L, 35L, 1L, false);
                        return;
                    }
                    java.util.List list = f101690n;
                    ((java.util.LinkedList) list).add(android.util.Pair.create(java.lang.Long.valueOf(V3), java.lang.Long.valueOf(V2)));
                    if (((java.util.LinkedList) list).size() > 60) {
                        ((java.util.LinkedList) list).remove(0);
                    }
                    if (this.f101691m == null) {
                        this.f101691m = new com.tencent.mars.comm.MMWakerLock(context, "MicroMsg.FCM.WCFirebaseMessagingService");
                        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "start new wakerlock");
                    }
                    this.f101691m.lock(200L, "FcmBroadcastReceiver.onReceive");
                    com.tencent.mars.xlog.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "summerauths tryDoSync");
                    i();
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.FCM.WCFirebaseMessagingService", "Logined user changed. no need show Notification.uin:" + V + ", oldUin:" + i17);
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1,");
                sb6.append(java.lang.String.valueOf(3));
                g0Var.kvStat(11250, sb6.toString());
                fVar.idkeyStat(901L, V == 0 ? 33L : 34L, 1L, false);
            } catch (java.lang.Exception e18) {
                e = e18;
                com.tencent.mars.xlog.Log.e("MicroMsg.FCM.WCFirebaseMessagingService", "onMessageReceived error :" + e.toString());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FCM.WCFirebaseMessagingService", e, "", new java.lang.Object[0]);
                jx3.f.INSTANCE.idkeyStat(901L, 36L, 1L, false);
            }
        } catch (java.lang.Exception e19) {
            e = e19;
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void g(java.lang.String str, java.lang.Exception exc) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(11250, "1," + java.lang.String.valueOf(1));
        jx3.f.INSTANCE.idkeyStat(901L, 30L, 1L, false);
    }
}
