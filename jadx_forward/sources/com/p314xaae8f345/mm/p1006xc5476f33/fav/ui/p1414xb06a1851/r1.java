package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f182320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.s1 f182321e;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.s1 s1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f182321e = s1Var;
        this.f182320d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.s1 s1Var = this.f182321e;
        s1Var.f182325d.f182330d.f182336d.f182133g.f425024p = true;
        this.f182320d.dismiss();
        long j17 = s1Var.f182325d.f182330d.f182336d.f182187p;
        s1Var.f182325d.f182330d.f182336d.finish();
    }
}
