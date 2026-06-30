package er0;

/* loaded from: classes12.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c f337493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f337495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f337496g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f337497h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c, java.lang.String str, long j17, long j18, long j19) {
        super(0);
        this.f337493d = c10875xc0cf956c;
        this.f337494e = str;
        this.f337495f = j17;
        this.f337496g = j18;
        this.f337497h = j19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map m40827x8f8c4694;
        java.util.List m40826x8f8c4694;
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = this.f337493d;
        m40827x8f8c4694 = c10875xc0cf956c.m40827x8f8c4694(c10875xc0cf956c.m46703x7c978af6());
        java.util.Map<java.lang.String, java.lang.Long> m46703x7c978af6 = c10875xc0cf956c.m46703x7c978af6();
        java.lang.String str = this.f337494e;
        java.lang.Long l17 = m46703x7c978af6.get(str);
        long j17 = 0;
        if (l17 == null) {
            l17 = 0L;
        }
        long longValue = l17.longValue();
        long j18 = this.f337495f;
        m40827x8f8c4694.put(str, java.lang.Long.valueOf(longValue + j18));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("proc exit ago: ");
        long j19 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        sb6.append(j18 / j19);
        sb6.append(", acc=");
        sb6.append(c10875xc0cf956c.getAccExitDuringMs() / j19);
        sb6.append(", type=");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccProcLifeStats", sb6.toString());
        if (j18 > 0) {
            m40826x8f8c4694 = c10875xc0cf956c.m40826x8f8c4694(c10875xc0cf956c.m46721xdb445020());
            long j27 = this.f337496g;
            java.lang.Long valueOf = java.lang.Long.valueOf(j27);
            long j28 = this.f337497h;
            m40826x8f8c4694.add(new jz5.l(valueOf, java.lang.Long.valueOf(j28)));
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("push recover: last=");
            sb7.append(j27);
            sb7.append(", curr=");
            sb7.append(j28);
            sb7.append(", gapMin=");
            sb7.append((j28 - j27) / j19);
            sb7.append(", totalGapMin=");
            for (jz5.l lVar : c10875xc0cf956c.m46721xdb445020()) {
                j17 += (((java.lang.Number) lVar.f384367e).longValue() - ((java.lang.Number) lVar.f384366d).longValue()) / j19;
            }
            sb7.append(j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccProcLifeStats", sb7.toString());
        }
        return jz5.f0.f384359a;
    }
}
