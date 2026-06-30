package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class y2 implements db2.u3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp0.r f108476e;

    public y2(com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, fp0.r rVar) {
        this.f108475d = n0Var;
        this.f108476e = rVar;
    }

    @Override // db2.u3
    public void a(com.tencent.mm.plugin.finder.feed.model.d info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        boolean z17 = info.f107770h != 0;
        com.tencent.mm.plugin.finder.feed.model.x2 x2Var = new com.tencent.mm.plugin.finder.feed.model.x2(info.f107763a, info.f107764b, info.f107765c, 0);
        x2Var.setIncrementList(info.f107767e);
        x2Var.setPullType(i17);
        x2Var.setLastBuffer(info.f107776n);
        x2Var.setHasMore(z17);
        this.f108475d.onFetchDone(x2Var);
        this.f108476e.b(fp0.u.f265290f);
    }
}
