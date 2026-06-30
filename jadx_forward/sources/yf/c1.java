package yf;

/* loaded from: classes7.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f542857d;

    /* renamed from: e, reason: collision with root package name */
    public int f542858e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542859f;

    public c1(yf.i0 i0Var) {
        this.f542859f = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f542858e + 1;
        this.f542858e = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.LivePusherPluginHandler", "[CheckRotateTask] number:%s, angle:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f542857d));
        yf.i0 i0Var = this.f542859f;
        int y17 = i0Var.y();
        if (y17 == this.f542857d) {
            i0Var.z(y17);
        } else if (this.f542858e < 8) {
            i0Var.f542909z.postDelayed(this, 250L);
        }
    }
}
