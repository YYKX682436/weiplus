package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class sw extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final boolean f195846p;

    /* renamed from: q, reason: collision with root package name */
    public final yz5.l f195847q;

    /* renamed from: r, reason: collision with root package name */
    public final ve2.a f195848r;

    /* renamed from: s, reason: collision with root package name */
    public r45.uy2 f195849s;

    /* renamed from: t, reason: collision with root package name */
    public int f195850t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(android.view.ViewGroup root, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14375x1f466727 c14375x1f466727, qo0.c statusMonitor, boolean z17, yz5.l choiceData) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(choiceData, "choiceData");
        this.f195846p = z17;
        this.f195847q = choiceData;
        this.f195850t = root.getVisibility();
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ve2.c cVar = new ve2.c(root, context, S0(), statusMonitor, this);
        this.f195848r = cVar;
        android.content.Context context2 = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        cVar.mo56536x3b13c504(new ve2.d(root, c14375x1f466727, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, cVar));
        ((mm2.w) P0(mm2.w.class)).f411036o.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qw(this, root));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        byte[] byteArray;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rw.f195732a[status.ordinal()] != 1 || bundle == null || (byteArray = bundle.getByteArray("PARAM_FINDER_LIVE_RECEIVE_LOGO_RESP_KEY")) == null) {
            return;
        }
        try {
            r45.uy2 uy2Var = new r45.uy2();
            uy2Var.mo11468x92b714fd(byteArray);
            this.f195849s = uy2Var;
            u1();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoForViewPlugin", "#statusChange-parse err ".concat(jz5.a.b(e17)));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoForViewPlugin", "#unMount");
        ve2.a aVar = this.f195848r;
        if (aVar != null) {
            ((ve2.c) aVar).c();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public void m0(boolean z17) {
        d1(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoForViewPlugin", "#onClearScreenEndNotify clear=" + z17);
        u1();
    }

    /* renamed from: onResume */
    public final void m57041x57429eec() {
        ve2.a aVar = this.f195848r;
        if (aVar != null) {
            ve2.c cVar = (ve2.c) aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoPresenter", "#reloadData");
            cVar.f(cVar.f517624f);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public void s(boolean z17) {
        e1(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoForViewPlugin", "#onClearScreenStartNotify clear=" + z17);
        u1();
    }

    public final void t1(int i17) {
        boolean x07 = x0();
        boolean z17 = this.f195846p;
        android.view.ViewGroup viewGroup = this.f446856d;
        if (!x07) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = java.lang.Math.max(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 120), i17) + i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
            if (z17) {
                layoutParams2.leftMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
            } else {
                layoutParams2.rightMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
            }
            viewGroup.setLayoutParams(layoutParams2);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 72);
        int b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 104);
        if (!z17) {
            b17 = b18;
        }
        layoutParams4.topMargin = b17;
        float n17 = ((com.p314xaae8f345.mm.ui.bk.n(1.0f) - (com.p314xaae8f345.mm.ui.bk.o(1.0f) * (((mm2.c1) P0(mm2.c1.class)).f410412s2 / ((mm2.c1) P0(mm2.c1.class)).f410418t2))) / 2) + i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
        int b19 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
        if (z17) {
            layoutParams4.leftMargin = java.lang.Math.max((int) n17, b19);
        } else {
            layoutParams4.rightMargin = java.lang.Math.max((int) n17, b19);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r4 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1() {
        /*
            r5 = this;
            java.lang.String r0 = "FinderLiveLogoForViewPlugin"
            java.lang.String r1 = "#updateGiftInfo"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            r45.uy2 r0 = r5.f195849s
            ve2.a r1 = r5.f195848r
            r2 = 0
            if (r0 == 0) goto L54
            yz5.l r3 = r5.f195847q
            java.lang.Object r0 = r3.mo146xb9724478(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L54
            java.lang.Object r0 = kz5.n0.Z(r0)
            r45.rd4 r0 = (r45.rd4) r0
            if (r0 == 0) goto L54
            r4 = 6
            boolean r0 = r0.m75933x41a8a7f2(r4)
            jz5.f0 r4 = jz5.f0.f384359a
            if (r0 == 0) goto L3c
            com.tencent.mm.plugin.finder.live.view.k0 r0 = r5.R0()
            boolean r0 = r0.m57703xa7d505b7()
            if (r0 != 0) goto L3c
            if (r1 == 0) goto L51
            r0 = r1
            ve2.c r0 = (ve2.c) r0
            r0.f(r2)
            goto L52
        L3c:
            if (r1 == 0) goto L51
            r45.uy2 r0 = r5.f195849s
            if (r0 == 0) goto L49
            java.lang.Object r0 = r3.mo146xb9724478(r0)
            java.util.List r0 = (java.util.List) r0
            goto L4a
        L49:
            r0 = r2
        L4a:
            r3 = r1
            ve2.c r3 = (ve2.c) r3
            r3.f(r0)
            goto L52
        L51:
            r4 = r2
        L52:
            if (r4 != 0) goto L5b
        L54:
            if (r1 == 0) goto L5b
            ve2.c r1 = (ve2.c) r1
            r1.f(r2)
        L5b:
            java.lang.Class<mm2.w> r0 = mm2.w.class
            androidx.lifecycle.c1 r0 = r5.P0(r0)
            mm2.w r0 = (mm2.w) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r0 = r0.f411036o
            java.lang.Object r0 = r0.mo3195x754a37bb()
            mm2.f r0 = (mm2.f) r0
            mm2.f r1 = mm2.f.f410549g
            r2 = 0
            if (r0 != r1) goto L72
            r0 = 1
            goto L73
        L72:
            r0 = r2
        L73:
            if (r0 == 0) goto L7d
            r5.f195850t = r2
            r0 = 8
            r5.K0(r0)
            goto L80
        L7d:
            r5.K0(r2)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sw.u1():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoForViewPlugin", "#mount");
    }
}
