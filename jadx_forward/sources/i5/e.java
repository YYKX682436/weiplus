package i5;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f369975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Notification f369976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f369977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63 f369978g;

    public e(p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63 serviceC1276xcff9fd63, int i17, android.app.Notification notification, int i18) {
        this.f369978g = serviceC1276xcff9fd63;
        this.f369975d = i17;
        this.f369976e = notification;
        this.f369977f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.app.Notification notification = this.f369976e;
        int i18 = this.f369975d;
        p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63 serviceC1276xcff9fd63 = this.f369978g;
        if (i17 >= 29) {
            serviceC1276xcff9fd63.startForeground(i18, notification, this.f369977f);
        } else {
            serviceC1276xcff9fd63.startForeground(i18, notification);
        }
    }
}
