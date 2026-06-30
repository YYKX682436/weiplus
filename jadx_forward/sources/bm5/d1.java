package bm5;

/* loaded from: classes5.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f104091a = new java.util.HashMap();

    public static bm5.v a(int i17) {
        return b(i17, null);
    }

    public static bm5.v b(int i17, java.lang.String str) {
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h0) ((c01.x7) i95.n0.c(c01.x7.class))).getClass();
        switch (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.c(i17)) {
            case 3:
            case 13:
            case 23:
            case 33:
            case 39:
                return bm5.v.f104276f;
            case 34:
                return bm5.v.f104282o;
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
            case 62:
            case 486539313:
                return bm5.v.f104277g;
            case 47:
            case 1048625:
                return bm5.v.f104281n;
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                pt0.f0.f439742b1.getClass();
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h0) ((c01.x7) i95.n0.c(c01.x7.class))).getClass();
                ot0.q v17 = ot0.q.v(str);
                int i18 = v17 != null ? v17.f430199i : 0;
                return i18 == 19 ? bm5.v.f104280m : (i18 == 6 || i18 == 74 || i18 == 130 || i18 == 131) ? bm5.v.f104278h : bm5.v.f104279i;
            case 1090519089:
                return bm5.v.f104278h;
            default:
                return bm5.v.f104283p;
        }
    }

    public static java.lang.String c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return "";
        }
        if (f9Var.A0() == 1) {
            return c01.z1.r();
        }
        java.lang.String Q0 = f9Var.Q0();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0)) {
            java.lang.String s17 = c01.w9.s(f9Var.j());
            if (Q0 != null && s17 != null && s17.length() > 0) {
                return s17;
            }
        }
        return Q0;
    }

    public static boolean d(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
        return Li.P0() == 2 || Li.P0() == 3 || Li.P0() == 5;
    }

    public static r45.k55 e(java.lang.String str) {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? !str.contains("appmsg") ? f("", com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "patMsg", null)) : f(".msg.appmsg", com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null)) : new r45.k55();
    }

    public static r45.k55 f(java.lang.String str, java.util.Map map) {
        r45.k55 k55Var = new r45.k55();
        if (map != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            java.lang.String concat = str.concat(".patMsg");
            java.lang.String str2 = (java.lang.String) map.get(concat + ".chatUser");
            if (str2 == null) {
                str2 = "";
            }
            k55Var.f459918d = str2;
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(concat + ".records.recordNum"), 0);
            for (int i17 = 0; i17 < D1; i17++) {
                r45.l55 l55Var = new r45.l55();
                java.lang.String str3 = concat + ".records.record";
                if (i17 > 0) {
                    str3 = str3 + i17;
                }
                java.lang.String str4 = (java.lang.String) map.get(str3 + ".fromUser");
                if (str4 == null) {
                    str4 = "";
                }
                l55Var.f460685d = str4;
                java.lang.String str5 = (java.lang.String) map.get(str3 + ".pattedUser");
                if (str5 == null) {
                    str5 = "";
                }
                l55Var.f460686e = str5;
                java.lang.String str6 = (java.lang.String) map.get(str3 + ".template");
                if (str6 == null) {
                    str6 = "";
                }
                l55Var.f460687f = str6;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                    java.lang.String str7 = (java.lang.String) map.get(str3 + ".templete");
                    if (str7 == null) {
                        str7 = "";
                    }
                    l55Var.f460687f = str7;
                }
                l55Var.f460688g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) map.get(str3 + ".createTime"));
                l55Var.f460689h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str3 + ".readStatus"), 0);
                l55Var.f460690i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) map.get(str3 + ".svrId"));
                l55Var.f460691m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str3 + ".showModifyTip"), 0);
                l55Var.f460692n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str3 + ".isNewPatMsg"), 0);
                k55Var.f459919e.add(l55Var);
            }
        }
        return k55Var;
    }
}
