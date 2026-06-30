package uf1;

/* loaded from: classes7.dex */
public class a extends eg.a {

    /* renamed from: o, reason: collision with root package name */
    public static uf1.g f508670o;

    /* renamed from: g, reason: collision with root package name */
    public android.view.Surface f508671g;

    /* renamed from: h, reason: collision with root package name */
    public tb1.b0 f508672h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f508673i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f508674m = new java.util.Vector();

    /* renamed from: n, reason: collision with root package name */
    public int f508675n;

    public static void r(uf1.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        android.view.View mo50748xfb86a31b = aVar.f508672h.mo50748xfb86a31b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s mo51311x3eebbc35 = tVar.mo51311x3eebbc35();
        android.view.ViewGroup n17 = mo51311x3eebbc35 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) mo51311x3eebbc35).n(0, false, false) : null;
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler", "addCameraNativeView failed null topLevelContainer, appId:%s", tVar.mo48798x74292566());
            return;
        }
        mo50748xfb86a31b.setId(mo50748xfb86a31b.hashCode());
        if (n17.findViewById(mo50748xfb86a31b.getId()) == null) {
            n17.addView(mo50748xfb86a31b, new android.view.ViewGroup.LayoutParams(1, 1));
        }
    }

    @Override // eg.b
    public boolean b(sf.f fVar) {
        return true;
    }

    @Override // eg.a, eg.b
    public void c(android.view.MotionEvent motionEvent) {
        tb1.b0 b0Var = this.f508672h;
        if (b0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12043xd4517e35 c12043xd4517e35 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12043xd4517e35) b0Var;
            if (c12043xd4517e35.m50747x1a0f428c() == null) {
                return;
            }
            c12043xd4517e35.m50747x1a0f428c().a(motionEvent);
        }
    }

    @Override // eg.a, eg.b
    public void e() {
        android.view.Surface surface = this.f508671g;
        if (surface != null) {
            surface.release();
            this.f508671g = null;
        }
        tb1.b0 b0Var = this.f508672h;
        if (b0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler", "the camera view is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f508673i;
        if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) lVar;
            tVar.I(b0Var);
            tVar.O(this.f508672h);
            tVar.K(this.f508672h);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610) this.f508672h).i();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: uf1.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610) uf1.a.this.f508672h).i();
                }
            });
        }
    }

    @Override // eg.b
    public java.lang.String f(sf.f fVar) {
        if (!(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = bVar.m();
        int i17 = bVar.f159552a;
        java.lang.String q17 = q();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = bVar.f159554c;
        java.lang.String k17 = k0Var.k();
        org.json.JSONObject jSONObject = bVar.f159553b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler", "*** handler(%s) handleJsApi(%s), data:%s", q17, k17, jSONObject.toString());
        m17.m(new uf1.c(this, k0Var, new uf1.b(this, m17, k0Var, fVar, jSONObject, i17)));
        return null;
    }

    @Override // eg.a, eg.b
    public void i(android.view.Surface surface) {
        this.f508671g = surface;
        java.util.List list = this.f508674m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler", "preTask size: %d", java.lang.Integer.valueOf(((java.util.Vector) list).size()));
        java.util.Iterator it = ((java.util.Vector) list).iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        i(new android.view.Surface(surfaceTexture));
    }
}
