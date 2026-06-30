package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class lf {

    /* renamed from: a, reason: collision with root package name */
    public static double f131822a = 6378137.0d;

    /* renamed from: b, reason: collision with root package name */
    public static final double f131823b = 111319.49079327357d;

    /* renamed from: c, reason: collision with root package name */
    public static final double f131824c = 0.017453292519943295d;

    /* renamed from: d, reason: collision with root package name */
    private static final double f131825d = 6378137.0d * 6.283185307179586d;

    /* renamed from: e, reason: collision with root package name */
    private static final double f131826e = 0.017453292519943295d;

    /* renamed from: f, reason: collision with root package name */
    private static final double f131827f = 2.68435456E8d;

    public static boolean a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list, double d17) {
        long j17;
        double abs;
        java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list2 = list;
        if (c26041x873d1d26 == null || list2 == null || list.size() == 0 || d17 <= f131825d) {
            return false;
        }
        double d18 = d17 / 2.0d;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99563x59bc66e = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.m99525xdc3ef9b().m99565x73c954a8(list2).m99563x59bc66e();
        double m99545x528719b2 = m99563x59bc66e.m99545x528719b2() + d17;
        if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.m99529x3017aa(m99563x59bc66e.m99542x2487201c() + d17, m99545x528719b2, m99563x59bc66e.m99543x24cda0e4() - d17, m99563x59bc66e.m99546x528f5764() - d17).m99538xde2d761f(c26041x873d1d26)) {
            int i17 = 0;
            while (i17 < list.size() - 1) {
                com.tencent.mapsdk.internal.lf.a a17 = com.tencent.mapsdk.internal.lf.a.a(list2.get(i17));
                int i18 = i17 + 1;
                com.tencent.mapsdk.internal.lf.a a18 = com.tencent.mapsdk.internal.lf.a.a(list2.get(i18));
                com.tencent.mapsdk.internal.lf.a a19 = com.tencent.mapsdk.internal.lf.a.a(c26041x873d1d26);
                com.tencent.mapsdk.internal.lf.a aVar = new com.tencent.mapsdk.internal.lf.a();
                aVar.f131828a = a18.f131828a - a17.f131828a;
                aVar.f131829b = a18.f131829b - a17.f131829b;
                com.tencent.mapsdk.internal.lf.a aVar2 = new com.tencent.mapsdk.internal.lf.a();
                aVar2.f131828a = a19.f131828a - a18.f131828a;
                aVar2.f131829b = a19.f131829b - a18.f131829b;
                com.tencent.mapsdk.internal.lf.a aVar3 = new com.tencent.mapsdk.internal.lf.a();
                double d19 = a19.f131828a - a17.f131828a;
                aVar3.f131828a = d19;
                double d27 = a19.f131829b - a17.f131829b;
                aVar3.f131829b = d27;
                double d28 = aVar.f131828a;
                double d29 = aVar2.f131828a * d28;
                double d37 = d18;
                double d38 = aVar.f131829b;
                double d39 = (d28 * d19) + (d38 * d27);
                if (d29 + (aVar2.f131829b * d38) > f131825d) {
                    double d47 = a19.f131829b - a18.f131829b;
                    double d48 = a19.f131828a - a18.f131828a;
                    abs = java.lang.Math.sqrt((d48 * d48) + (d47 * d47));
                    j17 = 0;
                } else {
                    j17 = 0;
                    if (d39 < f131825d) {
                        double d49 = a19.f131829b - a17.f131829b;
                        double d57 = a19.f131828a - a17.f131828a;
                        abs = java.lang.Math.sqrt((d57 * d57) + (d49 * d49));
                    } else {
                        abs = java.lang.Math.abs((d28 * d27) - (d38 * d19)) / java.lang.Math.sqrt((d28 * d28) + (d38 * d38));
                    }
                }
                if (abs <= d37) {
                    return true;
                }
                list2 = list;
                d18 = d37;
                i17 = i18;
            }
        }
        return false;
    }

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        double f131828a;

        /* renamed from: b, reason: collision with root package name */
        double f131829b;

        private a(double d17, double d18) {
            this.f131828a = d17;
            this.f131829b = d18;
        }

        public static com.tencent.mapsdk.internal.lf.a a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
            return new com.tencent.mapsdk.internal.lf.a(c26041x873d1d26.x(), c26041x873d1d26.y());
        }

        public a() {
        }
    }

    private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b, double d17) {
        double m99545x528719b2 = c26042xcb530b7b.m99545x528719b2() + d17;
        return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.m99529x3017aa(c26042xcb530b7b.m99542x2487201c() + d17, m99545x528719b2, c26042xcb530b7b.m99543x24cda0e4() - d17, c26042xcb530b7b.m99546x528f5764() - d17);
    }

    public static double a(double d17, double d18) {
        return (d17 * (f131827f / f131825d)) / java.lang.Math.cos(d18 * 0.017453292519943295d);
    }

    public static double a(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list) {
        double d17 = f131825d;
        if (list == null || list.size() < 3) {
            return f131825d;
        }
        int size = list.size();
        int i17 = 0;
        while (i17 < size) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = list.get(i17);
            i17++;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262 = list.get(i17 % size);
            double cos = c26041x873d1d26.f49502x83009af * 111319.49079327357d * java.lang.Math.cos(c26041x873d1d26.f49501xaa2bac6c * 0.017453292519943295d);
            double d18 = c26041x873d1d26.f49501xaa2bac6c * 111319.49079327357d;
            d17 += (cos * (c26041x873d1d262.f49501xaa2bac6c * 111319.49079327357d)) - (((c26041x873d1d262.f49502x83009af * 111319.49079327357d) * java.lang.Math.cos(c26041x873d1d262.f49501xaa2bac6c * 0.017453292519943295d)) * d18);
        }
        return java.lang.Math.abs(d17 / 2.0d);
    }

    private static double a(com.tencent.mapsdk.internal.lf.a aVar, com.tencent.mapsdk.internal.lf.a aVar2, com.tencent.mapsdk.internal.lf.a aVar3) {
        com.tencent.mapsdk.internal.lf.a aVar4 = new com.tencent.mapsdk.internal.lf.a();
        aVar4.f131828a = aVar2.f131828a - aVar.f131828a;
        aVar4.f131829b = aVar2.f131829b - aVar.f131829b;
        com.tencent.mapsdk.internal.lf.a aVar5 = new com.tencent.mapsdk.internal.lf.a();
        aVar5.f131828a = aVar3.f131828a - aVar2.f131828a;
        aVar5.f131829b = aVar3.f131829b - aVar2.f131829b;
        com.tencent.mapsdk.internal.lf.a aVar6 = new com.tencent.mapsdk.internal.lf.a();
        double d17 = aVar3.f131828a - aVar.f131828a;
        aVar6.f131828a = d17;
        double d18 = aVar3.f131829b - aVar.f131829b;
        aVar6.f131829b = d18;
        double d19 = aVar4.f131828a;
        double d27 = aVar5.f131828a * d19;
        double d28 = aVar4.f131829b;
        double d29 = (d19 * d17) + (d28 * d18);
        if (d27 + (aVar5.f131829b * d28) > f131825d) {
            double d37 = aVar3.f131829b - aVar2.f131829b;
            double d38 = aVar3.f131828a - aVar2.f131828a;
            return java.lang.Math.sqrt((d38 * d38) + (d37 * d37));
        }
        if (d29 < f131825d) {
            double d39 = aVar3.f131829b - aVar.f131829b;
            double d47 = aVar3.f131828a - aVar.f131828a;
            return java.lang.Math.sqrt((d47 * d47) + (d39 * d39));
        }
        return java.lang.Math.abs((d19 * d18) - (d28 * d17)) / java.lang.Math.sqrt((d19 * d19) + (d28 * d28));
    }
}
