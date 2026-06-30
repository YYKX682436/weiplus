package ke5;

/* loaded from: classes9.dex */
public abstract class a implements ke5.f0, hd5.k {

    /* renamed from: a, reason: collision with root package name */
    public final hd5.r f388573a;

    /* renamed from: b, reason: collision with root package name */
    public final yb5.d f388574b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f388575c;

    /* renamed from: d, reason: collision with root package name */
    public int f388576d;

    /* renamed from: e, reason: collision with root package name */
    public ke5.e0 f388577e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f388578f = 3;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f388579g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f388580h;

    public a(yb5.d dVar, hd5.r rVar) {
        this.f388574b = dVar;
        this.f388575c = dVar.x();
        this.f388573a = rVar;
    }

    @Override // ke5.f0
    public void a(hd5.n nVar, boolean z17, android.os.Bundle bundle) {
        yb5.d dVar = this.f388574b;
        ((tb5.d0) ((tb5.n0) dVar.f542241c.a(tb5.n0.class))).m0("onLoadStart", nVar);
        boolean H = dVar.H();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.AbstractDataPresenter", "[onLoad] action:" + nVar + " isBlock:" + z17 + " username:" + dVar.x() + "readOnly:" + H);
        hd5.n nVar2 = hd5.n.ACTION_ENTER;
        if (!H || nVar == nVar2 || nVar == hd5.n.ACTION_TOP) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.x())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingLoader.AbstractDataPresenter", "[onLoad] username is null!");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.a(13);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterV3", "[lockNotify] isLockNotify:%s notifyCountWhileLock:%s", java.lang.Boolean.valueOf(kVar.f279955l1), java.lang.Integer.valueOf(kVar.f279957p1));
            boolean z18 = true;
            if (!kVar.f279955l1) {
                kVar.f279955l1 = true;
                kVar.f279957p1 = 0;
            }
            if (nVar == nVar2 && z17 && dVar.f542250l != null) {
                jz5.g gVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.m.f279968a;
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            } else {
                z18 = false;
            }
            ke5.b bVar = new ke5.b(this, bundle, nVar);
            hd5.v vVar = (hd5.v) this.f388573a;
            vVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ListDataLoader", "[load] mode:%s isBlock:%s thread:%s optBlock:%s", nVar, java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Boolean.valueOf(z18));
            if (nVar == nVar2 && z17 && z18) {
                hd5.j jVar = (hd5.j) vVar.f362187e;
                jVar.a();
                yb5.d dVar2 = jVar.f362145c;
                dVar2.q().mo50297x7c4d7ca2(jVar.f362149g, 1000L);
                dVar2.p().f().setVisibility(8);
                z17 = false;
            }
            hd5.t tVar = new hd5.t(vVar, nVar, z17, bVar, vVar.f362184b);
            if (z17) {
                tVar.run();
            } else {
                vVar.f362183a.mo50293x3498a0(tVar);
            }
        }
    }

    @Override // ke5.f0
    public void b(hd5.n nVar, boolean z17) {
        a(nVar, z17, null);
    }

    @Override // hd5.k
    public void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689, hd5.q qVar) {
        ke5.f0 f0Var;
        yb5.d dVar = this.f388574b;
        ((tb5.d0) ((tb5.n0) dVar.f542241c.a(tb5.n0.class))).m0("onViewUpdate", qVar.f362163b);
        if (qVar.f362163b == hd5.n.ACTION_TOP) {
            c21897x17252689.post(new ke5.c(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.b(13);
        c21897x17252689.m79868x1e705e08().h(qVar);
        if (android.os.Looper.getMainLooper().isCurrentThread()) {
            c21897x17252689.J1 = true;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterV3", "[unLockNotify] isLockNotify:%s notifyCountWhileLock:%s", java.lang.Boolean.valueOf(kVar.f279955l1), java.lang.Integer.valueOf(kVar.f279957p1));
        if (kVar.f279955l1) {
            kVar.f279955l1 = false;
            if (kVar.f279957p1 > 0 && (f0Var = kVar.Z) != null) {
                f0Var.b(hd5.n.ACTION_UPDATE, false);
            }
            kVar.f279957p1 = 0;
        }
    }

    public abstract he5.t e(hd5.n nVar, android.os.Bundle bundle, hd5.q qVar);

    public void f(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689, int i17, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, boolean z17, int i18, boolean z18, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.AbstractDataPresenter", "[matteHighLightItem] position:%s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f388579g);
        ke5.e eVar = new ke5.e(this, i17, z17, i18, z18, c21897x17252689, c16564xb55e1d5, bundle);
        this.f388579g = eVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(eVar, 300L);
    }

    public void g(int i17, boolean z17, int i18, boolean z18) {
        this.f388578f = 3;
        yb5.d dVar = this.f388574b;
        if (dVar.f542254p) {
            dVar.U(i17, i65.a.b(dVar.g(), 120), z18, z17);
        } else {
            dVar.T(i17, z18, z17, i18);
        }
        dVar.p().m75894x7c4d7ca2(new ke5.d(this, i17, i18, z18, z17), 200L);
    }

    @Override // ke5.f0
    /* renamed from: onCancel */
    public void mo142539x3d6f0539() {
        hd5.v vVar = (hd5.v) this.f388573a;
        synchronized (vVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ListDataLoader", "[cancel]");
            vVar.f362184b.set(true);
            vVar.f362184b = new java.util.concurrent.atomic.AtomicBoolean(false);
            vVar.f362183a.mo50302x6b17ad39(null);
            vVar.f362185c.removeCallbacksAndMessages(null);
            hd5.j jVar = (hd5.j) vVar.f362187e;
            jVar.a();
            yb5.l lVar = jVar.f362145c.f542259u;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar.f542273a, lVar.f542274b)) {
                lVar.f542273a = lVar.f542274b;
            }
        }
        ke5.e0 e0Var = this.f388577e;
        if (e0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMChattingListView", "initResetLoadStateListener onCancel");
            int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689.L1;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i0) e0Var).f284492a;
            c21897x17252689.f279069q = false;
            c21897x17252689.f279070r = true;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.hc hcVar = c21897x17252689.f284376l1;
            if (hcVar != null) {
                hcVar.b();
                c21897x17252689.f284376l1 = null;
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m142540x9616526c() {
        return getClass().getName();
    }
}
