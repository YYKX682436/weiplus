package qs2;

/* loaded from: classes4.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs2.q f447846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6085x679e6f54 f447847e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qs2.q qVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6085x679e6f54 c6085x679e6f54) {
        super(0);
        this.f447846d = qVar;
        this.f447847e = c6085x679e6f54;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        am.mw mwVar = this.f447847e.f136363g;
        long j17 = mwVar.f88907b;
        long j18 = mwVar.f88906a;
        qs2.q qVar = this.f447846d;
        java.util.ArrayList arrayList = (java.util.ArrayList) ((jz5.n) qVar.f447851e).mo141623x754a37bb();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((java.lang.Number) ((jz5.l) next).f384366d).longValue() == j17) {
                arrayList2.add(next);
            }
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6903xb8bbdc4e c6903xb8bbdc4e = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6903xb8bbdc4e) ((jz5.l) it6.next()).f384367e;
            c6903xb8bbdc4e.f142226e = c6903xb8bbdc4e.b("snsfeedid", j18 != 0 ? pm0.v.u(j18) : "", true);
            c6903xb8bbdc4e.k();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6903xb8bbdc4e);
        }
        jz5.g gVar = qVar.f447851e;
        pm0.v.b0((java.util.ArrayList) ((jz5.n) gVar).mo141623x754a37bb(), new qs2.g(j17));
        if (((java.util.ArrayList) ((jz5.n) gVar).mo141623x754a37bb()).isEmpty()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1615xf1f89d0f.C14925x9a2e912b) ((jz5.n) qVar.f447852f).mo141623x754a37bb()).mo48814x2efc64();
        }
        return jz5.f0.f384359a;
    }
}
