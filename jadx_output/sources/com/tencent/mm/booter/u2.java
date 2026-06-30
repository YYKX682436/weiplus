package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.booter.u2 f63578a = new com.tencent.mm.booter.u2();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f63579b = jz5.h.b(com.tencent.mm.booter.s2.f63569d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f63580c = jz5.h.a(jz5.i.f302829d, com.tencent.mm.booter.r2.f63560d);

    public static final boolean a() {
        return ((java.lang.Boolean) f63580c.getValue()).booleanValue();
    }

    public final void b(android.content.Context context, android.content.Intent intent, java.lang.String str) {
        if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            c(context, intent, str);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.booter.t2(context, intent, str));
    }

    public final long c(android.content.Context context, android.content.Intent intent, java.lang.String str) {
        long c17 = com.tencent.mm.booter.CoreService.c();
        intent.putExtra("notfiy_sync_num", c17);
        intent.putExtra("notfiy_recv_time", java.lang.System.currentTimeMillis());
        kz5.c0.i(268369921, 138, 2147480001, 1000000205, 1000000800).contains(java.lang.Integer.valueOf(com.tencent.mm.booter.v2.b(intent)));
        com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain", "sendToNotifyReceiver: " + com.tencent.mm.booter.v2.a(intent));
        if (com.tencent.mm.sdk.platformtools.x2.f193077g) {
            try {
                com.tencent.mars.xlog.Log.w("MicroMsg.PushToMain", "quitMainProcStandby");
                ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).getClass();
                ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
                dr0.p1.f242489d.a().k(false);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.PushToMain", "quitMainProcStandby failed: " + e17.getMessage());
            }
        }
        try {
            d(context, intent);
            e(context, intent);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PushToMain", "sendMsgToNotifyReceiver failed:%s", com.tencent.mm.sdk.platformtools.z3.c(th6));
        }
        if (kotlin.jvm.internal.o.b(str, "msg")) {
            e11.b.b(com.tencent.mm.booter.v2.b(intent), c17);
        }
        return c17;
    }

    public final void d(android.content.Context context, android.content.Intent intent) {
        intent.putExtra("notify_from", "broadcast");
        com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain", "sendViaBroadCast: syncNum=" + intent.getLongExtra("notfiy_sync_num", 0L));
        if (((java.lang.Boolean) ((jz5.n) f63579b).getValue()).booleanValue()) {
            context.sendOrderedBroadcast(intent, null);
        } else {
            context.sendBroadcast(intent);
        }
        jx3.f.INSTANCE.idkeyStat(1042L, 60L, 1L, false);
    }

    public final void e(android.content.Context context, android.content.Intent intent) {
        intent.setClass(context, com.tencent.mm.booter.NotifyReceiver.NotifyReceiverService.class);
        intent.putExtra("notify_from", "service");
        com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain", "sendViaService: syncNum=" + intent.getLongExtra("notfiy_sync_num", 0L));
        com.tencent.mm.booter.k0 k0Var = com.tencent.mm.booter.o0.f63532a;
        com.tencent.mm.booter.o0 o0Var = (com.tencent.mm.booter.o0) com.tencent.mm.booter.o0.f63533b.getValue();
        android.content.Intent intent2 = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.service.ProcessService$MMProcessService.class);
        boolean z17 = l85.j1.f317187a;
        l85.j1.b("MicroMsg.PushToMain", intent2);
        o0Var.b(context, intent, "mm", true, intent2);
        jx3.f.INSTANCE.idkeyStat(1042L, 62L, 1L, false);
    }
}
