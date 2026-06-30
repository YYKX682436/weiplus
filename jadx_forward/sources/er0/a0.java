package er0;

/* loaded from: classes12.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f337476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c f337477e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(long j17, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c) {
        super(0);
        this.f337476d = j17;
        this.f337477e = c10875xc0cf956c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List m40826x8f8c4694;
        long j17 = this.f337476d;
        if (1 <= j17 && j17 < 60001) {
            com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = this.f337477e;
            m40826x8f8c4694 = c10875xc0cf956c.m40826x8f8c4694(c10875xc0cf956c.m46706x242e1940());
            m40826x8f8c4694.add(java.lang.Long.valueOf(j17));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("battery-accproclife-kernel-startup-last-ms", java.lang.System.currentTimeMillis());
        }
        return jz5.f0.f384359a;
    }
}
