package y35;

/* loaded from: classes11.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f540765a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f540766b;

    /* renamed from: c, reason: collision with root package name */
    public int f540767c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f540768d;

    /* renamed from: e, reason: collision with root package name */
    public long f540769e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f540770f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f540771g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f540772h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f540773i;

    /* renamed from: j, reason: collision with root package name */
    public r45.dz3 f540774j;

    public static y35.r a(android.content.Context context, long j17, boolean z17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i18) {
        y35.r rVar = new y35.r();
        rVar.f540769e = j17;
        rVar.f540770f = !z17;
        if (i17 == 0) {
            if (str2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageProvider", "build fail, fmsgInfo msgContent is null, fmsgInfo.talker = " + str);
                return null;
            }
            rVar.f540765a = str3;
            rVar.f540768d = str4;
            if (i18 == 4) {
                rVar.f540766b = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1s);
            } else if (i18 == 10 || i18 == 11) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5415x73917d14 c5415x73917d14 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5415x73917d14();
                am.l9 l9Var = c5415x73917d14.f135762g;
                l9Var.f88763a = str5;
                l9Var.f88764b = str6;
                c5415x73917d14.e();
                java.lang.Object[] objArr = new java.lang.Object[1];
                java.lang.String str8 = c5415x73917d14.f135763h.f88863a;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                objArr[0] = str8 != null ? str8 : "";
                rVar.f540766b = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1v, objArr);
            } else if (i18 == 31) {
                rVar.f540766b = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572391b24);
            } else if (i18 != 32) {
                switch (i18) {
                    case 58:
                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9.f34376x366c91de /* 59 */:
                    case 60:
                        com.p314xaae8f345.mm.p2621x8fb0427b.y8.i(str2);
                        rVar.f540766b = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1t);
                        break;
                    default:
                        rVar.f540766b = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1x);
                        break;
                }
            } else {
                rVar.f540766b = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1y);
            }
        } else if (z17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.e9 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(str2);
            rVar.f540772h = f17.H;
            rVar.f540773i = f17.I;
            rVar.f540765a = str3;
            rVar.f540768d = str4;
            if (str7 == null || str7.trim().equals("")) {
                rVar.f540766b = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbd);
            } else {
                rVar.f540766b = str7;
            }
        } else if (i17 == 1 || i17 == 2 || i17 == 3) {
            boolean b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.b(str2, "msg", null);
            if (b17) {
                com.p314xaae8f345.mm.p2621x8fb0427b.e9 f18 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageProvider", "fmsgTalker = %s, verifygetusernmae = %s, fmsgType = %s, fmsgContent = %s", str, f18.f275392a, java.lang.Integer.valueOf(i17), str2);
                rVar.f540768d = f18.f275394c;
                java.lang.String str9 = f18.f275397f;
                if (str9 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9.trim())) {
                    rVar.f540766b = "";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageProvider", "fmsgContent = %s", str2);
                } else {
                    rVar.f540766b = f18.f275397f;
                }
                rVar.f540772h = f18.H;
                rVar.f540773i = f18.I;
                rVar.f540765a = str;
            } else {
                rVar.f540765a = str;
                rVar.f540766b = str2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageProvider", "fmsgTalker = %s, fmsgType = %s, fmsgContent = %s, isStartMsgXml = %s.", str, java.lang.Integer.valueOf(i17), str2, java.lang.Boolean.valueOf(b17));
            }
        } else {
            rVar.f540765a = str;
            rVar.f540766b = str2;
        }
        return rVar;
    }

    public static y35.r b(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var) {
        return a(context, m7Var.f66370x5ea2cb68, m7Var.f66369xa5642172 % 2 == 0, m7Var.f66376x114ef53e, m7Var.f66367xc46a72d9, m7Var.f66371xd192ecda, m7Var.f66360x8f8e42f4, m7Var.f66362xe43f7ac2, m7Var.f66363xdb788472, m7Var.f66361x55f9b463, m7Var.f66364x1015fbec, m7Var.f66359xd368f610);
    }

    public static y35.r c(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        r45.dz3 dz3Var;
        int i17;
        java.lang.String str5;
        long j17 = p7Var.f72763xa3c65b86;
        boolean u07 = p7Var.u0();
        java.lang.String str6 = p7Var.f66493x114ef53e;
        java.lang.String str7 = p7Var.f66491xbeb3161d;
        int i18 = p7Var.f66494x2262335f;
        java.lang.String str8 = null;
        if (i18 == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.y8 i19 = com.p314xaae8f345.mm.p2621x8fb0427b.y8.i(str7);
            str5 = i19.f277891a;
            str = i19.f277892b;
            str2 = i19.f277898h;
            str3 = i19.f277899i;
            str4 = null;
            dz3Var = null;
            i17 = i19.f277897g;
        } else {
            r45.dz3 g17 = str7 != null ? com.p314xaae8f345.mm.p2621x8fb0427b.e9.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str7, "msg", null)) : null;
            if (u07) {
                com.p314xaae8f345.mm.p2621x8fb0427b.e9 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(str7);
                java.lang.String str9 = f17.f275392a;
                java.lang.String str10 = f17.f275394c;
                str4 = f17.f275397f;
                dz3Var = g17;
                i17 = 0;
                str5 = str9;
                str2 = null;
                str8 = f17.C == 1 ? f17.E : null;
                str = str10;
                str3 = null;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                dz3Var = g17;
                i17 = 0;
                str5 = null;
            }
        }
        y35.r a17 = a(context, j17, u07, str6, str7, i18, str5, str, str2, str3, str4, i17);
        a17.f540771g = str8;
        a17.f540774j = dz3Var;
        return a17;
    }

    public static y35.r d(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.pa paVar) {
        java.lang.String str = paVar.f66547x114ef53e;
        int i17 = paVar.f66544x29cbf907;
        y35.r rVar = new y35.r();
        rVar.f540769e = paVar.f72763xa3c65b86;
        int i18 = paVar.f66541xff7bdab7;
        rVar.f540770f = i18 == 1;
        rVar.f540765a = paVar.f66543x49f69af2;
        rVar.f540767c = i17;
        if (i18 == 1) {
            rVar.f540766b = paVar.f66538xad49e234;
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.e9 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(paVar.f66538xad49e234);
            java.lang.String str2 = f17.f275397f;
            if (str2 == null || str2.trim().equals("")) {
                rVar.f540766b = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572393b26);
            } else {
                rVar.f540766b = f17.f275397f;
            }
            rVar.f540768d = f17.f275394c;
        }
        return rVar;
    }

    public static y35.r e(android.content.Context context, dm.f7 f7Var) {
        java.lang.String str = f7Var.f66514x49f69af2;
        int i17 = f7Var.f66515x29cbf907;
        y35.r rVar = new y35.r();
        rVar.f540769e = f7Var.f72763xa3c65b86;
        int i18 = f7Var.f66511xff7bdab7;
        rVar.f540770f = i18 == 1;
        rVar.f540765a = str;
        rVar.f540767c = i17;
        if (i18 == 1) {
            rVar.f540766b = f7Var.f66507xad49e234;
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.e9 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(f7Var.f66507xad49e234);
            java.lang.String str2 = f17.f275397f;
            if (str2 == null || str2.trim().equals("")) {
                rVar.f540766b = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572393b26);
            } else {
                rVar.f540766b = f17.f275397f;
            }
            rVar.f540768d = f17.f275394c;
        }
        return rVar;
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.z3 f(com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        if (p7Var == null) {
            return z3Var;
        }
        if (p7Var.f66494x2262335f != 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.e9 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(p7Var.f66491xbeb3161d);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            z3Var2.X1(f17.f275392a);
            z3Var2.k1(f17.f275393b);
            z3Var2.M1(f17.f275394c);
            z3Var2.R1(f17.f275396e);
            z3Var2.S1(f17.f275395d);
            z3Var2.g3(f17.f275406o);
            z3Var2.h3(f17.f275407p);
            z3Var2.b3(f17.d());
            z3Var2.L2(f17.a());
            return z3Var2;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.y8 i17 = com.p314xaae8f345.mm.p2621x8fb0427b.y8.i(p7Var.f66491xbeb3161d);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var3.X1(i17.f277891a);
        z3Var3.k1(i17.f277893c);
        z3Var3.M1(i17.c());
        z3Var3.R1(i17.f277895e);
        z3Var3.S1(i17.f277894d);
        z3Var3.g3(i17.f277905o);
        z3Var3.b3(i17.f());
        z3Var3.L2(i17.b());
        z3Var3.h3(i17.f277906p);
        z3Var3.Z1(i17.f277907q);
        z3Var3.o3(i17.f277908r);
        z3Var3.C2(i17.f277915y);
        return z3Var3;
    }

    public static y35.r[] g(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.p7[] p7VarArr) {
        com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var;
        if (p7VarArr != null && p7VarArr.length != 0 && (p7Var = p7VarArr[0]) != null) {
            java.lang.String str = p7Var.f66493x114ef53e;
        }
        if (p7VarArr == null || p7VarArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageProvider", "convert fmsg fail, fmsgList is null");
            return null;
        }
        int length = p7VarArr.length;
        y35.r[] rVarArr = new y35.r[length];
        for (int i17 = 0; i17 < length; i17++) {
            rVarArr[(length - i17) - 1] = c(context, p7VarArr[i17]);
        }
        return rVarArr;
    }

    public static y35.r[] h(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.pa[] paVarArr) {
        com.p314xaae8f345.mm.p2621x8fb0427b.pa paVar;
        if (paVarArr != null && paVarArr.length != 0 && (paVar = paVarArr[0]) != null) {
            java.lang.String str = paVar.f66543x49f69af2;
        }
        if (paVarArr == null || paVarArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageProvider", "convert shake fail, shakeList is null");
            return null;
        }
        int length = paVarArr.length;
        y35.r[] rVarArr = new y35.r[length];
        for (int i17 = 0; i17 < length; i17++) {
            rVarArr[(length - i17) - 1] = d(context, paVarArr[i17]);
        }
        return rVarArr;
    }

    public static y35.r[] i(android.content.Context context, dm.f7[] f7VarArr) {
        dm.f7 f7Var;
        if (f7VarArr != null && f7VarArr.length != 0 && (f7Var = f7VarArr[0]) != null) {
            java.lang.String str = f7Var.f66514x49f69af2;
        }
        if (f7VarArr == null || f7VarArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageProvider", "convert lbs fail, lbsList is null");
            return null;
        }
        int length = f7VarArr.length;
        y35.r[] rVarArr = new y35.r[length];
        for (int i17 = 0; i17 < length; i17++) {
            rVarArr[(length - i17) - 1] = e(context, f7VarArr[i17]);
        }
        return rVarArr;
    }

    public static void l(java.lang.String str, int i17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageProviderKt", "tryToAddSayHiMsg called with: userName = " + str + ", addScene = " + i17 + " source:" + source);
        }
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new y35.s(str, i17, null), 2, null);
        }
    }

    public r45.v60 j() {
        java.util.LinkedList linkedList;
        r45.dz3 dz3Var = this.f540774j;
        if (dz3Var == null || (linkedList = dz3Var.f454402e) == null || linkedList.isEmpty()) {
            return null;
        }
        return (r45.v60) this.f540774j.f454402e.get(0);
    }

    public boolean k() {
        java.util.LinkedList linkedList;
        r45.dz3 dz3Var = this.f540774j;
        return (dz3Var == null || (linkedList = dz3Var.f454402e) == null || linkedList.isEmpty()) ? false : true;
    }
}
