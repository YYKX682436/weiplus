package h9;

/* loaded from: classes15.dex */
public final class i implements r9.a0, java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final h9.a f361180d;

    /* renamed from: e, reason: collision with root package name */
    public final r9.g0 f361181e = new r9.g0("HlsPlaylistTracker:MediaPlaylist");

    /* renamed from: f, reason: collision with root package name */
    public final r9.i0 f361182f;

    /* renamed from: g, reason: collision with root package name */
    public h9.d f361183g;

    /* renamed from: h, reason: collision with root package name */
    public long f361184h;

    /* renamed from: i, reason: collision with root package name */
    public long f361185i;

    /* renamed from: m, reason: collision with root package name */
    public long f361186m;

    /* renamed from: n, reason: collision with root package name */
    public long f361187n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f361188o;

    /* renamed from: p, reason: collision with root package name */
    public java.io.IOException f361189p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ h9.n f361190q;

    public i(h9.n nVar, h9.a aVar) {
        this.f361190q = nVar;
        this.f361180d = aVar;
        this.f361182f = new r9.i0(((g9.b) nVar.f361191d).f351094a.mo10288xb8a7ce81(), t9.b0.c(nVar.f361200p.f361153a, aVar.f361123a), 4, nVar.f361192e);
    }

    public final boolean a() {
        h9.a aVar;
        boolean z17;
        int e17;
        this.f361187n = android.os.SystemClock.elapsedRealtime() + 60000;
        h9.n nVar = this.f361190q;
        java.util.ArrayList arrayList = (java.util.ArrayList) nVar.f361197m;
        int size = arrayList.size();
        int i17 = 0;
        while (true) {
            aVar = this.f361180d;
            if (i17 >= size) {
                break;
            }
            g9.j jVar = (g9.j) ((h9.j) arrayList.get(i17));
            for (g9.o oVar : jVar.f351146r) {
                g9.f fVar = oVar.f351161f;
                int a17 = fVar.f351106f.a(aVar.f361124b);
                if (a17 != -1 && (e17 = ((q9.e) fVar.f351117q).e(a17)) != -1) {
                    ((q9.e) fVar.f351117q).d(e17, 60000L);
                }
            }
            if (jVar.f351145q != null) {
                jVar.f351143o.b(jVar);
            } else {
                g9.o[] oVarArr = jVar.f351146r;
                for (g9.o oVar2 : oVarArr) {
                    if (!oVar2.f351174v) {
                        oVar2.h(oVar2.E);
                    }
                }
            }
            i17++;
        }
        if (nVar.f361201q == aVar) {
            java.util.List list = nVar.f361200p.f361125c;
            int size2 = list.size();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            int i18 = 0;
            while (true) {
                if (i18 >= size2) {
                    z17 = false;
                    break;
                }
                h9.i iVar = (h9.i) nVar.f361194g.get(list.get(i18));
                if (elapsedRealtime > iVar.f361187n) {
                    nVar.f361201q = iVar.f361180d;
                    iVar.b();
                    z17 = true;
                    break;
                }
                i18++;
            }
            if (!z17) {
                return true;
            }
        }
        return false;
    }

    public void b() {
        this.f361187n = 0L;
        if (this.f361188o) {
            return;
        }
        r9.g0 g0Var = this.f361181e;
        if (g0Var.a()) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.f361186m;
        h9.n nVar = this.f361190q;
        if (elapsedRealtime < j17) {
            this.f361188o = true;
            nVar.f361195h.postDelayed(this, j17 - elapsedRealtime);
        } else {
            g0Var.d(this.f361182f, this, nVar.f361193f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(h9.d r51) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.i.c(h9.d):void");
    }

    @Override // r9.a0
    public void e(r9.c0 c0Var, long j17, long j18) {
        r9.i0 i0Var = (r9.i0) c0Var;
        h9.e eVar = (h9.e) i0Var.f474904d;
        if (!(eVar instanceof h9.d)) {
            this.f361189p = new m8.x("Loaded playlist has unexpected type.");
            return;
        }
        h9.d dVar = (h9.d) eVar;
        c(dVar);
        if (dVar.f361148l) {
            d9.g gVar = this.f361190q.f361199o;
            gVar.getClass();
            gVar.f308882a.post(new d9.f(gVar));
        }
        this.f361190q.f361199o.e(i0Var.f474901a, 4, j17, j18, i0Var.f474906f);
    }

    @Override // r9.a0
    public int g(r9.c0 c0Var, long j17, long j18, java.io.IOException iOException) {
        int i17;
        r9.i0 i0Var = (r9.i0) c0Var;
        boolean z17 = iOException instanceof m8.x;
        this.f361190q.f361199o.g(i0Var.f474901a, 4, j17, j18, i0Var.f474906f, iOException, z17);
        if (z17) {
            return 3;
        }
        return (iOException instanceof r9.y) && ((i17 = ((r9.y) iOException).f474972d) == 404 || i17 == 410) ? a() : true ? 0 : 2;
    }

    @Override // r9.a0
    public void q(r9.c0 c0Var, long j17, long j18, boolean z17) {
        r9.i0 i0Var = (r9.i0) c0Var;
        this.f361190q.f361199o.c(i0Var.f474901a, 4, j17, j18, i0Var.f474906f);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f361188o = false;
        this.f361181e.d(this.f361182f, this, this.f361190q.f361193f);
    }
}
