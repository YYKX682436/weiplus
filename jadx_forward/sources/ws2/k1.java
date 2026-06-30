package ws2;

/* loaded from: classes3.dex */
public final class k1 {

    /* renamed from: s, reason: collision with root package name */
    public static volatile ws2.k1 f530600s;

    /* renamed from: b, reason: collision with root package name */
    public zs2.c f530603b;

    /* renamed from: c, reason: collision with root package name */
    public gk2.e f530604c;

    /* renamed from: e, reason: collision with root package name */
    public dt2.b0 f530606e;

    /* renamed from: f, reason: collision with root package name */
    public dt2.t f530607f;

    /* renamed from: m, reason: collision with root package name */
    public boolean f530614m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f530615n;

    /* renamed from: o, reason: collision with root package name */
    public dt2.a0 f530616o;

    /* renamed from: p, reason: collision with root package name */
    public ws2.b f530617p;

    /* renamed from: q, reason: collision with root package name */
    public ws2.l f530618q;

    /* renamed from: r, reason: collision with root package name */
    public static final ws2.u0 f530599r = new ws2.u0(null);

    /* renamed from: t, reason: collision with root package name */
    public static final jz5.g f530601t = jz5.h.b(ws2.t0.f530675d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f530602a = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final zs2.a f530605d = new zs2.a();

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f530608g = jz5.h.b(new ws2.w0(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f530609h = jz5.h.b(new ws2.j1(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f530610i = jz5.h.b(new ws2.h1(this));

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f530611j = jz5.h.b(new ws2.d1(this));

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashSet f530612k = new java.util.HashSet();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.HashSet f530613l = new java.util.HashSet();

    public static final boolean a(ws2.k1 k1Var) {
        k1Var.getClass();
        com.p314xaae8f345.mm.app.w.INSTANCE.getClass();
        java.lang.String str = (java.lang.String) kz5.n0.i0(new java.util.ArrayList(com.p314xaae8f345.mm.app.w.f135410v));
        dt2.b0 b0Var = k1Var.f530606e;
        android.content.Context mo58769xfdd9c5e5 = b0Var != null ? b0Var.mo58769xfdd9c5e5() : null;
        android.app.Activity activity = mo58769xfdd9c5e5 instanceof android.app.Activity ? (android.app.Activity) mo58769xfdd9c5e5 : null;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activity != null ? activity.getClass().getName() : null, str);
    }

    public static final void b(ws2.k1 k1Var, int i17) {
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        boolean z17 = false;
        int i18 = jVar != null ? jVar.f303807r : 0;
        ct2.j jVar2 = (ct2.j) k1Var.e(ct2.j.class);
        int U6 = jVar2 != null ? ct2.j.U6(jVar2, 0, 1, null) : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onVideoPlayEndLogic source:");
        sb6.append(i17);
        sb6.append(" total:");
        sb6.append(i18);
        sb6.append(",offset:");
        ct2.j jVar3 = (ct2.j) k1Var.e(ct2.j.class);
        sb6.append(jVar3 != null ? java.lang.Integer.valueOf(jVar3.f303806q) : null);
        sb6.append(",previewTimeLimit:");
        sb6.append(U6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", sb6.toString());
        if (i18 < U6) {
            ct2.j jVar4 = (ct2.j) k1Var.e(ct2.j.class);
            if (jVar4 != null) {
                jVar4.d7(2);
            }
            dt2.b0 b0Var = k1Var.f530606e;
            if (b0Var != null) {
                b0Var.j(i17);
            }
            dt2.t tVar = k1Var.f530607f;
            if (tVar != null) {
                tVar.j(i17);
                return;
            }
            return;
        }
        ct2.j jVar5 = (ct2.j) k1Var.e(ct2.j.class);
        if (jVar5 != null) {
            jVar5.d7(3);
        }
        dt2.b0 b0Var2 = k1Var.f530606e;
        if (b0Var2 != null) {
            b0Var2.c(i17);
        }
        mm2.g0 g0Var = (mm2.g0) k1Var.e(mm2.g0.class);
        if (g0Var != null && g0Var.T6()) {
            z17 = true;
        }
        if (z17) {
            dt2.t tVar2 = k1Var.f530607f;
            if (tVar2 != null) {
                tVar2.c(i17);
                return;
            }
            return;
        }
        dt2.t tVar3 = k1Var.f530607f;
        if (tVar3 != null) {
            tVar3.j(i17);
        }
    }

    public static final void c(ws2.k1 k1Var, int i17) {
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        if (jVar != null) {
            jVar.d7(1);
        }
        ct2.j jVar2 = (ct2.j) k1Var.e(ct2.j.class);
        k1Var.m(i17, jVar2 != null ? jVar2.O6() : 0L);
        dt2.t tVar = k1Var.f530607f;
        if (tVar != null) {
            tVar.i(i17);
        }
        dt2.b0 b0Var = k1Var.f530606e;
        if (b0Var != null) {
            b0Var.i(i17);
        }
    }

    public static final void d(ws2.k1 k1Var, android.content.Intent intent) {
        dt2.t tVar = k1Var.f530607f;
        if (tVar != null) {
            mm2.c1 c1Var = (mm2.c1) k1Var.e(mm2.c1.class);
            android.graphics.Point a17 = c1Var != null ? ko0.t.f391436a.a(c1Var.f410412s2, c1Var.f410418t2) : new android.graphics.Point(com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f562053a10), com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0z));
            ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
            long O6 = jVar != null ? jVar.O6() : 0L;
            ct2.j jVar2 = (ct2.j) k1Var.e(ct2.j.class);
            boolean T6 = jVar2 != null ? jVar2.T6() : false;
            int intExtra = intent.getIntExtra("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 0);
            ws2.u0 u0Var = f530599r;
            u0Var.a().k((ws2.l2) ((jz5.n) tVar.f324735n).mo141623x754a37bb());
            fo0.n a18 = tVar.a();
            dt2.a0 a0Var = u0Var.a().f530616o;
            a18.d(a17, O6, T6, intExtra, 12, new fo0.s(a0Var != null && a0Var.f324691a.mo58787xc00617a4(), 0, false, false, false, null, null, false, 254, null));
        }
    }

    public static void t(ws2.k1 k1Var, int i17, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, boolean z17, int i18, java.lang.Object obj) {
        org.json.JSONObject jSONObject4 = (i18 & 2) != 0 ? null : jSONObject;
        org.json.JSONObject jSONObject5 = (i18 & 4) != 0 ? null : jSONObject2;
        org.json.JSONObject jSONObject6 = (i18 & 8) != 0 ? null : jSONObject3;
        if ((i18 & 16) != 0) {
            z17 = true;
        }
        boolean z18 = z17;
        dt2.t tVar = k1Var.f530607f;
        if (tVar != null) {
            tVar.q(i17, jSONObject4, jSONObject5, jSONObject6, z18);
        }
    }

    public final p012xc85e97e9.p093xedfae76a.c1 e(java.lang.Class bu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        gk2.e eVar = this.f530604c;
        if (eVar != null) {
            return eVar.a(bu6);
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f() {
        km2.m a17;
        zs2.c cVar = this.f530603b;
        if (cVar == null || (a17 = cVar.a()) == null) {
            return null;
        }
        return a17.f390664f;
    }

    public final boolean g(long j17, android.content.Intent intent, r45.mt2 mt2Var, boolean z17) {
        cm2.a aVar;
        gk2.e eVar;
        r45.nw1 nw1Var;
        r45.i72 i72Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (z17) {
            dt2.t tVar = this.f530607f;
            if (tVar != null) {
                tVar.o();
            }
            zs2.c cVar = this.f530603b;
            if (cVar == null) {
                return true;
            }
            cVar.c(new jz5.l(java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE));
            return true;
        }
        if (mt2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveReplayService", "initData fail!");
            return false;
        }
        l(3, j17, true);
        zs2.c cVar2 = new zs2.c();
        cVar2.f556779a = mt2Var;
        cVar2.b(mt2Var.m75939xb282bd08(4));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList m75941xfb821914 = mt2Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObjects(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            aVar = cm2.a.f124861a;
            km2.m mVar = null;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next();
            if (c19792x256d2725 != null) {
                mVar = new km2.m(c19792x256d2725);
                aVar.v(mVar, c19792x256d2725, 2);
            }
            if (mVar != null) {
                r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
                if (m76794xd0557130 != null && (i72Var = (r45.i72) m76794xd0557130.m75936x14adae67(44)) != null) {
                    ((ct2.j) mVar.f390663e.a(ct2.j.class)).a7(i72Var.m75939xb282bd08(2), java.lang.Boolean.TRUE);
                }
                arrayList.add(mVar);
            }
        }
        cVar2.f556781c = arrayList;
        if (intent.hasExtra("KEY_PAGE_TYPE")) {
            java.lang.String stringExtra = intent.getStringExtra("KEY_PAGE_TYPE");
            if (stringExtra == null) {
                stringExtra = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderReplayLiveData", "set pageType from " + cVar2.f556783e + " to " + stringExtra);
            cVar2.f556783e = stringExtra;
        }
        if (intent.hasExtra("KEY_PAGE_SUB_TYPE")) {
            int intExtra = intent.getIntExtra("KEY_PAGE_SUB_TYPE", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderReplayLiveData", "set pageSubType from " + cVar2.f556784f + " to " + intExtra);
            cVar2.f556784f = intExtra;
        }
        cVar2.c(null);
        java.util.Iterator it6 = cVar2.f556781c.iterator();
        while (it6.hasNext()) {
            r45.i72 i72Var2 = (r45.i72) ((mm2.e1) ((km2.m) it6.next()).f390663e.a(mm2.e1.class)).f410521r.m75936x14adae67(44);
            if (i72Var2 != null) {
                i72Var2.set(1, 0L);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "set replayData:" + cVar2.hashCode() + ',' + i());
        this.f530603b = cVar2;
        km2.m a17 = cVar2.a();
        if (a17 == null || (eVar = a17.f390663e) == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) {
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initData liveInfo:");
        sb6.append(aVar.y(nw1Var));
        sb6.append(",replayInfo:");
        r45.i72 i72Var3 = (r45.i72) nw1Var.m75936x14adae67(44);
        sb6.append(i72Var3 != null ? aVar.m(i72Var3) : null);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", sb6.toString());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r8 = this;
            dt2.t r0 = r8.f530607f
            if (r0 != 0) goto Le
            jz5.g r0 = r8.f530608g
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            dt2.t r0 = (dt2.t) r0
        Le:
            zl2.r4 r1 = zl2.r4.f555483a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "set replayMiniWindowView:"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderLiveReplayService"
            r1.N2(r3, r2)
            r8.f530607f = r0
            if (r0 == 0) goto La9
            java.lang.Class<ct2.j> r1 = ct2.j.class
            androidx.lifecycle.c1 r1 = r8.e(r1)
            ct2.j r1 = (ct2.j) r1
            r2 = 0
            if (r1 == 0) goto L37
            java.lang.String r1 = r1.N6()
            goto L38
        L37:
            r1 = r2
        L38:
            java.lang.Class<mm2.c1> r3 = mm2.c1.class
            androidx.lifecycle.c1 r3 = r8.e(r3)
            mm2.c1 r3 = (mm2.c1) r3
            if (r3 == 0) goto L46
            java.lang.String r2 = r3.t7()
        L46:
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r3 = r0.m()
            r3.getClass()
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L5a
            int r6 = r1.length()
            if (r6 != 0) goto L58
            goto L5a
        L58:
            r6 = r4
            goto L5b
        L5a:
            r6 = r5
        L5b:
            if (r6 != 0) goto L81
            java.lang.String r6 = r3.anchorUsername
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r1)
            if (r6 == 0) goto L81
            if (r2 == 0) goto L70
            int r6 = r2.length()
            if (r6 != 0) goto L6e
            goto L70
        L6e:
            r6 = r4
            goto L71
        L70:
            r6 = r5
        L71:
            if (r6 != 0) goto L81
            java.lang.String r6 = r3.coverUrl
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r2)
            if (r6 == 0) goto L81
            boolean r3 = r3.f197577s
            if (r3 != 0) goto L81
            r3 = r5
            goto L82
        L81:
            r3 = r4
        L82:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "setupMiniView haveSetup:"
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "FinderLiveReplayMiniView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r6)
            if (r3 != 0) goto La9
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r3 = r0.m()
            r3.k(r1, r2, r4, r5)
            fo0.n r1 = r0.a()
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r0 = r0.m()
            r1.g(r0)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ws2.k1.h():void");
    }

    public final java.lang.String i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9;
        if (this.f530604c == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("data is null,liveId:");
            ct2.j jVar = (ct2.j) e(ct2.j.class);
            sb6.append(jVar != null ? java.lang.Long.valueOf(jVar.O6()) : null);
            sb6.append("-playerWidget:");
            dt2.a0 a0Var = this.f530616o;
            sb6.append(a0Var != null ? a0Var.hashCode() : 0);
            sb6.append("-player:");
            dt2.a0 a0Var2 = this.f530616o;
            c14932xfc4acec9 = a0Var2 != null ? a0Var2.f324691a : null;
            sb6.append(c14932xfc4acec9 != null ? c14932xfc4acec9.hashCode() : 0);
            sb6.append("-layout:");
            dt2.b0 b0Var = this.f530606e;
            sb6.append(b0Var != null ? b0Var.hashCode() : 0);
            return sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("service liveId:");
        ct2.j jVar2 = (ct2.j) e(ct2.j.class);
        sb7.append(jVar2 != null ? java.lang.Long.valueOf(jVar2.O6()) : null);
        sb7.append("-playerWidget:");
        dt2.a0 a0Var3 = this.f530616o;
        sb7.append(a0Var3 != null ? a0Var3.hashCode() : 0);
        sb7.append("-player:");
        dt2.a0 a0Var4 = this.f530616o;
        c14932xfc4acec9 = a0Var4 != null ? a0Var4.f324691a : null;
        sb7.append(c14932xfc4acec9 != null ? c14932xfc4acec9.hashCode() : 0);
        sb7.append("-layout:");
        dt2.b0 b0Var2 = this.f530606e;
        sb7.append(b0Var2 != null ? b0Var2.hashCode() : 0);
        return sb7.toString();
    }

    public final jz5.l j(long j17, dt2.a0 a0Var) {
        if (j17 != 0) {
            ct2.j jVar = (ct2.j) e(ct2.j.class);
            if (j17 == (jVar != null ? jVar.O6() : 0L)) {
                a0Var = this.f530616o;
            }
        }
        if (a0Var != null) {
            return new jz5.l(a0Var, java.lang.Boolean.TRUE);
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        dt2.a0 a0Var2 = new dt2.a0(context, j17);
        ws2.i1 i1Var = (ws2.i1) ((jz5.n) this.f530609h).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = a0Var2.f324691a;
        c14932xfc4acec9.m58799x70cb65e3(i1Var);
        c14932xfc4acec9.m58791x49bc1928((ws2.g1) ((jz5.n) this.f530610i).mo141623x754a37bb());
        ws2.x0 x0Var = new ws2.x0(this);
        c14932xfc4acec9.m58796x2d7a0c48(a0Var2.f324693c);
        a0Var2.f324692b = x0Var;
        return new jz5.l(a0Var2, java.lang.Boolean.FALSE);
    }

    public final void k(ws2.m2 proxy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proxy, "proxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "registerSeiProcessViewCallbackProxy:" + proxy.hashCode());
        this.f530613l.add(proxy);
        proxy.g(this.f530614m, this.f530615n);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r18, long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws2.k1.l(int, long, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r12, long r13) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws2.k1.m(int, long):void");
    }

    public final void n(gk2.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set curLiveContext:");
        sb6.append(eVar != null ? eVar.hashCode() : 0);
        sb6.append(',');
        sb6.append(i());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", sb6.toString());
        this.f530604c = eVar;
    }

    public final void o(gk2.e buContext, zs2.a config) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        n(buContext);
        zs2.a aVar = this.f530605d;
        aVar.getClass();
        aVar.f556777a = config.f556777a;
        aVar.f556778b = config.f556778b;
        if (aVar.f556778b) {
            zs2.g gVar = (zs2.g) ((ct2.e) pf5.u.f435469a.e(zy2.b6.class).a(ct2.e.class)).f303787e.get(java.lang.Long.valueOf(((ct2.j) buContext.a(ct2.j.class)).O6()));
            java.lang.Integer valueOf = gVar != null ? java.lang.Integer.valueOf(gVar.f556790a) : null;
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                str = "change offset:" + ((ct2.j) buContext.a(ct2.j.class)).f303806q + " to " + intValue;
                ((ct2.j) buContext.a(ct2.j.class)).Z6(intValue);
            } else {
                str = null;
            }
        } else {
            str = "";
        }
        if (aVar.f556777a) {
            h();
        }
        dt2.t tVar = this.f530607f;
        if (tVar != null) {
            tVar.p(this.f530604c);
        }
        je2.y yVar = (je2.y) e(je2.y.class);
        if (yVar != null) {
            ws2.c1 c1Var = (ws2.c1) ((jz5.n) this.f530611j).mo141623x754a37bb();
            java.lang.String N6 = yVar.N6();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set SeiProcessViewCallback:");
            sb6.append(c1Var != null ? c1Var.hashCode() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(N6, sb6.toString());
            yVar.f380819h = c1Var;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setData:");
        gk2.e eVar = this.f530604c;
        sb7.append(eVar != null ? java.lang.Long.valueOf(((ct2.j) eVar.a(ct2.j.class)).O6()) : null);
        sb7.append(" logicConfig:");
        sb7.append(aVar);
        sb7.append(' ');
        sb7.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", sb7.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        if (((g25.e) r8).f349513c == true) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(dt2.b0 r7, qs5.o r8) {
        /*
            r6 = this;
            java.lang.String r0 = "targetMode"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            r6.q(r7)
            if (r7 == 0) goto L17
            java.lang.Class<at2.u1> r0 = at2.u1.class
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r7.y(r0)
            at2.u1 r0 = (at2.u1) r0
            if (r0 == 0) goto L17
            dt2.a0 r0 = r0.f95295q
            goto L18
        L17:
            r0 = 0
        L18:
            r6.f530616o = r0
            java.lang.Class<ct2.j> r0 = ct2.j.class
            androidx.lifecycle.c1 r1 = r6.e(r0)
            ct2.j r1 = (ct2.j) r1
            r2 = 0
            if (r1 == 0) goto L29
            long r4 = r1.f303799g
            goto L2a
        L29:
            r4 = r2
        L2a:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L3d
            androidx.lifecycle.c1 r1 = r6.e(r0)
            ct2.j r1 = (ct2.j) r1
            if (r1 != 0) goto L37
            goto L3d
        L37:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r1.f303799g = r2
        L3d:
            androidx.lifecycle.c1 r0 = r6.e(r0)
            ct2.j r0 = (ct2.j) r0
            if (r0 != 0) goto L46
            goto L4b
        L46:
            kn0.m r1 = kn0.m.f391106d
            r0.e7(r1)
        L4b:
            dt2.b0 r0 = r6.f530606e
            if (r0 == 0) goto L57
            ws2.e1 r1 = new ws2.e1
            r1.<init>(r6)
            r0.mo58771x16e08f86(r1)
        L57:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r6.f()
            if (r0 == 0) goto L62
            if2.z r1 = if2.z.f372686a
            r1.d(r0, r8)
        L62:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r6.f()
            if (r0 == 0) goto L79
            if2.z r1 = if2.z.f372686a
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r7, r2)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if2.q r2 = new if2.q
            r2.<init>(r0, r7)
            r1.i(r0, r2)
        L79:
            qs5.o r7 = qs5.o.f447988h
            if (r8 != r7) goto Ld0
            ws2.l r7 = r6.f530618q
            if (r7 != 0) goto L86
            ws2.l r7 = new ws2.l
            r7.<init>()
        L86:
            r6.f530618q = r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "requestAudioFocus audioFocusSession:"
            r8.<init>(r0)
            f25.m0 r0 = r7.f530620a
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "FinderLiveReplayAudioManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r8)
            f25.m0 r8 = r7.f530620a
            if (r8 != 0) goto Lb6
            java.lang.Class<f25.n0> r8 = f25.n0.class
            i95.m r8 = i95.n0.c(r8)
            f25.n0 r8 = (f25.n0) r8
            f25.l r0 = f25.l.f340636c
            ws2.k r1 = new ws2.k
            r1.<init>(r7)
            f25.m0 r8 = r8.m9(r0, r1)
            r7.f530620a = r8
        Lb6:
            f25.m0 r8 = r7.f530620a
            if (r8 == 0) goto Lc2
            g25.e r8 = (g25.e) r8
            boolean r8 = r8.f349513c
            r0 = 1
            if (r8 != r0) goto Lc2
            goto Lc3
        Lc2:
            r0 = 0
        Lc3:
            if (r0 != 0) goto Lcb
            java.lang.String r8 = "not gain focus"
            r7.b(r8)
            goto Ld0
        Lcb:
            java.lang.String r8 = "requestAudioFocus"
            r7.a(r8)
        Ld0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "setFullScreenUI:"
            r7.<init>(r8)
            java.lang.String r8 = r6.i()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FinderLiveReplayService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ws2.k1.p(dt2.b0, qs5.o):void");
    }

    public final void q(dt2.b0 b0Var) {
        zl2.r4.f555483a.N2("FinderLiveReplayService", "set replayFullScreenView:" + b0Var);
        this.f530606e = b0Var;
    }

    public final void r(android.content.Intent intent) {
        final ws2.f1 f1Var = new ws2.f1(this, intent);
        if (((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Hj()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new java.lang.Runnable(f1Var) { // from class: ws2.b1

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f530543d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f1Var, "function");
                    this.f530543d = f1Var;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f530543d.mo152xb9724478();
                }
            }, 200L);
        } else {
            f1Var.mo152xb9724478();
        }
    }

    public final void s(ws2.m2 proxy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proxy, "proxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "unregisterSeiProcessViewCallbackProxy:" + proxy.hashCode());
        this.f530613l.remove(proxy);
    }
}
