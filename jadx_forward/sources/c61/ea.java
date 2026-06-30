package c61;

/* loaded from: classes11.dex */
public final class ea implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.ga f120498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120499e;

    public ea(c61.ga gaVar, java.lang.String str) {
        this.f120498d = gaVar;
        this.f120499e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f120498d.f120537d;
        if (eventSink != null) {
            eventSink.mo138418x90b54003(this.f120499e);
        }
    }
}
