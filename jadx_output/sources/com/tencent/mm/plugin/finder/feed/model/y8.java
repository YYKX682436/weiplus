package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class y8 implements com.tencent.mm.plugin.finder.feed.model.internal.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp0.r f108485e;

    public y8(com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, fp0.r rVar) {
        this.f108484d = n0Var;
        this.f108485e = rVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        this.f108484d.onFetchDone(response);
        this.f108485e.b(fp0.u.f265290f);
    }
}
