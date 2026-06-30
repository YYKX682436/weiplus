package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class k1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getSystemInfo";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("osVersion", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
        hashMap.put("cpuCores", java.lang.Integer.valueOf(y7.b.d()));
        hashMap.put("cpuFreqHz", java.lang.Integer.valueOf(y7.b.b()));
        hashMap.put("memory", java.lang.Long.valueOf(y7.b.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
        hashMap.put("brand", android.os.Build.BRAND);
        hashMap.put("model", wo.w0.m());
        bVar.d(hashMap);
    }
}
