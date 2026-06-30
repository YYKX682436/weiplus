package bg;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f19795d;

    public g(bg.f fVar) {
        this.f19795d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        boolean z18;
        bg.f fVar = this.f19795d;
        if (!fVar.B) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "onMediaPlayerCompletion, mp released");
            return;
        }
        com.tencent.mars.xlog.Log.i(fVar.A(), "onCompletion");
        if (fVar.U()) {
            fg1.b0 b0Var = (fg1.b0) fVar.f19765i;
            b0Var.getClass();
            try {
                org.json.JSONObject b17 = b0Var.b();
                tf1.f a17 = tf.k.a(b0Var.f261843b);
                if (a17 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "isInFloatBallPlaying, audioOfVideoBackgroundPlayManager is null");
                    z17 = false;
                } else {
                    z17 = a17.f418867p;
                }
                b17.put("inBackgroundPlayback", z17);
                java.lang.Object[] objArr = new java.lang.Object[1];
                tf1.f a18 = tf.k.a(b0Var.f261843b);
                if (a18 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "isInFloatBallPlaying, audioOfVideoBackgroundPlayManager is null");
                    z18 = false;
                } else {
                    z18 = a18.f418867p;
                }
                objArr[0] = java.lang.Boolean.valueOf(z18);
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onVideoEnded inBackgroundPlayback:%b", objArr);
                b0Var.a(new fg1.f0(null), b17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoEnded fail", e17);
            }
            b0Var.k();
            com.tencent.mm.sdk.platformtools.u3.h(new fg1.d0(b0Var));
            b0Var.c(true);
        }
        dg.b bVar = fVar.f19773q;
        if (bVar != null) {
            sf.f fVar2 = fVar.f19775s;
            ye1.e eVar = fVar.f19764h;
            fg1.z zVar = (fg1.z) bVar;
            dg.f b18 = zVar.b();
            ig1.a aVar = zVar.f261922c;
            if (b18 != null) {
                ig1.c cVar = aVar.f291341a;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f291343a) && cVar.f291348f > 0) {
                    cVar.f291356n = java.lang.System.currentTimeMillis();
                    aVar.c(b18, fVar2, eVar, "onMediaPlayerVideoEnd");
                }
            } else {
                aVar.getClass();
            }
        }
        if (fVar.C) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "onCompletion, video loop playing");
            fVar.f19776t = true;
            fVar.R(0L);
            return;
        }
        com.tencent.mars.xlog.Log.i(fVar.A(), "onCompletion, video end playing");
        fVar.R = true;
        ye1.e eVar2 = fVar.f19764h;
        if (eVar2 != null) {
            eVar2.pause();
        }
        com.tencent.mars.xlog.Log.i(fVar.A(), "onCompletion, abandonFocus");
        fVar.G1.a();
    }
}
