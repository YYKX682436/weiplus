package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

@j95.b
/* loaded from: classes7.dex */
public final class i extends i95.w implements ft.e {
    static {
        new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.c(null);
    }

    @Override // ft.e
    public java.util.List R6() {
        java.util.List list;
        boolean o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        kz5.p0 p0Var = kz5.p0.f395529d;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0 c10757xa20383b0 = com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d;
        if (o17) {
            com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10458x88813eff c10458x88813eff = (com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10458x88813eff) uk0.a.d(c10757xa20383b0, com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.g.f146606a);
            if (c10458x88813eff != null && (list = c10458x88813eff.f146576d) != null) {
                return list;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessManagerServiceAnyProcess", "getAllProcesses(), by mm, ipc failed");
            return p0Var;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z7 b17 = m45.b.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.String[] strArr = gm0.j1.f354738l;
        boolean z17 = false;
        int i17 = 0;
        while (i17 < 5) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + strArr[i17];
            if ((str != null && b17.f274670a.indexOfKey(str.hashCode()) >= 0) ? true : z17) {
                com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7 c10457xa2522bd7 = (com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7) com.p314xaae8f345.mm.p794xb0fa9b5e.f.b(str, c10757xa20383b0, com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.h.f146607a);
                if (c10457xa2522bd7 != null) {
                    linkedList.add(c10457xa2522bd7);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessManagerServiceAnyProcess", "getAllProcesses(), by each process, ipc ready process:" + str + " failed");
                }
            } else {
                linkedList.add(new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7(str, p0Var, r26.i0.o(str, ":appbrand1", z17, 2, null) ? ft.d.WAGAME : ft.d.WASERVICE, false, 0, 16, null));
            }
            i17++;
            z17 = false;
        }
        return linkedList;
    }

    @Override // ft.e
    public void Rc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1051x5c6729a.C11865xc185f759 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
    }

    @Override // ft.e
    public void V4() {
        throw new jz5.k("An operation is not implemented: Not support");
    }

    @Override // ft.e
    public void g5(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
    }

    @Override // ft.e
    public void m7(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
    }

    @Override // ft.e
    public void v6() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j()) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r0.f156776h;
            ((ku5.t0) ku5.t0.f394148d).b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.RunnableC11643x65cd523(), "MicroMsg.AppBrandProcessSuicideLogic");
        }
    }
}
