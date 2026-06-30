package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class w2 extends u32.f0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.w2 f180619n;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.v2 f180623d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.String f180624e;

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f180618m = {-2, 1, 1};

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.Object f180620o = new java.lang.Object();

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.LinkedList f180621p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.HashMap f180622q = new java.util.HashMap(32);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f180626g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f180627h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f180628i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.u2(this), true);

    /* renamed from: f, reason: collision with root package name */
    public boolean f180625f = false;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.w2 e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.w2 w2Var = f180619n;
        if (w2Var != null) {
            return w2Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.w2 w2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.w2();
        f180619n = w2Var2;
        return w2Var2;
    }

    @Override // u32.g0
    public void N6(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19, byte[] bArr) {
        int i27;
        if (this.f180626g.containsKey(str2)) {
            return;
        }
        if (str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.ScanDeviceLogic", "deviceMac is null");
            return;
        }
        java.lang.String replaceAll = str2.replaceAll(":", "");
        byte[] bArr2 = f180618m;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr2) && 3 <= bArr.length) {
            i27 = 0;
            while (i27 < bArr.length) {
                if (a42.i.c(bArr, i27, bArr2)) {
                    break;
                } else {
                    i27++;
                }
            }
        }
        i27 = -1;
        if (i27 != -1) {
            int i28 = i27 + 9;
            if (i28 <= bArr.length) {
                byte[] bArr3 = new byte[i28];
                java.lang.System.arraycopy(bArr, 0, bArr3, 0, i28);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, scanFound mac:%s, realAd:%s", replaceAll, a42.i.a(bArr3));
                this.f180626g.put(replaceAll, bArr3);
            } else {
                this.f180626g.put(replaceAll, null);
            }
        } else {
            this.f180626g.put(replaceAll, null);
        }
        java.lang.String str4 = this.f180624e + "_" + str2;
        java.util.HashMap hashMap = f180622q;
        if (hashMap.containsKey(str4)) {
            g((r45.tg) hashMap.get(str4));
            return;
        }
        synchronized (f180620o) {
            java.util.LinkedList linkedList = f180621p;
            if (linkedList.contains(str4)) {
                return;
            }
            linkedList.add(str4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d2 d2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d2(new java.lang.String[]{str2}, this.f180624e, 3);
            if (gm0.j1.n().f354821b.h(d2Var, 0)) {
                this.f180627h.add(d2Var);
            } else {
                linkedList.remove(str4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "network().getNetSceneQueue().doScene failed!!!");
            }
        }
    }

    public final void g(r45.tg tgVar) {
        if (tgVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "item null..");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tgVar.f467924g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "invalid mac(null or nil)");
            return;
        }
        if (tgVar.f467921d != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "device(%s) is invalid", tgVar.f467924g);
            return;
        }
        r45.nv3 nv3Var = tgVar.f467926i;
        if (nv3Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nv3Var.f463225e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "invalid device id(mac=%s)", tgVar.f467924g);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tgVar.f467926i.f463224d) || !tgVar.f467926i.f463224d.equals(this.f180624e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "device type (%s) is not equal to brand name (%s)", tgVar.f467925h, this.f180624e);
            return;
        }
        byte[] bArr = (byte[]) this.f180626g.get(tgVar.f467924g);
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = tgVar.f467924g;
        r45.nv3 nv3Var2 = tgVar.f467926i;
        objArr[1] = nv3Var2.f463224d;
        objArr[2] = nv3Var2.f463225e;
        objArr[3] = tgVar.f467925h;
        objArr[4] = java.lang.Integer.valueOf(bArr == null ? 0 : bArr.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, BatchSearch find mac=%s, deviceType=%s, deviceId=%s, %s, %s", objArr);
        if (this.f180623d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "mCallback null");
            return;
        }
        byte[] bArr2 = null;
        if (bArr != null) {
            byte[] bArr3 = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < bArr.length - 2) {
                try {
                    int i19 = i17 + 1;
                    int i27 = bArr[i17];
                    if (i27 == 0) {
                        break;
                    }
                    int i28 = i19 + 1;
                    if (bArr[i19] != -1) {
                        i17 = (i27 - 1) + i28;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, Manufacturer Specific Data size = %s", java.lang.Integer.valueOf(i27));
                        int i29 = i27 - 1;
                        byte[] bArr4 = new byte[i29];
                        while (i27 > 1) {
                            if (i18 < 32 && i18 < i29) {
                                bArr4[i18] = bArr[i28];
                                i18++;
                                i28++;
                            }
                            i27--;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, Manufacturer Specific Data %s" + a42.i.a(bArr4));
                        bArr3 = bArr4;
                        i17 = i28;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.ScanDeviceLogic", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "EX in parseBroadcastPacket %s", e17.getMessage());
                }
            }
            bArr2 = bArr3;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.f0) this.f180623d).a(tgVar.f467926i.f463225e, bArr2, false);
    }

    public void j(int i17) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "stopScanDevice %s, stopTimer", java.lang.Integer.valueOf(i17));
        this.f180628i.d();
        if (this.f180625f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Bi();
            Bi.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "stopScanLogic, bluetooth version = %d", java.lang.Integer.valueOf(i17));
            if (Bi.f180398a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "exdevice process is dead, just leave");
            } else if (u32.h1.c().f180539a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
            } else {
                u32.n0 n0Var = u32.h1.c().f180539a;
                u32.g0 g0Var = Bi.f180403f;
                u32.k1 k1Var = (u32.k1) n0Var;
                k1Var.getClass();
                try {
                    z17 = k1Var.f505851a.gi(i17, g0Var);
                } catch (android.os.RemoteException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "stopScan failed!!! %s", e17.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
                    z17 = false;
                }
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "stopScan failed!!!");
                }
            }
            this.f180625f = false;
            this.f180624e = null;
            this.f180626g.clear();
            gm0.j1.n().f354821b.q(542, this);
            java.util.Iterator it = this.f180627h.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) it.next();
                if (m1Var != null) {
                    gm0.j1.n().f354821b.d(m1Var);
                }
            }
            this.f180627h.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.v2 v2Var = this.f180623d;
            if (v2Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.f0) v2Var).a(null, null, true);
            }
            this.f180623d = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "stopScanDevice has been stoped");
        }
        synchronized (f180620o) {
            f180621p.clear();
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = m1Var == null ? "" : java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0());
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        objArr[3] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "onSceneEnd, %s, errType=%d, errCode=%d, errMsg=%s", objArr);
        this.f180627h.remove(m1Var);
        if (i17 != 0 || i18 != 0 || m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "do scene failed!!!");
            return;
        }
        if (542 == m1Var.mo808xfb85f7b0()) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d2) m1Var).f180408d;
            java.util.Iterator it = ((oVar == null || (fVar = oVar.f152244b.f152233a) == null) ? null : (r45.sg) fVar).f467222d.iterator();
            while (it.hasNext()) {
                r45.tg tgVar = (r45.tg) it.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tgVar.f467924g)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "invalid mac(null or nil)");
                } else {
                    java.lang.String str2 = this.f180624e + "_" + tgVar.f467924g;
                    synchronized (f180620o) {
                        java.util.LinkedList linkedList = f180621p;
                        if (linkedList.contains(str2)) {
                            linkedList.remove(str2);
                        }
                    }
                    java.util.HashMap hashMap = f180622q;
                    if (!hashMap.containsKey(str2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, put into cache, %s", str2);
                        hashMap.put(str2, tgVar);
                    }
                    g(tgVar);
                }
            }
        }
    }
}
