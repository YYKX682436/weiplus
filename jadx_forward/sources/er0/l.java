package er0;

/* loaded from: classes12.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f337504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c f337505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f337506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f337507g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j17, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c, long j18, long j19) {
        super(0);
        this.f337504d = j17;
        this.f337505e = c10875xc0cf956c;
        this.f337506f = j18;
        this.f337507g = j19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List m40826x8f8c4694;
        long j17 = 0;
        if (this.f337504d > 0) {
            com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = this.f337505e;
            m40826x8f8c4694 = c10875xc0cf956c.m40826x8f8c4694(c10875xc0cf956c.m46721xdb445020());
            long j18 = this.f337506f;
            java.lang.Long valueOf = java.lang.Long.valueOf(j18);
            long j19 = this.f337507g;
            m40826x8f8c4694.add(new jz5.l(valueOf, java.lang.Long.valueOf(j19)));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("push recover: last=");
            sb6.append(j18);
            sb6.append(", curr=");
            sb6.append(j19);
            sb6.append(", gapMin=");
            long j27 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
            sb6.append((j19 - j18) / j27);
            sb6.append(", totalGapMin=");
            for (jz5.l lVar : c10875xc0cf956c.m46721xdb445020()) {
                j17 += (((java.lang.Number) lVar.f384367e).longValue() - ((java.lang.Number) lVar.f384366d).longValue()) / j27;
            }
            sb6.append(j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccProcLifeStats", sb6.toString());
        }
        return jz5.f0.f384359a;
    }
}
