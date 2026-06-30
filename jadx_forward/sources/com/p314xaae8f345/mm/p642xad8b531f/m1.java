package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public final class m1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o45.hi f144967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cx4 f144968e;

    public m1(o45.hi hiVar, r45.cx4 cx4Var) {
        this.f144967d = hiVar;
        this.f144968e = cx4Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        w11.d2 Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai();
        o45.hi hiVar = this.f144967d;
        return java.lang.Integer.valueOf(Ai.c(hiVar.f424480a, 1, hiVar.a(), this.f144968e));
    }
}
