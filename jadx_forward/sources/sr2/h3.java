package sr2;

/* loaded from: classes5.dex */
public final class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f493112e;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6, int i17) {
        this.f493111d = c14609xb4d6eef6;
        this.f493112e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f493111d.m7().scrollBy(0, this.f493112e);
    }
}
