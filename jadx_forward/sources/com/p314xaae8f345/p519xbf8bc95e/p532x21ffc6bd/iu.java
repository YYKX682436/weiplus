package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class iu {
    private static double[] a(double d17, double d18, int i17) {
        double d19 = d17 + d18;
        double abs = java.lang.Math.abs(d18) / 2.0d;
        double sqrt = java.lang.Math.sqrt((4.0d * abs) / 3.141592653589793d);
        int i18 = i17 >> 1;
        int i19 = i18 << 1;
        double[] dArr = new double[i19];
        int i27 = i18 - 1;
        dArr[i27] = d17 + (d18 / 2.0d);
        dArr[i19 - 1] = d19;
        double d27 = sqrt / i18;
        int i28 = 0;
        while (i28 < i27) {
            int i29 = i28 + 1;
            double d28 = sqrt - (i29 * d27);
            double acos = java.lang.Math.acos(d28 / sqrt);
            double sin = (((acos * abs) * 2.0d) / 3.141592653589793d) - ((d28 * (java.lang.Math.sin(acos) * sqrt)) / 2.0d);
            if (d18 < 0.0d) {
                sin = -sin;
            }
            dArr[i28] = d17 + sin;
            dArr[(i19 - 2) - i28] = d19 - sin;
            i28 = i29;
        }
        return dArr;
    }

    private static double[] b(double d17, double d18, int i17) {
        double d19 = d17 + d18;
        double[] dArr = new double[i17];
        double d27 = i17;
        double d28 = ((d18 * 2.0d) / d27) / d27;
        double d29 = d28 / 2.0d;
        int i18 = i17 - 1;
        dArr[i18] = d19;
        dArr[0] = d17 + d29;
        for (int i19 = 1; i19 < i18; i19++) {
            dArr[i19] = dArr[i19 - 1] + (i19 * d28) + d29;
        }
        return dArr;
    }

    public static double[] a(double d17, double d18) {
        double d19 = d17 + d18;
        double[] dArr = new double[20];
        dArr[9] = (d18 / 2.0d) + d17;
        dArr[19] = d19;
        double d27 = (d18 / 10.0d) / 10.0d;
        double d28 = d27 / 2.0d;
        dArr[0] = d17 + d28;
        dArr[18] = d19 - d28;
        for (int i17 = 1; i17 < 9; i17++) {
            double d29 = (i17 * d27) + d28;
            dArr[i17] = dArr[i17 - 1] + d29;
            dArr[18 - i17] = dArr[19 - i17] - d29;
        }
        return dArr;
    }

    public static <A extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64> com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hv a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar, A a17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64 interfaceC26003xba1d3b64 = null;
        if (bnVar == null || a17 == null) {
            return null;
        }
        if (a17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hv) {
            return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hv) a17;
        }
        java.lang.Class<?> cls = a17.getClass();
        if (cls == com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26002x1d28ffe6.class) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26002x1d28ffe6 c26002x1d28ffe6 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26002x1d28ffe6) a17;
            interfaceC26003xba1d3b64 = bnVar.mo36654xe3337e2(c26002x1d28ffe6.f49320x7ddc2de7, c26002x1d28ffe6.f49321x579c3a76);
        } else if (cls == com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26083x4d75d17a.class) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26083x4d75d17a c26083x4d75d17a = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26083x4d75d17a) a17;
            interfaceC26003xba1d3b64 = bnVar.mo36659x3e800976(c26083x4d75d17a.f49774xbe102981, c26083x4d75d17a.f49776x32d590, c26083x4d75d17a.f49775xbe102982, c26083x4d75d17a.f49777x32d591);
        } else if (cls == com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26020xed7a79b1.class) {
            interfaceC26003xba1d3b64 = bnVar.mo36656x1db74135(((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26020xed7a79b1) a17).f49433x7d98069b);
        } else if (cls == com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26005x4fc39e5e.class) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26005x4fc39e5e c26005x4fc39e5e = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26005x4fc39e5e) a17;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26026x53207927 mo36655xbcb3a55a = bnVar.mo36655xbcb3a55a(c26005x4fc39e5e.f49323xbdc89d59);
            java.util.Iterator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64> it = c26005x4fc39e5e.f49322xeeea4dbc.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hw) mo36655xbcb3a55a).mo36789x3a72e7e3(a(bnVar, it.next()));
            }
            interfaceC26003xba1d3b64 = mo36655xbcb3a55a;
        } else if (cls == com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26081x47d8ec49.class) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26081x47d8ec49 c26081x47d8ec49 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26081x47d8ec49) a17;
            interfaceC26003xba1d3b64 = bnVar.mo36658x7815b3cd(c26081x47d8ec49.f49758x42618363, c26081x47d8ec49.f49762xa0a308b4, c26081x47d8ec49.f49759x7cb28328, c26081x47d8ec49.f49760x7cb28329, c26081x47d8ec49.f49761x7cb2832a);
        } else if (cls == com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26093x12ff9df6.class) {
            interfaceC26003xba1d3b64 = bnVar.mo36660x83f577f2(((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26093x12ff9df6) a17).f49813x6a5f7704);
        }
        if (interfaceC26003xba1d3b64 != null) {
            interfaceC26003xba1d3b64.mo36783xffd6ec16(a17.mo36786x51e8b0a());
            interfaceC26003xba1d3b64.mo36784x142dd649(a17.mo36787xdde4db3d());
            interfaceC26003xba1d3b64.mo36788x958b1416(a17.mo36785xb9f507a2());
        }
        return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hv) interfaceC26003xba1d3b64;
    }
}
