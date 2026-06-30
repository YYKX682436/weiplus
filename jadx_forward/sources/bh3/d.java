package bh3;

/* loaded from: classes12.dex */
public final class d implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f102444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f102445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f102446f;

    public d(int i17, long j17, int i18) {
        this.f102444d = i17;
        this.f102445e = j17;
        this.f102446f = i18;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckContactWorker", "doWork() called idle");
        ((ku5.t0) ku5.t0.f394148d).g(new bh3.c(this.f102444d, this.f102445e, this.f102446f));
        return false;
    }
}
