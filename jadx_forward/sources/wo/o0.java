package wo;

/* loaded from: classes12.dex */
public class o0 extends wo.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final wo.s0 f529302d;

    public o0(wo.q0 q0Var) {
        super(q0Var);
        this.f529302d = new wo.s0(256);
    }

    @Override // wo.r0
    public java.lang.String b() {
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(wo.w0.c());
        wo.s0 s0Var = this.f529302d;
        java.lang.String a17 = s0Var.a(null);
        if (a17 == null) {
            a17 = wo.w0.g(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DeviceInfo", "[!] fail to fetch devId from deprecated cache, using getIMEI instead. value: %s", a17);
            z17 = false;
        } else {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceInfo", "[+] devId: %s, useDeprecatedDevId: %s", a17, java.lang.Boolean.valueOf(z17));
        if (z17) {
            sb6.append(a17);
        } else if (android.text.TextUtils.isEmpty(a17)) {
            java.util.Random random = new java.util.Random();
            random.setSeed(java.lang.System.currentTimeMillis());
            sb6.append(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f);
            for (int i17 = 0; i17 < 15; i17++) {
                sb6.append((char) (random.nextInt(25) + 65));
            }
            if (!s0Var.f529330d.f529307c) {
                wo.x0.a(1064, 28, 1, true);
            }
        } else {
            sb6.append((p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f + a17 + "123456789ABCDEF").substring(0, 15));
        }
        java.lang.String a18 = wo.w0.f529377f.a();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (a18 == null) {
            a18 = "";
        }
        sb6.append(a18);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceInfo", "[+] new mmguid, dev:%s", sb7);
        return p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f + kk.k.g(sb7.getBytes()).substring(0, 15);
    }
}
