package df2;

/* loaded from: classes3.dex */
public final class cn extends df2.de implements df2.l9 {
    public long A;
    public boolean B;
    public int C;
    public boolean D;
    public r45.k62 E;
    public sh2.d F;
    public boolean G;
    public r45.qq1 H;
    public r45.wm2 I;

    /* renamed from: J, reason: collision with root package name */
    public java.util.LinkedList f311424J;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f311425p;

    /* renamed from: q, reason: collision with root package name */
    public final int f311426q;

    /* renamed from: r, reason: collision with root package name */
    public final long f311427r;

    /* renamed from: s, reason: collision with root package name */
    public final long f311428s;

    /* renamed from: t, reason: collision with root package name */
    public long f311429t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f311430u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f311431v;

    /* renamed from: w, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f311432w;

    /* renamed from: x, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f311433x;

    /* renamed from: y, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f311434y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zm f311435z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311425p = "LiveLikeRecommendController";
        this.f311426q = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;
        this.f311427r = 5000L;
        this.f311428s = 1000L;
        this.f311430u = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f311431v = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f311432w = new p012xc85e97e9.p093xedfae76a.j0();
        this.A = 5000L;
        this.f311424J = new java.util.LinkedList();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7(df2.cn r8) {
        /*
            r8.q7()
            com.tencent.mm.plugin.finder.live.view.ub r0 = r8.f372632e
            boolean r1 = r0 instanceof android.widget.RelativeLayout
            r2 = 0
            if (r1 == 0) goto Ld
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto La5
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            androidx.lifecycle.c1 r8 = r8.m56788xbba4bfc0(r1)
            mm2.c1 r8 = (mm2.c1) r8
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f410379n
            java.lang.Class<zy2.s6> r1 = zy2.s6.class
            i95.m r1 = i95.n0.c(r1)
            if (r8 == 0) goto La5
            if (r1 == 0) goto La5
            zy2.s6 r1 = (zy2.s6) r1
            zy2.r6 r3 = new zy2.r6
            r3.<init>()
            r4 = 0
            r3.f559083a = r4
            r5 = 1
            r3.f559084b = r5
            int r6 = r8.m76805x2dd7a70f()
            r3.f559085c = r6
            r3.f559086d = r4
            boolean r6 = com.p314xaae8f345.mm.ui.bk.C()
            r6 = r6 ^ r5
            r3.f559087e = r6
            r3.f559088f = r4
            r3.f559089g = r4
            r3.f559091i = r8
            df2.zm r6 = df2.zm.f313511d
            ht2.y0 r1 = (ht2.y0) r1
            java.lang.String r7 = "playLikeFloatPagView"
            android.view.View r7 = r0.findViewWithTag(r7)
            if (r7 != 0) goto L90
            r1.vj(r8)
            r45.dm2 r8 = r8.m76806xdef68064()
            if (r8 == 0) goto L98
            r7 = 27
            com.tencent.mm.protobuf.f r8 = r8.m75936x14adae67(r7)
            r45.vl2 r8 = (r45.vl2) r8
            if (r8 == 0) goto L98
            r7 = 2
            com.tencent.mm.protobuf.f r8 = r8.m75936x14adae67(r7)
            r45.ul2 r8 = (r45.ul2) r8
            if (r8 == 0) goto L98
            java.lang.String r8 = r8.m75945x2fec8307(r4)
            if (r8 == 0) goto L98
            int r7 = r8.length()
            if (r7 <= 0) goto L7c
            r7 = r5
            goto L7d
        L7c:
            r7 = r4
        L7d:
            if (r7 == 0) goto L80
            goto L81
        L80:
            r8 = r2
        L81:
            if (r8 == 0) goto L98
            cu2.f0 r7 = cu2.f0.f303924a
            r45.tl2 r8 = r7.c(r8)
            if (r8 != 0) goto L8c
            goto L98
        L8c:
            r1.oj(r0, r8, r2, r3)
            goto L97
        L90:
            java.lang.String r8 = "Finder.DynamicIconResService"
            java.lang.String r4 = "Animation is not finish!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r8, r4)
        L97:
            r4 = r5
        L98:
            if (r4 != 0) goto La2
            ht2.p r8 = new ht2.p
            r8.<init>(r3, r1, r6)
            r1.Zi(r0, r3, r8)
        La2:
            r6.mo146xb9724478(r2)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.cn.m7(df2.cn):void");
    }

    @Override // df2.l9
    public void b5() {
        n7("autoDismiss", false);
    }

    @Override // df2.l9
    /* renamed from: getTag */
    public java.lang.String mo124177xb5887064() {
        return this.f311425p;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n7(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[dismissBubble] scene = "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = ", onViewUnMount = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r4.f311425p
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            androidx.lifecycle.j0 r0 = r4.f311432w
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L3a
            android.view.View r6 = r4.f7(r4)
            r3 = 0
            if (r6 == 0) goto L2f
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L2f
            r3 = r1
        L2f:
            if (r3 != 0) goto L32
            goto L3a
        L32:
            java.lang.Object r6 = r0.mo3195x754a37bb()
            r0.mo523x53d8522f(r6)
            goto L3d
        L3a:
            r0.mo523x53d8522f(r2)
        L3d:
            r4.a7(r5, r4)
            kotlinx.coroutines.r2 r5 = r4.f311433x
            if (r5 == 0) goto L47
            p3325xe03a0797.p3326xc267989b.p2.a(r5, r2, r1, r2)
        L47:
            kotlinx.coroutines.r2 r5 = r4.f311434y
            if (r5 == 0) goto L4e
            p3325xe03a0797.p3326xc267989b.p2.a(r5, r2, r1, r2)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.cn.n7(java.lang.String, boolean):void");
    }

    public final java.lang.String o7() {
        java.util.LinkedList m75941xfb821914;
        r45.qq1 qq1Var = this.H;
        return (qq1Var == null || (m75941xfb821914 = qq1Var.m75941xfb821914(0)) == null) ? "" : kz5.n0.g0(m75941xfb821914, "#", null, null, 0, null, df2.om.f312521d, 30, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        this.G = false;
        this.H = null;
        super.mo14860x9606ce3f();
    }

    @Override // df2.de, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        r45.ch1 ch1Var;
        r45.up1 up1Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        super.mo14867x5aa1c816(r71Var);
        if (r71Var == null || (m75941xfb821914 = r71Var.m75941xfb821914(14)) == null) {
            ch1Var = null;
        } else {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.ch1) obj).m75939xb282bd08(1) == 20123) {
                        break;
                    }
                }
            }
            ch1Var = (r45.ch1) obj;
        }
        boolean z17 = ch1Var != null;
        java.lang.String str = this.f311425p;
        if (z17) {
            dk2.tb tbVar = dk2.ef.f314925k;
            tbVar.f(42);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[startPollingFriendLikeMsg] data = ");
            r45.wm2 wm2Var = this.I;
            sb6.append(wm2Var != null ? pm0.b0.g(wm2Var) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            r45.dj6 dj6Var = new r45.dj6();
            dj6Var.set(0, this.I);
            tbVar.e(42, dj6Var, new df2.bn(this, r45.ej6.class), false);
        }
        long m75942xfb822ef2 = (r71Var == null || (up1Var = (r45.up1) r71Var.m75936x14adae67(32)) == null) ? 0L : up1Var.m75942xfb822ef2(9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onLiveMsg] realname_like_live_flag = " + m75942xfb822ef2);
        this.D = pm0.v.A(m75942xfb822ef2, (long) 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        r45.ta4 e17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        r45.l62 l62Var;
        r45.ic1 ic1Var;
        super.mo14863x39a513b7(hc1Var);
        r45.wm2 wm2Var = null;
        r45.vl2 vl2Var = (hc1Var == null || (ic1Var = (r45.ic1) hc1Var.m75936x14adae67(85)) == null) ? null : (r45.vl2) ic1Var.m75936x14adae67(23);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410379n;
        java.lang.String str = this.f311425p;
        if (vl2Var != null && c19792x256d2725 != null) {
            r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
            if (m76806xdef68064 == null) {
                m76806xdef68064 = new r45.dm2();
            }
            c19792x256d2725.m76899x71cce6d8(m76806xdef68064);
            r45.dm2 m76806xdef680642 = c19792x256d2725.m76806xdef68064();
            if (m76806xdef680642 != null) {
                m76806xdef680642.set(27, vl2Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onLiveStart] update dynamicResourceKeySet = " + vl2Var);
            }
        }
        if (hc1Var != null && (l62Var = (r45.l62) hc1Var.m75936x14adae67(84)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[likeBtn] = " + pm0.b0.g(l62Var));
            r45.j62 j62Var = (r45.j62) l62Var.m75936x14adae67(0);
            if (j62Var != null) {
                this.f311430u.mo7808x76db6cb1(java.lang.Boolean.valueOf(j62Var.m75933x41a8a7f2(1)));
                this.B = j62Var.m75933x41a8a7f2(0);
                this.C = j62Var.m75939xb282bd08(3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onLiveStart] grayout_realname_like_button = " + j62Var.m75933x41a8a7f2(2) + " iconType = " + this.C);
                this.D = j62Var.m75933x41a8a7f2(2);
            }
            r45.qq1 qq1Var = (r45.qq1) l62Var.m75936x14adae67(1);
            if (qq1Var != null) {
                java.util.LinkedList m75941xfb821914 = qq1Var.m75941xfb821914(0);
                if (!(!(m75941xfb821914 == null || m75941xfb821914.isEmpty()))) {
                    qq1Var = null;
                }
                if (qq1Var != null) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    r45.ch1 ch1Var = new r45.ch1();
                    ch1Var.set(1, 1000067);
                    ch1Var.set(4, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(qq1Var.mo14344x5f01b1f6()));
                    dk2.j jVar = new dk2.j(ch1Var);
                    java.lang.Object D = jVar.D();
                    this.H = D instanceof r45.qq1 ? (r45.qq1) D : null;
                    linkedList.add(jVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.class);
                    if (mgVar != null) {
                        mgVar.I1(linkedList);
                    }
                }
            }
            r45.k62 k62Var = (r45.k62) l62Var.m75936x14adae67(2);
            if (k62Var != null) {
                int m75939xb282bd08 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).I7().m75939xb282bd08(2);
                boolean z17 = k62Var.m75933x41a8a7f2(3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "clientBubble set: " + pm0.b0.g(k62Var));
                if (zl2.q4.f555466a.E()) {
                    android.content.Context O6 = O6();
                    int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O6);
                    e4Var.f293309c = "收到点赞气泡配置了!, " + z17 + ", " + m75939xb282bd08 + '}';
                    e4Var.c();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "clientBubble set: roleType = " + m75939xb282bd08 + ", show_after_joinlive=" + z17);
                if (z17) {
                    this.f311432w.mo7808x76db6cb1((r45.i62) k62Var.m75936x14adae67(1));
                } else {
                    r45.i62 i62Var = (r45.i62) k62Var.m75936x14adae67(1);
                    if (i62Var != null) {
                        i62Var.set(2, 1);
                    }
                }
                this.E = k62Var;
            }
        }
        r45.wm2 wm2Var2 = new r45.wm2();
        dk2.ef efVar = dk2.ef.f314905a;
        km2.n nVar = dk2.ef.H;
        byte[] g17 = (nVar == null || (e17 = nVar.e()) == null || (m75934xbce7f2f = e17.m75934xbce7f2f(30)) == null) ? null : m75934xbce7f2f.g();
        if (g17 != null) {
            try {
                wm2Var2.mo11468x92b714fd(g17);
                wm2Var = wm2Var2;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
            }
        }
        this.I = wm2Var;
        if (wm2Var != null) {
            java.util.LinkedList m75941xfb8219142 = wm2Var.m75941xfb821914(3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getLike_list(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it.next()).m76102x6c03c64c());
            }
            this.f311424J = new java.util.LinkedList(arrayList);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout;
        this.f311432w.mo7806x9d92d11c(k0Var, new df2.sm(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = this.f311430u;
        c14227x4262fb44.f193193d = true;
        c14227x4262fb44.mo7806x9d92d11c(k0Var, new df2.tm(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb442 = this.f311431v;
        c14227x4262fb442.f193193d = true;
        c14227x4262fb442.mo7806x9d92d11c(k0Var, new df2.um(this));
        this.F = new df2.vm(this);
    }

    @Override // df2.de, if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        n7("onViewUnmount", true);
        this.f311435z = null;
        this.F = null;
        super.mo8999xb1ef75c(pluginLayout);
    }

    public final boolean p7() {
        java.lang.Boolean bool = (java.lang.Boolean) this.f311430u.mo3195x754a37bb();
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void q7() {
        java.util.LinkedList m75941xfb821914;
        r45.qq1 qq1Var = this.H;
        if (qq1Var != null) {
            java.util.LinkedList m75941xfb8219142 = qq1Var != null ? qq1Var.m75941xfb821914(0) : null;
            if (!(m75941xfb8219142 == null || m75941xfb8219142.isEmpty())) {
                r45.ch1 ch1Var = new r45.ch1();
                ch1Var.set(1, 1000067);
                r45.qq1 qq1Var2 = new r45.qq1();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.qq1 qq1Var3 = this.H;
                if (qq1Var3 != null && (m75941xfb821914 = qq1Var3.m75941xfb821914(0)) != null) {
                    linkedList.addAll(m75941xfb821914);
                }
                pm0.v.d0(linkedList, df2.pm.f312634d);
                java.util.Collections.reverse(linkedList);
                java.util.LinkedList linkedList2 = new java.util.LinkedList(kz5.n0.K0(linkedList, 2));
                r45.xj5 xj5Var = new r45.xj5();
                xj5Var.set(1, c01.z1.r());
                linkedList2.addLast(xj5Var);
                java.util.Collections.reverse(linkedList2);
                qq1Var2.set(0, linkedList2);
                ch1Var.set(4, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(qq1Var2.mo14344x5f01b1f6()));
                dk2.j jVar = new dk2.j(ch1Var);
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                linkedList3.add(jVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.class);
                if (mgVar != null) {
                    mgVar.I1(linkedList3);
                    return;
                }
                return;
            }
        }
        r45.tj1 tj1Var = new r45.tj1();
        tj1Var.set(0, c01.z1.r());
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        r45.ch1 ch1Var2 = new r45.ch1();
        ch1Var2.set(1, 20123);
        ch1Var2.set(4, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(tj1Var.mo14344x5f01b1f6()));
        linkedList4.add(new dk2.lc(ch1Var2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.class);
        if (mgVar2 != null) {
            mgVar2.I1(linkedList4);
        }
    }

    public final void r7(boolean z17, r45.wg7 source, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311425p, "[likeOrCancel] like:" + z17 + ", source:" + source + ", needCancelToast:" + z18);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f311433x;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        pm0.v.X(new df2.rm(this, z17, source, z18));
    }

    public final void s7(int i17, java.lang.Integer num) {
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f408764g2;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        if (num != null) {
            gVar.o("send_reason", num.intValue());
        }
        gVar.h("friend_wx_username", o7());
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void t7(int i17, int i18, java.lang.Integer num) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311425p, "[reportRealTime] feedActionType = " + i17 + ", feedActionSubType = " + i18 + ", value = " + num);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) k0Var : null;
        r45.qt2 reportObj = c14353xe7c1f419 != null ? c14353xe7c1f419.getReportObj() : null;
        r45.jn0 jn0Var = new r45.jn0();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410379n;
        jn0Var.set(0, java.lang.Long.valueOf(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L));
        jn0Var.set(1, ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410385o);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedActionType", i17);
        jSONObject.put("feedActionSubType", i18);
        if (num != null) {
            jSONObject.put("value", num.intValue());
        }
        jn0Var.set(3, jSONObject.toString());
        ((c61.p2) ybVar).Lj(reportObj, 18054, jn0Var, ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410526w);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[Catch: Exception -> 0x004e, TRY_LEAVE, TryCatch #0 {Exception -> 0x004e, blocks: (B:3:0x000a, B:5:0x000e, B:7:0x0015, B:8:0x001b, B:10:0x002c, B:13:0x003a, B:15:0x003e), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u7(r45.wg7 r10, java.lang.Integer r11) {
        /*
            r9 = this;
            java.lang.String r0 = r9.f311425p
            java.lang.String r1 = "[showGuideDialog] context = "
            java.lang.String r2 = "source"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r2)
            r2 = 0
            com.tencent.mm.plugin.finder.live.widget.zm r3 = r9.f311435z     // Catch: java.lang.Exception -> L4e
            if (r3 != 0) goto L39
            com.tencent.mm.ui.MMActivity r3 = r9.N6()     // Catch: java.lang.Exception -> L4e
            r4 = 0
            if (r3 == 0) goto L1a
            androidx.appcompat.app.AppCompatActivity r3 = r3.mo55332x76847179()     // Catch: java.lang.Exception -> L4e
            goto L1b
        L1a:
            r3 = r4
        L1b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4e
            r5.<init>(r1)     // Catch: java.lang.Exception -> L4e
            r5.append(r3)     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L4e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto L35
            com.tencent.mm.plugin.finder.live.widget.zm r1 = new com.tencent.mm.plugin.finder.live.widget.zm     // Catch: java.lang.Exception -> L4e
            r1.<init>(r3)     // Catch: java.lang.Exception -> L4e
            r9.f311435z = r1     // Catch: java.lang.Exception -> L4e
            jz5.f0 r4 = jz5.f0.f384359a     // Catch: java.lang.Exception -> L4e
        L35:
            if (r4 != 0) goto L39
            r1 = r2
            goto L3a
        L39:
            r1 = 1
        L3a:
            com.tencent.mm.plugin.finder.live.widget.zm r3 = r9.f311435z     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto L4c
            r3.N = r10     // Catch: java.lang.Exception -> L4e
            r3.Q = r11     // Catch: java.lang.Exception -> L4e
            r3.P = r2     // Catch: java.lang.Exception -> L4e
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 7
            r8 = 0
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L4e
        L4c:
            r2 = r1
            goto L64
        L4e:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "[showGuideDialog] e = "
            r11.<init>(r1)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r10)
        L64:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.cn.u7(r45.wg7, java.lang.Integer):boolean");
    }
}
