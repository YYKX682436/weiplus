package bt3;

/* loaded from: classes9.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f24215a = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS);

    public static java.lang.String a(r45.ht0 ht0Var) {
        return (android.text.TextUtils.isEmpty(ht0Var.getString(2)) || (ht0Var.getLong(4) & 1) == 1) ? ht0Var.getString(1) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hso, ht0Var.getString(2), ht0Var.getString(1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x04c4, code lost:
    
        if (r6 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04ca, code lost:
    
        r20.f54090g.f6315a.f370964f.add(m(r21, r19.getString(com.tencent.mm.R.string.f490505wz), r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04db, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x04c8, code lost:
    
        if (r5.f191672i != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0632, code lost:
    
        if (((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Zi(r0.getString(1), null, null, r12) != false) goto L179;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00a8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x00ab. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:215:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x1157  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x1181  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0c09  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0cc3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x1179  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x1208  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x127a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.content.Context r19, com.tencent.mm.autogen.events.DoFavoriteEvent r20, com.tencent.mm.storage.f9 r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 4868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.c0.b(android.content.Context, com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.storage.f9, boolean):boolean");
    }

    public static boolean c(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, com.tencent.mm.storage.f9 f9Var) {
        try {
            ot0.m0 Di = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var.getMsgId(), f9Var.j());
            java.util.LinkedList<ot0.s0> linkedList = Di.f348581i;
            if (linkedList != null) {
                int i17 = 0;
                for (ot0.s0 s0Var : linkedList) {
                    rv.h2 h2Var = (rv.h2) i95.n0.c(rv.h2.class);
                    java.lang.String str = s0Var.f348775r;
                    ((qv.a) h2Var).getClass();
                    kk.j jVar = ot0.g0.f348477a;
                    if (!k01.o.a(str)) {
                        r45.hp0 hp0Var = new r45.hp0();
                        r45.ip0 j17 = j(f9Var);
                        hp0Var.f376353d = j17;
                        j17.g(Di.f348578f);
                        hp0Var.f376353d.j(s0Var.f348762e);
                        r45.gp0 gp0Var = new r45.gp0();
                        gp0Var.O0(s0Var.f348761d);
                        gp0Var.m0(s0Var.f348769n);
                        gp0Var.g0(l(f9Var));
                        gp0Var.v0(f9Var.I0());
                        if (com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f348766i)) {
                            gp0Var.z0(true);
                        } else {
                            gp0Var.B0(tv.a.b(s0Var.f348766i));
                        }
                        gp0Var.x0(true);
                        r45.tq0 tq0Var = new r45.tq0();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f348761d)) {
                            tq0Var.p(s0Var.f348761d);
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f348769n)) {
                            tq0Var.j(s0Var.f348769n);
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f348766i)) {
                            ((qv.a) ((rv.h2) i95.n0.c(rv.h2.class))).getClass();
                            tq0Var.o(ot0.g0.j(s0Var));
                        }
                        if (tq0Var.computeSize() > 0) {
                            tq0Var.n(1);
                            hp0Var.f376355f = tq0Var;
                        }
                        gp0Var.h0(5);
                        gp0Var.J1 = hp0Var;
                        gp0Var.k0(n(hp0Var.f376353d));
                        gp0Var.l0(o(hp0Var.f376353d));
                        if (com.tencent.mm.storage.z3.m4(hp0Var.f376353d.f377237o)) {
                            java.lang.String a17 = t41.g.a(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(hp0Var.f376353d.f377237o, true));
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                                gp0Var.G0(a17);
                            }
                        }
                        doFavoriteEvent.f54090g.f6315a.f370964f.add(gp0Var);
                        doFavoriteEvent.f54090g.f6316b.f385910h++;
                        i17++;
                        java.lang.String str2 = Di.f348578f;
                        java.lang.String str3 = Di.f348579g;
                        ((qv.a) ((rv.h2) i95.n0.c(rv.h2.class))).getClass();
                        hp0Var.f376369w = ot0.g0.f(s0Var, tq0Var, str2, str3);
                    }
                }
                if (i17 != 0) {
                    return true;
                }
                doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cak;
                return false;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GetFavRecordDataSourceForRecordMsg", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.GetFavRecordDataSourceForRecordMsg", "retransmit app msg error : %s", e17.getLocalizedMessage());
        }
        doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cam;
        return false;
    }

    public static void d(com.tencent.mm.storage.f9 f9Var, r45.hp0 hp0Var, r45.tq0 tq0Var) {
        ((qv.a) ((rv.h2) i95.n0.c(rv.h2.class))).getClass();
        hp0Var.f376369w = ot0.g0.e(f9Var, tq0Var);
    }

    public static boolean e(android.content.Context context, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String sb6;
        r45.gp0 m17;
        com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D3(f9Var.j());
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.f376353d = j(f9Var);
        int i17 = D3.f196374q;
        java.util.Set set = c01.e2.f37117a;
        if (com.tencent.mm.storage.z3.D3(i17)) {
            m17 = new r45.gp0();
            m17.e0(com.tencent.mm.sdk.platformtools.t8.h1());
            m17.g0(l(f9Var));
            m17.v0(f9Var.I0());
            m17.h0(16);
            m17.m0(f9Var.j());
            m17.z0(true);
            m17.x0(true);
            m17.J1 = hp0Var;
            m17.k0(n(hp0Var.f376353d));
            m17.l0(o(hp0Var.f376353d));
            if (com.tencent.mm.storage.z3.m4(hp0Var.f376353d.f377237o)) {
                java.lang.String a17 = t41.g.a(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(hp0Var.f376353d.f377237o, true));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                    m17.G0(a17);
                }
            }
        } else {
            java.lang.String str = "";
            if (com.tencent.mm.storage.z3.m4(D3.f196358a) || ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Bi(D3)) {
                java.lang.String Ni = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ni(D3.f196383z, "openim_card_type_name", j41.a0.TYPE_WORDING);
                if (android.text.TextUtils.isEmpty(Ni)) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(context.getResources().getString(com.tencent.mm.R.string.f490447vb));
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(D3.c())) {
                        str = " " + D3.c();
                    }
                    sb7.append(str);
                    sb6 = sb7.toString();
                } else {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append(java.lang.String.format("[%s]", Ni));
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(D3.c())) {
                        str = " " + D3.c();
                    }
                    sb8.append(str);
                    sb6 = sb8.toString();
                }
                m17 = m(f9Var, sb6, hp0Var);
            } else {
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(context.getString(com.tencent.mm.R.string.f490447vb));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(D3.c())) {
                    str = " " + D3.c();
                }
                sb9.append(str);
                m17 = m(f9Var, sb9.toString(), hp0Var);
            }
        }
        doFavoriteEvent.f54090g.f6315a.f370964f.add(m17);
        doFavoriteEvent.f54090g.f6316b.f385920u++;
        return true;
    }

    public static boolean f(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, com.tencent.mm.storage.f9 f9Var, boolean z17) {
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavRecordDataSourceForRecordMsg", "doFillMpVideoEventInfo content is null");
            return false;
        }
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(4);
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.f(v17.f348674k);
        bq0Var.o(jq0Var);
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.e0(com.tencent.mm.sdk.platformtools.t8.h1());
        gp0Var.A0("");
        gp0Var.o0(v17.f348734z);
        ((qv.a) ((rv.h2) i95.n0.c(rv.h2.class))).getClass();
        r45.qp0 g17 = ot0.g0.g(f9Var);
        if (g17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavRecordDataSourceForRecordMsg", "doFillMpVideoEventInfo favMpMsgItem is null");
            return false;
        }
        gp0Var.n0(g17.f384167i);
        gp0Var.O0(v17.f348654f);
        gp0Var.K0(v17.f348674k);
        gp0Var.x0(true);
        gp0Var.z0(true);
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.f376353d = j(f9Var);
        if (f9Var.M2()) {
            hp0Var.f376370x = g17;
        }
        gp0Var.J1 = hp0Var;
        gp0Var.F0(f9Var.getMsgId());
        gp0Var.k0(n(hp0Var.f376353d));
        gp0Var.l0(o(hp0Var.f376353d));
        if (com.tencent.mm.storage.z3.m4(hp0Var.f376353d.f377237o)) {
            java.lang.String a17 = t41.g.a(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(hp0Var.f376353d.f377237o, true));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                gp0Var.G0(a17);
            }
        }
        doFavoriteEvent.f54090g.f6315a.f370964f.add(gp0Var);
        doFavoriteEvent.f54090g.f6316b.f385909g++;
        gp0Var.h0(4);
        return true;
    }

    public static boolean g(android.content.Context context, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, com.tencent.mm.storage.f9 f9Var, int i17) {
        java.lang.String string;
        java.lang.String str;
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.f376353d = j(f9Var);
        if (i17 == 1) {
            java.lang.String Bi = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Bi(f9Var.z0());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(context.getString(com.tencent.mm.R.string.f490382tf));
            if (com.tencent.mm.sdk.platformtools.t8.K0(Bi)) {
                str = "";
            } else {
                str = " " + Bi;
            }
            sb6.append(str);
            string = sb6.toString();
        } else {
            string = i17 == 2 ? context.getString(com.tencent.mm.R.string.f490512x6) : i17 == 3 ? context.getString(com.tencent.mm.R.string.f490564ym) : null;
        }
        doFavoriteEvent.f54090g.f6315a.f370964f.add(m(f9Var, string, hp0Var));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0227, code lost:
    
        if (r11 == null) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0b25  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h(android.content.Context r26, com.tencent.mm.autogen.events.DoFavoriteEvent r27, com.tencent.mm.storage.f9 r28, boolean r29, int r30) {
        /*
            Method dump skipped, instructions count: 2876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.c0.h(android.content.Context, com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.storage.f9, boolean, int):boolean");
    }

    public static boolean i(android.content.Context context, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, java.lang.String str, java.util.List list, boolean z17, boolean z18, int i17) {
        if (doFavoriteEvent == null || list == null || list.isEmpty() || context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavRecordDataSourceForRecordMsg", "fill favorite event fail, event or msgs is null");
            if (doFavoriteEvent == null) {
                return false;
            }
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
            if (c01.ia.A(f9Var)) {
                int type = f9Var.getType() & 65535;
                if (type == 1) {
                    f9Var.d1(context.getString(com.tencent.mm.R.string.f490570ys));
                } else if (type == 3) {
                    f9Var.d1(context.getString(com.tencent.mm.R.string.f490517xd));
                    f9Var.setType(1);
                } else if (type == 43) {
                    f9Var.d1(context.getString(com.tencent.mm.R.string.f490596zi));
                    f9Var.setType(1);
                } else if (type == 49) {
                    f9Var.d1(context.getString(com.tencent.mm.R.string.f490584z5));
                    f9Var.setType(1);
                }
            }
        }
        ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
        boolean g17 = r01.z.g(str);
        int size = list.size();
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (size == 1 && !z18) {
            com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) list.get(0);
            if (!f9Var2.t2()) {
                ((com.tencent.mm.pluginsdk.model.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
                return com.tencent.mm.pluginsdk.model.a2.j(doFavoriteEvent, f9Var2, false);
            }
            java.util.LinkedList linkedList = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var2.getMsgId(), f9Var2.j()).f348581i;
            if (linkedList != null && linkedList.size() == 1) {
                ((com.tencent.mm.pluginsdk.model.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
                return com.tencent.mm.pluginsdk.model.a2.j(doFavoriteEvent, f9Var2, false);
            }
            c4Var.f6315a = new r45.bq0();
            c4Var.f6316b = new r45.sq0();
            r45.bq0 bq0Var = c4Var.f6315a;
            r45.jq0 jq0Var = new r45.jq0();
            jq0Var.e(str);
            jq0Var.g(1);
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            jq0Var.c(java.lang.System.currentTimeMillis());
            jq0Var.i("");
            bq0Var.o(jq0Var);
            c4Var.f6317c = 14;
            return h(context, doFavoriteEvent, f9Var2, z17, i17);
        }
        c4Var.f6315a = new r45.bq0();
        c4Var.f6316b = new r45.sq0();
        if (g17) {
            com.tencent.mm.storage.f9 f9Var3 = (com.tencent.mm.storage.f9) list.get(0);
            rv.l2 l2Var = (rv.l2) i95.n0.c(rv.l2.class);
            long t07 = f9Var3.t0();
            ((qv.c) l2Var).getClass();
            java.lang.String str2 = s01.r.f401924a;
            java.lang.String str3 = r01.q3.Ui().z0(t07).field_bizChatServId;
            ((qv.c) ((rv.l2) i95.n0.c(rv.l2.class))).getClass();
            if (s01.r.o(str3)) {
                c4Var.f6315a.p(context.getString(com.tencent.mm.R.string.hsy));
            } else {
                ((qv.c) ((rv.l2) i95.n0.c(rv.l2.class))).getClass();
                s01.a0 d17 = s01.r.d(str);
                if (d17 != null) {
                    r45.bq0 bq0Var2 = c4Var.f6315a;
                    java.lang.String str4 = d17.field_userName;
                    ((qv.c) ((rv.l2) i95.n0.c(rv.l2.class))).getClass();
                    bq0Var2.p(context.getString(com.tencent.mm.R.string.f491208cc5, str4, s01.r.l(str3)));
                }
            }
        } else if (com.tencent.mm.storage.z3.R4(str)) {
            c4Var.f6315a.p(context.getString(com.tencent.mm.R.string.hsy));
        } else {
            java.lang.String l17 = c01.z1.l();
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String b17 = c01.a2.b(str);
            if (b17 == null) {
                b17 = "";
            }
            if (l17.equals(b17)) {
                c4Var.f6315a.p(context.getString(com.tencent.mm.R.string.cc6, l17));
            } else {
                r45.bq0 bq0Var3 = c4Var.f6315a;
                java.lang.String l18 = c01.z1.l();
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                bq0Var3.p(context.getString(com.tencent.mm.R.string.f491208cc5, l18, c01.a2.b(str)));
            }
        }
        r45.bq0 bq0Var4 = c4Var.f6315a;
        java.lang.String str5 = bq0Var4.f370972q;
        r45.jq0 jq0Var2 = new r45.jq0();
        jq0Var2.e(str);
        jq0Var2.g(1);
        boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        jq0Var2.c(java.lang.System.currentTimeMillis());
        jq0Var2.i("");
        bq0Var4.o(jq0Var2);
        c4Var.f6317c = 14;
        java.util.Iterator it6 = list.iterator();
        boolean z29 = true;
        boolean z37 = false;
        while (it6.hasNext()) {
            if (h(context, doFavoriteEvent, (com.tencent.mm.storage.f9) it6.next(), z17, i17)) {
                z37 = true;
            } else {
                z29 = false;
            }
        }
        if (z37 && c4Var.f6326l > 0) {
            c4Var.f6326l = 0;
        }
        return z29;
    }

    public static r45.ip0 j(com.tencent.mm.storage.f9 f9Var) {
        r45.ip0 ip0Var = new r45.ip0();
        if (f9Var != null) {
            if (f9Var.A0() == 0) {
                ip0Var.i(f9Var.Q0());
                ip0Var.n(c01.z1.r());
                if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
                    ip0Var.k(f9Var.j() != null ? f9Var.j().substring(0, java.lang.Math.max(0, f9Var.j().indexOf(58))) : "");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(ip0Var.f377237o) && !f9Var.g3()) {
                        f9Var.d1(f9Var.j().substring(ip0Var.f377237o.length() + 1));
                        if (f9Var.j().length() > 0 && '\n' == f9Var.j().charAt(0)) {
                            f9Var.d1(f9Var.j().substring(1));
                        }
                        if (f9Var.i2()) {
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(f9Var.W0()) && f9Var.W0().startsWith(ip0Var.f377237o)) {
                                f9Var.D1(f9Var.W0().substring(ip0Var.f377237o.length() + 1));
                            }
                            if (f9Var.W0().length() > 0 && '\n' == f9Var.W0().charAt(0)) {
                                f9Var.D1(f9Var.W0().substring(1));
                            }
                        }
                    }
                } else {
                    if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(f9Var.Q0())) {
                        ip0Var.i(f9Var.Q0());
                    }
                }
            } else {
                ip0Var.i(c01.z1.r());
                ip0Var.n(f9Var.Q0());
                if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
                    ip0Var.k(ip0Var.f377231f);
                }
            }
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String Q0 = f9Var.Q0();
            ((qv.o) u2Var).getClass();
            if (r01.z.g(Q0)) {
                java.lang.String u07 = f9Var.u0();
                if (u07 == null) {
                    u07 = c01.w9.w(f9Var.G).f37156o;
                }
                ip0Var.k(u07);
            }
            ip0Var.l(1);
            ip0Var.f377239q = f9Var.getCreateTime();
            ip0Var.f377240r = true;
            ip0Var.f377241s = f9Var.I0() + "";
            ip0Var.f377242t = true;
            if (f9Var.I0() > 0) {
                ip0Var.f377235m = f9Var.I0() + "";
                ip0Var.f377236n = true;
            }
        }
        return ip0Var;
    }

    public static java.lang.String k(r45.ip0 ip0Var) {
        return ip0Var.f377237o;
    }

    public static java.lang.String l(com.tencent.mm.storage.f9 f9Var) {
        return f9Var.A0() == 1 ? (com.tencent.mm.storage.z3.R4(f9Var.Q0()) || f9Var.Q0().equals("filehelper")) ? java.lang.String.format("%d", java.lang.Long.valueOf(f9Var.I0())) : java.lang.String.format("%s#%d", f9Var.Q0(), java.lang.Long.valueOf(f9Var.I0())) : java.lang.String.valueOf(f9Var.I0());
    }

    public static r45.gp0 m(com.tencent.mm.storage.f9 f9Var, java.lang.String str, r45.hp0 hp0Var) {
        java.lang.String str2;
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.e0(com.tencent.mm.sdk.platformtools.t8.h1());
        gp0Var.g0(l(f9Var));
        gp0Var.v0(f9Var.I0());
        gp0Var.h0(1);
        gp0Var.m0(str);
        gp0Var.z0(true);
        gp0Var.x0(true);
        gp0Var.J1 = hp0Var;
        gp0Var.k0(n(hp0Var.f376353d));
        gp0Var.l0(o(hp0Var.f376353d));
        if (com.tencent.mm.storage.z3.m4(hp0Var.f376353d.f377237o)) {
            java.lang.String a17 = t41.g.a(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(hp0Var.f376353d.f377237o, true));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                gp0Var.G0(a17);
            }
        }
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 != null && (str2 = v17.f348663h0) != null) {
            if (v17.f348666i == 24) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GetFavRecordDataSourceForRecordMsg", "getSpecDataItem, convert appContent to favDataItem as FAV_DATA_TYPE_NOTE, original appContent.type: " + v17.f348666i + ", recordInfo: " + str2);
                gp0Var.h0(21);
                gp0Var.C0(str2);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.GetFavRecordDataSourceForRecordMsg", "getSpecDataItem, convert appContent to favDataItem as FAV_DATA_TYPE_RECORD, original appContent.type: " + v17.f348666i + ", recordInfo: " + str2);
            }
        }
        return gp0Var;
    }

    public static java.lang.String n(r45.ip0 ip0Var) {
        java.lang.String str = ip0Var.f377237o;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = ip0Var.f377231f;
        }
        ((qv.c) ((rv.l2) i95.n0.c(rv.l2.class))).getClass();
        if (s01.r.n(str)) {
            ((qv.c) ((rv.l2) i95.n0.c(rv.l2.class))).getClass();
            return s01.r.l(str);
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        return c01.a2.b(str);
    }

    public static java.lang.String o(r45.ip0 ip0Var) {
        return f24215a.format(new java.util.Date(ip0Var.f377239q));
    }

    public static r45.gp0 p(com.tencent.mm.storage.f9 f9Var, ot0.q qVar, int i17) {
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.e0(com.tencent.mm.sdk.platformtools.t8.h1());
        gp0Var.g0(l(f9Var));
        gp0Var.I0(qVar.V);
        gp0Var.J0(qVar.W);
        gp0Var.K0(qVar.f348674k);
        gp0Var.x0(true);
        gp0Var.v0(f9Var.I0());
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true)));
        if (r6Var.m()) {
            gp0Var.B0(r6Var.o());
        } else {
            gp0Var.z0(true);
        }
        gp0Var.O0(qVar.f348654f);
        gp0Var.m0(qVar.f348658g);
        gp0Var.h0(i17);
        gp0Var.Z(qVar.C2);
        return gp0Var;
    }
}
