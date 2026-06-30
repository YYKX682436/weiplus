package ha3;

/* loaded from: classes15.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.v f361454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f361455e;

    public q(ha3.v vVar, java.lang.Object obj) {
        this.f361454d = vVar;
        this.f361455e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f361454d.f361484m;
        if (eventSink != null) {
            eventSink.mo138418x90b54003(this.f361455e);
        }
    }
}
