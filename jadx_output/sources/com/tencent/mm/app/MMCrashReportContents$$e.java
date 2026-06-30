package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class MMCrashReportContents$$e implements com.tencent.mm.app.b {
    @Override // com.tencent.mm.app.b
    public final void a(java.lang.Object obj, java.lang.StringBuilder sb6, java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.app.MMCrashReportContents.f53234a;
        boolean z17 = true;
        java.util.List<java.util.concurrent.Callable> list = (java.util.List) ((com.tencent.mm.app.m4) obj).c(true);
        if (list == null) {
            return;
        }
        for (java.util.concurrent.Callable callable : list) {
            if (callable != null) {
                if (z17) {
                    z17 = false;
                } else {
                    sb6.append('\n');
                }
                try {
                    sb6.append((java.lang.String) callable.call());
                } catch (java.lang.Throwable unused) {
                }
            }
        }
    }
}
