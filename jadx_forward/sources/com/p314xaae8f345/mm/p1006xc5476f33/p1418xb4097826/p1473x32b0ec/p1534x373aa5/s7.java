package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class s7 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.u7 f198207d;

    public s7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.u7 u7Var) {
        this.f198207d = u7Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        wu5.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.what == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.u7 u7Var = this.f198207d;
            u7Var.getClass();
            gk2.e eVar = gk2.e.f354004n;
            if (eVar != null) {
                mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
                r45.b22 b22Var = (r45.b22) u7Var.f198248b.get(java.lang.Long.valueOf(((mm2.e1) c1Var.m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
                if (b22Var == null) {
                    b22Var = new r45.b22();
                }
                java.lang.String m75945x2fec8307 = b22Var.m75945x2fec8307(0);
                boolean z17 = !(m75945x2fec8307 == null || m75945x2fec8307.length() == 0);
                gk2.e eVar2 = gk2.e.f354004n;
                boolean z18 = eVar2 != null && ((mm2.c1) eVar2.a(mm2.c1.class)).U7();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMultiTaskManager", "addToHistory: has added = " + z17 + ", is live finished = " + z18 + ", liveId = " + ((mm2.e1) c1Var.m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0) + ", objectId = " + ((mm2.e1) c1Var.m147920xbba4bfc0(mm2.e1.class)).f410516m);
                if (!z17 && !z18) {
                    b22Var.set(1, java.lang.Long.valueOf(((mm2.e1) c1Var.m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
                    b22Var.set(2, ((mm2.e1) c1Var.m147920xbba4bfc0(mm2.e1.class)).f410525v);
                    b22Var.set(3, java.lang.Long.valueOf(((mm2.e1) c1Var.m147920xbba4bfc0(mm2.e1.class)).f410516m));
                    b22Var.set(4, c1Var.f410385o);
                    b22Var.set(5, c1Var.V1);
                    b22Var.set(6, ((mm2.e1) c1Var.m147920xbba4bfc0(mm2.e1.class)).f410526w);
                    b22Var.set(7, c1Var.f410379n);
                    u7Var.f198248b.put(java.lang.Long.valueOf(((mm2.e1) c1Var.m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)), b22Var);
                    u7Var.b();
                    cVar = ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r7(((mm2.c1) c1Var.m147920xbba4bfc0(mm2.c1.class)).t7(), u7Var));
                }
            } else {
                cVar = null;
            }
            if (cVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveMultiTaskManager", "addToHistory: curLiveRoomData is null");
            }
        }
        return true;
    }
}
