package df2;

/* loaded from: classes3.dex */
public final class xw extends if2.b implements if2.e {

    /* renamed from: w, reason: collision with root package name */
    public static final df2.nw f313341w = new df2.nw(null);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f313342m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f313343n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f313344o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f313345p;

    /* renamed from: q, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f313346q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f313347r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f313348s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f313349t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f313350u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f313351v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313342m = new java.util.ArrayList();
        this.f313346q = new p012xc85e97e9.p093xedfae76a.j0(java.lang.Boolean.FALSE);
        this.f313349t = new java.util.LinkedList();
    }

    public static final java.lang.String Z6(df2.xw xwVar) {
        if (!((mm2.c1) xwVar.m56788xbba4bfc0(mm2.c1.class)).T && g92.b.f351302e.k2().m75939xb282bd08(4) != 2) {
            return zl2.r4.f555483a.h0(xwVar.O6());
        }
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
        return r17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x000c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List a7(df2.xw r6, java.util.List r7) {
        /*
            r6.getClass()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        Lc:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L92
            java.lang.Object r1 = r7.next()
            so0.c r1 = (so0.c) r1
            java.lang.String r2 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r2)
            r2 = 0
            byte[] r3 = r1.f491742f     // Catch: java.lang.Exception -> L38
            if (r3 == 0) goto L50
            r45.ch1 r4 = new r45.ch1     // Catch: java.lang.Exception -> L38
            r4.<init>()     // Catch: java.lang.Exception -> L38
            r4.mo11468x92b714fd(r3)     // Catch: java.lang.Exception -> L2b
            goto L51
        L2b:
            r3 = move-exception
            java.lang.String r4 = "safeParser"
            java.lang.String r5 = ""
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L38
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r4, r5, r3)     // Catch: java.lang.Exception -> L38
            goto L50
        L38:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "[FinderLiveShopMsg.getAppMsg] e:"
            r4.<init>(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "LiveShopMsgCommon"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r3)
        L50:
            r4 = r2
        L51:
            if (r4 == 0) goto Lc
            java.lang.Class<we2.s> r3 = we2.s.class
            androidx.lifecycle.c1 r3 = r6.m56788xbba4bfc0(r3)
            we2.s r3 = (we2.s) r3
            r3.getClass()
            we2.p r3 = r3.f526788g
            dk2.zf r3 = r3.b(r4)
            if (r3 == 0) goto Lc
            boolean r4 = r3 instanceof dk2.dg
            if (r4 == 0) goto L6e
            r4 = r3
            dk2.dg r4 = (dk2.dg) r4
            goto L6f
        L6e:
            r4 = r2
        L6f:
            if (r4 != 0) goto L72
            goto L8d
        L72:
            int r1 = r1.f491746j
            if (r1 == 0) goto L83
            r5 = 1
            if (r1 == r5) goto L80
            r5 = 2
            if (r1 == r5) goto L7d
            goto L85
        L7d:
            r45.d54 r2 = r45.d54.LOADING
            goto L85
        L80:
            r45.d54 r2 = r45.d54.FAILED
            goto L85
        L83:
            r45.d54 r2 = r45.d54.SUCCESS
        L85:
            java.lang.String r1 = "forNumber(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r1)
            r4.t(r2)
        L8d:
            r0.add(r3)
            goto Lc
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.xw.a7(df2.xw, java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b7(df2.xw r9, java.lang.String r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.xw.b7(df2.xw, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long c7() {
        return ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
    }

    public final qo2.e d7() {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Zj();
    }

    public final boolean e7() {
        java.lang.Boolean bool = (java.lang.Boolean) this.f313346q.mo3195x754a37bb();
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void f7(java.lang.String content, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).T) {
            return;
        }
        mm2.n0 n0Var = (mm2.n0) m56788xbba4bfc0(mm2.n0.class);
        if (n0Var != null && n0Var.f410806r) {
            return;
        }
        java.lang.String str2 = this.f313343n;
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveShopMsgDataController", "[postMsg] sessionId empty");
            return;
        }
        r45.xn1 xn1Var = new r45.xn1();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
        c19782x23db1cfa.m76240x66bc2758(((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410385o);
        xn1Var.set(0, c19782x23db1cfa);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(0, xn1Var);
        r45.xn1 xn1Var2 = new r45.xn1();
        zl2.r4 r4Var = zl2.r4.f555483a;
        xn1Var2.set(0, r4Var.m0(getStore().getLiveRoomData()));
        xn1Var2.set(11, ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410345h);
        xn1Var2.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        ch1Var.set(13, xn1Var2);
        r45.xj1 xj1Var = new r45.xj1();
        xj1Var.set(0, content);
        r45.up2 up2Var = new r45.up2();
        kn0.e a17 = hn0.v.f363973a.a();
        up2Var.set(0, a17 != null ? a17.B : null);
        xj1Var.set(1, up2Var);
        ch1Var.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(xj1Var.mo14344x5f01b1f6()));
        ch1Var.set(1, 20002);
        ch1Var.set(10, 0);
        ch1Var.set(2, str == null ? zl2.q4.f555466a.m() : str);
        ch1Var.set(16, java.lang.Long.valueOf(c7()));
        h0Var.f391656d = ch1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveShopMsgDataController", "[postMsg] sessionId:" + this.f313343n + ", anchorUserName: " + ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410385o + ", content:" + content + ", resendClientMsgId:" + str);
        we2.s sVar = (we2.s) m56788xbba4bfc0(we2.s.class);
        r45.ch1 msg = (r45.ch1) h0Var.f391656d;
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        dk2.zf b17 = sVar.f526788g.b(msg);
        pm0.v.X(new df2.uw(b17, this, str));
        df2.nw nwVar = f313341w;
        jz5.l[] lVarArr = new jz5.l[2];
        java.lang.String str3 = this.f313343n;
        if (str3 == null) {
            str3 = "";
        }
        lVarArr[0] = new jz5.l("sessionid", str3);
        lVarArr[1] = new jz5.l("sessionid_msg_text", content);
        nwVar.a(7, kz5.c1.k(lVarArr));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.vw(str, h0Var, this, xn1Var, b17, content, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        r45.up1 up1Var;
        p012xc85e97e9.p093xedfae76a.j0 j0Var2;
        r45.up1 up1Var2;
        super.mo14867x5aa1c816(r71Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canAskProduct: isBoxLive = ");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o0.f183953a.a(getStore().getLiveRoomData()));
        sb6.append(", flag = ");
        sb6.append((r71Var == null || (up1Var2 = (r45.up1) r71Var.m75936x14adae67(32)) == null) ? null : java.lang.Long.valueOf(up1Var2.m75942xfb822ef2(7)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveShopMsgDataController", sb6.toString());
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Boolean) ae2.in.T6.r()).booleanValue()) {
            df2.xw xwVar = (df2.xw) getStore().m56798x25fe639c(df2.xw.class);
            if (xwVar == null || (j0Var2 = xwVar.f313346q) == null) {
                return;
            }
            j0Var2.mo7808x76db6cb1(java.lang.Boolean.TRUE);
            return;
        }
        df2.xw xwVar2 = (df2.xw) getStore().m56798x25fe639c(df2.xw.class);
        if (xwVar2 == null || (j0Var = xwVar2.f313346q) == null) {
            return;
        }
        j0Var.mo7808x76db6cb1(java.lang.Boolean.valueOf(pm0.v.A((r71Var == null || (up1Var = (r45.up1) r71Var.m75936x14adae67(32)) == null) ? 0L : up1Var.m75942xfb822ef2(7), 1L)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        r45.up1 up1Var;
        p012xc85e97e9.p093xedfae76a.j0 j0Var2;
        r45.up1 up1Var2;
        super.mo14863x39a513b7(hc1Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canAskProduct: isBoxLive = ");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o0.f183953a.a(getStore().getLiveRoomData()));
        sb6.append(", flag = ");
        sb6.append((hc1Var == null || (up1Var2 = (r45.up1) hc1Var.m75936x14adae67(68)) == null) ? null : java.lang.Long.valueOf(up1Var2.m75942xfb822ef2(7)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveShopMsgDataController", sb6.toString());
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Boolean) ae2.in.T6.r()).booleanValue()) {
            df2.xw xwVar = (df2.xw) getStore().m56798x25fe639c(df2.xw.class);
            if (xwVar == null || (j0Var2 = xwVar.f313346q) == null) {
                return;
            }
            j0Var2.mo7808x76db6cb1(java.lang.Boolean.TRUE);
            return;
        }
        df2.xw xwVar2 = (df2.xw) getStore().m56798x25fe639c(df2.xw.class);
        if (xwVar2 == null || (j0Var = xwVar2.f313346q) == null) {
            return;
        }
        j0Var.mo7808x76db6cb1(java.lang.Boolean.valueOf(pm0.v.A((hc1Var == null || (up1Var = (r45.up1) hc1Var.m75936x14adae67(68)) == null) ? 0L : up1Var.m75942xfb822ef2(7), 1L)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f313350u;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5491xce09ac21> abstractC20980x9b9ad01d2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5491xce09ac21>(ubVar) { // from class: com.tencent.mm.plugin.finder.live.controller.LiveVisitorShopMsgDataController$initReceiveMsgListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(ubVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
                this.f39173x3fe91575 = 633350705;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5491xce09ac21 c5491xce09ac21) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5491xce09ac21 event = c5491xce09ac21;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (((mm2.c1) df2.xw.this.m56788xbba4bfc0(mm2.c1.class)).T) {
                    return false;
                }
                mm2.n0 n0Var = (mm2.n0) df2.xw.this.m56788xbba4bfc0(mm2.n0.class);
                if (n0Var != null && n0Var.f410806r) {
                    return false;
                }
                df2.xw xwVar = df2.xw.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(xwVar, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.qw(xwVar, event, null), 2, null);
                return true;
            }
        };
        this.f313350u = abstractC20980x9b9ad01d2;
        abstractC20980x9b9ad01d2.mo48813x58998cd();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d3 = this.f313351v;
        if (abstractC20980x9b9ad01d3 != null) {
            abstractC20980x9b9ad01d3.mo48814x2efc64();
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar2 = this.f372632e;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5932xcdb39e3c> abstractC20980x9b9ad01d4 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5932xcdb39e3c>(ubVar2) { // from class: com.tencent.mm.plugin.finder.live.controller.LiveVisitorShopMsgDataController$initResendMsgListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(ubVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
                this.f39173x3fe91575 = -1535684532;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5932xcdb39e3c c5932xcdb39e3c) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5932xcdb39e3c event = c5932xcdb39e3c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.sr srVar = event.f136236g;
                java.lang.String content = srVar.f89463a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content, "content");
                df2.xw.this.f7(content, srVar.f89464b);
                return true;
            }
        };
        this.f313351v = abstractC20980x9b9ad01d4;
        abstractC20980x9b9ad01d4.mo48813x58998cd();
        this.f313346q.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout, new df2.tw(this));
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f313350u;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        this.f313350u = null;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = this.f313351v;
        if (abstractC20980x9b9ad01d2 != null) {
            abstractC20980x9b9ad01d2.mo48814x2efc64();
        }
        this.f313351v = null;
        this.f313345p = false;
        this.f313342m.clear();
        this.f313343n = null;
        this.f313348s = false;
        this.f313347r = false;
    }
}
