package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f;

/* loaded from: classes9.dex */
public final class k extends xm3.t0 implements sb5.z {
    public final java.util.Set A1;
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.e6 B1;
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.e6 C1;
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.d6 D1;
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.d6 E1;
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.x9 F1;
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.x9 G1;
    public com.p314xaae8f345.mm.ui.df H1;
    public final com.p314xaae8f345.mm.ui.df I1;
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.u0 J1;
    public final yb5.d K;
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.u0 K1;
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 L;
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z L1;
    public final java.util.List M;
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.C21649x9f796fc1 M1;
    public final jz5.g N;
    public final wf0.u1 N1;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 O1;
    public long P;
    public final xg3.h0 P1;
    public final java.util.Map Q;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d Q1;
    public final java.util.Map R;
    public boolean R1;
    public long S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final java.util.concurrent.CopyOnWriteArraySet W;
    public android.view.View.OnClickListener X;
    public int Y;
    public ke5.f0 Z;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f279955l1;

    /* renamed from: p0, reason: collision with root package name */
    public o11.g f279956p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f279957p1;

    /* renamed from: x0, reason: collision with root package name */
    public final long f279958x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f279959x1;

    /* renamed from: y0, reason: collision with root package name */
    public long f279960y0;

    /* renamed from: y1, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dr f279961y1;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.Runnable f279962z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.tencent.mm.ui.chatting.adapter.ChattingDataAdapter$chatMsgChange$1] */
    public k(final yb5.d context, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 mListView, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe mvvmList) {
        super(mvvmList, new in5.s() { // from class: com.tencent.mm.ui.chatting.adapter.ChattingDataAdapter$Companion$buildItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public od5.g mo43555xf2bb75ea(int type) {
                return new od5.g(type, yb5.d.this);
            }
        }, true);
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5204x3b05336c> abstractC20980x9b9ad01d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mListView, "mListView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
        this.K = context;
        this.L = mListView;
        this.M = new te5.q1();
        this.N = jz5.h.b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.d(this));
        jz5.h.b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.c(this));
        this.Q = new java.util.HashMap();
        this.R = new java.util.HashMap();
        this.S = -1L;
        this.W = new java.util.concurrent.CopyOnWriteArraySet();
        this.Y = -1;
        this.f279958x0 = -1L;
        this.f279960y0 = -1L;
        this.f279961y1 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wr(context);
        this.A1 = new java.util.HashSet();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.M1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5236x8e0a6828>(a0Var) { // from class: com.tencent.mm.ui.chatting.adapter.ChattingDataAdapter$chatMsgChange$1
            {
                this.f39173x3fe91575 = -195924424;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5236x8e0a6828 c5236x8e0a6828) {
                jz5.f0 f0Var;
                java.lang.Object obj;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5236x8e0a6828 event = c5236x8e0a6828;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.a2 a2Var = event.f135569g;
                boolean z17 = a2Var.f87652c;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k.this;
                if (z17) {
                    java.lang.Long valueOf = java.lang.Long.valueOf(a2Var.f87650a);
                    java.lang.String str = a2Var.f87651b;
                    long longValue = valueOf.longValue();
                    java.util.Iterator it = kVar.I.f233598o.iterator();
                    while (true) {
                        f0Var = null;
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((rd5.d) obj).f475787d.f526833b.m124847x74d37ac6() == longValue) {
                            break;
                        }
                    }
                    rd5.d dVar = (rd5.d) obj;
                    if (dVar != null) {
                        kVar.h(dVar);
                        f0Var = jz5.f0.f384359a;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingDataAdapterV3", "onChatMsgChange() wrong with: msgId = " + longValue + ", talker = " + str);
                    }
                } else {
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) kVar.K.f542241c.a(sb5.z.class))).Q0();
                }
                return true;
            }
        };
        this.f374640q = true;
        context.z(sb5.z.class, this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.e6 e6Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.e6();
        this.C1 = e6Var;
        this.B1 = e6Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.d6 d6Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.d6(context);
        this.E1 = d6Var;
        this.D1 = d6Var;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.x9 x9Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.x9(context.g());
        this.G1 = x9Var;
        this.F1 = x9Var;
        com.p314xaae8f345.mm.ui.df dfVar = new com.p314xaae8f345.mm.ui.df(context);
        this.I1 = dfVar;
        this.H1 = dfVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.u0 u0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.u0(context);
        this.K1 = u0Var;
        this.J1 = u0Var;
        this.L1 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.ib(context);
        S0();
        mo8164xbbdced85(true);
        mo8163xed962dec(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.a());
        this.F = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.b(this);
        this.N1 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.h(this);
        this.O1 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j(this), true);
        this.P1 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i(this);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.F4(context.x())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterV3", "init brandEscTmplMsgChangeListener");
            abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5204x3b05336c>(a0Var) { // from class: com.tencent.mm.ui.chatting.adapter.ChattingDataAdapter$brandEscTmplMsgChangeListener$1
                {
                    this.f39173x3fe91575 = -1204934276;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5204x3b05336c c5204x3b05336c) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5204x3b05336c event = c5204x3b05336c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k.this.Q0();
                    return false;
                }
            };
        } else {
            abstractC20980x9b9ad01d = null;
        }
        this.Q1 = abstractC20980x9b9ad01d;
    }

    public boolean F0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return f9Var != null && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.m.a(f9Var);
    }

    public void G0(int i17, int i18) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 u17;
        ot0.q v17;
        java.lang.String d17;
        boolean z17;
        int i19 = i17;
        yb5.d dVar = this.K;
        if (dVar == null || (u17 = dVar.u()) == null) {
            return;
        }
        int i27 = (i18 - i19) + 2;
        java.util.ArrayList arrayList = new java.util.ArrayList(i27);
        ((zq1.a0) gm0.j1.s(zq1.a0.class)).getClass();
        boolean z18 = false;
        if (!u17.k2()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(i27);
            if (i19 <= i18) {
                while (true) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = mo75871xfb80e389(i19);
                    if (mo75871xfb80e389 != null && (mo75871xfb80e389.mo78013xfb85f7b0() & 49) != 0 && (v17 = ot0.q.v(mo75871xfb80e389.U1())) != null && !android.text.TextUtils.isEmpty(v17.f430207k)) {
                        java.lang.String url = v17.f430207k;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "url");
                        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "domainString(...)");
                        if (r26.n0.B(url, a17, z18)) {
                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wr wrVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wr) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xr.a(this.K);
                            java.lang.String A = wrVar.b(wrVar.c(mo75871xfb80e389)).A(this.K, mo75871xfb80e389);
                            if (A != null && (d17 = u17.d1()) != null) {
                                int a18 = c01.h2.a(A, this.K.x());
                                ot0.f fVar = (ot0.f) v17.y(ot0.f.class);
                                int i28 = fVar != null ? fVar.f429988b : -1;
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                java.lang.String url2 = v17.f430207k;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url2, "url");
                                arrayList3.add(url2);
                                arrayList3.add(java.lang.String.valueOf(i28));
                                java.lang.String str = v17.f430255w;
                                if (str == null) {
                                    str = "";
                                }
                                arrayList3.add(str);
                                arrayList3.add(java.lang.String.valueOf(mo75871xfb80e389.I0()));
                                arrayList3.add(d17);
                                arrayList3.add(java.lang.String.valueOf(a18));
                                arrayList3.add(A);
                                arrayList3.add(java.lang.String.valueOf(mo75871xfb80e389.mo78012x3fdd41df()));
                                arrayList3.add(java.lang.String.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).h(d17)));
                                arrayList2.add(arrayList3);
                            }
                        }
                    }
                    if (i19 == i18) {
                        break;
                    }
                    i19++;
                    z18 = false;
                }
            }
            if (arrayList2.size() > 0) {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).v(arrayList2, 1);
                return;
            }
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        if (i19 <= i18) {
            while (true) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e3892 = mo75871xfb80e389(i19);
                if (mo75871xfb80e3892 != null && mo75871xfb80e3892.mo78013xfb85f7b0() == 285212721) {
                    java.lang.String d18 = u17.d1();
                    if (d18 == null) {
                        d18 = "";
                    }
                    java.lang.String valueOf = java.lang.String.valueOf(mo75871xfb80e3892.m124847x74d37ac6());
                    java.lang.String j17 = mo75871xfb80e3892.j();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
                    arrayList4.add(new java.lang.String[]{valueOf, j17, "-1", d18});
                    ot0.l0 l0Var = new ot0.l0();
                    l0Var.f430107h = mo75871xfb80e3892.m124847x74d37ac6();
                    l0Var.f430106g = mo75871xfb80e3892.j();
                    arrayList.add(l0Var);
                }
                if (i19 == i18) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        if (arrayList4.size() > 0) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList4) {
                java.lang.String h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.h(((java.lang.String[]) obj)[0]);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a3 a3Var = yq1.z.f546029g;
                if (a3Var.n(h17)) {
                    z17 = false;
                } else {
                    a3Var.m(h17);
                    z17 = true;
                }
                if (z17) {
                    arrayList5.add(obj);
                }
            }
            if (!arrayList5.isEmpty()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadData: preloadByInfoIdAndBuffer:");
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(arrayList5, 10));
                java.util.Iterator it = arrayList5.iterator();
                while (it.hasNext()) {
                    arrayList6.add(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.h(((java.lang.String[]) it.next())[0]));
                }
                sb6.append(arrayList6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceImpl", sb6.toString());
                ((ku5.t0) ku5.t0.f394148d).h(new yq1.w(arrayList5, 0), "tmplPreload");
            }
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).h(new yq1.s(arrayList, 0), "getAppMsgRelatedInfo");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        if (r3.f475787d.f526833b.m124847x74d37ac6() == r9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int H0(long r9) {
        /*
            r8 = this;
            com.tencent.mm.plugin.mvvmlist.MvvmList r0 = r8.I
            java.util.ArrayList r0 = r0.f233598o
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        La:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L62
            java.lang.Object r3 = r0.next()
            rd5.d r3 = (rd5.d) r3
            boolean r4 = r3 instanceof qd5.i
            r5 = 1
            if (r4 == 0) goto L4e
            qd5.i r3 = (qd5.i) r3
            we5.s0 r3 = r3.f443444o
            if (r3 == 0) goto L5b
            java.util.List r3 = r3.f526920a
            if (r3 == 0) goto L5b
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L2c
            goto L5b
        L2c:
            java.util.Iterator r3 = r3.iterator()
        L30:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r3.next()
            rd5.d r4 = (rd5.d) r4
            we5.a r4 = r4.f475787d
            com.tencent.mm.storage.f9 r4 = r4.f526833b
            long r6 = r4.m124847x74d37ac6()
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 != 0) goto L4a
            r4 = r5
            goto L4b
        L4a:
            r4 = r1
        L4b:
            if (r4 == 0) goto L30
            goto L5c
        L4e:
            we5.a r3 = r3.f475787d
            com.tencent.mm.storage.f9 r3 = r3.f526833b
            long r3 = r3.m124847x74d37ac6()
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 != 0) goto L5b
            goto L5c
        L5b:
            r5 = r1
        L5c:
            if (r5 == 0) goto L5f
            goto L63
        L5f:
            int r2 = r2 + 1
            goto La
        L62:
            r2 = -1
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k.H0(long):int");
    }

    public void I0(int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = mo75871xfb80e389(i17);
        if (mo75871xfb80e389 == null || mo75871xfb80e389.m124847x74d37ac6() == 0) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f6) ((sb5.g1) this.K.f542241c.a(sb5.g1.class))).f280547f.add(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(mo75871xfb80e389.m124847x74d37ac6(), mo75871xfb80e389.Q0()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.ChattingDataAdapterV3", "fixShowTime: " + i17 + " : " + mo75871xfb80e389.m124847x74d37ac6(), new java.lang.Object[0]);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5236x8e0a6828 c5236x8e0a6828 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5236x8e0a6828();
        long m124847x74d37ac6 = mo75871xfb80e389.m124847x74d37ac6();
        am.a2 a2Var = c5236x8e0a6828.f135569g;
        a2Var.f87650a = m124847x74d37ac6;
        a2Var.f87651b = mo75871xfb80e389.Q0();
        c5236x8e0a6828.e();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389(int i17) {
        rd5.d dVar = (rd5.d) kz5.n0.a0(this.I.f233598o, i17);
        if (dVar != null) {
            return dVar.f475787d.f526833b;
        }
        return null;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 K0(long j17) {
        int i17 = 0;
        for (java.lang.Object obj : this.M) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
            if (f9Var.m124847x74d37ac6() == j17) {
                return f9Var;
            }
            i17 = i18;
        }
        return null;
    }

    public int L0() {
        return this.W.size();
    }

    public int M0() {
        if (-1 == this.Y) {
            this.Y = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).j7(this.K.x());
        }
        return this.Y;
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.e6 N0() {
        return this.B1;
    }

    public android.view.View O0(long j17) {
        java.lang.ref.WeakReference weakReference;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.Map map = this.Q;
        if (map.containsKey(valueOf) && (weakReference = (java.lang.ref.WeakReference) map.get(java.lang.Long.valueOf(j17))) != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    public android.view.View P0(int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = mo75871xfb80e389(i17);
        if (mo75871xfb80e389 == null) {
            return null;
        }
        long m124847x74d37ac6 = mo75871xfb80e389.m124847x74d37ac6();
        java.util.Map map = this.Q;
        if (!((java.util.HashMap) map).containsKey(java.lang.Long.valueOf(m124847x74d37ac6))) {
            return null;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) map).get(java.lang.Long.valueOf(m124847x74d37ac6));
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    public void Q0() {
        if (this.f279955l1) {
            this.f279957p1++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterV3", "[handleMsgChange] isLockNotify:" + this.f279957p1);
            return;
        }
        if (!this.f279959x1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterV3", "[handleMsgChange] is not resumeState ");
            return;
        }
        ke5.f0 f0Var = this.Z;
        if (f0Var != null) {
            f0Var.b(hd5.n.ACTION_UPDATE, false);
        }
    }

    public int R0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return -1;
        }
        int i17 = 0;
        for (java.lang.Object obj : this.I.f233598o) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((rd5.d) obj).f475787d.f526833b.m124847x74d37ac6() == f9Var.m124847x74d37ac6()) {
                return i17;
            }
            i17 = i18;
        }
        return -1;
    }

    public final void S0() {
        if (this.f279956p0 == null) {
            o11.f fVar = new o11.f();
            yb5.d dVar = this.K;
            fVar.f423616g = s01.r.k(dVar.x());
            fVar.f423611b = true;
            fVar.f423628s = true;
            fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78922x61de8d17;
            if (dVar.g() != null) {
                fVar.f423630u = ym5.x.a(r1, 52.0f) * 0.1f;
                fVar.f423629t = true;
            }
            try {
                this.f279956p0 = fVar.a();
            } catch (java.lang.NullPointerException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingDataAdapterV3", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public void T0(java.lang.String str, long j17, hd5.n nVar, sb5.y yVar) {
        r15.f fVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Long.valueOf(j17);
        objArr[1] = java.lang.Boolean.valueOf(yVar != null ? yVar.f487129a : false);
        objArr[2] = nVar;
        objArr[3] = java.lang.Integer.valueOf(yVar != null ? yVar.f487133e : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterV3", "[locationByMsgId] messageId:%s loadAllBottomMsg:%s mode:%s topOffset:%s", objArr);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("MSG_ID", j17);
        bundle.putString("MSG_TALKER", str);
        bundle.putInt("SCENE", 1);
        bundle.putBoolean("IS_LOAD_ALL", yVar != null ? yVar.f487129a : false);
        bundle.putBoolean("IS_HIGHLIGHT_ITEM", yVar != null ? yVar.f487130b : false);
        bundle.putBoolean("IS_IDLE_VISBLE", yVar != null ? yVar.f487131c : false);
        bundle.putBoolean("IS_ALWAYS_HIGHLIGHT_MODE", yVar != null ? yVar.f487132d : false);
        bundle.putInt("SELECTION_TOP_OFFSET", yVar != null ? yVar.f487133e : 0);
        bundle.putBoolean("IS_SMOOTH_SCROLL", yVar != null ? yVar.f487134f : false);
        bundle.putBoolean("SELECT_BY_MSG_ID", yVar != null ? yVar.f487135g : false);
        if (yVar != null && (fVar = yVar.f487136h) != null) {
            android.os.Bundle bundle2 = yVar.f487137i;
            if (bundle2 != null) {
                bundle2.putInt("locate_start", fVar.f450177a);
            }
            if (bundle2 != null) {
                bundle2.putInt("locate_end", fVar.f450178b);
            }
        }
        bundle.putBundle("EXTRA_BUNDLE", yVar != null ? yVar.f487137i : null);
        ke5.f0 f0Var = this.Z;
        if (f0Var != null) {
            f0Var.a(nVar, true, bundle);
        }
    }

    public void U0(int i17, boolean z17, boolean z18) {
        fl5.i m75471x111b4628;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 v07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8) ((sb5.i0) this.K.f542241c.a(sb5.i0.class))).v0();
        qa5.g sizeAnimController = (v07 == null || (m75471x111b4628 = v07.m75471x111b4628()) == null) ? null : m75471x111b4628.getSizeAnimController();
        if (sizeAnimController == null) {
            return;
        }
        sizeAnimController.hashCode();
    }

    public void V0(int i17) {
        rd5.d dVar = (rd5.d) kz5.n0.a0(this.I.f233598o, i17);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar != null ? dVar.f475787d.f526833b : null;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Long.valueOf(f9Var != null ? f9Var.m124847x74d37ac6() : -1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterV3", "[setShowHistoryMsgTipId] pos:%s msgId:%s", objArr);
        if (f9Var != null && f9Var.m124847x74d37ac6() != 0) {
            if (this.P == f9Var.m124847x74d37ac6()) {
                return;
            } else {
                this.P = f9Var.m124847x74d37ac6();
            }
        }
        h(null);
    }

    public boolean W0(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 msgIdTalker) {
        java.lang.String string;
        android.view.View m75885x6a486239;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdTalker, "msgIdTalker");
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.W;
        boolean contains = copyOnWriteArraySet.contains(msgIdTalker);
        yb5.d dVar = this.K;
        if (contains) {
            copyOnWriteArraySet.remove(msgIdTalker);
        } else {
            if (copyOnWriteArraySet.size() >= 100) {
                if (this.U) {
                    string = dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c1y, 100);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                } else {
                    string = dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c1x, 100);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                }
                db5.e1.s(dVar.g(), string, "");
                return false;
            }
            copyOnWriteArraySet.add(msgIdTalker);
        }
        long j17 = msgIdTalker.f231013d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 v3Var = this.L;
        if (v3Var != null) {
            int m75886x3d79f549 = v3Var.m75886x3d79f549();
            for (int i17 = 0; i17 < m75886x3d79f549; i17++) {
                m75885x6a486239 = v3Var.m75885x6a486239(i17);
                java.lang.Object tag = m75885x6a486239 != null ? m75885x6a486239.getTag() : null;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var = tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) tag : null;
                if (g0Var != null && (view = g0Var.f39496x10665fb1) != null) {
                    java.lang.Object tag2 = view.getTag();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.plugin.msg.MsgIdTalker");
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) tag2).f231013d == j17) {
                        break;
                    }
                }
            }
        }
        m75885x6a486239 = null;
        if (m75885x6a486239 != null) {
            java.lang.Object tag3 = m75885x6a486239.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag3, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItem.BaseViewHolder");
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) tag3;
            android.widget.CheckBox checkBox = g0Var2.f39492x5b9aa3a3;
            if (checkBox != null && checkBox.getVisibility() == 0) {
                g0Var2.f39492x5b9aa3a3.setChecked(copyOnWriteArraySet.contains(msgIdTalker));
            }
        } else {
            h(null);
        }
        dVar.f542243e.U(j17, msgIdTalker.a());
        return true;
    }

    public void X0(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 msgIdTalker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdTalker, "msgIdTalker");
        if (this.W.contains(msgIdTalker)) {
            return;
        }
        W0(msgIdTalker);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3
    /* renamed from: getCount */
    public int mo8143x7444f759() {
        return this.I.f233598o.size();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3
    /* renamed from: getView */
    public android.view.View mo75872xfb86a31b(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3
    public void h(java.lang.Object obj) {
        mo8143x7444f759();
        java.lang.Runnable runnable = this.f279962z1;
        if (runnable != null) {
            runnable.run();
        }
        this.A1.clear();
        if (obj == null) {
            m8146xced61ae5();
            return;
        }
        boolean z17 = obj instanceof rd5.d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = this.I;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.A(c16718x7059cefe, (xm3.d) obj, false, 2, null);
        } else {
            c16718x7059cefe.v(rd5.b.f475786a.a(this.K, this.M), true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.z3.F4(r0.x()) || r0.E()) ? false : true) == false) goto L15;
     */
    @Override // xm3.t0, xm3.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(xm3.o0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "pendingData"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            super.k(r6)
            java.lang.String r0 = "MicroMsg.ChattingDataAdapterV3"
            java.lang.String r1 = "[onDataSetChangeFinish]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            r5.mo8143x7444f759()
            yb5.d r0 = r5.K
            r0.getClass()
            java.lang.String r1 = "setOnDataSetChangedCalled:true"
            java.lang.String r2 = "MicroMsg.ChattingContext"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            r1 = 1
            r0.f542257s = r1
            java.util.List r2 = r5.M
            r3 = 0
            java.lang.Object r2 = kz5.n0.a0(r2, r3)
            com.tencent.mm.storage.f9 r2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) r2
            if (r2 == 0) goto L31
            java.lang.String r2 = r2.Q0()
            goto L32
        L31:
            r2 = 0
        L32:
            java.lang.String r4 = r0.x()
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r4)
            if (r2 != 0) goto L53
            jz5.g r2 = hd5.j.f362142h
            java.lang.String r2 = r0.x()
            boolean r2 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.F4(r2)
            if (r2 == 0) goto L4a
        L48:
            r1 = r3
            goto L51
        L4a:
            boolean r2 = r0.E()
            if (r2 == 0) goto L51
            goto L48
        L51:
            if (r1 != 0) goto L61
        L53:
            com.tencent.mm.pluginsdk.ui.tools.v3 r1 = r0.p()
            r1.setVisibility(r3)
            com.tencent.mm.ui.chatting.gb r1 = r0.f542252n
            com.tencent.mm.ui.chatting.ChattingUIFragment r1 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) r1
            r1.l1(r3)
        L61:
            com.tencent.mm.ui.chatting.component.g7 r0 = r0.f542243e
            r0.S(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k.k(xm3.o0):void");
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    /* renamed from: p0 */
    public void I(in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        long nanoTime = java.lang.System.nanoTime();
        super.I(holder, i17);
        long nanoTime2 = java.lang.System.nanoTime() - nanoTime;
        yb5.d dVar = this.K;
        tb5.v vVar = ((tb5.y) ((tb5.m0) dVar.f542241c.a(tb5.m0.class))).f498638f;
        int m8185xcdaf1228 = holder.m8185xcdaf1228();
        vVar.getClass();
        java.util.HashMap hashMap = vVar.f498627k;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(m8185xcdaf1228);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.ArrayList();
            hashMap.put(valueOf, obj);
        }
        ((java.util.List) obj).add(new tb5.e(m8185xcdaf1228, nanoTime2, "", vVar.f498617a, 0, 16, null));
        holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.ego, java.lang.Integer.valueOf(holder.m8185xcdaf1228()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterV3", "_onBindViewHolder[" + holder.m8185xcdaf1228() + "][" + i17 + "] cost[" + nanoTime2 + ']');
        sb5.k kVar = (sb5.k) dVar.f542241c.a(sb5.k.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo = ((rd5.d) this.I.f233598o.get(i17)).f475787d.f526833b;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s0 s0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s0) kVar;
        s0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.bkj);
        if (findViewById != null) {
            itemView = findViewById;
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20987xdf89b6bd c20987xdf89b6bd = s0Var.f281426f;
        if (c20987xdf89b6bd != null) {
            c20987xdf89b6bd.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q0(msgInfo, itemView), true);
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    /* renamed from: r0 */
    public in5.s0 M(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        in5.s0 M = super.M(parent, i17);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        tb5.v vVar = ((tb5.y) ((tb5.m0) this.K.f542241c.a(tb5.m0.class))).f498638f;
        vVar.getClass();
        java.util.HashMap hashMap = vVar.f498626j;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.ArrayList();
            hashMap.put(valueOf, obj);
        }
        ((java.util.List) obj).add(new tb5.e(i17, currentTimeMillis2, "", vVar.f498617a, 0, 16, null));
        return M;
    }

    @Override // xm3.t0, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf
    public boolean x0() {
        return false;
    }
}
