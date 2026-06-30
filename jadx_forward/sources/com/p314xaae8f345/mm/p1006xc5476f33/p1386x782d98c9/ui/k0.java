package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f181069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f181070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181071f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f181072g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13460xef0a2250 f181073h;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13460xef0a2250 activityC13460xef0a2250, int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f181073h = activityC13460xef0a2250;
        this.f181069d = i17;
        this.f181070e = i18;
        this.f181071f = str;
        this.f181072g = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13460xef0a2250.f180728y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13460xef0a2250 activityC13460xef0a2250 = this.f181073h;
        activityC13460xef0a2250.getClass();
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f181072g;
        boolean z17 = m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m2;
        int i18 = this.f181069d;
        int i19 = this.f181070e;
        java.lang.String str = this.f181071f;
        int i27 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0 t0Var = null;
        if (z17) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m2) m1Var).f180527e;
            if (oVar != null && (fVar = oVar.f152243a.f152217a) != null) {
            }
            r45.zv5 zv5Var = (r45.zv5) oVar.f152244b.f152233a;
            if (i18 != 0 || i19 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchBLEHardDevice onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                return;
            }
            r45.ov3 ov3Var = zv5Var.f473944e;
            if (ov3Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceBindDeviceUI", "HardDeviceAttr is null");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o0 o0Var = activityC13460xef0a2250.f180730e;
            java.lang.String str2 = ov3Var.f464073f;
            o0Var.getClass();
            if (str2 != null && str2.length() != 0) {
                while (true) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) o0Var.f181128d;
                    if (i27 >= arrayList2.size()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0 t0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0) arrayList2.get(i27);
                    if (!o0Var.d(t0Var2.a()) && str2.equalsIgnoreCase(t0Var2.a())) {
                        t0Var = t0Var2;
                        break;
                    }
                    i27++;
                }
            }
            if (t0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceBindDeviceUI", "DiscoverDevice is null");
                return;
            }
            if (t0Var.f181201e != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceBindDeviceUI", "DiscoverDevice.mHardDevice is not null");
                return;
            }
            t0Var.f181202f = zv5Var.f473944e;
            t0Var.f181201e = zv5Var.f473943d;
            t0Var.f181203g = zv5Var.f473945f;
            t0Var.f181204h = zv5Var.f473946g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o0 o0Var2 = activityC13460xef0a2250.f180730e;
            o0Var2.getClass();
            if (o0Var2.a(t0Var.b()) >= 0) {
                t0Var.f181197a = o0Var2.c(t0Var);
            }
            activityC13460xef0a2250.f180730e.notifyDataSetChanged();
            r45.nv3 nv3Var = zv5Var.f473943d;
            java.lang.String str3 = nv3Var.f463224d;
            java.lang.String str4 = nv3Var.f463225e;
            r45.ov3 ov3Var2 = zv5Var.f473944e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchBLEHardDevice onSceneEnd, deviceType(%s) deviceId(%s), title(%s), mac(%s), isEnterMainDevice(%d).", str3, str4, ov3Var2.f464083s, ov3Var2.f464073f, java.lang.Integer.valueOf(ov3Var2.f464087w));
            return;
        }
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o2) {
            if (i18 != 0 || i19 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchWiFiHardDevice onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                return;
            }
            r45.ux5 ux5Var = (r45.ux5) ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o2) m1Var).f180572e.f152244b.f152233a;
            r45.nv3 nv3Var2 = ux5Var.f469252e;
            if (nv3Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceBindDeviceUI", "HardDevice info is null");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o0 o0Var3 = activityC13460xef0a2250.f180730e;
            java.lang.String str5 = nv3Var2.f463224d;
            java.lang.String str6 = nv3Var2.f463225e;
            o0Var3.getClass();
            if (str5 != null && str5.length() != 0 && str6 != null && str6.length() != 0) {
                while (true) {
                    arrayList = (java.util.ArrayList) o0Var3.f181128d;
                    if (i27 >= arrayList.size()) {
                        i27 = -1;
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0 t0Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0) arrayList.get(i27);
                    r45.nv3 nv3Var3 = t0Var3.f181201e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p0.CONNECT_PROTO_TYPE_WIFI;
                    java.lang.String str7 = nv3Var3 != null ? nv3Var3.f463224d : t0Var3.f181198b == p0Var ? t0Var3.f181200d.f181169a : null;
                    java.lang.String str8 = nv3Var3 != null ? nv3Var3.f463225e : t0Var3.f181198b == p0Var ? t0Var3.f181200d.f181170b : null;
                    if (!o0Var3.d(str7) && !o0Var3.d(str8) && str5.compareTo(str7) == 0 && str6.compareTo(str8) == 0) {
                        break;
                    } else {
                        i27++;
                    }
                }
                if (i27 >= 0) {
                    t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0) arrayList.get(i27);
                }
            }
            if (t0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceBindDeviceUI", "DiscoverDevice is null");
                return;
            }
            if (t0Var.f181201e != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceBindDeviceUI", "DiscoverDevice.mHardDevice is not null");
                return;
            }
            t0Var.f181202f = ux5Var.f469253f;
            t0Var.f181201e = ux5Var.f469252e;
            t0Var.f181203g = ux5Var.f469254g;
            t0Var.f181204h = ux5Var.f469251d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o0 o0Var4 = activityC13460xef0a2250.f180730e;
            o0Var4.getClass();
            if (o0Var4.a(t0Var.b()) >= 0) {
                t0Var.f181197a = o0Var4.c(t0Var);
            }
            activityC13460xef0a2250.f180730e.notifyDataSetChanged();
            r45.nv3 nv3Var4 = ux5Var.f469252e;
            java.lang.String str9 = nv3Var4.f463224d;
            java.lang.String str10 = nv3Var4.f463225e;
            r45.ov3 ov3Var3 = ux5Var.f469253f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchWiFiHardDevice onSceneEnd, deviceType(%s) deviceId(%s), title(%s), isEnterMainDevice(%d).", str9, str10, ov3Var3.f464083s, java.lang.Integer.valueOf(ov3Var3.f464087w));
        }
    }
}
