package k23;

/* loaded from: classes12.dex */
public final class u0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f385232a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(k23.v0 v0Var, android.os.Looper looper) {
        super(looper);
        this.f385232a = v0Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.what == 101) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "finishRecognizeTimeoutTask run");
            ((k23.n0) this.f385232a.f385254p).run();
        }
    }
}
