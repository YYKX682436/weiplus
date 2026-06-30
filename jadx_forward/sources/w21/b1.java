package w21;

/* loaded from: classes14.dex */
public class b1 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w21.d1 f523835a;

    public b1(w21.d1 d1Var) {
        this.f523835a = d1Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        w21.d1 d1Var = this.f523835a;
        fp.e eVar = d1Var.f523872e;
        if (eVar != null && d1Var.f523874g) {
            eVar.a();
        }
        tl.e eVar2 = d1Var.f523870c;
        if (eVar2 != null) {
            eVar2.mo66237xa6db431b();
        }
        try {
            d1Var.f523868a.reset();
            d1Var.f523868a.release();
            d1Var.f523873f = 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePlayer", "setCompletion File[" + d1Var.f523869b + "] ErrMsg[" + e17.getStackTrace() + "]");
        }
    }
}
