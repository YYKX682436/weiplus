package cw2;

/* loaded from: classes2.dex */
public final class f8 extends td2.b implements com.p314xaae8f345.mm.app.t2, cw2.z9 {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15190xa7437b4d A;
    public long B;

    /* renamed from: g, reason: collision with root package name */
    public final int f305232g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0 f305233h;

    /* renamed from: i, reason: collision with root package name */
    public cs2.k f305234i;

    /* renamed from: m, reason: collision with root package name */
    public ec2.i f305235m;

    /* renamed from: n, reason: collision with root package name */
    public dw2.c0 f305236n;

    /* renamed from: o, reason: collision with root package name */
    public uo2.v f305237o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f305238p;

    /* renamed from: q, reason: collision with root package name */
    public f25.m0 f305239q;

    /* renamed from: r, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f305240r;

    /* renamed from: s, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f305241s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f305242t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f305243u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f305244v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f305245w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f305246x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f305247y;

    /* renamed from: z, reason: collision with root package name */
    public int f305248z;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.video.FinderVideoCore$finderSeekEventListener$1] */
    public f8(int i17) {
        this.f305232g = i17;
        this.f305233h = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0) pf5.u.f435469a.e(zy2.b6.class).c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0.class);
        this.f305242t = true;
        this.f305245w = true;
        this.f305246x = true;
        this.f305248z = -1;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.A = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5546x36ebae9a>(a0Var) { // from class: com.tencent.mm.plugin.finder.video.FinderVideoCore$finderSeekEventListener$1
            {
                this.f39173x3fe91575 = 726298794;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5546x36ebae9a c5546x36ebae9a) {
                am.qd qdVar;
                int i18;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5546x36ebae9a event = c5546x36ebae9a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                cw2.f8 f8Var = cw2.f8.this;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = f8Var.f305240r;
                if (activityC0065xcd7aa112 != null && ((i18 = (qdVar = event.f135870g).f89240b) == 0 || i18 == activityC0065xcd7aa112.hashCode())) {
                    boolean z17 = qdVar.f89239a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0 nb0Var = f8Var.f305233h;
                    if (z17) {
                        if (qdVar.f89240b != 0) {
                            dw2.c0 c0Var = f8Var.f305236n;
                            if (c0Var != null) {
                                c0Var.X(false);
                                c0Var.w0("FinderVideoCtrlEvent");
                            }
                        } else {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) nb0Var).f7(activityC0065xcd7aa112);
                        }
                        f8Var.H0().T6();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoCore", f8Var.F0() + " resume video from event");
                    } else {
                        dw2.c0 c0Var2 = f8Var.f305236n;
                        if (c0Var2 != null) {
                            c0Var2.X(true);
                        }
                        if (!qdVar.f89241c) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) nb0Var).c7(activityC0065xcd7aa112);
                        }
                        f8Var.H0().S6();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoCore", f8Var.F0() + " pause video from event");
                    }
                }
                return true;
            }
        };
    }

    public static /* synthetic */ void L0(cw2.f8 f8Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, cw2.b8 b8Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            componentCallbacksC1101xa17d4670 = null;
        }
        if ((i17 & 4) != 0) {
            b8Var = null;
        }
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        f8Var.J0(activityC0065xcd7aa112, componentCallbacksC1101xa17d4670, b8Var, z17);
    }

    @Override // cw2.z9
    public boolean A() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoCore", F0() + " isDefaultMute: hasAudioFocus=" + this.f305242t + ", hasCareFloatBall=" + this.f305243u + " isVoiping:" + this.f305244v);
        return (!this.f305242t && this.f305243u) || this.f305244v;
    }

    @Override // cw2.z9
    public cw2.w9 C() {
        return this.f305234i;
    }

    @Override // cw2.z9
    public void D(long j17) {
        this.B = j17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1 != null ? ((g25.e) r1).f349512b : null, f25.q.f340642c) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (((r0 == null || (r0 = ((g25.e) r0).f349512b) == null || (r0 = r0.f340637a) == null) ? false : r26.i0.y(r0, "ting_", false)) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E0() {
        /*
            r6 = this;
            java.lang.Class<f25.n0> r0 = f25.n0.class
            i95.m r0 = i95.n0.c(r0)
            f25.n0 r0 = (f25.n0) r0
            f25.e r0 = r0.Vd()
            f25.m0 r1 = r0.f340626b
            r2 = 0
            if (r1 == 0) goto L16
            g25.e r1 = (g25.e) r1
            f25.l0 r1 = r1.f349512b
            goto L17
        L16:
            r1 = r2
        L17:
            f25.l r3 = f25.l.f340636c
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r3)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L36
            f25.m0 r1 = r0.f340626b
            if (r1 == 0) goto L2a
            g25.e r1 = (g25.e) r1
            f25.l0 r1 = r1.f349512b
            goto L2b
        L2a:
            r1 = r2
        L2b:
            f25.m r5 = f25.m.f340639c
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r5)
            if (r1 == 0) goto L34
            goto L36
        L34:
            r1 = r4
            goto L37
        L36:
            r1 = r3
        L37:
            boolean r5 = r0.f340625a
            if (r5 == 0) goto L78
            boolean r5 = iq.b.l(r2, r4)
            if (r5 == 0) goto L43
            if (r1 != 0) goto L79
        L43:
            kd2.o0 r1 = kd2.p1.N
            kd2.p1 r1 = r1.a()
            boolean r1 = r1.u()
            if (r1 == 0) goto L5f
            f25.m0 r1 = r0.f340626b
            if (r1 == 0) goto L57
            g25.e r1 = (g25.e) r1
            f25.l0 r2 = r1.f349512b
        L57:
            f25.q r1 = f25.q.f340642c
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r1)
            if (r1 != 0) goto L79
        L5f:
            f25.m0 r0 = r0.f340626b
            if (r0 == 0) goto L74
            g25.e r0 = (g25.e) r0
            f25.l0 r0 = r0.f349512b
            if (r0 == 0) goto L74
            java.lang.String r0 = r0.f340637a
            if (r0 == 0) goto L74
            java.lang.String r1 = "ting_"
            boolean r0 = r26.i0.y(r0, r1, r4)
            goto L75
        L74:
            r0 = r4
        L75:
            if (r0 == 0) goto L78
            goto L79
        L78:
            r3 = r4
        L79:
            r6.f305243u = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.f8.E0():void");
    }

    @Override // cw2.z9
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0 F() {
        return this.f305233h;
    }

    public final java.lang.String F0() {
        return "tabType:" + this.f305232g + '.' + hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0() {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.F0()
            r0.append(r1)
            java.lang.String r1 = " gainAudioFocus: tabType="
            r0.append(r1)
            int r1 = r10.f305232g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderVideoCore"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            r0 = 1
            r10.f305242t = r0
            androidx.appcompat.app.AppCompatActivity r1 = r10.f305240r
            boolean r2 = r1 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799
            r3 = 0
            if (r2 == 0) goto L2c
            com.tencent.mm.plugin.finder.ui.FinderHomeUI r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) r1
            goto L2d
        L2c:
            r1 = r3
        L2d:
            r2 = 0
            if (r1 == 0) goto Lc8
            pf5.z r4 = pf5.z.f435481a
            pf5.v r5 = r4.a(r1)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC> r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class
            androidx.lifecycle.c1 r5 = r5.a(r6)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) r5
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r5 = r5.m63052x8f02c6c()
            pf5.v r1 = r4.a(r1)
            androidx.lifecycle.c1 r1 = r1.a(r6)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) r1
            java.util.ArrayList r1 = r1.getFragments()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L59:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L9a
            java.lang.Object r6 = r1.next()
            r7 = r6
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) r7
            androidx.lifecycle.o r8 = r7.mo273xed6858b4()
            androidx.lifecycle.n r8 = r8.b()
            androidx.lifecycle.n r9 = p012xc85e97e9.p093xedfae76a.n.CREATED
            boolean r8 = r8.a(r9)
            if (r8 == 0) goto L93
            int r7 = r7.f210798p
            int r8 = r5.f210798p
            if (r7 == r8) goto L93
            androidx.fragment.app.Fragment r8 = r10.f305241s
            boolean r9 = r8 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180
            if (r9 == 0) goto L85
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) r8
            goto L86
        L85:
            r8 = r3
        L86:
            if (r8 == 0) goto L8e
            int r8 = r8.f210798p
            if (r7 != r8) goto L8e
            r7 = r0
            goto L8f
        L8e:
            r7 = r2
        L8f:
            if (r7 != 0) goto L93
            r7 = r0
            goto L94
        L93:
            r7 = r2
        L94:
            if (r7 == 0) goto L59
            r4.add(r6)
            goto L59
        L9a:
            java.util.Iterator r1 = r4.iterator()
        L9e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lc8
            java.lang.Object r3 = r1.next()
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) r3
            java.lang.String r4 = "fragment"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r4)
            pf5.z r4 = pf5.z.f435481a
            pf5.v r3 = r4.b(r3)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.t80> r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80.class
            pf5.b0 r3 = r3.e(r4)
            com.tencent.mm.plugin.finder.viewmodel.component.t80 r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80) r3
            if (r3 == 0) goto L9e
            cw2.f8 r3 = r3.U6()
            if (r3 == 0) goto L9e
            r3.f305242t = r0
            goto L9e
        Lc8:
            androidx.appcompat.app.AppCompatActivity r0 = r10.f305240r
            com.tencent.mm.plugin.finder.viewmodel.component.nb0 r1 = r10.f305233h
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) r1
            r1.getClass()
            com.tencent.mm.plugin.finder.viewmodel.component.pa0 r3 = new com.tencent.mm.plugin.finder.viewmodel.component.pa0
            r3.<init>(r1, r0, r2)
            pm0.v.X(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.f8.G0():void");
    }

    public final uo2.v H0() {
        uo2.v vVar = this.f305237o;
        if (vVar != null) {
            return vVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicManager");
        throw null;
    }

    @Override // cw2.z9
    public ec2.i I() {
        return this.f305235m;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I0(f25.l0 r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.f8.I0(f25.l0):void");
    }

    public final void J0(final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, cw2.b8 b8Var, boolean z17) {
        dw2.c0 c0Var;
        cs2.k kVar;
        fc2.c Y6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f305240r = context;
        this.f305241s = componentCallbacksC1101xa17d4670;
        this.f305247y = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5694x221c525a>(this) { // from class: com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ cw2.f8 f212224e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112.this);
                this.f212224e = this;
                this.f39173x3fe91575 = 1609849418;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5694x221c525a c5694x221c525a) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 P6;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5694x221c525a event = c5694x221c525a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                cw2.f8 f8Var = this.f212224e;
                f8Var.getClass();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112.this;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                pf5.z zVar = pf5.z.f435481a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b c15471x9d199e5b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b) zVar.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b.class);
                boolean z18 = c15471x9d199e5b != null && c15471x9d199e5b.P6();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class);
                java.lang.Integer valueOf = c15456x2c452bca != null ? java.lang.Integer.valueOf(c15456x2c452bca.S6()) : null;
                if ((!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) || (valueOf != null && valueOf.intValue() == f8Var.f305232g)) && !z18) {
                    cw2.da S6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) f8Var.f305233h).S6(activity);
                    cw2.wa f212289y = S6 != null ? S6.getF212289y() : null;
                    if (S6 != null && f212289y != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6 u6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6) zVar.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6.class);
                        int i17 = (u6Var == null || (P6 = u6Var.P6()) == null || !P6.b()) ? 0 : 1;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                        jz5.l[] lVarArr = new jz5.l[7];
                        lVarArr[0] = new jz5.l("view_id", "screen_shot");
                        lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
                        lVarArr[2] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
                        lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
                        lVarArr[4] = new jz5.l("feed_id", pm0.v.u(f212289y.f305632f.getFeedId()));
                        lVarArr[5] = new jz5.l("video_progress", java.lang.Long.valueOf(S6.mo56685x3d7f3f1d()));
                        lVarArr[6] = new jz5.l("is_pull_comment", java.lang.Integer.valueOf(i17));
                        ((cy1.a) rVar).yj("screenshot", null, kz5.c1.k(lVarArr), 1, false);
                    }
                }
                return true;
            }
        };
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(context).a(uo2.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f305237o = (uo2.v) a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50 m50Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50.class);
        m50Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[init] tabType=");
        int i17 = this.f305232g;
        sb6.append(i17);
        sb6.append(" limitPlayDuration=");
        sb6.append(m50Var.f216661h);
        sb6.append(" limitPlayCount=");
        sb6.append(m50Var.f216662i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SilentPlayControlUIC", sb6.toString());
        android.app.Activity context2 = m50Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        dw2.c0 c0Var2 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar != null && (Y6 = nyVar.Y6(i17)) != null) {
            Y6.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i50(m50Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0 nb0Var = this.f305233h;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) nb0Var;
        c15482x9b531b34.getClass();
        final java.lang.String valueOf = java.lang.String.valueOf(context.hashCode());
        if (c15482x9b531b34.f215214q == 0) {
            c15482x9b531b34.f215222y.mo48813x58998cd();
            jz5.l M2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.M2();
            c15482x9b531b34.f215206f = ((java.lang.Number) M2.f384366d).intValue();
            c15482x9b531b34.f215205e = ((java.lang.Boolean) M2.f384367e).booleanValue();
            int i18 = c15482x9b531b34.f215206f - 1;
            if (i18 > 4) {
                i18 = 4;
            }
            c15482x9b531b34.f215207g = i18;
            com.p314xaae8f345.mm.p1006xc5476f33.p1691x19f68a54.p1692xcfcbe9ef.C15517x99f0671 c15517x99f0671 = new com.p314xaae8f345.mm.p1006xc5476f33.p1691x19f68a54.p1692xcfcbe9ef.C15517x99f0671();
            c15482x9b531b34.f215215r = c15517x99f0671;
            android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            c15517x99f0671.b(context3, c15482x9b531b34.f215217t);
            boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Oa).mo141623x754a37bb()).r()).intValue() == 1;
            if (c15482x9b531b34.f215219v == null && z18) {
                int i19 = pu5.i.f440006b;
                android.os.HandlerThread a18 = pu5.f.a("FinderTPWorkThread", 0);
                c15482x9b531b34.f215219v = a18;
                a18.start();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "[onInit] maxVideoCount=" + c15482x9b531b34.f215206f + " preInflateCount=" + c15482x9b531b34.f215207g + " waitForRelease=" + c15482x9b531b34.f215205e + " enableFinderTpWorkThreadReuse:" + z18);
        }
        if (c15482x9b531b34.f215213p.add(valueOf)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "[register] activity=" + context.getClass().getSimpleName() + " key:" + valueOf + " activityCount:" + c15482x9b531b34.f215214q + " isPreInflate=" + z17);
            c15482x9b531b34.f215214q = c15482x9b531b34.f215214q + 1;
            context.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$make$1
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public final void m63055xac79a11b() {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onDestroy activityCount:");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b342 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.this;
                    sb7.append(c15482x9b531b342.f215214q);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", sb7.toString());
                    int i27 = c15482x9b531b342.f215214q - 1;
                    c15482x9b531b342.f215214q = i27;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context;
                    if (i27 == 0) {
                        c15482x9b531b342.Y6();
                    } else {
                        kz5.h0.A(c15482x9b531b342.f215209i, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ka0(activityC0065xcd7aa112));
                        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                        c15482x9b531b342.O6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.la0(activityC0065xcd7aa112, f0Var, c15482x9b531b342));
                        cw2.da daVar = c15482x9b531b342.f215218u;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = daVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) daVar : null;
                        if (c15188xd8bd4bd != null && c15188xd8bd4bd.getI() == activityC0065xcd7aa112.hashCode()) {
                            c15482x9b531b342.f215218u = null;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "[removeByContext] simpleName=" + activityC0065xcd7aa112.getClass().getSimpleName() + " remove recentFocusView.");
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "[removeByContext] simpleName=" + activityC0065xcd7aa112.getClass().getSimpleName() + " context:" + activityC0065xcd7aa112.hashCode() + " removeCount=" + f0Var.f391649d + " videoCount=" + c15482x9b531b342.V6(null));
                    }
                    c15482x9b531b342.f215213p.remove(valueOf);
                    activityC0065xcd7aa112.mo273xed6858b4().c(this);
                }
            });
        }
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba>(this) { // from class: com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$voipCallEvent$1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ cw2.f8 f212230e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112.this);
                this.f212230e = this;
                this.f39173x3fe91575 = -797557590;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba event = c6231x4f3054ba;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (!gm0.j1.a()) {
                    return false;
                }
                am.y00 y00Var = event.f136478g;
                int i27 = y00Var.f89948b;
                cw2.f8 f8Var = this.f212230e;
                if (i27 == 11) {
                    f8Var.f305244v = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoCore", f8Var.F0() + " onVoipStop opcode:" + y00Var.f89948b);
                    f8Var.Z();
                    cw2.da S6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) f8Var.f305233h).S6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112.this);
                    if (S6 != null) {
                        android.view.ViewParent mo56691xdfac0a65 = S6.mo56691xdfac0a65();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = mo56691xdfac0a65 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) mo56691xdfac0a65 : null;
                        S6.mo56709x764d819b(f8Var.A() || (c15196x85976f5f != null && c15196x85976f5f.isMute));
                    }
                } else if (i27 == 3 || i27 == 7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoCore", f8Var.F0() + " onVoipStart opcode:" + y00Var.f89948b);
                    f8Var.f305244v = true;
                }
                return true;
            }
        }.mo48813x58998cd();
        this.f305244v = iq.b.E() || iq.b.F(null, false) || iq.b.H();
        mo48813x58998cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoCore", "finderSeekEventListener?.alive() " + hashCode());
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae>(a0Var) { // from class: com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$2
            {
                this.f39173x3fe91575 = -616994146;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae c5705xaea272ae) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae event = c5705xaea272ae;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                dw2.c0 c0Var3 = cw2.f8.this.f305236n;
                if (c0Var3 == null) {
                    return false;
                }
                c0Var3.w0("finderMember");
                return false;
            }
        };
        this.f305238p = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
        if (b8Var != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 d17 = b8Var.d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa dataList = b8Var.mo56021xfb7e5820();
            p012xc85e97e9.p093xedfae76a.c1 a19 = pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) a19;
            fc2.c Y62 = nyVar2.Y6(i17);
            if (Y62 != null) {
                this.f305235m = new ec2.i(Y62);
            }
            int m75939xb282bd08 = nyVar2.W6(i17).m75939xb282bd08(5);
            if (b8Var.c()) {
                if (componentCallbacksC1101xa17d4670 != null) {
                    kVar = (cs2.k) pf5.z.f435481a.b(componentCallbacksC1101xa17d4670).a(cs2.k.class);
                    kVar.S6(dataList, m75939xb282bd08, i17, nyVar2.Y6(i17));
                } else {
                    kVar = (cs2.k) pf5.z.f435481a.a(context).a(cs2.k.class);
                    kVar.S6(dataList, m75939xb282bd08, i17, nyVar2.Y6(i17));
                }
                this.f305234i = kVar;
            }
            ae2.b2 b2Var = ae2.b2.f84994a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.X).mo141623x754a37bb()).r()).intValue() == 1) {
                xr2.b bVar = new xr2.b();
                fc2.c Y63 = nyVar2.Y6(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
                if (Y63 != null) {
                    Y63.a(new xr2.a(bVar, dataList));
                }
            }
            if (b8Var.a()) {
                if (d17 != null) {
                    if (m75939xb282bd08 == 155) {
                        c0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15204x9dd9b8b0((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context, d17, nb0Var, i17);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15205x28f20815 c15205x28f20815 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15205x28f20815((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context, d17, this.f305233h, b8Var.b(), H0(), this.f305232g);
                        c15205x28f20815.f212317t = new cw2.c8(this, context);
                        c0Var = c15205x28f20815;
                    }
                    c0Var2 = c0Var;
                }
                this.f305236n = c0Var2;
                if (c0Var2 != null) {
                    c0Var2.s();
                }
            }
        }
        D0((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context, new td2.c() { // from class: com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$4

            /* renamed from: d, reason: collision with root package name */
            public boolean f212226d;

            @Override // td2.c
            /* renamed from: onCreate */
            public void mo55613x3e5a77bb(p012xc85e97e9.p093xedfae76a.y var1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
            }

            @Override // td2.c
            /* renamed from: onDestroy */
            public void mo55614xac79a11b(p012xc85e97e9.p093xedfae76a.y var1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                com.p314xaae8f345.mm.app.w wVar = com.p314xaae8f345.mm.app.w.INSTANCE;
                cw2.f8 f8Var = cw2.f8.this;
                wVar.p(f8Var);
                f8Var.H0().O6();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15190xa7437b4d c15190xa7437b4d = f8Var.A;
                if (c15190xa7437b4d != null) {
                    c15190xa7437b4d.mo48814x2efc64();
                }
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = f8Var.f305238p;
                if (abstractC20980x9b9ad01d2 != null) {
                    abstractC20980x9b9ad01d2.mo48814x2efc64();
                }
                f8Var.i();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoCore", "finderSeekEventListener?.dead() " + f8Var.hashCode());
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
            @Override // td2.c
            /* renamed from: onPause */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void mo55615xb01dfb57(p012xc85e97e9.p093xedfae76a.y r7) {
                /*
                    Method dump skipped, instructions count: 255
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15193x9aa5b12f.mo55615xb01dfb57(androidx.lifecycle.y):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
            
                if ((r0.f211359v == 1) == true) goto L15;
             */
            @Override // td2.c
            /* renamed from: onResume */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void mo55616x57429eec(p012xc85e97e9.p093xedfae76a.y r6) {
                /*
                    r5 = this;
                    java.lang.String r0 = "var1"
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
                    androidx.appcompat.app.AppCompatActivity r6 = r2
                    r0 = r6
                    com.tencent.mm.ui.MMFragmentActivity r0 = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) r0
                    cw2.f8 r1 = cw2.f8.this
                    r1.getClass()
                    boolean r2 = r0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1
                    r3 = 0
                    if (r2 == 0) goto L17
                    com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1) r0
                    goto L18
                L17:
                    r0 = r3
                L18:
                    r2 = 0
                    if (r0 == 0) goto L26
                    int r0 = r0.f211359v
                    r4 = 1
                    if (r0 != r4) goto L22
                    r0 = r4
                    goto L23
                L22:
                    r0 = r2
                L23:
                    if (r0 != r4) goto L26
                    goto L27
                L26:
                    r4 = r2
                L27:
                    if (r4 == 0) goto L2a
                    return
                L2a:
                    boolean r0 = r1.f305245w
                    if (r0 == 0) goto L44
                    r1.E0()
                    r1.Z()
                    r5.f212226d = r2
                    com.tencent.mm.plugin.finder.viewmodel.component.nb0 r0 = r1.f305233h
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) r0
                    r0.f7(r6)
                    uo2.v r6 = r1.H0()
                    r6.T6()
                L44:
                    com.tencent.mm.sdk.event.IListener r6 = r1.f305247y
                    java.lang.String r0 = "screenShotEvent"
                    if (r6 == 0) goto L59
                    r6.mo48814x2efc64()
                    com.tencent.mm.sdk.event.IListener r6 = r1.f305247y
                    if (r6 == 0) goto L55
                    r6.mo48813x58998cd()
                    return
                L55:
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r0)
                    throw r3
                L59:
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r0)
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15193x9aa5b12f.mo55616x57429eec(androidx.lifecycle.y):void");
            }

            @Override // td2.c
            /* renamed from: onStart */
            public void mo55617xb05099c3(p012xc85e97e9.p093xedfae76a.y var1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
            }

            @Override // td2.c
            /* renamed from: onStop */
            public void mo55618xc39f8281(p012xc85e97e9.p093xedfae76a.y var1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                boolean z19 = this.f212226d;
                cw2.f8 f8Var = cw2.f8.this;
                if (z19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoCore", f8Var.F0() + " onStop hasBlockPauseAction true, pause focus video again");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) f8Var.f305233h).c7(context);
                    f8Var.H0().S6();
                }
                f8Var.i();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    @Override // cw2.z9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Z() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.f8.Z():void");
    }

    @Override // cw2.z9
    public void c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) this.f305233h).c7(context);
        H0().S6();
        android.app.Activity activity = (android.app.Activity) context;
        pf5.z zVar = pf5.z.f435481a;
        if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class)).f216047p) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.f216037z = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "resumeFromClickFloatBallAndBack:false");
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f305247y;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("screenShotEvent");
            throw null;
        }
    }

    @Override // cw2.z9
    public void g(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        E0();
        Z();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) this.f305233h).f7(context);
        H0().T6();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f305247y;
        if (abstractC20980x9b9ad01d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("screenShotEvent");
            throw null;
        }
        abstractC20980x9b9ad01d.mo48814x2efc64();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = this.f305247y;
        if (abstractC20980x9b9ad01d2 != null) {
            abstractC20980x9b9ad01d2.mo48813x58998cd();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("screenShotEvent");
            throw null;
        }
    }

    @Override // cw2.z9
    public void i() {
        f25.m0 m0Var = this.f305239q;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
    }

    @Override // cw2.z9
    public void j0() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) this.f305233h).a7(cw2.d8.f305186d);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) this.f305233h).c7(null);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
    }

    @Override // cw2.z9
    public dw2.c0 v() {
        return this.f305236n;
    }

    public /* synthetic */ f8(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? -1 : i17);
    }
}
