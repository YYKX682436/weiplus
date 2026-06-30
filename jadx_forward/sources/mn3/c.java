package mn3;

/* loaded from: classes8.dex */
public final class c implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27380xe18329c5 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f411709a = jz5.h.b(mn3.b.f411708d);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27380xe18329c5
    /* renamed from: debugInfo */
    public java.lang.String mo113810xf42a0da1(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27447x378bb538 c27447x378bb538) {
        java.lang.String str;
        if (c27447x378bb538 != null) {
            r45.ov4 ov4Var = new r45.ov4();
            ov4Var.mo11468x92b714fd(c27447x378bb538.mo14344x5f01b1f6());
            str = ov4Var.mo12245xcc313de3().toString();
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27380xe18329c5
    /* renamed from: debugSwitchInfo */
    public java.lang.String mo113811x52acbcb5(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27390x807ff37e c27390x807ff37e) {
        java.lang.String str;
        if (c27390x807ff37e != null) {
            r45.hl0 hl0Var = new r45.hl0();
            hl0Var.mo11468x92b714fd(c27390x807ff37e.mo14344x5f01b1f6());
            str = hl0Var.mo12245xcc313de3().toString();
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (((lf0.w) ((mf0.e0) i95.n0.c(mf0.e0.class))).wi() != false) goto L13;
     */
    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27380xe18329c5
    /* renamed from: enableSync */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo113812x70d83abe(int r6, int r7) {
        /*
            r5 = this;
            r0 = 4
            java.lang.String r1 = ", syncScene: "
            java.lang.String r2 = "MicroMsg.NewLife.AffSyncCppToNativeManagerImpl"
            r3 = 1
            r4 = 0
            if (r6 == r0) goto L32
            r0 = 9
            if (r6 == r0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "check enableSync, unsupported businessType: "
            r0.<init>(r3)
            r0.append(r6)
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0)
        L24:
            r3 = r4
            goto L52
        L26:
            java.lang.Class<tg0.w1> r0 = tg0.w1.class
            i95.m r0 = i95.n0.c(r0)
            tg0.w1 r0 = (tg0.w1) r0
            r0.getClass()
            goto L52
        L32:
            java.lang.Class<ra0.v> r0 = ra0.v.class
            i95.m r0 = i95.n0.c(r0)
            ra0.v r0 = (ra0.v) r0
            en3.v r0 = (en3.v) r0
            boolean r0 = r0.wi()
            if (r0 == 0) goto L24
            java.lang.Class<mf0.e0> r0 = mf0.e0.class
            i95.m r0 = i95.n0.c(r0)
            mf0.e0 r0 = (mf0.e0) r0
            lf0.w r0 = (lf0.w) r0
            boolean r0 = r0.wi()
            if (r0 == 0) goto L24
        L52:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "check enableSync, businessType: "
            r0.<init>(r4)
            r0.append(r6)
            r0.append(r1)
            r0.append(r7)
            java.lang.String r6 = ", canSync: "
            r0.append(r6)
            r0.append(r3)
            java.lang.String r6 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mn3.c.mo113812x70d83abe(int, int):boolean");
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27380xe18329c5
    /* renamed from: getConfigSyncKeyPathList */
    public java.util.ArrayList mo113813x9e656aef(int i17) {
        if (i17 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            return new java.util.ArrayList(r26.n0.f0((java.lang.CharSequence) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.F3).mo141623x754a37bb()).r(), new java.lang.String[]{";"}, false, 0, 6, null));
        }
        if (i17 == 9) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            return new java.util.ArrayList(r26.n0.f0((java.lang.CharSequence) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.G3).mo141623x754a37bb()).r(), new java.lang.String[]{";"}, false, 0, 6, null));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewLife.AffSyncCppToNativeManagerImpl", "getConfigSyncKeyPathList, unsupported businessType: " + i17);
        return new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27380xe18329c5
    /* renamed from: getLiteAppVersionInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d mo113814x5d101f09() {
        boolean z17;
        java.util.ArrayList d17 = kz5.c0.d("wxalite2fd372f050eecd471a4392786dfae78c", "wxalite71e155e932f19de48da8333a8f225708", "wxalite15eb964a6d8b6f8943f9a2881c5ebdfa");
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo> linkedList = new java.util.LinkedList<>();
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var;
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 Bj = iVar.Bj(str);
            if (Bj == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.AffSyncCppToNativeManagerImpl", "For %s, info is null", str);
            } else {
                java.lang.String Ej = iVar.Ej(Bj.f14369x346425, str, Bj.f14372xa8503287);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.AffSyncCppToNativeManagerImpl", "For %s, version is %s", str, Ej);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo liteAppVersionInfo = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo();
                liteAppVersionInfo.m116424x52b743ba(str);
                liteAppVersionInfo.m116425xc633a616(Ej);
                linkedList.add(liteAppVersionInfo);
            }
        }
        fr4.g0 g0Var2 = (fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class));
        g0Var2.getClass();
        java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo> linkedList2 = new java.util.LinkedList<>();
        kr4.m Bi = g0Var2.Bi();
        java.util.concurrent.ConcurrentHashMap.KeySetView newKeySet = java.util.concurrent.ConcurrentHashMap.newKeySet();
        android.database.Cursor B = Bi.f393050d.B("select * , rowid from W1wConversation", null);
        while (B.moveToNext()) {
            try {
                kr4.g gVar = new kr4.g();
                gVar.mo9015xbf5d97fd(B);
                newKeySet.add(gVar.f69047x5568d387);
            } finally {
            }
        }
        vz5.b.a(B, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(newKeySet);
        java.util.List<java.lang.String> S0 = kz5.n0.S0(newKeySet);
        if (S0.size() > 100) {
            S0 = S0.subList(0, 100);
        }
        for (java.lang.String str2 : S0) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo zhugePersonalMsgInfo = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo();
            zhugePersonalMsgInfo.m116442x66bc2758(str2);
            zhugePersonalMsgInfo.m116441x30659cde(g0Var2.Bi().z0(0, str2));
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = g0Var2.f347360n;
            java.lang.Boolean bool = (java.lang.Boolean) concurrentHashMap.get(str2);
            if (bool == null || !bool.booleanValue()) {
                z17 = false;
            } else {
                concurrentHashMap.put(str2, java.lang.Boolean.FALSE);
                z17 = true;
            }
            zhugePersonalMsgInfo.m116440x7d8a1ea2(z17);
            linkedList2.add(zhugePersonalMsgInfo);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d c27469xf050ac8d = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d();
        c27469xf050ac8d.m116410x2ff620e5(linkedList);
        c27469xf050ac8d.m116411xfd01b6ca(linkedList2);
        return c27469xf050ac8d;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27380xe18329c5
    /* renamed from: getNewLifeRequestSyncResult */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 mo113815x359fbaa1() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 m116065x3136c9db = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1.m116065x3136c9db();
        m116065x3136c9db.f60242x9be15fe2 = true;
        m116065x3136c9db.f60243x8c412b1a = 0L;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 m116068x59bc66e = m116065x3136c9db.m116068x59bc66e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m116068x59bc66e, "build(...)");
        return m116068x59bc66e;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27380xe18329c5
    /* renamed from: getWebSearchRequestSyncConfig */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 mo113816xe3c38ae6() {
        r45.vs2 vs2Var;
        byte[] m75962x8b6d8abc;
        sg0.u3 u3Var = (sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class));
        u3Var.getClass();
        ug0.q.T6(u3Var);
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) kz5.n0.Z(nk6.w0("Search.Entrance", xy2.c.e(context), true, true));
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 m116484x3136c9db = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10.m116484x3136c9db();
        m116484x3136c9db.f60348xa41396a8 = jbVar != null;
        if (jbVar != null && (vs2Var = jbVar.f65874xb5f7102a) != null && (m75962x8b6d8abc = vs2Var.m75962x8b6d8abc()) != null) {
            m116484x3136c9db.m116486x365e9ce3(new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27420xb907d6b7().mo11468x92b714fd(m75962x8b6d8abc));
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 m116487x59bc66e = m116484x3136c9db.m116487x59bc66e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m116487x59bc66e, "build(...)");
        return m116487x59bc66e;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27380xe18329c5
    /* renamed from: handleCmd */
    public void mo113817x3d209f2(int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 c27398x1fd13c47, int i18, boolean z17) {
        boolean z18;
        java.util.LinkedList<r45.f03> linkedList;
        int i19;
        r45.f03 f03Var;
        java.util.LinkedList<r45.f03> linkedList2;
        java.util.LinkedList linkedList3;
        java.util.HashMap hashMap;
        if (c27398x1fd13c47 != null) {
            int i27 = 0;
            if (i17 == 4) {
                ln3.h hVar = new ln3.h();
                int i28 = c27398x1fd13c47.f59838x5a623f5;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "cmdId=" + i28 + "  scene=" + i18);
                switch (i28) {
                    case 10001:
                        z18 = true;
                        r45.zu4 zu4Var = new r45.zu4();
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = c27398x1fd13c47.f59837xaf1e42d9;
                        zu4Var.mo11468x92b714fd(gVar != null ? gVar.g() : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "getMentionCount username: " + zu4Var.m75945x2fec8307(4) + " interactionTabTotalCount:" + zu4Var.m75939xb282bd08(6) + " commentTabTotalCount:" + zu4Var.m75939xb282bd08(7));
                        if (zu4Var.m75939xb282bd08(7) <= 0 && zu4Var.m75939xb282bd08(6) <= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "[processGetMentionCount] server error.");
                            break;
                        }
                        break;
                    case 10002:
                        r45.ts2 ts2Var = new r45.ts2();
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = c27398x1fd13c47.f59837xaf1e42d9;
                        ts2Var.mo11468x92b714fd(gVar2 != null ? gVar2.g() : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "redDotEvent get red dot, showRed:" + ts2Var.m75939xb282bd08(0));
                        r45.vs2 vs2Var = (r45.vs2) ts2Var.m75936x14adae67(1);
                        if (vs2Var != null && (linkedList = vs2Var.f470022g) != null) {
                            for (r45.f03 f03Var2 : linkedList) {
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f03Var2.f455425i, "NewLife.Entrance")) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("NewLife.Entrance");
                                    if (L0 != null) {
                                        f03Var = L0.I0("NewLife.Entrance");
                                        i19 = 1;
                                    } else {
                                        i19 = 1;
                                        f03Var = null;
                                    }
                                    ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).Zi(L0, f03Var, hVar.a((r45.vs2) ts2Var.m75936x14adae67(i19), f03Var2), false, 2);
                                }
                            }
                        }
                        z18 = true;
                        ((c61.l7) i95.n0.c(c61.l7.class)).nk().D0(ts2Var);
                        break;
                    case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6 /* 10003 */:
                        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        r45.dz2 dz2Var = new r45.dz2();
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = c27398x1fd13c47.f59837xaf1e42d9;
                        if (gVar3 != null) {
                            dz2Var.mo11468x92b714fd(gVar3.g());
                            java.util.LinkedList m75941xfb821914 = dz2Var.m75941xfb821914(0);
                            if (m75941xfb821914 != null) {
                                java.util.Iterator it = m75941xfb821914.iterator();
                                while (it.hasNext()) {
                                    r45.gz2 gz2Var = (r45.gz2) it.next();
                                    r45.vs2 vs2Var2 = (r45.vs2) gz2Var.m75936x14adae67(i27);
                                    if (vs2Var2 != null && (linkedList2 = vs2Var2.f470022g) != null) {
                                        for (r45.f03 f03Var3 : linkedList2) {
                                            java.util.Iterator it6 = it;
                                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f03Var3.f455425i, "NewLife.Entrance")) {
                                                java.lang.String a17 = hVar.a((r45.vs2) gz2Var.m75936x14adae67(0), f03Var3);
                                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L02 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("NewLife.Entrance");
                                                ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).Zi(L02, L02 != null ? L02.I0("NewLife.Entrance") : null, a17, false, 3);
                                            }
                                            it = it6;
                                            i27 = 0;
                                        }
                                    }
                                }
                            }
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2) ((c61.l7) i95.n0.c(c61.l7.class)).nk()).e1(dz2Var, "processTabRedDot");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "NewLifeTabTips is null");
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "process tab red dot scene:" + i18 + "  cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                        z18 = true;
                        break;
                    case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261 /* 10004 */:
                        try {
                            r45.vt2 vt2Var = new r45.vt2();
                            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = c27398x1fd13c47.f59837xaf1e42d9;
                            vt2Var.mo11468x92b714fd(gVar4 != null ? gVar4.g() : null);
                            ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).fj(vt2Var);
                            ((c61.l7) i95.n0.c(c61.l7.class)).nk().o(vt2Var);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.NewLife.NewLifeSyncHandler", "", e17);
                        }
                        z18 = true;
                        break;
                    default:
                        z18 = true;
                        if (z17) {
                            r45.hx0 hx0Var = new r45.hx0();
                            hx0Var.mo11468x92b714fd(c27398x1fd13c47.mo14344x5f01b1f6());
                            ((ic2.p0) ((jz5.n) hVar.f401433a).mo141623x754a37bb()).j7(hx0Var, 0, i18);
                            break;
                        }
                        break;
                }
            } else {
                if (i17 != 9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewLife.AffSyncCppToNativeManagerImpl", "handleCmd, unsupported businessType: " + i17);
                } else {
                    sg0.u3 u3Var = (sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class));
                    u3Var.getClass();
                    ug0.q T6 = ug0.q.T6(u3Var);
                    int i29 = c27398x1fd13c47.f59838x5a623f5;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onHandleSyncCmdItem, cmdId: " + i29 + ", scene: " + i18);
                    if (!ug0.q.f509005n) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearchCommonSyncRedDotFSC", "onHandleSyncCmdItem, CommonSyncRedDot not enabled, ignored.");
                    }
                    tg0.u1 u1Var = T6.f509008h;
                    if (i29 == 30000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onHandleTabRedDotCmdItem, cmdId: " + c27398x1fd13c47.f59838x5a623f5 + ", scene: " + i18);
                        if (c27398x1fd13c47.f59837xaf1e42d9 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearchCommonSyncRedDotFSC", "onHandleTabRedDotCmdItem, finderCmdItem.cmdBuf is null.");
                        } else {
                            r45.dz2 dz2Var2 = new r45.dz2();
                            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = c27398x1fd13c47.f59837xaf1e42d9;
                            dz2Var2.mo11468x92b714fd(gVar5 != null ? gVar5.g() : null);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onHandleTabRedDotCmdItem, tabTips: " + dz2Var2);
                            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
                            java.util.LinkedList m75941xfb8219142 = dz2Var2.m75941xfb821914(0);
                            if (m75941xfb8219142 != null) {
                                java.util.Iterator it7 = m75941xfb8219142.iterator();
                                while (it7.hasNext()) {
                                    r45.vs2 vs2Var3 = (r45.vs2) ((r45.gz2) it7.next()).m75936x14adae67(0);
                                    if (vs2Var3 != null && (linkedList3 = vs2Var3.f470022g) != null) {
                                        java.util.Iterator it8 = linkedList3.iterator();
                                        while (it8.hasNext()) {
                                            if ("Search.Entrance".equals(((r45.f03) it8.next()).f455425i)) {
                                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L03 = nk6.L0("Search.Entrance");
                                                r45.f03 I0 = L03 != null ? L03.I0("Search.Entrance") : null;
                                                wg0.a aVar = (wg0.a) u1Var;
                                                aVar.getClass();
                                                if (L03 == null || I0 == null) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearchRedDotReporter", "reportCovered, invalid params, ctrInfo: " + L03 + ", showInfo: " + I0);
                                                } else {
                                                    java.lang.String str = I0.f455425i;
                                                    r45.f03 I02 = str != null ? ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0(str) : null;
                                                    if (I02 != null) {
                                                        hashMap = new java.util.HashMap();
                                                        hashMap.put("base64_cover_reddot_info", I02.mo12245xcc313de3().toString());
                                                    } else {
                                                        hashMap = null;
                                                    }
                                                    aVar.a("red_dot_covered", L03, I0, hashMap);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2) nk6).e1(dz2Var2, "processTabRedDot");
                        }
                    } else if (i29 != 30001) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearchCommonSyncRedDotFSC", "onHandleSyncCmdItem, unsupported cmdId: " + i29);
                        z18 = false;
                    } else {
                        try {
                            r45.vt2 vt2Var2 = new r45.vt2();
                            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = c27398x1fd13c47.f59837xaf1e42d9;
                            if (gVar6 != null) {
                                vt2Var2.mo11468x92b714fd(gVar6.g());
                            }
                            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().o(vt2Var2);
                            ((wg0.a) u1Var).c(vt2Var2);
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.WebSearchCommonSyncRedDotFSC", "", e18);
                        }
                    }
                }
                z18 = true;
            }
            if (z17 && !z18) {
                r45.hx0 hx0Var2 = new r45.hx0();
                hx0Var2.mo11468x92b714fd(c27398x1fd13c47.mo14344x5f01b1f6());
                ((ic2.p0) ((jz5.n) this.f411709a).mo141623x754a37bb()).j7(hx0Var2, 0, i18);
            }
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27380xe18329c5
    /* renamed from: isShowLookOneLookEntry */
    public boolean mo113818x384492f3() {
        return ((lf0.w) ((mf0.e0) i95.n0.c(mf0.e0.class))).wi();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27380xe18329c5
    /* renamed from: isShowWebSearchEntry */
    public boolean mo113819x885df6dd() {
        ((tg0.w1) i95.n0.c(tg0.w1.class)).getClass();
        return true;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27380xe18329c5
    /* renamed from: mergeSyncKey */
    public java.lang.String mo113820x6c4d866c(java.lang.String str, java.lang.String str2) {
        byte[] bArr;
        byte[] bArr2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g h17;
        java.lang.String str3 = null;
        if (str != null) {
            bArr = str.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
        } else {
            bArr = null;
        }
        if (str2 != null) {
            bArr2 = str2.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr2, "getBytes(...)");
        } else {
            bArr2 = null;
        }
        byte[] c17 = o45.qi.c(bArr, bArr2);
        if (c17 != null && (h17 = pm0.b0.h(c17)) != null) {
            str3 = h17.i();
        }
        return str3 == null ? "" : str3;
    }
}
