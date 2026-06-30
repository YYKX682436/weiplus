package w21;

/* loaded from: classes14.dex */
public class z implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w21.d0 f524051a;

    public z(w21.d0 d0Var) {
        this.f524051a = d0Var;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "onError");
        w21.d0 d0Var = this.f524051a;
        fp.e eVar = d0Var.f523845d;
        if (eVar != null && d0Var.f523860s) {
            eVar.a();
        }
        tl.f fVar = this.f524051a.f523847f;
        if (fVar != null) {
            fVar.a();
        }
        try {
            this.f524051a.f523851j = -1;
            this.f524051a.v();
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "setErrorListener File[" + this.f524051a.f523850i + "] ErrMsg[" + e17.getStackTrace() + "]");
            return false;
        }
    }
}
