package ha3;

/* loaded from: classes15.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.g f361376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f361377e;

    public f(ha3.g gVar, java.lang.Object obj) {
        this.f361376d = gVar;
        this.f361377e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f361376d.f361394l;
        if (eventSink != null) {
            eventSink.mo138418x90b54003(this.f361377e);
        }
    }
}
