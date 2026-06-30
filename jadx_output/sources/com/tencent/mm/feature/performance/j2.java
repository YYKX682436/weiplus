package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.c2 f67593d;

    public j2(com.tencent.mm.feature.performance.c2 c2Var) {
        this.f67593d = c2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
        if (com.tencent.mm.network.x2.c() != null && com.tencent.mm.network.x2.c().f71993n != null) {
            int i17 = com.tencent.mm.network.x2.c().f71993n.f71902o;
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            java.lang.String string = L.getString("MMKV_LOGIN_DATE", "");
            java.lang.String string2 = L.getString("MMKV_LOGIN_CLIENT_VERSION_REV", "");
            int i18 = L.getInt("MMKV_LOGIN_UIN", 0);
            if (!format.equals(string) || !string2.equals(com.tencent.mm.sdk.platformtools.z.f193109e) || i18 != i17) {
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.f(28611, fVar.s(com.tencent.mm.sdk.platformtools.z.f193109e), true, true);
                L.putString("MMKV_LOGIN_DATE", format);
                L.putString("MMKV_LOGIN_CLIENT_VERSION_REV", com.tencent.mm.sdk.platformtools.z.f193109e);
                L.putInt("MMKV_LOGIN_UIN", i17);
            }
        }
        ((ku5.t0) ku5.t0.f312615d).k(this.f67593d.f67535d, 300000L);
    }
}
