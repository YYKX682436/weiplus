package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class d1 extends u32.c1 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f98871g = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f98872d = false;

    /* renamed from: e, reason: collision with root package name */
    public final u32.w f98873e = new u32.w();

    /* renamed from: f, reason: collision with root package name */
    public final u32.f0 f98874f = new com.tencent.mm.plugin.exdevice.model.a1(this);

    @Override // u32.d1
    public void bb(long j17, byte[] bArr) {
        java.util.LinkedList linkedList;
        if (bArr == null || bArr.length <= 0) {
            com.tencent.mars.xlog.Log.e("com.tencent.mm.plugin.exdevice.model.d1", "data is null or nil");
            return;
        }
        a42.i.a(bArr);
        com.tencent.mm.plugin.exdevice.model.o0 Di = com.tencent.mm.plugin.exdevice.model.l3.Di();
        java.lang.String f17 = a42.i.f(j17);
        synchronized (Di.f99012a) {
            linkedList = new java.util.LinkedList(Di.f99012a);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.exdevice.model.m0) it.next()).o1(f17, bArr, true);
        }
        linkedList.clear();
        java.util.Iterator it6 = ((java.util.HashMap) Di.f99013b).values().iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.plugin.exdevice.model.m0) it6.next()).o1(f17, bArr, true);
        }
        com.tencent.mm.autogen.events.ExDeviceSimpleBTOnRecvDataFromDeviceEvent exDeviceSimpleBTOnRecvDataFromDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceSimpleBTOnRecvDataFromDeviceEvent();
        exDeviceSimpleBTOnRecvDataFromDeviceEvent.f54174g.getClass();
        exDeviceSimpleBTOnRecvDataFromDeviceEvent.f54174g.getClass();
        exDeviceSimpleBTOnRecvDataFromDeviceEvent.b(android.os.Looper.getMainLooper());
    }

    public void e() {
        boolean z17;
        if (this.f98872d) {
            com.tencent.mm.plugin.exdevice.model.d0 Bi = com.tencent.mm.plugin.exdevice.model.l3.Bi();
            u32.f0 f0Var = this.f98874f;
            if (Bi.f98865a == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "exdevice process is dead, just leave");
            } else if (u32.h1.c().f99006a == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
            } else {
                u32.k1 k1Var = (u32.k1) u32.h1.c().f99006a;
                k1Var.getClass();
                try {
                    z17 = k1Var.f424318a.rc(0, f0Var);
                } catch (android.os.RemoteException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
                    z17 = false;
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "stopScan failed!!!");
                }
            }
            this.f98872d = false;
        }
    }
}
