package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public final class l1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o45.ii f144948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cx4 f144949e;

    public l1(o45.ii iiVar, r45.cx4 cx4Var) {
        this.f144948d = iiVar;
        this.f144949e = cx4Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        w11.d2 Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai();
        o45.ii iiVar = this.f144948d;
        return java.lang.Integer.valueOf(Ai.c(iiVar.f424494a, 1, iiVar.a(), this.f144949e));
    }
}
