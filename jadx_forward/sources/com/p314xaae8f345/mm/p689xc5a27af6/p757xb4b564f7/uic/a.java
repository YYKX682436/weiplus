package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.b f148855d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.b bVar) {
        super(1);
        this.f148855d = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        hb0.a state = (hb0.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof eb0.d)) {
            java.util.ArrayList arrayList = ((eb0.d) dVar).f332239b;
            com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.b bVar = this.f148855d;
            if (arrayList == null || arrayList.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgAppBrandMultiSelectPreProcessUIC", "msgInfo is null, return");
                bVar.T6(null, null);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5.class);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 b17 = db0.g.f309361a.b((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next());
                    if (b17 != null) {
                        arrayList2.add(b17);
                    } else {
                        arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622("unsupported", "", ""));
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 Di = k5Var != null ? ((zh1.p) k5Var).Di(arrayList2) : null;
                bVar.T6(Di, arrayList);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Di);
                if (currentTimeMillis - Di.f167786h > ((java.lang.Number) ((jz5.n) db0.d.f309358c).mo141623x754a37bb()).longValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgAppBrandMultiSelectPreProcessUIC", "time:" + (java.lang.System.currentTimeMillis() - Di.f167786h) + " fetchMultiSelectOpenMaterialsByCgi");
                    ((zh1.p) k5Var).Bi(arrayList2, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
