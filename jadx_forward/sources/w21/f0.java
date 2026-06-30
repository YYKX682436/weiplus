package w21;

/* loaded from: classes14.dex */
public class f0 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w21.i0 f523896a;

    public f0(w21.i0 i0Var) {
        this.f523896a = i0Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        w21.i0 i0Var = this.f523896a;
        fp.e eVar = i0Var.f523924l;
        if (eVar != null && i0Var.f523926n) {
            eVar.a();
        }
        try {
            this.f523896a.f523917e = 0;
            this.f523896a.n();
            try {
                w21.i0.k(this.f523896a);
            } catch (java.lang.InterruptedException e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        } catch (java.lang.Exception e18) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexPlayer", "setCompletion File[" + this.f523896a.f523914b + "] ErrMsg[" + e18.getStackTrace() + "]");
        }
    }
}
