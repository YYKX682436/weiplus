package rh;

/* loaded from: classes12.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.w f476995d;

    public n(rh.w wVar) {
        this.f476995d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f476995d.f477061e.size() >= this.f476995d.f476827a.f444868d.f444822h) {
            synchronized ("Matrix.battery.AppStatMonitorFeature") {
                wh.j2.b(this.f476995d.f477061e);
            }
        }
        if (this.f476995d.f477062f.size() >= this.f476995d.f476827a.f444868d.f444822h) {
            synchronized ("Matrix.battery.AppStatMonitorFeature") {
                wh.j2.b(this.f476995d.f477062f);
            }
        }
    }
}
