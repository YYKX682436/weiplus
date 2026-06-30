package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.o$$a */
/* loaded from: classes7.dex */
public final /* synthetic */ class RunnableC12807x330112 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.o f173554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.rs3 f173555e;

    public /* synthetic */ RunnableC12807x330112(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.o oVar, r45.rs3 rs3Var) {
        this.f173554d = oVar;
        this.f173555e = rs3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.z50 z50Var;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.o oVar = this.f173554d;
        oVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "onResponse");
        l01.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8.f173392v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8 c12795x70ccad8 = oVar.f173553a;
        c12795x70ccad8.getClass();
        r45.rs3 rs3Var = this.f173555e;
        if ((rs3Var == null || (z50Var = rs3Var.f466706e) == null || (linkedList = z50Var.f473254d) == null || linkedList.isEmpty()) ? false : true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "parseCommonUsedData");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8.b(c12795x70ccad8, rs3Var, false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "fetchCommonUsedDataFromServer");
            c12795x70ccad8.f173393g.clear();
            c12795x70ccad8.f173394h.setVisibility(8);
            c12795x70ccad8.f173395i.m8146xced61ae5();
            if (c12795x70ccad8.f173396m.getVisibility() != 0) {
                c12795x70ccad8.f();
            }
        }
        c12795x70ccad8.d();
    }
}
