package fq4;

/* loaded from: classes15.dex */
public final class c0 extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f347108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fq4.d0 f347109e;

    public c0(fq4.d0 d0Var) {
        this.f347109e = d0Var;
        this.f347108d = new fq4.b0(this, d0Var);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        fq4.d0 d0Var = this.f347109e;
        if (d0Var.f347113a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePrintRecoder", "Stop Record Failed recorder == null");
            return;
        }
        synchronized (d0Var) {
            java.lang.String a17 = fq4.u.a(this.f347109e.f347114b, true);
            this.f347109e.getClass();
            this.f347109e.f347118f.C(true);
            if (this.f347109e.f347113a.mo166725x8e35cb53(a17)) {
                fq4.a0 a0Var = this.f347109e.f347119g;
                if (a0Var != null) {
                    a0Var.getClass();
                }
                this.f347109e.f347115c = android.os.SystemClock.elapsedRealtime();
                java.lang.String str = this.f347109e.f347114b;
                this.f347108d.mo50307xb9e94560(0, 1L);
                return;
            }
            fq4.d0 d0Var2 = this.f347109e;
            d0Var2.f347114b = null;
            d0Var2.f347113a.mo166726xad07d6f3();
            fq4.d0 d0Var3 = this.f347109e;
            d0Var3.f347113a = null;
            d0Var3.f347118f.C(true);
            fq4.a0 a0Var2 = this.f347109e.f347119g;
            if (a0Var2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.a) a0Var2).a();
            }
        }
    }
}
