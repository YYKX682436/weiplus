package v13;

/* loaded from: classes12.dex */
public final class d extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public long f514056n;

    /* renamed from: o, reason: collision with root package name */
    public long f514057o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f514058p = "";

    /* renamed from: q, reason: collision with root package name */
    public long f514059q;

    /* renamed from: r, reason: collision with root package name */
    public long f514060r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v13.e f514061s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r45.wc4 f514062t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r45.st4 f514063u;

    public d(v13.e eVar, r45.wc4 wc4Var, r45.st4 st4Var) {
        this.f514061s = eVar;
        this.f514062t = wc4Var;
        this.f514063u = st4Var;
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218914f;
        r45.wc4 wc4Var = this.f514062t;
        if (wc4Var != null) {
            int i17 = wc4Var.f470601f;
            if (i17 <= 0) {
                i17 = 31536000;
            }
            p75.n0 n0Var = dm.i3.f319087g;
            n0Var.getClass();
            p75.m c17 = dm.i3.f319090m.x(java.lang.Long.valueOf(c01.id.c() - (i17 * 1000))).c(dm.i3.f319091n.i(0L));
            if (n0Var instanceof p75.z) {
                throw new java.lang.IllegalArgumentException("Not support multi table delete");
            }
            this.f514056n = new p75.i(n0Var.b(), c17.b(), c17.e()).f(oVar.l());
            java.util.LinkedList items = wc4Var.f470599d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(items, "items");
            for (java.util.List<r45.re0> list : d75.b.c(items, 50)) {
                oVar.a();
                for (r45.re0 re0Var : list) {
                    java.lang.String str = re0Var.f466291d;
                    if (str != null && (r26.n0.N(str) ^ true)) {
                        dm.i3 i3Var = new dm.i3();
                        i3Var.y0(re0Var.f466291d);
                        i3Var.w0(0L);
                        i3Var.z0(re0Var.f466292e * 1000);
                        i3Var.m125053x19a4110d(oVar.l(), false);
                    }
                }
                oVar.d();
            }
            this.f514058p = wc4Var.f470600e + ' ' + k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, wc4Var.f470600e);
            this.f514059q = (long) wc4Var.f470599d.size();
        }
        r45.st4 st4Var = this.f514063u;
        if (st4Var != null) {
            p75.n0 n0Var2 = dm.i3.f319087g;
            n0Var2.getClass();
            p75.m0 i18 = dm.i3.f319091n.i(1L);
            if (n0Var2 instanceof p75.z) {
                throw new java.lang.IllegalArgumentException("Not support multi table delete");
            }
            this.f514057o = new p75.i(n0Var2.b(), i18.b(), i18.e()).f(oVar.l());
            java.util.LinkedList items2 = st4Var.f467507d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(items2, "items");
            for (java.util.List<r45.re0> list2 : d75.b.c(items2, 50)) {
                oVar.a();
                for (r45.re0 re0Var2 : list2) {
                    java.lang.String str2 = re0Var2.f466291d;
                    if (str2 != null && (r26.n0.N(str2) ^ true)) {
                        dm.i3 i3Var2 = new dm.i3();
                        i3Var2.y0("net@" + re0Var2.f466291d);
                        i3Var2.w0(1L);
                        i3Var2.z0(c01.id.c());
                        i3Var2.m125053x19a4110d(oVar.l(), false);
                    }
                }
                oVar.d();
            }
            this.f514060r = st4Var.f467507d.size();
        }
        this.f514061s.f514064f = dm.i3.f319087g.h(dm.i3.f319088h.h()).a().n(oVar.l());
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "deleteLocalResult:" + this.f514056n + " deleteNetWorkResult:" + this.f514057o + " localUpdateTime:" + this.f514058p + " localDictCount:" + this.f514059q + " netWorkCount:" + this.f514060r + " currentDictCount:" + this.f514061s.f514064f;
    }
}
