package rh;

/* loaded from: classes12.dex */
public class p implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.w f477021d;

    public p(rh.w wVar) {
        this.f477021d = wVar;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void off() {
        oj.j.c("Matrix.battery.AppStatMonitorFeature", "floatView >> off", new java.lang.Object[0]);
        rh.w wVar = this.f477021d;
        qh.f0 f0Var = wVar.f476827a;
        boolean z17 = f0Var.f444876o;
        int e17 = wh.m.e(f0Var.d(), z17);
        if (e17 != 1 && e17 != 3 && e17 != 4) {
            oj.j.c("Matrix.battery.AppStatMonitorFeature", "statAppStat: 2", new java.lang.Object[0]);
            wVar.m(2);
            return;
        }
        oj.j.c("Matrix.battery.AppStatMonitorFeature", "skip statAppStat, fg = " + z17 + ", currAppStat = " + e17, new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void on() {
        oj.j.c("Matrix.battery.AppStatMonitorFeature", "floatView >> on", new java.lang.Object[0]);
        rh.w wVar = this.f477021d;
        qh.f0 f0Var = wVar.f476827a;
        boolean z17 = f0Var.f444876o;
        int e17 = wh.m.e(f0Var.d(), z17);
        if (e17 != 1 && e17 != 3) {
            oj.j.c("Matrix.battery.AppStatMonitorFeature", "statAppStat: 4", new java.lang.Object[0]);
            wVar.m(4);
            return;
        }
        oj.j.c("Matrix.battery.AppStatMonitorFeature", "skip statAppStat, fg = " + z17 + ", currAppStat = " + e17, new java.lang.Object[0]);
    }
}
