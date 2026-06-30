package dk2;

/* loaded from: classes3.dex */
public final class xa {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.xa f315877a = new dk2.xa();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f315878b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f315879c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f315880d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f315881e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f315882f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f315883g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f315884h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f315885i;

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f315886j;

    static {
        ae2.in inVar = ae2.in.f85221a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMsgManager", "saveMyselfCommentValue:" + ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.S1).mo141623x754a37bb()).r()).intValue());
        f315878b = "LAW_MSG_CLIENT_ID";
        f315879c = "WELCOME_MSG_CLIENT_ID";
        f315880d = "BIZ_MSG_CLIENT_ID";
        f315881e = "LOC_MSG_CLIENT_ID";
        f315882f = "GAME_JUMP_MSG_CLIENT_ID";
        f315883g = "MIC_SYS_MSG_ID";
        f315884h = "HIGHLIGHT_COMMENT_MSG_CLIENT_ID";
        f315885i = new java.lang.String[]{"WELCOME_MSG_CLIENT_ID", "BIZ_MSG_CLIENT_ID", "LOC_MSG_CLIENT_ID", "GAME_JUMP_MSG_CLIENT_ID", "MIC_SYS_MSG_ID", "BEAUTY_SYS_MSG_ID", "HIGHLIGHT_COMMENT_MSG_CLIENT_ID"};
        f315886j = new int[]{1, 10007, 10008, 100000, 100004, 10006, 20001, 20002, 20013, 20014, 100001, 20019, 20020, 20031, 20035, 20031, 20032, 20034, 1000066, 20090, 20091, 20098, 20125, 20078, 20122};
    }

    public final void a(gk2.e eVar, int i17, java.lang.String str) {
        if (eVar != null) {
            java.lang.String string = i17 == 1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d47, str) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d5b, str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            r45.t12 t12Var = new r45.t12();
            t12Var.set(3, 100001);
            t12Var.set(2, string);
            dk2.u uVar = new dk2.u(t12Var);
            uVar.f315670b = i17;
            uVar.f315671c = str;
            ((mm2.x4) eVar.a(mm2.x4.class)).f411061f.add(uVar);
        }
    }

    public final void b(gk2.e eVar, android.content.Intent intent) {
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (eVar == null || intent == null || !intent.getBooleanExtra("key_insert_highlight_comment", false)) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("key_highlight_comment_txt");
        intent.removeExtra("key_insert_highlight_comment");
        intent.removeExtra("key_highlight_comment_txt");
        if (stringExtra == null || stringExtra.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMsgManager", "appendHighlightCommentTip skip, content empty.");
            return;
        }
        mm2.x4 x4Var = (mm2.x4) eVar.a(mm2.x4.class);
        java.util.List list = x4Var.f411061f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-msgList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else {
                    if (((dk2.zf) it.next()).mo124533xfb85f7b0() == 100004) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        if (i17 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMsgManager", "appendHighlightCommentTip skip, already inserted.");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) eVar.a(mm2.c1.class)).f410379n;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725 != null ? c19792x256d2725.m76760x76845fea() : null;
        r45.t12 t12Var = new r45.t12();
        r45.xn1 xn1Var = new r45.xn1();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
        if (m76760x76845fea == null || (str = m76760x76845fea.m76197x6c03c64c()) == null) {
            str = "";
        }
        c19782x23db1cfa.m76240x66bc2758(str);
        if (m76760x76845fea == null || (str2 = m76760x76845fea.m76184x8010e5e4()) == null) {
            str2 = "";
        }
        c19782x23db1cfa.m76227x7ac946f0(str2);
        if (m76760x76845fea == null || (str3 = m76760x76845fea.m76175x6d346f39()) == null) {
            str3 = "";
        }
        c19782x23db1cfa.m76218xe0a5bcad(str3);
        xn1Var.set(0, c19782x23db1cfa);
        t12Var.set(8, xn1Var);
        t12Var.set(2, stringExtra);
        t12Var.set(3, 100004);
        t12Var.set(6, f315884h);
        x4Var.f411061f.add(new dk2.mf(t12Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMsgManager", "appendHighlightCommentTip inserted, content=".concat(r26.p0.E0(stringExtra, 50)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, java.lang.Boolean.TRUE) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00dc, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, java.lang.Boolean.TRUE) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(gk2.e r12, r45.u63 r13) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.xa.c(gk2.e, r45.u63):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[LOOP:0: B:17:0x0076->B:34:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(gk2.e r15) {
        /*
            r14 = this;
            if (r15 == 0) goto Le2
            java.lang.Class<mm2.c1> r0 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r15.a(r0)
            mm2.c1 r0 = (mm2.c1) r0
            r45.ze2 r0 = r0.f410320c4
            if (r0 == 0) goto Le2
            r1 = 3
            java.lang.String r2 = r0.m75945x2fec8307(r1)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L20
            int r2 = r2.length()
            if (r2 != 0) goto L1e
            goto L20
        L1e:
            r2 = r3
            goto L21
        L20:
            r2 = r4
        L21:
            r2 = r2 ^ r4
            r5 = 0
            if (r2 == 0) goto L26
            goto L27
        L26:
            r0 = r5
        L27:
            if (r0 == 0) goto Le2
            r45.t12 r2 = new r45.t12
            r2.<init>()
            r6 = 10018(0x2722, float:1.4038E-41)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.set(r1, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 2
            java.lang.String r9 = r0.m75945x2fec8307(r8)
            r7.append(r9)
            java.lang.String r9 = " • "
            r7.append(r9)
            java.lang.String r9 = r0.m75945x2fec8307(r1)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r2.set(r8, r7)
            java.lang.String r7 = dk2.xa.f315881e
            r9 = 6
            r2.set(r9, r7)
            dk2.ja r7 = new dk2.ja
            r7.<init>(r2, r0)
            java.lang.Class<mm2.x4> r2 = mm2.x4.class
            androidx.lifecycle.c1 r2 = r15.a(r2)
            mm2.x4 r2 = (mm2.x4) r2
            java.util.List r2 = r2.f411061f
            java.lang.String r9 = "<get-msgList>(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r9)
            monitor-enter(r2)
            java.util.Iterator r9 = r2.iterator()     // Catch: java.lang.Throwable -> Ldf
        L76:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> Ldf
            if (r10 == 0) goto Lb5
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> Ldf
            r11 = r10
            dk2.zf r11 = (dk2.zf) r11     // Catch: java.lang.Throwable -> Ldf
            int r12 = r11.mo124533xfb85f7b0()     // Catch: java.lang.Throwable -> Ldf
            if (r12 != r6) goto Lb1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldf
            r12.<init>()     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r13 = r0.m75945x2fec8307(r8)     // Catch: java.lang.Throwable -> Ldf
            r12.append(r13)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r13 = " • "
            r12.append(r13)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r13 = r0.m75945x2fec8307(r1)     // Catch: java.lang.Throwable -> Ldf
            r12.append(r13)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r11 = r11.j()     // Catch: java.lang.Throwable -> Ldf
            boolean r11 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r12, r11)     // Catch: java.lang.Throwable -> Ldf
            if (r11 == 0) goto Lb1
            r11 = r4
            goto Lb2
        Lb1:
            r11 = r3
        Lb2:
            if (r11 == 0) goto L76
            r5 = r10
        Lb5:
            monitor-exit(r2)
            if (r5 != 0) goto Lc5
            java.lang.Class<mm2.x4> r0 = mm2.x4.class
            androidx.lifecycle.c1 r15 = r15.a(r0)
            mm2.x4 r15 = (mm2.x4) r15
            java.util.List r15 = r15.f411061f
            r15.add(r7)
        Lc5:
            java.lang.String r15 = "Finder.FinderLiveMsgManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "appendLocationTip:"
            r0.<init>(r1)
            r45.t12 r1 = r7.f315306a
            java.lang.String r1 = r1.m75945x2fec8307(r8)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r15, r0)
            goto Le2
        Ldf:
            r15 = move-exception
            monitor-exit(r2)
            throw r15
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.xa.d(gk2.e):void");
    }

    public final void e(gk2.e eVar, int i17, boolean z17) {
        if (eVar != null) {
            java.lang.String string = i17 == 1 ? z17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d2v) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d2w) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ead);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            r45.t12 t12Var = new r45.t12();
            t12Var.set(3, 10001);
            t12Var.set(2, string);
            ((mm2.x4) eVar.a(mm2.x4.class)).f411061f.add(new dk2.mf(t12Var));
        }
    }

    public final void f(gk2.e eVar) {
        java.lang.String string;
        if (eVar != null && ((mm2.e1) eVar.a(mm2.e1.class)).f7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMsgManager", "#appendMicSettingTip isScreenCastGameMode, ignore");
            return;
        }
        if (eVar != null) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            r45.il4 il4Var = ((mm2.o4) eVar.a(mm2.o4.class)).U;
            if (r4Var.x2(il4Var != null ? il4Var.f458662d : 0L)) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dvz);
            } else {
                r45.il4 il4Var2 = ((mm2.o4) eVar.a(mm2.o4.class)).U;
                if (r4Var.y2(il4Var2 != null ? il4Var2.f458662d : 0L)) {
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573204dw0);
                } else {
                    r45.il4 il4Var3 = ((mm2.o4) eVar.a(mm2.o4.class)).U;
                    if (r4Var.w2(il4Var3 != null ? il4Var3.f458662d : 0L)) {
                        string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dvy);
                    } else {
                        r45.il4 il4Var4 = ((mm2.o4) eVar.a(mm2.o4.class)).U;
                        string = r4Var.z2(il4Var4 != null ? il4Var4.f458662d : 0L) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzh) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dvx);
                    }
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            if (!(string.length() == 0)) {
                r45.t12 t12Var = new r45.t12();
                t12Var.set(3, 10001);
                t12Var.set(2, string);
                t12Var.set(6, f315883g);
                ((mm2.x4) eVar.a(mm2.x4.class)).f411061f.add(new dk2.mf(t12Var));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMsgManager", "appendMicSettingTip:".concat(string));
        }
    }

    public final void g(gk2.e eVar) {
        int i17;
        if (eVar != null) {
            java.util.LinkedList linkedList = ((mm2.c1) eVar.a(mm2.c1.class)).R;
            java.util.List list = ((mm2.x4) eVar.a(mm2.x4.class)).f411061f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-msgList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    dk2.zf zfVar = (dk2.zf) it.next();
                    if (zfVar.mo124533xfb85f7b0() == 10001 && zfVar.h() != 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if ((linkedList == null || linkedList.isEmpty()) || i17 != -1) {
                return;
            }
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                r45.nj1 nj1Var = (r45.nj1) it6.next();
                java.lang.String m75945x2fec8307 = nj1Var.m75945x2fec8307(1);
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                    dk2.mf a17 = dk2.mf.f315305j.a(nj1Var, null);
                    if (a17.b()) {
                        ya2.b2 b17 = ya2.h.f542017a.b(((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
                        a17.q(b17 != null ? ya2.d.i(b17) : null, 3);
                    }
                    ((mm2.x4) eVar.a(mm2.x4.class)).f411061f.add(a17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMsgManager", "appendNotificationInfo:" + nj1Var.m75945x2fec8307(1));
                }
            }
        }
    }

    public final void h(gk2.e eVar, r45.gw0 gw0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#appendOfficialAccountTips nick=");
        sb6.append(gw0Var != null ? gw0Var.m75945x2fec8307(0) : null);
        sb6.append(" user=");
        sb6.append(gw0Var != null ? gw0Var.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMsgManager", sb6.toString());
        if (eVar == null || gw0Var == null) {
            return;
        }
        r45.t12 t12Var = new r45.t12();
        t12Var.set(3, 10019);
        t12Var.set(2, gw0Var.m75945x2fec8307(0));
        t12Var.set(6, f315880d);
        ((mm2.x4) eVar.a(mm2.x4.class)).f411061f.add(new dk2.za(t12Var, gw0Var));
        ((ml2.r0) i95.n0.c(ml2.r0.class)).ck(false, gw0Var.m75945x2fec8307(1), gw0Var.m75945x2fec8307(0));
    }

    public final void i(gk2.e eVar) {
        r45.kc1 kc1Var;
        java.lang.String m75945x2fec8307;
        java.lang.Object obj;
        if (eVar == null || (kc1Var = ((mm2.c1) eVar.a(mm2.c1.class)).f410373m) == null || (m75945x2fec8307 = kc1Var.m75945x2fec8307(0)) == null) {
            return;
        }
        r45.t12 t12Var = new r45.t12();
        t12Var.set(3, 10001);
        t12Var.set(2, m75945x2fec8307);
        t12Var.set(6, f315878b);
        dk2.mf mfVar = new dk2.mf(t12Var);
        java.util.List list = ((mm2.x4) eVar.a(mm2.x4.class)).f411061f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-msgList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                dk2.zf zfVar = (dk2.zf) obj;
                if (zfVar.mo124533xfb85f7b0() == 10001 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, zfVar.j())) {
                    break;
                }
            }
        }
        if (obj == null) {
            ((mm2.x4) eVar.a(mm2.x4.class)).f411077y.add(f315878b);
            ((mm2.x4) eVar.a(mm2.x4.class)).f411061f.add(0, mfVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMsgManager", "appendSysLawTip:" + mfVar.f315306a.m75945x2fec8307(2));
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f85397r5).mo141623x754a37bb()).r()).booleanValue()) {
            r45.ch1 ch1Var = new r45.ch1();
            ch1Var.set(1, 20031);
            r45.qi1 qi1Var = new r45.qi1();
            qi1Var.set(0, 1);
            qi1Var.set(1, 65);
            qi1Var.set(2, 75);
            ch1Var.set(4, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(qi1Var.mo14344x5f01b1f6()));
            ch1Var.set(12, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            ((mm2.x4) eVar.a(mm2.x4.class)).f411061f.add(new dk2.w7(ch1Var));
            r45.ch1 ch1Var2 = new r45.ch1();
            ch1Var2.set(1, 20031);
            r45.qi1 qi1Var2 = new r45.qi1();
            qi1Var2.set(0, 1);
            qi1Var2.set(1, 45);
            qi1Var2.set(2, 55);
            ch1Var2.set(4, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(qi1Var2.mo14344x5f01b1f6()));
            ch1Var2.set(12, java.lang.Long.valueOf(ch1Var.m75942xfb822ef2(12) + 3));
            ((mm2.x4) eVar.a(mm2.x4.class)).f411061f.add(new dk2.w7(ch1Var2));
        }
    }

    public final void j(gk2.e eVar, java.lang.String str, java.lang.String str2) {
        int i17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        if (eVar != null) {
            boolean z17 = true;
            if (str == null || str.length() == 0) {
                java.lang.String str6 = ((mm2.c1) eVar.a(mm2.c1.class)).V1;
                if (!(str6 == null || str6.length() == 0)) {
                    str = ((mm2.c1) eVar.a(mm2.c1.class)).V1;
                } else if (((mm2.e1) eVar.a(mm2.e1.class)).f410524u == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(((mm2.e1) eVar.a(mm2.e1.class)).f410516m);
                    if (h17 != null) {
                        str = h17.m59226x730bcac6();
                    }
                    str = null;
                } else {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56 = ((mm2.e1) eVar.a(mm2.e1.class)).f410524u;
                    if (c19793xceab7f56 != null) {
                        str = c19793xceab7f56.m76944x730bcac6();
                    }
                    str = null;
                }
            } else {
                ((mm2.c1) eVar.a(mm2.c1.class)).V1 = str;
            }
            ((mm2.c1) eVar.a(mm2.c1.class)).W1 = str2;
            java.util.List list = ((mm2.x4) eVar.a(mm2.x4.class)).f411061f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-msgList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    } else {
                        if (((dk2.zf) it.next()).mo124533xfb85f7b0() == 100000) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[START_LIVE], desc is empty:");
            sb6.append(str == null || str.length() == 0);
            sb6.append(", containWelcomeMsg:");
            sb6.append(i17 != -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMsgManager", sb6.toString());
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17 || i17 != -1 || (c19792x256d2725 = ((mm2.c1) eVar.a(mm2.c1.class)).f410379n) == null) {
                return;
            }
            r45.t12 t12Var = new r45.t12();
            r45.xn1 xn1Var = new r45.xn1();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
            if (m76760x76845fea == null || (str3 = m76760x76845fea.m76197x6c03c64c()) == null) {
                str3 = "";
            }
            c19782x23db1cfa.m76240x66bc2758(str3);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea2 = c19792x256d2725.m76760x76845fea();
            if (m76760x76845fea2 == null || (str4 = m76760x76845fea2.m76184x8010e5e4()) == null) {
                str4 = "";
            }
            c19782x23db1cfa.m76227x7ac946f0(str4);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea3 = c19792x256d2725.m76760x76845fea();
            if (m76760x76845fea3 == null || (str5 = m76760x76845fea3.m76175x6d346f39()) == null) {
                str5 = "";
            }
            c19782x23db1cfa.m76218xe0a5bcad(str5);
            xn1Var.set(0, c19782x23db1cfa);
            t12Var.set(8, xn1Var);
            t12Var.set(2, str);
            t12Var.set(3, 100000);
            t12Var.set(6, f315879c);
            dk2.mf mfVar = new dk2.mf(t12Var);
            if (str2 == null) {
                str2 = "";
            }
            mfVar.f315307b = str2;
            ((mm2.x4) eVar.a(mm2.x4.class)).f411061f.add(mfVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMsgManager", "#appendWelcomeTip title got it.");
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.c1) eVar.a(mm2.c1.class)).Z1).k(mfVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMsgManager", "appendWelcomeTip:" + mfVar.f315306a.m75945x2fec8307(2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList k(java.util.LinkedList r21, java.util.LinkedList r22) {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.xa.k(java.util.LinkedList, java.util.LinkedList):java.util.ArrayList");
    }
}
