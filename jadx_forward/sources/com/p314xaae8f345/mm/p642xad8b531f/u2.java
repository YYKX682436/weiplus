package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p642xad8b531f.u2 f145111a = new com.p314xaae8f345.mm.p642xad8b531f.u2();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f145112b = jz5.h.b(com.p314xaae8f345.mm.p642xad8b531f.s2.f145102d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f145113c = jz5.h.a(jz5.i.f384362d, com.p314xaae8f345.mm.p642xad8b531f.r2.f145093d);

    public static final boolean a() {
        return ((java.lang.Boolean) f145113c.mo141623x754a37bb()).booleanValue();
    }

    public final void b(android.content.Context context, android.content.Intent intent, java.lang.String str) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            c(context, intent, str);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p642xad8b531f.t2(context, intent, str));
    }

    public final long c(android.content.Context context, android.content.Intent intent, java.lang.String str) {
        long c17 = com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6.c();
        intent.putExtra("notfiy_sync_num", c17);
        intent.putExtra("notfiy_recv_time", java.lang.System.currentTimeMillis());
        kz5.c0.i(268369921, 138, 2147480001, 1000000205, 1000000800).contains(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p642xad8b531f.v2.b(intent)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain", "sendToNotifyReceiver: " + com.p314xaae8f345.mm.p642xad8b531f.v2.a(intent));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274610g) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PushToMain", "quitMainProcStandby");
                ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).getClass();
                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
                dr0.p1.f324022d.a().k(false);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PushToMain", "quitMainProcStandby failed: " + e17.getMessage());
            }
        }
        try {
            d(context, intent);
            e(context, intent);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushToMain", "sendMsgToNotifyReceiver failed:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "msg")) {
            e11.b.b(com.p314xaae8f345.mm.p642xad8b531f.v2.b(intent), c17);
        }
        return c17;
    }

    public final void d(android.content.Context context, android.content.Intent intent) {
        intent.putExtra("notify_from", "broadcast");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain", "sendViaBroadCast: syncNum=" + intent.getLongExtra("notfiy_sync_num", 0L));
        if (((java.lang.Boolean) ((jz5.n) f145112b).mo141623x754a37bb()).booleanValue()) {
            context.sendOrderedBroadcast(intent, null);
        } else {
            context.sendBroadcast(intent);
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(1042L, 60L, 1L, false);
    }

    public final void e(android.content.Context context, android.content.Intent intent) {
        intent.setClass(context, com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.NotifyReceiverService.class);
        intent.putExtra("notify_from", "service");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain", "sendViaService: syncNum=" + intent.getLongExtra("notfiy_sync_num", 0L));
        com.p314xaae8f345.mm.p642xad8b531f.k0 k0Var = com.p314xaae8f345.mm.p642xad8b531f.o0.f145065a;
        com.p314xaae8f345.mm.p642xad8b531f.o0 o0Var = (com.p314xaae8f345.mm.p642xad8b531f.o0) com.p314xaae8f345.mm.p642xad8b531f.o0.f145066b.mo141623x754a37bb();
        android.content.Intent intent2 = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21029xe89c2284.class);
        boolean z17 = l85.j1.f398720a;
        l85.j1.b("MicroMsg.PushToMain", intent2);
        o0Var.b(context, intent, "mm", true, intent2);
        jx3.f.INSTANCE.mo68477x336bdfd8(1042L, 62L, 1L, false);
    }
}
