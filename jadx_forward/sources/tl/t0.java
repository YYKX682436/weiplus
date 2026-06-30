package tl;

/* loaded from: classes12.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.q0 f501677d;

    public t0(tl.q0 q0Var) {
        this.f501677d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f501677d.f501636q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceService", "Try Run service runningFlag:" + this.f501677d.f501634o + " timeWait:" + currentTimeMillis + " sending:" + this.f501677d.f501633n + " recving:" + this.f501677d.f501632m + "[" + this.f501677d.toString() + "]");
        if (this.f501677d.f501634o) {
            if (currentTimeMillis < 60000) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoiceService", "ERR: Try Run service runningFlag:" + this.f501677d.f501634o + " timeWait:" + currentTimeMillis + ">=MAX_TIME_WAIT sending:" + this.f501677d.f501633n + " recving:" + this.f501677d.f501632m);
        }
        tl.q0 q0Var = this.f501677d;
        q0Var.f501634o = true;
        q0Var.f501633n = false;
        q0Var.f501635p = 3;
        q0Var.f501632m = false;
        q0Var.f501637r.b();
        if (this.f501677d.f501628f) {
            tl.q0.b(this.f501677d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoiceService", "acc not ready");
        }
    }

    /* renamed from: toString */
    public java.lang.String m166741x9616526c() {
        return super.toString() + "|run";
    }
}
