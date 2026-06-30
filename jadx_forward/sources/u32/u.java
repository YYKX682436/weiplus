package u32;

/* loaded from: classes13.dex */
public class u extends u32.y0 {

    /* renamed from: d, reason: collision with root package name */
    public static final u32.u f505905d = new u32.u();

    public boolean d(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceIBeaconManager", "ranging, uuid = %s, op = %s", str, java.lang.String.valueOf(z17));
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceIBeaconManager", "uuid is null");
            return false;
        }
        if (u32.h1.c().f180539a != null) {
            return ((u32.k1) u32.h1.c().f180539a).a(str, z17, this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceIBeaconManager", "MMExDeviceCore.getTaskQueue().getDispatcher() is null !!!now retry invoke doTaskAfterServiceStarted!");
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Bi();
        u32.t tVar = new u32.t(this, str, z17);
        u32.r rVar = Bi.f180398a;
        if (rVar == null || !rVar.f505890e) {
            if (Bi.f180398a == null) {
                Bi.f180398a = new u32.r();
            }
            u32.r rVar2 = Bi.f180398a;
            rVar2.f505889d = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.s(Bi, 0, tVar);
            rVar2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        } else {
            u32.r rVar3 = Bi.f180398a;
            if (rVar3.f505890e) {
                tVar.run();
            } else {
                synchronized (rVar3.f505891f) {
                    ((java.util.LinkedList) rVar3.f505891f).add(tVar);
                }
            }
        }
        return false;
    }

    @Override // u32.z0
    public void di(double d17, int i17, int i18, byte[] bArr, double d18, int i19, java.lang.String str) {
        a42.i.a(bArr);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5351xf5159547 c5351xf5159547 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5351xf5159547();
        java.lang.String a17 = a42.i.a(bArr);
        if (a17.length() >= 32) {
            a17 = a17.substring(0, 8) + "-" + a17.substring(8, 12) + "-" + a17.substring(12, 16) + "-" + a17.substring(16, 20) + "-" + a17.substring(20);
        }
        am.e6 e6Var = c5351xf5159547.f135677g;
        e6Var.f88070a = a17;
        e6Var.f88073d = d17;
        e6Var.f88071b = i17;
        e6Var.f88072c = i18;
        e6Var.getClass();
        e6Var.getClass();
        e6Var.getClass();
        c5351xf5159547.e();
    }
}
