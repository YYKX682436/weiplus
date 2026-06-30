package cl1;

/* loaded from: classes7.dex */
public final class a0 extends cl1.y {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5 f124383a;

    @Override // cl1.y
    public java.util.List a() {
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.f124383a == null) {
            this.f124383a = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.v.f173600a.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5 z5Var = this.f124383a;
        if (z5Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.s1 s1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.q0.f173570a;
            list = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h) z5Var).xi(s1Var.f173586b, s1Var.f173587c);
        } else {
            list = null;
        }
        if (list != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 : kz5.n0.V(list)) {
                cl1.n0 n0Var = new cl1.n0(2);
                n0Var.f124421a = c11714x918fd2e4;
                arrayList.add(n0Var);
            }
        }
        return arrayList;
    }

    @Override // cl1.y
    public void b(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        callback.mo146xb9724478(kz5.p0.f395529d);
    }

    @Override // cl1.y
    public java.lang.String d() {
        java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.a0j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // cl1.y
    public int e() {
        return 2;
    }
}
