package bg;

/* loaded from: classes7.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f19847d;

    public x0(bg.f fVar) {
        this.f19847d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f19847d;
        if (!fVar.B) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "onMediaPlayerSeekComplete, mp released");
            return;
        }
        com.tencent.mars.xlog.Log.i(fVar.A(), "onSeekComplete");
        if (fVar.U()) {
            dg.e eVar = fVar.f19765i;
            ye1.e eVar2 = fVar.f19764h;
            int currentPosition = eVar2 != null ? eVar2.getCurrentPosition() : 0;
            fg1.b0 b0Var = (fg1.b0) eVar;
            b0Var.f261848g = false;
            com.tencent.mm.sdk.platformtools.b4 b4Var = b0Var.f261846e;
            if (b4Var != null && b4Var.e() && b0Var.f261842a != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onVideoSeekComplete, dispatch onVideoTimeUpdate");
                ye1.e eVar3 = b0Var.f261842a.f19764h;
                b0Var.h(eVar3 != null ? eVar3.getCurrentPosition() : 0, (int) (b0Var.f261844c * 1000.0d));
            }
            try {
                org.json.JSONObject b17 = b0Var.b();
                b17.put("position", currentPosition);
                b0Var.a(new fg1.m0(null), b17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onXWebVideoSeekComplete fail", e17);
            }
        }
        if (fVar.f19776t) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "onSeekComplete, start when seek complete");
            fVar.f19776t = false;
            fVar.K(false, true);
            return;
        }
        boolean isPlaying = fVar.f19764h.isPlaying();
        if (!fVar.f19777u) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "onSeekComplete, video not playing before seeking, isCurrentPlaying:%b", java.lang.Boolean.valueOf(isPlaying));
            if (isPlaying || !fVar.U()) {
                return;
            }
            com.tencent.mars.xlog.Log.i(fVar.A(), "onSeekComplete, dispatch pause again");
            ((fg1.b0) fVar.f19765i).f(false);
            return;
        }
        long duration = fVar.f19764h.getDuration();
        long currentPosition2 = fVar.f19764h.getCurrentPosition();
        com.tencent.mars.xlog.Log.i(fVar.A(), "onSeekComplete, video playing before seeking, isCurrentPlaying:%b, position:%s, duration:%s", java.lang.Boolean.valueOf(isPlaying), java.lang.Long.valueOf(currentPosition2), java.lang.Long.valueOf(duration));
        fVar.f19777u = false;
        if (currentPosition2 / 1000 >= duration / 1000) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "onSeekComplete, video ends");
            fVar.f19764h.pause();
            fVar.f19764h.start();
        } else {
            com.tencent.mars.xlog.Log.i(fVar.A(), "onSeekComplete, video not end");
            if (isPlaying && fVar.U()) {
                com.tencent.mars.xlog.Log.i(fVar.A(), "onSeekComplete, dispatch play again");
                ((fg1.b0) fVar.f19765i).g(false);
            }
        }
    }
}
