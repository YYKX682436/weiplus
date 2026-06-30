package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2 f149126d;

    public j2(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2 c2Var) {
        this.f149126d = c2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.c() != null && com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n != null) {
            int i17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153435o;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            java.lang.String string = L.getString("MMKV_LOGIN_DATE", "");
            java.lang.String string2 = L.getString("MMKV_LOGIN_CLIENT_VERSION_REV", "");
            int i18 = L.getInt("MMKV_LOGIN_UIN", 0);
            if (!format.equals(string) || !string2.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e) || i18 != i17) {
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.f(28611, fVar.s(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e), true, true);
                L.putString("MMKV_LOGIN_DATE", format);
                L.putString("MMKV_LOGIN_CLIENT_VERSION_REV", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                L.putInt("MMKV_LOGIN_UIN", i17);
            }
        }
        ((ku5.t0) ku5.t0.f394148d).k(this.f149126d.f149068d, 300000L);
    }
}
