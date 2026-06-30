package ht0;

/* loaded from: classes10.dex */
public class y implements ei3.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ht0.c0 f366314a;

    public y(ht0.c0 c0Var) {
        this.f366314a = c0Var;
    }

    @Override // ei3.h
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "onPcmReady");
        ei3.e1 e1Var = this.f366314a.f366211p;
        if (e1Var.f334572a != ei3.l.Initialized) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Media.X264MP4MuxRecorder", "not MediaStatus.Initialized, maybe canceled by user");
        } else {
            e1Var.a(ei3.l.Start);
        }
    }
}
