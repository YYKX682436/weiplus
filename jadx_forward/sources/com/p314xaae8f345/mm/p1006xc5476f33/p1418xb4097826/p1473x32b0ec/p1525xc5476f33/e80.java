package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class e80 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.f0 f193912d;

    public e80(cm2.f0 f0Var) {
        this.f193912d = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            f52Var.set(0, 7);
            cm2.f0 f0Var = this.f193912d;
            f52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(f0Var.f124875v.mo14344x5f01b1f6()));
            f52Var.set(4, java.lang.Long.valueOf(f0Var.f124918d));
            f52Var.set(5, f0Var.f124920f);
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.mo14344x5f01b1f6());
            k0Var.mo46557x60d69242(bVar, bundle);
        }
    }
}
