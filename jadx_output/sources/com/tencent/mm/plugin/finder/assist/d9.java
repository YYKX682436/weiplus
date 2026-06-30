package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class d9 extends az2.f {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.a9 f102093f = new com.tencent.mm.plugin.finder.assist.a9(null);

    /* renamed from: e, reason: collision with root package name */
    public int f102094e;

    @Override // az2.f
    public synchronized void a() {
        this.f102094e++;
        com.tencent.mars.xlog.Log.i("MultiDelayLoadingComponent", "begin() loadingCount:" + this.f102094e);
        if (this.f102094e > 1) {
            return;
        }
        wu5.c cVar = this.f16126a;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.finder.assist.b9 b9Var = new com.tencent.mm.plugin.finder.assist.b9(this);
        long j17 = this.f16128c;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f16126a = t0Var.z(b9Var, j17, false);
    }

    @Override // az2.f
    public synchronized void b() {
        this.f102094e--;
        com.tencent.mars.xlog.Log.i("MultiDelayLoadingComponent", "end() loadingCount:" + this.f102094e);
        if (this.f102094e > 0) {
            return;
        }
        wu5.c cVar = this.f16126a;
        if (cVar != null) {
            cVar.cancel(false);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.assist.c9(this));
    }
}
