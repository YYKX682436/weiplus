package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class n1 implements t80.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f225559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f225560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225561c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 f225562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 f225563e;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, java.util.Map map, java.util.List list, java.lang.String str, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        this.f225563e = g1Var;
        this.f225559a = map;
        this.f225560b = list;
        this.f225561c = str;
        this.f225562d = abstractC3700xe41a2874;
    }

    @Override // t80.e
    public void a(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp batch check fail, errorType: %d, errorCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = this.f225562d;
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28873x7725562c(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546.BATCH_CHECK_PACKAGE_UPDATE_FAILED, this.f225561c, i18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.b(this.f225563e, this.f225560b, new java.util.ArrayList(), new java.util.ArrayList(), this.f225560b, this.f225561c, this.f225562d);
        java.util.Iterator it = this.f225560b.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.d(this.f225563e, (java.lang.String) it.next(), i17, i18, str, null);
        }
    }

    @Override // t80.e
    public void b(r45.mg mgVar, r45.mg mgVar2) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        java.util.LinkedList linkedList4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Map map = this.f225559a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var = this.f225563e;
        if (mgVar != null && (linkedList3 = mgVar.f461999d) != null) {
            java.util.Iterator it = linkedList3.iterator();
            while (it.hasNext()) {
                r45.wy4 wy4Var = (r45.wy4) it.next();
                if (wy4Var.f471119e != 0) {
                    arrayList3.add(wy4Var.f471118d);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.d(this.f225563e, wy4Var.f471118d, 0, wy4Var.f471119e, "pay batch check single fail", null);
                } else {
                    r45.xr5 xr5Var = wy4Var.f471120f;
                    if (xr5Var == null || (linkedList4 = xr5Var.f471894d) == null || linkedList4.isEmpty()) {
                        arrayList2.add(wy4Var.f471118d);
                    } else {
                        arrayList.add(wy4Var.f471118d);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2) ((java.util.concurrent.ConcurrentHashMap) g1Var.f225484e).get(wy4Var.f471118d);
                    if (k2Var == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2(g1Var);
                        k2Var2.f225532d = 4;
                        k2Var2.f225530b = java.lang.System.currentTimeMillis();
                        ((java.util.concurrent.ConcurrentHashMap) g1Var.f225484e).put(wy4Var.f471118d, k2Var2);
                    } else {
                        k2Var.f225532d = 4;
                    }
                    java.lang.String str = wy4Var.f471118d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.c(g1Var, str, (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441) map.get(str), wy4Var.f471120f, null);
                }
            }
        }
        if (mgVar2 != null && (linkedList = mgVar2.f461999d) != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                r45.wy4 wy4Var2 = (r45.wy4) it6.next();
                if (wy4Var2.f471119e != 0) {
                    arrayList3.add(wy4Var2.f471118d);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.d(this.f225563e, wy4Var2.f471118d, 0, wy4Var2.f471119e, "pay batch check single fail", null);
                } else {
                    r45.xr5 xr5Var2 = wy4Var2.f471120f;
                    if (xr5Var2 == null || (linkedList2 = xr5Var2.f471894d) == null || linkedList2.isEmpty()) {
                        arrayList2.add(wy4Var2.f471118d);
                    } else {
                        arrayList.add(wy4Var2.f471118d);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2) ((java.util.concurrent.ConcurrentHashMap) g1Var.f225484e).get(wy4Var2.f471118d);
                    if (k2Var3 == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2(g1Var);
                        k2Var4.f225532d = 5;
                        k2Var4.f225530b = java.lang.System.currentTimeMillis();
                        ((java.util.concurrent.ConcurrentHashMap) g1Var.f225484e).put(wy4Var2.f471118d, k2Var4);
                    } else {
                        k2Var3.f225532d = 5;
                    }
                    java.lang.String str2 = wy4Var2.f471118d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.c(g1Var, str2, (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441) map.get(str2), wy4Var2.f471120f, null);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.b(this.f225563e, this.f225560b, arrayList, arrayList2, arrayList3, this.f225561c, this.f225562d);
    }
}
