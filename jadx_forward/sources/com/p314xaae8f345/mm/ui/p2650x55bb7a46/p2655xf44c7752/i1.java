package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class i1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.m1 f282547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f282549c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f282550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f282551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f282552f;

    public i1(ot0.m1 m1Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.ref.WeakReference weakReference, int i17, t21.v2 v2Var, boolean z17) {
        this.f282547a = m1Var;
        this.f282548b = f9Var;
        this.f282549c = weakReference;
        this.f282550d = i17;
        this.f282551e = v2Var;
        this.f282552f = z17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Imagegallery.handler.video", "MP_VIDEO_ERROR  end do exchange video link fail %d/%d %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video", "MP_VIDEO  end do exchange video link success");
        r45.gl3 resp = (r45.gl3) oVar.f152244b.f152233a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.eb ebVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.eb.f282435a;
        ot0.m1 m1Var = this.f282547a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282548b;
        java.lang.String key = m1Var.c(f9Var.z0());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("MpShareVideoPlayInfo");
        R.A(key.concat("VideoSize"), resp.f456865g);
        R.A(key.concat("block"), resp.f456863e);
        R.D(key.concat("errMsg"), resp.f456864f);
        c01.l2 c17 = c01.n2.d().c(key, true);
        c17.k("PlayUrl", resp.f456862d);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!android.text.TextUtils.isEmpty("SaveTime")) {
            ((c01.k2) c17.f118838a).put("SaveTime", java.lang.Long.valueOf(currentTimeMillis));
        }
        java.lang.ref.WeakReference weakReference = this.f282549c;
        if (weakReference.get() != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1) weakReference.get()).f282419d;
            if ((k1Var == null || (viewOnClickListenerC21748xb3d38e6b = k1Var.f282625g) == null) ? true : viewOnClickListenerC21748xb3d38e6b.isFinishing()) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1 j1Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1) weakReference.get();
            int i19 = this.f282550d;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta k17 = j1Var.k(i19);
            int i27 = resp.f456863e;
            t21.v2 v2Var = this.f282551e;
            if (i27 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Imagegallery.handler.video", "doGetPlayUrl block %s", resp.f456864f);
                j1Var.y(j1Var.k(i19));
                com.p314xaae8f345.mm.vfs.w6.h(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f104104s, f9Var.z0(), false));
                v2Var.f496544i = 111;
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().C(v2Var);
                if (j1Var.f282419d.v() == k17) {
                    j1Var.x(k17, resp.f456864f);
                    return;
                }
                return;
            }
            boolean z17 = this.f282552f;
            if (!z17) {
                v2Var.f496548m = resp.f456865g;
                v2Var.E.f468866d = resp.f456862d;
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().C(v2Var);
            }
            if (z17 || j1Var.f282419d.v() != k17 || j1Var.f282419d.f282625g.z8()) {
                return;
            }
            j1Var.A(f9Var, i19);
        }
    }
}
