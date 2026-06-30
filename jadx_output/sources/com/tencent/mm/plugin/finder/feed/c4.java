package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106454d;

    public c4(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        this.f106454d = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f106454d;
        fp0.t tVar = a7Var.F;
        if (tVar != null) {
            tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.q3(a7Var), null, 2, null));
        }
    }
}
