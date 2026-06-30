package cl1;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl1.d0 f124385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f124386e;

    public b0(cl1.d0 d0Var, yz5.l lVar) {
        this.f124385d = d0Var;
        this.f124386e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ft.j jVar = (ft.j) i95.n0.c(ft.j.class);
        cl1.d0 d0Var = this.f124385d;
        yz5.l lVar = this.f124386e;
        synchronized (d0Var) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.q0.f173571b.f173522b;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.c0) jVar).getClass();
            int i18 = 0;
            d0Var.f124392b = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1.n0();
            if (d0Var.f124393c == null) {
                d0Var.f124393c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.v.f173600a.c();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6 b6Var = d0Var.f124393c;
            java.util.List ze6 = b6Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.j1) b6Var).ze(d0Var.f124391a, i17 + 1) : null;
            if (ze6 != null) {
                java.util.Iterator it = ((java.util.ArrayList) kz5.n0.V(ze6)).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) it.next();
                    i18++;
                    if (i18 > i17) {
                        d0Var.f124392b = true;
                    } else {
                        cl1.n0 n0Var = new cl1.n0(1);
                        n0Var.f124421a = c11714x918fd2e4;
                        arrayList.add(n0Var);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c11714x918fd2e4, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo");
                        d0Var.f124391a = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) c11714x918fd2e4).C;
                    }
                }
            }
            lVar.mo146xb9724478(arrayList);
        }
    }
}
