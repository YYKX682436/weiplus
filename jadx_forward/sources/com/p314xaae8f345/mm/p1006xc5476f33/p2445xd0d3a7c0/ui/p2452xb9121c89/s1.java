package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f269799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.o1 f269800e;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.o1 o1Var, boolean z17) {
        this.f269800e = o1Var;
        this.f269799d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f269799d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.o1 o1Var = this.f269800e;
        if (z17) {
            o1Var.f269780d.f269777d.f269680m.a();
            o1Var.f269780d.f269777d.k7();
            o1Var.f269780d.f269777d.f269700z1 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = o1Var.f269780d.f269777d;
        if (activityC19519x7af4daf3.E || activityC19519x7af4daf3.G) {
            activityC19519x7af4daf3.E = false;
            activityC19519x7af4daf3.G = false;
            activityC19519x7af4daf3.F = true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.r1(this, activityC19519x7af4daf3.G7(true)));
    }
}
