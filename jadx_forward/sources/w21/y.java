package w21;

/* loaded from: classes14.dex */
public class y implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w21.d0 f524048a;

    public y(w21.d0 d0Var) {
        this.f524048a = d0Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        w21.d0 d0Var = this.f524048a;
        if (d0Var.f523845d != null && d0Var.f523860s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "silkPlayer play onCompletion abandonFocus");
            this.f524048a.f523845d.a();
        }
        try {
            this.f524048a.f523851j = 0;
            this.f524048a.v();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "setCompletion File[" + this.f524048a.f523850i + "] ErrMsg[" + e17.getStackTrace() + "]");
        }
    }
}
