package ww1;

/* loaded from: classes15.dex */
public class b1 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.l1 f531651a;

    public b1(ww1.l1 l1Var) {
        this.f531651a = l1Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "play done");
        ww1.l1 l1Var = this.f531651a;
        l1Var.f531769g = false;
        l1Var.f531767e = null;
        ww1.l1.b(l1Var);
        if (l1Var.f531768f.isEmpty()) {
            ww1.l1.i();
        } else {
            l1Var.u();
        }
    }
}
