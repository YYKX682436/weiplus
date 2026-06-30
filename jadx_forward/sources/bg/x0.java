package bg;

/* loaded from: classes7.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f101380d;

    public x0(bg.f fVar) {
        this.f101380d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f101380d;
        if (!fVar.B) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onMediaPlayerSeekComplete, mp released");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onSeekComplete");
        if (fVar.U()) {
            dg.e eVar = fVar.f101298i;
            ye1.e eVar2 = fVar.f101297h;
            int mo1851x9746038c = eVar2 != null ? eVar2.mo1851x9746038c() : 0;
            fg1.b0 b0Var = (fg1.b0) eVar;
            b0Var.f343381g = false;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = b0Var.f343379e;
            if (b4Var != null && b4Var.e() && b0Var.f343375a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onVideoSeekComplete, dispatch onVideoTimeUpdate");
                ye1.e eVar3 = b0Var.f343375a.f101297h;
                b0Var.h(eVar3 != null ? eVar3.mo1851x9746038c() : 0, (int) (b0Var.f343377c * 1000.0d));
            }
            try {
                org.json.JSONObject b17 = b0Var.b();
                b17.put("position", mo1851x9746038c);
                b0Var.a(new fg1.m0(null), b17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onXWebVideoSeekComplete fail", e17);
            }
        }
        if (fVar.f101309t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onSeekComplete, start when seek complete");
            fVar.f101309t = false;
            fVar.K(false, true);
            return;
        }
        boolean mo1856xc00617a4 = fVar.f101297h.mo1856xc00617a4();
        if (!fVar.f101310u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onSeekComplete, video not playing before seeking, isCurrentPlaying:%b", java.lang.Boolean.valueOf(mo1856xc00617a4));
            if (mo1856xc00617a4 || !fVar.U()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onSeekComplete, dispatch pause again");
            ((fg1.b0) fVar.f101298i).f(false);
            return;
        }
        long mo1852x51e8b0a = fVar.f101297h.mo1852x51e8b0a();
        long mo1851x9746038c2 = fVar.f101297h.mo1851x9746038c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onSeekComplete, video playing before seeking, isCurrentPlaying:%b, position:%s, duration:%s", java.lang.Boolean.valueOf(mo1856xc00617a4), java.lang.Long.valueOf(mo1851x9746038c2), java.lang.Long.valueOf(mo1852x51e8b0a));
        fVar.f101310u = false;
        if (mo1851x9746038c2 / 1000 >= mo1852x51e8b0a / 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onSeekComplete, video ends");
            fVar.f101297h.mo1857x65825f6();
            fVar.f101297h.mo1865x68ac462();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onSeekComplete, video not end");
            if (mo1856xc00617a4 && fVar.U()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onSeekComplete, dispatch play again");
                ((fg1.b0) fVar.f101298i).g(false);
            }
        }
    }
}
