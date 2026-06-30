package rh;

/* loaded from: classes12.dex */
public class p1 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.d2 f477025a;

    public p1(rh.d2 d2Var) {
        this.f477025a = d2Var;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        java.lang.String str;
        rh.d2 d2Var = this.f477025a;
        int intValue = ((java.lang.Integer) obj).intValue();
        d2Var.getClass();
        wh.k kVar = (wh.k) wh.m.t();
        synchronized (kVar) {
            kVar.f527352d = new wh.h(java.lang.Integer.valueOf(intValue), 5000);
        }
        synchronized ("Matrix.battery.DeviceStatusMonitorFeature") {
            if (d2Var.f476894c != java.util.Collections.EMPTY_LIST) {
                switch (intValue) {
                    case 1:
                        str = "charging";
                        break;
                    case 2:
                        str = "non_charge";
                        break;
                    case 3:
                        str = "screen_off";
                        break;
                    case 4:
                        str = "standby_on";
                        break;
                    case 5:
                        str = "screen_on";
                        break;
                    case 6:
                        str = "standby_off";
                        break;
                    case 7:
                        str = "doze_on";
                        break;
                    case 8:
                        str = "doze_off";
                        break;
                    default:
                        str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
                        break;
                }
                oj.j.c("Matrix.battery.LifeCycle", "onStat >> ".concat(str), new java.lang.Object[0]);
                d2Var.f476894c.add(0, new wh.f2(java.lang.String.valueOf(intValue)));
                android.os.Handler handler = d2Var.f476827a.f444870f;
                java.lang.Runnable runnable = d2Var.f476895d;
                handler.removeCallbacks(runnable);
                d2Var.f476827a.f444870f.postDelayed(runnable, 1000L);
            }
        }
    }
}
