package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class MMCrashReportContents$$l implements com.tencent.mm.app.b {
    @Override // com.tencent.mm.app.b
    public final void a(java.lang.Object obj, java.lang.StringBuilder sb6, java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.app.MMCrashReportContents.f53234a;
        com.tencent.mm.app.o4 o4Var = (com.tencent.mm.app.o4) ((com.tencent.mm.app.m4) obj).c(true);
        if (o4Var == null) {
            return;
        }
        sb6.append("#runtime.processThreadCount=");
        sb6.append(o4Var.f53560a);
        sb6.append('\n');
        sb6.append("#runtime.threadInfo=");
        sb6.append(o4Var.f53561b);
    }
}
