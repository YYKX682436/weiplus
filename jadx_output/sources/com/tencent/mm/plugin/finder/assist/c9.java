package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class c9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.d9 f102069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(com.tencent.mm.plugin.finder.assist.d9 d9Var) {
        super(0);
        this.f102069d = d9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("end() dismiss loadingCount:");
        com.tencent.mm.plugin.finder.assist.d9 d9Var = this.f102069d;
        sb6.append(d9Var.f102094e);
        com.tencent.mars.xlog.Log.i("MultiDelayLoadingComponent", sb6.toString());
        az2.s sVar = d9Var.f16127b;
        if (sVar != null) {
            sVar.a();
        }
        return jz5.f0.f302826a;
    }
}
