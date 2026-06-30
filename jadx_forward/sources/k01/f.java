package k01;

/* loaded from: classes9.dex */
public abstract class f {
    /* JADX WARN: Can't wrap try/catch for region: R(9:9|(2:11|(7:15|16|17|18|(1:20)|21|22))|26|16|17|18|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeAppPrivateMessageNativeExtraData", r0, "", new java.lang.Object[0]);
        r0 = "{}";
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[Catch: JSONException -> 0x006c, TryCatch #0 {JSONException -> 0x006c, blocks: (B:18:0x0054, B:20:0x0062, B:21:0x0067), top: B:17:0x0054 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 r8, ot0.q r9) {
        /*
            if (r8 == 0) goto L94
            if (r9 == 0) goto L94
            java.lang.Class<ot0.a> r0 = ot0.a.class
            ot0.h r0 = r9.y(r0)
            ot0.a r0 = (ot0.a) r0
            if (r0 == 0) goto L1c
            java.lang.String r1 = r0.f429898u
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r1 != 0) goto L1c
            am.nx r1 = r8.f136390g
            java.lang.String r2 = r0.f429898u
            r1.F = r2
        L1c:
            if (r0 == 0) goto L7c
            boolean r0 = r0.f429900w
            l15.c r1 = new l15.c
            r1.<init>()
            java.lang.String r2 = r9.I2
            r1.m126728xdc93280d(r2)
            v05.b r1 = r1.k()
            r2 = 0
            if (r1 == 0) goto L51
            int r4 = r1.f513848e
            int r5 = r4 + 74
            com.tencent.mm.protobuf.f r5 = r1.m75936x14adae67(r5)
            w05.h r5 = (w05.h) r5
            if (r5 == 0) goto L51
            int r4 = r4 + 74
            com.tencent.mm.protobuf.f r1 = r1.m75936x14adae67(r4)
            w05.h r1 = (w05.h) r1
            int r1 = r1.n()
            if (r1 <= 0) goto L51
            long r4 = java.lang.System.currentTimeMillis()
            goto L52
        L51:
            r4 = r2
        L52:
            am.nx r1 = r8.f136390g
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6c
            r6.<init>()     // Catch: org.json.JSONException -> L6c
            java.lang.String r7 = "isPrivateMessage"
            r6.put(r7, r0)     // Catch: org.json.JSONException -> L6c
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L67
            java.lang.String r0 = "click_timestamp"
            r6.put(r0, r4)     // Catch: org.json.JSONException -> L6c
        L67:
            java.lang.String r0 = r6.toString()     // Catch: org.json.JSONException -> L6c
            goto L7a
        L6c:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "MicroMsg.WeAppPrivateMessageNativeExtraData"
            java.lang.String r4 = ""
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r0, r4, r2)
            java.lang.String r0 = "{}"
        L7a:
            r1.G = r0
        L7c:
            java.lang.Class<com.tencent.mm.pluginsdk.ui.tools.g0> r0 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0.class
            ot0.h r9 = r9.y(r0)
            com.tencent.mm.pluginsdk.ui.tools.g0 r9 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0) r9
            if (r9 == 0) goto L94
            java.lang.String r0 = r9.f273172k
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r0 != 0) goto L94
            am.nx r8 = r8.f136390g
            java.lang.String r9 = r9.f273172k
            r8.f89014p = r9
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k01.f.a(com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent, ot0.q):void");
    }

    public static void b(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625, ot0.q qVar) {
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f89006h = qVar.f430210k2;
        nxVar.f88999a = qVar.f430206j2;
        nxVar.f89000b = qVar.f430202i2;
        int i17 = qVar.f430270z2;
        nxVar.f89001c = i17;
        nxVar.f89010l = qVar.f430218m2;
        nxVar.f89007i = qVar.A2;
        nxVar.f89013o.f151952h = qVar.f430250u2;
        nxVar.f89011m = i17 != 0;
    }

    public static void c(java.lang.String str, k91.v5 v5Var, ot0.q qVar) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6.class)).d4(str);
            } catch (java.lang.Exception unused) {
            }
        }
        ((ku5.t0) ku5.t0.f394148d).a(new k01.e(v5Var, qVar));
    }

    public static void d(ot0.q qVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625) {
        java.lang.String wi6;
        ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
        if (aVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.R)) {
            return;
        }
        am.nx nxVar = c6113xa3727625.f136390g;
        if (nxVar.f89013o == null) {
            nxVar.f89013o = new com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9();
        }
        boolean contains = aVar.R.contains("allPage");
        am.nx nxVar2 = c6113xa3727625.f136390g;
        if (!contains) {
            nxVar2.f89018t = aVar.R;
            nxVar2.f89013o.f151953i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11811x8e083f42("subpackage");
            return;
        }
        java.lang.String str = aVar.R;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            wi6 = null;
        } else {
            wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.w0) ((k01.q0) i95.n0.c(k01.q0.class))).wi(str);
            if (wi6 == null) {
                wi6 = "";
            }
        }
        nxVar2.f89018t = wi6;
        nxVar2.f89013o.f151953i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11811x8e083f42("allPage");
    }

    public static boolean e(ot0.q qVar, k91.v5 v5Var) {
        boolean b17;
        if (v5Var == null) {
            ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
            b17 = aVar != null ? k01.i.b(aVar.f429896s, 16) : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[showFinancialLicenseFlag] attrs is null, get showFinancialLicenseFlag flag from AppContentAppBrandPiece showFinancialLicenseFlag:%b", java.lang.Boolean.valueOf(b17));
        } else {
            ot0.a aVar2 = (ot0.a) qVar.y(ot0.a.class);
            if (v5Var.w0() == null || qVar.A2 <= v5Var.w0().f158977d || aVar2 == null) {
                b17 = k01.i.b(v5Var.u0() != null ? v5Var.u0().f387177s : 0, 16);
            } else {
                boolean b18 = k01.i.b(aVar2.f429896s, 16);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[showFinancialLicenseFlag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(qVar.A2), java.lang.Integer.valueOf(v5Var.w0().f158977d));
                b17 = b18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[showFinancialLicenseFlag] use attrs:%b", java.lang.Boolean.valueOf(b17));
        }
        return b17;
    }

    public static boolean f(ot0.q qVar, k91.v5 v5Var) {
        boolean b17;
        ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
        if (v5Var == null) {
            b17 = aVar != null ? k01.i.b(aVar.f429895r, 1) : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[isShowFlagshipTag] attrs is null, get showFlagshipFlag from AppContentAppBrandPiece showFlagshipFlag:%b", java.lang.Boolean.valueOf(b17));
        } else {
            if (v5Var.w0() == null || qVar.A2 <= v5Var.w0().f158977d || aVar == null) {
                b17 = k01.i.b(v5Var.u0() != null ? v5Var.u0().f387176r : 0, 1);
            } else {
                boolean b18 = k01.i.b(aVar.f429895r, 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[isShowFlagshipTag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(qVar.A2), java.lang.Integer.valueOf(v5Var.w0().f158977d));
                b17 = b18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[isShowFlagshipTag] use attrs:%b", java.lang.Boolean.valueOf(b17));
        }
        if (b17) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_flagship_store, 0) == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(ot0.q qVar, k91.v5 v5Var) {
        boolean b17;
        if (v5Var == null) {
            ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
            b17 = aVar != null ? k01.i.b(aVar.f429893p, 16) : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[wantShowRelievedBuyFlag] attrs is null, get showRelievedBuyFlag flag from AppContentAppBrandPiece showRelievedBuyFlag:%b", java.lang.Boolean.valueOf(b17));
        } else {
            ot0.a aVar2 = (ot0.a) qVar.y(ot0.a.class);
            if (v5Var.w0() == null || qVar.A2 <= v5Var.w0().f158977d || aVar2 == null) {
                b17 = k01.i.b(v5Var.u0() != null ? v5Var.u0().f387175q : 0, 16);
            } else {
                boolean b18 = k01.i.b(aVar2.f429893p, 16);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[wantShowRelievedBuyFlag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(qVar.A2), java.lang.Integer.valueOf(v5Var.w0().f158977d));
                b17 = b18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[wantShowRelievedBuyFlag] use attrs:%b", java.lang.Boolean.valueOf(b17));
        }
        if (!b17) {
            return false;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.relievedbuy, 0) != 1) {
            return false;
        }
        ot0.a aVar3 = (ot0.a) qVar.y(ot0.a.class);
        return aVar3 != null ? aVar3.f429894q : false;
    }

    public static void h(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, ot0.q qVar, android.os.Bundle bundle) {
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f89004f = context;
        b(c6113xa3727625, qVar);
        a(c6113xa3727625, qVar);
        int i17 = bundle.getInt("chat_type", -1);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str)) {
            nxVar.f89002d = com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14505x521c8f47;
            nxVar.f89003e = qVar.f430222n2 + ":" + str;
        } else {
            nxVar.f89002d = z17 ? 1008 : 1007;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            if (z17) {
                str3 = ":" + str2;
            } else {
                str3 = "";
            }
            sb6.append(str3);
            sb6.append(":");
            sb6.append(qVar.f430222n2);
            sb6.append(":");
            sb6.append(i17);
            nxVar.f89003e = sb6.toString();
            int i18 = bundle.getInt("stat_scene", 0);
            if (i18 == 2 || i18 == 1) {
                k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(qVar.f430206j2);
                boolean g17 = g(qVar, Bi);
                boolean f17 = f(qVar, Bi);
                boolean e17 = e(qVar, Bi);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(nxVar.f89003e);
                sb7.append(":");
                sb7.append(g17 ? 1 : 0);
                if (z17) {
                    str4 = "";
                } else {
                    str4 = ":" + str2;
                }
                sb7.append(str4);
                sb7.append(":");
                sb7.append(f17 ? 1 : 0);
                sb7.append(":");
                sb7.append(e17 ? 1 : 0);
                nxVar.f89003e = sb7.toString();
            }
        }
        nxVar.f89022x = bundle;
        nxVar.f89015q = i17;
        nxVar.f89016r = bundle.getString("chatroom_username", "");
        nxVar.f89017s = bundle.getString("chat_username", "");
        nxVar.f89019u = bundle.getString("stat_msg_id", "");
        nxVar.f89021w = bundle.getInt("stat_geta8key_msg_scene", 0);
        nxVar.f89020v = bundle.getString("stat_geta8key_msg_username", "");
        d(qVar, c6113xa3727625);
        c6113xa3727625.e();
    }

    public static void i(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, ot0.q qVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        b(c6113xa3727625, qVar);
        a(c6113xa3727625, qVar);
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f89002d = i17;
        k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(qVar.f430206j2);
        boolean g17 = g(qVar, Bi);
        boolean f17 = f(qVar, Bi);
        boolean e17 = e(qVar, Bi);
        if (i17 == 1074) {
            nxVar.f89003e = java.lang.String.format("%s:%s:%s:%s:%s:%s", str, qVar.f430187f, qVar.f430202i2, java.lang.Integer.valueOf(g17 ? 1 : 0), java.lang.Integer.valueOf(f17 ? 1 : 0), java.lang.Integer.valueOf(e17 ? 1 : 0));
            nxVar.D = str3;
        } else if (i17 == 1157) {
            nxVar.f89003e = java.lang.String.format("%s:%s:%s:%s:%s:%s:%s", str, qVar.f430187f, str2 == null ? "" : str2, qVar.f430202i2, java.lang.Integer.valueOf(g17 ? 1 : 0), java.lang.Integer.valueOf(f17 ? 1 : 0), java.lang.Integer.valueOf(e17 ? 1 : 0));
            nxVar.D = str3;
        } else if (i17 == 1073) {
            nxVar.f89003e = (g17 ? 1 : 0) + ":" + (f17 ? 1 : 0) + ":" + (e17 ? 1 : 0);
        }
        nxVar.f89022x = bundle;
        nxVar.f89015q = bundle.getInt("chat_type", -1);
        nxVar.f89016r = bundle.getString("chatroom_username", "");
        nxVar.f89017s = bundle.getString("chat_username", "");
        nxVar.f89019u = bundle.getString("stat_msg_id", "");
        nxVar.f89021w = bundle.getInt("stat_geta8key_msg_scene", 0);
        nxVar.f89020v = bundle.getString("stat_geta8key_msg_username", "");
        d(qVar, c6113xa3727625);
        c6113xa3727625.e();
    }

    public static void j(java.lang.String str, java.lang.String str2, boolean z17, ot0.q qVar, android.os.Bundle bundle) {
        if (android.text.TextUtils.isEmpty(qVar.f430226o2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "visitFromPageWithShareTicketAppMessage shareKey isEmpty, transform to normal visit, talkerUsername[%s] msgUsername[%s] groupChat[%b]", str, str2, java.lang.Boolean.valueOf(z17));
            h(null, str, str2, z17, qVar, bundle);
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        b(c6113xa3727625, qVar);
        a(c6113xa3727625, qVar);
        int i17 = bundle.getInt("chat_type", -1);
        boolean p47 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str);
        am.nx nxVar = c6113xa3727625.f136390g;
        if (p47) {
            nxVar.f89002d = com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14505x521c8f47;
            nxVar.f89003e = qVar.f430222n2 + ":" + str;
        } else {
            nxVar.f89002d = 1044;
            nxVar.f89003e = qVar.f430222n2 + ":" + i17 + ":" + str;
            int i18 = bundle.getInt("stat_scene", 0);
            if (i18 == 2 || i18 == 1) {
                k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(qVar.f430206j2);
                nxVar.f89003e += ":" + (g(qVar, Bi) ? 1 : 0) + ":" + (f(qVar, Bi) ? 1 : 0) + ":" + (e(qVar, Bi) ? 1 : 0);
            }
        }
        nxVar.getClass();
        nxVar.getClass();
        com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9 c11105x57aff1b9 = nxVar.f89013o;
        c11105x57aff1b9.f151949e = qVar.f430226o2;
        c11105x57aff1b9.f151948d = str;
        nxVar.f89015q = i17;
        nxVar.f89016r = bundle.getString("chatroom_username", "");
        nxVar.f89017s = str;
        nxVar.f89019u = bundle.getString("stat_msg_id", "");
        nxVar.f89021w = bundle.getInt("stat_geta8key_msg_scene", 0);
        nxVar.f89020v = bundle.getString("stat_geta8key_msg_username", "");
        nxVar.f89022x = bundle;
        d(qVar, c6113xa3727625);
        c6113xa3727625.e();
    }
}
