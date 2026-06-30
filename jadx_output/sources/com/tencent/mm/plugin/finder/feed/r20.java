package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class r20 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.v20 f108884d;

    public r20(com.tencent.mm.plugin.finder.feed.v20 v20Var) {
        this.f108884d = v20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.c0 c0Var = this.f108884d.f106969e;
        com.tencent.mm.plugin.finder.feed.j20 j20Var = c0Var instanceof com.tencent.mm.plugin.finder.feed.j20 ? (com.tencent.mm.plugin.finder.feed.j20) c0Var : null;
        if (j20Var != null) {
            j20Var.Z();
        }
    }
}
