package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e;

/* loaded from: classes2.dex */
public final class u extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 {

    /* renamed from: d, reason: collision with root package name */
    public im5.c f202550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca f202551e;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca c14438x701c8eca) {
        this.f202551e = c14438x701c8eca;
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.u uVar, long j17, r45.l03 l03Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c cVar) {
        uVar.getClass();
        boolean z17 = cVar.getErrType() == 0 && cVar.getErrCode() == 0;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.a1 a1Var = uVar.f202551e.f202419f;
        if (a1Var != null) {
            int m75939xb282bd08 = l03Var.m75939xb282bd08(5);
            int i17 = (int) currentTimeMillis;
            xn2.p0 p0Var = ((xn2.r) a1Var).f537104a;
            if (i17 == 0) {
                i17 = (int) (java.lang.System.currentTimeMillis() - ((java.lang.Number) ((jz5.n) p0Var.f537079d).mo141623x754a37bb()).longValue());
            }
            int i18 = i17;
            ao2.a k17 = p0Var.k();
            k17.getClass();
            qg3.w wVar = k17.f94076l;
            if (wVar != null) {
                p3380x6a61f93.p3383xf5152754.C30554x21b38a90.m169885x21b06369(((qg3.x) wVar).m105978x2737f10(), "CgiMainFeedList", z17, i18, m75939xb282bd08);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: alive */
    public void mo56311x58998cd() {
        super.mo56311x58998cd();
        this.f202551e.f202418e = new mn2.m3(m56464xb5886c64());
        this.f202550d = new im5.c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: dead */
    public void mo56312x2efc64() {
        super.mo56312x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca c14438x701c8eca = this.f202551e;
        fp0.b bVar = c14438x701c8eca.f202418e;
        if (bVar != null) {
            bVar.mo129985x6761d4f();
        }
        c14438x701c8eca.f202418e = null;
        im5.c cVar = this.f202550d;
        if (cVar != null) {
            cVar.mo10668x2efc64();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetch */
    public void mo56275x5cd06ba(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.d dVar;
        jz5.f0 f0Var2;
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c) {
                    arrayList.add(obj2);
                }
            }
            java.lang.String m56464xb5886c64 = m56464xb5886c64();
            this.f202551e.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c) next;
                if (cVar.getErrType() == 0 && cVar.getErrCode() == 0) {
                    arrayList2.add(next);
                }
            }
            java.util.List V0 = kz5.n0.V0(arrayList2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                java.lang.Object next2 = it6.next();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c) next2).f202438a.m75939xb282bd08(10) == 24) {
                    arrayList3.add(next2);
                }
            }
            int size = arrayList3.size();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                java.lang.Object next3 = it7.next();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c) next3).f202438a.m75939xb282bd08(10) == 23) {
                    arrayList4.add(next3);
                }
            }
            int size2 = arrayList4.size();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                java.lang.Object next4 = it8.next();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c) next4).f202438a.m75939xb282bd08(10) == 28) {
                    arrayList5.add(next4);
                }
            }
            int size3 = arrayList5.size();
            vn2.u0.f519920a.m(m56464xb5886c64, "fetch result seeLaterSize=" + size + ",megaVideoSize=" + size2 + ",reddotVideoSize=" + size3 + ",validRespList=" + V0);
            java.util.ArrayList arrayList6 = (java.util.ArrayList) V0;
            if (!arrayList6.isEmpty()) {
                dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.d(V0);
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.util.Iterator it9 = arrayList6.iterator();
                while (it9.hasNext()) {
                    java.util.List m56409x97891cf7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c) it9.next()).m56409x97891cf7();
                    if (m56409x97891cf7 != null && (!m56409x97891cf7.isEmpty())) {
                        so2.j5 j5Var = (so2.j5) kz5.n0.Z(m56409x97891cf7);
                        if (j5Var instanceof bo2.c) {
                            arrayList7.add(cu2.u.f303974a.o(((bo2.c) j5Var).getFeedObject(), 11001));
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            for (java.lang.Object obj3 : m56409x97891cf7) {
                                if (obj3 instanceof bo2.c) {
                                    arrayList8.add(obj3);
                                }
                            }
                            dVar.f202449b = arrayList8;
                        } else {
                            arrayList7.addAll(m56409x97891cf7);
                        }
                    }
                }
                dVar.m56420x2a5f836b(arrayList7);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c cVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c) kz5.n0.Z(V0);
                dVar.m56423xd4b4a5a1(cVar2 != null ? cVar2.getPullType() : 0);
                java.util.Iterator it10 = arrayList6.iterator();
                loop7: while (true) {
                    while (it10.hasNext()) {
                        z18 = z18 || ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c) it10.next()).getHasMore();
                    }
                }
                dVar.m56419xdac5ee4d(z18);
            } else {
                dVar = null;
            }
            jz5.f0 f0Var3 = jz5.f0.f384359a;
            if (dVar != null) {
                callback.mo55587xb461ee3d(dVar);
                f0Var2 = f0Var3;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                vn2.u0 u0Var = vn2.u0.f519920a;
                java.lang.String tag = m56464xb5886c64();
                java.lang.String msg = "fetch result is null,request=" + obj + '!';
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(tag, "MegaVideoPath\t".concat(msg));
                callback.mo55587xb461ee3d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa(0, 0, null, 7, null));
            }
            f0Var = f0Var3;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            vn2.u0 u0Var2 = vn2.u0.f519920a;
            java.lang.String tag2 = m56464xb5886c64();
            java.lang.String msg2 = "fetch result error,request=" + obj + '!';
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag2, "tag");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg2, "msg");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(tag2, "MegaVideoPath\t".concat(msg2));
            callback.mo55587xb461ee3d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa(0, 0, null, 7, null));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchInit */
    public void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "LongVideo-Trace, fetchInit");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca c14438x701c8eca = this.f202551e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.n(c14438x701c8eca, this, callback);
        fp0.b bVar = c14438x701c8eca.f202418e;
        jz5.f0 f0Var = null;
        if (bVar != null) {
            bVar.b(new mn2.k3(nVar, null, 2, null));
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(m56464xb5886c64(), "fetchInit err,taskExecutor=" + c14438x701c8eca.f202418e);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchLoadMore */
    public void mo56024xaef8a235(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca c14438x701c8eca = this.f202551e;
        if (c14438x701c8eca.f202426p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m56464xb5886c64(), "fetchLoadMore but isLoadingMore now");
            return;
        }
        c14438x701c8eca.f202426p = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m56464xb5886c64(), "fetchLoadMore start prefetchLastFeedCount " + c14438x701c8eca.f202425o);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.q(c14438x701c8eca, this, callback);
        fp0.b bVar = c14438x701c8eca.f202418e;
        jz5.f0 f0Var = null;
        if (bVar != null) {
            bVar.b(new mn2.k3(qVar, null, 2, null));
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(m56464xb5886c64(), "fetchLoadMore err,taskExecutor=" + c14438x701c8eca.f202418e);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchRefresh */
    public void mo56025xae25fec1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca c14438x701c8eca = this.f202551e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.t(c14438x701c8eca, this, callback);
        fp0.b bVar = c14438x701c8eca.f202418e;
        jz5.f0 f0Var = null;
        if (bVar != null) {
            bVar.b(new mn2.k3(tVar, null, 2, null));
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(m56464xb5886c64(), "fetchRefresh err,taskExecutor=" + c14438x701c8eca.f202418e);
        }
    }
}
