package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class MMCrashReportContents$$o implements com.tencent.mm.app.b {
    @Override // com.tencent.mm.app.b
    public final void a(java.lang.Object obj, java.lang.StringBuilder sb6, java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.app.MMCrashReportContents.f53234a;
        sb6.append(str);
        java.lang.Long l17 = (java.lang.Long) ((com.tencent.mm.app.m4) obj).c(true);
        if (l17 != null) {
            sb6.append(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", java.util.Locale.ENGLISH).format(l17));
        } else {
            sb6.append("null");
        }
    }
}
