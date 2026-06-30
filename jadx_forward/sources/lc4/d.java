package lc4;

/* loaded from: classes4.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(o75.c cVar) {
        java.util.HashMap hashMap;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateResumeData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
        o75.b bVar = cVar.f425120a;
        o75.b bVar2 = o75.b.f425114b;
        java.lang.Object obj = null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, o75.b.f425115c)) {
            xc4.p pVar = (xc4.p) cVar.f425123d;
            if (pVar != null) {
                java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.Q6().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (pVar.m125473x3fdd41df() > ((zc4.b) next).n().m125473x3fdd41df()) {
                        obj = next;
                        break;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.Q6().add(kz5.n0.c0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.Q6(), (zc4.b) obj), new zc4.b(pVar, true));
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, o75.b.f425116d)) {
            xc4.p pVar2 = (xc4.p) cVar.f425123d;
            if (pVar2 != null) {
                java.util.Iterator it6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.Q6().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it6.next();
                    zc4.b bVar3 = (zc4.b) next2;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar2.a1(), bVar3.n().a1()) || (bVar3.n().y0() == 0 && pVar2.U0() == bVar3.n().U0())) {
                        obj = next2;
                        break;
                    }
                }
                int c07 = kz5.n0.c0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.Q6(), (zc4.b) obj);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.Q6().remove(c07);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.Q6().add(c07, new zc4.b(pVar2, true));
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, o75.b.f425117e)) {
            xc4.p pVar3 = (xc4.p) cVar.f425123d;
            if (pVar3 != null) {
                java.util.Iterator it7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.Q6().iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    java.lang.Object next3 = it7.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar3.a1(), ((zc4.b) next3).n().a1())) {
                        obj = next3;
                        break;
                    }
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.Q6()).remove((zc4.b) obj);
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, o75.b.f425118f) && (hashMap = cVar.f425124e) != null) {
            java.util.Iterator it8 = hashMap.entrySet().iterator();
            while (it8.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.f250294r.a((o75.c) ((java.util.Map.Entry) it8.next()).getValue());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateResumeData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
    }
}
