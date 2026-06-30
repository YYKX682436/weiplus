package ww1;

/* loaded from: classes15.dex */
public class w0 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.k1 f531852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.l1 f531853b;

    public w0(ww1.l1 l1Var, ww1.k1 k1Var) {
        this.f531853b = l1Var;
        this.f531852a = k1Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "start play money");
        ww1.l1 l1Var = this.f531853b;
        if (l1Var.f531766d != null && l1Var.f531769g && l1Var.f531767e == null) {
            l1Var.o(this.f531852a);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "has played");
        }
        l1Var.f531766d = null;
    }
}
