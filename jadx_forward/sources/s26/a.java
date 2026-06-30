package s26;

/* loaded from: classes11.dex */
public abstract class a implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final long f483899d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f483900e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f483901f = 0;

    static {
        int i17 = s26.b.f483902a;
        f483899d = s26.c.a(4611686018427387903L);
        f483900e = s26.c.a(-4611686018427387903L);
    }

    public static final long a(long j17, long j18, long j19) {
        long j27 = 1000000;
        long j28 = j19 / j27;
        long j29 = j18 + j28;
        boolean z17 = false;
        if (-4611686018426L <= j29 && j29 < 4611686018427L) {
            z17 = true;
        }
        if (!z17) {
            return s26.c.a(e06.p.h(j29, -4611686018427387903L, 4611686018427387903L));
        }
        return s26.c.c((j29 * j27) + (j19 - (j28 * j27)));
    }

    public static final void b(long j17, java.lang.StringBuilder sb6, int i17, int i18, int i19, java.lang.String str, boolean z17) {
        sb6.append(i17);
        if (i18 != 0) {
            sb6.append('.');
            java.lang.String R = r26.n0.R(java.lang.String.valueOf(i18), i19, '0');
            int i27 = -1;
            int length = R.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i28 = length - 1;
                    if (R.charAt(length) != '0') {
                        i27 = length;
                        break;
                    } else if (i28 < 0) {
                        break;
                    } else {
                        length = i28;
                    }
                }
            }
            int i29 = i27 + 1;
            if (z17 || i29 >= 3) {
                sb6.append((java.lang.CharSequence) R, 0, ((i29 + 2) / 3) * 3);
            } else {
                sb6.append((java.lang.CharSequence) R, 0, i29);
            }
        }
        sb6.append(str);
    }

    public static int d(long j17, long j18) {
        long j19 = j17 ^ j18;
        if (j19 >= 0) {
            if ((((int) j19) & 1) != 0) {
                int i17 = (((int) j17) & 1) - (((int) j18) & 1);
                return j17 < 0 ? -i17 : i17;
            }
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(j17, j18);
    }

    public static final long e(long j17) {
        return (((((int) j17) & 1) == 1) && (f(j17) ^ true)) ? j17 >> 1 : g(j17, s26.d.f483904f);
    }

    public static final boolean f(long j17) {
        return j17 == f483899d || j17 == f483900e;
    }

    public static final long g(long j17, s26.d unit) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unit, "unit");
        if (j17 == f483899d) {
            return com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        if (j17 == f483900e) {
            return Long.MIN_VALUE;
        }
        return s26.e.b(j17 >> 1, (((int) j17) & 1) == 0 ? s26.d.f483903e : s26.d.f483904f, unit);
    }

    public static java.lang.String h(long j17) {
        long j18;
        boolean z17;
        int g17;
        int i17;
        if (j17 == 0) {
            return "0s";
        }
        if (j17 == f483899d) {
            return "Infinity";
        }
        if (j17 == f483900e) {
            return "-Infinity";
        }
        int i18 = 0;
        boolean z18 = j17 < 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (z18) {
            sb6.append('-');
        }
        if (j17 < 0) {
            j18 = ((-(j17 >> 1)) << 1) + (((int) j17) & 1);
            int i19 = s26.b.f483902a;
        } else {
            j18 = j17;
        }
        long g18 = g(j18, s26.d.f483908m);
        int g19 = f(j18) ? 0 : (int) (g(j18, s26.d.f483907i) % 24);
        if (f(j18)) {
            g17 = 0;
            z17 = z18;
        } else {
            z17 = z18;
            g17 = (int) (g(j18, s26.d.f483906h) % 60);
        }
        int g27 = f(j18) ? 0 : (int) (g(j18, s26.d.f483905g) % 60);
        if (f(j18)) {
            i17 = 0;
        } else {
            i17 = (int) ((((int) j18) & 1) == 1 ? ((j18 >> 1) % 1000) * 1000000 : (j18 >> 1) % 1000000000);
        }
        boolean z19 = g18 != 0;
        boolean z27 = g19 != 0;
        boolean z28 = g17 != 0;
        boolean z29 = (g27 == 0 && i17 == 0) ? false : true;
        if (z19) {
            sb6.append(g18);
            sb6.append('d');
            i18 = 1;
        }
        if (z27 || (z19 && (z28 || z29))) {
            int i27 = i18 + 1;
            if (i18 > 0) {
                sb6.append(' ');
            }
            sb6.append(g19);
            sb6.append('h');
            i18 = i27;
        }
        if (z28 || (z29 && (z27 || z19))) {
            int i28 = i18 + 1;
            if (i18 > 0) {
                sb6.append(' ');
            }
            sb6.append(g17);
            sb6.append('m');
            i18 = i28;
        }
        if (z29) {
            int i29 = i18 + 1;
            if (i18 > 0) {
                sb6.append(' ');
            }
            if (g27 != 0 || z19 || z27 || z28) {
                b(j17, sb6, g27, i17, 9, "s", false);
            } else if (i17 >= 1000000) {
                b(j17, sb6, i17 / 1000000, i17 % 1000000, 6, "ms", false);
            } else if (i17 >= 1000) {
                b(j17, sb6, i17 / 1000, i17 % 1000, 3, "us", false);
            } else {
                sb6.append(i17);
                sb6.append("ns");
            }
            i18 = i29;
        }
        if (z17 && i18 > 1) {
            sb6.insert(1, '(').append(')');
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
