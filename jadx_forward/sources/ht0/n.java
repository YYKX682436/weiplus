package ht0;

/* loaded from: classes10.dex */
public class n implements ei3.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ht0.s f366242a;

    public n(ht0.s sVar) {
        this.f366242a = sVar;
    }

    @Override // ei3.h
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] onPcmReady");
        ei3.e1 e1Var = this.f366242a.f366300o;
        if (e1Var.f334572a == ei3.l.Initialized) {
            e1Var.a(ei3.l.Start);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] not MediaStatus.Initialized, maybe canceled by user");
    }
}
