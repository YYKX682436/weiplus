package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public class y5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f264742a = new java.util.HashMap();

    public y5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b6 b6Var) {
    }

    public void a(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewReporter", "WebviewOpenUrl.stopLoadUrl failed, url is null");
            return;
        }
        java.util.HashMap hashMap = this.f264742a;
        if (hashMap.containsKey(str)) {
            if (!z17) {
                hashMap.put(str, -1L);
            } else {
                hashMap.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - ((java.lang.Long) hashMap.get(str)).longValue()));
            }
        }
    }
}
