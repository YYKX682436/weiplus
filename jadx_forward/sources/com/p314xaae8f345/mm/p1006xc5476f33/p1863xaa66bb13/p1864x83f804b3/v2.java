package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3;

/* loaded from: classes11.dex */
public final class v2 extends pq5.c implements vg3.y4 {
    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.t2 t2Var) {
    }

    public void x(final java.lang.Object obj) {
        w(new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.x2(this, obj));
        fs.g.b(vg3.u4.class, new fs.o() { // from class: com.tencent.mm.plugin.messenger.foundation.v2$$b
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((b60.l) ((vg3.u4) nVar)).getClass();
                ((rj.p) ((qk.w7) i95.n0.c(qk.w7.class))).getClass();
                xr.a aVar = xr.a.f537660a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgEngine", "[afterSyncDoCmd] check time:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                return false;
            }
        });
    }

    public void y(final java.lang.Object obj) {
        w(new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.w2(this, obj));
        fs.g.b(vg3.u4.class, new fs.o() { // from class: com.tencent.mm.plugin.messenger.foundation.v2$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                java.util.ArrayList<qk.h6> arrayList;
                ((b60.l) ((vg3.u4) nVar)).getClass();
                ((rj.p) ((qk.w7) i95.n0.c(qk.w7.class))).getClass();
                xr.a aVar = xr.a.f537660a;
                xr.a.f537661b = true;
                if (xr.a.f537662c) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgEngine", "[checkFromDb] begin!");
                    com.p314xaae8f345.mm.p2621x8fb0427b.x7.f277864d.getClass();
                    android.database.Cursor D = com.p314xaae8f345.mm.p2621x8fb0427b.x7.f277866f.D("FunctionMsgItem", com.p314xaae8f345.mm.p2621x8fb0427b.x7.f277865e, "status<=? and opCode!= -1", new java.lang.String[]{"2"}, null, null, null, 2);
                    if (D != null) {
                        try {
                            arrayList = new java.util.ArrayList();
                            D.moveToFirst();
                            while (!D.isAfterLast()) {
                                qk.h6 h6Var = new qk.h6();
                                h6Var.mo9015xbf5d97fd(D);
                                arrayList.add(h6Var);
                                D.moveToNext();
                            }
                            vz5.b.a(D, null);
                        } finally {
                        }
                    } else {
                        arrayList = null;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
                    for (qk.h6 h6Var2 : arrayList) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgEngine", "[checkFromDb] item:%s", h6Var2);
                        int i17 = h6Var2.f66771x9878653;
                        if (i17 != -1) {
                            as.a cVar = i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 101 ? null : new as.c() : new as.g() : new as.f() : new as.d() : new as.i();
                            if (cVar != null) {
                                xr.a.f537664e.a(i17, h6Var2, cVar);
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.x7.f277864d.getClass();
                    l75.k0 k0Var = com.p314xaae8f345.mm.p2621x8fb0427b.x7.f277866f;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgStorage", "[deleteAllHandleFunctionMsg] ret1:" + k0Var.mo70514xb06685ab("FunctionMsgItem", "status=?", new java.lang.String[]{"100"}) + " ret2:" + k0Var.mo70514xb06685ab("FunctionMsgItem", "status=?", new java.lang.String[]{"3"}));
                    xr.a.f537662c = false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgEngine", "[beforeSyncDoCmd] isInit:" + xr.a.f537662c);
                return false;
            }
        });
    }

    public void z(final java.lang.Object obj) {
        w(new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.y2(this, obj));
        fs.g.b(vg3.u4.class, new fs.o() { // from class: com.tencent.mm.plugin.messenger.foundation.v2$$c
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((b60.l) ((vg3.u4) nVar)).getClass();
                ((rj.p) ((qk.w7) i95.n0.c(qk.w7.class))).getClass();
                xr.a aVar = xr.a.f537660a;
                xr.a.f537661b = false;
                aVar.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgEngine", "[finishSyncDoCmd] check time:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                return false;
            }
        });
    }
}
