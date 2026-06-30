package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public final class m1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o45.hi f63434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cx4 f63435e;

    public m1(o45.hi hiVar, r45.cx4 cx4Var) {
        this.f63434d = hiVar;
        this.f63435e = cx4Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        w11.d2 Ai = ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai();
        o45.hi hiVar = this.f63434d;
        return java.lang.Integer.valueOf(Ai.c(hiVar.f342947a, 1, hiVar.a(), this.f63435e));
    }
}
