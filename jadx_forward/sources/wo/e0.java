package wo;

/* loaded from: classes12.dex */
public class e0 extends wo.r0 {
    @Override // wo.r0
    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(wo.w0.c());
        java.util.Random random = new java.util.Random();
        random.setSeed(java.lang.System.currentTimeMillis());
        sb6.append(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f);
        for (int i17 = 0; i17 < 15; i17++) {
            sb6.append((char) (random.nextInt(25) + 65));
        }
        java.lang.String a17 = wo.w0.f529377f.a();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (a17 == null) {
            a17 = "";
        }
        sb6.append(a17);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceInfo", "[+] new deviceid, dev:%s", sb7);
        return p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f + kk.k.g(sb7.getBytes()).substring(0, 15);
    }
}
