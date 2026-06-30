package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes9.dex */
public abstract class b4 {
    public static void a(o72.r2 r2Var, int i17, java.lang.String str) {
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.h0(1);
        gp0Var.m0(str);
        r2Var.field_favProto.f370964f.add(i17, gp0Var);
    }

    public static void b(com.tencent.mm.ui.MMActivity mMActivity, long j17, o72.u2 u2Var) {
        c(mMActivity, j17, u2Var, 0L);
    }

    public static void c(final com.tencent.mm.ui.MMActivity mMActivity, long j17, o72.u2 u2Var, java.lang.Long l17) {
        boolean z17;
        java.util.LinkedList linkedList;
        try {
            o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
            r45.bq0 bq0Var = F.field_favProto;
            if (bq0Var != null && (linkedList = bq0Var.f370964f) != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    long j18 = ((r45.gp0) it.next()).R;
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).getClass();
                    if (j18 > ip.c.g()) {
                        z17 = false;
                        break;
                    }
                }
            }
            z17 = true;
            if (!z17) {
                db5.e1.t(mMActivity, mMActivity.getString(com.tencent.mm.R.string.ccp, java.lang.Integer.valueOf(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).vj())), "", new com.tencent.mm.plugin.fav.ui.c4());
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15378, java.lang.Integer.valueOf(F.field_id), java.lang.Integer.valueOf(F.field_type));
            if (((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi()) {
                java.lang.String b17 = com.tencent.wechat.aff.wenote.k.f217694b.b(o72.r2.G0(F));
                o72.r2 r2Var = new o72.r2();
                r2Var.U0(b17);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                r2Var.field_localId = currentTimeMillis;
                r2Var.field_updateTime = currentTimeMillis;
                r2Var.field_edittime = currentTimeMillis;
                r2Var.field_xml = b17;
                F = r2Var;
            } else {
                d(mMActivity, F);
            }
            r45.dq0 dq0Var = new r45.dq0();
            if (u2Var != null) {
                dq0Var.f372653d = u2Var.f343476a;
                dq0Var.f372654e = u2Var.f343493r;
                dq0Var.f372655f = u2Var.f343477b;
                dq0Var.f372657h = u2Var.f343496u;
                dq0Var.f372656g = u2Var.f343494s;
                dq0Var.f372658i = u2Var.f343497v;
            }
            e(mMActivity, F, true, dq0Var);
            if (l17.longValue() <= 0) {
                mMActivity.finish();
                return;
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.util.Objects.requireNonNull(mMActivity);
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.b4$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.ui.MMActivity.this.finish();
                }
            };
            long longValue = l17.longValue();
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, longValue, false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("fav.FavNoteConvertLogic", "convertAndGoNote error: %s", th6.getMessage());
            dp.a.makeText(mMActivity, mMActivity.getString(com.tencent.mm.R.string.ccn), 0).show();
        }
    }

    public static void d(android.content.Context context, o72.r2 r2Var) {
        r45.hp0 hp0Var;
        java.lang.String str;
        java.lang.String str2;
        r2Var.field_flag = 0;
        r2Var.field_updateTime = java.lang.System.currentTimeMillis();
        r2Var.field_localId = -1L;
        r2Var.field_sourceType = 6;
        r45.jq0 jq0Var = r2Var.field_favProto.f370962d;
        if (jq0Var != null) {
            jq0Var.i("");
            r2Var.field_favProto.f370962d.g(6);
            r2Var.field_favProto.f370962d.e(c01.z1.r());
        }
        r2Var.field_fromUser = c01.z1.r();
        r45.bq0 bq0Var = r2Var.field_favProto;
        if (bq0Var != null) {
            bq0Var.p("");
        }
        if (r2Var.field_type == 1) {
            r2Var.field_favProto.d(new java.util.LinkedList());
            a(r2Var, 0, g(r2Var.field_favProto.f370974s));
        } else if (r2Var.field_favProto.f370964f != null) {
            int i17 = 0;
            int i18 = 1;
            while (i17 < r2Var.field_favProto.f370964f.size()) {
                r45.gp0 gp0Var = (r45.gp0) r2Var.field_favProto.f370964f.get(i17);
                if (r2Var.field_type != 18 || !gp0Var.P1.equals("WeNoteHtmlFile")) {
                    java.lang.String x17 = o72.x1.x(gp0Var);
                    java.lang.String X = o72.x1.X(gp0Var);
                    gp0Var.e0(o72.d2.d(gp0Var.toString(), 18));
                    java.lang.String x18 = o72.x1.x(gp0Var);
                    java.lang.String X2 = o72.x1.X(gp0Var);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(x17) || com.tencent.mm.sdk.platformtools.t8.K0(x18) || !com.tencent.mm.vfs.w6.j(x17)) {
                        com.tencent.mars.xlog.Log.w("fav.FavNoteConvertLogic", "dealItemForNote: htmlId %s, skip copy file from %s to %s", gp0Var.P1, x17, x18);
                    } else {
                        com.tencent.mm.vfs.w6.c(x17, x18);
                        com.tencent.mars.xlog.Log.i("fav.FavNoteConvertLogic", "dealItemForNote: htmlId %s, copy file from %s to %s", gp0Var.P1, x17, x18);
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(X) || com.tencent.mm.sdk.platformtools.t8.K0(X2) || !com.tencent.mm.vfs.w6.j(X)) {
                        com.tencent.mars.xlog.Log.w("fav.FavNoteConvertLogic", "dealItemForNote: htmlId %s, skip copy thumb file from %s to %s", gp0Var.P1, X, X2);
                    } else {
                        com.tencent.mm.vfs.w6.c(X, X2);
                        com.tencent.mars.xlog.Log.i("fav.FavNoteConvertLogic", "dealItemForNote: htmlId %s, copy thumb file from %s to %s", gp0Var.P1, X, X2);
                    }
                }
                int i19 = r2Var.field_type;
                if (i19 != 18) {
                    if (gp0Var.I != 1) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WeNote_");
                        int i27 = i18 + 1;
                        sb6.append(i18);
                        gp0Var.t0(sb6.toString());
                        if (r2Var.field_type == 14 && gp0Var.K1 != null) {
                            a(r2Var, i17, g(gp0Var.K1 + ":"));
                            i17++;
                        }
                        int i28 = gp0Var.I;
                        if (!(i28 == 1 || i28 == 2 || i28 == 3 || i28 == 6 || i28 == 8 || i28 == 10130 || i28 == 4 || i28 == 0 || i28 == 22)) {
                            f(context, r2Var, i17, gp0Var);
                        } else if (i28 == 4 && (hp0Var = gp0Var.J1) != null && hp0Var.f376370x != null) {
                            f(context, r2Var, i17, gp0Var);
                        }
                        if (gp0Var.I == 3) {
                            gp0Var.h0(20);
                        }
                        i18 = i27;
                    } else if (i19 == 14) {
                        if (gp0Var.f375408f == null) {
                            str = "\n";
                        } else {
                            str = gp0Var.f375408f + "\n";
                        }
                        if (gp0Var.K1 == null) {
                            str2 = "";
                        } else {
                            str2 = gp0Var.K1 + ":\n";
                        }
                        gp0Var.m0(g(str2 + str + "\n"));
                    } else if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375408f)) {
                        gp0Var.m0(g(gp0Var.f375408f));
                    }
                } else if (gp0Var.I == 20) {
                    gp0Var.b0("");
                    gp0Var.a0("");
                }
                i17++;
            }
        }
        r2Var.field_localId = java.lang.System.currentTimeMillis();
        r2Var.field_type = 18;
        r2Var.field_xml = o72.r2.G0(r2Var);
    }

    public static void e(android.content.Context context, o72.r2 r2Var, boolean z17, r45.dq0 dq0Var) {
        com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent();
        am.zl zlVar = notifyWNNoteOperationEvent.f54554g;
        zlVar.field_localId = r2Var.field_localId;
        zlVar.f8588k = 5;
        zlVar.f8579b = r2Var.field_xml;
        zlVar.f8581d = context;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.sp0 sp0Var = r2Var.field_favProto.G;
        if (sp0Var != null) {
            bundle.putString("noteauthor", sp0Var.f385891d);
            bundle.putString("noteeditor", sp0Var.f385892e);
        }
        bundle.putLong("edittime", r2Var.field_updateTime);
        am.zl zlVar2 = notifyWNNoteOperationEvent.f54554g;
        zlVar2.f8585h = bundle;
        zlVar2.field_favProto = r2Var.field_favProto;
        zlVar2.f8578a = 2;
        zlVar2.f8589l = z17;
        zlVar2.f8590m = dq0Var;
        notifyWNNoteOperationEvent.e();
    }

    public static void f(android.content.Context context, o72.r2 r2Var, int i17, r45.gp0 gp0Var) {
        java.lang.String string;
        r45.ip0 ip0Var;
        java.lang.String str;
        java.lang.String string2;
        r45.km6 km6Var;
        r2Var.field_favProto.f370964f.remove(i17);
        int i18 = gp0Var.I;
        if (i18 != 4) {
            string = "";
            if (i18 != 5) {
                if (i18 != 7) {
                    if (i18 != 22) {
                        if (i18 != 29) {
                            if (i18 == 16) {
                                java.lang.String string3 = context.getString(com.tencent.mm.R.string.f490445v9);
                                try {
                                    gm0.j1.i();
                                    com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D3(gp0Var.f375408f);
                                    int i19 = D3.f196374q;
                                    java.util.Set set = c01.e2.f37117a;
                                    if (com.tencent.mm.storage.z3.D3(i19)) {
                                        int i27 = D3.f196377t;
                                        if (i27 == 0) {
                                            string2 = context.getString(com.tencent.mm.R.string.v_);
                                        } else if (i27 == 1) {
                                            string2 = context.getString(com.tencent.mm.R.string.mxk);
                                        }
                                        string3 = string2;
                                    }
                                    str = string3 + " " + D3.f196359b;
                                    string = str;
                                } catch (java.lang.Exception unused) {
                                    string = string3;
                                }
                            } else if (i18 == 17) {
                                string = context.getString(com.tencent.mm.R.string.f490535xv);
                            } else if (i18 == 19) {
                                str = context.getString(com.tencent.mm.R.string.f490010id);
                                try {
                                    str = str + " " + gp0Var.J1.f376368v.f372640m;
                                } catch (java.lang.Exception unused2) {
                                }
                                string = str;
                            } else if (i18 == 20) {
                                java.lang.String string4 = context.getString(com.tencent.mm.R.string.f490600zm);
                                cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
                                long j17 = gp0Var.f375448y;
                                ((bv.p0) h1Var).getClass();
                                string = java.lang.String.format("%s %s\"\n", string4, java.lang.Integer.valueOf((int) w21.x0.m(j17)));
                            } else if (i18 != 32) {
                                if (i18 != 33) {
                                    string = gp0Var.f375408f;
                                } else {
                                    r45.hp0 hp0Var = gp0Var.J1;
                                    if (hp0Var != null && (km6Var = hp0Var.G) != null) {
                                        string = il4.d.n(com.tencent.mm.sdk.platformtools.x2.f193071a, km6Var);
                                    }
                                    string = gp0Var.f375404d + " " + string;
                                }
                            }
                        }
                    } else if (!o72.x1.j0()) {
                        string = context.getString(com.tencent.mm.R.string.f490432ux);
                    }
                }
                str = gp0Var.f375408f;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375404d)) {
                    str = gp0Var.f375404d + " " + str;
                }
                string = str;
            } else {
                r45.hp0 hp0Var2 = gp0Var.J1;
                if (hp0Var2 != null && (ip0Var = hp0Var2.f376353d) != null) {
                    string = ip0Var.f377247y;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    string = gp0Var.A;
                }
            }
        } else {
            string = context.getString(com.tencent.mm.R.string.f490596zi);
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
