package b92;

/* loaded from: classes15.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f18410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b92.b2 f18411e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(java.util.List list, b92.b2 b2Var) {
        super(0);
        this.f18410d = list;
        this.f18411e = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        if (!this.f18410d.isEmpty()) {
            this.f18411e.b(this.f18410d);
        }
        b92.b2 b2Var = this.f18411e;
        if ((b2Var.f18399w > 0 && b2Var.f18398v > 0 && b2Var.f18400x > 0) && (i17 = b2Var.f18387k) == b2Var.f18388l) {
            int i18 = b2Var.f18398v;
            b2Var.f18399w = (int) ((i18 * 60.0f) / i17);
            if (i18 > 60) {
                i18 = 60;
            }
            b2Var.f18400x = i18;
            com.tencent.mars.xlog.Log.i("FinderLiveFpsService", "calibrateFps: averageFps=" + b2Var.f18399w + ", limitFps=" + b2Var.f18400x);
        }
        b92.b2 b2Var2 = this.f18411e;
        boolean z17 = b2Var2.f18399w > 0 && b2Var2.f18398v > 0 && b2Var2.f18400x > 0;
        long j17 = b2Var2.f18390n;
        long j18 = b2Var2.f18389m;
        long j19 = j17 > j18 ? j17 - j18 : 0L;
        com.tencent.mars.xlog.Log.i("FinderLiveFpsService", "report32406: isValid=" + z17 + ", stayDuration=" + j19 + ", frameTask=" + this.f18411e);
        if (!z17 || j19 < 1000) {
            com.tencent.mars.xlog.Log.i("FinderLiveFpsService", "report32406: data is invalid");
        } else {
            com.tencent.mm.autogen.mmdata.rpt.LiveFpsMonitorStruct liveFpsMonitorStruct = new com.tencent.mm.autogen.mmdata.rpt.LiveFpsMonitorStruct();
            liveFpsMonitorStruct.f58585d = 1L;
            liveFpsMonitorStruct.f58586e = liveFpsMonitorStruct.b(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f18411e.f18377a, true);
            liveFpsMonitorStruct.f58587f = liveFpsMonitorStruct.b("commentScene", this.f18411e.f18378b, true);
            b92.b2 b2Var3 = this.f18411e;
            liveFpsMonitorStruct.f58588g = b2Var3.f18399w;
            liveFpsMonitorStruct.f58589h = b2Var3.f18400x;
            liveFpsMonitorStruct.f58590i = b2Var3.f18398v;
            liveFpsMonitorStruct.f58591j = liveFpsMonitorStruct.b("feedId", pm0.v.u(b2Var3.f18381e), true);
            liveFpsMonitorStruct.f58592k = liveFpsMonitorStruct.b("liveId", pm0.v.u(this.f18411e.f18382f), true);
            b92.b2 b2Var4 = this.f18411e;
            liveFpsMonitorStruct.f58593l = b2Var4.f18402z;
            liveFpsMonitorStruct.f58594m = b2Var4.f18401y;
            long j27 = b2Var4.f18390n;
            long j28 = b2Var4.f18389m;
            liveFpsMonitorStruct.f58595n = j27 > j28 ? j27 - j28 : 0L;
            liveFpsMonitorStruct.f58596o = b2Var4.f18396t;
            liveFpsMonitorStruct.f58597p = b2Var4.f18397u;
            liveFpsMonitorStruct.f58598q = b2Var4.f18387k;
            liveFpsMonitorStruct.f58599r = b2Var4.f18388l;
            int[] iArr = b2Var4.f18394r;
            liveFpsMonitorStruct.f58601t = iArr[4];
            liveFpsMonitorStruct.f58602u = iArr[3];
            liveFpsMonitorStruct.f58603v = iArr[2];
            liveFpsMonitorStruct.f58604w = iArr[1];
            liveFpsMonitorStruct.f58605x = iArr[0];
            int[] iArr2 = b2Var4.f18395s;
            int i19 = iArr2[1];
            int i27 = iArr2[2];
            int i28 = iArr2[3];
            int i29 = i19 + i27 + i28 + iArr2[4];
            liveFpsMonitorStruct.f58600s = (i29 <= 0 ? 0.0f : (r2 * 80.0f) / i29) + (i29 <= 0 ? 0.0f : (i28 * 60.0f) / i29) + (i29 <= 0 ? 0.0f : (i27 * 40.0f) / i29) + (i29 > 0 ? (i19 * 20.0f) / i29 : 0.0f);
            if (ph.t.f354283k == null) {
                synchronized ("Matrix.battery.LifeCycle") {
                    if (ph.t.f354283k == null) {
                        throw new java.lang.IllegalStateException("Call #init() first!".toString());
                    }
                }
            }
            ph.t tVar = ph.t.f354283k;
            kotlin.jvm.internal.o.d(tVar);
            ph.c c17 = tVar.c();
            liveFpsMonitorStruct.f58606y = c17.b();
            liveFpsMonitorStruct.f58607z = c17.c() ? 1L : 0L;
            c17.f();
            liveFpsMonitorStruct.A = 0L;
            liveFpsMonitorStruct.k();
            java.lang.String n17 = liveFpsMonitorStruct.n();
            kotlin.jvm.internal.o.f(n17, "toShowString(...)");
            com.tencent.mars.xlog.Log.i("FinderLiveFpsService", "report32406: ".concat(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false)));
        }
        return jz5.f0.f302826a;
    }
}
