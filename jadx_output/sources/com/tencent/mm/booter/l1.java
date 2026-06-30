package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public final class l1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o45.ii f63415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cx4 f63416e;

    public l1(o45.ii iiVar, r45.cx4 cx4Var) {
        this.f63415d = iiVar;
        this.f63416e = cx4Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        w11.d2 Ai = ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai();
        o45.ii iiVar = this.f63415d;
        return java.lang.Integer.valueOf(Ai.c(iiVar.f342961a, 1, iiVar.a(), this.f63416e));
    }
}
