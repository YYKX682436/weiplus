package vx5;

/* loaded from: classes13.dex */
public class h implements tx5.d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.n f522883a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f522884b = new java.util.concurrent.ConcurrentHashMap();

    public h() {
        if (!com.p314xaae8f345.p3210x3857dc.o2.c() || !org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.t()) {
            by5.c4.f("PinusProfileStoreWrapper", "PinusProfileStoreWrapper not used, isSupportMultiProfile:" + com.p314xaae8f345.p3210x3857dc.o2.c() + ", isCurrentVersionSupportMultiProfile:" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.t());
            return;
        }
        try {
            this.f522883a = com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.m.f301993a;
        } catch (java.lang.Exception e17) {
            by5.c4.g("PinusProfileStoreWrapper", "Create pinus profile store failed." + android.util.Log.getStackTraceString(e17));
            xx5.l.a(10, 1, com.p314xaae8f345.p3210x3857dc.o2.c());
        }
    }

    @Override // tx5.d
    /* renamed from: getOrCreateProfile */
    public tx5.c mo120236x125d89b4(java.lang.String str) {
        vx5.g gVar = (vx5.g) ((java.util.concurrent.ConcurrentHashMap) this.f522884b).get(str);
        if (gVar != null) {
            return gVar;
        }
        try {
            com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.k a17 = this.f522883a.a(str);
            synchronized (this.f522884b) {
                if (a17 == null) {
                    return null;
                }
                vx5.g gVar2 = new vx5.g(a17);
                ((java.util.concurrent.ConcurrentHashMap) this.f522884b).put(str, gVar2);
                return gVar2;
            }
        } catch (java.lang.Exception e17) {
            by5.c4.c("PinusProfileStoreWrapper", "getOrCreateProfile error: " + e17);
            return null;
        }
    }
}
