package com.p314xaae8f345.mm.p1006xc5476f33.fcm;

/* renamed from: com.tencent.mm.plugin.fcm.WCFirebaseMessagingService */
/* loaded from: classes8.dex */
public class ServiceC13631x7118ce24 extends com.p176xb6135e39.p271xde6bf207.p278xaa2b3704.ServiceC2749x37996758 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.List f183223n = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 f183224m;

    public static void i() {
        android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.NotifyService.class);
        intent.putExtra("notify_option_type", 2);
        intent.putExtra("notify_uin", gm0.m.i());
        intent.putExtra("notify_respType", 2147480001);
        intent.putExtra("notify_respBuf", new byte[0]);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        intent.putExtra("notfiy_recv_time", java.lang.System.currentTimeMillis());
        gm0.j1.i();
        intent.putExtra("notify_skey", gm0.j1.n().c(1));
        j45.l.A(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "summerauths tryDoSync end!");
    }

    @Override // com.p176xb6135e39.p271xde6bf207.p278xaa2b3704.ServiceC2749x37996758
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "Deleted messages on server.");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(11250, "1," + java.lang.String.valueOf(1));
        jx3.f.INSTANCE.mo68477x336bdfd8(901L, 31L, 1L, false);
    }

    @Override // com.p176xb6135e39.p271xde6bf207.p278xaa2b3704.ServiceC2749x37996758
    public void f(com.p176xb6135e39.p271xde6bf207.p278xaa2b3704.C2750x874314c1 c2750x874314c1) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "on message received");
        if (a92.b.b() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.WCFirebaseMessagingService", "fcmRegister is null");
            jx3.f.INSTANCE.mo68477x336bdfd8(901L, 26L, 1L, false);
            return;
        }
        if (!(!android.text.TextUtils.isEmpty(a92.f.b()))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.WCFirebaseMessagingService", "fcm push not reg to server.");
            jx3.f.INSTANCE.mo68477x336bdfd8(901L, 25L, 1L, false);
            return;
        }
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (gm0.k2.c(context)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "Logout or exit MM. no need show Notification.");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(11250, "1," + java.lang.String.valueOf(2));
                jx3.f.INSTANCE.mo68477x336bdfd8(901L, 28L, 1L, false);
                return;
            }
            java.util.Map D = c2750x874314c1.D();
            if (D.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "msg data is empty: ");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(11250, "1," + java.lang.String.valueOf(0));
                jx3.f.INSTANCE.mo68477x336bdfd8(901L, 29L, 1L, false);
                return;
            }
            java.lang.String str = (java.lang.String) D.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb);
            java.lang.String str2 = (java.lang.String) D.get("uin");
            java.lang.String str3 = (java.lang.String) D.get("cmd");
            java.lang.String str4 = (java.lang.String) D.get(dm.i4.f66875xa013b0d5);
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
                            ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: a92.i$$a
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
                                    throw new UnsupportedOperationException("Method not decompiled: a92.RunnableC0006x3046d8.run():void");
                                }
                            });
                        }
                    }
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FCM.WCFirebaseMessagingService", "onMessageReceived error :" + e.toString());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FCM.WCFirebaseMessagingService", e, "", new java.lang.Object[0]);
                    jx3.f.INSTANCE.mo68477x336bdfd8(901L, 36L, 1L, false);
                }
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(901L, 32L, 1L, false);
            java.lang.Object[] objArr = new java.lang.Object[11];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = str3;
            objArr[3] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str4);
            objArr[4] = str5;
            objArr[5] = str6;
            objArr[6] = str7;
            objArr[7] = java.lang.Integer.valueOf(str8 == null ? -1 : str8.length());
            objArr[8] = str9;
            objArr[9] = str10;
            objArr[10] = str11;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "Received gcm msg. seq[%s] uin[%s] cmd[%s] username[%s] time[%s] collapse_key[%s] sound[%s] alert len[%s], msgType[%s], badge[%s], from[%s]", objArr);
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? 0L : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str2, 0L);
            long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? 0L : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str, 0L);
            long V3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? 0L : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str3, 0L);
            int i17 = gm0.m.i();
            try {
                if (V != 0 && java.lang.Integer.toHexString(i17).equals(java.lang.Long.toHexString(V))) {
                    java.util.Iterator it = f183223n.iterator();
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
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.WCFirebaseMessagingService", "already has this seq:" + V2);
                        jx3.f.INSTANCE.mo68477x336bdfd8(901L, 35L, 1L, false);
                        return;
                    }
                    java.util.List list = f183223n;
                    ((java.util.LinkedList) list).add(android.util.Pair.create(java.lang.Long.valueOf(V3), java.lang.Long.valueOf(V2)));
                    if (((java.util.LinkedList) list).size() > 60) {
                        ((java.util.LinkedList) list).remove(0);
                    }
                    if (this.f183224m == null) {
                        this.f183224m = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9(context, "MicroMsg.FCM.WCFirebaseMessagingService");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "start new wakerlock");
                    }
                    this.f183224m.m40015x32c52b(200L, "FcmBroadcastReceiver.onReceive");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.WCFirebaseMessagingService", "summerauths tryDoSync");
                    i();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FCM.WCFirebaseMessagingService", "Logined user changed. no need show Notification.uin:" + V + ", oldUin:" + i17);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1,");
                sb6.append(java.lang.String.valueOf(3));
                g0Var.mo68478xbd3cda5f(11250, sb6.toString());
                fVar.mo68477x336bdfd8(901L, V == 0 ? 33L : 34L, 1L, false);
            } catch (java.lang.Exception e18) {
                e = e18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FCM.WCFirebaseMessagingService", "onMessageReceived error :" + e.toString());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FCM.WCFirebaseMessagingService", e, "", new java.lang.Object[0]);
                jx3.f.INSTANCE.mo68477x336bdfd8(901L, 36L, 1L, false);
            }
        } catch (java.lang.Exception e19) {
            e = e19;
        }
    }

    @Override // com.p176xb6135e39.p271xde6bf207.p278xaa2b3704.ServiceC2749x37996758
    public void g(java.lang.String str, java.lang.Exception exc) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(11250, "1," + java.lang.String.valueOf(1));
        jx3.f.INSTANCE.mo68477x336bdfd8(901L, 30L, 1L, false);
    }
}
