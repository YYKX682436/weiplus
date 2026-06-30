package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168130d;

    public f1(java.lang.String str) {
        this.f168130d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.String u17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("appbrand_profile_info_mmkv_name" + this.f168130d).u("appbrand_developer_service_info_key", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "textEncode:%s", u17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17)) {
                return;
            }
            r45.fe0 fe0Var = (r45.fe0) new r45.fe0().mo11468x92b714fd(n56.a.a(u17));
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1.f168471g;
            synchronized (hashMap) {
                hashMap.put(this.f168130d, fe0Var);
            }
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "initDeveloperServiceInfo, encode error");
        }
    }
}
