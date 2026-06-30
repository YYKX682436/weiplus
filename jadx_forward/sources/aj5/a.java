package aj5;

/* loaded from: classes.dex */
public final class a implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.e f86914d;

    public a(aj5.e eVar) {
        this.f86914d = eVar;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17;
        if (vVar == null || vVar.f432691c != 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MoreDuplicateGroupUIC", "onFTSSearchEnd " + vVar.f432693e.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List resultList = vVar.f432693e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resultList, "resultList");
        java.util.Iterator it = resultList.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            aj5.e eVar = this.f86914d;
            if (!hasNext) {
                em.l2 l2Var = (em.l2) ((jz5.n) eVar.f86949d).mo141623x754a37bb();
                if (l2Var == null || (k17 = l2Var.k()) == null || (a17 = xm3.u0.a(k17)) == null) {
                    return;
                }
                a17.n(arrayList, false);
                return;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            p13.y yVar = (p13.y) next;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f432720e, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MoreDuplicateGroupUIC", "SearchChatroomBySegmentedWord, idx=" + i17 + ", " + yVar.f432720e + ", " + yVar.f432719d + ", contact = " + n17);
            if (yVar.f432719d > 0) {
                ti5.d dVar = new ti5.d(yVar, vVar.f432692d, 0, i17, 0, 0, null, false, 244, null);
                ri5.h hVar = ri5.j.I;
                int i19 = ri5.j.L;
                java.lang.String d17 = n17.d1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                ri5.j b17 = ti5.d.f501196i.b(eVar.m158354x19263085(), hVar.a(d17, i19, 0), n17, i19, dVar);
                b17.A = true;
                b17.F = (int) yVar.f432719d;
                arrayList.add(b17);
            }
            i17 = i18;
        }
    }
}
