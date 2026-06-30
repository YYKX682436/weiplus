package gn1;

/* loaded from: classes11.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    public static boolean c() {
        java.lang.String d17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.google.android.projection.gearhead");
        boolean equals = "eeb557fc154afc0d8eec621bdc7ea950".equals(d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.auto.AutoLogic", "isInstallAutoApp result:%b md5:%s", java.lang.Boolean.valueOf(equals), d17);
        return equals;
    }

    public static boolean f() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_auto, 1) == 1;
    }

    public static boolean h() {
        boolean z17;
        boolean z18 = ((android.app.UiModeManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("uimode")).getCurrentModeType() == 3;
        if (z18) {
            java.util.Iterator<android.hardware.usb.UsbDevice> it = ((android.hardware.usb.UsbManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("usb")).getDeviceList().values().iterator();
            while (it.hasNext()) {
                if (it.next().getInterface(0).getInterfaceClass() == 1) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.auto.AutoLogic", "isOpenCarMode carMode:%b isAoapMode:%b", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        return z18 && z17;
    }

    public final z2.r0 b(final java.lang.String str, java.lang.String str2) {
        java.util.List list;
        java.lang.String str3;
        java.lang.String string;
        java.lang.String trim;
        if (!f()) {
            return null;
        }
        if (!h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.auto.AutoLogic", "not open car mode");
            return null;
        }
        if (!c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.auto.AutoLogic", "not install auto app");
            return null;
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(1496L, 0L, 1L, false);
        android.content.Intent putExtra = new android.content.Intent().addFlags(32).setAction("com.tencent.mm.permission.MM_AUTO_HEARD_MESSAGE").putExtra("key_username", str);
        if (fp.h.c(26)) {
            putExtra.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        }
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str.hashCode(), putExtra, fp.g0.b(134217728));
        android.content.Intent putExtra2 = new android.content.Intent().addFlags(32).setAction("com.tencent.mm.permission.MM_AUTO_REPLY_MESSAGE").putExtra("key_username", str);
        if (fp.h.c(26)) {
            putExtra2.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        }
        android.app.PendingIntent broadcast2 = android.app.PendingIntent.getBroadcast(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str.hashCode(), putExtra2, fp.g0.b(134217728));
        z2.v1 v1Var = new z2.v1("key_voice_reply_text", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572074y0), null, true, 0, new android.os.Bundle(), new java.util.HashSet());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final int d17 = c01.h2.d(str, null);
        if (d17 > 10) {
            d17 = 10;
        }
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u();
        int i17 = 0;
        iz5.a.g(null, g9Var.f275514g != null);
        final java.lang.String X8 = g9Var.X8(str);
        if (g9Var.Da(X8)) {
            list = ot0.c3.l().e("getLastReachMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$d1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return new java.util.ArrayList(ot0.z2.f430355a.B0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, d17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$o1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var2.getClass();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    android.database.Cursor f17 = g9Var2.f275522r.f("SELECT * FROM " + X8 + " WHERE" + g9Var2.Z8(str) + "AND status = 3 AND type <> 10000 ORDER BY createTime DESC LIMIT " + d17, null, 2);
                    while (f17.moveToNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var.mo9015xbf5d97fd(f17);
                        arrayList2.add(f9Var);
                    }
                    f17.close();
                    return new java.util.ArrayList(arrayList2);
                }
            });
        } else {
            boolean Pb = g9Var.Pb(X8);
            l75.k0 k0Var = g9Var.f275522r;
            if (Pb) {
                list = ot0.z2.f430355a.B0(k0Var, X8, str, d17);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                android.database.Cursor f17 = k0Var.f("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND status = 3 AND type <> 10000 ORDER BY createTime DESC LIMIT " + d17, null, 2);
                while (f17.moveToNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var.mo9015xbf5d97fd(f17);
                    arrayList2.add(f9Var);
                }
                f17.close();
                list = arrayList2;
            }
        }
        int size = list.size() - 1;
        long j17 = 0;
        while (size >= 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(size);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var2.Q0())) {
                java.lang.String Q0 = f9Var2.Q0();
                int t17 = c01.w9.t(f9Var2.j());
                if (t17 != -1 && (trim = f9Var2.j().substring(i17, t17).trim()) != null && trim.length() > 0) {
                    Q0 = trim;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(Q0, true);
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                str3 = c01.a2.c(n17, Q0);
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0) && (n17.d1().equals(str3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3))) {
                    str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5v);
                }
            } else {
                str3 = null;
            }
            if (f9Var2.J2()) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572050xd);
            } else if (f9Var2.b3()) {
                if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var2.Q0()) || f9Var2.A0() == 1) {
                    string = f9Var2.j();
                } else {
                    int t18 = c01.w9.t(f9Var2.j());
                    string = t18 != -1 ? f9Var2.j().substring(t18 + 1).trim() : f9Var2.j();
                }
            } else if (f9Var2.g3()) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572133zm);
            } else if (f9Var2.m78014x7b98c171() || f9Var2.Y2()) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572129zi);
            } else if (f9Var2.k2()) {
                ot0.q v17 = ot0.q.v(f9Var2.j());
                if (v17 != null) {
                    int i18 = v17.f430199i;
                    if (i18 != 2) {
                        if (i18 == 3) {
                            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572027wn);
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            java.lang.String str4 = v17.f430187f;
                            objArr[0] = str4 != null ? str4 : "";
                            string = java.lang.String.format(string2, objArr);
                        } else if (i18 == 4) {
                            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572129zi);
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            java.lang.String str5 = v17.f430187f;
                            objArr2[0] = str5 != null ? str5 : "";
                            string = java.lang.String.format(string3, objArr2);
                        } else if (i18 != 5) {
                            if (i18 != 6) {
                                if (i18 == 8) {
                                    java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571915tf);
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    java.lang.String str6 = v17.f430187f;
                                    objArr3[0] = str6 != null ? str6 : "";
                                    string = java.lang.String.format(string4, objArr3);
                                } else if (i18 == 10 || i18 == 13) {
                                    java.lang.String string5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572056xj);
                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                    java.lang.String str7 = v17.f430187f;
                                    objArr4[0] = str7 != null ? str7 : "";
                                    string = java.lang.String.format(string5, objArr4);
                                } else if (i18 == 19) {
                                    java.lang.String string6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572068xv);
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    java.lang.String str8 = v17.f430187f;
                                    objArr5[0] = str8 != null ? str8 : "";
                                    string = java.lang.String.format(string6, objArr5);
                                } else if (i18 == 24) {
                                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572756ce4);
                                } else if (i18 != 130) {
                                    if (i18 == 15) {
                                        java.lang.String string7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571917th);
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        java.lang.String str9 = v17.f430187f;
                                        objArr6[0] = str9 != null ? str9 : "";
                                        string = java.lang.String.format(string7, objArr6);
                                    } else if (i18 == 16) {
                                        java.lang.String string8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571978v9);
                                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                                        java.lang.String str10 = v17.f430187f;
                                        objArr7[0] = str10 != null ? str10 : "";
                                        string = java.lang.String.format(string8, objArr7);
                                    }
                                }
                            }
                            java.lang.String string9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571963uv);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            java.lang.String n18 = v17.n();
                            objArr8[0] = n18 != null ? n18 : "";
                            string = java.lang.String.format(string9, objArr8);
                        } else {
                            java.lang.String string10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572122za);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            java.lang.String str11 = v17.f430187f;
                            objArr9[0] = str11 != null ? str11 : "";
                            string = java.lang.String.format(string10, objArr9);
                        }
                    } else {
                        string = java.lang.String.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572050xd), new java.lang.Object[0]);
                    }
                }
                string = null;
            } else if (f9Var2.C2()) {
                java.lang.String string11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571915tf);
                s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
                if (wi6 != null) {
                    y12.h hVar = (y12.h) wi6;
                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 M = hVar.M(f9Var2);
                    if (M == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.v(M.mo42933xb5885648()))) {
                        string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571915tf);
                    } else {
                        string = "[" + hVar.v(M.mo42933xb5885648()) + "]";
                    }
                } else {
                    string = string11;
                }
            } else if (f9Var2.L2()) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572003vz);
            } else if (f9Var2.k3() || f9Var2.l3()) {
                java.lang.String j18 = f9Var2.j();
                int i19 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
                if (!j18.equals("voip_content_voice")) {
                    java.lang.String j19 = f9Var2.j();
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
                    am.y00 y00Var = c6231x4f3054ba.f136478g;
                    y00Var.f89948b = 1;
                    y00Var.f89947a = j19;
                    c6231x4f3054ba.e();
                    if (!(c6231x4f3054ba.f136479h.f90033a == 3)) {
                        string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572135zo);
                    }
                }
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572133zm);
            } else if (f9Var2.E2()) {
                string = java.lang.String.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571978v9), ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3(f9Var2.j()).c());
            } else {
                if (f9Var2.mo78013xfb85f7b0() == -1879048186) {
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n_k);
                }
                string = null;
            }
            if (string == null) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572015wb);
            }
            if (str3 != null) {
                string = java.lang.String.format("%s: %s", str3, string);
            }
            if (string != null) {
                arrayList.add(string);
            }
            if (size == 0) {
                j17 = f9Var2.mo78012x3fdd41df();
            }
            size--;
            i17 = 0;
        }
        z2.n0 n0Var = new z2.n0();
        n0Var.f551031a = new z2.m0((java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]), v1Var, broadcast2, broadcast, new java.lang.String[]{str2}, j17);
        return n0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5176x821faac4 c5176x821faac4 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5176x821faac4) abstractC20979x809547d1;
        if (c5176x821faac4 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5176x821faac4) {
            try {
                am.h0 h0Var = c5176x821faac4.f135524g;
                h0Var.f88337c = b(h0Var.f88335a, h0Var.f88336b);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.auto.AutoLogic", th6, "", new java.lang.Object[0]);
            }
        }
        return false;
    }
}
