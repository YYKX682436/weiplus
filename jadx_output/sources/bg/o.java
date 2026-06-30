package bg;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg.f f19822e;

    public o(bg.f fVar, int i17) {
        this.f19822e = fVar;
        this.f19821d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f19822e;
        java.lang.String A = fVar.A();
        int i17 = this.f19821d;
        com.tencent.mars.xlog.Log.i(A, "handleWebViewBackground, type:%s, autoPauseIfNative:%s, autoPauseIfNavigate:%s, isRuntimeInBackground:%s, isPlayingWhenEnterBackground:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(fVar.Q), java.lang.Boolean.valueOf(fVar.P), java.lang.Boolean.valueOf(fVar.T), fVar.U);
        com.tencent.mm.plugin.appbrand.jsapi.media.w1 U2 = com.tencent.mm.plugin.appbrand.jsapi.media.n.f81944e.U2(fVar.P, fVar.Q);
        com.tencent.mars.xlog.Log.i(fVar.A(), "handleWebViewBackground, autoPauseStrategy: %s", U2);
        sf.f fVar2 = fVar.f19775s;
        if (!U2.a(fVar2 == null ? null : fVar2.m(), tf1.h.c(i17))) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = fVar.U;
            if (atomicBoolean != null && atomicBoolean.get()) {
                com.tencent.mars.xlog.Log.i(fVar.A(), "handleWebViewBackground, video not auto pause, try resume, type:%s", java.lang.Integer.valueOf(i17));
                fVar.K(false, true);
                return;
            }
            com.tencent.mars.xlog.Log.i(fVar.A(), "handleWebViewBackground, video not auto pause, ignore resume, type:%s", java.lang.Integer.valueOf(i17));
            ye1.e eVar = fVar.f19764h;
            if (eVar != null && fVar.f19786z && fVar.U == null) {
                boolean isPlaying = eVar.isPlaying();
                fVar.U = new java.util.concurrent.atomic.AtomicBoolean(isPlaying);
                com.tencent.mars.xlog.Log.i(fVar.A(), "handleWebViewBackground runnable, video playing state when enter background:%s", java.lang.Boolean.valueOf(isPlaying));
                return;
            }
            return;
        }
        ye1.e eVar2 = fVar.f19764h;
        if (eVar2 != null && fVar.f19786z && fVar.U == null) {
            boolean isPlaying2 = eVar2.isPlaying();
            fVar.U = new java.util.concurrent.atomic.AtomicBoolean(isPlaying2);
            com.tencent.mars.xlog.Log.i(fVar.A(), "handleWebViewBackground runnable, video playing state when enter background:%s", java.lang.Boolean.valueOf(isPlaying2));
            if (fVar.R1 && 1 != i17 && fVar.s()) {
                com.tencent.mars.xlog.Log.i(fVar.A(), "handleWebViewBackground runnable, background play audio is enabled, do not pause");
            } else if (fVar.K1.a(fVar.f19775s)) {
                com.tencent.mars.xlog.Log.i(fVar.A(), "handleWebViewBackground runnable, i am pip player, do not pause");
            } else {
                fVar.J(false);
            }
        }
    }
}
