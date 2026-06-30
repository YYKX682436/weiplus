package cw1;

/* loaded from: classes12.dex */
public class o6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f304739d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f304740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b f304741f;

    public o6(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b activityC13122x435a878b, long j17, int i17) {
        this.f304741f = activityC13122x435a878b;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f304739d) {
            return;
        }
        int i17 = this.f304740e + 1;
        this.f304740e = i17;
        this.f304741f.N.b(0, (int) ((1.0d - java.lang.Math.exp((i17 * (-2.3d)) / 50)) * 100.0d), 100);
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
        t0Var.getClass();
        t0Var.z(this, 200L, false);
    }
}
