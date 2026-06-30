package cl1;

/* loaded from: classes7.dex */
public final class d0 extends cl1.y {

    /* renamed from: a, reason: collision with root package name */
    public long f124391a = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;

    /* renamed from: b, reason: collision with root package name */
    public boolean f124392b = true;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6 f124393c;

    @Override // cl1.y
    public synchronized java.util.List a() {
        java.util.ArrayList arrayList;
        java.util.List list;
        arrayList = new java.util.ArrayList();
        if (this.f124393c == null) {
            this.f124393c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.v.f173600a.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6 b6Var = this.f124393c;
        if (b6Var != null) {
            list = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.j1) b6Var).t0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.q0.f173571b.f173522b);
        } else {
            list = null;
        }
        boolean z17 = true;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) kz5.n0.V(list)).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) it.next();
                cl1.n0 n0Var = new cl1.n0(1);
                n0Var.f124421a = c11714x918fd2e4;
                arrayList.add(n0Var);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c11714x918fd2e4, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo");
                this.f124391a = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) c11714x918fd2e4).C;
            }
        }
        if (arrayList.size() < com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.q0.f173571b.f173522b) {
            z17 = false;
        }
        this.f124392b = z17;
        return arrayList;
    }

    @Override // cl1.y
    public void b(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.c0) ((ft.j) i95.n0.c(ft.j.class))).getClass();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1.n0()) {
            ((ku5.t0) ku5.t0.f394148d).q(new cl1.b0(this, callback));
        } else {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1.z0().u0(java.lang.System.currentTimeMillis(), false, null, 3, 2, 32, -1L, new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.b0(new cl1.c0(this, callback)), null);
        }
    }

    @Override // cl1.y
    public boolean c() {
        return this.f124392b;
    }

    @Override // cl1.y
    public java.lang.String d() {
        java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.a0k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // cl1.y
    public int e() {
        return 1;
    }
}
