package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f262666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.b f262667b;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.b bVar, boolean z17) {
        this.f262667b = bVar;
        this.f262666a = z17;
    }

    public void a(nt4.f fVar, mt4.d dVar) {
        if (fVar.c() || dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GoogleWallet", "Failed to query inventory: " + fVar);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.b bVar = this.f262667b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.c cVar = bVar.f262669a;
        cVar.f262678f = dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e eVar = cVar.f262675c;
        java.util.Map map = dVar.f412834a;
        java.util.ArrayList arrayList = new java.util.ArrayList(((java.util.HashMap) map).keySet());
        java.util.ArrayList arrayList2 = (java.util.ArrayList) eVar.f262695k;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(((java.util.HashMap) map).values());
        if (arrayList3.size() <= 0) {
            nt4.f a17 = !this.f262666a ? nt4.f.a(5) : nt4.f.a(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f fVar2 = bVar.f262669a.f262676d;
            if (fVar2 != null) {
                fVar2.a(a17, null);
                return;
            }
            return;
        }
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            mt4.e eVar2 = (mt4.e) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleWallet", "do NetSceneVerifyPurchase. productId:" + eVar2.f412837c + ",billNo:" + eVar2.f412838d);
            gm0.j1.i();
            gm0.j1.n().f354821b.g(bVar.f262669a.f262675c.a(eVar2, true));
        }
    }
}
