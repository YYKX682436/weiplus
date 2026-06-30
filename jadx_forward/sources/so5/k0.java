package so5;

/* loaded from: classes14.dex */
public final class k0 implements xq4.d {

    /* renamed from: e, reason: collision with root package name */
    public boolean f492391e;

    /* renamed from: f, reason: collision with root package name */
    public zq4.b f492392f;

    /* renamed from: g, reason: collision with root package name */
    public int f492393g;

    /* renamed from: i, reason: collision with root package name */
    public yz5.p f492395i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f492396m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.v f492397n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f492398o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f492399p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f492400q;

    /* renamed from: r, reason: collision with root package name */
    public int f492401r;

    /* renamed from: u, reason: collision with root package name */
    public boolean f492404u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f492405v;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f492390d = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    /* renamed from: h, reason: collision with root package name */
    public int f492394h = -1;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f492402s = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: t, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f492403t = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);

    public static boolean c(so5.k0 k0Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        k0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startCamera: callFromResume ");
        sb6.append(z17);
        sb6.append(" bFaceFirst:");
        zq4.b bVar = k0Var.f492392f;
        sb6.append(bVar != null ? java.lang.Boolean.valueOf(bVar.f556574a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPCameraHelper", sb6.toString());
        if (z17 || com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40975xf7b3660d() || z18) {
            zq4.b bVar2 = k0Var.f492392f;
            p3325xe03a0797.p3326xc267989b.l.d(k0Var.f492390d, null, null, new so5.g0(k0Var, bVar2 != null ? bVar2.f556574a : true, null), 3, null);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPCameraHelper", "startCamera: not in foreground, delay open cam");
        k0Var.f492400q = true;
        return false;
    }

    @Override // xq4.d
    public void Y(int i17, int i18) {
        so5.e0 e0Var = new so5.e0(this, i17, i18, null);
        if (this.f492394h >= 0) {
            p3325xe03a0797.p3326xc267989b.l.d(this.f492390d, null, null, new so5.d0(e0Var, null), 3, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ILinkVoIPCameraHelper", "onCameraPreviewApply: cur mid id " + this.f492394h);
        this.f492395i = e0Var;
    }

    public final void a(int i17) {
        android.util.Size size;
        android.util.Size size2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPCameraHelper", "bindMid() called with: mid = " + i17 + ", oldMid = " + this.f492394h);
        int i18 = this.f492394h;
        if (i18 == -1 || i18 == i17) {
            this.f492394h = i17;
            if (this.f492395i != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ILinkVoIPCameraHelper", "bindMid: run block");
                p3325xe03a0797.p3326xc267989b.l.d(this.f492390d, null, null, new so5.b0(this, null), 3, null);
                return;
            }
            return;
        }
        this.f492394h = i17;
        if (b()) {
            zq4.b bVar = this.f492392f;
            int i19 = 0;
            int width = (bVar == null || (size2 = bVar.f556579f) == null) ? 0 : size2.getWidth();
            zq4.b bVar2 = this.f492392f;
            if (bVar2 != null && (size = bVar2.f556579f) != null) {
                i19 = size.getHeight();
            }
            Y(width, i19);
        }
    }

    public final boolean b() {
        zq4.b bVar = this.f492392f;
        boolean z17 = bVar != null ? bVar.f556583j : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPCameraHelper", "cameraOn: " + z17 + ", switching " + this.f492398o);
        return z17 || this.f492398o;
    }

    public final void d() {
        zq4.b bVar = this.f492392f;
        boolean z17 = false;
        boolean z18 = bVar != null ? bVar.f556583j : false;
        boolean z19 = bVar != null ? bVar.f556574a : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPCameraHelper", "updateFlutterCameraState: camOn " + z18 + " faceCam " + z19 + ' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0 v0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b;
        if (!this.f492391e && z18) {
            z17 = true;
        }
        v0Var.q(z17, z19, so5.j0.f492387a);
    }

    @Override // xq4.d
    public void o() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ILinkVoIPCameraHelper", "onCameraError: onCameraError");
        this.f492400q = true;
    }

    @Override // xq4.d
    public void s() {
        this.f492405v = true;
    }
}
