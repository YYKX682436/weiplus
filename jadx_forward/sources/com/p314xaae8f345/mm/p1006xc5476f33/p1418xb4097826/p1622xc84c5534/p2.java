package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes10.dex */
public final class p2 {

    /* renamed from: b */
    public static com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 f206771b;

    /* renamed from: a */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 f206770a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2();

    /* renamed from: c */
    public static final java.util.concurrent.ConcurrentHashMap f206772c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d */
    public static final java.util.concurrent.ConcurrentHashMap f206773d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e */
    public static final java.util.concurrent.ConcurrentHashMap f206774e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f */
    public static final java.util.Set f206775f = kz5.z.D0(new java.lang.Integer[]{7, 13, 16, 27, 28});

    /* renamed from: g */
    public static final java.util.List f206776g = kz5.c0.i(bw5.jr.FinderMusicReportInfoSceneShoot, bw5.jr.FinderMusicReportInfoSceneEdit);

    /* renamed from: h */
    public static final jz5.g f206777h = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g2.f206577d);

    /* renamed from: i */
    public static final long f206778i = 2;

    /* renamed from: j */
    public static final mv2.w0 f206779j = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i2();

    public static void H(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var, java.lang.String customKey, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        if ((i18 & 8) != 0) {
            str = "";
        }
        p2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customKey, "customKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        p2Var.I(customKey, finderItem.f66946x284ddcb8, p2Var.q(finderItem.f66946x284ddcb8, finderItem, i17, str));
    }

    public static /* synthetic */ void L(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var, android.content.Context context, int i17, r45.q23 q23Var, long j17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            j17 = 0;
        }
        long j18 = j17;
        if ((i19 & 16) != 0) {
            i18 = 0;
        }
        p2Var.K(context, i17, q23Var, j18, i18);
    }

    public static /* synthetic */ void N(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var, android.content.Context context, int i17, java.lang.String str, long j17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            str = null;
        }
        java.lang.String str2 = str;
        if ((i19 & 8) != 0) {
            j17 = 0;
        }
        long j18 = j17;
        if ((i19 & 16) != 0) {
            i18 = 0;
        }
        p2Var.M(context, i17, str2, j18, i18);
    }

    public static void O(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var, android.view.View view, java.lang.String viewId, int i17, java.util.Map map, ly1.a aVar, int i18, java.lang.Object obj) {
        android.content.Intent intent;
        android.content.Intent intent2;
        android.content.Intent intent3;
        int i19 = (i18 & 4) != 0 ? 40 : i17;
        java.lang.String str = null;
        java.util.Map map2 = (i18 & 8) != 0 ? null : map;
        ly1.a aVar2 = (i18 & 16) != 0 ? null : aVar;
        p2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        if (view == null) {
            return;
        }
        android.content.Context context = view.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        long j17 = 0;
        if (activity != null && (intent3 = activity.getIntent()) != null) {
            j17 = intent3.getLongExtra("key_ref_feed_id", 0L);
        }
        java.lang.String u17 = pm0.v.u(j17);
        int intExtra = (activity == null || (intent2 = activity.getIntent()) == null) ? 0 : intent2.getIntExtra("key_ref_comment_scene", 0);
        if (activity != null && (intent = activity.getIntent()) != null) {
            str = intent.getStringExtra("key_ref_feed_dup_flag");
        }
        java.lang.String ek6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(j17, str, intExtra);
        java.util.Map l17 = kz5.c1.l(new jz5.l("source_feedid", u17), new jz5.l("source_feed_commentscene", java.lang.Integer.valueOf(intExtra)), new jz5.l("source_feed_sessionbuffer", ek6));
        if (map2 != null) {
            l17.putAll(map2);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[reportViewEventToSession3] viewId:");
        sb6.append(viewId);
        sb6.append(" sourceFeedId:");
        sb6.append(u17);
        sb6.append(" sourceCommentScene:");
        sb6.append(intExtra);
        sb6.append(" sourceFeedSessionBuffer:");
        sb6.append(ek6.length() == 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostReportLogic", sb6.toString());
        hc2.v0.e(view, viewId, i19, 0, false, true, l17, aVar2, 12, null);
    }

    public static void X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var, int i17, r45.ze2 ze2Var, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            ze2Var = null;
        }
        if ((i19 & 4) != 0) {
            i18 = -1;
        }
        p2Var.getClass();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76398xb0107807(i17);
            c19783xd9a946b7.m76432x60a0b1d3(ze2Var);
            c19783xd9a946b7.m76427xcc694b10(i18);
        }
    }

    public static final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var) {
        p2Var.getClass();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183678n + "post_loading_info";
    }

    public static /* synthetic */ void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6561xef9e397b c6561xef9e397b, int i17, int i18, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, boolean z17, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            c14994x9b99c079 = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = c14994x9b99c079;
        if ((i19 & 32) != 0) {
            z17 = false;
        }
        p2Var.d(c6561xef9e397b, i17, i18, c19783xd9a946b7, c14994x9b99c0792, z17);
    }

    public static r45.xp2 o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7, java.lang.String moduleName, java.lang.String str, java.lang.String str2, int i17, long j17, yz5.q qVar, int i18, java.lang.Object obj) {
        java.lang.Object obj2;
        r45.xp2 xp2Var;
        r45.xp2 xp2Var2;
        java.lang.String str3 = (i18 & 4) != 0 ? "" : str;
        java.lang.String str4 = (i18 & 8) != 0 ? "" : str2;
        int i19 = (i18 & 16) != 0 ? -1 : i17;
        long j18 = (i18 & 32) != 0 ? 0L : j17;
        r45.xp2 xp2Var3 = null;
        yz5.q qVar2 = (i18 & 64) != 0 ? null : qVar;
        p2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c19783xd9a946b7, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        java.util.LinkedList<r45.xp2> m76294xdc7d9d92 = c19783xd9a946b7.m76294xdc7d9d92();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76294xdc7d9d92, "getLoadingInfoList(...)");
        synchronized (m76294xdc7d9d92) {
            java.util.LinkedList<r45.xp2> m76294xdc7d9d922 = c19783xd9a946b7.m76294xdc7d9d92();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76294xdc7d9d922, "getLoadingInfoList(...)");
            java.util.Iterator<T> it = m76294xdc7d9d922.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                r45.xp2 xp2Var4 = (r45.xp2) obj2;
                boolean z17 = true;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xp2Var4 != null ? xp2Var4.m75945x2fec8307(1) : null, moduleName) || !ft2.a.a(xp2Var4.m75945x2fec8307(0), str3) || !ft2.a.a(xp2Var4.m75945x2fec8307(2), str4) || j18 != xp2Var4.m75942xfb822ef2(3)) {
                    z17 = false;
                }
                if (z17) {
                    break;
                }
            }
            xp2Var = (r45.xp2) obj2;
        }
        if (xp2Var == null) {
            if (qVar2 != null && (xp2Var2 = (r45.xp2) qVar2.mo147xb9724478(moduleName, str3, str4)) != null) {
                java.util.LinkedList<r45.xp2> m76294xdc7d9d923 = c19783xd9a946b7.m76294xdc7d9d92();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76294xdc7d9d923, "getLoadingInfoList(...)");
                synchronized (m76294xdc7d9d923) {
                    c19783xd9a946b7.m76294xdc7d9d92().add(xp2Var2);
                }
                xp2Var3 = xp2Var2;
            }
            xp2Var = xp2Var3;
        }
        if (xp2Var != null) {
            xp2Var.set(5, java.lang.Integer.valueOf(i19));
        }
        return xp2Var;
    }

    public static p3325xe03a0797.p3326xc267989b.r2 t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var, oz5.l lVar, p3325xe03a0797.p3326xc267989b.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f431862d;
        }
        if ((i17 & 2) != 0) {
            a1Var = p3325xe03a0797.p3326xc267989b.a1.DEFAULT;
        }
        p2Var.getClass();
        return p3325xe03a0797.p3326xc267989b.l.c((p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) f206777h).mo141623x754a37bb(), lVar, a1Var, pVar);
    }

    public static void v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17, int i18, java.lang.Object obj) {
        java.lang.String str4 = (i18 & 4) != 0 ? "" : str2;
        java.lang.String str5 = (i18 & 8) != 0 ? "" : str3;
        int i19 = (i18 & 16) != 0 ? -1 : i17;
        long j18 = (i18 & 32) != 0 ? 0L : j17;
        p2Var.getClass();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            f206770a.u(c19783xd9a946b7, str, str4, str5, i19, j18);
            cu2.u.f303974a.l(c14994x9b99c079);
        }
    }

    public static void w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var, java.lang.String moduleName, java.lang.String str, java.lang.String str2, int i17, long j17, int i18, java.lang.Object obj) {
        java.lang.String str3 = (i18 & 2) != 0 ? "" : str;
        java.lang.String str4 = (i18 & 4) != 0 ? "" : str2;
        int i19 = (i18 & 8) != 0 ? -1 : i17;
        long j18 = (i18 & 16) != 0 ? 0L : j17;
        p2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        if (c19783xd9a946b7 != null) {
            f206770a.u(c19783xd9a946b7, moduleName, str3, str4, i19, j18);
        }
    }

    public static void y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17, int i18, java.lang.Object obj) {
        java.lang.String str4 = (i18 & 4) != 0 ? "" : str2;
        java.lang.String str5 = (i18 & 8) != 0 ? "" : str3;
        int i19 = (i18 & 16) != 0 ? -1 : i17;
        long j18 = (i18 & 32) != 0 ? 0L : j17;
        p2Var.getClass();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            f206770a.x(c19783xd9a946b7, str, str4, str5, i19, j18);
            cu2.u.f303974a.l(c14994x9b99c079);
        }
    }

    public static void z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var, java.lang.String moduleName, java.lang.String str, java.lang.String str2, int i17, long j17, int i18, java.lang.Object obj) {
        java.lang.String str3 = (i18 & 2) != 0 ? "" : str;
        java.lang.String str4 = (i18 & 4) != 0 ? "" : str2;
        int i19 = (i18 & 8) != 0 ? -1 : i17;
        long j18 = (i18 & 16) != 0 ? 0L : j17;
        p2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        if (c19783xd9a946b7 != null) {
            f206770a.x(c19783xd9a946b7, moduleName, str3, str4, i19, j18);
        }
    }

    public final org.json.JSONObject A(org.json.JSONObject jSONObject, java.lang.String str, int i17) {
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put(str, i17);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r4 != 4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(int r4) {
        /*
            r3 = this;
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b
            if (r0 == 0) goto L47
            int r1 = r0.m76275xbcc8608a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.Set r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206775f
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L18
            r1 = 4
            if (r4 == r1) goto L18
            goto L19
        L18:
            r1 = r4
        L19:
            r0.m76457xae209ab4(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[pickMedia] videoSource:"
            r1.<init>(r2)
            int r2 = r0.m76350x17bb2740()
            r1.append(r2)
            java.lang.String r2 = " mediaSource:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " enterScene:"
            r1.append(r4)
            int r4 = r0.m76275xbcc8608a()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "Finder.FinderPostReportLogic"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r4)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.B(int):void");
    }

    public final void C(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76387x1f2be0ca(i17);
            if (i17 == 4) {
                c19783xd9a946b7.m76433xccae8cca(c01.id.c());
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = f206771b;
            if (c19783xd9a946b72 != null) {
                pm0.v.O("Finder.FinderPostReportLogic", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k2(c19783xd9a946b72, c14994x9b99c079));
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b73 = f206771b;
            if (c19783xd9a946b73 != null) {
                pm0.v.O("Finder.FinderPostReportLogic", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l2(c19783xd9a946b73, false));
            }
        }
        t(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j2("exit", null), 3, null);
    }

    public final void D(android.content.Context context, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean z18 = xy2.c.e(context).length() > 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().j());
        sb6.append('_');
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        int i18 = (((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLPostCamera") == null && ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLCamera") == null) ? 0 : 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = sb7;
        objArr[1] = java.lang.Integer.valueOf(z17 ? 1 : 2);
        objArr[2] = java.lang.Integer.valueOf(i17);
        objArr[3] = java.lang.Integer.valueOf(z18 ? 1 : 2);
        objArr[4] = java.lang.Integer.valueOf(i18);
        g0Var.d(20949, objArr);
    }

    public final void E(int i17, int i18, long j17, long j18) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6558x76407fb5 c6558x76407fb5 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6558x76407fb5();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        if (c19783xd9a946b7 != null) {
            c6558x76407fb5.f139072d = c6558x76407fb5.b("PostId", c19783xd9a946b7.m76317x2a881cd1(), true);
            c6558x76407fb5.f139073e = c6558x76407fb5.b("EditId", c19783xd9a946b7.m76274x17233fbb(), true);
            c6558x76407fb5.f139074f = c19783xd9a946b7.m76350x17bb2740();
            c6558x76407fb5.f139075g = i18;
            c6558x76407fb5.f139076h = j17;
            c6558x76407fb5.f139077i = j18;
            c6558x76407fb5.f139078j = i17;
            c6558x76407fb5.k();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6558x76407fb5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x04f0, code lost:
    
        if (r0 == null) goto L435;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bf A[Catch: JSONException -> 0x01f4, TryCatch #0 {JSONException -> 0x01f4, blocks: (B:54:0x01ae, B:55:0x01b5, B:57:0x01bf, B:58:0x01c5, B:60:0x01ce, B:61:0x01d8, B:63:0x01e2, B:64:0x01ec), top: B:53:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ce A[Catch: JSONException -> 0x01f4, TryCatch #0 {JSONException -> 0x01f4, blocks: (B:54:0x01ae, B:55:0x01b5, B:57:0x01bf, B:58:0x01c5, B:60:0x01ce, B:61:0x01d8, B:63:0x01e2, B:64:0x01ec), top: B:53:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e2 A[Catch: JSONException -> 0x01f4, TryCatch #0 {JSONException -> 0x01f4, blocks: (B:54:0x01ae, B:55:0x01b5, B:57:0x01bf, B:58:0x01c5, B:60:0x01ce, B:61:0x01d8, B:63:0x01e2, B:64:0x01ec), top: B:53:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x085e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 2360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.F(com.tencent.mm.plugin.finder.storage.FinderItem, boolean):void");
    }

    public final void G(java.lang.String customKey, r45.rb4 rb4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customKey, "customKey");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        if (rb4Var == null) {
            rb4Var = q(c19783xd9a946b7, null, 0, "");
        }
        I(customKey, c19783xd9a946b7, rb4Var);
    }

    public final void I(java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7, r45.rb4 rb4Var) {
        if (c19783xd9a946b7 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostReportLogic", "[reportPostTrace28992] reportObject is null, customKey:" + str);
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6562x2e1d3b99 c6562x2e1d3b99 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6562x2e1d3b99();
        c6562x2e1d3b99.f139143f = c6562x2e1d3b99.b("TraceKey", c19783xd9a946b7.m76338xc7913050(), true);
        c6562x2e1d3b99.f139144g = c6562x2e1d3b99.b("CustomKey", str, true);
        c6562x2e1d3b99.f139145h = c01.id.e();
        c6562x2e1d3b99.f139154q = c6562x2e1d3b99.b("FinderUsername", g92.b.f351302e.U(), true);
        c6562x2e1d3b99.f139148k = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37619x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)) != null ? r2.m37745x9208c81b(2) : 0L;
        c6562x2e1d3b99.f139150m = rb4Var.m75942xfb822ef2(3);
        c6562x2e1d3b99.f139151n = rb4Var.m75942xfb822ef2(2);
        c6562x2e1d3b99.f139153p = rb4Var.m75939xb282bd08(0);
        c6562x2e1d3b99.f139147j = rb4Var.m75939xb282bd08(5);
        c6562x2e1d3b99.f139152o = c6562x2e1d3b99.b("RetMsg", rb4Var.m75945x2fec8307(6), true);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("enterScene", c19783xd9a946b7.m76275xbcc8608a());
        jSONObject.put("mediaCount", rb4Var.m75939xb282bd08(1));
        jSONObject.put("feedId", rb4Var.m75945x2fec8307(4));
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6562x2e1d3b99.f139146i = c6562x2e1d3b99.b("ClientInfo", r26.i0.t(jSONObject2, ",", ";", false), true);
        c6562x2e1d3b99.k();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6562x2e1d3b99);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostReportLogic", "[reportPostTrace28992] traceKey:" + c19783xd9a946b7.m76338xc7913050() + " customKey:" + str);
    }

    public final void J(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 t07 = x80Var.t0();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = t07.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            if (c19783xd9a946b7.m76270x4dd641c5() == 0) {
                long j17 = x80Var.f66238x2327e25f;
                if (j17 != 0) {
                    c19783xd9a946b7.m76377xe0aca839(j17);
                }
            }
            pm0.v.O("Finder.FinderPostReportLogic", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m2(z17, c19783xd9a946b7, x80Var, t07));
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = f206771b;
        if (c19783xd9a946b72 != null) {
            pm0.v.O("Finder.FinderPostReportLogic", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l2(c19783xd9a946b72, true));
        }
    }

    public final void K(android.content.Context context, int i17, r45.q23 q23Var, long j17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (q23Var != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("template_id", q23Var.f465118d);
                jSONObject.put("template_type", q23Var.f465119e);
                str = jSONObject.toString();
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderPostReportLogic", "reportClickToSession2 >> " + e17.getMessage());
                str = "";
            }
            if (str != null) {
                str2 = str;
                M(context, i17, str2, j17, i18);
            }
        }
        str2 = "";
        M(context, i17, str2, j17, i18);
    }

    public final void M(android.content.Context context, int i17, java.lang.String str, long j17, int i18) {
        org.json.JSONObject jSONObject;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        android.content.Intent intent = activity != null ? activity.getIntent() : null;
        long longExtra = intent != null ? intent.getLongExtra("key_ref_feed_id", 0L) : 0L;
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("key_ref_feed_dup_flag") : null;
        if (longExtra == 0) {
            longExtra = j17;
        }
        java.lang.String u17 = pm0.v.u(longExtra);
        int intExtra = intent != null ? intent.getIntExtra("key_ref_comment_scene", 0) : 0;
        if (intExtra == 0) {
            intExtra = i18;
        }
        java.lang.String ek6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(longExtra, stringExtra, intExtra);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostReportLogic", "[reportToSession2] actionType=" + i17 + " sourceFeedId=" + u17 + ", sourcecommentScene=" + intExtra);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(longExtra);
        if (h17 == null) {
            h17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079();
            h17.f66939xc8a07680 = longExtra;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
            c19792x256d2725.m76877x684351d(longExtra);
            h17.m59375x22d34c7f(c19792x256d2725);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = h17;
        if (str == null || str.length() == 0) {
            jSONObject = new org.json.JSONObject();
        } else {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderPostReportLogic", e17.getMessage());
                jSONObject = new org.json.JSONObject();
            }
        }
        org.json.JSONObject jSONObject2 = jSONObject;
        try {
            jSONObject2.put("feedId", u17);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
            if (c19783xd9a946b7 != null) {
                jSONObject2.put("song_source_position", c19783xd9a946b7.m76332xc9e4e75a());
                jSONObject2.put("source_feedid", u17);
                jSONObject2.put("source_feed_commentScene", intExtra);
                jSONObject2.put("source_feed_sessionbuffer", ek6);
                jSONObject2.put("source_song_id", c19783xd9a946b7.m76328x2fa43006());
                jSONObject2.put("enter_child_scene", c19783xd9a946b7.m76254xe7b4989a());
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderPostReportLogic", e18.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a;
        java.lang.String jSONObject3 = jSONObject2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        if (intExtra == 0) {
            i19 = V6 != null ? V6.m75939xb282bd08(5) : 0;
        } else {
            i19 = intExtra;
        }
        l0Var.c(V6, c14994x9b99c079, i17, jSONObject3, i19);
    }

    public final void P(long j17, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostReportLogic", "savePostError " + j17 + ", " + i17 + ", " + i18);
        cu2.t tVar = cu2.u.f303974a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f17 = tVar.f(j17);
        if (f17 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f17.f66946x284ddcb8;
            if (c19783xd9a946b7 != null) {
                c19783xd9a946b7.m76360x362883df(i17);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = f17.f66946x284ddcb8;
            if (c19783xd9a946b72 != null) {
                c19783xd9a946b72.m76359x3620a292(i18);
            }
            tVar.l(f17);
        }
    }

    public final void Q(java.util.ArrayList arrayList, int i17, int i18) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        if (c19783xd9a946b7 != null) {
            if (arrayList != null) {
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.lang.String m75945x2fec8307 = ((r45.gb4) it.next()).m75945x2fec8307(0);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    hashSet.add(m75945x2fec8307);
                }
                c19783xd9a946b7.m76407xd72f2c7(hashSet.size());
            }
            c19783xd9a946b7.m76363xee8f06ab(i17);
            c19783xd9a946b7.m76365xb2433b00(i18);
            c19783xd9a946b7.m76408xf1f4f3ec(arrayList != null ? arrayList.size() : 0);
        }
    }

    public final void R(java.lang.String clickId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickId, "clickId");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76362xe4891601(clickId);
        }
    }

    public final void S(bw5.jr reportInfoScene, r45.ej2 ej2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfoScene, "reportInfoScene");
        java.lang.String n17 = n(reportInfoScene);
        if (ej2Var != null) {
            f206773d.put(n17, ej2Var);
        }
    }

    public final void T(java.lang.String postId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postId, "postId");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76424x1dbd50dd(postId);
            if (str != null) {
                c19783xd9a946b7.m76381xa5873c7(str);
            }
        }
    }

    public final void U(long j17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        if (c19783xd9a946b7 != null) {
            if (c19783xd9a946b7.m76331x91dd0d9d() == null) {
                c19783xd9a946b7.m76438x59d375a9(new r45.lc4());
            }
            r45.lc4 m76331x91dd0d9d = c19783xd9a946b7.m76331x91dd0d9d();
            if (m76331x91dd0d9d != null) {
                m76331x91dd0d9d.set(0, java.lang.Long.valueOf(j17));
            }
            r45.lc4 m76331x91dd0d9d2 = c19783xd9a946b7.m76331x91dd0d9d();
            if (m76331x91dd0d9d2 != null) {
                m76331x91dd0d9d2.set(1, java.lang.Integer.valueOf(i17));
            }
            r45.lc4 m76331x91dd0d9d3 = c19783xd9a946b7.m76331x91dd0d9d();
            if (m76331x91dd0d9d3 == null) {
                return;
            }
            m76331x91dd0d9d3.set(2, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(j17, str, i17));
        }
    }

    public final void V(java.lang.String templateInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateInfo, "templateInfo");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76442xb35dfa4a(templateInfo);
        }
    }

    public final void W(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 reportObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportObject, "reportObject");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[startPost] entrance:");
        sb6.append(reportObject.m76275xbcc8608a());
        sb6.append(" isDraft:");
        sb6.append(reportObject.m76268x74541feb() == 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostReportLogic", sb6.toString());
        f206771b = reportObject;
        java.lang.String str = c01.id.c() + '_' + g92.b.f351302e.U();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76388xc80cdeb(str);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = f206771b;
        if (c19783xd9a946b72 != null) {
            c19783xd9a946b72.m76434x7ffb700f(Ri);
        }
        G("andr_Post_Entry", null);
        ft2.b bVar = ft2.b.f348052a;
        ft2.d dVar = ft2.c.f348053a;
        bVar.b(str, ft2.c.f348053a);
    }

    public final void Y(r45.df2 finderMJPublisherInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderMJPublisherInfo, "finderMJPublisherInfo");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        if (c19783xd9a946b7 != null) {
            pm0.v.O("Finder.FinderPostReportLogic", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o2(c19783xd9a946b7, finderMJPublisherInfo));
        }
    }

    public final java.lang.String b(java.util.List multiMediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiMediaInfo, "multiMediaInfo");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = multiMediaInfo.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 c19790xac7db1e0 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("w", c19790xac7db1e0.m76704x755bd410());
            jSONObject.put("h", c19790xac7db1e0.m76701x1c4fb41d());
            jSONObject.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, c19790xac7db1e0.m76700xb5883db3());
            jSONObject.put("audiobitrate", c19790xac7db1e0.m76698xfc4c2d2d());
            jSONObject.put("videobitrate", c19790xac7db1e0.m76702x5214a0e8());
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        long c17 = c01.id.c();
        v(this, finderItem, "PostConfirmCgi", null, null, 0, c17, 28, null);
        v(this, finderItem, "RealWait", null, null, 0, c17, 28, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:81|82|83|(10:88|(1:90)(1:107)|91|92|93|(1:95)(1:104)|(3:97|(1:99)|100)|103|(0)|100)|108|(0)(0)|91|92|93|(0)(0)|(0)|103|(0)|100) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03e6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03e7, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetInt", "", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c3 A[Catch: JSONException -> 0x0412, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0412, blocks: (B:83:0x03ac, B:85:0x03b0, B:90:0x03bc, B:99:0x03f3, B:100:0x03fb, B:106:0x03e7, B:107:0x03c3, B:93:0x03d5, B:97:0x03e1), top: B:82:0x03ac, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0546 A[Catch: all -> 0x055f, TryCatch #5 {all -> 0x055f, blocks: (B:149:0x0512, B:154:0x0522, B:156:0x053a, B:161:0x0546, B:162:0x0553), top: B:148:0x0512 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03bc A[Catch: JSONException -> 0x0412, TryCatch #0 {JSONException -> 0x0412, blocks: (B:83:0x03ac, B:85:0x03b0, B:90:0x03bc, B:99:0x03f3, B:100:0x03fb, B:106:0x03e7, B:107:0x03c3, B:93:0x03d5, B:97:0x03e1), top: B:82:0x03ac, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e1 A[Catch: Exception -> 0x03e6, TRY_LEAVE, TryCatch #3 {Exception -> 0x03e6, blocks: (B:93:0x03d5, B:97:0x03e1), top: B:92:0x03d5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03f3 A[Catch: JSONException -> 0x0412, TryCatch #0 {JSONException -> 0x0412, blocks: (B:83:0x03ac, B:85:0x03b0, B:90:0x03bc, B:99:0x03f3, B:100:0x03fb, B:106:0x03e7, B:107:0x03c3, B:93:0x03d5, B:97:0x03e1), top: B:82:0x03ac, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6561xef9e397b r22, int r23, int r24, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 r25, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.d(com.tencent.mm.autogen.mmdata.rpt.FinderPostStruct, int, int, com.tencent.mm.protocal.protobuf.FinderFeedReportObject, com.tencent.mm.plugin.finder.storage.FinderItem, boolean):void");
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 reportInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        java.lang.Long l17 = (java.lang.Long) reportInfo.b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", 0L);
        java.lang.Long l18 = (java.lang.Long) reportInfo.b("KEY_VIDEO_CROP_DURATION_MS_INT", 0L);
        java.lang.Integer num = (java.lang.Integer) reportInfo.b("KEY_ADD_EMOJI_COUNT_INT", 0);
        java.lang.Integer num2 = (java.lang.Integer) reportInfo.b("KEY_ADD_TEXT_COUNT_INT", 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[finishEdit] originTimeMs:");
        sb6.append(l17);
        sb6.append(" cropTimeMs:");
        sb6.append(l18);
        sb6.append(" emojiCount:");
        sb6.append(num);
        sb6.append(" textCount:");
        sb6.append(num2);
        sb6.append(" videoSource:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        sb6.append(c19783xd9a946b7 != null ? java.lang.Integer.valueOf(c19783xd9a946b7.m76350x17bb2740()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostReportLogic", sb6.toString());
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = f206771b;
        if (c19783xd9a946b72 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            c19783xd9a946b72.m76456x9060e0d7(l17.longValue());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l18);
            c19783xd9a946b72.m76449xbea4a9d6(l18.longValue());
            c19783xd9a946b72.m76452xe2aa22a7((java.lang.String) reportInfo.b("KEY_MUSIC_ID_STRING", ""));
            c19783xd9a946b72.m76399xf8497905((java.lang.String) reportInfo.b("KEY_MUSIC_LIKE_FINDER_FEED_ID_STRING", ""));
            java.lang.Object b17 = reportInfo.b("KEY_SEARCH_MUSIC_INT", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getReportValue(...)");
            c19783xd9a946b72.m76454x7746d534(((java.lang.Number) b17).intValue());
            java.lang.Object b18 = reportInfo.b("KEY_MUSIC_INDEX_INT", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "getReportValue(...)");
            c19783xd9a946b72.m76453x34dc97c6(((java.lang.Number) b18).intValue());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            c19783xd9a946b72.m76450x8fb85a82(num.intValue());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
            c19783xd9a946b72.m76459x6cd99f30(num2.intValue());
            java.lang.Object b19 = reportInfo.b("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", 0L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b19, "getReportValue(...)");
            c19783xd9a946b72.m76384x9eb4d99c(((java.lang.Number) b19).longValue());
            java.lang.Object b27 = reportInfo.b("KEY_VIDEO_SUB_TYPE_INT", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b27, "getReportValue(...)");
            c19783xd9a946b72.m76458x1f16c221(((java.lang.Number) b27).intValue());
            c19783xd9a946b72.m76424x1dbd50dd((java.lang.String) reportInfo.b("KEY_MULTI_MEDIA_POST_ID_STRING", ""));
            c19783xd9a946b72.m76381xa5873c7((java.lang.String) reportInfo.b("KEY_MULTI_MEDIA_EDIT_ID_STRING", ""));
            java.lang.Object b28 = reportInfo.b("KEY_IS_SUB_RECORD_BOOLEAN", java.lang.Boolean.FALSE);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b28, "getReportValue(...)");
            c19783xd9a946b72.m76396x6e87dc07(((java.lang.Boolean) b28).booleanValue() ? 1 : 0);
            java.lang.Object b29 = reportInfo.b("KEY_CHANGE_SUB_RECORD_TAB_INT", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b29, "getReportValue(...)");
            c19783xd9a946b72.m76412x427b5908(((java.lang.Number) b29).intValue());
            java.lang.Object b37 = reportInfo.b("KEY_SUB_VIDEO_RECORD_CLICK_INT", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b37, "getReportValue(...)");
            c19783xd9a946b72.m76413x3d34b72(((java.lang.Number) b37).intValue());
            java.lang.Object b38 = reportInfo.b("KEY_SUB_VIDEO_RECORD_SUCCESS_INT", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b38, "getReportValue(...)");
            c19783xd9a946b72.m76414x604f12d7(((java.lang.Number) b38).intValue());
            java.lang.Object b39 = reportInfo.b("KEY_SUB_VIDEO_NUM_INT", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b39, "getReportValue(...)");
            c19783xd9a946b72.m76415x126cb39f(((java.lang.Number) b39).intValue());
            if (c19783xd9a946b72.m76350x17bb2740() == 0) {
                c19783xd9a946b72.m76457xae209ab4(1);
            }
            c19783xd9a946b72.m76345xac61279b();
            c19783xd9a946b72.m76292xc172df91();
            c19783xd9a946b72.m76350x17bb2740();
        }
    }

    public final void g(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 reportInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        java.lang.Long l17 = (java.lang.Long) reportInfo.b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", 0L);
        java.lang.Long l18 = (java.lang.Long) reportInfo.b("KEY_VIDEO_CROP_DURATION_MS_INT", 0L);
        java.lang.Integer num = (java.lang.Integer) reportInfo.b("KEY_ADD_EMOJI_COUNT_INT", 0);
        java.lang.Integer num2 = (java.lang.Integer) reportInfo.b("KEY_ADD_TEXT_COUNT_INT", 0);
        java.lang.Object obj = (java.lang.Integer) reportInfo.b("KEY_MEDIA_SOURCE_INT", 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[finishTakePhoto] originTimeMs:");
        sb6.append(l17);
        sb6.append(" cropTimeMs:");
        sb6.append(l18);
        sb6.append(" emojiCount:");
        sb6.append(num);
        sb6.append(" textCount:");
        sb6.append(num2);
        sb6.append(" mediaSource:");
        sb6.append(obj);
        sb6.append(" videoSource:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        sb6.append(c19783xd9a946b7 != null ? java.lang.Integer.valueOf(c19783xd9a946b7.m76350x17bb2740()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostReportLogic", sb6.toString());
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = f206771b;
        if (c19783xd9a946b72 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            c19783xd9a946b72.m76456x9060e0d7(l17.longValue());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l18);
            c19783xd9a946b72.m76449xbea4a9d6(l18.longValue());
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            java.lang.Object b17 = reportInfo.b("KEY_RECORD_IS_BEAUTIFY", bool);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getReportValue(...)");
            c19783xd9a946b72.m76394x4bb7a0c8(((java.lang.Boolean) b17).booleanValue() ? 1 : 0);
            c19783xd9a946b72.m76457xae209ab4(((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).nj(reportInfo));
            c19783xd9a946b72.m76452xe2aa22a7((java.lang.String) reportInfo.b("KEY_MUSIC_ID_STRING", ""));
            c19783xd9a946b72.m76399xf8497905((java.lang.String) reportInfo.b("KEY_MUSIC_LIKE_FINDER_FEED_ID_STRING", ""));
            java.lang.Object b18 = reportInfo.b("KEY_SEARCH_MUSIC_INT", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "getReportValue(...)");
            c19783xd9a946b72.m76454x7746d534(((java.lang.Number) b18).intValue());
            java.lang.Object b19 = reportInfo.b("KEY_MUSIC_INDEX_INT", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b19, "getReportValue(...)");
            c19783xd9a946b72.m76453x34dc97c6(((java.lang.Number) b19).intValue());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            c19783xd9a946b72.m76450x8fb85a82(num.intValue());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
            c19783xd9a946b72.m76459x6cd99f30(num2.intValue());
            java.lang.Object b27 = reportInfo.b("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", 0L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b27, "getReportValue(...)");
            c19783xd9a946b72.m76384x9eb4d99c(((java.lang.Number) b27).longValue());
            java.lang.Object b28 = reportInfo.b("KEY_ENTER_TIME_MS_LONG", 0L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b28, "getReportValue(...)");
            c19783xd9a946b72.m76383x2e459b62(((java.lang.Number) b28).longValue());
            java.lang.Object b29 = reportInfo.b("KEY_IS_SUB_RECORD_BOOLEAN", bool);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b29, "getReportValue(...)");
            c19783xd9a946b72.m76396x6e87dc07(((java.lang.Boolean) b29).booleanValue() ? 1 : 0);
            java.lang.Object b37 = reportInfo.b("KEY_CHANGE_SUB_RECORD_TAB_INT", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b37, "getReportValue(...)");
            c19783xd9a946b72.m76412x427b5908(((java.lang.Number) b37).intValue());
            java.lang.Object b38 = reportInfo.b("KEY_SUB_VIDEO_RECORD_CLICK_INT", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b38, "getReportValue(...)");
            c19783xd9a946b72.m76413x3d34b72(((java.lang.Number) b38).intValue());
            java.lang.Object b39 = reportInfo.b("KEY_SUB_VIDEO_RECORD_SUCCESS_INT", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b39, "getReportValue(...)");
            c19783xd9a946b72.m76414x604f12d7(((java.lang.Number) b39).intValue());
            java.lang.Object b47 = reportInfo.b("KEY_SUB_VIDEO_NUM_INT", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b47, "getReportValue(...)");
            c19783xd9a946b72.m76415x126cb39f(((java.lang.Number) b47).intValue());
            c19783xd9a946b72.m76345xac61279b();
            c19783xd9a946b72.m76292xc172df91();
            c19783xd9a946b72.m76350x17bb2740();
        }
    }

    public final java.lang.String h(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!(str2 == null || str2.length() == 0)) {
            str = str2 + '_' + str;
        }
        if (str3 == null || str3.length() == 0) {
            return str;
        }
        return str + '_' + str3;
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 i(android.content.Context context, int i17, boolean z17) {
        int i18;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7();
        c19783xd9a946b7.m76382xeaecae96(i17);
        c19783xd9a946b7.m76375x52e23a5f(z17 ? 1 : 0);
        if (context != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            java.lang.Integer valueOf = nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null;
            if (valueOf != null) {
                i18 = valueOf.intValue();
                c19783xd9a946b7.m76367xc5f6eaef(i18);
                c19783xd9a946b7.m76445xc249915c("finder_upload_" + c01.id.c() + '_' + c01.z1.r());
                return c19783xd9a946b7;
            }
        }
        i18 = 0;
        c19783xd9a946b7.m76367xc5f6eaef(i18);
        c19783xd9a946b7.m76445xc249915c("finder_upload_" + c01.id.c() + '_' + c01.z1.r());
        return c19783xd9a946b7;
    }

    public final java.util.Map j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7) {
        jz5.l[] lVarArr = new jz5.l[27];
        lVarArr[0] = new jz5.l("EnterScene", java.lang.String.valueOf(c19783xd9a946b7.m76275xbcc8608a()));
        lVarArr[1] = new jz5.l("VideoSource", java.lang.String.valueOf(c19783xd9a946b7.m76350x17bb2740()));
        lVarArr[2] = new jz5.l("parentEnterScene", java.lang.String.valueOf(c19783xd9a946b7.m76315x1d91a854()));
        lVarArr[3] = new jz5.l("ExitUI", java.lang.String.valueOf(c19783xd9a946b7.m76280xf10792be()));
        lVarArr[4] = new jz5.l("VideoEmoji", java.lang.String.valueOf(c19783xd9a946b7.m76343x58e1c10e()));
        lVarArr[5] = new jz5.l("VideoText", java.lang.String.valueOf(c19783xd9a946b7.m76352x914392bc()));
        java.lang.String m76345xac61279b = c19783xd9a946b7.m76345xac61279b();
        if (m76345xac61279b == null) {
            m76345xac61279b = "";
        }
        lVarArr[6] = new jz5.l("VideoMusicId", m76345xac61279b);
        lVarArr[7] = new jz5.l("VideoMusicIndex", java.lang.String.valueOf(c19783xd9a946b7.m76346xfe05fe52()));
        lVarArr[8] = new jz5.l("IsSearchMusic", java.lang.String.valueOf(c19783xd9a946b7.m76347xd34a4028()));
        lVarArr[9] = new jz5.l("VideoType", java.lang.String.valueOf(c19783xd9a946b7.m76348xda96d5df()));
        lVarArr[10] = new jz5.l("HasWording", java.lang.String.valueOf(c19783xd9a946b7.m76278xad28fb72()));
        lVarArr[11] = new jz5.l("WordingCount", java.lang.String.valueOf(c19783xd9a946b7.m76266x56404648()));
        lVarArr[12] = new jz5.l("LbsFlag", java.lang.String.valueOf(c19783xd9a946b7.m76291x3c9f2a93()));
        lVarArr[13] = new jz5.l("EditDraftFlag", java.lang.String.valueOf(c19783xd9a946b7.m76268x74541feb()));
        lVarArr[14] = new jz5.l("MentionUsercnt", java.lang.String.valueOf(c19783xd9a946b7.m76300xd729f7bb()));
        lVarArr[15] = new jz5.l("ClickMentionCnt", java.lang.String.valueOf(c19783xd9a946b7.m76256x12f8fa37()));
        lVarArr[16] = new jz5.l("MentionCnt", java.lang.String.valueOf(c19783xd9a946b7.m76300xd729f7bb()));
        lVarArr[17] = new jz5.l("MentionRepeatCnt", java.lang.String.valueOf(c19783xd9a946b7.m76301x5ac971e0()));
        lVarArr[18] = new jz5.l("VideoSubType", java.lang.String.valueOf(c19783xd9a946b7.m76351xe8cdc715()));
        lVarArr[19] = new jz5.l("MusicType", java.lang.String.valueOf(c19783xd9a946b7.m76311x16aec849()));
        lVarArr[20] = new jz5.l("SoundTrackType", java.lang.String.valueOf(c19783xd9a946b7.m76329x5e213bcc()));
        java.lang.String m76282x5f9a13fe = c19783xd9a946b7.m76282x5f9a13fe();
        if (m76282x5f9a13fe == null) {
            m76282x5f9a13fe = "";
        }
        lVarArr[21] = new jz5.l("FollowSoundTrackId", m76282x5f9a13fe);
        java.lang.String m76336x918680e3 = c19783xd9a946b7.m76336x918680e3();
        if (m76336x918680e3 == null) {
            m76336x918680e3 = "";
        }
        lVarArr[22] = new jz5.l("ActivityID", m76336x918680e3);
        lVarArr[23] = new jz5.l("ActivityType", java.lang.String.valueOf(c19783xd9a946b7.m76337x49ef3102()));
        lVarArr[24] = new jz5.l("videoDuration", java.lang.String.valueOf(r(c19783xd9a946b7)));
        lVarArr[25] = new jz5.l("child_enterscene", java.lang.String.valueOf(c19783xd9a946b7.m76254xe7b4989a()));
        java.lang.String m76335x1cf886d6 = c19783xd9a946b7.m76335x1cf886d6();
        if (m76335x1cf886d6 == null) {
            m76335x1cf886d6 = "";
        }
        lVarArr[26] = new jz5.l("TemplateInfo", m76335x1cf886d6);
        java.util.Map c17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(kz5.c1.k(lVarArr));
        r45.ze2 m76325x98aa49c7 = c19783xd9a946b7.m76325x98aa49c7();
        if (m76325x98aa49c7 != null) {
            java.lang.String m75945x2fec8307 = m76325x98aa49c7.m75945x2fec8307(2);
            java.lang.String m75945x2fec83072 = m76325x98aa49c7.m75945x2fec8307(3);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(m75945x2fec8307, m75945x2fec83072)) {
                m75945x2fec8307 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573431el5, m75945x2fec8307, m75945x2fec83072);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
                m75945x2fec8307 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec83072) ? m75945x2fec83072 : "";
            }
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            c17.put("LbsInfo", m75945x2fec8307);
        }
        r45.ke4 m76302x72d1d7f7 = c19783xd9a946b7.m76302x72d1d7f7();
        if (m76302x72d1d7f7 != null) {
            java.lang.String m75945x2fec83073 = m76302x72d1d7f7.m75945x2fec8307(1);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            c17.put("sourceFeedId", m75945x2fec83073);
            java.lang.String m75945x2fec83074 = m76302x72d1d7f7.m75945x2fec8307(2);
            if (m75945x2fec83074 == null) {
                m75945x2fec83074 = "";
            }
            c17.put("sourceSongId", m75945x2fec83074);
            java.lang.String m75945x2fec83075 = m76302x72d1d7f7.m75945x2fec8307(3);
            if (m75945x2fec83075 == null) {
                m75945x2fec83075 = "";
            }
            c17.put("followFeedTemplateId", m75945x2fec83075);
            java.lang.String m75945x2fec83076 = m76302x72d1d7f7.m75945x2fec8307(4);
            if (m75945x2fec83076 == null) {
                m75945x2fec83076 = "";
            }
            c17.put("TemplateID", m75945x2fec83076);
            java.lang.String m75945x2fec83077 = m76302x72d1d7f7.m75945x2fec8307(5);
            c17.put("TemplateTabID", m75945x2fec83077 != null ? m75945x2fec83077 : "");
            c17.put("TemplatePosition", java.lang.String.valueOf(m76302x72d1d7f7.m75939xb282bd08(6)));
            c17.put("TemplateType", java.lang.String.valueOf(m76302x72d1d7f7.m75939xb282bd08(12)));
            c17.put("ExportScene", java.lang.String.valueOf(m76302x72d1d7f7.m75939xb282bd08(8)));
            c17.put("IsSCAssetGenerate", m76302x72d1d7f7.m75933x41a8a7f2(10) ? "1" : "0");
            c17.put("CreationPageID", java.lang.String.valueOf(m76302x72d1d7f7.m75939xb282bd08(11)));
            c17.put("TemplateIsFavorite", m76302x72d1d7f7.m75933x41a8a7f2(13) ? "1" : "0");
            c17.put("TemplateIsAIGC", m76302x72d1d7f7.m75933x41a8a7f2(14) ? "1" : "0");
        }
        return c17;
    }

    public final java.util.Map k(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7) {
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("video_duration", java.lang.Long.valueOf(r(c19783xd9a946b7)));
        lVarArr[1] = new jz5.l("video_source", java.lang.Integer.valueOf(c19783xd9a946b7.m76350x17bb2740()));
        lVarArr[2] = new jz5.l("enter_scene", java.lang.Integer.valueOf(c19783xd9a946b7.m76275xbcc8608a()));
        java.lang.String m76303xf7b7088 = c19783xd9a946b7.m76303xf7b7088();
        if (m76303xf7b7088 == null) {
            m76303xf7b7088 = "";
        }
        lVarArr[3] = new jz5.l("mj_publisher_session_id", m76303xf7b7088);
        java.util.Map c17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(kz5.c1.k(lVarArr));
        r45.ke4 m76302x72d1d7f7 = c19783xd9a946b7.m76302x72d1d7f7();
        if (m76302x72d1d7f7 != null) {
            java.lang.String m75945x2fec8307 = m76302x72d1d7f7.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            c17.put("source_feed_id", m75945x2fec8307);
            java.lang.String m75945x2fec83072 = m76302x72d1d7f7.m75945x2fec8307(2);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            c17.put("source_song_id", m75945x2fec83072);
            java.lang.String m75945x2fec83073 = m76302x72d1d7f7.m75945x2fec8307(3);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            c17.put("follow_feed_template_id", m75945x2fec83073);
            java.lang.String m75945x2fec83074 = m76302x72d1d7f7.m75945x2fec8307(4);
            if (m75945x2fec83074 == null) {
                m75945x2fec83074 = "";
            }
            c17.put("template_id", m75945x2fec83074);
            java.lang.String m75945x2fec83075 = m76302x72d1d7f7.m75945x2fec8307(5);
            if (m75945x2fec83075 == null) {
                m75945x2fec83075 = "";
            }
            c17.put("template_tab_id", m75945x2fec83075);
            c17.put("template_position", java.lang.Integer.valueOf(m76302x72d1d7f7.m75939xb282bd08(6)));
            java.lang.String m75945x2fec83076 = m76302x72d1d7f7.m75945x2fec8307(7);
            c17.put("template_session_buffer", m75945x2fec83076 != null ? m75945x2fec83076 : "");
            c17.put("template_type", java.lang.Integer.valueOf(m76302x72d1d7f7.m75939xb282bd08(12)));
            c17.put("template_is_favorite", java.lang.Boolean.valueOf(m76302x72d1d7f7.m75933x41a8a7f2(13)));
            c17.put("template_is_aigc", java.lang.Boolean.valueOf(m76302x72d1d7f7.m75933x41a8a7f2(14)));
            c17.put("export_scene", java.lang.Integer.valueOf(m76302x72d1d7f7.m75939xb282bd08(8)));
            c17.put("is_sc_asset_generate", java.lang.Boolean.valueOf(m76302x72d1d7f7.m75933x41a8a7f2(10)));
            c17.put("creation_page_id", java.lang.Integer.valueOf(m76302x72d1d7f7.m75939xb282bd08(11)));
        }
        return c17;
    }

    public final long l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        java.util.LinkedList<r45.mb4> m59264x7efe73ec;
        java.util.LinkedList linkedList;
        r45.ho6 ho6Var;
        long j17 = 0;
        if (c14994x9b99c079 != null && (m59264x7efe73ec = c14994x9b99c079.m59264x7efe73ec()) != null) {
            for (r45.mb4 mb4Var : m59264x7efe73ec) {
                int m75939xb282bd08 = mb4Var.m75939xb282bd08(7);
                if (m75939xb282bd08 == 0) {
                    r45.h70 h70Var = (r45.h70) mb4Var.m75936x14adae67(21);
                    m75939xb282bd08 = (int) com.p314xaae8f345.mm.vfs.w6.k((h70Var == null || (linkedList = h70Var.f457430d) == null || (ho6Var = (r45.ho6) kz5.n0.Z(linkedList)) == null) ? null : ho6Var.f457866d);
                }
                j17 += m75939xb282bd08;
            }
        }
        return j17;
    }

    public final r45.ej2 m(bw5.jr jrVar) {
        r45.ej2 ej2Var = (r45.ej2) f206773d.get(n(jrVar));
        if (ej2Var != null) {
            return ej2Var;
        }
        r45.ej2 ej2Var2 = new r45.ej2();
        ej2Var2.set(2, java.lang.Integer.valueOf(jrVar.f110652d));
        return ej2Var2;
    }

    public final java.lang.String n(bw5.jr jrVar) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        if (c19783xd9a946b7 == null || (str = c19783xd9a946b7.m76281x194b99df()) == null) {
            str = "";
        }
        return str + '_' + jrVar.f110652d;
    }

    public final java.lang.String p(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7) {
        java.lang.String m76281x194b99df = c19783xd9a946b7 != null ? c19783xd9a946b7.m76281x194b99df() : null;
        return m76281x194b99df == null ? "" : m76281x194b99df;
    }

    public final r45.rb4 q(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, int i17, java.lang.String str) {
        java.util.LinkedList<r45.mb4> m59264x7efe73ec;
        r45.mb4 mb4Var;
        r45.h70 h70Var;
        java.util.LinkedList<r45.mb4> m59264x7efe73ec2;
        r45.mb4 mb4Var2;
        java.util.LinkedList<r45.mb4> m59264x7efe73ec3;
        r45.rb4 rb4Var = new r45.rb4();
        int i18 = 0;
        rb4Var.set(0, java.lang.Integer.valueOf(c19783xd9a946b7 != null ? c19783xd9a946b7.m76348xda96d5df() : 0));
        if (c14994x9b99c079 != null && (m59264x7efe73ec3 = c14994x9b99c079.m59264x7efe73ec()) != null) {
            i18 = m59264x7efe73ec3.size();
        }
        rb4Var.set(1, java.lang.Integer.valueOf(i18));
        rb4Var.set(2, java.lang.Long.valueOf(f206770a.l(c14994x9b99c079)));
        java.lang.Long l17 = null;
        java.lang.Long valueOf = (c14994x9b99c079 == null || (m59264x7efe73ec2 = c14994x9b99c079.m59264x7efe73ec()) == null || (mb4Var2 = (r45.mb4) kz5.n0.Z(m59264x7efe73ec2)) == null) ? null : java.lang.Long.valueOf(mb4Var2.m75939xb282bd08(3));
        long j17 = 0;
        if ((valueOf != null && valueOf.longValue() == 0) || valueOf == null) {
            if (c14994x9b99c079 != null && (m59264x7efe73ec = c14994x9b99c079.m59264x7efe73ec()) != null && (mb4Var = (r45.mb4) kz5.n0.Z(m59264x7efe73ec)) != null && (h70Var = (r45.h70) mb4Var.m75936x14adae67(21)) != null) {
                l17 = java.lang.Long.valueOf(h70Var.f457432f);
            }
            valueOf = l17;
        }
        if (valueOf != null) {
            rb4Var.set(3, java.lang.Long.valueOf(valueOf.longValue()));
        }
        long m59251x5db1b11 = c14994x9b99c079 != null ? c14994x9b99c079.m59251x5db1b11() : 0L;
        if (m59251x5db1b11 != 0) {
            j17 = m59251x5db1b11;
        } else if (c19783xd9a946b7 != null) {
            j17 = c19783xd9a946b7.m76270x4dd641c5();
        }
        rb4Var.set(4, pm0.v.u(j17));
        rb4Var.set(5, java.lang.Integer.valueOf(i17));
        rb4Var.set(6, str);
        return rb4Var;
    }

    public final long r(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7) {
        long m76349x598a4763 = (c19783xd9a946b7.m76349x598a4763() <= c19783xd9a946b7.m76342x2bce4362() || c19783xd9a946b7.m76342x2bce4362() <= 0) ? c19783xd9a946b7.m76349x598a4763() : c19783xd9a946b7.m76342x2bce4362();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostReportLogic", "[getVideoDurationMs] videoDurationMs=" + m76349x598a4763);
        return m76349x598a4763;
    }

    public final boolean s() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = f206771b;
        if (c19783xd9a946b7 != null && c19783xd9a946b7.m76275xbcc8608a() == 105) {
            return true;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = f206771b;
        return c19783xd9a946b72 != null && c19783xd9a946b72.m76275xbcc8608a() == 110;
    }

    public final void u(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17) {
        java.lang.Long l17 = (java.lang.Long) f206774e.remove(h(str, str2, str3));
        if (l17 == null) {
            l17 = 0L;
        }
        r45.xp2 o17 = o(this, c19783xd9a946b7, str, str2, str3, i17, l17.longValue(), null, 64, null);
        if (o17 != null) {
            o17.set(4, java.lang.Long.valueOf(j17 > 0 ? j17 : c01.id.c()));
            t(f206770a, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n2(c19783xd9a946b7, null), 3, null);
        }
    }

    public final void x(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17) {
        r45.xp2 o17 = o(this, c19783xd9a946b7, str, str2, str3, i17, 0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.h2(this), 32, null);
        if (o17 != null) {
            o17.set(3, java.lang.Long.valueOf(j17 > 0 ? j17 : c01.id.c()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = f206770a;
            java.lang.String h17 = p2Var.h(str, str2, str3);
            if (h17.length() > 0) {
                f206774e.put(h17, java.lang.Long.valueOf(o17.m75942xfb822ef2(3)));
            }
            t(p2Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n2(c19783xd9a946b7, null), 3, null);
        }
    }
}
