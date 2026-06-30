package u32;

/* loaded from: classes13.dex */
public class p implements kq1.o {

    /* renamed from: f, reason: collision with root package name */
    public static u32.p f505872f;

    /* renamed from: a, reason: collision with root package name */
    public kq1.n f505873a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Vector f505874b = new java.util.Vector();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f505875c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f505876d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f505877e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(u32.i1.a().f505843b.mo50284xdd3e8650());

    public p() {
        this.f505873a = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "now thread id : %d, main thread is : %d", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Long.valueOf(android.os.Looper.getMainLooper().getThread().getId()));
        this.f505873a = new kq1.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this, u32.i1.a().f505843b);
    }

    public static boolean a(u32.p pVar, int i17, u32.a1 a1Var, int[] iArr) {
        if (a1Var == null) {
            pVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "Error parameter: null == aCallback");
            throw new java.lang.IllegalArgumentException("scanImp: null == aCallback");
        }
        if (iArr == null ? pVar.f505873a.c(i17, new int[0]) : pVar.f505873a.c(i17, iArr)) {
            pVar.f505874b.add(a1Var);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "mBTSDKMrg.scan failed!!!");
        a1Var.a(-1, "scanImp: mBTSDKMrg.scan failed!!!");
        return false;
    }

    public static u32.p b() {
        u32.p pVar = f505872f;
        if (pVar != null) {
            return pVar;
        }
        u32.p pVar2 = new u32.p();
        f505872f = pVar2;
        return pVar2;
    }

    public void c(long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onConnected--- sessionId = " + j17 + "Connected = " + z17);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55005xfc240856(j17);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55007x6b28fb86(j17);
        }
    }

    public void d(long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onSend--- sessionId = " + j17 + "success = " + z17);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55013xbc15d366(j17);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55009xad874415(j17, 0);
        }
    }
}
