package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes7.dex */
public class e extends pq5.g {
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.i A;

    public e(com.p314xaae8f345.mm.p944x882e457a.i iVar) {
        this.A = iVar;
    }

    @Override // pq5.g
    public pq5.g I(final p012xc85e97e9.p093xedfae76a.y yVar) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a() && yVar.getClass().getName().matches(".*\\$\\d*")) {
            throw new java.lang.IllegalArgumentException("[DEBUG] keeper is wrong!!! leak happens [" + yVar.getClass().getName() + "], maybe you used `.androidXLifeCycle { context }` which is NOT working, you should call as `.androidXLifeCycle(context)`");
        }
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.modelbase.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p944x882e457a.e eVar = com.p314xaae8f345.mm.p944x882e457a.e.this;
                eVar.getClass();
                yVar.mo273xed6858b4().a(eVar.A.f152181h);
            }
        });
        return this;
    }

    @Override // pq5.g
    /* renamed from: J */
    public pq5.g f(im5.b bVar) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z65.c.a() || !bVar.getClass().getName().matches(".*\\$\\d*")) {
            bVar.mo46316x322b85(this.A);
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
