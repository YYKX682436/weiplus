package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class li {
    public static double a(double d17) {
        double d18 = d17 % 360.0d;
        if (d18 > 180.0d) {
            return d18 - 360.0d;
        }
        return d18 < -180.0d ? d18 + 360.0d : d18;
    }

    private static double b(double d17) {
        return (d17 * 3.141592653589793d) / 180.0d;
    }

    private static double c(double d17) {
        return (d17 * 180.0d) / 3.141592653589793d;
    }

    public static double a(double d17, double d18, double d19, double d27, double d28, double d29) {
        return ((((d18 - d27) * d28) + ((d19 - d17) * d29)) + (d17 * d27)) - (d19 * d18);
    }

    private static double[] b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d263) {
        double d17;
        double[] a17 = a(c26041x873d1d262, c26041x873d1d263);
        double d18 = 0.0d;
        if (java.lang.Double.isNaN(a17[0])) {
            d17 = c26041x873d1d26.f49501xaa2bac6c;
        } else {
            double d19 = a17[0];
            if (d19 == 0.0d) {
                d18 = Double.NaN;
                d17 = Double.NaN;
            } else {
                d18 = (-1.0d) / d19;
                d17 = c26041x873d1d26.f49501xaa2bac6c + ((1.0d / d19) * c26041x873d1d26.f49502x83009af);
            }
        }
        return new double[]{d18, d17};
    }

    private static boolean c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d263) {
        return (a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d262, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d263) - a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d26, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d262)) - a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d26, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d263) < 1.0E-6d;
    }

    private static double a(double d17, int i17) {
        try {
            return new java.math.BigDecimal(d17).setScale(i17, 4).doubleValue();
        } catch (java.lang.Exception unused) {
            return d17;
        }
    }

    private static float a(float f17, int i17) {
        try {
            return new java.math.BigDecimal(f17).setScale(i17, 4).floatValue();
        } catch (java.lang.Exception unused) {
            return f17;
        }
    }

    private static double c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad5198, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad51982, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad51983) {
        return java.lang.Math.atan((a(interfaceC25985x82ad5198, interfaceC25985x82ad51982) / 2.0d) / a(interfaceC25985x82ad51983, interfaceC25985x82ad5198, interfaceC25985x82ad51982)) * 2.0d;
    }

    private static android.graphics.PointF a(android.graphics.PointF pointF, android.graphics.PointF pointF2, android.graphics.PointF pointF3, android.graphics.PointF pointF4) {
        float f17 = pointF2.x;
        float f18 = pointF.x;
        if (f17 != f18) {
            float f19 = pointF4.x;
            float f27 = pointF3.x;
            if (f19 != f27) {
                float f28 = pointF2.y;
                float f29 = pointF.y;
                float f37 = (f28 - f29) / (f17 - f18);
                float f38 = pointF4.y;
                float f39 = pointF3.y;
                float f47 = (f38 - f39) / (f19 - f27);
                if (f37 == f47) {
                    return null;
                }
                float f48 = ((f39 * f19) - (f38 * f27)) / (f19 - f27);
                float f49 = (f48 - (((f29 * f17) - (f28 * f18)) / (f17 - f18))) / (f37 - f47);
                return new android.graphics.PointF(f49, (f47 * f49) + f48);
            }
        }
        return null;
    }

    private static double b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad5198, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad51982) {
        return (interfaceC25985x82ad5198.y() - interfaceC25985x82ad51982.y()) / (interfaceC25985x82ad5198.x() - interfaceC25985x82ad51982.x());
    }

    public static double b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad5198, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad51982, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad51983) {
        return java.lang.Math.atan((a(interfaceC25985x82ad5198, interfaceC25985x82ad51982) / 2.0d) / a(interfaceC25985x82ad51983, interfaceC25985x82ad5198, interfaceC25985x82ad51982)) * 2.0d * a(interfaceC25985x82ad5198, interfaceC25985x82ad51983);
    }

    private static double c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad5198, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad51982) {
        return (java.lang.Math.atan((interfaceC25985x82ad5198.y() - interfaceC25985x82ad51982.y()) / (interfaceC25985x82ad5198.x() - interfaceC25985x82ad51982.x())) * 180.0d) / 3.141592653589793d;
    }

    private static android.graphics.Rect a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, android.graphics.Rect rect) {
        int max = java.lang.Math.max(java.lang.Math.abs(rect.left - c4247x704e24df.m35332x962aa94a()), java.lang.Math.abs(rect.right - c4247x704e24df.m35332x962aa94a()));
        int max2 = java.lang.Math.max(java.lang.Math.abs(rect.top - c4247x704e24df.m35331xbc3301f3()), java.lang.Math.abs(rect.bottom - c4247x704e24df.m35331xbc3301f3()));
        return new android.graphics.Rect(c4247x704e24df.m35332x962aa94a() - max2, c4247x704e24df.m35331xbc3301f3() - max, c4247x704e24df.m35332x962aa94a() + max2, c4247x704e24df.m35331xbc3301f3() + max);
    }

    private static android.graphics.Rect a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2) {
        if (c4247x704e24df == null || c4247x704e24df2 == null || c4247x704e24df.m35330xb2c87fbf(c4247x704e24df2)) {
            return null;
        }
        int abs = java.lang.Math.abs(c4247x704e24df.m35332x962aa94a() - c4247x704e24df2.m35332x962aa94a());
        int abs2 = java.lang.Math.abs(c4247x704e24df.m35331xbc3301f3() - c4247x704e24df2.m35331xbc3301f3());
        return new android.graphics.Rect(c4247x704e24df.m35332x962aa94a() - abs, c4247x704e24df.m35331xbc3301f3() - abs2, c4247x704e24df.m35332x962aa94a() + abs, c4247x704e24df.m35331xbc3301f3() + abs2);
    }

    private static com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df3) {
        int m35331xbc3301f3 = c4247x704e24df2.m35331xbc3301f3() - c4247x704e24df.m35331xbc3301f3();
        int m35332x962aa94a = c4247x704e24df2.m35332x962aa94a() - c4247x704e24df.m35332x962aa94a();
        if (m35331xbc3301f3 == 0 && m35332x962aa94a == 0) {
            return null;
        }
        double m35331xbc3301f32 = (((c4247x704e24df3.m35331xbc3301f3() - c4247x704e24df.m35331xbc3301f3()) * m35331xbc3301f3) + ((c4247x704e24df3.m35332x962aa94a() - c4247x704e24df.m35332x962aa94a()) * m35332x962aa94a)) / ((m35331xbc3301f3 * m35331xbc3301f3) + (m35332x962aa94a * m35332x962aa94a));
        if (m35331xbc3301f32 < 0.0d) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(c4247x704e24df);
        }
        if (m35331xbc3301f32 > 1.0d) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(c4247x704e24df2);
        }
        return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(c4247x704e24df.m35331xbc3301f3() + ((int) (m35331xbc3301f3 * m35331xbc3301f32)), c4247x704e24df.m35332x962aa94a() + ((int) (m35332x962aa94a * m35331xbc3301f32)));
    }

    private static double[] a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262) {
        double d17;
        double d18;
        if (java.lang.Math.abs(c26041x873d1d26.f49502x83009af - c26041x873d1d262.f49502x83009af) < 1.0E-6d) {
            d18 = Double.NaN;
            d17 = Double.NaN;
        } else if (java.lang.Math.abs(c26041x873d1d26.f49501xaa2bac6c - c26041x873d1d262.f49501xaa2bac6c) < 1.0E-6d) {
            double d19 = c26041x873d1d26.f49501xaa2bac6c;
            d18 = 0.0d;
            d17 = d19;
        } else {
            double d27 = c26041x873d1d262.f49501xaa2bac6c;
            double d28 = c26041x873d1d26.f49501xaa2bac6c;
            double d29 = c26041x873d1d262.f49502x83009af;
            double d37 = c26041x873d1d26.f49502x83009af;
            double d38 = (d27 - d28) / (d29 - d37);
            d17 = ((d29 * d28) - (d37 * d27)) / (d29 - d28);
            d18 = d38;
        }
        return new double[]{d18, d17};
    }

    public static double a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad5198, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad51982, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad51983) {
        double a17 = a(interfaceC25985x82ad5198, interfaceC25985x82ad51982);
        double a18 = a(interfaceC25985x82ad5198, interfaceC25985x82ad51983);
        double a19 = a(interfaceC25985x82ad51982, interfaceC25985x82ad51983);
        double d17 = a17 + a18;
        if (d17 == a19) {
            return 0.0d;
        }
        if (a19 <= 1.0E-6d) {
            return a17;
        }
        double d18 = a18 * a18;
        double d19 = a17 * a17;
        double d27 = a19 * a19;
        if (d18 >= d19 + d27) {
            return a17;
        }
        if (d19 >= d18 + d27) {
            return a18;
        }
        double d28 = (d17 + a19) / 2.0d;
        return (java.lang.Math.sqrt((((d28 - a17) * d28) * (d28 - a18)) * (d28 - a19)) * 2.0d) / a19;
    }

    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d263) {
        double d17;
        double d18;
        double[] a17 = a(c26041x873d1d262, c26041x873d1d263);
        if (java.lang.Double.isNaN(a17[0])) {
            d18 = c26041x873d1d262.f49502x83009af;
            d17 = c26041x873d1d26.f49501xaa2bac6c;
        } else {
            double d19 = a17[0];
            if (d19 == 0.0d) {
                double d27 = c26041x873d1d26.f49502x83009af;
                double d28 = c26041x873d1d262.f49501xaa2bac6c;
                d18 = d27;
                d17 = d28;
            } else {
                double d29 = d19 * d19;
                double d37 = c26041x873d1d262.f49502x83009af;
                double d38 = c26041x873d1d26.f49501xaa2bac6c;
                double d39 = c26041x873d1d262.f49501xaa2bac6c;
                double d47 = (((d29 * d37) + ((d38 - d39) * d19)) + c26041x873d1d26.f49502x83009af) / (d29 + 1.0d);
                d17 = (d19 * (d47 - d37)) + d39;
                d18 = d47;
            }
        }
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(d17, d18);
    }

    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262, int i17) {
        double d17 = c26041x873d1d262.f49502x83009af;
        double d18 = c26041x873d1d26.f49502x83009af;
        double d19 = d17 > d18 ? d18 - i17 : d18 + i17;
        double d27 = c26041x873d1d262.f49501xaa2bac6c;
        double d28 = c26041x873d1d26.f49501xaa2bac6c;
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(d27 > d28 ? d28 - i17 : d28 + i17, d19);
    }

    public static double a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad5198, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad51982) {
        double x17 = interfaceC25985x82ad5198.x() - interfaceC25985x82ad51982.x();
        double y17 = interfaceC25985x82ad5198.y() - interfaceC25985x82ad51982.y();
        return java.lang.Math.sqrt((x17 * x17) + (y17 * y17));
    }

    public static boolean a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, double d17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d263) {
        if (a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d26, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d262, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d263) - d17 > 1.0E-6d) {
            return false;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a17 = a(c26041x873d1d26, c26041x873d1d262, c26041x873d1d263);
        return (a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d262, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d263) - a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) a17, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d262)) - a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) a17, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d263) < 1.0E-6d;
    }

    private static java.lang.String a() {
        byte[] bArr = new byte[20];
        new java.security.SecureRandom().nextBytes(bArr);
        return new java.lang.String(bArr);
    }

    private static int a(int i17) {
        int i18 = i17 - 0;
        if (i18 > 0) {
            return new java.security.SecureRandom().nextInt(i18) + 0;
        }
        return 0;
    }

    public static java.lang.String a(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? str : com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35833x40453099(str.getBytes());
    }

    public static java.lang.String a(java.io.File file) {
        int i17;
        java.io.FileInputStream fileInputStream = null;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-1");
                byte[] bArr = new byte[10485760];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                java.lang.String bigInteger = new java.math.BigInteger(1, messageDigest.digest()).toString(16);
                int length = 40 - bigInteger.length();
                if (length > 0) {
                    for (i17 = 0; i17 < length; i17++) {
                        bigInteger = "0".concat(java.lang.String.valueOf(bigInteger));
                    }
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) fileInputStream2);
                return bigInteger;
            } catch (java.io.IOException | java.security.NoSuchAlgorithmException unused) {
                fileInputStream = fileInputStream2;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) fileInputStream);
                return "";
            } catch (java.lang.Throwable th6) {
                th = th6;
                fileInputStream = fileInputStream2;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) fileInputStream);
                throw th;
            }
        } catch (java.io.IOException | java.security.NoSuchAlgorithmException unused2) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static double a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad5198, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad51982, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad51983, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad51984) {
        double x17 = (interfaceC25985x82ad51982.x() - interfaceC25985x82ad5198.x()) * 2.0d;
        double y17 = (interfaceC25985x82ad51982.y() - interfaceC25985x82ad5198.y()) * 2.0d;
        double x18 = (((interfaceC25985x82ad51982.x() * interfaceC25985x82ad51982.x()) + (interfaceC25985x82ad51982.y() * interfaceC25985x82ad51982.y())) - (interfaceC25985x82ad5198.x() * interfaceC25985x82ad5198.x())) - (interfaceC25985x82ad5198.y() * interfaceC25985x82ad5198.y());
        double x19 = (interfaceC25985x82ad51983.x() - interfaceC25985x82ad51982.x()) * 2.0d;
        double y18 = (interfaceC25985x82ad51983.y() - interfaceC25985x82ad51982.y()) * 2.0d;
        double x27 = (((interfaceC25985x82ad51983.x() * interfaceC25985x82ad51983.x()) + (interfaceC25985x82ad51983.y() * interfaceC25985x82ad51983.y())) - (interfaceC25985x82ad51982.x() * interfaceC25985x82ad51982.x())) - (interfaceC25985x82ad51982.y() * interfaceC25985x82ad51982.y());
        double d17 = (x18 * y18) - (x27 * y17);
        double d18 = (y18 * x17) - (y17 * x19);
        double d19 = d17 / d18;
        double d27 = ((x17 * x27) - (x19 * x18)) / d18;
        interfaceC25985x82ad51984.mo36732x35d036(d19);
        interfaceC25985x82ad51984.mo36733x35d037(d27);
        return java.lang.Math.sqrt(java.lang.Math.pow(interfaceC25985x82ad5198.x() - d19, 2.0d) + java.lang.Math.pow(interfaceC25985x82ad5198.y() - d27, 2.0d));
    }

    public static double a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad5198, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad51982, double d17, boolean z17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 interfaceC25985x82ad51983) {
        double a17 = (a(interfaceC25985x82ad5198, interfaceC25985x82ad51982) * 0.5d) / java.lang.Math.sin(b(0.5d * d17));
        double x17 = (interfaceC25985x82ad5198.x() + interfaceC25985x82ad51982.x()) / 2.0d;
        double y17 = (interfaceC25985x82ad5198.y() + interfaceC25985x82ad51982.y()) / 2.0d;
        double sqrt = java.lang.Math.sqrt((java.lang.Math.pow(a17, 2.0d) / (java.lang.Math.pow(interfaceC25985x82ad5198.x() - interfaceC25985x82ad51982.x(), 2.0d) + java.lang.Math.pow(interfaceC25985x82ad5198.y() - interfaceC25985x82ad51982.y(), 2.0d))) - 0.25d);
        double y18 = (interfaceC25985x82ad5198.y() - interfaceC25985x82ad51982.y()) * sqrt;
        double x18 = (interfaceC25985x82ad51982.x() - interfaceC25985x82ad5198.x()) * sqrt;
        if (d17 - 180.0d <= 1.0E-6d) {
            y18 = -y18;
            x18 = -x18;
        }
        if (java.lang.Double.isNaN(y18)) {
            y18 = 0.0d;
        }
        if (java.lang.Double.isNaN(x18)) {
            x18 = 0.0d;
        }
        double d18 = z17 ? x17 + y18 : x17 - y18;
        double d19 = z17 ? y17 + x18 : y17 - x18;
        interfaceC25985x82ad51983.mo36732x35d036(d18);
        interfaceC25985x82ad51983.mo36733x35d037(d19);
        return a17;
    }

    public static <T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198> void a(T t17, double d17, T t18, T t19, boolean z17, com.p314xaae8f345.map.p511x696c9db.InterfaceC4312x55abeb17<android.util.Pair<java.lang.Double, java.lang.Double>> interfaceC4312x55abeb17) {
        double atan = (java.lang.Math.atan((t17.y() - t18.y()) / (t17.x() - t18.x())) * 180.0d) / 3.141592653589793d;
        boolean z18 = t17.x() > t18.x() ? !z17 : z17;
        int i17 = 0;
        double d18 = 0.0d;
        while (i17 < 360) {
            double d19 = i17;
            double tan = java.lang.Math.tan(b(z17 ? atan - d19 : d19 + atan));
            if (d18 != 0.0d && d18 * tan < 0.0d && java.lang.Math.abs(tan) > 1.0d) {
                z18 = !z18;
            }
            double sqrt = d17 / java.lang.Math.sqrt((tan * tan) + 1.0d);
            double d27 = tan * sqrt;
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, i17 + ":curDeltaK[" + tan + "]deltaKChanged[" + z18 + "]clockwise[" + z17 + "]deltaX[" + sqrt + "]deltaY[" + d27 + "]");
            if (z18) {
                sqrt = -sqrt;
                d27 = -d27;
            }
            double x17 = t17.x();
            double d28 = z17 ? x17 - sqrt : x17 + sqrt;
            double y17 = t17.y();
            double d29 = z17 ? y17 - d27 : y17 + d27;
            double a17 = a(t18.x(), t18.y(), t19.x(), t19.y(), d28, d29);
            if (!z17 ? a17 < 0.0d : a17 > 0.0d) {
                interfaceC4312x55abeb17.mo35817xf5bc2045(i17, new android.util.Pair<>(java.lang.Double.valueOf(d28), java.lang.Double.valueOf(d29)));
            }
            i17++;
            d18 = tan;
        }
    }
}
