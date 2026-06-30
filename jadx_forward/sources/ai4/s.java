package ai4;

/* loaded from: classes11.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f86726d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j17) {
        super(1);
        this.f86726d = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f86726d;
        ai4.b0 b0Var = ai4.b0.f86656a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transferToAffDB: complete RetryNum=");
        sb6.append(ai4.b0.f86661f);
        sb6.append(", totalCost=");
        sb6.append(currentTimeMillis);
        sb6.append(", err=");
        sb6.append(th6 != null ? jz5.a.b(th6) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", sb6.toString());
        kz5.h hVar = (kz5.h) ai4.a.f86652m;
        hVar.getClass();
        kz5.e eVar = new kz5.e(hVar);
        while (true) {
            if (!eVar.hasNext()) {
                z17 = true;
                break;
            }
            if (!ai4.b0.f86657b.h(ai4.b0.f86656a.c((ai4.a) eVar.next()))) {
                z17 = false;
                break;
            }
        }
        if (z17) {
            long j17 = 0;
            for (int i17 = ai4.b0.f86661f; -1 < i17; i17--) {
                j17 += ai4.b0.f86657b.p(ai4.b0.f86656a.b(i17));
            }
            ai4.b0 b0Var2 = ai4.b0.f86656a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", "transferToAffDB: allSuccess, totalTimeCostCollect=" + j17);
            qj4.s.f445491a.r(4L, (r20 & 2) != 0 ? null : null, (r20 & 4) != 0 ? null : java.lang.Integer.valueOf(ai4.b0.f86661f), (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : java.lang.Long.valueOf(j17), (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? null : null);
        }
        ai4.b0 b0Var3 = ai4.b0.f86656a;
        b0Var3.i();
        if (z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            java.lang.String b17 = r26.b0.b("\n                    Debug: Tip For Status AffTransfer\n                    Complete! TimeCost: " + currentTimeMillis + " ms\n                    MainStatus: " + b0Var3.g() + ", LikeComment: " + b0Var3.f() + "\n                ");
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) ai4.b0.f86662g).mo141623x754a37bb();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new ai4.q(b17, null), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
