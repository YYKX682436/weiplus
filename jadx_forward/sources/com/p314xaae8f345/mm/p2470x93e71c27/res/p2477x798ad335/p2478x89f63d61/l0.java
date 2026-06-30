package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes9.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f271153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.m0 f271154e;

    public l0(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.m0 m0Var, java.util.List list) {
        this.f271154e = m0Var;
        this.f271153d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (r45.es5 es5Var : this.f271153d) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.m0 m0Var = this.f271154e;
            java.lang.String I = m0Var.I();
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(es5Var.f455246d);
            java.util.LinkedList linkedList = es5Var.f455247e;
            objArr[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList) ? "null" : java.lang.String.valueOf(linkedList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(I, "resType(%d) responses.size() = %s", objArr);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.vr5 vr5Var = (r45.vr5) it.next();
                    int i17 = es5Var.f455246d;
                    if (vr5Var != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m0Var.I(), "handleOperation --START--, resType = %d, subType = %d, res.Oper = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(vr5Var.f470001d), java.lang.Integer.valueOf(vr5Var.f470004g));
                        if (vr5Var.f470002e != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m0Var.I(), "resource.Info.FileFlag %d ", java.lang.Integer.valueOf(vr5Var.f470002e.f452561g));
                        }
                        int i18 = vr5Var.f470004g;
                        if (i18 == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m0Var.I(), "just do nothing");
                        } else {
                            if ((i18 & 1) > 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m0Var.I(), "do cache");
                                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().e(i17, vr5Var, false);
                            }
                            if ((vr5Var.f470004g & 2) > 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m0Var.I(), "do decrypt");
                                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().f(i17, vr5Var, false, false);
                            }
                            if ((vr5Var.f470004g & 4) > 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m0Var.I(), "do delete");
                                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().g(i17, vr5Var, false);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m0Var.I(), "handleOperation --END--, resType = %d, subType = %d, res.Oper = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(vr5Var.f470001d), java.lang.Integer.valueOf(vr5Var.f470004g));
                        }
                    }
                }
            }
        }
    }
}
