package er0;

/* loaded from: classes12.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c f337510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f337511e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c, long j17) {
        super(0);
        this.f337510d = c10875xc0cf956c;
        this.f337511e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = this.f337510d;
        c10875xc0cf956c.m46753xbc2e77f0(c10875xc0cf956c.getAccMainProcStandByCount() + 1);
        c10875xc0cf956c.m46756xbdec645(c10875xc0cf956c.getAccMainProcStandbyMs() + this.f337511e);
        return jz5.f0.f384359a;
    }
}
