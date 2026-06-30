package fg1;

/* loaded from: classes7.dex */
public class z implements dg.b {

    /* renamed from: a, reason: collision with root package name */
    public final xi1.c f343453a;

    /* renamed from: b, reason: collision with root package name */
    public bg.f f343454b;

    /* renamed from: c, reason: collision with root package name */
    public final ig1.a f343455c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f343456d;

    /* renamed from: e, reason: collision with root package name */
    public final u81.f f343457e = new fg1.y(this);

    public z() {
        gg1.g gVar = (gg1.g) i95.n0.c(gg1.g.class);
        if (gVar != null) {
            this.f343453a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i1((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j1) gVar);
        }
        this.f343455c = a();
    }

    public ig1.a a() {
        return new ig1.a();
    }

    public final dg.f b() {
        bg.f fVar = this.f343454b;
        if (fVar != null) {
            return fVar.f101302o;
        }
        return null;
    }

    public boolean c(ye1.e eVar) {
        return true;
    }

    public void d(sf.f fVar, ye1.e eVar, java.lang.String str) {
        bg.f fVar2;
        dg.e eVar2;
        oe1.q1 q1Var;
        boolean c17 = c(eVar);
        long q07 = (!c17 || (q1Var = (oe1.q1) i95.n0.c(oe1.q1.class)) == null) ? 0L : q1Var.q0(str, 0L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
        if (q07 < 0) {
            q07 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "onVideoPathChanged, videoPath:%s, cachedSize:%s, isSupportGetCachedBytes: %b", str, java.lang.Long.valueOf(q07), java.lang.Boolean.valueOf(c17));
        if (c17 && (fVar2 = this.f343454b) != null && (eVar2 = fVar2.f101298i) != null) {
            fg1.b0 b0Var = (fg1.b0) eVar2;
            b0Var.getClass();
            try {
                org.json.JSONObject b17 = b0Var.b();
                b17.put("preloadSize", q07);
                b0Var.a(new fg1.k0(null), b17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onXWebVideoPreloadedMetaData fail", e17);
            }
        }
        dg.f b18 = b();
        ig1.a aVar = this.f343455c;
        aVar.getClass();
        if (eVar == null || b18 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        fg1.q0 q0Var = (fg1.q0) b18;
        q0Var.a(1234L, 10L, 1L, false);
        if (q07 > 0) {
            q0Var.a(1234L, 11L, 1L, false);
            q0Var.a(1234L, 13L, java.math.BigInteger.valueOf(q07).divide(ig1.a.f372873b).longValue(), false);
        }
        ig1.c cVar = aVar.f372874a;
        cVar.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            cVar.f372876a = "";
        } else {
            cVar.f372876a = str.length() > 512 ? str.substring(0, 512) : str;
        }
        cVar.f372879d = q07;
    }

    public final void e(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "bitmap recycle " + bitmap.toString());
        bitmap.recycle();
    }

    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
    }

    public void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
    }
}
