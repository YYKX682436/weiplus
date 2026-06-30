package dz4;

/* loaded from: classes12.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f326951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f326952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326954g;

    public u(dz4.j0 j0Var, boolean z17, java.lang.String str, java.lang.String str2) {
        this.f326951d = j0Var;
        this.f326952e = z17;
        this.f326953f = str;
        this.f326954g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ih0.p pVar = this.f326951d.f326842a;
        if (pVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onClickSetChatTop: holder null");
            return;
        }
        dz4.b1 b1Var = (dz4.b1) ((jz5.n) ((ez4.u) pVar).f339496v).mo141623x754a37bb();
        b1Var.getClass();
        o72.g4 zj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj();
        ez4.u uVar = (ez4.u) b1Var.f326702a;
        java.lang.ref.WeakReference weakReference = uVar.f339477c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        java.lang.String str = b1Var.f326703b;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onClickSetChatTop: activity null");
            return;
        }
        dz4.i iVar = uVar.f339475a;
        if (!this.f326952e) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14790, 1, 2);
            s72.p0 p0Var = (s72.p0) zj6;
            if (!p0Var.X6() || !p0Var.f485666s) {
                mz4.b0.c().d(null);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_g), null, activity, null, null);
                return;
            }
            java.lang.ref.WeakReference weakReference2 = uVar.f339477c;
            android.app.Activity activity2 = weakReference2 != null ? (android.app.Activity) weakReference2.get() : null;
            if (activity2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "handlePinOnTop: activity null");
                return;
            }
            long j17 = iVar.f326826d;
            o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
            o72.g4 zj7 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj();
            if (F == null || !((s72.p0) zj7).T6(F)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "handleCancelPinOnTop failed with localId=%d", java.lang.Long.valueOf(j17));
                return;
            }
            int i17 = F.f67643xc8a07680;
            ((s72.p0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj()).f485662o = true;
            ((s72.p0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj()).Y6(i17, false, new dz4.x0(activity2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleCancelPinOnTop send request with favId=%d", java.lang.Integer.valueOf(i17));
            return;
        }
        iz4.r rVar = new iz4.r();
        boolean z17 = iVar instanceof dz4.f;
        rVar.f377672d = z17;
        rVar.f377678m = this.f326953f;
        java.lang.String str2 = this.f326954g;
        if (str2 == null || r26.n0.N(str2)) {
            rVar.f377677i = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_l);
        } else {
            rVar.f377677i = str2;
        }
        if (z17) {
            dz4.f fVar = (dz4.f) iVar;
            rVar.f377674f = java.lang.Long.parseLong(fVar.f326765m);
            rVar.f377675g = fVar.f326766n;
            if (fVar.f326770r) {
                rVar.f377676h = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14790, 3, 1);
            } else {
                rVar.f377676h = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14790, 2, 1);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14790, 1, 1);
            rVar.f377673e = iVar.f326826d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18728, 1);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WENOTE_KEEP_TOP_DATA_LAST_REPORT_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        s72.p0 p0Var2 = (s72.p0) zj6;
        if (!p0Var2.X6() || !p0Var2.f485666s || z17) {
            mz4.b0.c().d(rVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_m), null, activity, null, null);
            return;
        }
        o72.r2 F2 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(iVar.f326826d);
        if (F2 == null || F2.f67643xc8a07680 == -1) {
            gm0.j1.d().a(401, new dz4.a1(rVar, b1Var));
        } else {
            b1Var.a(rVar);
        }
    }
}
