package dw2;

/* loaded from: classes2.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15205x28f20815 f325708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325709e;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15205x28f20815 c15205x28f20815, java.lang.String str) {
        this.f325708d = c15205x28f20815;
        this.f325709e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15205x28f20815 c15205x28f20815 = this.f325708d;
        c15205x28f20815.f212320w.add(this.f325709e);
        c15205x28f20815.I0(c15205x28f20815.f212308h, true);
    }
}
