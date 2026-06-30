package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class MMCrashReportContents$$n implements com.tencent.mm.app.b {
    @Override // com.tencent.mm.app.b
    public final void a(java.lang.Object obj, java.lang.StringBuilder sb6, java.lang.String str) {
        java.lang.Long l17 = (java.lang.Long) com.tencent.mm.app.MMCrashReportContents.f53260o.c(true);
        java.lang.Long l18 = (java.lang.Long) com.tencent.mm.app.MMCrashReportContents.f53261p.c(true);
        long longValue = l17 != null ? l17.longValue() : 0L;
        long longValue2 = l18 != null ? l18.longValue() : 0L;
        sb6.append(str);
        sb6.append(longValue2 - longValue);
        sb6.append('(');
        sb6.append((java.lang.String) com.tencent.mm.app.MMCrashReportContents.f53262q.c(true));
        sb6.append(')');
    }
}
