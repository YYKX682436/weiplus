package er0;

/* loaded from: classes12.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f337478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f337479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c f337480f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(long j17, long j18, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c) {
        super(0);
        this.f337478d = j17;
        this.f337479e = j18;
        this.f337480f = c10875xc0cf956c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List m40826x8f8c4694;
        long j17 = this.f337478d;
        if (0 <= j17 && j17 < 3600001) {
            long j18 = this.f337479e;
            if (0 <= j18 && j18 < 3600001) {
                com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = this.f337480f;
                m40826x8f8c4694 = c10875xc0cf956c.m40826x8f8c4694(c10875xc0cf956c.m46730x629eae9f());
                m40826x8f8c4694.add(new jz5.l(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18)));
            }
        }
        return jz5.f0.f384359a;
    }
}
