package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class MMCrashReportContents$$f implements com.tencent.mm.app.b {
    @Override // com.tencent.mm.app.b
    public final void a(java.lang.Object obj, java.lang.StringBuilder sb6, java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.app.MMCrashReportContents.f53234a;
        java.lang.String str3 = (java.lang.String) ((com.tencent.mm.app.m4) obj).c(true);
        if (str3 == null) {
            return;
        }
        java.lang.String encodeToString = android.util.Base64.encodeToString(str3.getBytes(), 2);
        sb6.append(str);
        sb6.append(encodeToString);
    }
}
