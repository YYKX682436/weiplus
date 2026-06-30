package wb1;

/* loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f525891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f525892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f525893f;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var) {
        this.f525891d = lVar;
        this.f525892e = i17;
        this.f525893f = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f525891d.a(this.f525892e, this.f525893f.o("ok"));
    }
}
