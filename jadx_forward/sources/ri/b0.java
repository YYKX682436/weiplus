package ri;

/* loaded from: classes12.dex */
public abstract class b0 {
    public static final long a(android.os.health.HealthStats healthStats) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(healthStats, "<this>");
        long c17 = c(healthStats, 10038);
        long c18 = c(healthStats, 10036);
        if (c17 > c18) {
            c17 = c18;
        }
        long c19 = c(healthStats, 10041);
        long c27 = c(healthStats, 10039);
        long c28 = c(healthStats, 10042);
        long c29 = c17 + c19 + c27 + c28 + c(healthStats, 10040) + c(healthStats, 10043);
        if (c29 < 0) {
            return 0L;
        }
        return c29;
    }

    public static final long b(android.os.health.HealthStats healthStats, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(healthStats, "<this>");
        if (healthStats.hasMeasurement(i17)) {
            return healthStats.getMeasurement(i17);
        }
        return 0L;
    }

    public static final long c(android.os.health.HealthStats healthStats, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(healthStats, "<this>");
        if (healthStats.hasTimer(i17)) {
            return healthStats.getTimerTime(i17);
        }
        return 0L;
    }

    public static final long d(android.os.health.HealthStats healthStats, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(healthStats, "<this>");
        long j17 = 0;
        if (healthStats.hasTimers(i17)) {
            java.util.Map<java.lang.String, android.os.health.TimerStat> timers = healthStats.getTimers(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(timers, "getTimers(...)");
            java.util.Iterator<T> it = timers.values().iterator();
            while (it.hasNext()) {
                j17 += ((android.os.health.TimerStat) it.next()).getTime();
            }
        }
        return j17;
    }

    public static final float e(float f17, int i17) {
        return new java.math.BigDecimal(java.lang.String.valueOf(f17)).setScale(i17, java.math.RoundingMode.HALF_EVEN).floatValue();
    }

    public static /* synthetic */ float f(float f17, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = 2;
        }
        return e(f17, i17);
    }
}
