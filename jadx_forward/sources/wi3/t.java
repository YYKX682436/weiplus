package wi3;

/* loaded from: classes4.dex */
public class t implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi3.r f527802d;

    public t(wi3.r rVar) {
        this.f527802d = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        wi3.r rVar = this.f527802d;
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20321xf3a058b5()) == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.Float) it.next());
                sb6.append("\n");
            }
            ((zc0.h) ((xs.i1) i95.n0.c(xs.i1.class))).aj(java.lang.String.format("mmfg_rpt_%s.txt", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), sb6.toString().getBytes(), true);
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (linkedList.size() > 38400) {
            linkedList = new java.util.LinkedList(linkedList.subList(0, 38400));
        }
        wi3.m mVar = new wi3.m();
        mVar.f527766d = linkedList;
        linkedList2.add(mVar);
        wi3.n nVar = new wi3.n();
        nVar.f527767d = linkedList2;
        try {
            byte[] mo14344x5f01b1f6 = nVar.mo14344x5f01b1f6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMultiMediaReport", "[checkImg] byte size = " + mo14344x5f01b1f6.length);
            rVar.f527794e.B = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneMultiMediaReport", e17, java.lang.String.format("error %s", rVar.f527795f), new java.lang.Object[0]);
        }
        java.lang.String str = rVar.f527795f;
        wi3.s sVar = new wi3.s(this);
        wi3.l lVar = wi3.l.f527759a;
        p3325xe03a0797.p3326xc267989b.l.f(null, new wi3.h(str, sVar, null), 1, null);
        return null;
    }
}
