package er0;

/* loaded from: classes12.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c f337534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f337535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c, int i17) {
        super(0);
        this.f337534d = c10875xc0cf956c;
        this.f337535e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map m40827x8f8c4694;
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = this.f337534d;
        c10875xc0cf956c.m46743xa62cb90c(c10875xc0cf956c.getAccDeadCount() + 1);
        int i17 = this.f337535e;
        if (i17 == 1) {
            c10875xc0cf956c.m46742x60a5ee8a(c10875xc0cf956c.getAccContinuousRecycleCount() + 1);
        }
        m40827x8f8c4694 = c10875xc0cf956c.m40827x8f8c4694(c10875xc0cf956c.m46728x75831c97());
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Long l17 = c10875xc0cf956c.m46728x75831c97().get(java.lang.Integer.valueOf(i17));
        if (l17 == null) {
            l17 = 0L;
        }
        m40827x8f8c4694.put(valueOf, java.lang.Long.valueOf(l17.longValue() + 1));
        return jz5.f0.f384359a;
    }
}
