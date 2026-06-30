package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class b9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.d9 f102035d;

    public b9(com.tencent.mm.plugin.finder.assist.d9 d9Var) {
        this.f102035d = d9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("begin() show loadingCount:");
        com.tencent.mm.plugin.finder.assist.d9 d9Var = this.f102035d;
        sb6.append(d9Var.f102094e);
        com.tencent.mars.xlog.Log.i("MultiDelayLoadingComponent", sb6.toString());
        az2.s sVar = d9Var.f16127b;
        if (sVar != null) {
            sVar.a();
        }
        az2.s sVar2 = d9Var.f16127b;
        if (sVar2 != null) {
            sVar2.b();
        }
    }
}
