package com.tencent.mm.modelbase;

/* loaded from: classes7.dex */
public class e extends pq5.g {
    public final /* synthetic */ com.tencent.mm.modelbase.i A;

    public e(com.tencent.mm.modelbase.i iVar) {
        this.A = iVar;
    }

    @Override // pq5.g
    public pq5.g I(final androidx.lifecycle.y yVar) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a() && yVar.getClass().getName().matches(".*\\$\\d*")) {
            throw new java.lang.IllegalArgumentException("[DEBUG] keeper is wrong!!! leak happens [" + yVar.getClass().getName() + "], maybe you used `.androidXLifeCycle { context }` which is NOT working, you should call as `.androidXLifeCycle(context)`");
        }
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.modelbase.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.modelbase.e eVar = com.tencent.mm.modelbase.e.this;
                eVar.getClass();
                yVar.mo133getLifecycle().a(eVar.A.f70648h);
            }
        });
        return this;
    }

    @Override // pq5.g
    /* renamed from: J */
    public pq5.g f(im5.b bVar) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z65.c.a() || !bVar.getClass().getName().matches(".*\\$\\d*")) {
            bVar.keep(this.A);
            super.f(bVar);
            return this;
        }
        throw new java.lang.IllegalArgumentException("[DEBUG] keeper is wrong!!! leak happens [" + bVar.getClass().getName() + "], maybe you used `.lifecycle { context }` which is NOT working, you should call as `.lifecycle(context)`");
    }

    @Override // pq5.g, km5.q, km5.d
    public /* bridge */ /* synthetic */ km5.d f(im5.b bVar) {
        f(bVar);
        return this;
    }
}
