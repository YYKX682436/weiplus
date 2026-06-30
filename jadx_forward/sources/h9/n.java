package h9;

/* loaded from: classes15.dex */
public final class n implements r9.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final g9.g f361191d;

    /* renamed from: e, reason: collision with root package name */
    public final r9.h0 f361192e;

    /* renamed from: f, reason: collision with root package name */
    public final int f361193f;

    /* renamed from: i, reason: collision with root package name */
    public final h9.m f361196i;

    /* renamed from: o, reason: collision with root package name */
    public final d9.g f361199o;

    /* renamed from: p, reason: collision with root package name */
    public h9.b f361200p;

    /* renamed from: q, reason: collision with root package name */
    public h9.a f361201q;

    /* renamed from: r, reason: collision with root package name */
    public h9.d f361202r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f361203s;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f361197m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final r9.g0 f361198n = new r9.g0("HlsPlaylistTracker:MasterPlaylist");

    /* renamed from: g, reason: collision with root package name */
    public final java.util.IdentityHashMap f361194g = new java.util.IdentityHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f361195h = new android.os.Handler();

    public n(android.net.Uri uri, g9.g gVar, d9.g gVar2, int i17, h9.m mVar, r9.h0 h0Var) {
        this.f361191d = gVar;
        this.f361199o = gVar2;
        this.f361193f = i17;
        this.f361196i = mVar;
        this.f361192e = h0Var;
    }

    public h9.d a(h9.a aVar) {
        h9.d dVar;
        java.util.IdentityHashMap identityHashMap = this.f361194g;
        h9.d dVar2 = ((h9.i) identityHashMap.get(aVar)).f361183g;
        if (dVar2 != null && aVar != this.f361201q && this.f361200p.f361125c.contains(aVar) && ((dVar = this.f361202r) == null || !dVar.f361148l)) {
            this.f361201q = aVar;
            ((h9.i) identityHashMap.get(aVar)).b();
        }
        return dVar2;
    }

    @Override // r9.a0
    public void e(r9.c0 c0Var, long j17, long j18) {
        r9.i0 i0Var;
        h9.b bVar;
        r9.i0 i0Var2 = (r9.i0) c0Var;
        h9.e eVar = (h9.e) i0Var2.f474904d;
        boolean z17 = eVar instanceof h9.d;
        if (z17) {
            if (((h9.d) eVar).f361148l) {
                d9.g gVar = this.f361199o;
                gVar.getClass();
                gVar.f308882a.post(new d9.f(gVar));
            }
            i0Var = i0Var2;
            java.util.List singletonList = java.util.Collections.singletonList(new h9.a(eVar.f361153a, new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417("0", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54229x12272838, null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, null, null, null)));
            java.util.List emptyList = java.util.Collections.emptyList();
            bVar = new h9.b(null, java.util.Collections.emptyList(), singletonList, emptyList, emptyList, null, null);
        } else {
            i0Var = i0Var2;
            bVar = (h9.b) eVar;
        }
        this.f361200p = bVar;
        this.f361201q = (h9.a) bVar.f361125c.get(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(bVar.f361125c);
        arrayList.addAll(bVar.f361126d);
        arrayList.addAll(bVar.f361127e);
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            h9.a aVar = (h9.a) arrayList.get(i17);
            this.f361194g.put(aVar, new h9.i(this, aVar));
        }
        h9.i iVar = (h9.i) this.f361194g.get(this.f361201q);
        if (z17) {
            iVar.c((h9.d) eVar);
        } else {
            iVar.b();
        }
        r9.i0 i0Var3 = i0Var;
        this.f361199o.e(i0Var3.f474901a, 4, j17, j18, i0Var3.f474906f);
    }

    @Override // r9.a0
    public int g(r9.c0 c0Var, long j17, long j18, java.io.IOException iOException) {
        r9.i0 i0Var = (r9.i0) c0Var;
        boolean z17 = iOException instanceof m8.x;
        this.f361199o.g(i0Var.f474901a, 4, j17, j18, i0Var.f474906f, iOException, z17);
        return z17 ? 3 : 0;
    }

    @Override // r9.a0
    public void q(r9.c0 c0Var, long j17, long j18, boolean z17) {
        r9.i0 i0Var = (r9.i0) c0Var;
        this.f361199o.c(i0Var.f474901a, 4, j17, j18, i0Var.f474906f);
    }
}
