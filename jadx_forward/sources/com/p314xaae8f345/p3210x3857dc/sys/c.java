package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes13.dex */
public class c implements tx5.d {

    /* renamed from: a, reason: collision with root package name */
    public final y4.b f302081a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f302082b = new java.util.concurrent.ConcurrentHashMap();

    public c() {
        try {
            if (!com.p314xaae8f345.p3210x3857dc.o2.c() || !y4.n.a(org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74964x93d07063)) {
                by5.c4.f("SysProfileStoreWrapper", "SysProfileStoreWrapper not used, isSupportMultiProfile:" + com.p314xaae8f345.p3210x3857dc.o2.c() + ", isFeatureSupported:" + y4.n.a(org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74964x93d07063));
                return;
            }
            try {
                if (!z4.e0.f551598g.b()) {
                    throw z4.e0.a();
                }
                if (z4.u.f551608b == null) {
                    z4.u.f551608b = new z4.u(z4.g0.f551600a.mo178384xa93cb32e());
                }
                this.f302081a = z4.u.f551608b;
            } catch (java.lang.Exception e17) {
                java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
                by5.c4.g("SysProfileStoreWrapper", "Create sys profile store failed." + stackTraceString);
                xx5.g.a(4, stackTraceString, 3, java.lang.String.valueOf(by5.e.d()));
            }
        } catch (java.lang.Exception e18) {
            by5.c4.d("SysProfileStoreWrapper", "SysProfileStoreWrapper init failed.", e18);
        }
    }

    @Override // tx5.d
    /* renamed from: getOrCreateProfile */
    public tx5.c mo120236x125d89b4(java.lang.String str) {
        if (this.f302081a == null) {
            by5.c4.c("SysProfileStoreWrapper", "getOrCreateProfile failed, mProfileStore is null");
            return null;
        }
        com.p314xaae8f345.p3210x3857dc.sys.b bVar = (com.p314xaae8f345.p3210x3857dc.sys.b) ((java.util.concurrent.ConcurrentHashMap) this.f302082b).get(str);
        if (bVar == null) {
            synchronized (this.f302082b) {
                z4.u uVar = (z4.u) this.f302081a;
                uVar.getClass();
                if (!z4.e0.f551598g.b()) {
                    throw z4.e0.a();
                }
                bVar = new com.p314xaae8f345.p3210x3857dc.sys.b(new z4.t((org.p3343x72743996.p3360x5ff5cf14.InterfaceC29652x9e6375a6) org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29679xe419bcbc.m154462xa5e5ff2f(org.p3343x72743996.p3360x5ff5cf14.InterfaceC29652x9e6375a6.class, uVar.f551609a.m154353x125d89b4(str))));
                ((java.util.concurrent.ConcurrentHashMap) this.f302082b).put(str, bVar);
            }
        }
        by5.c4.f("SysProfileStoreWrapper", "getOrCreateProfile, name:" + str + ", profile:" + bVar);
        return bVar;
    }
}
