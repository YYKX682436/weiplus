package co0;

/* loaded from: classes3.dex */
public abstract class s extends tn0.w0 implements co0.d, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 {
    public final com.p314xaae8f345.mm.app.t2 P1;
    public com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf Q1;
    public final hn0.r R1;
    public int S1;
    public int T1;
    public int U1;
    public int V1;
    public android.os.Bundle W1;
    public float X1;
    public boolean Y1;
    public boolean Z1;

    /* renamed from: a2, reason: collision with root package name */
    public boolean f125266a2;

    /* renamed from: b2, reason: collision with root package name */
    public final co0.i f125267b2;

    /* renamed from: c2, reason: collision with root package name */
    public int f125268c2;

    public s(boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(false, (i17 & 1) != 0 ? false : z17);
        this.R1 = new hn0.r();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_seireport_interval, 5);
        if (Ni > 0) {
            this.K = Ni;
        }
        co0.h hVar = new co0.h(this);
        this.P1 = hVar;
        com.p314xaae8f345.mm.app.w.INSTANCE.a(hVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "get sei report interval:" + Ni + ", final:" + this.K);
        this.f125267b2 = new co0.i(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c1(co0.s r7, boolean r8) {
        /*
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            int r0 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(r0)
            r1 = -1
            r2 = 15
            r3 = 2
            r4 = 0
            if (r0 != r1) goto L15
            hn0.i r7 = r7.A
            if (r7 == 0) goto L4f
            hn0.i.a(r7, r2, r4, r3, r4)
            goto L4f
        L15:
            r0 = 0
            if (r8 == 0) goto L3c
            hn0.r r8 = r7.R1
            java.lang.String r8 = r8.f()
            hn0.r r1 = r7.R1
            int r5 = r1.f363953l
            r6 = 1
            if (r5 != 0) goto L35
            int r5 = r8.length()
            if (r5 != 0) goto L2d
            r5 = r6
            goto L2e
        L2d:
            r5 = r0
        L2e:
            if (r5 != 0) goto L38
            r1.p(r8)
            r8 = r6
            goto L39
        L35:
            r1.k(r0)
        L38:
            r8 = r0
        L39:
            if (r8 == 0) goto L3c
            r0 = r6
        L3c:
            if (r0 == 0) goto L48
            hn0.i r7 = r7.A
            if (r7 == 0) goto L4f
            r8 = 26
            hn0.i.a(r7, r8, r4, r3, r4)
            goto L4f
        L48:
            hn0.i r7 = r7.A
            if (r7 == 0) goto L4f
            hn0.i.a(r7, r2, r4, r3, r4)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co0.s.c1(co0.s, boolean):void");
    }

    @Override // tn0.w0
    public void B(java.lang.Boolean bool) {
        boolean z17 = false;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            vn0.e eVar = this.f502297m;
            if (eVar != null) {
                eVar.f519716a.mo30373xf191f742(false);
                return;
            }
            return;
        }
        vn0.e eVar2 = this.f502297m;
        if (eVar2 != null) {
            if (fn0.g.f345729b != null) {
                if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R).mo141623x754a37bb()).r()).intValue() == 1) {
                    z17 = true;
                }
            }
            eVar2.f519716a.mo30373xf191f742(!z17);
        }
    }

    @Override // tn0.w0
    public void E(hn0.i callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.E(callback);
        android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80602xaca7263b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
        N0(pm0.v.o(drawable, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1280, android.graphics.Bitmap.Config.ARGB_8888), 5);
        vn0.c cVar = vn0.b.f519707a;
        cVar.d().getClass();
        cVar.a().getClass();
    }

    @Override // tn0.w0
    public int G(jn0.a params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("floatMode isAudioMode:");
        kn0.p pVar = this.D;
        sb6.append(pVar.e());
        sb6.append(" inVideoMic:");
        sb6.append(pVar.f391116c == kn0.j.f391097f);
        sb6.append(" inAudioMic:");
        sb6.append(pVar.f391116c == kn0.j.f391096e);
        sb6.append(" isCdnMode:");
        sb6.append(a1());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", sb6.toString());
        if (pVar.f()) {
            return 0;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        pVar.f391117d = kn0.m.f391107e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveStatus", "liveStatusModeChange changeToFloatMode");
        i1(params.f382013f, elapsedRealtime, params.f382014g, params.f382015h);
        mn0.b0 b0Var = this.R1.f363942a;
        if (b0Var != null) {
            ((mn0.y) b0Var).a(this.f502300p);
        }
        super.G(params);
        return 0;
    }

    @Override // tn0.w0
    public fo0.n O() {
        return this.f502300p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void S0(int i17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, yz5.l lVar) {
        mn0.b0 b0Var;
        java.lang.String str;
        mn0.b0 b0Var2;
        hn0.r rVar = this.R1;
        kn0.g gVar = rVar.f363943b;
        java.lang.String e17 = gVar != null ? gVar.e(rVar.f363946e) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPlay: liveId=");
        kn0.g gVar2 = rVar.f363943b;
        sb6.append(gVar2 != null ? java.lang.Long.valueOf(gVar2.f391068b) : null);
        sb6.append(",player=");
        sb6.append(rVar.f363942a);
        sb6.append(", playerView=");
        sb6.append(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
        sb6.append(",url is null:");
        sb6.append(e17 == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", sb6.toString());
        if (e17 != null && (b0Var = rVar.f363942a) != null) {
            if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mn0.y) b0Var).o(), scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) && (b0Var2 = rVar.f363942a) != null) {
                mn0.b0.B(b0Var2, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, null, 2, null);
            }
            mn0.b0 b0Var3 = rVar.f363942a;
            if ((b0Var3 == null || ((mn0.y) b0Var3).b(false)) ? false : true) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("startPlay liveId:");
                kn0.g gVar3 = rVar.f363943b;
                sb7.append(gVar3 != null ? java.lang.Long.valueOf(gVar3.f391068b) : null);
                sb7.append(", player:");
                sb7.append(rVar.f363942a);
                sb7.append(", url:");
                sb7.append(e17);
                sb7.append(", enableP2P:");
                kn0.g gVar4 = rVar.f363943b;
                sb7.append(gVar4 != null ? java.lang.Boolean.valueOf(gVar4.f391085s) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", sb7.toString());
                mn0.b0 b0Var4 = rVar.f363942a;
                if (b0Var4 != null) {
                    java.lang.String d17 = ko0.t.f391436a.d(e17);
                    if (d17 == null) {
                        d17 = "";
                    }
                    java.lang.String str2 = d17;
                    kn0.g gVar5 = rVar.f363943b;
                    if (gVar5 == null || (str = gVar5.f391082p) == null) {
                        str = "NULL";
                    }
                    ((mn0.y) b0Var4).N(new mn0.l0(str2, str, gVar5 != null ? gVar5.f391068b : 0L, rVar.f363962u, 0L, rVar.f363964w));
                }
                mn0.b0 b0Var5 = rVar.f363942a;
                if (b0Var5 != null) {
                    kn0.g gVar6 = rVar.f363943b;
                    r45.ka4 ka4Var = gVar6 != null ? gVar6.f391081o : null;
                    r45.p72 g17 = rVar.g();
                    kn0.g gVar7 = rVar.f363943b;
                    mn0.b0.D(b0Var5, e17, i17, ka4Var, g17, false, gVar7 != null ? gVar7.f391085s : false, 16, null);
                }
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                }
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("refresh palyView liveId:");
                kn0.g gVar8 = rVar.f363943b;
                sb8.append(gVar8 != null ? java.lang.Long.valueOf(gVar8.f391068b) : null);
                sb8.append(", player:");
                sb8.append(rVar.f363942a);
                sb8.append(", enableP2P:");
                kn0.g gVar9 = rVar.f363943b;
                sb8.append(gVar9 != null ? java.lang.Boolean.valueOf(gVar9.f391085s) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", sb8.toString());
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                }
            }
        } else if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        this.T1 = i17;
    }

    public void T0(boolean z17) {
        this.R1.k(z17);
    }

    public final boolean U0() {
        hn0.r rVar = this.R1;
        if (rVar.f363953l == 0) {
            java.lang.String f17 = rVar.f();
            if (f17.length() == 0) {
                return false;
            }
            rVar.p(f17);
        }
        return true;
    }

    public final mn0.b0 V0() {
        return this.R1.f363942a;
    }

    public final void W0() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("force restart play, streamType:");
        sb6.append(this.T1);
        sb6.append(", isOnP2P:");
        hn0.r rVar = this.R1;
        mn0.b0 b0Var = rVar.f363942a;
        if (b0Var == null || (str = ((mn0.y) b0Var).f411349r) == null) {
            str = "";
        }
        sb6.append(ko0.t.f391436a.g(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", sb6.toString());
        hn0.r.r(rVar, this.T1, null, 2, null);
    }

    @Override // tn0.w0
    public boolean X() {
        vn0.e eVar = this.f502297m;
        return eVar != null && eVar.f519718c == 20;
    }

    public final android.app.Activity X0(android.view.View view) {
        if (view == null) {
            return null;
        }
        if (!(view.getContext() instanceof android.app.Activity)) {
            android.view.ViewParent parent = view.getParent();
            return X0(parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null);
        }
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return (android.app.Activity) context;
    }

    public mn0.b0 Y0(android.content.Context context, com.p314xaae8f345.p2926x359365.C25484xcc963946 c25484xcc963946, co0.c cVar, boolean z17) {
        r45.ka4 ka4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        hn0.r rVar = this.R1;
        rVar.getClass();
        if (rVar.f363942a == null) {
            int i17 = 0;
            rVar.f363958q = 0;
            if (z17) {
                rVar.f363959r = 2;
                rVar.f363958q = 1;
                i17 = 1;
            } else {
                kn0.g gVar = rVar.f363943b;
                int X = ((gVar == null || (ka4Var = gVar.f391081o) == null) ? 0 : ka4Var.Y) > 0 ? nn0.c.X(true) : 0;
                rVar.f363959r = X;
                if (X == 5 || X == 6) {
                    rVar.f363958q = 1;
                    i17 = 2;
                } else {
                    rVar.f363958q = 1;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "customRenderInfo:" + rVar.f363959r + ",bUseTXLivePlayerCustomRender:" + rVar.f363958q + ",customRenderMode:" + i17);
            kn0.g gVar2 = rVar.f363943b;
            if (gVar2 != null) {
                gVar2.f391083q = rVar.f363958q;
                gVar2.f391084r = rVar.f363959r;
            }
            mn0.b0 N6 = rVar.f363958q > 0 ? ((im2.g4) ((vd2.f5) pf5.u.f435469a.e(s40.w0.class).c(vd2.f5.class))).N6(context, i17) : new mn0.z(context);
            rVar.f363942a = N6;
            rVar.f363954m = c25484xcc963946;
            rVar.f363957p = cVar;
            ((mn0.y) N6).K(mn0.d0.f411243f, 1);
            mn0.b0 b0Var = rVar.f363942a;
            if (b0Var != null) {
                ((mn0.y) b0Var).J(this);
            }
            mn0.b0 b0Var2 = rVar.f363942a;
            if (b0Var2 != null) {
                ((mn0.y) b0Var2).f(true);
            }
            if (hn0.w.f363976a.a("txLivePlayer")) {
                rVar.f363955n = 1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "set HEVC soft dec, vcodec2DecSupport:" + rVar.f363955n);
            rVar.u();
            mn0.b0 b0Var3 = rVar.f363942a;
            if (b0Var3 != null) {
                ((mn0.y) b0Var3).Q(1);
            }
            if (!rVar.f363965x.isEmpty()) {
                rVar.a();
            }
        }
        return rVar.f363942a;
    }

    public abstract boolean Z0();

    @Override // tn0.w0
    public void a0() {
        super.a0();
        mn0.b0 b0Var = this.R1.f363942a;
        if (b0Var != null) {
            ((mn0.y) b0Var).x(this.f502300p);
        }
    }

    public final boolean a1() {
        kn0.g gVar;
        java.lang.Integer num = this.f502301p0;
        if (num == null) {
            kn0.i iVar = this.C;
            if (iVar == null || (gVar = iVar.f391091b) == null || gVar.f391069c != 1) {
                return false;
            }
        } else if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final void b1(long j17, mn0.b0 b0Var, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "cdnPlayAvailable liveId:" + j17 + ",player:" + b0Var);
        this.Q1 = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
    }

    @Override // tn0.w0, vn0.f
    public void c(java.lang.String str, int i17, int i18, int i19) {
        super.c(str, i17, i18, i19);
        if (this.U != 1) {
            if ((com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x > com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y) == (i18 > i19)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "updateFillMode to SCALE_TYPE_CENTER_CROP");
                go0.q1 g17 = U().g(str);
                if (g17 != null) {
                    g17.e(2);
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "updateFillMode to SCALE_TYPE_FIT_MODE");
            go0.q1 g18 = U().g(str);
            if (g18 != null) {
                g18.e(5);
            }
        }
    }

    @Override // tn0.w0, fo0.a
    public fo0.b d() {
        return new co0.j(this);
    }

    public void d1() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.LiveCoreVisitor", "pauseRender", new java.lang.Object[0]);
        zn0.a0 U = U();
        kn0.p pVar = this.D;
        java.lang.String str = pVar.f391119f;
        if (U.f555832c) {
            U.r(str);
        } else if (!str.equals(U.f555835f)) {
            U.f555831b.mo30411xb8f95dad(str);
        }
        zn0.y yVar = zn0.x.f555947a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        yVar.h(str == null ? "" : str);
        U.q(str, 0);
        U().f555831b.mo30298x7fb62b57(pVar.f391119f, true);
    }

    @Override // tn0.w0, vn0.f
    public void e(long j17) {
        super.e(j17);
        this.f502292f.mo50293x3498a0(this.f125267b2);
    }

    public abstract void e1(boolean z17);

    public void f1(boolean z17) {
        this.Y1 = z17;
        if (this.Z1 && g1()) {
            e1(true);
        } else {
            e1(z17);
        }
    }

    public abstract boolean g1();

    @Override // tn0.w0
    public void h0() {
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1;
        mn0.b0 b0Var;
        kn0.g gVar;
        kn0.p pVar = this.D;
        if (pVar.i()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("normalMode playerView is empty:");
        sb6.append(this.Q1 == null);
        sb6.append(", liveId:");
        kn0.i iVar = this.C;
        sb6.append((iVar == null || (gVar = iVar.f391091b) == null) ? null : java.lang.Long.valueOf(gVar.f391068b));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", sb6.toString());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = this.Q1;
        hn0.r rVar = this.R1;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null && !pVar.k()) {
            mn0.b0 b0Var2 = rVar.f363942a;
            if (b0Var2 != null) {
                mn0.b0.B(b0Var2, this.Q1, null, 2, null);
            }
            com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2 = this.Q1;
            mn0.b0 b0Var3 = rVar.f363942a;
            ls5.d dVar = b0Var3 != null ? ((mn0.y) b0Var3).f411340f : null;
            if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2 != null && dVar != null) {
                dVar.b(null);
                dVar.f402658e = "";
            }
        }
        mn0.b0 b0Var4 = rVar.f363942a;
        if (((b0Var4 == null || ((mn0.y) b0Var4).b(false)) ? false : true) && (b0Var = rVar.f363942a) != null) {
            ((mn0.y) b0Var).y();
        }
        pVar.a();
        go0.q1 g17 = U().g(pVar.f391119f);
        if (g17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "normalMode, find renderSurface for userId:" + pVar.f391119f);
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e12 = this.f502307u;
            com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf c17 = c10849x610a91e12 != null ? c10849x610a91e12.c(g17.f355353d, g17.f355354e) : null;
            if (c17 != null) {
                android.view.TextureView textureView = new android.view.TextureView(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                c17.mo46533x473bda1f(textureView);
                textureView.setSurfaceTextureListener(new co0.k(g17, elapsedRealtime));
            }
        }
        if ((pVar.f391116c == kn0.j.f391097f) && (c10849x610a91e1 = this.f502307u) != null) {
            c10849x610a91e1.f(new co0.l(this), new co0.m(this));
        }
        pVar.a();
        if (pVar.f391122i) {
            return;
        }
        Q().f502232b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h1(kn0.g r8) {
        /*
            r7 = this;
            hn0.r r0 = r7.R1
            r0.f363943b = r8
            hn0.a[] r1 = hn0.a.f363915d
            r1 = 0
            r0.f363946e = r1
            r2 = 0
            if (r8 == 0) goto L13
            int r3 = r8.f391074h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L14
        L13:
            r3 = r2
        L14:
            if (r3 == 0) goto L1c
            int r3 = r3.intValue()
            r0.f363946e = r3
        L1c:
            r3 = 1
            if (r8 == 0) goto L32
            boolean r4 = r8.b()
            if (r4 == 0) goto L2f
            int r4 = r8.f391076j
            int r4 = r8.i(r4)
            r0.f363946e = r4
            r4 = r3
            goto L33
        L2f:
            r4 = -1
            r8.f391076j = r4
        L32:
            r4 = r1
        L33:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "setupLiveRoomInfo cdnQualitySvrcfg:"
            r5.<init>(r6)
            if (r8 == 0) goto L43
            int r6 = r8.f391074h
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L44
        L43:
            r6 = r2
        L44:
            r5.append(r6)
            java.lang.String r6 = ",CDN_QUALITY_HD:0, lastCdnQuality:"
            r5.append(r6)
            int r6 = r0.f363946e
            r5.append(r6)
            java.lang.String r6 = ",cdnCustomerSwitchCfg:"
            r5.append(r6)
            if (r8 == 0) goto L5e
            int r2 = r8.f391076j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L5e:
            r5.append(r2)
            java.lang.String r2 = ",cdnCustomerSwitchCfgEnable:"
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r4 = "MicroMsg.LiveCdnPlayerManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r2)
            if (r8 == 0) goto L7b
            r45.ka4 r2 = r8.f391081o
            if (r2 == 0) goto L7b
            int r2 = r2.Y
            goto L7c
        L7b:
            r2 = r1
        L7c:
            if (r2 <= 0) goto L82
            int r1 = nn0.c.X(r3)
        L82:
            r0.f363959r = r1
            r0.f363958q = r3
            if (r8 == 0) goto L8e
            long r2 = (long) r3
            r8.f391083q = r2
            long r0 = (long) r1
            r8.f391084r = r0
        L8e:
            java.lang.String r8 = "liveRoomInfo setupLiveRoomInfo"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co0.s.h1(kn0.g):void");
    }

    public final void i1(android.graphics.Bitmap bitmap, long j17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c c16524xfd73a13c) {
        kn0.p pVar = this.D;
        kn0.j jVar = pVar.f391116c;
        boolean z18 = true;
        if (!(jVar == kn0.j.f391097f)) {
            if (!(jVar == kn0.j.f391096e) && a1() && !pVar.h()) {
                z18 = false;
            }
        }
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = this.Q1;
        hn0.r rVar = this.R1;
        mn0.b0 b0Var = rVar.f363942a;
        ls5.d dVar = b0Var != null ? ((mn0.y) b0Var).f411340f : null;
        fo0.n nVar = this.f502300p;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null && dVar != null) {
            dVar.b(nVar.f346357h);
            android.app.Activity X0 = X0(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
            if (X0 != null) {
                ms5.f fVar = ms5.f.f412691a;
                java.lang.String key = X0.getClass().getSimpleName() + '_' + X0.hashCode();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
                dVar.f402658e = key;
            }
        }
        if (pVar.e() && z18) {
            android.widget.ImageView imageView = new android.widget.ImageView(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(bitmap);
            nVar.c(imageView);
            return;
        }
        if (z18) {
            go0.q1 g17 = U().g(pVar.f391119f);
            if (g17 == null || Z() || fn0.g.f345728a.g()) {
                return;
            }
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = this.f502307u;
            com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf c17 = c10849x610a91e1 != null ? c10849x610a91e1.c(g17.f355353d, g17.f355354e) : null;
            if (c17 != null) {
                c17.mo46537xcd50899c();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "enter float mode");
            g17.c(new go0.n1(g17));
            g17.e(2);
            android.view.TextureView textureView = new android.view.TextureView(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            textureView.setSurfaceTextureListener(new co0.p(this, g17, j17));
            nVar.c(textureView);
            return;
        }
        mn0.b0 b0Var2 = rVar.f363942a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "setupMiniWindowRenderView player:" + b0Var2 + ", isFluentFloatShow:" + z17 + " adVideoView:" + c16524xfd73a13c);
        if (z17) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            nVar.c(new mo0.a(context));
        } else {
            com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2 = new com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (b0Var2 != null) {
                ((mn0.y) b0Var2).Q(0);
            }
            nVar.c(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2);
            if (b0Var2 != null) {
                mn0.b0.B(b0Var2, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2, null, 2, null);
            }
        }
        if (c16524xfd73a13c != null) {
            nVar.b(c16524xfd73a13c);
        }
    }

    public void j1() {
        d0(true);
        c0(false);
        hn0.h.i(this, null, 0, 2, null);
        this.f502304r.h(null);
        D(false);
        this.E = false;
        H0();
        kn0.p pVar = this.D;
        pVar.getClass();
        pVar.f391116c = kn0.j.f391096e;
    }

    @Override // tn0.w0, vn0.f
    public void l(java.lang.String str, int i17) {
        super.l(str, i17);
    }

    @Override // tn0.w0
    public void m0() {
        super.m0();
        this.f502292f.mo50300x3fa464aa(this.f125267b2);
        com.p314xaae8f345.mm.app.w.INSTANCE.p(this.P1);
    }

    @Override // hn0.h
    public int n() {
        this.f502304r.h(co0.q.f125264d);
        D(true);
        this.E = true;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00c8, code lost:
    
        if (r9 == 3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ea  */
    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo15382x3bee38d0(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co0.s.mo15382x3bee38d0(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0314  */
    /* renamed from: onPlayEvent */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo15376x8cd414a7(int r30, android.os.Bundle r31) {
        /*
            Method dump skipped, instructions count: 2002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co0.s.mo15376x8cd414a7(int, android.os.Bundle):void");
    }

    @Override // tn0.w0, vn0.f
    public void q(java.util.ArrayList arrayList, int i17) {
        super.q(arrayList, i17);
        java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>();
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVolumeInfo tRTCVolumeInfo = (com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVolumeInfo) it.next();
                java.lang.String userId = tRTCVolumeInfo.f57187xce2b2e46;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userId, "userId");
                arrayList2.add(new com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p824x633fb29.C10829x94b03533(userId, tRTCVolumeInfo.f57188xcfaae71a, tRTCVolumeInfo.vad));
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("live_user_volume_info", arrayList2);
        hn0.i iVar = this.A;
        if (iVar != null) {
            iVar.mo57125xf5bc2045(19, bundle);
        }
    }

    @Override // tn0.w0
    public void w0(int i17) {
        super.w0(i17);
        if (pm0.v.z(i17, 4)) {
            T0(false);
        }
    }

    @Override // tn0.w0
    public void x0(hn0.i iVar) {
        android.os.Bundle bundle;
        this.A = iVar;
        if (iVar == null || (bundle = this.W1) == null) {
            return;
        }
        mn0.b0 b0Var = this.R1.f363942a;
        boolean z17 = false;
        if (b0Var != null && ((mn0.y) b0Var).b(false)) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "setLiveStatusCallback: notify tmp resolution, param=" + bundle);
            pm0.v.X(new co0.o(this, bundle));
        }
        this.W1 = null;
    }
}
