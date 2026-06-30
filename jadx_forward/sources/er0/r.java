package er0;

/* loaded from: classes12.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f337519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c f337520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z17, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c) {
        super(0);
        this.f337519d = z17;
        this.f337520e = c10875xc0cf956c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List m40826x8f8c4694;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#collectNetworkStatus: ");
        boolean z17 = this.f337519d;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccProcLifeStats", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = this.f337520e;
        jz5.l lastNetworkState = c10875xc0cf956c.getLastNetworkState();
        if (z17 && lastNetworkState != null && !((java.lang.Boolean) lastNetworkState.f384366d).booleanValue()) {
            m40826x8f8c4694 = c10875xc0cf956c.m40826x8f8c4694(c10875xc0cf956c.m46718x8dee8bee());
            java.lang.Long valueOf = java.lang.Long.valueOf(currentTimeMillis);
            java.lang.Object obj = lastNetworkState.f384367e;
            m40826x8f8c4694.add(new jz5.l(obj, valueOf));
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("network recover: last=");
            java.lang.Number number = (java.lang.Number) obj;
            sb7.append(number.longValue());
            sb7.append(", curr=");
            sb7.append(currentTimeMillis);
            sb7.append(", gapMin=");
            long longValue = currentTimeMillis - number.longValue();
            long j17 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
            sb7.append(longValue / j17);
            sb7.append(", totalGapMin=");
            long j18 = 0;
            for (jz5.l lVar : c10875xc0cf956c.m46718x8dee8bee()) {
                j18 += (((java.lang.Number) lVar.f384367e).longValue() - ((java.lang.Number) lVar.f384366d).longValue()) / j17;
            }
            sb7.append(j18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccProcLifeStats", sb7.toString());
            c10875xc0cf956c.m46778x137b593b(null);
        }
        if (!z17 && (lastNetworkState == null || ((java.lang.Boolean) lastNetworkState.f384366d).booleanValue())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccProcLifeStats", "network lost: " + currentTimeMillis);
            c10875xc0cf956c.m46778x137b593b(new jz5.l(java.lang.Boolean.FALSE, java.lang.Long.valueOf(currentTimeMillis)));
        }
        return jz5.f0.f384359a;
    }
}
