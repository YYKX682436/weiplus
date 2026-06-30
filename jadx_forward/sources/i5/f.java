package i5;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f369979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Notification f369980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63 f369981f;

    public f(p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63 serviceC1276xcff9fd63, int i17, android.app.Notification notification) {
        this.f369981f = serviceC1276xcff9fd63;
        this.f369979d = i17;
        this.f369980e = notification;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f369981f.f94028h.notify(this.f369979d, this.f369980e);
    }
}
