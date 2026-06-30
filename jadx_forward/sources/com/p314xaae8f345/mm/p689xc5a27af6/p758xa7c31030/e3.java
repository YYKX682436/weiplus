package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f149092d;

    /* renamed from: e, reason: collision with root package name */
    public long f149093e;

    /* renamed from: f, reason: collision with root package name */
    public long f149094f;

    @Override // java.lang.Runnable
    public void run() {
        wh.t1 d17 = wh.u1.d(android.os.Process.myPid());
        if (d17 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long a17 = d17.a();
            long j17 = this.f149093e;
            boolean z17 = false;
            if (1 <= j17 && j17 < currentTimeMillis) {
                long j18 = this.f149094f;
                if (1 <= j18 && j18 < a17) {
                    z17 = true;
                }
                if (z17) {
                    com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f3 f3Var = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f3.f149103a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appContext");
                    throw null;
                }
            }
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f3 f3Var2 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f3.f149103a;
            java.lang.String text = "update cpuTime " + this.f149092d + " skip: last=" + this.f149094f + ", curr=" + a17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40533xfb80ca96() != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.ProcCpuFeatureService", text);
            }
            this.f149093e = currentTimeMillis;
            this.f149094f = a17;
        }
        this.f149092d++;
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f3 f3Var3 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f3.f149103a;
        if (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f3.f149104b) {
            mm.k kVar = mm.k.Q;
            if (kVar.k(java.lang.String.valueOf(-1L)) * 1000 > 0) {
                ((android.os.Handler) ((jz5.n) com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f3.f149105c).mo141623x754a37bb()).postDelayed(this, kVar.k(java.lang.String.valueOf(-1L)) * 1000);
            }
        }
    }
}
