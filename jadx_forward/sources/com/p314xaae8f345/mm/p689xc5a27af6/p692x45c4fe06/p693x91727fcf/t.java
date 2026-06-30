package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.class})
/* loaded from: classes7.dex */
public final class t extends i95.w implements ft.e {
    @Override // ft.e
    public java.util.List R6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 wi6 = wi();
        if (wi6 == null) {
            return kz5.p0.f395529d;
        }
        if (!(wi6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.z0)) {
            java.util.List k17 = wi6.k();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(k17, 10));
            java.util.Iterator it = k17.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.l((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) it.next(), this));
            }
            return arrayList;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.z0) wi6).k()) {
            java.lang.String i17 = kVar.i();
            if (i17 != null) {
                com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.m mVar = (com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.m) linkedHashMap.get(i17);
                if (mVar == null) {
                    mVar = new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.m();
                    linkedHashMap.put(i17, mVar);
                }
                mVar.f146623d.add(kVar);
                for (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar : kVar.h()) {
                    java.util.LinkedList linkedList = mVar.f146624e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(sVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.task.AppBrandMiniProgramRecord");
                    linkedList.add(new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.s((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o) sVar));
                }
            }
        }
        return new java.util.LinkedList(linkedHashMap.values());
    }

    @Override // ft.e
    public void Rc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1051x5c6729a.C11865xc185f759 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a), null, null, new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.r(this, event, null), 3, null);
    }

    @Override // ft.e
    public void V4() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 wi6 = wi();
        if (wi6 != null) {
            wi6.q(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.c.f129167h);
        }
    }

    @Override // ft.e
    public void g5(java.lang.String appId) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 wi6 = wi();
        if (wi6 == null || (kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) wi6.g(appId)) == null) {
            return;
        }
        kVar.r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12611x832b6657(appId));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ft.e
    public void m7(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        if (abstractC20979x809547d1 == 0) {
            return;
        }
        for (ft.b bVar : R6()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.getF146571d(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)) {
                abstractC20979x809547d1.e();
            } else if (bVar.a()) {
                java.lang.String f146571d = bVar.getF146571d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f146571d, "processName(...)");
                com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(f146571d, new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3938x410b34a6.SafeParcelableWrapper((android.os.Parcelable) abstractC20979x809547d1), com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.n.f146625d, null);
            }
        }
    }

    @Override // ft.e
    public void v6() {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 wi() {
        try {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessManagerServiceImpl", "safeGetProcessManager failed " + th6);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                return null;
            }
            throw new java.lang.UnsupportedOperationException("Only supported in main process", th6);
        }
    }
}
