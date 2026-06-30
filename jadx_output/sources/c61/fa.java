package c61;

/* loaded from: classes11.dex */
public final class fa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.ga f38981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38982e;

    public fa(c61.ga gaVar, java.lang.String str) {
        this.f38981d = gaVar;
        this.f38982e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f38981d.f39004d;
        if (eventSink != null) {
            eventSink.success(this.f38982e);
        }
    }
}
