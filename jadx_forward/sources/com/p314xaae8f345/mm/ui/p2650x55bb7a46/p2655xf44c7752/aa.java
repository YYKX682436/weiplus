package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class aa implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja f282327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee f282328e;

    public aa(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee c19739x911a23ee) {
        this.f282327d = jaVar;
        this.f282328e = c19739x911a23ee;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w6
    public void a(float f17) {
        pk4.d dVar;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.util.HashMap hashMap3;
        java.util.HashMap hashMap4;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar = this.f282327d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = jaVar.f282419d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v17 = k1Var != null ? k1Var.v() : null;
        if (v17 == null || (dVar = (pk4.d) v17.f282971p) == null) {
            return;
        }
        float f18 = dVar.getF();
        yd5.p pVar = jaVar.f282575e;
        if (pVar == null || (hashMap4 = pVar.f542672k) == null || (arrayList = (java.util.ArrayList) hashMap4.get(java.lang.Float.valueOf(f18))) == null) {
            arrayList = new java.util.ArrayList();
        }
        yd5.p pVar2 = jaVar.f282575e;
        if (pVar2 == null || (hashMap3 = pVar2.f542673l) == null || (arrayList2 = (java.util.ArrayList) hashMap3.get(java.lang.Float.valueOf(f18))) == null) {
            arrayList2 = new java.util.ArrayList();
        }
        long m158649x9746038c = dVar.m158649x9746038c() - jaVar.A;
        jaVar.B += m158649x9746038c;
        arrayList.add(java.lang.Long.valueOf(m158649x9746038c));
        yd5.p pVar3 = jaVar.f282575e;
        if (pVar3 != null && (hashMap2 = pVar3.f542672k) != null) {
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - jaVar.f282617y;
        jaVar.f282617y = currentTimeMillis;
        arrayList2.add(java.lang.Long.valueOf(j17));
        yd5.p pVar4 = jaVar.f282575e;
        if (pVar4 != null && (hashMap = pVar4.f542673l) != null) {
        }
        jaVar.A = dVar.m158649x9746038c();
        dVar.mo69432x8983b21d(f17);
        float f19 = dVar.getF();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee c19739x911a23ee = this.f282328e;
        c19739x911a23ee.mo75801x41557a06(f19);
        jaVar.f282419d.f282625g.o9(false);
        if (!jaVar.f282419d.f282625g.z8()) {
            jaVar.A(jaVar.f282419d.w(), jaVar.f282419d.f282625g.I7());
        }
        float f27 = 1.0f;
        if (f19 == 1.0f) {
            f27 = 1.5f;
        } else {
            if (f19 == 1.5f) {
                f27 = 2.0f;
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(c19739x911a23ee.m75796x63b38b8c(), kz5.c1.k(new jz5.l("before_speed_select", java.lang.Float.valueOf(f19)), new jz5.l("speed_select", java.lang.Float.valueOf(f27))));
    }
}
