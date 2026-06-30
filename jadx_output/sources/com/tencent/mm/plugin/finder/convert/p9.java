package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class p9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104246e;

    public p9(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var) {
        this.f104245d = qeVar;
        this.f104246e = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f104246e;
        java.lang.Object obj = s0Var.f293125i;
        kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
        this.f104245d.D(s0Var, (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj);
    }
}
