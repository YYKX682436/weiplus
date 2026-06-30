package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.s1 f106979d;

    public i1(com.tencent.mm.plugin.finder.feed.s1 s1Var) {
        this.f106979d = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ir2.a1 a1Var = ((com.tencent.mm.plugin.finder.feed.c2) this.f106979d.g()).f106613e;
        a1Var.getClass();
        pf5.e.launch$default(a1Var, null, null, new ir2.x0(a1Var, null), 3, null);
    }
}
