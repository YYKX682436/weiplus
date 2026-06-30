package da5;

/* loaded from: classes12.dex */
public final class o extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n implements ea5.i {
    public o() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5285x2f901cd4 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5285x2f901cd4) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRAffLoginListener", "call udr login");
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UDRAffLoginListener", "call udr login fail. account not ready.");
            return false;
        }
        da5.r.f309350a.c();
        ((d83.u) ((e70.z) i95.n0.c(e70.z.class))).Di();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRAffLoginListener", "call udr dealAccountIn");
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.t tVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.t();
        tVar.f299106d = j62.e.g().i("clicfg_udr_version_change_period", 0, true, true);
        tVar.f299107e[1] = true;
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.a aVar = com.p314xaae8f345.p3133xd0ce8b26.aff.udr.a.f299062b;
        java.lang.String j17 = gm0.j1.b().j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getUinString(...)");
        aVar.e(java.lang.Long.parseLong(j17), tVar);
        ((com.p314xaae8f345.mm.udr.e1) ((com.p314xaae8f345.mm.udr.c0) i95.n0.c(com.p314xaae8f345.mm.udr.c0.class))).getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.udr.e1.f278013e;
        if (concurrentHashMap != null) {
            for (java.util.Map.Entry entry : kz5.c1.s(concurrentHashMap).entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                ea5.l lVar = (ea5.l) entry.getValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRAffLoginListener", "registerCppProject projectId:" + str + ", value.Period:" + lVar.mo40417x561213dd());
                com.p314xaae8f345.p3133xd0ce8b26.aff.udr.a.f299062b.o(str, lVar.mo40417x561213dd(), lVar.mo14972x73ec24f3(), new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.g(lVar));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRAffLoginListener", "call udr login end");
        ((ku5.t0) ku5.t0.f394148d).h(da5.n.f309346d, "UDRCleanAll");
        return true;
    }
}
