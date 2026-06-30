package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class q30 extends xt2.m6 implements android.view.View.OnClickListener, jf2.o, jf2.l, jf2.m {

    /* renamed from: d */
    public final android.view.ViewGroup f201000d;

    /* renamed from: e */
    public final qo0.c f201001e;

    /* renamed from: f */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f201002f;

    /* renamed from: g */
    public final java.lang.String f201003g;

    /* renamed from: h */
    public final jz5.g f201004h;

    /* renamed from: i */
    public final jz5.g f201005i;

    /* renamed from: m */
    public final jz5.g f201006m;

    /* renamed from: n */
    public final jz5.g f201007n;

    /* renamed from: o */
    public final android.view.View f201008o;

    /* renamed from: p */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f201009p;

    /* renamed from: q */
    public final android.view.View f201010q;

    /* renamed from: r */
    public final android.widget.TextView f201011r;

    /* renamed from: s */
    public int f201012s;

    /* renamed from: t */
    public hi2.b f201013t;

    /* renamed from: u */
    public boolean f201014u;

    /* renamed from: v */
    public xt2.n6 f201015v;

    /* renamed from: w */
    public int f201016w;

    public q30(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f201000d = root;
        this.f201001e = statusMonitor;
        this.f201002f = basePlugin;
        this.f201003g = "Finder.FinderLiveVisitorMicEntranceWidget";
        this.f201004h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l30(this));
        this.f201005i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m30(this));
        this.f201006m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j30(this));
        this.f201007n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k30(this));
        this.f201008o = root.findViewById(com.p314xaae8f345.mm.R.id.fpj);
        this.f201009p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) root.findViewById(com.p314xaae8f345.mm.R.id.fpk);
        this.f201010q = root.findViewById(com.p314xaae8f345.mm.R.id.f566238f75);
        this.f201011r = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.tpw);
        this.f201014u = true;
        this.f201015v = xt2.n6.f538445d;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(root, "finder_live_apply_for_link");
        if (statusMonitor.mo11219xd0598cf8() == 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(root, 8, 25561);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(root, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g30.f199930a);
        }
        root.setOnClickListener(this);
    }

    public static /* synthetic */ void m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q30 q30Var, int i17, int i18, hi2.b bVar, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = 0;
        }
        if ((i19 & 2) != 0) {
            i18 = 1;
        }
        if ((i19 & 4) != 0) {
            bVar = null;
        }
        q30Var.l(i17, i18, bVar);
    }

    @Override // xt2.o6
    public xt2.n6 D() {
        return this.f201015v;
    }

    @Override // jf2.l
    public void F(int i17) {
        p();
    }

    @Override // jf2.o
    public void b() {
        android.view.ViewGroup viewGroup = this.f201000d;
        if (viewGroup.getVisibility() != 0) {
            p();
        }
        viewGroup.setVisibility(0);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).hk(ml2.n4.f409280p, ml2.s2.f409452e, 0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79190xa45dccc1), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.dw8));
    }

    @Override // jf2.m
    public void e(int i17) {
        this.f201000d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        if (n() == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h30.f200056d) {
            return this.f201008o;
        }
        return null;
    }

    @Override // jf2.o
    public void g() {
        this.f201000d.setVisibility(8);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).hk(ml2.n4.f409280p, ml2.s2.f409452e, 8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f201000d;
    }

    @Override // jf2.o
    public boolean i() {
        boolean z17 = this.f201014u;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f201003g, "setVisible return for isTeenMode");
            return false;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (r4Var.N1(this.f201002f.S0())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f201003g, "setVisible return for isDisableLinkMic");
            return false;
        }
        if (zl2.r4.F1(this.f201002f.S0())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f201003g, "setVisible return for isCoLiveLive");
            return false;
        }
        if (!z17 || r4Var.N1(this.f201002f.S0()) || ((mm2.c1) this.f201002f.P0(mm2.c1.class)).T) {
            return false;
        }
        if (((mm2.n0) this.f201002f.P0(mm2.n0.class)).f410806r) {
            return false;
        }
        return (((mm2.o4) this.f201002f.P0(mm2.o4.class)).k7() || ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.o4) this.f201002f.P0(mm2.o4.class)).H).mo144003x754a37bb()).booleanValue()) && ((mm2.c1) this.f201002f.P0(mm2.c1.class)).a8() && !((mm2.c1) this.f201002f.P0(mm2.c1.class)).f410311a5;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 linkMicIcon = this.f201009p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkMicIcon, "linkMicIcon");
        return linkMicIcon;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r17, int r18, hi2.b r19) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q30.k(int, int, hi2.b):void");
    }

    public final void l(int i17, int i18, hi2.b bVar) {
        java.lang.Object obj;
        this.f201012s = i17;
        this.f201013t = bVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f201003g, "checkRequestLinkMic seatPos: " + i17 + " source: " + i18 + " extData: " + bVar);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f409523u, null, null, null, null, null, false, 126, null);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.zb.T8((zy2.zb) c18, ml2.t1.P, null, null, null, null, null, false, 126, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f201002f;
        java.lang.Integer num = ((mm2.e1) lVar.P0(mm2.e1.class)).g7() ? 1 : null;
        fj2.j jVar = fj2.j.f344707a;
        java.lang.String str = this.f201003g;
        android.view.ViewGroup viewGroup = this.f201000d;
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (jVar.d(str, context, this.f201001e, this.f201002f, i17, dk2.ef.f314905a.u0(), num, bVar)) {
            java.util.List list = ((mm2.o4) lVar.P0(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390703a, ((mm2.c1) lVar.P0(mm2.c1.class)).m8())) {
                        break;
                    }
                }
            }
            boolean z17 = obj != null;
            if (((mm2.o4) lVar.P0(mm2.o4.class)).F7()) {
                db5.t7.m123882x26a183b(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.mkg, 0).show();
                return;
            }
            if (!z17) {
                tn0.w0 Z0 = lVar.Z0();
                if (!(Z0 != null && Z0.X())) {
                    if (!((mm2.c1) lVar.P0(mm2.c1.class)).o7() || ((mm2.c1) lVar.P0(mm2.c1.class)).I7().m75939xb282bd08(2) == 1) {
                        k(i17, i18, bVar);
                        return;
                    }
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("PARAM_FINDER_BOTTOM_TIP_TITLE", viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dnk));
                    bundle.putString("PARAM_FINDER_BOTTOM_TIP_MSG", viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dnj));
                    bundle.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 0);
                    bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", i17);
                    bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", i18);
                    lVar.f194858g.mo46557x60d69242(qo0.b.f446865b4, bundle);
                    return;
                }
            }
            qo0.c.a(lVar.f194858g, qo0.b.f446869c4, null, 2, null);
            android.view.View view = this.f201010q;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "onMicUserClick", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "onMicUserClick", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            zl2.r4.f555483a.I0().putBoolean("LINK_RED_DOT_ENABLE_KEY", false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r5 == null) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h30 n() {
        /*
            r8 = this;
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r8.f201002f
            java.lang.Class<mm2.o4> r1 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r0.P0(r1)
            mm2.o4 r0 = (mm2.o4) r0
            boolean r0 = r0.G7()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L56
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r8.f201002f
            java.lang.Class<mm2.o4> r3 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r0.P0(r3)
            mm2.o4 r0 = (mm2.o4) r0
            java.util.List r0 = r0.f410860v
            java.lang.String r3 = "<get-audienceLinkMicUserList>(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r3)
            monitor-enter(r0)
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L53
        L28:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L53
            r5 = 0
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L53
            r6 = r4
            km2.q r6 = (km2.q) r6     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto L3a
            java.lang.String r5 = r6.f390703a     // Catch: java.lang.Throwable -> L53
        L3a:
            com.tencent.mm.plugin.finder.live.plugin.l r6 = r8.f201002f     // Catch: java.lang.Throwable -> L53
            java.lang.Class<mm2.c1> r7 = mm2.c1.class
            androidx.lifecycle.c1 r6 = r6.P0(r7)     // Catch: java.lang.Throwable -> L53
            mm2.c1 r6 = (mm2.c1) r6     // Catch: java.lang.Throwable -> L53
            java.lang.String r6 = r6.m8()     // Catch: java.lang.Throwable -> L53
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r5, r6)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L28
            r5 = r4
        L4f:
            monitor-exit(r0)
            if (r5 != 0) goto L69
            goto L56
        L53:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L56:
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r8.f201002f
            tn0.w0 r0 = r0.Z0()
            if (r0 == 0) goto L66
            boolean r0 = r0.X()
            if (r0 != r2) goto L66
            r0 = r2
            goto L67
        L66:
            r0 = r1
        L67:
            if (r0 == 0) goto L6b
        L69:
            r0 = r2
            goto L6c
        L6b:
            r0 = r1
        L6c:
            if (r0 == 0) goto L71
            com.tencent.mm.plugin.finder.live.widget.h30 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h30.f200058f
            goto L95
        L71:
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r8.f201002f
            java.lang.Class<mm2.o4> r3 = mm2.o4.class
            androidx.lifecycle.c1 r4 = r0.P0(r3)
            mm2.o4 r4 = (mm2.o4) r4
            boolean r4 = r4.E7()
            if (r4 != 0) goto L8d
            androidx.lifecycle.c1 r0 = r0.P0(r3)
            mm2.o4 r0 = (mm2.o4) r0
            boolean r0 = r0.F7()
            if (r0 == 0) goto L8e
        L8d:
            r1 = r2
        L8e:
            if (r1 == 0) goto L93
            com.tencent.mm.plugin.finder.live.widget.h30 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h30.f200057e
            goto L95
        L93:
            com.tencent.mm.plugin.finder.live.widget.h30 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h30.f200056d
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q30.n():com.tencent.mm.plugin.finder.live.widget.h30");
    }

    public final boolean o() {
        zi2.w wVar = (zi2.w) this.f201002f.X0(zi2.w.class);
        if (wVar != null) {
            return wVar.k0();
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.i2v) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            int ordinal = n().ordinal();
            if (ordinal == 2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0Var);
                ml2.r0.ik(r0Var, ml2.n4.f409294y0, null, 0, 6, null);
            } else if (ordinal == 3) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0Var);
                ml2.r0.ik(r0Var, ml2.n4.f409276l1, null, 0, 6, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f201002f;
            xh2.c cVar = (xh2.c) ((mm2.o4) lVar.P0(mm2.o4.class)).A.mo3195x754a37bb();
            int i18 = 0;
            if (cVar != null && ((i17 = cVar.f536066c) == 3 || i17 == 3)) {
                java.util.LinkedList linkedList = cVar.f536064a;
                if (linkedList.size() > 1) {
                    kz5.g0.t(linkedList, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i30());
                }
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i18 = 1;
                        break;
                    }
                    java.lang.Object next = it.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    xh2.a aVar = (xh2.a) next;
                    if (i18 > 0 && aVar.f536054b.f536089h) {
                        break;
                    } else {
                        i18 = i19;
                    }
                }
            }
            m(this, i18, 0, null, 6, null);
            if (((mm2.c1) lVar.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) lVar.X0(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
                vVar.a();
                vVar.c(2023);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void p() {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.f409634y, null, null, null, null, null, false, 126, null);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.zb.I8((zy2.zb) c18, ml2.u1.Q, null, null, null, null, null, false, 126, null);
        if (((ml2.r0) i95.n0.c(ml2.r0.class)).L1) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", this.f201000d, null, 25561);
    }

    public final void q() {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f201002f;
        if (((mm2.e1) lVar.P0(mm2.e1.class)).b7()) {
            i17 = com.p314xaae8f345.mm.R.raw.f79554x87a331d;
        } else if (((mm2.e1) lVar.P0(mm2.e1.class)).Z6()) {
            i17 = com.p314xaae8f345.mm.R.raw.f78735xb0feab21;
        } else {
            xh2.b bVar = ((mm2.y2) lVar.P0(mm2.y2.class)).f411098r;
            i17 = (bVar == null || !((i18 = bVar.f536058d) == 4 || i18 == 5 || i18 == 6)) ? com.p314xaae8f345.mm.R.raw.f79176x608e1841 : com.p314xaae8f345.mm.R.raw.f79972x53b89329;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f201009p;
        c22699x3dcdb352.setImageResource(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h30 n17 = n();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h30 h30Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h30.f200056d;
        android.view.View view = this.f201008o;
        android.view.ViewGroup viewGroup = this.f201000d;
        if (n17 != h30Var) {
            c22699x3dcdb352.m82040x7541828(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            view.setBackground(viewGroup.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563295a70));
            return;
        }
        if (((mm2.e1) lVar.P0(mm2.e1.class)).b7()) {
            c22699x3dcdb352.m82040x7541828(0);
        } else {
            c22699x3dcdb352.m82040x7541828(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        }
        view.setBackground(viewGroup.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a6z));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) lVar.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
        if (ag0Var != null) {
            int i19 = ag0Var.f194147r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qf0(view, i19));
        }
    }

    public final void r() {
        if (o()) {
            boolean b76 = ((mm2.e1) this.f201002f.P0(mm2.e1.class)).b7();
            java.lang.String str = "";
            android.widget.TextView textView = this.f201011r;
            if (b76) {
                if (textView != null) {
                    textView.setText("");
                }
                this.f201016w = 0;
                return;
            }
            int ordinal = n().ordinal();
            if (ordinal != 0 && ordinal != 1) {
                android.view.ViewGroup viewGroup = this.f201000d;
                if (ordinal == 2) {
                    str = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.opl);
                } else {
                    if (ordinal != 3) {
                        throw new jz5.j();
                    }
                    str = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.opi);
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(textView != null ? textView.getText() : null, str)) {
                return;
            }
            if (textView != null) {
                textView.setText(str);
            }
            if (textView != null) {
                textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            this.f201016w = textView != null ? textView.getMeasuredWidth() : 0;
        }
    }

    @Override // jf2.o
    /* renamed from: type */
    public int mo57989x368f3a() {
        return 10;
    }

    @Override // xt2.o6
    public void v(xt2.n6 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (o()) {
            xt2.n6 n6Var = this.f201015v;
            this.f201015v = type;
            if (n6Var != type) {
                r();
            }
            int ordinal = type.ordinal();
            android.widget.TextView textView = this.f201011r;
            if (ordinal == 0) {
                if (textView == null) {
                    return;
                }
                textView.setVisibility(8);
            } else if (ordinal == 1 && textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    @Override // xt2.o6
    public int x(xt2.n6 displayType, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayType, "displayType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        r();
        q();
        int ordinal = displayType.ordinal();
        if (ordinal == 0) {
            return super.x(displayType, context);
        }
        if (ordinal == 1) {
            return (this.f201016w <= 0 || !o()) ? super.x(displayType, context) : this.f201016w + i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561258dh);
        }
        throw new jz5.j();
    }
}
