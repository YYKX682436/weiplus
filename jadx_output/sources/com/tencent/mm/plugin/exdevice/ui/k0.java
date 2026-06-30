package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f99536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f99537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99538f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f99539g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI f99540h;

    public k0(com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI exdeviceBindDeviceUI, int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        this.f99540h = exdeviceBindDeviceUI;
        this.f99536d = i17;
        this.f99537e = i18;
        this.f99538f = str;
        this.f99539g = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        com.tencent.mm.protobuf.f fVar;
        int i17 = com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI.f99195y;
        com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI exdeviceBindDeviceUI = this.f99540h;
        exdeviceBindDeviceUI.getClass();
        com.tencent.mm.modelbase.m1 m1Var = this.f99539g;
        boolean z17 = m1Var instanceof com.tencent.mm.plugin.exdevice.model.m2;
        int i18 = this.f99536d;
        int i19 = this.f99537e;
        java.lang.String str = this.f99538f;
        int i27 = 0;
        com.tencent.mm.plugin.exdevice.ui.t0 t0Var = null;
        if (z17) {
            com.tencent.mm.modelbase.o oVar = ((com.tencent.mm.plugin.exdevice.model.m2) m1Var).f98994e;
            if (oVar != null && (fVar = oVar.f70710a.f70684a) != null) {
            }
            r45.zv5 zv5Var = (r45.zv5) oVar.f70711b.f70700a;
            if (i18 != 0 || i19 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchBLEHardDevice onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                return;
            }
            r45.ov3 ov3Var = zv5Var.f392411e;
            if (ov3Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceBindDeviceUI", "HardDeviceAttr is null");
                return;
            }
            com.tencent.mm.plugin.exdevice.ui.o0 o0Var = exdeviceBindDeviceUI.f99197e;
            java.lang.String str2 = ov3Var.f382540f;
            o0Var.getClass();
            if (str2 != null && str2.length() != 0) {
                while (true) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) o0Var.f99595d;
                    if (i27 >= arrayList2.size()) {
                        break;
                    }
                    com.tencent.mm.plugin.exdevice.ui.t0 t0Var2 = (com.tencent.mm.plugin.exdevice.ui.t0) arrayList2.get(i27);
                    if (!o0Var.d(t0Var2.a()) && str2.equalsIgnoreCase(t0Var2.a())) {
                        t0Var = t0Var2;
                        break;
                    }
                    i27++;
                }
            }
            if (t0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceBindDeviceUI", "DiscoverDevice is null");
                return;
            }
            if (t0Var.f99668e != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceBindDeviceUI", "DiscoverDevice.mHardDevice is not null");
                return;
            }
            t0Var.f99669f = zv5Var.f392411e;
            t0Var.f99668e = zv5Var.f392410d;
            t0Var.f99670g = zv5Var.f392412f;
            t0Var.f99671h = zv5Var.f392413g;
            com.tencent.mm.plugin.exdevice.ui.o0 o0Var2 = exdeviceBindDeviceUI.f99197e;
            o0Var2.getClass();
            if (o0Var2.a(t0Var.b()) >= 0) {
                t0Var.f99664a = o0Var2.c(t0Var);
            }
            exdeviceBindDeviceUI.f99197e.notifyDataSetChanged();
            r45.nv3 nv3Var = zv5Var.f392410d;
            java.lang.String str3 = nv3Var.f381691d;
            java.lang.String str4 = nv3Var.f381692e;
            r45.ov3 ov3Var2 = zv5Var.f392411e;
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchBLEHardDevice onSceneEnd, deviceType(%s) deviceId(%s), title(%s), mac(%s), isEnterMainDevice(%d).", str3, str4, ov3Var2.f382550s, ov3Var2.f382540f, java.lang.Integer.valueOf(ov3Var2.f382554w));
            return;
        }
        if (m1Var instanceof com.tencent.mm.plugin.exdevice.model.o2) {
            if (i18 != 0 || i19 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchWiFiHardDevice onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                return;
            }
            r45.ux5 ux5Var = (r45.ux5) ((com.tencent.mm.plugin.exdevice.model.o2) m1Var).f99039e.f70711b.f70700a;
            r45.nv3 nv3Var2 = ux5Var.f387719e;
            if (nv3Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceBindDeviceUI", "HardDevice info is null");
                return;
            }
            com.tencent.mm.plugin.exdevice.ui.o0 o0Var3 = exdeviceBindDeviceUI.f99197e;
            java.lang.String str5 = nv3Var2.f381691d;
            java.lang.String str6 = nv3Var2.f381692e;
            o0Var3.getClass();
            if (str5 != null && str5.length() != 0 && str6 != null && str6.length() != 0) {
                while (true) {
                    arrayList = (java.util.ArrayList) o0Var3.f99595d;
                    if (i27 >= arrayList.size()) {
                        i27 = -1;
                        break;
                    }
                    com.tencent.mm.plugin.exdevice.ui.t0 t0Var3 = (com.tencent.mm.plugin.exdevice.ui.t0) arrayList.get(i27);
                    r45.nv3 nv3Var3 = t0Var3.f99668e;
                    com.tencent.mm.plugin.exdevice.ui.p0 p0Var = com.tencent.mm.plugin.exdevice.ui.p0.CONNECT_PROTO_TYPE_WIFI;
                    java.lang.String str7 = nv3Var3 != null ? nv3Var3.f381691d : t0Var3.f99665b == p0Var ? t0Var3.f99667d.f99636a : null;
                    java.lang.String str8 = nv3Var3 != null ? nv3Var3.f381692e : t0Var3.f99665b == p0Var ? t0Var3.f99667d.f99637b : null;
                    if (!o0Var3.d(str7) && !o0Var3.d(str8) && str5.compareTo(str7) == 0 && str6.compareTo(str8) == 0) {
                        break;
                    } else {
                        i27++;
                    }
                }
                if (i27 >= 0) {
                    t0Var = (com.tencent.mm.plugin.exdevice.ui.t0) arrayList.get(i27);
                }
            }
            if (t0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceBindDeviceUI", "DiscoverDevice is null");
                return;
            }
            if (t0Var.f99668e != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceBindDeviceUI", "DiscoverDevice.mHardDevice is not null");
                return;
            }
            t0Var.f99669f = ux5Var.f387720f;
            t0Var.f99668e = ux5Var.f387719e;
            t0Var.f99670g = ux5Var.f387721g;
            t0Var.f99671h = ux5Var.f387718d;
            com.tencent.mm.plugin.exdevice.ui.o0 o0Var4 = exdeviceBindDeviceUI.f99197e;
            o0Var4.getClass();
            if (o0Var4.a(t0Var.b()) >= 0) {
                t0Var.f99664a = o0Var4.c(t0Var);
            }
            exdeviceBindDeviceUI.f99197e.notifyDataSetChanged();
            r45.nv3 nv3Var4 = ux5Var.f387719e;
            java.lang.String str9 = nv3Var4.f381691d;
            java.lang.String str10 = nv3Var4.f381692e;
            r45.ov3 ov3Var3 = ux5Var.f387720f;
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchWiFiHardDevice onSceneEnd, deviceType(%s) deviceId(%s), title(%s), isEnterMainDevice(%d).", str9, str10, ov3Var3.f382550s, java.lang.Integer.valueOf(ov3Var3.f382554w));
        }
    }
}
