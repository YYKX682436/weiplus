package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.s1 f107066d;

    public j1(com.tencent.mm.plugin.finder.feed.s1 s1Var) {
        this.f107066d = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) t70Var.B0().r()).intValue() == 3) {
            t70Var.B0().o();
        }
        ir2.a1 a1Var = ((com.tencent.mm.plugin.finder.feed.c2) this.f107066d.g()).f106613e;
        a1Var.getClass();
        pf5.e.launch$default(a1Var, null, null, new ir2.x0(a1Var, null), 3, null);
    }
}
