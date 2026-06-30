package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class w2 extends u32.f0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static com.tencent.mm.plugin.exdevice.model.w2 f99086n;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.model.v2 f99090d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.String f99091e;

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f99085m = {-2, 1, 1};

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.Object f99087o = new java.lang.Object();

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.LinkedList f99088p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.HashMap f99089q = new java.util.HashMap(32);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f99093g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f99094h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f99095i = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.exdevice.model.u2(this), true);

    /* renamed from: f, reason: collision with root package name */
    public boolean f99092f = false;

    public static com.tencent.mm.plugin.exdevice.model.w2 e() {
        com.tencent.mm.plugin.exdevice.model.w2 w2Var = f99086n;
        if (w2Var != null) {
            return w2Var;
        }
        com.tencent.mm.plugin.exdevice.model.w2 w2Var2 = new com.tencent.mm.plugin.exdevice.model.w2();
        f99086n = w2Var2;
        return w2Var2;
    }

    @Override // u32.g0
    public void N6(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19, byte[] bArr) {
        int i27;
        if (this.f99093g.containsKey(str2)) {
            return;
        }
        if (str2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.ScanDeviceLogic", "deviceMac is null");
            return;
        }
        java.lang.String replaceAll = str2.replaceAll(":", "");
        byte[] bArr2 = f99085m;
        if (!com.tencent.mm.sdk.platformtools.t8.M0(bArr) && !com.tencent.mm.sdk.platformtools.t8.M0(bArr2) && 3 <= bArr.length) {
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
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, scanFound mac:%s, realAd:%s", replaceAll, a42.i.a(bArr3));
                this.f99093g.put(replaceAll, bArr3);
            } else {
                this.f99093g.put(replaceAll, null);
            }
        } else {
            this.f99093g.put(replaceAll, null);
        }
        java.lang.String str4 = this.f99091e + "_" + str2;
        java.util.HashMap hashMap = f99089q;
        if (hashMap.containsKey(str4)) {
            g((r45.tg) hashMap.get(str4));
            return;
        }
        synchronized (f99087o) {
            java.util.LinkedList linkedList = f99088p;
            if (linkedList.contains(str4)) {
                return;
            }
            linkedList.add(str4);
            com.tencent.mm.plugin.exdevice.model.d2 d2Var = new com.tencent.mm.plugin.exdevice.model.d2(new java.lang.String[]{str2}, this.f99091e, 3);
            if (gm0.j1.n().f273288b.h(d2Var, 0)) {
                this.f99094h.add(d2Var);
            } else {
                linkedList.remove(str4);
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "network().getNetSceneQueue().doScene failed!!!");
            }
        }
    }

    public final void g(r45.tg tgVar) {
        if (tgVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "item null..");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(tgVar.f386391g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "invalid mac(null or nil)");
            return;
        }
        if (tgVar.f386388d != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "device(%s) is invalid", tgVar.f386391g);
            return;
        }
        r45.nv3 nv3Var = tgVar.f386393i;
        if (nv3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(nv3Var.f381692e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "invalid device id(mac=%s)", tgVar.f386391g);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(tgVar.f386393i.f381691d) || !tgVar.f386393i.f381691d.equals(this.f99091e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "device type (%s) is not equal to brand name (%s)", tgVar.f386392h, this.f99091e);
            return;
        }
        byte[] bArr = (byte[]) this.f99093g.get(tgVar.f386391g);
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = tgVar.f386391g;
        r45.nv3 nv3Var2 = tgVar.f386393i;
        objArr[1] = nv3Var2.f381691d;
        objArr[2] = nv3Var2.f381692e;
        objArr[3] = tgVar.f386392h;
        objArr[4] = java.lang.Integer.valueOf(bArr == null ? 0 : bArr.length);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, BatchSearch find mac=%s, deviceType=%s, deviceId=%s, %s, %s", objArr);
        if (this.f99090d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "mCallback null");
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
                        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, Manufacturer Specific Data size = %s", java.lang.Integer.valueOf(i27));
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
                        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, Manufacturer Specific Data %s" + a42.i.a(bArr4));
                        bArr3 = bArr4;
                        i17 = i28;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ScanDeviceLogic", e17, "", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "EX in parseBroadcastPacket %s", e17.getMessage());
                }
            }
            bArr2 = bArr3;
        }
        ((com.tencent.mm.plugin.exdevice.model.f0) this.f99090d).a(tgVar.f386393i.f381692e, bArr2, false);
    }

    public void j(int i17) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "stopScanDevice %s, stopTimer", java.lang.Integer.valueOf(i17));
        this.f99095i.d();
        if (this.f99092f) {
            com.tencent.mm.plugin.exdevice.model.d0 Bi = com.tencent.mm.plugin.exdevice.model.l3.Bi();
            Bi.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "stopScanLogic, bluetooth version = %d", java.lang.Integer.valueOf(i17));
            if (Bi.f98865a == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "exdevice process is dead, just leave");
            } else if (u32.h1.c().f99006a == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
            } else {
                u32.n0 n0Var = u32.h1.c().f99006a;
                u32.g0 g0Var = Bi.f98870f;
                u32.k1 k1Var = (u32.k1) n0Var;
                k1Var.getClass();
                try {
                    z17 = k1Var.f424318a.gi(i17, g0Var);
                } catch (android.os.RemoteException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "stopScan failed!!! %s", e17.getMessage());
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
                    z17 = false;
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "stopScan failed!!!");
                }
            }
            this.f99092f = false;
            this.f99091e = null;
            this.f99093g.clear();
            gm0.j1.n().f273288b.q(542, this);
            java.util.Iterator it = this.f99094h.iterator();
            while (it.hasNext()) {
                com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) it.next();
                if (m1Var != null) {
                    gm0.j1.n().f273288b.d(m1Var);
                }
            }
            this.f99094h.clear();
            com.tencent.mm.plugin.exdevice.model.v2 v2Var = this.f99090d;
            if (v2Var != null) {
                ((com.tencent.mm.plugin.exdevice.model.f0) v2Var).a(null, null, true);
            }
            this.f99090d = null;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "stopScanDevice has been stoped");
        }
        synchronized (f99087o) {
            f99088p.clear();
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.f fVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = m1Var == null ? "" : java.lang.Integer.valueOf(m1Var.getType());
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        objArr[3] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "onSceneEnd, %s, errType=%d, errCode=%d, errMsg=%s", objArr);
        this.f99094h.remove(m1Var);
        if (i17 != 0 || i18 != 0 || m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "do scene failed!!!");
            return;
        }
        if (542 == m1Var.getType()) {
            com.tencent.mm.modelbase.o oVar = ((com.tencent.mm.plugin.exdevice.model.d2) m1Var).f98875d;
            java.util.Iterator it = ((oVar == null || (fVar = oVar.f70711b.f70700a) == null) ? null : (r45.sg) fVar).f385689d.iterator();
            while (it.hasNext()) {
                r45.tg tgVar = (r45.tg) it.next();
                if (com.tencent.mm.sdk.platformtools.t8.K0(tgVar.f386391g)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ScanDeviceLogic", "invalid mac(null or nil)");
                } else {
                    java.lang.String str2 = this.f99091e + "_" + tgVar.f386391g;
                    synchronized (f99087o) {
                        java.util.LinkedList linkedList = f99088p;
                        if (linkedList.contains(str2)) {
                            linkedList.remove(str2);
                        }
                    }
                    java.util.HashMap hashMap = f99089q;
                    if (!hashMap.containsKey(str2)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, put into cache, %s", str2);
                        hashMap.put(str2, tgVar);
                    }
                    g(tgVar);
                }
            }
        }
    }
}
