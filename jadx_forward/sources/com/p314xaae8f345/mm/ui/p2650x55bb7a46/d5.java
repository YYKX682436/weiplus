package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes8.dex */
public final class d5 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f281949d;

    public d5(java.util.List list) {
        this.f281949d = list;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        int i19;
        if (i17 == 6786 && i18 == -1) {
            java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.f9> list = this.f281949d;
            long size = list.size();
            long size2 = list.size() - com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.f(list);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w3 w3Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.f287761a;
            pm0.v.K(null, new yd5.l(5L, size, size2, w3Var.f287740g, w3Var.f287741h, w3Var.f287742i));
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : list) {
                if (f9Var.k2()) {
                    java.lang.String j17 = f9Var.j();
                    if (j17 == null) {
                        j17 = "";
                    }
                    ot0.q v17 = ot0.q.v(j17);
                    if (v17 != null && ((i19 = v17.f430199i) == 51 || i19 == 106 || i19 == 129)) {
                        zy2.i iVar = (zy2.i) v17.y(zy2.i.class);
                        if (iVar != null) {
                            java.lang.String m75945x2fec8307 = iVar.f558944b.m75945x2fec8307(0);
                            if (m75945x2fec8307 == null) {
                                m75945x2fec8307 = "";
                            }
                            java.lang.String m75945x2fec83072 = iVar.f558944b.m75945x2fec8307(8);
                            linkedList.add(new android.util.Pair(m75945x2fec8307, m75945x2fec83072 != null ? m75945x2fec83072 : ""));
                        }
                    }
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).nj(linkedList, false);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList2)) {
                return;
            }
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).nj(linkedList2, true);
        }
    }
}
