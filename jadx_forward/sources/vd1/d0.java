package vd1;

/* loaded from: classes7.dex */
public final class d0 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f517101d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar) {
        this.f517101d = yVar;
    }

    @Override // u81.f
    public final void D(java.lang.String str, u81.b bVar) {
        int i17 = bVar == null ? -1 : vd1.c0.f517099a[bVar.ordinal()];
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            vd1.f0 f0Var = vd1.f0.f517106a;
            synchronized (f0Var) {
                long j17 = vd1.f0.f517112g;
                if (j17 > 0) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (android.os.SystemClock.elapsedRealtime() - j17 >= vd1.f0.f517108c) {
                        f0Var.d(vd1.x.f517150d);
                    }
                }
            }
            return;
        }
        vd1.f0.f517106a.d(vd1.x.f517152f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f517101d;
        java.util.HashSet hashSet = vd1.f0.f517110e;
        synchronized (hashSet) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = yVar.mo32091x9a3f0ba2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo32091x9a3f0ba2, "null cannot be cast to non-null type com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU");
            hashSet.remove((ze.n) mo32091x9a3f0ba2);
            if (hashSet.size() == 0) {
                vd1.f0.f517109d.d();
            }
        }
    }
}
