package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ai0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f193421p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f193422q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 f193423r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f193424s;

    /* renamed from: t, reason: collision with root package name */
    public hq0.e0 f193425t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f193426u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View.OnTouchListener f193427v;

    /* renamed from: w, reason: collision with root package name */
    public int f193428w;

    /* renamed from: x, reason: collision with root package name */
    public int f193429x;

    /* renamed from: y, reason: collision with root package name */
    public final int f193430y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f193421p = statusMonitor;
        this.f193422q = "FinderLiveVisitorGamePlugin";
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f193423r = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10(context, root, statusMonitor, this);
        this.f193424s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10(root, statusMonitor, this);
        this.f193430y = 4;
    }

    @Override // qo0.a
    public boolean B0() {
        if (this.f446856d.getVisibility() != 0) {
            return false;
        }
        t1();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // qo0.a
    public void I0() {
        hq0.e0 e0Var = this.f193425t;
        if (e0Var != null) {
            e0Var.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J0() {
        /*
            r18 = this;
            r0 = r18
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onResume "
            r1.<init>(r2)
            com.tencent.mm.plugin.finder.live.widget.m10 r2 = r0.f193424s
            java.lang.String r3 = r2.L
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Finder.FinderLiveVisitorGameTeamWidget"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            java.lang.String r1 = r2.L
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2c
            int r1 = r1.length()
            if (r1 <= 0) goto L27
            r1 = r3
            goto L28
        L27:
            r1 = r4
        L28:
            if (r1 != r3) goto L2c
            r1 = r3
            goto L2d
        L2c:
            r1 = r4
        L2d:
            if (r1 == 0) goto L7f
            ke2.u r1 = new ke2.u
            com.tencent.mm.plugin.finder.live.plugin.l r5 = r2.f200534c
            java.lang.Class<mm2.e1> r6 = mm2.e1.class
            androidx.lifecycle.c1 r7 = r5.P0(r6)
            mm2.e1 r7 = (mm2.e1) r7
            long r7 = r7.f410516m
            androidx.lifecycle.c1 r9 = r5.P0(r6)
            mm2.e1 r9 = (mm2.e1) r9
            r45.nw1 r9 = r9.f410521r
            long r9 = r9.m75942xfb822ef2(r4)
            androidx.lifecycle.c1 r11 = r5.P0(r6)
            mm2.e1 r11 = (mm2.e1) r11
            byte[] r11 = r11.f410518o
            com.tencent.mm.protobuf.g r11 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(r11)
            androidx.lifecycle.c1 r5 = r5.P0(r6)
            mm2.e1 r5 = (mm2.e1) r5
            java.lang.String r12 = r5.f410525v
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 112(0x70, float:1.57E-43)
            r17 = 0
            r5 = r1
            r6 = r7
            r8 = r9
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            r5.<init>(r6, r8, r10, r11, r12, r13, r14, r15, r16)
            pq5.g r1 = r1.l()
            com.tencent.mm.plugin.finder.live.widget.r00 r5 = new com.tencent.mm.plugin.finder.live.widget.r00
            r5.<init>(r2)
            r1.K(r5)
        L7f:
            com.tencent.mm.plugin.finder.live.widget.z10 r1 = r0.f193423r
            android.view.View r2 = r1.f202031g
            if (r2 == 0) goto Lb9
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L8d
            r2 = r3
            goto L8e
        L8d:
            r2 = r4
        L8e:
            if (r2 == 0) goto Lb1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "onResume serverLost:"
            r2.<init>(r5)
            boolean r5 = r0.f193426u
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = r0.f193422q
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r2)
            boolean r2 = r0.f193426u
            if (r2 == 0) goto Lae
            r18.u1()
            r0.f193426u = r4
        Lae:
            r1.g(r3)
        Lb1:
            hq0.e0 r1 = r0.f193425t
            if (r1 == 0) goto Lb8
            r1.j()
        Lb8:
            return
        Lb9:
            java.lang.String r1 = "rootView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0.J0():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04bd  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r31, android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0.M0(qo0.b, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (((mm2.c1) r3.P0(mm2.c1.class)).L2 == true) goto L8;
     */
    @Override // qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N0() {
        /*
            r19 = this;
            r0 = r19
            com.tencent.mm.plugin.finder.live.widget.m10 r1 = r0.f193424s
            r1.getClass()
            java.lang.String r2 = "Finder.FinderLiveVisitorGameTeamWidget"
            java.lang.String r3 = "stop"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3)
            com.tencent.mm.plugin.finder.live.plugin.l r3 = r1.f200534c
            if (r3 == 0) goto L20
            java.lang.Class<mm2.c1> r4 = mm2.c1.class
            androidx.lifecycle.c1 r4 = r3.P0(r4)
            mm2.c1 r4 = (mm2.c1) r4
            boolean r4 = r4.L2
            r5 = 1
            if (r4 != r5) goto L20
            goto L21
        L20:
            r5 = 0
        L21:
            if (r5 == 0) goto L72
            java.lang.String r4 = "floatMode"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4)
            ml2.m5 r2 = ml2.m5.f409251a
            r2.b()
            dk2.ef r2 = dk2.ef.f314905a
            r2.N()
            tn0.w0 r2 = dk2.ef.f314911d
            if (r2 == 0) goto L5d
            jn0.a r15 = new jn0.a
            android.view.ViewGroup r1 = r1.f200532a
            android.content.Context r5 = r1.getContext()
            java.lang.String r1 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r1)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r1 = 0
            r16 = 2046(0x7fe, float:2.867E-42)
            r17 = 0
            r4 = r15
            r18 = r15
            r15 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r18
            r2.G(r1)
        L5d:
            if (r3 == 0) goto L72
            com.tencent.mm.plugin.finder.live.view.k0 r1 = r3.R0()
            km2.m r1 = r1.m57663xfb7e5820()
            if (r1 == 0) goto L72
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r1 = r1.f390664f
            if (r1 == 0) goto L72
            if2.z r2 = if2.z.f372686a
            r2.b(r1)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0.N0():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        android.view.View.OnTouchListener onTouchListener;
        java.util.LinkedList linkedList;
        super.O0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80 x80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80.class);
        if (x80Var != null && (onTouchListener = this.f193427v) != null && (linkedList = x80Var.f196586t) != null) {
            linkedList.remove(onTouchListener);
        }
        this.f193427v = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void k1(android.content.Intent intent) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f193424s;
        m10Var.getClass();
        boolean z17 = false;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("extra_start_by_half_screen_empty_area_click_scene", false) : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "clickEmptyAreaClose = " + booleanExtra);
        if (booleanExtra) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = m10Var.f200546o;
            if (y1Var2 != null && y1Var2.f()) {
                z17 = true;
            }
            if (!z17 || (y1Var = m10Var.f200546o) == null) {
                return;
            }
            y1Var.q();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        if (this.f446856d.getVisibility() == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f193423r.f202032h;
            if (c22613xe7040d9c != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(c22613xe7040d9c, null, 1, null);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                throw null;
            }
        }
    }

    public final void u1() {
        java.lang.String str = this.f193422q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setupDynamicCardEnv");
        boolean z17 = true;
        boolean z18 = ((mm2.c1) P0(mm2.c1.class)).A7() == null;
        int intValue = ((java.lang.Number) ae2.in.f85359n7.r()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "enableDynamicCard playTogetherJumpInfo is null:" + z18 + ", localSwitchValue:" + intValue + " ,localSwitchValue:  native(有mb): 2, liteapp: 0、1");
        if (!z18 && intValue != 2) {
            z17 = false;
        }
        if (z17) {
            ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Ai("wxe208ce76dfa39515");
            ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Di(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zh0(this));
            java.lang.String str2 = ((mm2.c1) P0(mm2.c1.class)).f410385o;
            long j17 = ((mm2.e1) P0(mm2.e1.class)).f410516m;
            zl2.r4 r4Var = zl2.r4.f555483a;
            android.view.ViewGroup viewGroup = this.f446856d;
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String j07 = r4Var.j0(context);
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            java.lang.String str3 = a52.a.f83117l;
            java.lang.String f17 = dk2.q4.f315471a.f(((ml2.r0) i95.n0.c(ml2.r0.class)).M, "enter_immerse_type");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            oe0.u uVar = new oe0.u(str2, j17, j07, str3, f17, null, null, null, 224, null);
            oe0.x xVar = (oe0.x) i95.n0.c(oe0.x.class);
            java.lang.Object obj = new java.lang.Object();
            android.content.Context context2 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            hq0.e0 wi6 = ((ne0.r) xVar).wi(obj, context2, uVar);
            this.f193425t = wi6;
            if (wi6 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 z10Var = this.f193423r;
                z10Var.getClass();
                z10Var.f202044t = wi6;
                java.util.Iterator it = z10Var.f202041q.iterator();
                while (it.hasNext()) {
                    ((cm2.p) it.next()).f124908f = wi6;
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        super.z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f193424s;
        m10Var.L = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = m10Var.f200534c;
        ((mm2.c1) lVar.P0(mm2.c1.class)).f410338f6.mo7806x9d92d11c(lVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p00(m10Var));
        jf2.k0 k0Var = (jf2.k0) lVar.U0(jf2.k0.class);
        if (k0Var != null && (c14227x4262fb44 = k0Var.f380920v) != null) {
            c14227x4262fb44.f193193d = true;
            c14227x4262fb44.mo7806x9d92d11c(lVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q00(m10Var));
        }
        mm2.c1 c1Var = (mm2.c1) P0(mm2.c1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uh0 uh0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uh0(this);
        zg2.b bVar = c1Var.f410422t6;
        bVar.getClass();
        bVar.mo7806x9d92d11c(this, new zg2.a(uh0Var));
        this.f193427v = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vh0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80 x80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80.class);
        if (x80Var != null) {
            x80Var.x1(this.f193427v);
        }
    }
}
