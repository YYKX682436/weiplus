package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f271087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f271088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f271089f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f271090g;

    public c(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p pVar, int i17, int i18, int i19, boolean z17) {
        this.f271087d = i17;
        this.f271088e = i18;
        this.f271089f = i19;
        this.f271090g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e17 = l0Var.e(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.c(this.f271087d, this.f271088e));
        if (e17 != null) {
            int i17 = this.f271089f;
            if (-1 == i17 || java.lang.String.valueOf(i17).equals(e17.f68780xf1e133f7)) {
                e17.f68786xda09c2ad = !this.f271090g;
                l0Var.g(e17, true);
            }
        }
    }
}
