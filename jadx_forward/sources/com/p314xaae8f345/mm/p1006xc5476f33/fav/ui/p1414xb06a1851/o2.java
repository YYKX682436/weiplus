package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f182305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.p2 f182306e;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.p2 p2Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, long j17, long j18) {
        this.f182306e = p2Var;
        this.f182305d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.p2 p2Var = this.f182306e;
        p2Var.f182311d.f182316d.f182322d.f182133g.f425024p = true;
        this.f182305d.dismiss();
        p2Var.f182311d.f182316d.f182322d.finish();
    }
}
