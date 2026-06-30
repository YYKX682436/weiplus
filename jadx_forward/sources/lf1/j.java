package lf1;

/* loaded from: classes7.dex */
public final class j extends eg.a implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.g {

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.SurfaceTexture f399797g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d f399798h;

    /* renamed from: m, reason: collision with root package name */
    public int f399800m;

    /* renamed from: n, reason: collision with root package name */
    public int f399801n;

    /* renamed from: o, reason: collision with root package name */
    public int f399802o;

    /* renamed from: p, reason: collision with root package name */
    public int f399803p;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f399799i = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f399804q = "cover";

    /* renamed from: r, reason: collision with root package name */
    public final fg1.r0 f399805r = new fg1.r0();

    @Override // eg.b
    public boolean b(sf.f invokeContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        return true;
    }

    @Override // eg.a, eg.b
    public void e() {
        this.f399797g = null;
        t();
        ((java.util.ArrayList) this.f399799i).clear();
    }

    @Override // eg.b
    public java.lang.String f(sf.f invokeContext) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        if (!(invokeContext instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) || (m17 = (bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) invokeContext).m()) == null) {
            return null;
        }
        java.lang.String q17 = q();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = bVar.f159554c;
        java.lang.String k17 = k0Var.k();
        org.json.JSONObject jSONObject = bVar.f159553b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "*** handler(%s) handleJsApi(%s), data:%s", q17, k17, jSONObject.toString());
        m17.m(new lf1.e(this, invokeContext, new lf1.f(k0Var, this, m17, invokeContext, jSONObject)));
        return null;
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        this.f399797g = surfaceTexture;
        if (surfaceTexture != null) {
            java.util.List list = this.f399799i;
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                f((sf.f) it.next());
            }
            ((java.util.ArrayList) list).clear();
        }
    }

    public final void r(org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.h hVar) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("position");
        if (optJSONObject != null) {
            int c17 = ik1.w.c(optJSONObject.optInt("width", 0));
            int c18 = ik1.w.c(optJSONObject.optInt("height", 0));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "adjustSurfaceSize, size:[%d, %d]", java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(c18));
            if (c17 <= 0 || c18 <= 0) {
                return;
            }
            this.f399800m = c17;
            this.f399801n = c18;
            android.graphics.SurfaceTexture surfaceTexture = this.f399797g;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(c17, c18);
            }
            if (hVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3 b3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3) hVar;
                b3Var.f177376n = c17;
                b3Var.f177377o = c18;
                b3Var.f177387y = new android.util.Size(c17, c18);
            }
            if (hVar != null) {
                int optInt = optJSONObject.optInt("width", 0);
                int optInt2 = optJSONObject.optInt("height", 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3 b3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3) hVar;
                b3Var2.f177378p = optInt;
                b3Var2.f177379q = optInt2;
            }
        }
    }

    public final void s() {
        fg1.r0 r0Var = this.f399805r;
        if (r0Var.a(this.f399804q, this.f399800m, this.f399801n, this.f399802o, this.f399803p)) {
            sf.i.c(this.f334032f, this.f334031e, this.f334030d, r0Var.f343421h, r0Var.f343422i);
        }
    }

    public final void t() {
        if (this.f399798h != null) {
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.f177552h.a(this.f399798h);
            this.f399798h = null;
        }
    }
}
