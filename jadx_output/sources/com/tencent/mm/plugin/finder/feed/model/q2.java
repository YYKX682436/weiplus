package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class q2 implements db2.v3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.s2 f108265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fp0.r f108266b;

    public q2(com.tencent.mm.plugin.finder.feed.model.s2 s2Var, fp0.r rVar) {
        this.f108265a = s2Var;
        this.f108266b = rVar;
    }

    @Override // db2.v3
    public boolean a(int i17, int i18, java.lang.String str, r45.ny3 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.feed.model.s2 s2Var = this.f108265a;
        fp0.t tVar = s2Var.f108309d;
        fp0.r rVar = this.f108266b;
        if (tVar != null && tVar.f265286f == rVar.f265279h) {
            return false;
        }
        rVar.b(fp0.u.f265290f);
        java.lang.String tag = s2Var.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isFetchConsume] executorToken=");
        fp0.t tVar2 = s2Var.f108309d;
        sb6.append(tVar2 != null ? java.lang.Integer.valueOf(tVar2.f265286f) : null);
        sb6.append(" taskToken=");
        sb6.append(rVar.f265279h);
        com.tencent.mars.xlog.Log.w(tag, sb6.toString());
        return true;
    }
}
