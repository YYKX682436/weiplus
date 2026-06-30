package k35;

/* loaded from: classes15.dex */
public abstract class m1 {
    public static final k35.j1 H;
    public static final k35.j1 I;

    /* renamed from: J, reason: collision with root package name */
    public static final k35.j1 f385445J;
    public static final k35.j1 K;
    public static final k35.k1 L;
    public static final k35.k1 M;
    public static final k35.k1 N;
    public static final k35.k1 O;
    public static final k35.k1 P;
    public static boolean Q;

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f385446a = new java.util.ArrayList(64);

    /* renamed from: b, reason: collision with root package name */
    public static final k35.j1 f385447b = new k35.d0();

    /* renamed from: c, reason: collision with root package name */
    public static final k35.j1 f385448c = new k35.o0();

    /* renamed from: d, reason: collision with root package name */
    public static final k35.j1 f385449d = new k35.z0();

    /* renamed from: e, reason: collision with root package name */
    public static final k35.j1 f385450e = new k35.d1();

    /* renamed from: f, reason: collision with root package name */
    public static final k35.j1 f385451f = new k35.e1();

    /* renamed from: g, reason: collision with root package name */
    public static final k35.j1 f385452g = new k35.f1();

    /* renamed from: h, reason: collision with root package name */
    public static final k35.j1 f385453h = new k35.g1();

    /* renamed from: i, reason: collision with root package name */
    public static final k35.j1 f385454i = new k35.h1();

    /* renamed from: j, reason: collision with root package name */
    public static final k35.j1 f385455j = new k35.i1();

    /* renamed from: k, reason: collision with root package name */
    public static final k35.j1 f385456k = new k35.t();

    /* renamed from: l, reason: collision with root package name */
    public static final k35.j1 f385457l = new k35.u();

    /* renamed from: m, reason: collision with root package name */
    public static final k35.j1 f385458m = new k35.v();

    /* renamed from: n, reason: collision with root package name */
    public static final k35.j1 f385459n = new k35.w();

    /* renamed from: o, reason: collision with root package name */
    public static final k35.j1 f385460o = new k35.x();

    /* renamed from: p, reason: collision with root package name */
    public static final k35.j1 f385461p = new k35.y();

    /* renamed from: q, reason: collision with root package name */
    public static final k35.j1 f385462q = new k35.z();

    /* renamed from: r, reason: collision with root package name */
    public static final k35.j1 f385463r = new k35.a0();

    /* renamed from: s, reason: collision with root package name */
    public static final k35.j1 f385464s = new k35.b0();

    /* renamed from: t, reason: collision with root package name */
    public static final k35.j1 f385465t = new k35.c0();

    /* renamed from: u, reason: collision with root package name */
    public static final k35.j1 f385466u = new k35.e0();

    /* renamed from: v, reason: collision with root package name */
    public static final k35.j1 f385467v = new k35.f0();

    /* renamed from: w, reason: collision with root package name */
    public static final k35.j1 f385468w = new k35.g0();

    /* renamed from: x, reason: collision with root package name */
    public static final k35.j1 f385469x = new k35.h0();

    /* renamed from: y, reason: collision with root package name */
    public static final k35.j1 f385470y = new k35.i0();

    /* renamed from: z, reason: collision with root package name */
    public static final k35.j1 f385471z = new k35.j0();
    public static final k35.j1 A = new k35.k0();
    public static final k35.j1 B = new k35.l0();
    public static final k35.j1 C = new k35.m0();
    public static final k35.j1 D = new k35.n0();
    public static final k35.j1 E = new k35.p0();
    public static final k35.j1 F = new k35.q0();
    public static final k35.j1 G = new k35.r0();

    static {
        new k35.s0();
        H = new k35.t0();
        I = new k35.u0();
        f385445J = new k35.v0();
        K = new k35.w0();
        L = new k35.x0();
        M = new k35.y0();
        N = new k35.a1();
        O = new k35.b1();
        P = new k35.c1();
        Q = false;
    }

    public static java.lang.String a(android.content.Context context, long j17) {
        java.lang.String str;
        boolean m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m();
        k35.j1 j1Var = f385454i;
        k35.j1 j1Var2 = f385453h;
        k35.j1 j1Var3 = f385452g;
        k35.j1 j1Var4 = f385451f;
        if (m17) {
            if (j17 < 3600000) {
                return "";
            }
            android.text.format.Time time = (android.text.format.Time) L.get();
            android.text.format.Time time2 = (android.text.format.Time) M.get();
            time.set(j17);
            time2.setToNow();
            int i17 = time.year;
            int i18 = time2.year;
            if (i17 == i18 && time.yearDay == time2.yearDay) {
                return (java.lang.String) j1Var4.b();
            }
            if (i17 == i18 && time2.yearDay - time.yearDay == 1) {
                return (java.lang.String) j1Var3.b();
            }
            if (i17 == i18 && time2.yearDay - time.yearDay <= 7) {
                return (java.lang.String) j1Var2.b();
            }
            if (i17 == i18 && time2.yearDay - time.yearDay <= 30) {
                return (java.lang.String) j1Var.b();
            }
            if (i17 == i18) {
                return (time.month + 1) + "月";
            }
            return time.year + "年";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.s(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
        if (j17 < 3600000) {
            return "";
        }
        java.util.GregorianCalendar gregorianCalendar = (java.util.GregorianCalendar) N.get();
        gregorianCalendar.setTimeInMillis(java.lang.System.currentTimeMillis());
        java.util.GregorianCalendar gregorianCalendar2 = (java.util.GregorianCalendar) O.get();
        gregorianCalendar2.set(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5), 0, 0, 0);
        gregorianCalendar2.set(14, 0);
        long timeInMillis = j17 - gregorianCalendar2.getTimeInMillis();
        if (timeInMillis > 0 && timeInMillis <= 86400000) {
            return (java.lang.String) j1Var4.b();
        }
        long timeInMillis2 = (j17 - gregorianCalendar2.getTimeInMillis()) + 86400000;
        if (timeInMillis2 > 0 && timeInMillis2 <= 86400000) {
            return (java.lang.String) j1Var3.b();
        }
        java.util.GregorianCalendar gregorianCalendar3 = (java.util.GregorianCalendar) P.get();
        gregorianCalendar3.setTimeInMillis(j17);
        long timeInMillis3 = (j17 - gregorianCalendar2.getTimeInMillis()) + 604800000;
        if (timeInMillis3 > 0 && timeInMillis3 <= 604800000) {
            return (java.lang.String) j1Var2.b();
        }
        long timeInMillis4 = (j17 - gregorianCalendar2.getTimeInMillis()) + 2592000000L;
        if (timeInMillis4 > 0 && timeInMillis4 <= 2592000000L) {
            return (java.lang.String) j1Var.b();
        }
        if (gregorianCalendar.get(1) != gregorianCalendar3.get(1)) {
            return java.lang.String.valueOf(gregorianCalendar3.get(1));
        }
        switch (gregorianCalendar.get(2)) {
            case 0:
                str = "JANUARY";
                break;
            case 1:
                str = "FEBRUARY";
                break;
            case 2:
                str = "MARCH";
                break;
            case 3:
                str = "APRIL";
                break;
            case 4:
                str = "MAY";
                break;
            case 5:
                str = "JUNE";
                break;
            case 6:
                str = "JULY";
                break;
            case 7:
                str = "AUGUST";
                break;
            case 8:
                str = "SEPTEMBER";
                break;
            case 9:
                str = "OCTOBER";
                break;
            case 10:
                str = "NOVEMBER";
                break;
            case 11:
                str = "DECEMBER";
                break;
            default:
                str = "UNDECIMBER";
                break;
        }
        return str;
    }

    public static java.lang.CharSequence b(android.content.Context context, int i17) {
        if (i17 < 0) {
            return "";
        }
        long j17 = i17;
        return j17 < 6 ? (java.lang.CharSequence) C.b() : j17 < 12 ? (java.lang.CharSequence) D.b() : j17 < 13 ? (java.lang.CharSequence) E.b() : j17 < 18 ? (java.lang.CharSequence) F.b() : (java.lang.CharSequence) G.b();
    }

    public static java.lang.CharSequence c(android.content.Context context, long j17) {
        return j17 < 0 ? "" : j17 < 21600000 ? (java.lang.CharSequence) C.b() : j17 < 43200000 ? (java.lang.CharSequence) D.b() : j17 < 46800000 ? (java.lang.CharSequence) E.b() : j17 < 64800000 ? (java.lang.CharSequence) F.b() : (java.lang.CharSequence) G.b();
    }

    public static java.lang.String d(java.lang.String str, long j17) {
        return new java.text.SimpleDateFormat(str).format(new java.util.Date(j17 * 1000));
    }

    public static java.lang.String e(long j17) {
        return new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new java.util.Date(j17));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence f(android.content.Context r22, long r23, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k35.m1.f(android.content.Context, long, boolean, boolean):java.lang.CharSequence");
    }

    public static java.lang.String g(java.lang.String str, long j17) {
        java.lang.String charSequence = android.text.format.DateFormat.format(str, j17).toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence)) {
            return "";
        }
        java.lang.String trim = charSequence.trim();
        return trim.startsWith("0") ? trim.substring(1) : trim;
    }

    public static java.lang.String h(android.content.Context context, int i17) {
        int i18;
        long j17 = i17 * 1000;
        java.lang.String str = "";
        if (j17 < 3600000) {
            return "";
        }
        java.util.GregorianCalendar gregorianCalendar = (java.util.GregorianCalendar) N.get();
        gregorianCalendar.setTimeInMillis(java.lang.System.currentTimeMillis());
        java.util.GregorianCalendar gregorianCalendar2 = (java.util.GregorianCalendar) O.get();
        gregorianCalendar2.set(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5), 0, 0, 0);
        gregorianCalendar2.set(14, 0);
        long timeInMillis = j17 - gregorianCalendar2.getTimeInMillis();
        k35.j1 j1Var = f385448c;
        if (timeInMillis >= 0 && timeInMillis < 86400000) {
            return "" + ((java.lang.Object) c(context, timeInMillis)) + ";" + g((java.lang.String) j1Var.b(), j17);
        }
        long timeInMillis2 = j17 - (gregorianCalendar2.getTimeInMillis() - 86400000);
        if (timeInMillis2 >= 0 && timeInMillis2 < 86400000) {
            return ((java.lang.String) f385452g.b()) + " " + ((java.lang.Object) c(context, timeInMillis2)) + ";" + g((java.lang.String) j1Var.b(), j17);
        }
        long timeInMillis3 = j17 - (gregorianCalendar2.getTimeInMillis() - 172800000);
        if (timeInMillis3 >= 0 && timeInMillis3 < 86400000) {
            return ((java.lang.String) f385455j.b()) + " " + ((java.lang.Object) c(context, timeInMillis3)) + ";" + g((java.lang.String) j1Var.b(), j17);
        }
        long timeInMillis4 = j17 - (gregorianCalendar2.getTimeInMillis() + 86400000);
        if (timeInMillis4 >= 0 && timeInMillis4 < 86400000) {
            return ((java.lang.String) f385456k.b()) + " " + ((java.lang.Object) c(context, timeInMillis4)) + ";" + g((java.lang.String) j1Var.b(), j17);
        }
        long timeInMillis5 = j17 - (gregorianCalendar2.getTimeInMillis() + 172800000);
        if (timeInMillis5 >= 0 && timeInMillis5 < 86400000) {
            return ((java.lang.String) f385457l.b()) + " " + ((java.lang.Object) c(context, timeInMillis5)) + ";" + g((java.lang.String) j1Var.b(), j17);
        }
        java.util.GregorianCalendar gregorianCalendar3 = (java.util.GregorianCalendar) P.get();
        gregorianCalendar3.setTimeInMillis(j17);
        int i19 = gregorianCalendar3.get(11);
        if (gregorianCalendar.get(1) == gregorianCalendar3.get(1) && gregorianCalendar.get(3) == gregorianCalendar3.get(3)) {
            int i27 = gregorianCalendar3.get(7);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            switch (i27) {
                case 1:
                    str = (java.lang.String) f385458m.b();
                    break;
                case 2:
                    str = (java.lang.String) f385459n.b();
                    break;
                case 3:
                    str = (java.lang.String) f385460o.b();
                    break;
                case 4:
                    str = (java.lang.String) f385461p.b();
                    break;
                case 5:
                    str = (java.lang.String) f385462q.b();
                    break;
                case 6:
                    str = (java.lang.String) f385463r.b();
                    break;
                case 7:
                    str = (java.lang.String) f385464s.b();
                    break;
            }
            sb6.append(str);
            sb6.append(" ");
            sb6.append((java.lang.Object) b(context, i19));
            sb6.append(";");
            sb6.append(g((java.lang.String) j1Var.b(), j17));
            return sb6.toString();
        }
        if (gregorianCalendar.get(1) != gregorianCalendar3.get(1)) {
            i18 = 1;
        } else {
            if (gregorianCalendar.get(3) + 1 == gregorianCalendar3.get(3)) {
                int i28 = gregorianCalendar3.get(7);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                switch (i28) {
                    case 1:
                        str = (java.lang.String) f385465t.b();
                        break;
                    case 2:
                        str = (java.lang.String) f385466u.b();
                        break;
                    case 3:
                        str = (java.lang.String) f385467v.b();
                        break;
                    case 4:
                        str = (java.lang.String) f385468w.b();
                        break;
                    case 5:
                        str = (java.lang.String) f385469x.b();
                        break;
                    case 6:
                        str = (java.lang.String) f385470y.b();
                        break;
                    case 7:
                        str = (java.lang.String) f385471z.b();
                        break;
                }
                sb7.append(str);
                sb7.append(" ");
                sb7.append((java.lang.Object) b(context, i19));
                sb7.append(";");
                sb7.append(g((java.lang.String) j1Var.b(), j17));
                return sb7.toString();
            }
            i18 = 1;
        }
        if (gregorianCalendar.get(i18) == gregorianCalendar3.get(i18)) {
            return ((java.lang.Object) android.text.format.DateFormat.format((java.lang.CharSequence) f385449d.b(), j17)) + " " + ((java.lang.Object) b(context, i19)) + ";" + g((java.lang.String) j1Var.b(), j17);
        }
        return ((java.lang.Object) android.text.format.DateFormat.format((java.lang.CharSequence) f385450e.b(), j17)) + " " + ((java.lang.Object) b(context, i19)) + ";" + g((java.lang.String) j1Var.b(), j17);
    }

    public static boolean i() {
        if (java.lang.System.currentTimeMillis() - 0 > 30000) {
            try {
                Q = android.text.format.DateFormat.is24HourFormat(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TimeUtil", e17, "", new java.lang.Object[0]);
            }
        }
        return Q;
    }
}
