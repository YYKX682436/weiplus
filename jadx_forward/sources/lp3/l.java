package lp3;

@j95.b
/* loaded from: classes5.dex */
public class l extends i95.w implements mp3.j, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f401824g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_send_pat_frequency_limit_interval, 10000);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f401825h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final int f401826i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_pat_send_pat_msg_delay_interval, 5000);

    /* renamed from: m, reason: collision with root package name */
    public static final int f401827m = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_pat_avatar_revoke_pat_msg_interval, 10000);

    /* renamed from: e, reason: collision with root package name */
    public op3.c f401829e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f401828d = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f401830f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper(), new lp3.i(this));

    public static void Ni(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6857x603256ba c6857x603256ba) {
        if (c6857x603256ba != null) {
            java.lang.String str = c6857x603256ba.f141752f;
            java.lang.String str2 = c6857x603256ba.f141753g;
            c6857x603256ba.f141764r = c6857x603256ba.b("FromStatusID", ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Vi(str), true);
            c6857x603256ba.f141765s = c6857x603256ba.b("ToStatusID", ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Vi(str2), true);
            c6857x603256ba.f141766t = c6857x603256ba.b("FromStatusIcon", ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ui(str), true);
            c6857x603256ba.f141767u = c6857x603256ba.b("ToStatusIcon", ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ui(str2), true);
        }
    }

    public boolean Ai(long j17, long j18, java.lang.String str) {
        r45.l55 l55Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "delete svr pat msg (%d,%d)", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
        if (Li.m124847x74d37ac6() != j17 || j18 == 0) {
            return false;
        }
        r45.k55 e17 = bm5.d1.e(Li.j());
        java.util.LinkedList linkedList = e17.f459919e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "pat record list size %d", java.lang.Integer.valueOf(linkedList.size()));
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                l55Var = null;
                break;
            }
            l55Var = (r45.l55) it.next();
            if (l55Var.f460690i == j18) {
                break;
            }
        }
        if (l55Var == null) {
            return false;
        }
        linkedList.remove(l55Var);
        if (linkedList.isEmpty()) {
            pt0.f0.P7(Li.Q0(), Li.m124847x74d37ac6());
        } else {
            Li.d1(mj(e17));
            Li.m124850x7650bebc(922746929);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, Li, true);
        }
        return true;
    }

    public void Bi(java.lang.String str, long j17) {
        long j18;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "do revoke svr pat msg %d from talker %s", java.lang.Long.valueOf(j17), str);
        r45.m55 Bi = ((lp3.r) i95.n0.c(lp3.r.class)).Bi(j17);
        if (Bi == null || (o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str, (j18 = Bi.f461688d))) == null || o27.I0() != j18) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "revoke pat msg %d,%d", java.lang.Long.valueOf(o27.m124847x74d37ac6()), java.lang.Long.valueOf(j17));
        Ai(o27.m124847x74d37ac6(), j17, str);
    }

    public void Di(android.util.Pair pair, int i17, java.lang.String str) {
        r45.k55 e17;
        r45.l55 Ui;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "do revoke local pat msg (%d,%d), talker:%s", pair.first, pair.second, str);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, ((java.lang.Long) pair.first).longValue());
        if (Li.m124847x74d37ac6() != ((java.lang.Long) pair.first).longValue() || (Ui = Ui((e17 = bm5.d1.e(Li.j())), ((java.lang.Long) pair.second).longValue())) == null) {
            return;
        }
        long j17 = Ui.f460690i;
        if (j17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "do revoke sent pat msg %d, svrId %d", pair.first, java.lang.Long.valueOf(j17));
            op3.a aVar = new op3.a(aj(pair), ((java.lang.Long) pair.first).longValue(), Ui.f460690i, Ui.f460688g, e17.f459918d);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6833x9828a7c c6833x9828a7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6833x9828a7c();
            op3.c cVar = this.f401829e;
            if (cVar != null && cVar.f428791e.equals(pair)) {
                c6833x9828a7c.f141545d = this.f401829e.f428788b;
            }
            c6833x9828a7c.f141546e = Ui.f460688g;
            c6833x9828a7c.f141547f = java.lang.System.currentTimeMillis();
            c6833x9828a7c.f141548g = c6833x9828a7c.b("UserName", Ui.f460685d, true);
            c6833x9828a7c.f141549h = c6833x9828a7c.b("PattedUserName", Ui.f460686e, true);
            c6833x9828a7c.f141550i = c6833x9828a7c.b("PatSuffix", lp3.p.a(Ui.f460686e), true);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(e17.f459918d)) {
                c6833x9828a7c.f141551j = c6833x9828a7c.b("ChatRoomName", e17.f459918d, true);
            }
            c6833x9828a7c.f141552k = i17;
            c6833x9828a7c.f141554m = 1;
            aVar.f428779f = c6833x9828a7c;
            gm0.j1.d().g(aVar);
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_FIRST_REVOKE_BOOLEAN_SYNC;
            if (c17.o(u3Var, true)) {
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
                ((ku5.t0) ku5.t0.f394148d).g(new lp3.k(this, e17));
                return;
            }
            return;
        }
        op3.c cVar2 = this.f401829e;
        if (cVar2 == null || !cVar2.f428791e.equals(pair)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "do revoke unsent pat msg (%d,%d)", pair.first, pair.second);
        this.f401830f.mo50304x856b99f0(291, this.f401829e);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6857x603256ba c6857x603256ba = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6857x603256ba();
        op3.c cVar3 = this.f401829e;
        c6857x603256ba.f141750d = cVar3.f428788b;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(cVar3.f428789c)) {
            c6857x603256ba.f141754h = c6857x603256ba.b("ChatroomName", this.f401829e.f428789c, true);
        }
        c6857x603256ba.f141756j = ((java.lang.Long) pair.second).longValue() - ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Ri(e17.f459918d, pair);
        c6857x603256ba.f141758l = hj(this.f401829e.f428789c, pair) ? 1 : 0;
        c6857x603256ba.f141759m = Vi(e17, ((java.lang.Long) pair.second).longValue()) + 1;
        c6857x603256ba.f141752f = c6857x603256ba.b("Username", c01.z1.r(), true);
        c6857x603256ba.f141753g = c6857x603256ba.b("PattedUserName", this.f401829e.f428790d, true);
        op3.c cVar4 = this.f401829e;
        c6857x603256ba.f141751e = cVar4.f428787a;
        c6857x603256ba.f141760n = c6857x603256ba.b("PatSuffix", lp3.p.a(cVar4.f428790d), true);
        c6857x603256ba.f141761o = 1;
        c6857x603256ba.f141762p = i17;
        c6857x603256ba.f141763q = this.f401829e.f428792f ? 1 : 0;
        Ni(c6857x603256ba);
        c6857x603256ba.k();
        c6857x603256ba.o();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "delete unsent pat msg (%d,%d)", pair.first, pair.second);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li2 = pt0.f0.Li(str, ((java.lang.Long) pair.first).longValue());
        if (Li2.m124847x74d37ac6() == ((java.lang.Long) pair.first).longValue()) {
            r45.k55 e18 = bm5.d1.e(Li2.j());
            java.util.LinkedList linkedList = e18.f459919e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "before delete, pat record list size %d", java.lang.Integer.valueOf(linkedList.size()));
            r45.l55 Ui2 = Ui(e18, ((java.lang.Long) pair.second).longValue());
            if (Ui2 != null) {
                linkedList.remove(Ui2);
                if (linkedList.isEmpty()) {
                    pt0.f0.P7(Li2.Q0(), Li2.m124847x74d37ac6());
                    return;
                }
                Li2.d1(mj(e18));
                Li2.m124850x7650bebc(922746929);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(((java.lang.Long) pair.first).longValue(), Li2, true);
            }
        }
    }

    public long Ri(java.lang.String str, android.util.Pair pair) {
        java.util.List z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().z1(str, ((java.lang.Long) pair.second).longValue(), 1);
        if (z17 != null && !z17.isEmpty() && ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) z17.get(0)).m124847x74d37ac6() > 0) {
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.f9) z17.get(0)).mo78013xfb85f7b0() != 922746929) {
                return ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) z17.get(0)).mo78012x3fdd41df();
            }
            r45.k55 e17 = bm5.d1.e(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) z17.get(0)).j());
            java.util.LinkedList linkedList = e17.f459919e;
            if (linkedList.size() == 0) {
                return 0L;
            }
            if (((java.lang.Long) pair.first).longValue() != ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) z17.get(0)).m124847x74d37ac6()) {
                return ((r45.l55) linkedList.getLast()).f460688g;
            }
            int Vi = Vi(e17, ((java.lang.Long) pair.second).longValue());
            if (Vi > 1) {
                return ((r45.l55) linkedList.get(Vi - 1)).f460688g;
            }
        }
        return 0L;
    }

    public r45.l55 Ui(r45.k55 k55Var, long j17) {
        java.util.Iterator it = k55Var.f459919e.iterator();
        while (it.hasNext()) {
            r45.l55 l55Var = (r45.l55) it.next();
            if (l55Var.f460688g == j17) {
                return l55Var;
            }
        }
        return null;
    }

    public int Vi(r45.k55 k55Var, long j17) {
        int i17 = -1;
        for (int i18 = 0; i18 < k55Var.f459919e.size(); i18++) {
            if (((r45.l55) k55Var.f459919e.get(i18)).f460688g == j17) {
                i17 = i18;
            }
        }
        return i17;
    }

    public final java.lang.String Zi(int i17) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(i17).replaceAll("\\[", "{").replaceAll("]", "}");
    }

    public java.lang.String aj(android.util.Pair pair) {
        return c01.z1.r() + "_" + pair.first + "_" + pair.second;
    }

    public java.lang.CharSequence bj(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, int i18) {
        ot0.q v17;
        r45.k55 k55Var = new r45.k55();
        if (i17 == 889192497) {
            ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).getClass();
            k55Var = bm5.d1.e(str);
        } else if (i17 == 922746929 && (v17 = ot0.q.v(str)) != null) {
            k55Var = ((mp3.a) v17.y(mp3.a.class)).f411983b;
        }
        try {
            if (k55Var.f459919e.size() > 0) {
                r45.l55 l55Var = (r45.l55) k55Var.f459919e.getLast();
                mp3.p Ri = ((lp3.r) i95.n0.c(lp3.r.class)).Ri(l55Var, str2);
                android.text.SpannableString spannableString = new android.text.SpannableString(Ri.f411993a);
                java.util.List<mp3.o> list = Ri.f411996d;
                if (((java.util.LinkedList) list).size() > 0) {
                    for (mp3.o oVar : list) {
                        spannableString.setSpan(((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Zi(null, oVar.f411992c, bi4.c.PATMSG_NO_BG, i18), oVar.f411990a, oVar.f411991b, 17);
                    }
                }
                java.lang.String r17 = c01.z1.r();
                if (!l55Var.f460685d.equals(r17) && l55Var.f460686e.equals(r17) && l55Var.f460689h == 0) {
                    java.util.List list2 = Ri.f411994b;
                    if (!((java.util.ArrayList) list2).isEmpty()) {
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2645x35f74a.C21582xa2132865 c21582xa2132865 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2645x35f74a.C21582xa2132865(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574215hg1);
                        int indexOf = Ri.f411993a.indexOf(string, ((java.lang.Integer) ((android.util.Pair) ((java.util.ArrayList) list2).get(0)).second).intValue());
                        int length = string.length() + indexOf;
                        if (length > spannableString.length()) {
                            length = spannableString.length();
                        }
                        spannableString.setSpan(c21582xa2132865, indexOf, length, 17);
                    }
                }
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, spannableString, i18);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PatMsgExtension", e17, "", new java.lang.Object[0]);
        }
        return "";
    }

    public java.lang.String cj(java.lang.String str, java.lang.String str2) {
        int i17;
        java.lang.String r17 = c01.z1.r();
        try {
            i17 = ((java.lang.Integer) lp3.p.b(str, "pat_user_suffix_version")).intValue();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PatUserMMKV", e17, "", new java.lang.Object[0]);
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "pattedUser %s, version %d", str, java.lang.Integer.valueOf(i17));
        if (str.equals(r17)) {
            java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_STRING_SYNC, null);
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? Zi(com.p314xaae8f345.mm.R.C30867xcad56011.ii6) : i17 == 0 ? java.lang.String.format(Zi(com.p314xaae8f345.mm.R.C30867xcad56011.ii8), str3) : java.lang.String.format(Zi(com.p314xaae8f345.mm.R.C30867xcad56011.ii7), str3);
        }
        java.lang.String a17 = lp3.p.a(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "pattedUser %s, suffix %s", str, a17);
        java.lang.String u17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2) ? c01.e2.u(str2, str, true) : c01.a2.e(str);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) ? java.lang.String.format(Zi(com.p314xaae8f345.mm.R.C30867xcad56011.ii9), u17) : i17 == 0 ? java.lang.String.format(Zi(com.p314xaae8f345.mm.R.C30867xcad56011.iia), u17, a17) : java.lang.String.format(Zi(com.p314xaae8f345.mm.R.C30867xcad56011.ii_), u17, a17);
    }

    public android.util.Pair fj(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, long j17) {
        java.lang.String str5;
        r45.k55 k55Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57;
        long j18;
        boolean z17;
        int i18;
        java.lang.String str6 = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str2, str6, str3)) {
            return android.util.Pair.create(0L, 0L);
        }
        if (str6.equals(c01.z1.r())) {
            str6 = str2;
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str6) || ((com.p314xaae8f345.mm.p2621x8fb0427b.d3) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi()).n(str6) || (q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(str6)) == null || q57.m124847x74d37ac6() <= 0 || q57.mo78013xfb85f7b0() != 922746929) {
            long m17 = c01.w9.m(str6, i17);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            r45.k55 k55Var2 = new r45.k55();
            k55Var2.f459918d = str6;
            r45.l55 l55Var = new r45.l55();
            l55Var.f460687f = str4;
            l55Var.f460688g = m17;
            l55Var.f460685d = str2;
            l55Var.f460686e = str3;
            l55Var.f460690i = j17;
            java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_STRING_SYNC, "");
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_MODIFY_TIP_TIMESTAMP_LONG;
            long t17 = c17.t(u3Var, 0L);
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_MODIFY_TIP_COUNT_INT;
            int r17 = c18.r(u3Var2, 0);
            if (!str3.equals(c01.z1.r()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17)) {
                str5 = "";
                k55Var = k55Var2;
            } else {
                str5 = "";
                if (c01.id.c() - t17 > ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_pat_suffix_modify_tip_time_interval, 86400L) * 1000) {
                    if (r17 < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_pat_suffix_modify_tip_max_count, Integer.MAX_VALUE)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "show modify tip %s %s %s %s %s", java.lang.Long.valueOf(j17), str2, java.lang.Long.valueOf(t17), java.lang.Integer.valueOf(r17), v17);
                        l55Var.f460691m = 1;
                        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(c01.id.c()));
                        gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(r17 + 1));
                    }
                }
                k55Var = k55Var2;
            }
            k55Var.f459919e.add(l55Var);
            ot0.q qVar = new ot0.q();
            mp3.a aVar = new mp3.a();
            aVar.f411983b = k55Var;
            qVar.f(aVar);
            qVar.f430199i = 62;
            qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
            qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
            f9Var.d1(ot0.q.u(qVar, str5, null));
            f9Var.j1(0);
            f9Var.u1(str6);
            f9Var.o1(j17);
            f9Var.e1(m17);
            f9Var.m124850x7650bebc(922746929);
            ((lp3.r) i95.n0.c(lp3.r.class)).wi(f9Var.I0(), l55Var);
            long x17 = c01.w9.x(f9Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "insert pat msg %d %s %s", java.lang.Long.valueOf(x17), java.lang.Integer.toHexString(f9Var.mo78013xfb85f7b0()), java.lang.Integer.toHexString(922746929));
            return android.util.Pair.create(java.lang.Long.valueOf(x17), java.lang.Long.valueOf(m17));
        }
        long j19 = i17 * 1000;
        if (j19 <= q57.mo78012x3fdd41df()) {
            j19 = q57.mo78012x3fdd41df() + 1;
        }
        r45.l55 l55Var2 = new r45.l55();
        l55Var2.f460687f = str4;
        l55Var2.f460688g = j19;
        l55Var2.f460685d = str2;
        l55Var2.f460686e = str3;
        l55Var2.f460690i = j17;
        r45.k55 e17 = bm5.d1.e(q57.j());
        e17.f459918d = q57.Q0();
        java.util.LinkedList linkedList = e17.f459919e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "All svrIds in recordList:");
        for (java.util.Iterator it = linkedList.iterator(); it.hasNext(); it = it) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "svrId: " + ((r45.l55) it.next()).f460690i);
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                j18 = j19;
                z17 = true;
                break;
            }
            long j27 = ((r45.l55) it6.next()).f460690i;
            j18 = j19;
            long j28 = l55Var2.f460690i;
            if (j27 == j28 && j27 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "checkPatSvrId failed, svrId %d already exists", java.lang.Long.valueOf(j28));
                z17 = false;
                break;
            }
            j19 = j18;
        }
        if (z17) {
            linkedList.add(l55Var2);
        }
        ot0.q qVar2 = new ot0.q();
        mp3.a aVar2 = new mp3.a();
        aVar2.f411983b = e17;
        qVar2.f(aVar2);
        qVar2.f430199i = 62;
        qVar2.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar2.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        q57.d1(ot0.q.u(qVar2, "", null));
        long m124847x74d37ac6 = q57.m124847x74d37ac6();
        if (m124847x74d37ac6 != 0) {
            i18 = 1;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(m124847x74d37ac6, q57, true);
        } else {
            i18 = 1;
        }
        ((lp3.r) i95.n0.c(lp3.r.class)).wi(q57.I0(), l55Var2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "update pat msg %d, index %d", java.lang.Long.valueOf(m124847x74d37ac6), java.lang.Integer.valueOf(linkedList.size() - i18));
        return android.util.Pair.create(java.lang.Long.valueOf(m124847x74d37ac6), java.lang.Long.valueOf(j18));
    }

    public final boolean hj(java.lang.String str, android.util.Pair pair) {
        return ((java.lang.Long) pair.second).longValue() <= ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().w3(str);
    }

    public boolean ij(long j17, java.lang.String str) {
        java.util.Set set = this.f401828d;
        if (((java.util.HashSet) set).contains(java.lang.Long.valueOf(j17))) {
            return true;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
        if (Li.m124847x74d37ac6() > 0) {
            java.util.Iterator it = bm5.d1.e(Li.j()).f459919e.iterator();
            boolean z17 = true;
            while (it.hasNext()) {
                z17 &= ((r45.l55) it.next()).f460689h == 1;
            }
            if (z17) {
                ((java.util.HashSet) set).add(java.lang.Long.valueOf(j17));
                return true;
            }
        }
        return false;
    }

    public java.lang.String mj(r45.k55 k55Var) {
        ot0.q qVar = new ot0.q();
        mp3.a aVar = new mp3.a();
        aVar.f411983b = k55Var;
        qVar.f(aVar);
        qVar.f430199i = 62;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        return ot0.q.u(qVar, null, null);
    }

    public r45.k55 nj(java.lang.String str) {
        return bm5.d1.e(str);
    }

    public java.util.List oj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null || f9Var.mo78013xfb85f7b0() != 922746929) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.k55 e17 = bm5.d1.e(f9Var.j());
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Long.valueOf(f9Var.m124847x74d37ac6());
        java.util.LinkedList linkedList = e17.f459919e;
        objArr[1] = java.lang.Integer.valueOf(linkedList == null ? 0 : linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "split pat msg [%d] to %d child msg", objArr);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.l55 l55Var = (r45.l55) it.next();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            r45.k55 k55Var = new r45.k55();
            k55Var.f459918d = e17.f459918d;
            bm5.c1 c1Var = new bm5.c1();
            c1Var.f460687f = l55Var.f460687f;
            c1Var.f104089o = l55Var.f460687f;
            c1Var.f460688g = l55Var.f460688g;
            c1Var.f460685d = l55Var.f460685d;
            c1Var.f460686e = l55Var.f460686e;
            c1Var.f460690i = l55Var.f460690i;
            k55Var.f459919e.add(c1Var);
            ot0.q qVar = new ot0.q();
            mp3.a aVar = new mp3.a();
            aVar.f411983b = k55Var;
            qVar.f(aVar);
            qVar.f430199i = 62;
            qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
            qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
            f9Var2.d1(ot0.q.u(qVar, "", null));
            f9Var2.m124850x7650bebc(922746929);
            f9Var2.j1(0);
            f9Var2.u1(f9Var.Q0());
            f9Var2.o1(l55Var.f460690i);
            f9Var2.e1(l55Var.f460688g);
            arrayList.add(f9Var2);
        }
        return arrayList;
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        gm0.j1.d().a(849, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.k55 e17;
        r45.l55 Ui;
        r45.k55 e18;
        r45.l55 Ui2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        op3.b bVar = (op3.b) m1Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6857x603256ba c6857x603256ba = bVar.f428786g;
        if (c6857x603256ba != null) {
            c6857x603256ba.f141755i = i18;
        }
        int i19 = ((r45.kz5) bVar.f428783d.f152243a.f152217a).f460580h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "onSceneEnd, pat scene %d", java.lang.Integer.valueOf(i19));
        if (i17 == 0 && i18 == 0) {
            android.util.Pair pair = bVar.f428785f;
            com.p314xaae8f345.mm.p944x882e457a.o oVar = bVar.f428783d;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
            java.lang.String str2 = ((r45.kz5) fVar).f460577e;
            java.lang.String str3 = ((r45.kz5) fVar).f460578f;
            if (i19 == 1) {
                java.lang.String str4 = ((r45.lz5) oVar.f152244b.f152233a).f461543e;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str5 = str4 == null ? "" : str4;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    try {
                        lp3.p.c(str3, "pat_user_suffix_content", str5);
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PatUserMMKV", e19, "", new java.lang.Object[0]);
                    }
                    if (((java.lang.Long) pair.first).longValue() > 0) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str2, ((java.lang.Long) pair.first).longValue());
                        if (Li.m124847x74d37ac6() == ((java.lang.Long) pair.first).longValue() && (Ui2 = Ui((e18 = bm5.d1.e(Li.j())), ((java.lang.Long) pair.second).longValue())) != null) {
                            if (str3.equalsIgnoreCase(Ui2.f460686e)) {
                                Ui2.f460687f = cj(str3, ((r45.kz5) bVar.f428783d.f152243a.f152217a).f460577e);
                                Li.d1(mj(e18));
                                Li.m124850x7650bebc(922746929);
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(((java.lang.Long) pair.first).longValue(), Li, true);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "update pat msg suffix %d, createTime %d", pair.first, pair.second);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PatMsgExtension", "update pat msg suffix %d, pattedUser (%s,%s) not match", pair.first, str3, Ui2.f460686e);
                            }
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_STRING_SYNC, null))) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_INTRO_BOOLEAN_SYNC;
                            if (c17.o(u3Var, true)) {
                                gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
                                java.lang.String Q0 = Li.Q0();
                                java.lang.String format = java.lang.String.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574219hg5), "<_wc_custom_link_ href='weixin://jump/setpat/'>", "</_wc_custom_link_>");
                                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                                f9Var.j1(0);
                                f9Var.u1(Q0);
                                f9Var.r1(3);
                                f9Var.d1(format);
                                f9Var.e1(c01.w9.m(Q0, java.lang.System.currentTimeMillis() / 1000));
                                f9Var.m124850x7650bebc(10000);
                                f9Var.f1(f9Var.w0());
                                c01.w9.x(f9Var);
                                op3.c cVar = this.f401829e;
                                if (cVar != null) {
                                    cVar.f428792f = true;
                                }
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5831x9e79ac7a c5831x9e79ac7a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5831x9e79ac7a();
                    c5831x9e79ac7a.f136138g.getClass();
                    c5831x9e79ac7a.f136138g.getClass();
                    c5831x9e79ac7a.f136138g.getClass();
                    c5831x9e79ac7a.e();
                }
            } else {
                java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(((r45.lz5) oVar.f152244b.f152233a).f461542d, "sysmsg", null);
                int D1 = d17 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".sysmsg.pat.patsuffixversion"), 0) : 0;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = lp3.p.f401835a;
                try {
                    lp3.p.c(str3, "pat_user_suffix_version", java.lang.Integer.valueOf(D1));
                } catch (org.json.JSONException e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PatUserMMKV", e27, "", new java.lang.Object[0]);
                }
                long j17 = ((r45.lz5) bVar.f428783d.f152244b.f152233a).f461544f;
                if (j17 != 0 && ((java.lang.Long) pair.first).longValue() > 0) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li2 = pt0.f0.Li(str2, ((java.lang.Long) pair.first).longValue());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "update pat msg %d, svrId %d", pair.first, java.lang.Long.valueOf(j17));
                    if (Li2.m124847x74d37ac6() == ((java.lang.Long) pair.first).longValue() && (Ui = Ui((e17 = bm5.d1.e(Li2.j())), ((java.lang.Long) pair.second).longValue())) != null) {
                        if (str3.equalsIgnoreCase(Ui.f460686e)) {
                            Ui.f460690i = j17;
                            if (Li2.I0() == 0) {
                                Li2.o1(j17);
                            }
                            Li2.d1(mj(e17));
                            Li2.m124850x7650bebc(922746929);
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(((java.lang.Long) pair.first).longValue(), Li2, true);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "update pat msg svrId %d, createTime %d", pair.first, pair.second);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PatMsgExtension", "update pat msg svrId %d, pattedUser (%s,%s) not match", pair.first, str3, Ui.f460686e);
                        }
                    }
                }
            }
        } else {
            if (i19 == 1) {
                return;
            }
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571924to) + "(" + i17 + "," + i18 + ")", 0).show();
            java.lang.String str6 = ((r45.kz5) bVar.f428783d.f152243a.f152217a).f460577e;
            if (i18 != -22 && i18 != -44) {
                ((ku5.t0) ku5.t0.f394148d).g(new lp3.j(this, str6));
            }
        }
        if (c6857x603256ba != null) {
            Ni(c6857x603256ba);
            c6857x603256ba.k();
            c6857x603256ba.o();
        }
    }

    public boolean wi(int i17, java.lang.String str, java.lang.String str2) {
        java.util.List m17;
        if ((!com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.Q4(str)) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.y4(str) || c01.e2.U(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R3(str) || c01.e2.G(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "cannot pat, talker %s", str);
            return false;
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.Q4(str2) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.y4(str2) || c01.e2.U(str2) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R3(str2) || c01.e2.G(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "cannot pat, user %s", str2);
            return false;
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str) || (m17 = c01.v1.m(str)) == null || ((java.util.LinkedList) m17).contains(str2)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PatMsgExtension", "chatroom %s members %s, not contain %s", str, m17, str2);
        return false;
    }
}
