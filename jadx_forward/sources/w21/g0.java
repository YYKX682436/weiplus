package w21;

/* loaded from: classes14.dex */
public class g0 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w21.i0 f523903a;

    public g0(w21.i0 i0Var) {
        this.f523903a = i0Var;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        w21.i0 i0Var = this.f523903a;
        fp.e eVar = i0Var.f523924l;
        if (eVar != null && i0Var.f523926n) {
            eVar.a();
        }
        tl.f fVar = this.f523903a.f523916d;
        if (fVar != null) {
            fVar.a();
        }
        try {
            this.f523903a.f523917e = -1;
            this.f523903a.n();
            try {
                w21.i0.k(this.f523903a);
            } catch (java.lang.InterruptedException e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexPlayer", "setErrorListener File[" + this.f523903a.f523914b + "] ErrMsg[" + e18.getStackTrace() + "]");
        }
        return false;
    }
}
