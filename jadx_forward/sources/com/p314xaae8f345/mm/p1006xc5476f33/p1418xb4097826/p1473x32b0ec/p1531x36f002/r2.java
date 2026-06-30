package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f197201a = new java.util.LinkedList();

    public final void a(java.lang.String tag, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewClickCntManager", "oldClickCnt:" + i17 + "  newClickCnt:" + i18);
        pm0.z.b(xy2.b.f539688b, "newOldDiffCntEqauls", i17 == i18, null, null, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.q2(tag, i17, i18), 60, null);
    }

    public final int b(boolean z17) {
        int i17;
        synchronized (this.f197201a) {
            try {
                if (z17) {
                    i17 = 0;
                    while (!this.f197201a.isEmpty()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.p2) this.f197201a.poll();
                        i17 += p2Var != null ? p2Var.f197181b : 0;
                    }
                } else {
                    java.util.Iterator it = this.f197201a.iterator();
                    int i18 = 0;
                    while (it.hasNext()) {
                        i18 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.p2) it.next()).f197181b;
                    }
                    i17 = 0 + i18;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        return i17;
    }

    public final void c(dk2.g comboData, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comboData, "comboData");
        synchronized (this.f197201a) {
            this.f197201a.offer(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.p2(comboData.f315000b, i17));
        }
    }
}
