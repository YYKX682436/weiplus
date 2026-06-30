package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f168986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f168987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f168988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f168989g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i f168990h;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i iVar, android.graphics.Point point, android.graphics.Point point2, int i17, int i18) {
        this.f168990h = iVar;
        this.f168986d = point;
        this.f168987e = point2;
        this.f168988f = i17;
        this.f168989g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f168990h.f169011h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f168990h.f169004a, "handleVideoPage2PipStart, true == mHandleStarted");
            return;
        }
        int i17 = this.f168990h.f169008e.i();
        int k17 = this.f168990h.f169008e.k();
        android.graphics.Point point = this.f168986d;
        int i18 = point.x;
        android.graphics.Point point2 = this.f168987e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f168990h.f169004a, "handleVideoPage2PipStart, originVideoPosX: %d, originVideoPosY: %d", java.lang.Integer.valueOf(i18 + point2.x), java.lang.Integer.valueOf(point.y + point2.y));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i iVar = this.f168990h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895 = iVar.f169006c;
        android.graphics.Point point3 = this.f168986d;
        int i19 = point3.x;
        int i27 = point3.y;
        android.graphics.Point point4 = this.f168987e;
        if (iVar.f169015l == null) {
            iVar.f169015l = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.h(iVar, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.h hVar = iVar.f169015l;
        hVar.f168997a = i19;
        hVar.f168998b = i27;
        hVar.f168999c = point4;
        c12753x672cc895.a(hVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i iVar2 = this.f168990h;
        int i28 = this.f168988f;
        int i29 = this.f168989g;
        iVar2.getClass();
        boolean z17 = false;
        if (!((-1 == i28 || -1 == i29) ? false : true) ? i17 >= k17 : i28 >= i29) {
            z17 = true;
        }
        if (z17) {
            iVar2.f169028y = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.K;
            iVar2.f169029z = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.L;
        } else {
            iVar2.f169028y = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.P;
            iVar2.f169029z = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.Q;
        }
        android.view.KeyEvent.Callback callback = iVar2.f169007d;
        if (callback instanceof pd1.h) {
            pd1.h hVar2 = (pd1.h) callback;
            pd1.g gVar = z17 ? pd1.g.f435069d : pd1.g.f435070e;
            tf.q0 q0Var = (tf.q0) hVar2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q0Var.f500374g.f500377a, "onModeConfirmed, mode: " + gVar);
            if (pd1.g.f435070e == gVar) {
                ((android.widget.LinearLayout.LayoutParams) q0Var.f500371d.getLayoutParams()).weight = 75.0f;
                ((android.widget.LinearLayout.LayoutParams) q0Var.f500373f.getLayoutParams()).weight = 75.0f;
                ((android.widget.LinearLayout.LayoutParams) q0Var.f500372e.getLayoutParams()).weight = 48.0f;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i iVar3 = this.f168990h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc8952 = iVar3.f169006c;
        int i37 = iVar3.f169028y;
        int i38 = iVar3.f169029z;
        c12753x672cc8952.f172530r = c12753x672cc8952.k(c12753x672cc8952.f172530r, i37);
        c12753x672cc8952.o(c12753x672cc8952.f172531s, i38);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "adjustStablePos, mStablePosX: " + c12753x672cc8952.f172530r + ", mStablePosY: " + c12753x672cc8952.f172531s);
        c12753x672cc8952.d(c12753x672cc8952.f172530r, c12753x672cc8952.f172531s);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i iVar4 = this.f168990h;
        iVar4.a(0.0f, iVar4.f169016m, iVar4.f169017n, iVar4.f169018o, iVar4.f169019p, iVar4.f169020q, iVar4.f169021r, iVar4.f169022s, iVar4.f169023t, iVar4.f169024u, iVar4.f169025v, iVar4.f169026w, iVar4.f169027x);
        this.f168990h.f169011h = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i iVar5 = this.f168990h;
        if (iVar5.f169010g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar5.f169004a, "handleVideoPage2PipStart, run afterStartTask");
            this.f168990h.f169010g.a();
        }
    }
}
