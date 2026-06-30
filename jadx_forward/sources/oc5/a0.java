package oc5;

/* loaded from: classes3.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.g0 f425915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f425916e;

    public a0(oc5.g0 g0Var, long j17) {
        this.f425915d = g0Var;
        this.f425916e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oc5.g0 g0Var = this.f425915d;
        java.lang.Long l17 = g0Var.f425958i;
        if (l17 == null) {
            return;
        }
        long longValue = l17.longValue();
        long j17 = this.f425916e;
        if (longValue != j17) {
            return;
        }
        g0Var.f425959j = java.lang.System.currentTimeMillis();
        g0Var.f425960k = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageScanCodeManager", "onBottomSheetShowAnimationEnd id: " + j17 + ", isCodeItemVisible: " + g0Var.f425961l);
        if (g0Var.f425961l) {
            g0Var.f425962m = 0L;
            g0Var.g(j17, "bottomSheetShowEnd");
        }
    }
}
