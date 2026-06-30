package er0;

/* loaded from: classes12.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f337508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c f337509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j17, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c) {
        super(0);
        this.f337508d = j17;
        this.f337509e = c10875xc0cf956c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List m40826x8f8c4694;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f337508d;
        long j18 = currentTimeMillis - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccProcLifeStats", "#collectHibernateTime: " + j17);
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = this.f337509e;
        m40826x8f8c4694 = c10875xc0cf956c.m40826x8f8c4694(c10875xc0cf956c.m46705x5615fc85());
        m40826x8f8c4694.add(new jz5.l(java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis)));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mars recover: last=");
        sb6.append(j18);
        sb6.append(", curr=");
        sb6.append(currentTimeMillis);
        sb6.append(", gapMin=");
        long j19 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        sb6.append(j17 / j19);
        sb6.append(", totalGapMin=");
        long j27 = 0;
        for (jz5.l lVar : c10875xc0cf956c.m46705x5615fc85()) {
            j27 += (((java.lang.Number) lVar.f384367e).longValue() - ((java.lang.Number) lVar.f384366d).longValue()) / j19;
        }
        sb6.append(j27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccProcLifeStats", sb6.toString());
        return jz5.f0.f384359a;
    }
}
