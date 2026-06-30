package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes9.dex */
public abstract class b4 {
    public static void a(o72.r2 r2Var, int i17, java.lang.String str) {
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.h0(1);
        gp0Var.m0(str);
        r2Var.f67640x5ab01132.f452497f.add(i17, gp0Var);
    }

    public static void b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, long j17, o72.u2 u2Var) {
        c(abstractActivityC21394xb3d2c0cf, j17, u2Var, 0L);
    }

    public static void c(final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, long j17, o72.u2 u2Var, java.lang.Long l17) {
        boolean z17;
        java.util.LinkedList linkedList;
        try {
            o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
            r45.bq0 bq0Var = F.f67640x5ab01132;
            if (bq0Var != null && (linkedList = bq0Var.f452497f) != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    long j18 = ((r45.gp0) it.next()).R;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).getClass();
                    if (j18 > ip.c.g()) {
                        z17 = false;
                        break;
                    }
                }
            }
            z17 = true;
            if (!z17) {
                db5.e1.t(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccp, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).vj())), "", new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c4());
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15378, java.lang.Integer.valueOf(F.f67643xc8a07680), java.lang.Integer.valueOf(F.f67657x2262335f));
            if (((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi()) {
                java.lang.String b17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.k.f299227b.b(o72.r2.G0(F));
                o72.r2 r2Var = new o72.r2();
                r2Var.U0(b17);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                r2Var.f67645x88be67a1 = currentTimeMillis;
                r2Var.f67659xa783a79b = currentTimeMillis;
                r2Var.f67638x7d4eb57c = currentTimeMillis;
                r2Var.f67660x4b6e9352 = b17;
                F = r2Var;
            } else {
                d(abstractActivityC21394xb3d2c0cf, F);
            }
            r45.dq0 dq0Var = new r45.dq0();
            if (u2Var != null) {
                dq0Var.f454186d = u2Var.f425009a;
                dq0Var.f454187e = u2Var.f425026r;
                dq0Var.f454188f = u2Var.f425010b;
                dq0Var.f454190h = u2Var.f425029u;
                dq0Var.f454189g = u2Var.f425027s;
                dq0Var.f454191i = u2Var.f425030v;
            }
            e(abstractActivityC21394xb3d2c0cf, F, true, dq0Var);
            if (l17.longValue() <= 0) {
                abstractActivityC21394xb3d2c0cf.finish();
                return;
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            java.util.Objects.requireNonNull(abstractActivityC21394xb3d2c0cf);
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.b4$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.this.finish();
                }
            };
            long longValue = l17.longValue();
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, longValue, false);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("fav.FavNoteConvertLogic", "convertAndGoNote error: %s", th6.getMessage());
            dp.a.m125854x26a183b(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccn), 0).show();
        }
    }

    public static void d(android.content.Context context, o72.r2 r2Var) {
        r45.hp0 hp0Var;
        java.lang.String str;
        java.lang.String str2;
        r2Var.f67641x225ba391 = 0;
        r2Var.f67659xa783a79b = java.lang.System.currentTimeMillis();
        r2Var.f67645x88be67a1 = -1L;
        r2Var.f67651x76e81a5a = 6;
        r45.jq0 jq0Var = r2Var.f67640x5ab01132.f452495d;
        if (jq0Var != null) {
            jq0Var.i("");
            r2Var.f67640x5ab01132.f452495d.g(6);
            r2Var.f67640x5ab01132.f452495d.e(c01.z1.r());
        }
        r2Var.f67642xd3939c3a = c01.z1.r();
        r45.bq0 bq0Var = r2Var.f67640x5ab01132;
        if (bq0Var != null) {
            bq0Var.p("");
        }
        if (r2Var.f67657x2262335f == 1) {
            r2Var.f67640x5ab01132.d(new java.util.LinkedList());
            a(r2Var, 0, g(r2Var.f67640x5ab01132.f452507s));
        } else if (r2Var.f67640x5ab01132.f452497f != null) {
            int i17 = 0;
            int i18 = 1;
            while (i17 < r2Var.f67640x5ab01132.f452497f.size()) {
                r45.gp0 gp0Var = (r45.gp0) r2Var.f67640x5ab01132.f452497f.get(i17);
                if (r2Var.f67657x2262335f != 18 || !gp0Var.P1.equals("WeNoteHtmlFile")) {
                    java.lang.String x17 = o72.x1.x(gp0Var);
                    java.lang.String X = o72.x1.X(gp0Var);
                    gp0Var.e0(o72.d2.d(gp0Var.toString(), 18));
                    java.lang.String x18 = o72.x1.x(gp0Var);
                    java.lang.String X2 = o72.x1.X(gp0Var);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x18) || !com.p314xaae8f345.mm.vfs.w6.j(x17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("fav.FavNoteConvertLogic", "dealItemForNote: htmlId %s, skip copy file from %s to %s", gp0Var.P1, x17, x18);
                    } else {
                        com.p314xaae8f345.mm.vfs.w6.c(x17, x18);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("fav.FavNoteConvertLogic", "dealItemForNote: htmlId %s, copy file from %s to %s", gp0Var.P1, x17, x18);
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X2) || !com.p314xaae8f345.mm.vfs.w6.j(X)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("fav.FavNoteConvertLogic", "dealItemForNote: htmlId %s, skip copy thumb file from %s to %s", gp0Var.P1, X, X2);
                    } else {
                        com.p314xaae8f345.mm.vfs.w6.c(X, X2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("fav.FavNoteConvertLogic", "dealItemForNote: htmlId %s, copy thumb file from %s to %s", gp0Var.P1, X, X2);
                    }
                }
                int i19 = r2Var.f67657x2262335f;
                if (i19 != 18) {
                    if (gp0Var.I != 1) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WeNote_");
                        int i27 = i18 + 1;
                        sb6.append(i18);
                        gp0Var.t0(sb6.toString());
                        if (r2Var.f67657x2262335f == 14 && gp0Var.K1 != null) {
                            a(r2Var, i17, g(gp0Var.K1 + ":"));
                            i17++;
                        }
                        int i28 = gp0Var.I;
                        if (!(i28 == 1 || i28 == 2 || i28 == 3 || i28 == 6 || i28 == 8 || i28 == 10130 || i28 == 4 || i28 == 0 || i28 == 22)) {
                            f(context, r2Var, i17, gp0Var);
                        } else if (i28 == 4 && (hp0Var = gp0Var.J1) != null && hp0Var.f457903x != null) {
                            f(context, r2Var, i17, gp0Var);
                        }
                        if (gp0Var.I == 3) {
                            gp0Var.h0(20);
                        }
                        i18 = i27;
                    } else if (i19 == 14) {
                        if (gp0Var.f456941f == null) {
                            str = "\n";
                        } else {
                            str = gp0Var.f456941f + "\n";
                        }
                        if (gp0Var.K1 == null) {
                            str2 = "";
                        } else {
                            str2 = gp0Var.K1 + ":\n";
                        }
                        gp0Var.m0(g(str2 + str + "\n"));
                    } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456941f)) {
                        gp0Var.m0(g(gp0Var.f456941f));
                    }
                } else if (gp0Var.I == 20) {
                    gp0Var.b0("");
                    gp0Var.a0("");
                }
                i17++;
            }
        }
        r2Var.f67645x88be67a1 = java.lang.System.currentTimeMillis();
        r2Var.f67657x2262335f = 18;
        r2Var.f67660x4b6e9352 = o72.r2.G0(r2Var);
    }

    public static void e(android.content.Context context, o72.r2 r2Var, boolean z17, r45.dq0 dq0Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625 c5773x64e6b625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625();
        am.zl zlVar = c5773x64e6b625.f136087g;
        zlVar.f56x88be67a1 = r2Var.f67645x88be67a1;
        zlVar.f90121k = 5;
        zlVar.f90112b = r2Var.f67660x4b6e9352;
        zlVar.f90114d = context;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.sp0 sp0Var = r2Var.f67640x5ab01132.G;
        if (sp0Var != null) {
            bundle.putString("noteauthor", sp0Var.f467424d);
            bundle.putString("noteeditor", sp0Var.f467425e);
        }
        bundle.putLong("edittime", r2Var.f67659xa783a79b);
        am.zl zlVar2 = c5773x64e6b625.f136087g;
        zlVar2.f90118h = bundle;
        zlVar2.f55x5ab01132 = r2Var.f67640x5ab01132;
        zlVar2.f90111a = 2;
        zlVar2.f90122l = z17;
        zlVar2.f90123m = dq0Var;
        c5773x64e6b625.e();
    }

    public static void f(android.content.Context context, o72.r2 r2Var, int i17, r45.gp0 gp0Var) {
        java.lang.String string;
        r45.ip0 ip0Var;
        java.lang.String str;
        java.lang.String string2;
        r45.km6 km6Var;
        r2Var.f67640x5ab01132.f452497f.remove(i17);
        int i18 = gp0Var.I;
        if (i18 != 4) {
            string = "";
            if (i18 != 5) {
                if (i18 != 7) {
                    if (i18 != 22) {
                        if (i18 != 29) {
                            if (i18 == 16) {
                                java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571978v9);
                                try {
                                    gm0.j1.i();
                                    com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D3(gp0Var.f456941f);
                                    int i19 = D3.f277907q;
                                    java.util.Set set = c01.e2.f118650a;
                                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(i19)) {
                                        int i27 = D3.f277910t;
                                        if (i27 == 0) {
                                            string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.v_);
                                        } else if (i27 == 1) {
                                            string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mxk);
                                        }
                                        string3 = string2;
                                    }
                                    str = string3 + " " + D3.f277892b;
                                    string = str;
                                } catch (java.lang.Exception unused) {
                                    string = string3;
                                }
                            } else if (i18 == 17) {
                                string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572068xv);
                            } else if (i18 == 19) {
                                str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571543id);
                                try {
                                    str = str + " " + gp0Var.J1.f457901v.f454173m;
                                } catch (java.lang.Exception unused2) {
                                }
                                string = str;
                            } else if (i18 == 20) {
                                java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572133zm);
                                cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
                                long j17 = gp0Var.f456981y;
                                ((bv.p0) h1Var).getClass();
                                string = java.lang.String.format("%s %s\"\n", string4, java.lang.Integer.valueOf((int) w21.x0.m(j17)));
                            } else if (i18 != 32) {
                                if (i18 != 33) {
                                    string = gp0Var.f456941f;
                                } else {
                                    r45.hp0 hp0Var = gp0Var.J1;
                                    if (hp0Var != null && (km6Var = hp0Var.G) != null) {
                                        string = il4.d.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, km6Var);
                                    }
                                    string = gp0Var.f456937d + " " + string;
                                }
                            }
                        }
                    } else if (!o72.x1.j0()) {
                        string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571965ux);
                    }
                }
                str = gp0Var.f456941f;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456937d)) {
                    str = gp0Var.f456937d + " " + str;
                }
                string = str;
            } else {
                r45.hp0 hp0Var2 = gp0Var.J1;
                if (hp0Var2 != null && (ip0Var = hp0Var2.f457886d) != null) {
                    string = ip0Var.f458780y;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    string = gp0Var.A;
                }
            }
        } else {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572129zi);
        }
        java.lang.String str2 = "\n\n";
        if (string != null) {
            str2 = "\n" + string + "\n\n";
        }
        a(r2Var, i17, g(str2));
    }

    public static java.lang.String g(java.lang.String str) {
        return str.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll(" ", "&nbsp;");
    }
}
