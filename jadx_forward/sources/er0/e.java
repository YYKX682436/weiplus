package er0;

/* loaded from: classes12.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f337488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c f337489e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j17, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c) {
        super(0);
        this.f337488d = j17;
        this.f337489e = c10875xc0cf956c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long j17 = this.f337488d;
        if (j17 >= 60000) {
            com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = this.f337489e;
            long accBgAvgDuringMs = (c10875xc0cf956c.getAccBgAvgDuringMs() * c10875xc0cf956c.getAccBgCount()) + j17;
            c10875xc0cf956c.m46739x85c6fa0b(c10875xc0cf956c.getAccBgCount() + 1);
            c10875xc0cf956c.m46738xffb2cb5(accBgAvgDuringMs / c10875xc0cf956c.getAccBgCount());
        }
        return jz5.f0.f384359a;
    }
}
