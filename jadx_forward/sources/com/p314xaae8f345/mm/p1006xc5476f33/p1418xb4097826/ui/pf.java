package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class pf implements android.widget.SeekBar.OnSeekBarChangeListener, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ud {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f211168d;

    /* renamed from: g, reason: collision with root package name */
    public long f211171g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f211172h;

    /* renamed from: m, reason: collision with root package name */
    public long f211174m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f211175n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f211176o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f211177p;

    /* renamed from: e, reason: collision with root package name */
    public long f211169e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f211170f = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f211173i = Long.MIN_VALUE;

    public pf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949, r45.mb4 mb4Var, long j17) {
        this.f211175n = activityC15059x3e98c949;
        this.f211176o = mb4Var;
        this.f211177p = j17;
        this.f211168d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.of(activityC15059x3e98c949, mb4Var);
    }

    public final void a(long j17, r45.mb4 mb4Var) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949.f210201e2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f211175n;
        cw2.aa i76 = activityC15059x3e98c949.i7();
        if (i76 != null) {
            i76.mo122852xc9fc1b13(j17);
        }
        this.f211170f = j17;
        this.f211171g = java.lang.System.currentTimeMillis();
        if (hc2.l0.c(mb4Var)) {
            return;
        }
        long j18 = this.f211169e;
        if (j18 < 0 || java.lang.Math.abs(j17 - j18) >= 80) {
            rm5.k kVar = activityC15059x3e98c949.U;
            if (kVar != null) {
                kVar.b(this.f211169e);
            }
            rm5.k kVar2 = activityC15059x3e98c949.U;
            if (kVar2 != null) {
                kVar2.a(kz5.b0.c(java.lang.Long.valueOf(j17)), this.f211168d);
            }
            this.f211169e = j17;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f211175n;
        android.widget.SeekBar seekBar2 = activityC15059x3e98c949.F;
        if (seekBar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
        int max = seekBar2.getMax();
        long h17 = max > 0 ? e06.p.h(activityC15059x3e98c949.S1 + ((i17 * activityC15059x3e98c949.U1) / max), 0L, this.f211177p) : 0L;
        if (activityC15059x3e98c949.V1) {
            return;
        }
        if (z17) {
            long j17 = h17 / 200;
            if (j17 != this.f211173i) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis - this.f211174m >= 40) {
                    this.f211173i = j17;
                    this.f211174m = currentTimeMillis;
                    android.widget.SeekBar seekBar3 = activityC15059x3e98c949.F;
                    if (seekBar3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
                        throw null;
                    }
                    hc2.f1.x(seekBar3);
                }
            }
        }
        long j18 = this.f211170f;
        if (j18 < 0 || java.lang.Math.abs(h17 - j18) >= 16) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            long j19 = currentTimeMillis2 - this.f211171g;
            r45.mb4 mb4Var = this.f211176o;
            if (j19 >= 30) {
                java.lang.Runnable runnable = this.f211172h;
                if (runnable != null && seekBar != null) {
                    seekBar.removeCallbacks(runnable);
                }
                this.f211172h = null;
                a(h17, mb4Var);
                return;
            }
            java.lang.Runnable runnable2 = this.f211172h;
            if (runnable2 != null && seekBar != null) {
                seekBar.removeCallbacks(runnable2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.nf nfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.nf(this, h17, mb4Var);
            this.f211172h = nfVar;
            if (seekBar != null) {
                seekBar.postDelayed(nfVar, 30 - (currentTimeMillis2 - this.f211171g));
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        this.f211174m = java.lang.System.currentTimeMillis();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949.f210201e2;
        this.f211175n.A7(false);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        if (seekBar != null) {
            int max = seekBar.getMax();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f211175n;
            long h17 = max > 0 ? e06.p.h(activityC15059x3e98c949.S1 + ((seekBar.getProgress() * activityC15059x3e98c949.U1) / max), 0L, this.f211177p) : 0L;
            java.lang.Runnable runnable = this.f211172h;
            if (runnable != null) {
                seekBar.removeCallbacks(runnable);
            }
            this.f211172h = null;
            a(h17, this.f211176o);
            this.f211173i = Long.MIN_VALUE;
            if (activityC15059x3e98c949.R1) {
                return;
            }
            activityC15059x3e98c949.A7(true);
        }
    }
}
