package c61;

/* loaded from: classes11.dex */
public final class ea implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.ga f38965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38966e;

    public ea(c61.ga gaVar, java.lang.String str) {
        this.f38965d = gaVar;
        this.f38966e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f38965d.f39004d;
        if (eventSink != null) {
            eventSink.success(this.f38966e);
        }
    }
}
