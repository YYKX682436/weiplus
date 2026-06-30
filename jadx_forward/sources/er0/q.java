package er0;

/* loaded from: classes12.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f337517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c f337518e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j17, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c) {
        super(0);
        this.f337517d = j17;
        this.f337518e = c10875xc0cf956c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        java.util.Map m40827x8f8c4694;
        long j17 = this.f337517d;
        if (1 <= j17 && j17 < 3600001) {
            com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = this.f337518e;
            int intValue = ((java.lang.Number) c10875xc0cf956c.m46714x84517d8c().f384366d).intValue();
            int i18 = intValue + 1;
            c10875xc0cf956c.m46759x284e1298(new jz5.l(java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(((((java.lang.Number) c10875xc0cf956c.m46714x84517d8c().f384367e).longValue() * intValue) + j17) / i18)));
            if (0 <= j17 && j17 < 1001) {
                i17 = 1;
            } else {
                if (1001 <= j17 && j17 < 5001) {
                    i17 = 2;
                } else {
                    if (5001 <= j17 && j17 < 10001) {
                        i17 = 3;
                    } else {
                        if (10001 <= j17 && j17 < 30001) {
                            i17 = 4;
                        } else {
                            if (30001 <= j17 && j17 < 60001) {
                                i17 = 5;
                            } else {
                                if (60001 <= j17 && j17 < 300001) {
                                    i17 = 6;
                                } else {
                                    if (300001 <= j17 && j17 < 600001) {
                                        i17 = 7;
                                    } else {
                                        i17 = (600001L > j17 ? 1 : (600001L == j17 ? 0 : -1)) <= 0 && (j17 > 1800001L ? 1 : (j17 == 1800001L ? 0 : -1)) < 0 ? 8 : 9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            m40827x8f8c4694 = c10875xc0cf956c.m40827x8f8c4694(c10875xc0cf956c.m46715xc759c558());
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer num = c10875xc0cf956c.m46715xc759c558().get(java.lang.Integer.valueOf(i17));
            if (num == null) {
                num = 0;
            }
            m40827x8f8c4694.put(valueOf, java.lang.Integer.valueOf(num.intValue() + 1));
        }
        return jz5.f0.f384359a;
    }
}
