package wb1;

/* loaded from: classes7.dex */
public final class d implements gh.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wb1.h f525894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad f525895b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f525896c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f525897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f525898e;

    public d(wb1.h hVar, com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var) {
        this.f525894a = hVar;
        this.f525895b = c4209xd2d3ddad;
        this.f525896c = lVar;
        this.f525897d = i17;
        this.f525898e = k0Var;
    }

    @Override // gh.w
    /* renamed from: onPrepared */
    public void mo131553x58d5b73c() {
        if (this.f525894a.f525917s) {
            return;
        }
        this.f525895b.f130116g.k(new wb1.c(this.f525896c, this.f525897d, this.f525898e), false);
    }
}
