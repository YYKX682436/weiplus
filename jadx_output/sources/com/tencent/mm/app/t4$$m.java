package com.tencent.mm.app;

/* loaded from: classes11.dex */
public final /* synthetic */ class t4$$m implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.app.MMCrashReportContents.O.e(java.lang.Boolean.FALSE);
        java.util.HashMap hashMap = (java.util.HashMap) cy5.m.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (entry != null) {
                arrayList.add(new android.util.Pair((java.lang.String) entry.getKey(), (java.lang.Integer) entry.getValue()));
            }
        }
        com.tencent.mm.app.MMCrashReportContents.P.e(arrayList);
    }
}
