package h00;

/* loaded from: classes8.dex */
public final class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f359349a;

    public e(int i17) {
        this.f359349a = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processCgi errType:");
        sb6.append(i17);
        sb6.append(" errCode:");
        sb6.append(i18);
        sb6.append(" scene:");
        int i19 = this.f359349a;
        sb6.append(i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsInitCgiHandler", sb6.toString());
        if (i17 != 0 || i18 != 0 || oVar == null || (fVar = oVar.f152244b.f152233a) == null || !(fVar instanceof bw5.f7)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsInitCgiHandler", "processCgi error");
            return;
        }
        try {
            java.util.LinkedList<bw5.s20> linkedList = ((bw5.f7) fVar).f108710d;
            if (linkedList != null) {
                for (bw5.s20 s20Var : linkedList) {
                    h00.a.f359341a.b(s20Var.f114302d, s20Var.f114304f);
                    h00.h hVar = h00.h.f359353a;
                    h00.w wVar = (h00.w) ((java.util.Map) ((jz5.n) h00.h.f359356d).mo141623x754a37bb()).get(java.lang.Integer.valueOf(s20Var.f114302d));
                    if (wVar != null) {
                        wVar.b(s20Var);
                    }
                    java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) h00.h.f359357e.get(java.lang.Integer.valueOf(s20Var.f114302d));
                    if (copyOnWriteArraySet != null) {
                        java.util.Iterator it = copyOnWriteArraySet.iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.ui.C21418xf4760ced c21418xf4760ced = (com.p314xaae8f345.mm.ui.C21418xf4760ced) ((c00.s3) it.next());
                            c21418xf4760ced.getClass();
                            int i27 = com.p314xaae8f345.mm.ui.C21417xe2e4fa74.B1;
                            c21418xf4760ced.f278494a.L0();
                        }
                    }
                }
            }
            java.lang.String source = "EcsInit-" + i19;
            oh3.q qVar = (oh3.q) ((p90.j) i95.n0.c(p90.j.class));
            qVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
            qVar.wi().n(source);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsInitCgiHandler", "processCgi exp:" + e17);
        }
    }
}
