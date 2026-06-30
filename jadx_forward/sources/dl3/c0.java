package dl3;

/* loaded from: classes13.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f316811d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl3.d0 f316812e;

    public c0(dl3.d0 d0Var, dl3.a0 a0Var) {
        this.f316812e = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        dl3.d0 d0Var = this.f316812e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "start run play progress task");
        while (!this.f316811d) {
            try {
                if (d0Var.f316815e != null && d0Var.i() && d0Var.f316813c.equalsIgnoreCase(d0Var.f316814d.f415369a) && d0Var.f316815e != null && d0Var.i()) {
                    d0Var.f316815e.mo93635x9746038c();
                    d0Var.f316815e.mo93638x51e8b0a();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.QQAudioPlayer", "PlayProgressTask run exception:" + e17.getMessage());
            }
            try {
                java.lang.Thread.sleep(200L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }
}
