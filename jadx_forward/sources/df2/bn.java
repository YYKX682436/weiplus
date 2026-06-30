package df2;

/* loaded from: classes3.dex */
public final class bn extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.cn f311351b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(df2.cn cnVar, java.lang.Class cls) {
        super(cls);
        this.f311351b = cnVar;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.util.ArrayList<java.lang.String> arrayList;
        boolean z17;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        r45.ej6 result = (r45.ej6) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        df2.cn cnVar = this.f311351b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cnVar.f311425p, "[startPollingFriendLikeMsg] onPollingSuccess = " + pm0.b0.g(result));
        cnVar.I = (r45.wm2) result.m75936x14adae67(0);
        r45.wm2 wm2Var = (r45.wm2) result.m75936x14adae67(0);
        java.util.LinkedList linkedList = null;
        if (wm2Var == null || (m75941xfb8219142 = wm2Var.m75941xfb821914(3)) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it.next()).m76102x6c03c64c());
            }
        }
        java.lang.String str = cnVar.f311425p;
        if (arrayList != null) {
            for (java.lang.String str2 : arrayList) {
                if (str2 != null && !cnVar.f311424J.contains(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startPollingFriendLikeMsg] hasNewLike userName = " + str2 + " }");
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startPollingFriendLikeMsg] hasNewLike = " + z17);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startPollingFriendLikeMsg] insert bullet");
            r45.ch1 ch1Var = new r45.ch1();
            ch1Var.set(1, 1000067);
            r45.qq1 qq1Var = new r45.qq1();
            r45.wm2 wm2Var2 = (r45.wm2) result.m75936x14adae67(0);
            if (wm2Var2 != null && (m75941xfb821914 = wm2Var2.m75941xfb821914(3)) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 : m75941xfb821914) {
                    r45.xj5 xj5Var = new r45.xj5();
                    xj5Var.set(1, c19781xd1c47b87.m76102x6c03c64c());
                    arrayList2.add(xj5Var);
                }
                linkedList = new java.util.LinkedList(arrayList2);
            }
            qq1Var.set(0, linkedList);
            ch1Var.set(4, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(qq1Var.mo14344x5f01b1f6()));
            dk2.j jVar = new dk2.j(ch1Var);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.add(jVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) cnVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.class);
            if (mgVar != null) {
                mgVar.I1(linkedList2);
            }
        }
        if (arrayList != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startPollingFriendLikeMsg] update ".concat(kz5.n0.g0(arrayList, "|", null, null, 0, null, df2.an.f311264d, 30, null)));
            cnVar.f311424J = new java.util.LinkedList(arrayList);
            if (linkedList != null) {
                if (cnVar.H == null) {
                    cnVar.H = new r45.qq1();
                }
                r45.qq1 qq1Var2 = cnVar.H;
                if (qq1Var2 != null) {
                    qq1Var2.set(0, linkedList);
                }
            }
        }
        dk2.tb tbVar = dk2.ef.f314925k;
        r45.dj6 dj6Var = new r45.dj6();
        dj6Var.set(0, cnVar.I);
        tbVar.h(42, dj6Var);
    }
}
