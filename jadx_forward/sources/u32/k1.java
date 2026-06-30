package u32;

/* loaded from: classes13.dex */
public class k1 implements u32.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final u32.a0 f505851a;

    public k1(u32.a0 a0Var) {
        this.f505851a = a0Var;
    }

    public boolean a(java.lang.String str, boolean z17, u32.z0 z0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RDeviceTaskDispatcher", "ranging, uuid = %s, op = %s", str, java.lang.String.valueOf(z17));
        try {
            return this.f505851a.N9(str, z17, z0Var);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "mDispatcher.ranging failed!!!(%s)", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public boolean b(int i17, u32.g0 g0Var) {
        try {
            return this.f505851a.n7(i17, g0Var);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "scan failed!!! %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public void c(long j17, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RDeviceTaskDispatcher", "------setChannelSessionKey------ deviceId = %d", java.lang.Long.valueOf(j17));
        try {
            this.f505851a.ma(j17, bArr);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
        }
    }

    public boolean d(long j17, int i17, u32.j0 j0Var) {
        u32.h1.a().a(j17);
        try {
            return this.f505851a.b7(j17, i17, j0Var);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "startChannel failed!!! %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public boolean e(long j17) {
        u32.h1.a().a(j17);
        try {
            return this.f505851a.vf(j17);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "stopChannel failed!!! %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
            return false;
        }
    }
}
