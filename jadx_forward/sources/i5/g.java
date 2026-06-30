package i5;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f369982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63 f369983e;

    public g(p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63 serviceC1276xcff9fd63, int i17) {
        this.f369983e = serviceC1276xcff9fd63;
        this.f369982d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f369983e.f94028h.cancel(this.f369982d);
    }
}
