package ha3;

/* loaded from: classes15.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.d0 f361337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f361338e;

    public c0(ha3.d0 d0Var, java.lang.Object obj) {
        this.f361337d = d0Var;
        this.f361338e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f361337d.f361354k;
        if (eventSink != null) {
            eventSink.mo138418x90b54003(this.f361338e);
        }
    }
}
