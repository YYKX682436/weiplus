package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class m1 implements sc2.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s1 f188873a;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s1 s1Var) {
        this.f188873a = s1Var;
    }

    @Override // sc2.b8
    public boolean a() {
        android.view.View refreshHeader = this.f188873a.f190496g.getRefreshHeader();
        boolean z17 = false;
        if (refreshHeader != null && refreshHeader.getVisibility() == 0) {
            z17 = true;
        }
        return !z17;
    }

    @Override // sc2.b8
    public boolean b(boolean z17) {
        return this.f188873a.f190496g.J(z17);
    }
}
