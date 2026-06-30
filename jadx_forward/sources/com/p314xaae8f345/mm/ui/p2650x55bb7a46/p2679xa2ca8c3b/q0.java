package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class q0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final yb5.d f286822d;

    /* renamed from: e, reason: collision with root package name */
    public final db5.n4 f286823e;

    /* renamed from: g, reason: collision with root package name */
    public rl5.r f286825g;

    /* renamed from: h, reason: collision with root package name */
    public wl5.v f286826h;

    /* renamed from: i, reason: collision with root package name */
    public wl5.v f286827i;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Object f286835t;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 f286837v;

    /* renamed from: m, reason: collision with root package name */
    public int f286828m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f286829n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f286830o = -1;

    /* renamed from: p, reason: collision with root package name */
    public long f286831p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f286832q = false;

    /* renamed from: r, reason: collision with root package name */
    public final yn.l f286833r = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l0(this);

    /* renamed from: s, reason: collision with root package name */
    public long f286834s = 0;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.PopupWindow.OnDismissListener f286836u = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o0(this);

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p0 f286824f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p0(this);

    public q0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, yb5.d dVar) {
        this.f286837v = a0Var;
        this.f286822d = dVar;
        this.f286823e = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.m0(this, a0Var, dVar);
    }

    public static void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 q0Var, db5.g4 g4Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        android.view.MenuItem menuItem;
        ot0.q v17;
        q0Var.getClass();
        if (g4Var instanceof db5.g4) {
            boolean n27 = f9Var.n2();
            yb5.d dVar = q0Var.f286822d;
            if (n27 && (v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()))) != null && ez.v0.f339310a.k(java.lang.Integer.valueOf(v17.f430199i))) {
                return;
            }
            boolean z17 = (g4Var.findItem(116) == null && g4Var.findItem(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd) == null) ? false : true;
            boolean z18 = g4Var.findItem(134) != null;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList arrayList = (java.util.ArrayList) g4Var.f309877d;
            java.util.Iterator it = arrayList.iterator();
            if (!z17 && !z18) {
                int y17 = g4Var.y(100);
                if (g4Var.size() != 1 || y17 == -1) {
                    g4Var.c(i17, 136, 0, dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3v), com.p314xaae8f345.mm.R.raw.f79874x420fae64);
                    return;
                } else {
                    g4Var.c(i17, 136, 0, dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3v), com.p314xaae8f345.mm.R.raw.f79874x420fae64);
                    g4Var.v((android.view.MenuItem) arrayList.remove(y17));
                    return;
                }
            }
            if (f9Var.J2() && (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(dVar.x()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(dVar.x()))) {
                g4Var.c(i17, 136, 0, dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3v), com.p314xaae8f345.mm.R.raw.f79874x420fae64);
                return;
            }
            if (f9Var.g3() && g4Var.findItem(165) != null) {
                int y18 = g4Var.y(121);
                g4Var.c(i17, 136, 0, dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3v), com.p314xaae8f345.mm.R.raw.f79874x420fae64);
                if (y18 < 0 || (menuItem = (android.view.MenuItem) arrayList.remove(g4Var.y(136))) == null) {
                    return;
                }
                arrayList.add(java.lang.Math.min(y18 + 1, arrayList.size() - 1), menuItem);
                return;
            }
            while (it.hasNext()) {
                android.view.MenuItem menuItem2 = (android.view.MenuItem) it.next();
                if (menuItem2.getItemId() == 116 && f9Var.mo78013xfb85f7b0() != 3) {
                    db5.h4 h4Var = new db5.h4(dVar.g(), 136, i17);
                    h4Var.f309901i = dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3v);
                    h4Var.setIcon(com.p314xaae8f345.mm.R.raw.f79874x420fae64);
                    linkedList.add(menuItem2);
                    linkedList.add(h4Var);
                } else if ((!z17 || f9Var.mo78013xfb85f7b0() == 3) && menuItem2.getItemId() == 134) {
                    db5.h4 h4Var2 = new db5.h4(dVar.g(), 136, i17);
                    h4Var2.f309901i = dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3v);
                    h4Var2.setIcon(com.p314xaae8f345.mm.R.raw.f79874x420fae64);
                    linkedList.add(h4Var2);
                    linkedList.add(menuItem2);
                } else {
                    linkedList.add(menuItem2);
                }
            }
            arrayList.clear();
            arrayList.addAll(linkedList);
            linkedList.clear();
        }
    }

    public static void b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 q0Var, db5.g4 g4Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        q0Var.getClass();
        if (g4Var instanceof db5.g4) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList arrayList = (java.util.ArrayList) g4Var.f309877d;
            java.util.Iterator it = arrayList.iterator();
            int size = arrayList.size();
            yb5.d dVar = q0Var.f286822d;
            if (size <= 3) {
                g4Var.c(i17, 100, 0, dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
                return;
            }
            int i18 = 0;
            while (it.hasNext()) {
                android.view.MenuItem menuItem = (android.view.MenuItem) it.next();
                if (i18 == 3) {
                    db5.h4 h4Var = new db5.h4(dVar.g(), 100, i17);
                    h4Var.f309901i = dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p);
                    h4Var.setIcon(com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
                    linkedList.add(h4Var);
                    linkedList.add(menuItem);
                } else {
                    linkedList.add(menuItem);
                }
                i18++;
            }
            arrayList.clear();
            arrayList.addAll(linkedList);
            linkedList.clear();
        }
    }

    public static void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 q0Var, db5.g4 g4Var, android.view.MenuItem menuItem, wj.t0 t0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, boolean z17) {
        java.lang.String str2;
        gm0.b bVar;
        q0Var.getClass();
        ct.k3 k3Var = (ct.k3) i95.n0.c(ct.k3.class);
        xj.m Ui = ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Ui(t0Var);
        ct.j3 j3Var = (ct.j3) i95.n0.c(ct.j3.class);
        g4Var.removeItem(menuItem.getItemId());
        if (Ui != null) {
            ((java.util.ArrayList) g4Var.f309877d).add(menuItem);
        }
        boolean z18 = Ui != null;
        q0Var.f286832q = z18;
        if (z18) {
            java.lang.String aid = Ui.f536286a;
            qg5.z2 z2Var = (qg5.z2) j3Var;
            z2Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aid, "aid");
            z2Var.f444809r = aid;
            qg5.e3 e3Var = (qg5.e3) k3Var;
            e3Var.getClass();
            gm0.m b17 = gm0.j1.b();
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = (b17 == null || (bVar = b17.f354778h) == null) ? null : bVar.f354678e;
            if (c20976x6ba6452a != null) {
                v65.i.b(c20976x6ba6452a, null, new qg5.d3(e3Var, null), 1, null);
            }
        }
        if (z17) {
            qg5.e3 e3Var2 = (qg5.e3) k3Var;
            e3Var2.getClass();
            if (f9Var != null) {
                if (str == null || str.length() == 0) {
                    return;
                }
                v05.b Zi = e3Var2.Zi(f9Var);
                int i17 = Zi.f449898d;
                ((cy1.a) e3Var2.ij()).Hj("yuanbao_menu_sum_btn", "view_exp", kz5.c1.m(e3Var2.mj(str, null), kz5.c1.k(new jz5.l("share_type", 9), new jz5.l("article_url", java.net.URLEncoder.encode(Zi.m75945x2fec8307(i17 + 9), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)), new jz5.l("yuanbao_landing_type", 2), new jz5.l("account_article_title", Zi.m75945x2fec8307(i17 + 2)))), 35480);
                return;
            }
            return;
        }
        qg5.e3 e3Var3 = (qg5.e3) k3Var;
        e3Var3.getClass();
        if (f9Var != null) {
            if (str == null || str.length() == 0) {
                return;
            }
            v05.b Zi2 = e3Var3.Zi(f9Var);
            v05.a aVar = (v05.a) Zi2.m75936x14adae67(Zi2.f513848e + 8);
            if (aVar == null || (str2 = aVar.r()) == null) {
                str2 = "";
            }
            ((cy1.a) e3Var3.ij()).Hj("yuanbao_menu_sum_btn", "view_exp", kz5.c1.m(e3Var3.mj(str, null), kz5.c1.k(new jz5.l("share_type", 10), new jz5.l("file_extension", str2), new jz5.l("yuanbao_landing_type", 2), new jz5.l("is_file_download", java.lang.Integer.valueOf(e3Var3.cj(f9Var, Zi2))), new jz5.l("file_source", java.lang.Integer.valueOf(e3Var3.bj(Zi2))))), 35480);
        }
    }

    public static void d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 q0Var, db5.g4 g4Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, boolean z17) {
        ot0.q v17;
        int i18;
        yb5.d dVar = q0Var.f286822d;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(dVar.x()) || f9Var.t2() || com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(dVar.x()) || f9Var.P0() == 5) {
            return;
        }
        if (f9Var.P0() == 1 || !(g4Var instanceof db5.g4) || f9Var.mo78013xfb85f7b0() == 318767153) {
            return;
        }
        if (f9Var.mo78013xfb85f7b0() == 49 && ((v17 = ot0.q.v(f9Var.U1())) == null || ez.v0.f339310a.j(java.lang.Integer.valueOf(v17.f430199i)) || (i18 = v17.f430199i) == 38 || i18 == 39)) {
            return;
        }
        boolean z18 = (g4Var.findItem(116) == null && g4Var.findItem(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd) == null) ? false : true;
        boolean z19 = g4Var.findItem(100) != null;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = (java.util.ArrayList) g4Var.f309877d;
        java.util.Iterator it = arrayList.iterator();
        if ((!z18 && !z19) || ((f9Var.mo78013xfb85f7b0() == 34 && !z17) || f9Var.mo78013xfb85f7b0() == 3)) {
            g4Var.c(i17, 134, 0, dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4c), com.p314xaae8f345.mm.R.raw.f79643x577cfe2a);
            return;
        }
        while (it.hasNext()) {
            android.view.MenuItem menuItem = (android.view.MenuItem) it.next();
            if (menuItem.getItemId() == 116) {
                db5.h4 h4Var = new db5.h4(dVar.g(), 134, i17);
                h4Var.f309901i = dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4c);
                h4Var.setIcon(com.p314xaae8f345.mm.R.raw.f79643x577cfe2a);
                linkedList.add(menuItem);
                linkedList.add(h4Var);
            } else if (z19 && !z18 && menuItem.getItemId() == 100) {
                db5.h4 h4Var2 = new db5.h4(dVar.g(), 134, i17);
                h4Var2.f309901i = dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4c);
                h4Var2.setIcon(com.p314xaae8f345.mm.R.raw.f79643x577cfe2a);
                linkedList.add(h4Var2);
                linkedList.add(menuItem);
            } else {
                linkedList.add(menuItem);
            }
        }
        arrayList.clear();
        arrayList.addAll(linkedList);
        linkedList.clear();
    }

    public static void e(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 q0Var, db5.g4 g4Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar) {
        jz5.l c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var;
        q0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItem", "reportOpenMenuVisible: ");
        if (g4Var.findItem(171) == null || (c17 = db0.g.f309361a.c(f9Var, true)) == null || (c12476xea20f622 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622) c17.f384366d) == null || (obj = c17.f384367e) == null || (k5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5.class)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 Ri = ((zh1.p) k5Var).Ri(c12476xea20f622);
        bi1.g gVar = (bi1.g) obj;
        gVar.toString();
        di1.f a17 = di1.g.a(3L, gVar, Ri);
        a17.d();
        if (erVar.f285437J == null) {
            erVar.f285437J = new android.os.Bundle();
        }
        erVar.f285437J.putString("key_session_id", a17.f314173l);
        erVar.f285437J.putLong("key_scene_type", a17.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r6.f68112x10a0fed7 == 199) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 r6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r7) {
        /*
            yb5.d r6 = r6.f286822d
            com.tencent.mm.storage.z3 r6 = r6.u()
            boolean r6 = r6.k2()
            r0 = 0
            if (r6 != 0) goto Lc6
            long r1 = r7.I0()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto Lc6
            int r6 = ti3.i.f501121a
            int r6 = r7.mo78013xfb85f7b0()
            r1 = 1
            switch(r6) {
                case -2130706383: goto L90;
                case -2113929167: goto L90;
                case 1: goto L9b;
                case 3: goto L9b;
                case 11: goto L9b;
                case 13: goto L9b;
                case 21: goto L9b;
                case 23: goto L9b;
                case 31: goto L9b;
                case 33: goto L9b;
                case 34: goto L9b;
                case 36: goto L9b;
                case 39: goto L9b;
                case 42: goto L9b;
                case 43: goto L9b;
                case 44: goto L9b;
                case 47: goto L9b;
                case 48: goto L9b;
                case 49: goto L74;
                case 50: goto L6a;
                case 62: goto L9b;
                case 66: goto L9b;
                case 1048625: goto L9b;
                case 16777265: goto L9b;
                case 268435505: goto L9b;
                case 301989937: goto L9b;
                case 419430449: goto L9b;
                case 436207665: goto L9b;
                case 754974769: goto L9b;
                case 771751985: goto L9b;
                case 805306417: goto L9b;
                case 822083633: goto L9b;
                case 855638065: goto L9b;
                case 939524145: goto L9b;
                case 973078577: goto L9b;
                case 974127153: goto L9b;
                case 975175729: goto L9b;
                case 976224305: goto L9b;
                case 978321457: goto L9b;
                case 979370033: goto L9b;
                case 1040187441: goto L9b;
                case 1090519089: goto L23;
                case 1107296305: goto L9b;
                case 1157627953: goto L9b;
                case 1174405169: goto L9b;
                case 1224736817: goto L9b;
                case 1241514033: goto L9b;
                case 1409286193: goto L9b;
                case 1426063409: goto L9b;
                case 1442840625: goto L9b;
                case 1476395057: goto L9b;
                default: goto L21;
            }
        L21:
            goto L9d
        L23:
            int r6 = r7.Z1()
            if (r6 == 0) goto L2b
            goto L9b
        L2b:
            java.lang.Class<lt.q0> r6 = lt.q0.class
            i95.m r6 = i95.n0.c(r6)
            lt.q0 r6 = (lt.q0) r6
            kt.q0 r6 = (kt.q0) r6
            lt.g0 r6 = r6.wi()
            long r2 = r7.m124847x74d37ac6()
            java.lang.String r4 = r7.Q0()
            com.tencent.mm.pluginsdk.model.app.e r6 = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) r6
            com.tencent.mm.pluginsdk.model.app.d r6 = r6.J0(r2, r4)
            if (r6 == 0) goto L52
            long r2 = r6.f68112x10a0fed7
            r4 = 199(0xc7, double:9.83E-322)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L9d
            goto L9b
        L52:
            java.lang.Class<ct.w2> r6 = ct.w2.class
            i95.m r6 = i95.n0.c(r6)
            ct.w2 r6 = (ct.w2) r6
            com.tencent.mm.pluginsdk.model.app.d3 r6 = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d3) r6
            r6.getClass()
            ez.v0 r6 = ez.v0.f339310a
            java.lang.String r2 = r7.j()
            boolean r6 = r6.d(r2)
            goto L9e
        L6a:
            java.lang.String r6 = r7.j()
            boolean r6 = ip.l.f(r6)
            r6 = r6 ^ r1
            goto L9e
        L74:
            java.lang.String r6 = r7.j()
            ot0.q r6 = ot0.q.v(r6)
            if (r6 == 0) goto L9d
            int r6 = r6.f430199i
            r2 = 3
            if (r6 == r2) goto L9b
            r2 = 4
            if (r6 == r2) goto L9b
            r2 = 5
            if (r6 == r2) goto L9b
            r2 = 6
            if (r6 == r2) goto L9b
            switch(r6) {
                case 1: goto L9b;
                case 19: goto L9b;
                case 24: goto L9b;
                case 33: goto L9b;
                case 36: goto L9b;
                case 44: goto L9b;
                case 48: goto L9b;
                case 53: goto L9b;
                case 68: goto L9b;
                case 130: goto L9b;
                case 132: goto L9b;
                default: goto L8f;
            }
        L8f:
            goto L9d
        L90:
            java.lang.Class<c00.e3> r6 = c00.e3.class
            i95.m r6 = i95.n0.c(r6)
            c00.e3 r6 = (c00.e3) r6
            r6.getClass()
        L9b:
            r6 = r1
            goto L9e
        L9d:
            r6 = r0
        L9e:
            if (r6 == 0) goto Lc6
            int r6 = r7.mo78013xfb85f7b0()
            r2 = 47
            if (r6 != r2) goto Lc5
            java.lang.Class<k12.s> r6 = k12.s.class
            i95.m r6 = i95.n0.c(r6)
            k12.s r6 = (k12.s) r6
            g30.h r6 = (g30.h) r6
            s25.a r6 = r6.wi()
            y12.h r6 = (y12.h) r6
            com.tencent.mm.storage.emotion.EmojiInfo r6 = r6.M(r7)
            if (r6 == 0) goto Lc5
            boolean r6 = r6.I1()
            if (r6 == 0) goto Lc5
            goto Lc6
        Lc5:
            r0 = r1
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0.f(com.tencent.mm.ui.chatting.viewitems.q0, com.tencent.mm.storage.f9):boolean");
    }

    public void g(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if (erVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItem", "open menu but tag is null");
            return;
        }
        this.f286824f.f286758d = erVar;
        rl5.r rVar = this.f286825g;
        if (rVar != null) {
            rVar.a();
            this.f286825g = null;
        }
        yb5.d dVar = this.f286822d;
        rl5.r rVar2 = new rl5.r(dVar.g());
        this.f286825g = rVar2;
        rVar2.C = true;
        rVar2.I = true;
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.nwp);
        this.f286835t = tag;
        if ((tag instanceof java.lang.Boolean) && ((java.lang.Boolean) tag).booleanValue()) {
            if (la5.b.f399133a.g(true)) {
                rl5.r rVar3 = this.f286825g;
                rVar3.Z = true;
                rVar3.Q = true;
            } else {
                rl5.r rVar4 = this.f286825g;
                rVar4.Z = false;
                rVar4.Q = false;
            }
            this.f286825g.f478879p0 = true;
        }
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.f286836u;
        if (onDismissListener instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o0) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o0) onDismissListener).f286489d = erVar;
        }
        this.f286825g.L = onDismissListener;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItem", "openContextMenu[%s] left:%s, top:%s, width:%s, height:%s", com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4968x823b57dd.f21368x4fbc8495.m42859xfb82e301(view.getId()) + "@" + view.hashCode(), java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(view.getWidth()), java.lang.Integer.valueOf(view.getHeight()));
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17 = erVar.c();
        if (c17.T2() || c17.q2() || c17.b3()) {
            java.lang.String j17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(c17.Q0()) ? c17.A0() == 1 ? c17.j() : c01.w9.r(c17.j()) : c17.j();
            if (c17.q2() || c17.T2()) {
                ot0.q v17 = ot0.q.v(j17);
                j17 = v17 != null ? v17.f430187f : "";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
                return;
            }
            rq1.k0 Bi = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Bi(j17);
            java.lang.String str = Bi != null ? Bi.f480284a : null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f286825g.Y = null;
            } else {
                rl5.r rVar5 = this.f286825g;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var = this.f286837v;
                a0Var.getClass();
                rVar5.Y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b0(a0Var, dVar, str);
            }
            this.f286837v.E(this.f286822d, c17, 1, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str), j17, false, "65_" + c01.id.c(), 3, Bi);
        }
        int width = iArr[0] + ((int) (view.getWidth() / 2.0f));
        int i17 = iArr[1];
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItem", "openContextMenu posX:%s, posY:%s", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(i17));
        rl5.r rVar6 = this.f286825g;
        rVar6.f478885v = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.n0(this, c17);
        rVar6.f(view, this.f286823e, this.f286824f, width, i17);
        dVar.P(false);
        dVar.V(false);
        dVar.f542261w = false;
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(4);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItem$LongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        g(view);
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItem$LongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
