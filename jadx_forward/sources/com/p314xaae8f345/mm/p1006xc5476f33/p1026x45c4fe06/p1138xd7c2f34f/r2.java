package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class r2 extends c01.i8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f166630a;

    public r2(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f166630a = appId;
    }

    public static final java.lang.Object d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r2 r2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean contains;
        r2Var.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o2 o2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o2(rVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(o2Var, 5000L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d5 d5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d5.class);
        java.lang.String appId = r2Var.f166630a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p2 p2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p2(r2Var, rVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e) d5Var;
        eVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = eVar.f157032e;
        java.util.Collection collection = (java.util.List) concurrentHashMap.get(appId);
        if (collection == null) {
            collection = new java.util.ArrayList();
        }
        concurrentHashMap.put(appId, collection);
        java.lang.Object obj = eVar.f157032e.get(appId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        ((java.util.List) obj).add(p2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.c cVar = eVar.f157031d;
        cVar.getClass();
        synchronized (cVar.f156991a) {
            java.util.List list = cVar.f156992b;
            contains = list != null ? ((java.util.ArrayList) list).contains(appId) : false;
        }
        if (!contains) {
            p2Var.a();
        }
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f440719d ? j17 : jz5.f0.f384359a;
    }

    @Override // c01.i8
    public java.lang.String a() {
        return "MicroMsg.AppLaunchFileCleanBlockingRunner";
    }

    @Override // c01.i8
    public boolean b(int i17) {
        return true;
    }

    @Override // c01.i8
    public void c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppLaunchFileCleanBlockingRunner", "transfer for appId:" + this.f166630a + ", start");
        p3325xe03a0797.p3326xc267989b.l.f(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q2(this, null), 1, null);
    }
}
