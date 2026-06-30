package w21;

/* loaded from: classes14.dex */
public class c1 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w21.d1 f523840a;

    public c1(w21.d1 d1Var) {
        this.f523840a = d1Var;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        w21.d1 d1Var = this.f523840a;
        fp.e eVar = d1Var.f523872e;
        if (eVar != null && d1Var.f523874g) {
            eVar.a();
        }
        tl.f fVar = d1Var.f523871d;
        if (fVar != null) {
            fVar.a();
        }
        try {
            d1Var.f523868a.reset();
            d1Var.f523868a.release();
            d1Var.f523873f = -1;
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePlayer", "setErrorListener File[" + d1Var.f523869b + "] ErrMsg[" + e17.getStackTrace() + "]");
            return false;
        }
    }
}
