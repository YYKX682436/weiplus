package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f92738b;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.u f92737a = new com.tencent.mm.plugin.backup.roambackup.u();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f92739c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f92740d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f92741e = jz5.h.b(com.tencent.mm.plugin.backup.roambackup.s.f92721d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f92742f = jz5.h.b(com.tencent.mm.plugin.backup.roambackup.t.f92735d);

    public final synchronized void a() {
        if (f92738b) {
            return;
        }
        com.tencent.mars.WeChatMars.loadDependentLibrariesAll();
        fp.d0.n("aff_biz");
        fp.d0.n("zidl2");
        fp.d0.n("ilink_network");
        fp.d0.n("ilink2");
        f92738b = true;
        fo1.m.f264882a.f("Backup", "Init RoamBackup.", new java.lang.Object[0]);
    }

    public final com.tencent.wechat.aff.affroam.h1 b(long j17) {
        d();
        java.util.HashMap hashMap = f92739c;
        synchronized (hashMap) {
            com.tencent.wechat.aff.affroam.h1 h1Var = (com.tencent.wechat.aff.affroam.h1) hashMap.get(java.lang.Long.valueOf(j17));
            if (h1Var != null) {
                return h1Var;
            }
            com.tencent.wechat.aff.affroam.h1 h1Var2 = new com.tencent.wechat.aff.affroam.h1();
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.NewRoamFetcher", "[+] Roam backup init, packageId = %s", java.lang.Long.valueOf(j17));
            if (h1Var2.d(j17) != 0) {
                h1Var2 = null;
            } else {
                hashMap.put(java.lang.Long.valueOf(j17), h1Var2);
            }
            return h1Var2;
        }
    }

    public final com.tencent.wechat.aff.affroam.o1 c(java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        d();
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.NewRoamFetcher", "[+] Roam roamDeviceManager init, deviceId=".concat(deviceId));
        com.tencent.wechat.aff.affroam.o1 o1Var = null;
        if (deviceId.length() == 0) {
            return null;
        }
        java.util.HashMap hashMap = f92740d;
        synchronized (hashMap) {
            com.tencent.wechat.aff.affroam.o1 o1Var2 = (com.tencent.wechat.aff.affroam.o1) hashMap.get(deviceId);
            if (o1Var2 != null) {
                return o1Var2;
            }
            com.tencent.wechat.aff.affroam.o1 o1Var3 = new com.tencent.wechat.aff.affroam.o1();
            int d17 = o1Var3.d(deviceId);
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.NewRoamFetcher", "[+] Roam device manager init, deviceId=" + deviceId + ", ret=" + d17);
            if (d17 == 0) {
                hashMap.put(deviceId, o1Var3);
                o1Var3.e("ConnectivityChanged", new com.tencent.mm.plugin.backup.roambackup.o(deviceId));
                o1Var = o1Var3;
            }
            return o1Var;
        }
    }

    public final com.tencent.wechat.aff.affroam.p1 d() {
        java.lang.Object value = ((jz5.n) f92741e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.wechat.aff.affroam.p1) value;
    }

    public final com.tencent.wechat.aff.affroam.c1 e() {
        return (com.tencent.wechat.aff.affroam.c1) ((jz5.n) f92742f).getValue();
    }
}
