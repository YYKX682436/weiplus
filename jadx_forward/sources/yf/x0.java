package yf;

/* loaded from: classes7.dex */
public class x0 implements sf.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f543003a;

    public x0(yf.i0 i0Var) {
        this.f543003a = i0Var;
    }

    @Override // sf.e
    public void a(final int i17) {
        final yf.i0 i0Var = this.f543003a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "onBackground, type: " + i17);
        i0Var.getClass();
        i0Var.G(new java.lang.Runnable() { // from class: yf.i0$$b
            /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 241
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: yf.RunnableC30764x5de019b.run():void");
            }
        });
    }

    @Override // sf.e
    public void b() {
        final yf.i0 i0Var = this.f543003a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "onForeground");
        i0Var.getClass();
        i0Var.G(new java.lang.Runnable() { // from class: yf.i0$$f
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0 i0Var2 = yf.i0.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var2.x(), "*** handler(%s) handleWebViewForeground", i0Var2.q());
                zf.c cVar = i0Var2.f542898o;
                if (cVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "clearVoipPageBackgroundButNotPipState");
                    ((bg1.h) cVar).f101426d = false;
                }
                i0Var2.N = false;
                yf.o oVar = i0Var2.f542895i;
                if (oVar != null) {
                    ((yf.n1) oVar).c();
                }
                i0Var2.B.enable();
            }
        });
    }

    @Override // sf.e
    /* renamed from: onDestroy */
    public void mo10362xac79a11b() {
        final yf.i0 i0Var = this.f543003a;
        i0Var.getClass();
        i0Var.G(new java.lang.Runnable() { // from class: yf.i0$$d
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0 i0Var2 = yf.i0.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var2.x(), "*** handler(%s) handleWebViewDestroy", i0Var2.q());
                i0Var2.E();
            }
        });
    }
}
