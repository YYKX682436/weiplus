package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5 f173521g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5 delegate) {
        super(delegate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f173521g = delegate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public int Dc(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        if (!m2(str, i17)) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) this.f173493d).Dc(str, i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionStorageWithCache", "isCollection reorder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.s1 s1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.q0.f173570a;
        java.util.List V0 = kz5.n0.V0(xi(s1Var.f173586b, s1Var.f173587c));
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c11714x918fd2e4.f157894d, str) && c11714x918fd2e4.f157896f == i17) {
                break;
            }
            i18++;
        }
        if (i18 < 0) {
            return -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionStorageWithCache", "addCollection exist, remove and insert: " + str + " atPos:" + i18);
        arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) arrayList.remove(i18));
        return Lg(V0, 0) ? 0 : -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public boolean Lg(java.util.List list, int i17) {
        return this.f173521g.Lg(list, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public boolean Y1(java.lang.String str, int i17) {
        return this.f173521g.Y1(str, i17);
    }

    @Override // l75.l0
    public void add(java.lang.String str, l75.q0 q0Var) {
        this.f173521g.add(str, q0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d
    public void c(l75.q0 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) this.f173493d).add(listener);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public int ce(java.lang.String str, int i17, boolean z17) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        if (!m2(str, i17)) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) this.f173493d).ce(str, i17, z17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionStorageWithCache", "isCollection reorder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.s1 s1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.q0.f173570a;
        java.util.List V0 = kz5.n0.V0(xi(s1Var.f173586b, s1Var.f173587c));
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c11714x918fd2e4.f157894d, str) && c11714x918fd2e4.f157896f == i17) {
                break;
            }
            i18++;
        }
        if (i18 < 0) {
            return -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionStorageWithCache", "addCollection exist, remove and insert: " + str + " atPos:" + i18);
        arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) arrayList.remove(i18));
        return Lg(V0, 0) ? 0 : -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d
    public void f(java.lang.String str, l75.w0 eventData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventData, "eventData");
        fs.g.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c6.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.g(str, eventData));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    /* renamed from: getCount */
    public int mo49831x7444f759() {
        return this.f173521g.mo49831x7444f759();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d
    public java.lang.Object k(java.lang.Object[] args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        java.util.Iterator a17 = p3321xbce91901.jvm.p3324x21ffc6bd.c.a(args);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5 z5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) this.f173493d;
        p3321xbce91901.jvm.p3324x21ffc6bd.b bVar = (p3321xbce91901.jvm.p3324x21ffc6bd.b) a17;
        java.lang.Object next = bVar.next();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(next, "null cannot be cast to non-null type kotlin.Int");
        java.util.List xi6 = z5Var.xi(((java.lang.Integer) next).intValue(), (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5) bVar.next());
        return xi6 == null ? kz5.p0.f395529d : xi6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public boolean m2(java.lang.String str, int i17) {
        return this.f173521g.m2(str, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public boolean nh(java.lang.String str, int i17) {
        return this.f173521g.nh(str, i17);
    }

    @Override // l75.l0
    /* renamed from: remove */
    public void mo49775xc84af884(l75.q0 q0Var) {
        if (q0Var != null) {
            l(q0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public java.util.List xi(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5 y5Var) {
        return (java.util.List) i(java.lang.Integer.valueOf(i17), y5Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public int y7() {
        return this.f173521g.y7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public java.util.List ye(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5 y5Var, int i18) {
        return this.f173521g.ye(i17, y5Var, i18);
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var) {
        if (q0Var != null) {
            b(q0Var);
        }
    }
}
