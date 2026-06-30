package pn4;

/* loaded from: classes5.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn4.z f438760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f438761e;

    public u(pn4.z zVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f438760d = zVar;
        this.f438761e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f438760d.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f438761e;
        if (f9Var.A0() != 0) {
            return;
        }
        try {
            w21.x0.q(f9Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechService", "clearVoiceMessageRedDot success msgId=" + f9Var.m124847x74d37ac6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextToSpeechService", "clearVoiceMessageRedDot failed msgId=" + f9Var.m124847x74d37ac6(), e17);
        }
    }
}
