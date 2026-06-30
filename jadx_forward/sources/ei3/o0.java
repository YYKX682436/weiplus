package ei3;

/* loaded from: classes10.dex */
public class o0 implements ei3.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ei3.w0 f334647a;

    public o0(ei3.w0 w0Var) {
        this.f334647a = w0Var;
    }

    @Override // ei3.h
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "onPcmReady");
        ei3.w0 w0Var = this.f334647a;
        if (w0Var.f334709p.f334572a != ei3.l.Initialized) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "not MediaStatus.Initialized, maybe canceled by user");
        } else {
            w0Var.f334702i.e();
            this.f334647a.f334709p.a(ei3.l.Start);
        }
    }
}
