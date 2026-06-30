package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86597d;

    public f1(java.lang.String str) {
        this.f86597d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.String u17 = com.tencent.mm.sdk.platformtools.o4.M("appbrand_profile_info_mmkv_name" + this.f86597d).u("appbrand_developer_service_info_key", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "textEncode:%s", u17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(u17)) {
                return;
            }
            r45.fe0 fe0Var = (r45.fe0) new r45.fe0().parseFrom(n56.a.a(u17));
            java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.page.o1.f86938g;
            synchronized (hashMap) {
                hashMap.put(this.f86597d, fe0Var);
            }
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "initDeveloperServiceInfo, encode error");
        }
    }
}
