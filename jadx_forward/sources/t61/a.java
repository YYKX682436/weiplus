package t61;

/* loaded from: classes9.dex */
public class a implements ns.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t61.c f497516d;

    public a(t61.c cVar) {
        this.f497516d = cVar;
    }

    @Override // ns.e
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendSortView", "canAddContact %s,%s", str, java.lang.Boolean.valueOf(z17));
        t61.c cVar = this.f497516d;
        if (!z17) {
            if (z18) {
                r61.z1.c(cVar.f497518d.f497527g.f474533a.f67922xdd77ad16, 1);
                fb5.m mVar = cVar.f497519e.f497520a.f279399g;
                mVar.c(mVar.f342427d);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(cVar.f497518d.f497527g.f474533a.f67922xdd77ad16, true);
        int i17 = (int) n17.E2;
        t61.e eVar = cVar.f497518d;
        if (i17 == 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                n17.X1(eVar.f497527g.f474533a.f67922xdd77ad16);
            } else {
                n17.X1(str);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(n17);
            n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(n17.d1(), true);
        }
        if (((int) n17.E2) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecoverFriendSortView", "addContact : insert contact failed");
            return;
        }
        c01.e2.m0(n17);
        t61.d dVar = cVar.f497519e;
        db5.e1.T(dVar.f497520a.getContext(), dVar.f497520a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571539i8));
        r61.z1.c(eVar.f497527g.f474533a.f67922xdd77ad16, 0);
        fb5.m mVar2 = dVar.f497520a.f279399g;
        mVar2.c(mVar2.f342427d);
    }
}
