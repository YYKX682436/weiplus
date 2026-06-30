package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes2.dex */
public final class wc implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.xc f255943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f255944e;

    public wc(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.xc xcVar, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf) {
        this.f255943d = xcVar;
        this.f255944e = c22848x6ddd90cf;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 netSceneBase) {
        pj4.k1 k1Var;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(netSceneBase, "netSceneBase");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.xc xcVar = this.f255943d;
        if (i17 == 0 && i18 == 0 && (k1Var = ((ej4.g) netSceneBase).f334892f) != null) {
            xcVar.f255968e = k1Var.f436689e;
            xcVar.f255969f = k1Var.f436690f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList linkedList = k1Var.f436688d;
            arrayList.addAll(linkedList);
            if (arrayList.size() > 1) {
                kz5.g0.t(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.vc());
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                c22848x6ddd90cf = this.f255944e;
                if (!hasNext) {
                    break;
                }
                java.lang.Object next = it.next();
                if (next instanceof pj4.b2) {
                    c22848x6ddd90cf.m82898xfb7e5820().add(new kj4.b(xcVar.f255965b, (pj4.b2) next));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeListActivity", "HistoryItemLoader: onSceneEnd likedSize=" + linkedList.size());
            c22848x6ddd90cf.m8146xced61ae5();
        }
        xcVar.f255966c.N(0);
    }
}
