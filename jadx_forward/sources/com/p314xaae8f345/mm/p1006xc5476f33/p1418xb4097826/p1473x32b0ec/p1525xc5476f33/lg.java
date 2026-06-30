package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class lg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f194927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f194928e;

    public lg(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        this.f194927d = list;
        this.f194928e = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f194927d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f194928e;
        synchronized (list) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.c1) mgVar.P0(mm2.c1.class)).G3, java.lang.Boolean.FALSE)) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (kz5.z.F((int[]) ((jz5.n) mgVar.V).mo141623x754a37bb(), ((dk2.zf) obj).mo124533xfb85f7b0())) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.addAll(list);
            }
        }
        this.f194928e.R1(arrayList, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar2 = this.f194928e;
        mgVar2.I = ((mm2.x4) mgVar2.P0(mm2.x4.class)).f411072t;
        boolean z17 = ((mm2.x4) this.f194928e.P0(mm2.x4.class)).f411071s;
        int i17 = ((mm2.x4) this.f194928e.P0(mm2.x4.class)).f411070r;
        long j17 = ((mm2.c1) this.f194928e.P0(mm2.c1.class)).f410308a2 - this.f194928e.I;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "[updateMessagesOnViewAttach] readCount:" + this.f194928e.I + ", unreadCount" + j17 + ",reachLast" + z17 + ", position" + i17);
        if (this.f194928e.D.mo1894x7e414b06() > 0) {
            if (z17) {
                this.f194928e.C1().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kg(this.f194928e));
                return;
            }
            if (i17 < 0) {
                i17 = 0;
            } else if (i17 >= this.f194928e.D.mo1894x7e414b06()) {
                i17 = this.f194928e.D.mo1894x7e414b06() - 1;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14339x748bebd7 C1 = this.f194928e.C1();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(C1, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$updateMessagesOnViewAttach$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            C1.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(C1, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$updateMessagesOnViewAttach$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            this.f194928e.N1(j17);
        }
    }
}
