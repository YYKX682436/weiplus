package uh;

/* loaded from: classes12.dex */
public abstract class i {
    public static double a(wh.n1 n1Var, android.os.health.HealthStats healthStats) {
        return ((n1Var.e("modem.controller.idle") / 3600000.0d) * n(healthStats, 10024)) + 0.0d + ((n1Var.e("modem.controller.rx") / 3600000.0d) * n(healthStats, 10025)) + ((n1Var.e("modem.controller.tx") / 3600000.0d) * n(healthStats, 10026));
    }

    public static double b(wh.n1 n1Var, android.os.health.HealthStats healthStats, double d17, double d18) {
        double e17 = n1Var.e("radio.active");
        if (e17 <= 0.0d) {
            double a17 = n1Var.a("modem.controller.rx") + 0.0d;
            int h17 = n1Var.h("modem.controller.tx");
            for (int i17 = 0; i17 < h17; i17++) {
                a17 += n1Var.b("modem.controller.tx", i17);
            }
            e17 = a17 / (h17 + 1);
        }
        return 0.0d + ((((e17 / 3600.0d) / (((d17 + d18) / 8.0d) / 2048.0d)) / 3600.0d) * (n(healthStats, 10054) + n(healthStats, 10055)));
    }

    public static double c(wh.n1 n1Var, android.os.health.HealthStats healthStats) {
        long o17 = o(healthStats, 10061) / 1000;
        double e17 = n1Var.e("radio.active");
        if (e17 <= 0.0d) {
            double a17 = n1Var.a("modem.controller.rx") + 0.0d;
            int h17 = n1Var.h("modem.controller.tx");
            for (int i17 = 0; i17 < h17; i17++) {
                a17 += n1Var.b("modem.controller.tx", i17);
            }
            e17 = a17 / (h17 + 1);
        }
        return (e17 / 3600000.0d) * o17;
    }

    public static double d(wh.n1 n1Var, android.os.health.HealthStats healthStats) {
        return ((n1Var.e("wifi.controller.idle") / 3600000.0d) * n(healthStats, 10016)) + 0.0d + ((n1Var.e("wifi.controller.rx") / 3600000.0d) * n(healthStats, 10017)) + ((n1Var.e("wifi.controller.tx") / 3600000.0d) * n(healthStats, 10018));
    }

    public static double e(wh.n1 n1Var, android.os.health.HealthStats healthStats, double d17, double d18) {
        if (d17 < 0.0d || d18 < 0.0d) {
            return 0.0d;
        }
        if (d17 == 0.0d && d18 == 0.0d) {
            return 0.0d;
        }
        return 0.0d + (((n1Var.e("wifi.active") / 3600.0d) / (((d17 + d18) / 8.0d) / 2048.0d)) * (n(healthStats, 10056) + n(healthStats, 10057))) + ((n1Var.e("wifi.on") / 3600000.0d) * n(healthStats, 10028)) + ((n1Var.e("wifi.scan") / 3600000.0d) * o(healthStats, 10030));
    }

    public static double f(wh.n1 n1Var, long j17) {
        return (n1Var.e("cpu.active") / 3600000.0d) * j17;
    }

    public static double g(wh.n1 n1Var, rh.f1 f1Var, long j17, boolean z17) {
        java.util.Iterator it = f1Var.f476919e.iterator();
        boolean z18 = false;
        while (it.hasNext()) {
            java.util.Iterator it6 = ((rh.y2) it.next()).f477093a.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (((java.lang.Long) ((rh.x2) it6.next()).f477085a).longValue() > 0) {
                    z18 = true;
                    break;
                }
            }
        }
        if (z18) {
            return i(n1Var, f1Var, j17, z17);
        }
        oj.j.c("HealthStatsHelper", "estimate CPU by device stats", new java.lang.Object[0]);
        return h(n1Var, f1Var, j17);
    }

    public static double h(wh.n1 n1Var, rh.f1 f1Var, long j17) {
        long j18 = 0;
        double d17 = 0.0d;
        if (j17 > 0) {
            long j19 = 0;
            for (int i17 = 0; i17 < f1Var.f476918d.size(); i17++) {
                java.util.Iterator it = ((rh.y2) f1Var.f476918d.get(i17)).f477093a.iterator();
                while (it.hasNext()) {
                    j19 += ((java.lang.Long) ((rh.x2) it.next()).f477085a).longValue();
                }
            }
            int i18 = 0;
            while (i18 < f1Var.f476918d.size()) {
                java.util.List list = ((rh.y2) f1Var.f476918d.get(i18)).f477093a;
                long j27 = j18;
                for (int i19 = 0; i19 < list.size(); i19++) {
                    j27 += ((java.lang.Long) ((rh.x2) list.get(i19)).f477085a).longValue();
                }
                long j28 = ((((float) j27) * 1.0f) / ((float) j19)) * ((float) j17);
                int f17 = n1Var.f(i18);
                if (f17 >= 0 && f17 < n1Var.f527375a.length) {
                    d17 += (n1Var.c(f17) / 3600000.0d) * j28;
                }
                i18++;
                j18 = 0;
            }
        }
        return d17;
    }

    public static double i(wh.n1 n1Var, rh.f1 f1Var, long j17, boolean z17) {
        double d17 = 0.0d;
        if (j17 > 0) {
            long j18 = 0;
            int i17 = 0;
            while (true) {
                if (i17 >= f1Var.f476919e.size()) {
                    break;
                }
                java.util.List list = ((rh.y2) f1Var.f476919e.get(i17)).f477093a;
                int i18 = z17 ? n1Var.f527375a[i17].f527362d : 1;
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    j18 += ((java.lang.Long) ((rh.x2) it.next()).f477085a).longValue() * i18;
                }
                i17++;
            }
            for (int i19 = 0; i19 < f1Var.f476919e.size(); i19++) {
                int i27 = z17 ? n1Var.f527375a[i19].f527362d : 1;
                int i28 = 0;
                long j19 = 0;
                for (java.util.List list2 = ((rh.y2) f1Var.f476919e.get(i19)).f477093a; i28 < list2.size(); list2 = list2) {
                    j19 += ((java.lang.Long) ((rh.x2) list2.get(i28)).f477085a).longValue() * i27;
                    i28++;
                }
                d17 += (n1Var.c(i19) / 3600000.0d) * ((((float) j19) * 1.0f) / ((float) j18)) * ((float) j17);
            }
        }
        return d17;
    }

    public static double j(wh.n1 n1Var, rh.f1 f1Var, long j17, boolean z17) {
        java.util.Iterator it = f1Var.f476919e.iterator();
        boolean z18 = false;
        while (it.hasNext()) {
            java.util.Iterator it6 = ((rh.y2) it.next()).f477093a.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (((java.lang.Long) ((rh.x2) it6.next()).f477085a).longValue() > 0) {
                    z18 = true;
                    break;
                }
            }
        }
        if (z18) {
            return l(n1Var, f1Var, j17, z17);
        }
        oj.j.c("HealthStatsHelper", "estimate CPU by device stats", new java.lang.Object[0]);
        return k(n1Var, f1Var, j17);
    }

    public static double k(wh.n1 n1Var, rh.f1 f1Var, long j17) {
        long j18 = 0;
        double d17 = 0.0d;
        if (j17 > 0) {
            for (int i17 = 0; i17 < f1Var.f476918d.size(); i17++) {
                java.util.Iterator it = ((rh.y2) f1Var.f476918d.get(i17)).f477093a.iterator();
                while (it.hasNext()) {
                    j18 += ((java.lang.Long) ((rh.x2) it.next()).f477085a).longValue();
                }
            }
            for (int i18 = 0; i18 < f1Var.f476918d.size(); i18++) {
                java.util.List list = ((rh.y2) f1Var.f476918d.get(i18)).f477093a;
                for (int i19 = 0; i19 < list.size(); i19++) {
                    long longValue = ((((float) ((java.lang.Long) ((rh.x2) list.get(i19)).f477085a).longValue()) * 1.0f) / ((float) j18)) * ((float) j17);
                    int f17 = n1Var.f(i18);
                    if (f17 >= 0 && f17 < n1Var.f527375a.length) {
                        d17 += (n1Var.d(f17, i19) / 3600000.0d) * longValue;
                    }
                }
            }
        }
        return d17;
    }

    public static double l(wh.n1 n1Var, rh.f1 f1Var, long j17, boolean z17) {
        long j18 = 0;
        double d17 = 0.0d;
        if (j17 > 0) {
            int i17 = 0;
            while (true) {
                if (i17 >= f1Var.f476919e.size()) {
                    break;
                }
                java.util.List list = ((rh.y2) f1Var.f476919e.get(i17)).f477093a;
                int i18 = z17 ? n1Var.f527375a[i17].f527362d : 1;
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    j18 += ((java.lang.Long) ((rh.x2) it.next()).f477085a).longValue() * i18;
                }
                i17++;
            }
            for (int i19 = 0; i19 < f1Var.f476919e.size(); i19++) {
                java.util.List list2 = ((rh.y2) f1Var.f476919e.get(i19)).f477093a;
                int i27 = z17 ? n1Var.f527375a[i19].f527362d : 1;
                for (int i28 = 0; i28 < list2.size(); i28++) {
                    d17 += (n1Var.d(i19, i28) / 3600000.0d) * ((((float) (((java.lang.Long) ((rh.x2) list2.get(i28)).f477085a).longValue() * i27)) * 1.0f) / ((float) j18)) * ((float) j17);
                }
            }
        }
        return d17;
    }

    public static android.os.health.HealthStats m(android.content.Context context) {
        try {
            return ((android.os.health.SystemHealthManager) context.getSystemService("systemhealth")).takeMyUidSnapshot();
        } catch (java.lang.Exception e17) {
            oj.j.f("HealthStatsHelper", "takeMyUidSnapshot err: " + e17, new java.lang.Object[0]);
            return null;
        }
    }

    public static long n(android.os.health.HealthStats healthStats, int i17) {
        if (healthStats.hasMeasurement(i17)) {
            return healthStats.getMeasurement(i17);
        }
        return 0L;
    }

    public static long o(android.os.health.HealthStats healthStats, int i17) {
        if (healthStats.hasTimer(i17)) {
            return healthStats.getTimerTime(i17);
        }
        return 0L;
    }

    public static double p(double d17, int i17) {
        return java.lang.Math.round(d17 * r0) / java.lang.Math.pow(10.0d, i17);
    }
}
