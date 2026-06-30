package vr2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca f521148a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca finderHomeUIC) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderHomeUIC, "finderHomeUIC");
        this.f521148a = finderHomeUIC;
    }

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        android.app.Activity context = this.f521148a.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        } else {
            nyVar = null;
        }
        if (nyVar != null) {
            return nyVar.f216913n;
        }
        return 20;
    }

    public final java.util.List b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca = this.f521148a;
        boolean z17 = false;
        if (i17 == 17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 U6 = c15456x2c452bca.U6(1);
            if (U6 != null) {
                cs2.k kVar = (cs2.k) pf5.z.f435481a.b(U6).a(cs2.k.class);
                cs2.j jVar = kVar.f303609d;
                es2.g gVar = jVar instanceof es2.g ? (es2.g) jVar : null;
                if (gVar != null && gVar.f337894y) {
                    z17 = true;
                }
                if ((z17 ? jVar : null) != null) {
                    arrayList.add(kVar);
                }
            }
            return arrayList;
        }
        if (i17 != 18) {
            if (i17 != 20) {
                return kz5.p0.f395529d;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 U62 = c15456x2c452bca.U6(1);
            if (U62 != null) {
                cs2.k kVar2 = (cs2.k) pf5.z.f435481a.b(U62).a(cs2.k.class);
                cs2.j jVar2 = kVar2.f303609d;
                es2.g gVar2 = jVar2 instanceof es2.g ? (es2.g) jVar2 : null;
                if (gVar2 != null && gVar2.f337894y) {
                    z17 = true;
                }
                if ((z17 ? jVar2 : null) != null) {
                    arrayList2.add(kVar2);
                }
            }
            return arrayList2;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 U63 = c15456x2c452bca.U6(4);
        if (U63 != null) {
            cs2.k kVar3 = (cs2.k) pf5.z.f435481a.b(U63).a(cs2.k.class);
            cs2.j jVar3 = kVar3.f303609d;
            es2.g gVar3 = jVar3 instanceof es2.g ? (es2.g) jVar3 : null;
            if (!(gVar3 != null && gVar3.f337894y)) {
                jVar3 = null;
            }
            if (jVar3 != null) {
                arrayList3.add(kVar3);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 U64 = c15456x2c452bca.U6(3);
        if (U64 != null) {
            cs2.k kVar4 = (cs2.k) pf5.z.f435481a.b(U64).a(cs2.k.class);
            cs2.j jVar4 = kVar4.f303609d;
            es2.g gVar4 = jVar4 instanceof es2.g ? (es2.g) jVar4 : null;
            if (gVar4 != null && gVar4.f337894y) {
                z17 = true;
            }
            if ((z17 ? jVar4 : null) != null) {
                arrayList3.add(kVar4);
            }
        }
        return arrayList3;
    }
}
