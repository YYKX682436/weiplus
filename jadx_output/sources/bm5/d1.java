package bm5;

/* loaded from: classes5.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f22558a = new java.util.HashMap();

    public static bm5.v a(int i17) {
        return b(i17, null);
    }

    public static bm5.v b(int i17, java.lang.String str) {
        ((com.tencent.mm.pluginsdk.model.app.h0) ((c01.x7) i95.n0.c(c01.x7.class))).getClass();
        switch (com.tencent.mm.pluginsdk.model.app.k0.c(i17)) {
            case 3:
            case 13:
            case 23:
            case 33:
            case 39:
                return bm5.v.f22743f;
            case 34:
                return bm5.v.f22749o;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
            case 62:
            case 486539313:
                return bm5.v.f22744g;
            case 47:
            case 1048625:
                return bm5.v.f22748n;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                pt0.f0.f358209b1.getClass();
                ((com.tencent.mm.pluginsdk.model.app.h0) ((c01.x7) i95.n0.c(c01.x7.class))).getClass();
                ot0.q v17 = ot0.q.v(str);
                int i18 = v17 != null ? v17.f348666i : 0;
                return i18 == 19 ? bm5.v.f22747m : (i18 == 6 || i18 == 74 || i18 == 130 || i18 == 131) ? bm5.v.f22745h : bm5.v.f22746i;
            case 1090519089:
                return bm5.v.f22745h;
            default:
                return bm5.v.f22750p;
        }
    }

    public static java.lang.String c(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return "";
        }
        if (f9Var.A0() == 1) {
            return c01.z1.r();
        }
        java.lang.String Q0 = f9Var.Q0();
        if (com.tencent.mm.storage.z3.R4(Q0)) {
            java.lang.String s17 = c01.w9.s(f9Var.j());
            if (Q0 != null && s17 != null && s17.length() > 0) {
                return s17;
            }
        }
        return Q0;
    }

    public static boolean d(long j17, java.lang.String str) {
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        return Li.P0() == 2 || Li.P0() == 3 || Li.P0() == 5;
    }

    public static r45.k55 e(java.lang.String str) {
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) ? !str.contains("appmsg") ? f("", com.tencent.mm.sdk.platformtools.aa.d(str, "patMsg", null)) : f(".msg.appmsg", com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null)) : new r45.k55();
    }

    public static r45.k55 f(java.lang.String str, java.util.Map map) {
        r45.k55 k55Var = new r45.k55();
        if (map != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            java.lang.String concat = str.concat(".patMsg");
            java.lang.String str2 = (java.lang.String) map.get(concat + ".chatUser");
            if (str2 == null) {
                str2 = "";
            }
            k55Var.f378385d = str2;
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(concat + ".records.recordNum"), 0);
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
                l55Var.f379152d = str4;
                java.lang.String str5 = (java.lang.String) map.get(str3 + ".pattedUser");
                if (str5 == null) {
                    str5 = "";
                }
                l55Var.f379153e = str5;
                java.lang.String str6 = (java.lang.String) map.get(str3 + ".template");
                if (str6 == null) {
                    str6 = "";
                }
                l55Var.f379154f = str6;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                    java.lang.String str7 = (java.lang.String) map.get(str3 + ".templete");
                    if (str7 == null) {
                        str7 = "";
                    }
                    l55Var.f379154f = str7;
                }
                l55Var.f379155g = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) map.get(str3 + ".createTime"));
                l55Var.f379156h = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str3 + ".readStatus"), 0);
                l55Var.f379157i = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) map.get(str3 + ".svrId"));
                l55Var.f379158m = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str3 + ".showModifyTip"), 0);
                l55Var.f379159n = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str3 + ".isNewPatMsg"), 0);
                k55Var.f378386e.add(l55Var);
            }
        }
        return k55Var;
    }
}
