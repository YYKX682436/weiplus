package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.animation.Interpolator f268320d;

    /* renamed from: e, reason: collision with root package name */
    public final int f268321e;

    /* renamed from: f, reason: collision with root package name */
    public final int f268322f;

    /* renamed from: g, reason: collision with root package name */
    public final long f268323g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f268324h = true;

    /* renamed from: i, reason: collision with root package name */
    public long f268325i = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f268326m = -1;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19312x9ccd54e5 f268327n;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19312x9ccd54e5 c19312x9ccd54e5, int i17, int i18, long j17) {
        this.f268327n = c19312x9ccd54e5;
        this.f268322f = i17;
        this.f268321e = i18;
        this.f268320d = c19312x9ccd54e5.f265148q ? new android.view.animation.AccelerateInterpolator() : new android.view.animation.DecelerateInterpolator();
        this.f268323g = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f268325i;
        int i17 = this.f268321e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19312x9ccd54e5 c19312x9ccd54e5 = this.f268327n;
        if (j17 == -1) {
            this.f268325i = java.lang.System.currentTimeMillis();
        } else {
            long j18 = this.f268323g;
            long max = j18 > 0 ? java.lang.Math.max(java.lang.Math.min(((java.lang.System.currentTimeMillis() - this.f268325i) * 1000) / j18, 1000L), 0L) : 500L;
            int round = this.f268322f - java.lang.Math.round((r0 - i17) * this.f268320d.getInterpolation(((float) max) / 1000.0f));
            this.f268326m = round;
            c19312x9ccd54e5.a(round);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.q qVar = c19312x9ccd54e5.f265150s;
            if (qVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s7) qVar).c(this.f268326m, false);
            }
        }
        if (!this.f268324h || i17 == this.f268326m) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.m(c19312x9ccd54e5, this);
    }
}
