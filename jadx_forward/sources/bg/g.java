package bg;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f101328d;

    public g(bg.f fVar) {
        this.f101328d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        boolean z18;
        bg.f fVar = this.f101328d;
        if (!fVar.B) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onMediaPlayerCompletion, mp released");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onCompletion");
        if (fVar.U()) {
            fg1.b0 b0Var = (fg1.b0) fVar.f101298i;
            b0Var.getClass();
            try {
                org.json.JSONObject b17 = b0Var.b();
                tf1.f a17 = tf.k.a(b0Var.f343376b);
                if (a17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "isInFloatBallPlaying, audioOfVideoBackgroundPlayManager is null");
                    z17 = false;
                } else {
                    z17 = a17.f500400p;
                }
                b17.put("inBackgroundPlayback", z17);
                java.lang.Object[] objArr = new java.lang.Object[1];
                tf1.f a18 = tf.k.a(b0Var.f343376b);
                if (a18 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "isInFloatBallPlaying, audioOfVideoBackgroundPlayManager is null");
                    z18 = false;
                } else {
                    z18 = a18.f500400p;
                }
                objArr[0] = java.lang.Boolean.valueOf(z18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onVideoEnded inBackgroundPlayback:%b", objArr);
                b0Var.a(new fg1.f0(null), b17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoEnded fail", e17);
            }
            b0Var.k();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new fg1.d0(b0Var));
            b0Var.c(true);
        }
        dg.b bVar = fVar.f101306q;
        if (bVar != null) {
            sf.f fVar2 = fVar.f101308s;
            ye1.e eVar = fVar.f101297h;
            fg1.z zVar = (fg1.z) bVar;
            dg.f b18 = zVar.b();
            ig1.a aVar = zVar.f343455c;
            if (b18 != null) {
                ig1.c cVar = aVar.f372874a;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f372876a) && cVar.f372881f > 0) {
                    cVar.f372889n = java.lang.System.currentTimeMillis();
                    aVar.c(b18, fVar2, eVar, "onMediaPlayerVideoEnd");
                }
            } else {
                aVar.getClass();
            }
        }
        if (fVar.C) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onCompletion, video loop playing");
            fVar.f101309t = true;
            fVar.R(0L);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onCompletion, video end playing");
        fVar.R = true;
        ye1.e eVar2 = fVar.f101297h;
        if (eVar2 != null) {
            eVar2.mo1857x65825f6();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onCompletion, abandonFocus");
        fVar.G1.a();
    }
}
