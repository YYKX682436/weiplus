package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class a30 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13820xb0e90389 f187730d;

    public a30(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13820xb0e90389 c13820xb0e90389) {
        this.f187730d = c13820xb0e90389;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchInit */
    public void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13820xb0e90389 c13820xb0e90389 = this.f187730d;
        java.util.List list = c13820xb0e90389.f187700f.N6(c13820xb0e90389.f187699e).f338976c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        if (!list.isEmpty()) {
            eb2.c0 c0Var = new eb2.c0(0, 0, "");
            c0Var.m56420x2a5f836b(new java.util.ArrayList(list));
            c0Var.m56423xd4b4a5a1(1000);
            eb2.e0 e0Var = c13820xb0e90389.f187698d;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = c13820xb0e90389.f187700f.N6(c13820xb0e90389.f187699e).f338984k;
            e0Var.f332269e = gVar != null ? gVar.i() : null;
            c0Var.m56419xdac5ee4d(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "fetchInit from tlCache, size=" + list.size());
            callback.mo55587xb461ee3d(c0Var);
            return;
        }
        java.util.List i17 = bu2.d0.i(bu2.e0.f106031a, 37, null, 2, null);
        if (!(!i17.isEmpty())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "fetchInit cacheDataSize=" + list.size());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o8 o8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o8(0, 0, "", null, 8, null);
            o8Var.m56423xd4b4a5a1(1000);
            callback.mo55587xb461ee3d(o8Var);
            return;
        }
        eb2.c0 c0Var2 = new eb2.c0(0, 0, "");
        c0Var2.m56420x2a5f836b(new java.util.ArrayList(i17));
        c0Var2.m56423xd4b4a5a1(1000);
        c0Var2.m56419xdac5ee4d(true);
        java.lang.Object m17 = gm0.j1.u().c().m(hc2.d0.c(c13820xb0e90389.f187699e), "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) m17;
        c13820xb0e90389.f187698d.f332269e = str.length() == 0 ? null : str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "fetchInit from FinderPage cache, size=" + ((java.util.LinkedList) i17).size() + " nextPageBuffer " + str);
        callback.mo55587xb461ee3d(c0Var2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchLoadMore */
    public void mo56024xaef8a235(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f187730d.f187698d.mo56024xaef8a235(callback, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchRefresh */
    public void mo56025xae25fec1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "fetchRefresh");
        if (this.f187730d.f187698d.f332271g == 0) {
            bs2.w wVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class)).f204077f;
            com.p314xaae8f345.mm.p944x882e457a.f fVar = null;
            fVar = null;
            r1 = null;
            java.lang.Integer num = null;
            if (wVar != null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = wVar.f105498c;
                reentrantLock.lock();
                try {
                    com.p314xaae8f345.mm.p944x882e457a.f b17 = wVar.b();
                    if (b17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NativeDramaTabPreloadWorker", "requestDramaCache: cache miss/expired, respTime=" + wVar.f105501f + " isLoading=" + wVar.f105502g);
                        wVar.f105503h = true;
                    } else {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestDramaCache: hit size=");
                        r45.wj2 wj2Var = (r45.wj2) b17.f152151d;
                        if (wj2Var != null && (m75941xfb821914 = wj2Var.m75941xfb821914(1)) != null) {
                            num = java.lang.Integer.valueOf(m75941xfb821914.size());
                        }
                        sb6.append(num);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NativeDramaTabPreloadWorker", sb6.toString());
                        wVar.a("requestDramaCache");
                        fVar = b17;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            java.lang.String m56464xb5886c64 = m56464xb5886c64();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("fetchRefresh preloadCache=");
            sb7.append(fVar != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb7.toString());
            if (fVar != null) {
                this.f187730d.f187698d.f332269e = ((r45.wj2) fVar.f152151d).m75945x2fec8307(2);
                eb2.e0 e0Var = this.f187730d.f187698d;
                java.lang.String m75945x2fec8307 = ((r45.wj2) fVar.f152151d).m75945x2fec8307(2);
                e0Var.f332270f = !(m75945x2fec8307 == null || m75945x2fec8307.length() == 0);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.LinkedList<r45.jt4> m75941xfb8219142 = ((r45.wj2) fVar.f152151d).m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getRecommend_item_info(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13820xb0e90389 c13820xb0e90389 = this.f187730d;
                for (r45.jt4 jt4Var : m75941xfb8219142) {
                    eb2.e0 e0Var2 = c13820xb0e90389.f187698d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jt4Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5 b18 = e0Var2.b(jt4Var);
                    if (b18 != null) {
                        b18.f189325d.set(2, java.lang.Long.valueOf(((r45.wj2) fVar.f152151d).m75942xfb822ef2(3)));
                        arrayList.add(b18);
                    }
                }
                eb2.c0 c0Var = new eb2.c0(fVar.f152148a, fVar.f152149b, fVar.f152150c);
                c0Var.m56420x2a5f836b(arrayList);
                java.lang.String m75945x2fec83072 = ((r45.wj2) fVar.f152151d).m75945x2fec8307(2);
                c0Var.m56419xdac5ee4d(!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0));
                c0Var.m56423xd4b4a5a1(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "fetchRefresh from preloadCache size=" + arrayList.size() + " nextPageBuffer " + this.f187730d.f187698d.f332269e);
                callback.mo55587xb461ee3d(c0Var);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "fetchRefresh from CGI");
        this.f187730d.f187698d.mo56025xae25fec1(callback);
    }
}
