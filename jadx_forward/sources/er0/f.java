package er0;

/* loaded from: classes12.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c f337491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f337492e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c, long j17) {
        super(0);
        this.f337491d = c10875xc0cf956c;
        this.f337492e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = this.f337491d;
        long accCheckAliveCount = c10875xc0cf956c.getAccCheckAliveCount();
        long j17 = this.f337492e;
        if (accCheckAliveCount < j17) {
            c10875xc0cf956c.m46741x69a748ab(j17);
        }
        return jz5.f0.f384359a;
    }
}
