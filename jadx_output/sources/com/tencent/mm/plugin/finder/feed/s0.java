package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a1 f108958d;

    public s0(com.tencent.mm.plugin.finder.feed.a1 a1Var) {
        this.f108958d = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) t70Var.B0().r()).intValue() == 3) {
            t70Var.B0().o();
        }
        this.f108958d.z().v();
    }
}
