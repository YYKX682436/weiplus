package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f174271b;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u f174270a = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f174272c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f174273d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f174274e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.s.f174254d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f174275f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.t.f174268d);

    public final synchronized void a() {
        if (f174271b) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37513xd8c8aba1();
        fp.d0.n("aff_biz");
        fp.d0.n("zidl2");
        fp.d0.n("ilink_network");
        fp.d0.n("ilink2");
        f174271b = true;
        fo1.m.f346415a.f("Backup", "Init RoamBackup.", new java.lang.Object[0]);
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h1 b(long j17) {
        d();
        java.util.HashMap hashMap = f174272c;
        synchronized (hashMap) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h1 h1Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h1) hashMap.get(java.lang.Long.valueOf(j17));
            if (h1Var != null) {
                return h1Var;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h1 h1Var2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h1();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.NewRoamFetcher", "[+] Roam backup init, packageId = %s", java.lang.Long.valueOf(j17));
            if (h1Var2.d(j17) != 0) {
                h1Var2 = null;
            } else {
                hashMap.put(java.lang.Long.valueOf(j17), h1Var2);
            }
            return h1Var2;
        }
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o1 c(java.lang.String deviceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.NewRoamFetcher", "[+] Roam roamDeviceManager init, deviceId=".concat(deviceId));
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o1 o1Var = null;
        if (deviceId.length() == 0) {
            return null;
        }
        java.util.HashMap hashMap = f174273d;
        synchronized (hashMap) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o1 o1Var2 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o1) hashMap.get(deviceId);
            if (o1Var2 != null) {
                return o1Var2;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o1 o1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o1();
            int d17 = o1Var3.d(deviceId);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.NewRoamFetcher", "[+] Roam device manager init, deviceId=" + deviceId + ", ret=" + d17);
            if (d17 == 0) {
                hashMap.put(deviceId, o1Var3);
                o1Var3.e("ConnectivityChanged", new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.o(deviceId));
                o1Var = o1Var3;
            }
            return o1Var;
        }
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p1 d() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) f174274e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p1) mo141623x754a37bb;
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.c1 e() {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.c1) ((jz5.n) f174275f).mo141623x754a37bb();
    }
}
