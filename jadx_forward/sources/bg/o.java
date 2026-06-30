package bg;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg.f f101355e;

    public o(bg.f fVar, int i17) {
        this.f101355e = fVar;
        this.f101354d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f101355e;
        java.lang.String A = fVar.A();
        int i17 = this.f101354d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(A, "handleWebViewBackground, type:%s, autoPauseIfNative:%s, autoPauseIfNavigate:%s, isRuntimeInBackground:%s, isPlayingWhenEnterBackground:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(fVar.Q), java.lang.Boolean.valueOf(fVar.P), java.lang.Boolean.valueOf(fVar.T), fVar.U);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w1 U2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n.f163477e.U2(fVar.P, fVar.Q);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "handleWebViewBackground, autoPauseStrategy: %s", U2);
        sf.f fVar2 = fVar.f101308s;
        if (!U2.a(fVar2 == null ? null : fVar2.m(), tf1.h.c(i17))) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = fVar.U;
            if (atomicBoolean != null && atomicBoolean.get()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "handleWebViewBackground, video not auto pause, try resume, type:%s", java.lang.Integer.valueOf(i17));
                fVar.K(false, true);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "handleWebViewBackground, video not auto pause, ignore resume, type:%s", java.lang.Integer.valueOf(i17));
            ye1.e eVar = fVar.f101297h;
            if (eVar != null && fVar.f101319z && fVar.U == null) {
                boolean mo1856xc00617a4 = eVar.mo1856xc00617a4();
                fVar.U = new java.util.concurrent.atomic.AtomicBoolean(mo1856xc00617a4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "handleWebViewBackground runnable, video playing state when enter background:%s", java.lang.Boolean.valueOf(mo1856xc00617a4));
                return;
            }
            return;
        }
        ye1.e eVar2 = fVar.f101297h;
        if (eVar2 != null && fVar.f101319z && fVar.U == null) {
            boolean mo1856xc00617a42 = eVar2.mo1856xc00617a4();
            fVar.U = new java.util.concurrent.atomic.AtomicBoolean(mo1856xc00617a42);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "handleWebViewBackground runnable, video playing state when enter background:%s", java.lang.Boolean.valueOf(mo1856xc00617a42));
            if (fVar.R1 && 1 != i17 && fVar.s()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "handleWebViewBackground runnable, background play audio is enabled, do not pause");
            } else if (fVar.K1.a(fVar.f101308s)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "handleWebViewBackground runnable, i am pip player, do not pause");
            } else {
                fVar.J(false);
            }
        }
    }
}
