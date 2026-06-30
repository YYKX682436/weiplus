package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class i1 implements oq1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f225512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.f f225513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f225514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 f225515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 f225516e;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.f fVar, java.util.List list, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        this.f225516e = g1Var;
        this.f225512a = map;
        this.f225513b = fVar;
        this.f225514c = list;
        this.f225515d = abstractC3700xe41a2874;
    }

    @Override // oq1.p
    public void a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            oq1.q qVar = (oq1.q) it.next();
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f428882d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var = this.f225516e;
            if (K0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp, url is null, appId:%s errorCode:%d responseState:%d", qVar.f428879a, java.lang.Integer.valueOf(qVar.f428887i), qVar.f428880b);
                if (qVar.f428879a.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466)) {
                    com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef u17 = g1Var.u(null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.f fVar = this.f225513b;
                    if (u17 != null) {
                        arrayList2.add(qVar.f428879a);
                        if (fVar != null) {
                            fVar.b(u17, 1);
                        }
                    } else {
                        arrayList3.add(qVar.f428879a);
                        if (fVar != null) {
                            fVar.a(2);
                        }
                    }
                } else {
                    com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = g1Var.y(qVar.f428879a, null);
                    if (y17 != null) {
                        arrayList2.add(qVar.f428879a);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar = g1Var.f225482c;
                        if (hVar != null) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) hVar).mo25334x90b54003(y17, 1);
                        }
                    } else {
                        arrayList3.add(qVar.f428879a);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar2 = g1Var.f225482c;
                        if (hVar2 != null) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) hVar2).mo25333x2fd71e(qVar.f428879a, 2);
                        }
                    }
                }
            } else {
                arrayList.add(qVar.f428879a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "start to download liteapp:%s fileSize:%d url:%s", qVar.f428879a, java.lang.Integer.valueOf(qVar.f428886h), qVar.f428882d);
                boolean equals = qVar.f428879a.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
                java.util.Map map = this.f225512a;
                if (equals) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2) map.get(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
                    if (k2Var != null) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        k2Var.f225534f = currentTimeMillis;
                        k2Var.f225533e = currentTimeMillis;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.INSTANCE.d(qVar, "release", k2Var, null, this.f225513b);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2) map.get(qVar.f428879a);
                    if (k2Var2 != null) {
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        k2Var2.f225534f = currentTimeMillis2;
                        k2Var2.f225533e = currentTimeMillis2;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.INSTANCE.b(qVar, "release", k2Var2, null, g1Var.f225482c);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.b(this.f225516e, this.f225514c, arrayList, arrayList2, arrayList3, "Tinker", this.f225515d);
    }
}
