package bh3;

/* loaded from: classes12.dex */
public final class d implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f20912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20913f;

    public d(int i17, long j17, int i18) {
        this.f20911d = i17;
        this.f20912e = j17;
        this.f20913f = i18;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckContactWorker", "doWork() called idle");
        ((ku5.t0) ku5.t0.f312615d).g(new bh3.c(this.f20911d, this.f20912e, this.f20913f));
        return false;
    }
}
