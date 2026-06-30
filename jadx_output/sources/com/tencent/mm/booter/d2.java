package com.tencent.mm.booter;

/* loaded from: classes11.dex */
public abstract class d2 {
    public static void a() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.booter.c2 c2Var = new com.tencent.mm.booter.c2();
        if (context != null) {
            try {
                android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("crash_status_file", 4);
                java.lang.String[] split = sharedPreferences.getString("crashlist", "").split(";");
                if (split != null && split.length >= 1) {
                    android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("crashlist", "");
                    edit.commit();
                    for (int i17 = 0; i17 < split.length; i17++) {
                        java.lang.String str = split[i17];
                        java.lang.String[] split2 = str == null ? null : str.split(",");
                        if (split2 != null && split2.length >= 2) {
                            if (split2[1].equals(com.tencent.mm.app.MMBugReportContents.f53222c)) {
                                c2Var.a(10, 1);
                            } else {
                                c2Var.a(11, 1);
                                if (com.tencent.mm.sdk.platformtools.x2.f193072b.equals(split2[0])) {
                                    c2Var.a(14, 1);
                                }
                                if ((com.tencent.mm.sdk.platformtools.x2.f193072b + ":push").equals(split2[0])) {
                                    c2Var.a(17, 1);
                                }
                                if ((com.tencent.mm.sdk.platformtools.x2.f193072b + ":tools").equals(split2[0])) {
                                    c2Var.a(20, 1);
                                }
                                if (split2[1].equals("java")) {
                                    c2Var.a(12, 1);
                                    if (com.tencent.mm.sdk.platformtools.x2.f193072b.equals(split2[0])) {
                                        c2Var.a(15, 1);
                                    }
                                    if ((com.tencent.mm.sdk.platformtools.x2.f193072b + ":push").equals(split2[0])) {
                                        c2Var.a(18, 1);
                                    }
                                    if ((com.tencent.mm.sdk.platformtools.x2.f193072b + ":tools").equals(split2[0])) {
                                        c2Var.a(21, 1);
                                    }
                                }
                                if (split2[1].equals("jni")) {
                                    c2Var.a(13, 1);
                                    if (com.tencent.mm.sdk.platformtools.x2.f193072b.equals(split2[0])) {
                                        c2Var.a(16, 1);
                                    }
                                    if ((com.tencent.mm.sdk.platformtools.x2.f193072b + ":push").equals(split2[0])) {
                                        c2Var.a(19, 1);
                                    }
                                    if ((com.tencent.mm.sdk.platformtools.x2.f193072b + ":tools").equals(split2[0])) {
                                        c2Var.a(22, 1);
                                    }
                                }
                                if (split2[1].equals("first")) {
                                    if (com.tencent.mm.sdk.platformtools.x2.f193072b.equals(split2[0])) {
                                        c2Var.a(23, 1);
                                    }
                                    if ((com.tencent.mm.sdk.platformtools.x2.f193072b + ":push").equals(split2[0])) {
                                        c2Var.a(24, 1);
                                    }
                                    if ((com.tencent.mm.sdk.platformtools.x2.f193072b + ":tools").equals(split2[0])) {
                                        c2Var.a(25, 1);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("AndroidGooglePlayCrashUploadSizeLimit", 8192);
        if (context2 != null && b17 > 0) {
            try {
                android.content.SharedPreferences sharedPreferences2 = context2.getSharedPreferences("crash_status_file", 4);
                if (sharedPreferences2.getInt("googleplaysizelimit", 8192) != b17) {
                    android.content.SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                    edit2.putInt("googleplaysizelimit", b17);
                    edit2.commit();
                }
            } catch (java.lang.Throwable unused2) {
            }
        }
        com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_REPORT_LAST_TIME_REPORT_DYNACFG_VER_LONG;
        if (java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) p17.m(u3Var, null), 0L) > 21600000) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(279L, ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("AndroidDynamicConfigVer", 0) % 16, 1L, false);
            c01.d9.b().p().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        com.tencent.mm.storage.n3 p18 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_REPORT_LAST_TIME_REPORT_VIDEO_SEND_RECV_COUNT_LONG;
        if (java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) p18.m(u3Var2, null), 0L) > 21600000) {
            c01.d9.b().p().x(u3Var2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.w2 Ui = t21.o2.Ui();
            Ui.getClass();
            int[] iArr = {0, 0, 0, 0, 0, 0};
            try {
                java.lang.String str2 = "select status, videofuncflag, human from videoinfo2 where lastmodifytime > " + (com.tencent.mm.sdk.platformtools.t8.i1() - 21600);
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoInfoStorage", "reportVideoMsgCount sql:%s", str2);
                android.database.Cursor f17 = Ui.f415057a.f(str2, null, 2);
                while (true) {
                    if (!f17.moveToNext()) {
                        break;
                    }
                    int i18 = f17.getInt(0);
                    int i19 = f17.getInt(1);
                    java.lang.String string = f17.getString(2);
                    if (111 == i18) {
                        char c17 = i19 == 3 ? (char) 0 : (char) 3;
                        iArr[c17] = iArr[c17] + 1;
                    } else if (199 == i18) {
                        if (c01.z1.r().equals(string)) {
                            char c18 = i19 == 3 ? (char) 1 : (char) 4;
                            iArr[c18] = iArr[c18] + 1;
                        } else {
                            char c19 = i19 == 3 ? (char) 2 : (char) 5;
                            iArr[c19] = iArr[c19] + 1;
                        }
                    }
                }
                f17.close();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12696, 10010, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(iArr[2]), java.lang.Integer.valueOf(iArr[3]), java.lang.Integer.valueOf(iArr[4]), java.lang.Integer.valueOf(iArr[5]));
            } catch (java.lang.Exception unused3) {
            }
        }
        if (java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) gm0.j1.u().c().l(81939, null), 0L) > 86400000) {
            new f21.c0();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.storage.n3 p19 = c01.d9.b().p();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        boolean booleanValue = ((java.lang.Boolean) p19.l(233475, bool)).booleanValue();
        com.tencent.mm.storage.k4 k4Var = (com.tencent.mm.storage.k4) c01.d9.b().q();
        android.database.Cursor f18 = k4Var.f195071d.f("select count(rowid) from rcontact " + k4Var.I("@biz.contact", null, null), null, 2);
        int i27 = f18.moveToFirst() ? f18.getInt(0) : 0;
        f18.close();
        if (i27 <= 0) {
            if (!booleanValue) {
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).k("officialaccounts");
                c01.d9.b().p().w(233475, java.lang.Boolean.TRUE);
            }
        } else if (booleanValue) {
            c01.d9.b().p().w(233475, bool);
        }
        iy4.e1 e1Var = (iy4.e1) i95.n0.c(iy4.e1.class);
        e1Var.getClass();
        gm0.j1.b().c();
        if (e1Var.f295958d == null) {
            e1Var.f295958d = new iy4.r0();
        }
        e1Var.f295958d.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.PostTaskLightweightJob", "use time %d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
