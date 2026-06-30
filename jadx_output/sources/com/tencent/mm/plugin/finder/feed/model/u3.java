package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class u3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var) {
        super(0);
        this.f108389d = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.w3 w3Var = new com.tencent.mm.plugin.finder.feed.model.w3(0, 0, "", false, 8, null);
        w3Var.setHasMore(false);
        this.f108389d.onFetchDone(w3Var);
        return jz5.f0.f302826a;
    }
}
