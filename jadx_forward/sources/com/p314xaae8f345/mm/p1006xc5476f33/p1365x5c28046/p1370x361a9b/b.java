package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k f179149a;

    public b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.c();
        cVar.f179150a = 1;
        r11.a aVar = new r11.a();
        int i17 = cVar.f179150a;
        cVar.f179151b = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.d(i17, i17, aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.e(cVar);
        synchronized (this) {
            if (this.f179149a == null) {
                this.f179149a = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k(eVar);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoader", "[cpan] BKGLoader had init.");
            }
        }
    }

    public void a(pr.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k kVar = this.f179149a;
        if (kVar.f179171i == null) {
            kVar.f179171i = new java.util.HashSet();
        }
        if (((java.util.HashSet) kVar.f179171i).contains(aVar)) {
            return;
        }
        ((java.util.HashSet) kVar.f179171i).add(aVar);
    }

    public void b() {
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.a(this));
    }

    public void c(pr.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k kVar = this.f179149a;
        if (kVar.f179171i == null) {
            kVar.f179171i = new java.util.HashSet();
        }
        if (((java.util.HashSet) kVar.f179171i).contains(aVar)) {
            ((java.util.HashSet) kVar.f179171i).remove(aVar);
        }
    }
}
