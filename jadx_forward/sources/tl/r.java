package tl;

/* loaded from: classes12.dex */
public class r extends com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 {

    /* renamed from: g, reason: collision with root package name */
    public final long f501640g;

    public r(tl.t tVar, long j17) {
        super(new tl.p(tVar), true);
        this.f501640g = 0L;
        this.f501640g = j17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.b4
    public void c(long j17, long j18) {
        if (e()) {
            long j19 = this.f501640g;
            if (j19 > 0) {
                mo50297x7c4d7ca2(new tl.q(this), j19);
            }
        }
        super.c(j17, j18);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.b4
    public void d() {
        super.d();
    }
}
