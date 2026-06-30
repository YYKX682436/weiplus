package iy4;

/* loaded from: classes11.dex */
public final class o implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iy4.p f377512d;

    public o(iy4.p pVar) {
        this.f377512d = pVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.ArrayList K = ug3.i.K();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(K, "getOnlineInfoList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(K, 10));
        java.util.Iterator it = K.iterator();
        while (it.hasNext()) {
            arrayList.add(((ug3.k) it.next()).F);
        }
        com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.C23707xca910d7a c23707xca910d7a = this.f377512d.f377515e;
        if (c23707xca910d7a != null) {
            c23707xca910d7a.m87839x5ee1f046(arrayList, iy4.n.f377511d);
        }
    }
}
