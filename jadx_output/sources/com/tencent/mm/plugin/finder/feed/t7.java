package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class t7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.f8 f109044d;

    public t7(com.tencent.mm.plugin.finder.feed.f8 f8Var) {
        this.f109044d = f8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.f8 f8Var = this.f109044d;
        fp0.t tVar = f8Var.f106718o;
        if (tVar != null) {
            tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.s7(f8Var), null, 2, null));
        }
    }
}
