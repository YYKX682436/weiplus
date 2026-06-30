package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class si implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f108988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f108989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f108990c;

    public si(java.lang.String str, r45.xn1 xn1Var, yz5.l lVar) {
        this.f108988a = str;
        this.f108989b = xn1Var;
        this.f108990c = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.xn1 xn1Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveProfileWidgetJumpEmptyUIC", "doGetFinderLiveContact success:" + (fVar.f70615a == 0 && fVar.f70616b == 0) + " username:" + this.f108988a);
        r45.bs1 bs1Var = (r45.bs1) fVar.f70618d;
        if (bs1Var == null || (xn1Var = (r45.xn1) bs1Var.getCustom(1)) == null) {
            xn1Var = this.f108989b;
        }
        kotlin.jvm.internal.o.d(xn1Var);
        this.f108990c.invoke(xn1Var);
        return jz5.f0.f302826a;
    }
}
