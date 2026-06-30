package rh;

/* loaded from: classes12.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.d2 f477016d;

    public o1(rh.d2 d2Var) {
        this.f477016d = d2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f477016d.f476894c.size() >= this.f477016d.f476827a.f444868d.f444822h) {
            synchronized ("Matrix.battery.DeviceStatusMonitorFeature") {
                wh.j2.b(this.f477016d.f476894c);
            }
        }
    }
}
