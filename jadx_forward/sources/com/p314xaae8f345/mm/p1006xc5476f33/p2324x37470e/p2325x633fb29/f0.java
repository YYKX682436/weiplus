package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public interface f0 {
    static float a(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0 f0Var, r45.h70 compositionInfo, boolean z17, yz5.l callback, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: export");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n) f0Var;
        nVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compositionInfo, "compositionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        nVar.f257220f.f401734b = nVar.c(false);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.j(callback, nVar, compositionInfo, h0Var);
        h0Var.f391656d = jVar;
        return nVar.d(compositionInfo, jVar);
    }

    static void b(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0 f0Var, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
        if ((i17 & 1) != 0) {
            aVar = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n) f0Var;
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompositionExporter", "cancel: ");
        nVar.f257229o = true;
        rm5.v vVar = nVar.f257228n;
        if (vVar != null) {
            vVar.f479126u = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.g(nVar, aVar);
        }
        if (vVar != null) {
            vVar.d();
        }
    }
}
