package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.q f173558d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.q qVar) {
        this.f173558d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.q qVar = this.f173558d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8 c12795x70ccad8 = qVar.f173569a;
        c12795x70ccad8.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "stopLoading");
        c12795x70ccad8.f173399p.cancel();
        c12795x70ccad8.f173396m.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8 c12795x70ccad82 = qVar.f173569a;
        if (c12795x70ccad82.f173393g.isEmpty()) {
            c12795x70ccad82.setVisibility(8);
        } else {
            c12795x70ccad82.c();
        }
    }
}
