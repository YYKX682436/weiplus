package ai4;

/* loaded from: classes11.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j17) {
        super(1);
        this.f5193d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f5193d;
        ai4.b0 b0Var = ai4.b0.f5123a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transferToAffDB: complete RetryNum=");
        sb6.append(ai4.b0.f5128f);
        sb6.append(", totalCost=");
        sb6.append(currentTimeMillis);
        sb6.append(", err=");
        sb6.append(th6 != null ? jz5.a.b(th6) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", sb6.toString());
        kz5.h hVar = (kz5.h) ai4.a.f5119m;
        hVar.getClass();
        kz5.e eVar = new kz5.e(hVar);
        while (true) {
            if (!eVar.hasNext()) {
                z17 = true;
                break;
            }
            if (!ai4.b0.f5124b.h(ai4.b0.f5123a.c((ai4.a) eVar.next()))) {
                z17 = false;
                break;
            }
        }
        if (z17) {
            long j17 = 0;
            for (int i17 = ai4.b0.f5128f; -1 < i17; i17--) {
                j17 += ai4.b0.f5124b.p(ai4.b0.f5123a.b(i17));
            }
            ai4.b0 b0Var2 = ai4.b0.f5123a;
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", "transferToAffDB: allSuccess, totalTimeCostCollect=" + j17);
            qj4.s.f363958a.r(4L, (r20 & 2) != 0 ? null : null, (r20 & 4) != 0 ? null : java.lang.Integer.valueOf(ai4.b0.f5128f), (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : java.lang.Long.valueOf(j17), (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? null : null);
        }
        ai4.b0 b0Var3 = ai4.b0.f5123a;
        b0Var3.i();
        if (z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c) {
            java.lang.String b17 = r26.b0.b("\n                    Debug: Tip For Status AffTransfer\n                    Complete! TimeCost: " + currentTimeMillis + " ms\n                    MainStatus: " + b0Var3.g() + ", LikeComment: " + b0Var3.f() + "\n                ");
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) ((jz5.n) ai4.b0.f5129g).getValue();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new ai4.q(b17, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
