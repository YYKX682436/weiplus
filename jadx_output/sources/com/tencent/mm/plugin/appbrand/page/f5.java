package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class f5 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f86611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.g5 f86612e;

    public f5(com.tencent.mm.plugin.appbrand.page.g5 g5Var, java.lang.Runnable runnable) {
        this.f86612e = g5Var;
        this.f86611d = runnable;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.BACKGROUND == bVar) {
            com.tencent.mm.plugin.appbrand.o6 runtime = this.f86612e.f86637e.getRuntime();
            runtime.f74799h.removeCallbacks(this.f86611d);
            this.f86612e.f86637e.getRuntime().N.c(this);
        }
    }
}
