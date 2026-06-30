package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class x0 implements nv2.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f109912a;

    public x0(yz5.l onComplete) {
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        this.f109912a = onComplete;
    }

    @Override // nv2.i1
    public void a(com.tencent.mm.plugin.finder.storage.yj0 comment) {
        kotlin.jvm.internal.o.g(comment, "comment");
        this.f109912a.invoke(java.lang.Boolean.TRUE);
    }

    @Override // nv2.i1
    public void b(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f109912a.invoke(java.lang.Boolean.FALSE);
    }
}
