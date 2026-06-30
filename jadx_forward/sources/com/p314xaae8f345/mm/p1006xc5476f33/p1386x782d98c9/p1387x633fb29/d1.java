package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class d1 extends u32.c1 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f180404g = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f180405d = false;

    /* renamed from: e, reason: collision with root package name */
    public final u32.w f180406e = new u32.w();

    /* renamed from: f, reason: collision with root package name */
    public final u32.f0 f180407f = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.a1(this);

    @Override // u32.d1
    public void bb(long j17, byte[] bArr) {
        java.util.LinkedList linkedList;
        if (bArr == null || bArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("com.tencent.mm.plugin.exdevice.model.d1", "data is null or nil");
            return;
        }
        a42.i.a(bArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0 Di = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di();
        java.lang.String f17 = a42.i.f(j17);
        synchronized (Di.f180545a) {
            linkedList = new java.util.LinkedList(Di.f180545a);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0) it.next()).o1(f17, bArr, true);
        }
        linkedList.clear();
        java.util.Iterator it6 = ((java.util.HashMap) Di.f180546b).values().iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0) it6.next()).o1(f17, bArr, true);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5374x637314fe c5374x637314fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5374x637314fe();
        c5374x637314fe.f135707g.getClass();
        c5374x637314fe.f135707g.getClass();
        c5374x637314fe.b(android.os.Looper.getMainLooper());
    }

    public void e() {
        boolean z17;
        if (this.f180405d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Bi();
            u32.f0 f0Var = this.f180407f;
            if (Bi.f180398a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "exdevice process is dead, just leave");
            } else if (u32.h1.c().f180539a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
            } else {
                u32.k1 k1Var = (u32.k1) u32.h1.c().f180539a;
                k1Var.getClass();
                try {
                    z17 = k1Var.f505851a.rc(0, f0Var);
                } catch (android.os.RemoteException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
                    z17 = false;
                }
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "stopScan failed!!!");
                }
            }
            this.f180405d = false;
        }
    }
}
