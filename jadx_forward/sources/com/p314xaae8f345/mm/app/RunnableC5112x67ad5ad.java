package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.t4$$m */
/* loaded from: classes11.dex */
public final /* synthetic */ class RunnableC5112x67ad5ad implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.app.C5000x71a2fa35.O.e(java.lang.Boolean.FALSE);
        java.util.HashMap hashMap = (java.util.HashMap) cy5.m.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (entry != null) {
                arrayList.add(new android.util.Pair((java.lang.String) entry.getKey(), (java.lang.Integer) entry.getValue()));
            }
        }
        com.p314xaae8f345.mm.app.C5000x71a2fa35.P.e(arrayList);
    }
}
