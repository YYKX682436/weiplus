package aj5;

/* loaded from: classes.dex */
public final class a implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.e f5381d;

    public a(aj5.e eVar) {
        this.f5381d = eVar;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        com.tencent.mm.view.recyclerview.WxRecyclerView k17;
        com.tencent.mm.plugin.mvvmlist.MvvmList a17;
        if (vVar == null || vVar.f351158c != 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreDuplicateGroupUIC", "onFTSSearchEnd " + vVar.f351160e.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List resultList = vVar.f351160e;
        kotlin.jvm.internal.o.f(resultList, "resultList");
        java.util.Iterator it = resultList.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            aj5.e eVar = this.f5381d;
            if (!hasNext) {
                em.l2 l2Var = (em.l2) ((jz5.n) eVar.f5416d).getValue();
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
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f351187e, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.MoreDuplicateGroupUIC", "SearchChatroomBySegmentedWord, idx=" + i17 + ", " + yVar.f351187e + ", " + yVar.f351186d + ", contact = " + n17);
            if (yVar.f351186d > 0) {
                ti5.d dVar = new ti5.d(yVar, vVar.f351159d, 0, i17, 0, 0, null, false, 244, null);
                ri5.h hVar = ri5.j.I;
                int i19 = ri5.j.L;
                java.lang.String d17 = n17.d1();
                kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                ri5.j b17 = ti5.d.f419663i.b(eVar.getActivity(), hVar.a(d17, i19, 0), n17, i19, dVar);
                b17.A = true;
                b17.F = (int) yVar.f351186d;
                arrayList.add(b17);
            }
            i17 = i18;
        }
    }
}
