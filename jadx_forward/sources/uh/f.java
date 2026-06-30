package uh;

/* loaded from: classes12.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public long f509203a;

    /* renamed from: b, reason: collision with root package name */
    public uh.g f509204b;

    /* renamed from: c, reason: collision with root package name */
    public final uh.g f509205c;

    public f(uh.g gVar) {
        long j17 = gVar.f476896a;
        this.f509204b = gVar;
        uh.g gVar2 = new uh.g();
        this.f509205c = gVar2;
        gVar2.f509245u0 = new java.util.HashMap();
        gVar2.f509247v0 = new java.util.HashMap();
        gVar2.f509249w0 = new java.util.HashMap();
        gVar2.f509251x0 = new java.util.HashMap();
        gVar2.f509253y0 = new java.util.HashMap();
        gVar2.f509255z0 = new java.util.HashMap();
    }

    public static void a(java.lang.String str, long j17, long j18) {
        if (j17 <= j18) {
            return;
        }
        throw new java.lang.IllegalStateException("negative stats: " + str);
    }

    public static boolean b(uh.g gVar, uh.g gVar2) {
        try {
            a("cpuPowerMams", ((java.lang.Long) gVar.f509244u.f477085a).longValue(), ((java.lang.Long) gVar2.f509244u.f477085a).longValue());
            a("cpuUsrTimeMs", ((java.lang.Long) gVar.f509246v.f477085a).longValue(), ((java.lang.Long) gVar2.f509246v.f477085a).longValue());
            a("cpuSysTimeMs", ((java.lang.Long) gVar.f509248w.f477085a).longValue(), ((java.lang.Long) gVar2.f509248w.f477085a).longValue());
            a("realTimeMs", ((java.lang.Long) gVar.f509250x.f477085a).longValue(), ((java.lang.Long) gVar2.f509250x.f477085a).longValue());
            a("upTimeMs", ((java.lang.Long) gVar.f509252y.f477085a).longValue(), ((java.lang.Long) gVar2.f509252y.f477085a).longValue());
            a("offRealTimeMs", ((java.lang.Long) gVar.f509254z.f477085a).longValue(), ((java.lang.Long) gVar2.f509254z.f477085a).longValue());
            a("offUpTimeMs", ((java.lang.Long) gVar.A.f477085a).longValue(), ((java.lang.Long) gVar2.A.f477085a).longValue());
            a("mobilePowerMams", ((java.lang.Long) gVar.B.f477085a).longValue(), ((java.lang.Long) gVar2.B.f477085a).longValue());
            a("mobileRadioActiveMs", ((java.lang.Long) gVar.C.f477085a).longValue(), ((java.lang.Long) gVar2.C.f477085a).longValue());
            a("mobileIdleMs", ((java.lang.Long) gVar.D.f477085a).longValue(), ((java.lang.Long) gVar2.D.f477085a).longValue());
            a("mobileRxMs", ((java.lang.Long) gVar.E.f477085a).longValue(), ((java.lang.Long) gVar2.E.f477085a).longValue());
            a("mobileTxMs", ((java.lang.Long) gVar.F.f477085a).longValue(), ((java.lang.Long) gVar2.F.f477085a).longValue());
            a("mobileRxBytes", ((java.lang.Long) gVar.G.f477085a).longValue(), ((java.lang.Long) gVar2.G.f477085a).longValue());
            a("mobileTxBytes", ((java.lang.Long) gVar.H.f477085a).longValue(), ((java.lang.Long) gVar2.H.f477085a).longValue());
            a("mobileRxPackets", ((java.lang.Long) gVar.I.f477085a).longValue(), ((java.lang.Long) gVar2.I.f477085a).longValue());
            a("mobileTxPackets", ((java.lang.Long) gVar.f509206J.f477085a).longValue(), ((java.lang.Long) gVar2.f509206J.f477085a).longValue());
            a("wifiPowerMams", ((java.lang.Long) gVar.K.f477085a).longValue(), ((java.lang.Long) gVar2.K.f477085a).longValue());
            a("wifiIdleMs", ((java.lang.Long) gVar.L.f477085a).longValue(), ((java.lang.Long) gVar2.L.f477085a).longValue());
            a("wifiRxMs", ((java.lang.Long) gVar.M.f477085a).longValue(), ((java.lang.Long) gVar2.M.f477085a).longValue());
            a("wifiTxMs", ((java.lang.Long) gVar.N.f477085a).longValue(), ((java.lang.Long) gVar2.N.f477085a).longValue());
            a("wifiRunningMs", ((java.lang.Long) gVar.O.f477085a).longValue(), ((java.lang.Long) gVar2.O.f477085a).longValue());
            a("wifiLockMs", ((java.lang.Long) gVar.P.f477085a).longValue(), ((java.lang.Long) gVar2.P.f477085a).longValue());
            a("wifiScanMs", ((java.lang.Long) gVar.Q.f477085a).longValue(), ((java.lang.Long) gVar2.Q.f477085a).longValue());
            a("wifiMulticastMs", ((java.lang.Long) gVar.R.f477085a).longValue(), ((java.lang.Long) gVar2.R.f477085a).longValue());
            a("wifiRxBytes", ((java.lang.Long) gVar.S.f477085a).longValue(), ((java.lang.Long) gVar2.S.f477085a).longValue());
            a("wifiTxBytes", ((java.lang.Long) gVar.T.f477085a).longValue(), ((java.lang.Long) gVar2.T.f477085a).longValue());
            a("wifiRxPackets", ((java.lang.Long) gVar.U.f477085a).longValue(), ((java.lang.Long) gVar2.U.f477085a).longValue());
            a("wifiTxPackets", ((java.lang.Long) gVar.V.f477085a).longValue(), ((java.lang.Long) gVar2.V.f477085a).longValue());
            a("blueToothPowerMams", ((java.lang.Long) gVar.W.f477085a).longValue(), ((java.lang.Long) gVar2.W.f477085a).longValue());
            a("blueToothIdleMs", ((java.lang.Long) gVar.X.f477085a).longValue(), ((java.lang.Long) gVar2.X.f477085a).longValue());
            a("blueToothRxMs", ((java.lang.Long) gVar.Y.f477085a).longValue(), ((java.lang.Long) gVar2.Y.f477085a).longValue());
            a("blueToothTxMs", ((java.lang.Long) gVar.Z.f477085a).longValue(), ((java.lang.Long) gVar2.Z.f477085a).longValue());
            a("wakelocksPartialMs", ((java.lang.Long) gVar.f509207a0.f477085a).longValue(), ((java.lang.Long) gVar2.f509207a0.f477085a).longValue());
            a("wakelocksFullMs", ((java.lang.Long) gVar.f509208b0.f477085a).longValue(), ((java.lang.Long) gVar2.f509208b0.f477085a).longValue());
            a("wakelocksWindowMs", ((java.lang.Long) gVar.f509209c0.f477085a).longValue(), ((java.lang.Long) gVar2.f509209c0.f477085a).longValue());
            a("wakelocksDrawMs", ((java.lang.Long) gVar.f509211d0.f477085a).longValue(), ((java.lang.Long) gVar2.f509211d0.f477085a).longValue());
            a("wakelocksPidSum", ((java.lang.Long) gVar.f509213e0.f477085a).longValue(), ((java.lang.Long) gVar2.f509213e0.f477085a).longValue());
            a("gpsMs", ((java.lang.Long) gVar.f509215f0.f477085a).longValue(), ((java.lang.Long) gVar2.f509215f0.f477085a).longValue());
            a("sensorsPowerMams", ((java.lang.Long) gVar.f509217g0.f477085a).longValue(), ((java.lang.Long) gVar2.f509217g0.f477085a).longValue());
            a("cameraMs", ((java.lang.Long) gVar.f509219h0.f477085a).longValue(), ((java.lang.Long) gVar2.f509219h0.f477085a).longValue());
            a("flashLightMs", ((java.lang.Long) gVar.f509221i0.f477085a).longValue(), ((java.lang.Long) gVar2.f509221i0.f477085a).longValue());
            a("audioMs", ((java.lang.Long) gVar.f509223j0.f477085a).longValue(), ((java.lang.Long) gVar2.f509223j0.f477085a).longValue());
            a("videoMs", ((java.lang.Long) gVar.f509225k0.f477085a).longValue(), ((java.lang.Long) gVar2.f509225k0.f477085a).longValue());
            a("jobsMs", ((java.lang.Long) gVar.f509227l0.f477085a).longValue(), ((java.lang.Long) gVar2.f509227l0.f477085a).longValue());
            a("syncMs", ((java.lang.Long) gVar.f509229m0.f477085a).longValue(), ((java.lang.Long) gVar2.f509229m0.f477085a).longValue());
            return true;
        } catch (java.lang.Exception e17) {
            oj.j.f("Matrix.battery.HealthStats", "skip, " + e17.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }
}
