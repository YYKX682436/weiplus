package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class wh extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f196469p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th f196470q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.ewu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f196469p = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById;
        this.f196470q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th(root, this);
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wh whVar, r45.g84 g84Var) {
        android.view.ViewGroup viewGroup = whVar.f446856d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th thVar = whVar.f196470q;
        viewGroup.removeCallbacks(thVar);
        fy2.d dVar = (fy2.d) whVar.P0(fy2.d.class);
        boolean z17 = true;
        java.lang.String m75945x2fec8307 = g84Var != null ? g84Var.m75945x2fec8307(1) : null;
        if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
            z17 = false;
        }
        if (z17 || whVar.x0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveDecorationPlugin", "updateBgDecoration url is null or empty.");
            dVar.f348773g = g84Var;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = whVar.f196469p;
            c22789xd23e9a9b.n();
            c22789xd23e9a9b.setVisibility(8);
            whVar.K0(8);
            return;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(dVar.N6(g84Var))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveDecorationPlugin", "updateBgDecoration download decorations.");
            dVar.O6(g84Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vh(g84Var, dVar, whVar));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveDecorationPlugin", "updateBgDecoration local decorations exist.");
            dVar.f348773g = g84Var;
            whVar.u1();
            viewGroup.postDelayed(thVar, ((java.lang.Number) ae2.in.f85221a.z().r()).longValue() * 1000);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r13, android.os.Bundle r14) {
        /*
            r12 = this;
            java.lang.String r0 = "status"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            int[] r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rh.f195672a
            int r13 = r13.ordinal()
            r13 = r0[r13]
            r0 = 1
            if (r13 != r0) goto Lc9
            if (r14 == 0) goto L19
            java.lang.String r13 = "PARAM_FINDER_LIVE_START_BY_MINI_WINDOW"
            boolean r13 = r14.getBoolean(r13)
            goto L1a
        L19:
            r13 = 0
        L1a:
            if (r13 == 0) goto Lc9
            java.lang.Class<fy2.d> r13 = fy2.d.class
            androidx.lifecycle.c1 r13 = r12.P0(r13)
            fy2.d r13 = (fy2.d) r13
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r13.f348774h
            r4 = 0
            int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r14 != 0) goto L44
            ae2.in r14 = ae2.in.f85221a
            lb2.j r14 = r14.z()
            java.lang.Object r14 = r14.r()
            java.lang.Number r14 = (java.lang.Number) r14
            long r2 = r14.longValue()
        L42:
            long r2 = r2 * r6
            goto L81
        L44:
            long r2 = r0 - r2
            int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r14 > 0) goto L5b
            ae2.in r14 = ae2.in.f85221a
            lb2.j r14 = r14.z()
            java.lang.Object r14 = r14.r()
            java.lang.Number r14 = (java.lang.Number) r14
            long r2 = r14.longValue()
            goto L42
        L5b:
            ae2.in r14 = ae2.in.f85221a
            lb2.j r2 = r14.z()
            java.lang.Object r2 = r2.r()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            long r2 = r2 * r6
            long r8 = r13.f348774h
            long r8 = r0 - r8
            lb2.j r14 = r14.z()
            java.lang.Object r14 = r14.r()
            java.lang.Number r14 = (java.lang.Number) r14
            long r10 = r14.longValue()
            long r10 = r10 * r6
            long r8 = r8 % r10
            long r2 = r2 - r8
        L81:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r8 = "fromMiniWin will running delayTask. lastBgDecorShowTimestamp:"
            r14.<init>(r8)
            long r8 = r13.f348774h
            r14.append(r8)
            java.lang.String r13 = " now:"
            r14.append(r13)
            r14.append(r0)
            java.lang.String r13 = " delay:"
            r14.append(r13)
            r14.append(r2)
            java.lang.String r13 = r14.toString()
            java.lang.String r14 = "Finder.FinderLiveDecorationPlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r14, r13)
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 >= 0) goto Lab
            goto Lac
        Lab:
            r4 = r2
        Lac:
            ae2.in r13 = ae2.in.f85221a
            lb2.j r13 = r13.z()
            java.lang.Object r13 = r13.r()
            java.lang.Number r13 = (java.lang.Number) r13
            long r13 = r13.longValue()
            long r13 = r13 * r6
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 <= 0) goto Lc2
            r4 = r13
        Lc2:
            android.view.ViewGroup r13 = r12.f446856d
            com.tencent.mm.plugin.finder.live.plugin.th r14 = r12.f196470q
            r13.postDelayed(r14, r4)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wh.M0(qo0.b, android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        this.f446856d.removeCallbacks(this.f196470q);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void u1() {
        fy2.d dVar = (fy2.d) P0(fy2.d.class);
        dVar.f348774h = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f196469p;
        c22789xd23e9a9b.setVisibility(0);
        K0(0);
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.A));
        c22789xd23e9a9b.m82582x3ae760af(0.0d);
        c22789xd23e9a9b.mo82567x3e3ac3e8(dVar.N6(dVar.f348773g));
        c22789xd23e9a9b.n();
        c22789xd23e9a9b.g();
        c22789xd23e9a9b.d();
    }
}
