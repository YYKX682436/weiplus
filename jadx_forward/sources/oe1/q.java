package oe1;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a f426266e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a, java.lang.String str) {
        this.f426266e = c12262x4a2a25a;
        this.f426265d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new oe1.p(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D(this.f426265d, 1, -1)));
    }
}
