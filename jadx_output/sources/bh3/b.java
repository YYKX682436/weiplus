package bh3;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final bh3.b f20910a = new bh3.b();

    public static final void a(bh3.b bVar, android.content.Context context) {
        long j17;
        a5.l lVar;
        long j18;
        java.lang.String str;
        long j19;
        java.lang.String str2;
        int i17;
        long c17;
        long timeInMillis;
        a5.l lVar2;
        bVar.getClass();
        b5.w c18 = b5.w.c(context);
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.friend.RepairerConfigCheckContactEnable()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckContactService", "initScheduleCheck() init enable:" + z17);
        if (!z17) {
            ((m5.c) c18.f17898d).a(new k5.c(c18, "CheckContactWorker", true));
            return;
        }
        int c19 = j62.e.g().c(new com.tencent.mm.repairer.config.friend.RepairerConfigCheckContactPeriod());
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckContactService", "initScheduleCheck() init checkPeriod:" + c19);
        a5.l lVar3 = new a5.l();
        lVar3.b("DATA_KEY_CHECK_PERIOD", java.lang.Integer.valueOf(c19));
        long c27 = c01.id.c();
        if (c19 == 1) {
            j17 = 86400000;
        } else if (c19 != 2) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTimeInMillis(c27);
            int i18 = calendar.get(1);
            int i19 = calendar.get(2);
            java.util.Calendar calendar2 = java.util.Calendar.getInstance();
            calendar2.clear();
            calendar2.set(1, i18);
            calendar2.set(2, i19);
            calendar2.set(5, 1);
            j17 = calendar2.getActualMaximum(5) * 86400000;
        } else {
            j17 = 604800000;
        }
        long c28 = bVar.c(j17);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        calendar3.setTimeInMillis(c27);
        if (c19 == 2) {
            calendar3.set(7, 2);
        } else if (c19 == 3) {
            calendar3.set(5, 1);
        }
        bh3.b bVar2 = f20910a;
        bVar2.d(calendar3);
        long timeInMillis2 = calendar3.getTimeInMillis() + ((int) c28);
        java.lang.String j27 = gm0.j1.b().j();
        kotlin.jvm.internal.o.f(j27, "getUinString(...)");
        long parseLong = java.lang.Long.parseLong(j27);
        if (timeInMillis2 > c27) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckContactService", "getTargetHourInPeriod1 uin:" + parseLong + " preciseTargetTime:" + bVar.b(timeInMillis2) + " targetMsInPeriod:" + c28);
            lVar3.b("DATA_KEY_TARGET_TIME", java.lang.Long.valueOf(timeInMillis2));
            i17 = c19;
            timeInMillis = timeInMillis2;
            lVar2 = lVar3;
            j19 = c27;
        } else {
            java.util.Calendar calendar4 = java.util.Calendar.getInstance();
            if (c19 == 2) {
                lVar = lVar3;
                j18 = c28;
                str = "DATA_KEY_TARGET_TIME";
                j19 = c27;
                str2 = " targetMsInPeriod:";
                i17 = c19;
                calendar4.setTimeInMillis(j19);
                calendar4.add(3, 1);
                calendar4.set(7, 2);
                bVar2.d(calendar4);
                c17 = bVar2.c(604800000L);
            } else if (c19 != 3) {
                j18 = c28;
                j19 = c27;
                calendar4.setTimeInMillis(j19);
                calendar4.add(6, 1);
                bVar2.d(calendar4);
                str = "DATA_KEY_TARGET_TIME";
                c17 = bVar2.c(86400000L);
                str2 = " targetMsInPeriod:";
                i17 = c19;
                lVar = lVar3;
            } else {
                j18 = c28;
                str = "DATA_KEY_TARGET_TIME";
                j19 = c27;
                java.util.Calendar calendar5 = java.util.Calendar.getInstance();
                calendar5.setTimeInMillis(j19);
                i17 = c19;
                calendar5.add(2, 1);
                lVar = lVar3;
                int i27 = calendar5.get(1);
                int i28 = calendar5.get(2);
                java.util.Calendar calendar6 = java.util.Calendar.getInstance();
                calendar6.clear();
                calendar6.set(1, i27);
                str2 = " targetMsInPeriod:";
                calendar6.set(2, i28);
                calendar6.set(5, 1);
                long c29 = bVar2.c(calendar6.getActualMaximum(5) * 86400000);
                calendar4.set(1, i27);
                calendar4.set(2, i28);
                calendar4.set(5, 1);
                bVar2.d(calendar4);
                c17 = c29;
            }
            timeInMillis = calendar4.getTimeInMillis() + c17;
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckContactService", "getNextPeriodTargetTime nextPeriodTargetMs:" + c17);
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckContactService", "getTargetHourInPeriod3 uin:" + parseLong + " preciseTargetTime:" + bVar.b(timeInMillis2) + str2 + j18 + " nextPeriodTime:" + bVar.b(timeInMillis));
            lVar2 = lVar;
            lVar2.b(str, java.lang.Long.valueOf(timeInMillis));
        }
        long j28 = timeInMillis - j19;
        long max = java.lang.Math.max(j28, 20000L);
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckContactService", "calculateDelayForUser() called with: delayTime = " + j28 + " checkPeriod:" + i17 + " finalDelayTime:" + max);
        a5.c0 c0Var = (a5.c0) new a5.c0(com.tencent.mm.plugin.messenger.foundation.recover.check.CheckContactWorker.class).e(max, java.util.concurrent.TimeUnit.MILLISECONDS);
        c0Var.f1430c.f297768e = lVar2.a();
        a5.t0 a17 = ((a5.c0) c0Var.d(a5.a.EXPONENTIAL, 10L, java.util.concurrent.TimeUnit.SECONDS)).a();
        kotlin.jvm.internal.o.f(a17, "build(...)");
        new b5.h(c18, "CheckContactWorker", a5.n.REPLACE, java.util.Collections.singletonList((a5.d0) a17)).a();
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckContactService", "initScheduleCheck() end");
    }

    public final java.lang.String b(long j17) {
        try {
            java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new java.util.Date(j17));
            kotlin.jvm.internal.o.d(format);
            return format;
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public final long c(long j17) {
        kotlin.jvm.internal.o.f(gm0.j1.b().j(), "getUinString(...)");
        return (((float) (java.lang.Long.parseLong(r0) % 1000000000)) / 1.0E9f) * ((float) j17);
    }

    public final void d(java.util.Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }
}
