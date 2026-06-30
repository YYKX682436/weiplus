package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.MMCrashReportContents$$e */
/* loaded from: classes12.dex */
public final /* synthetic */ class C5005x4db6990 implements com.p314xaae8f345.mm.app.b {
    @Override // com.p314xaae8f345.mm.app.b
    public final void a(java.lang.Object obj, java.lang.StringBuilder sb6, java.lang.String str) {
        java.lang.String str2 = com.p314xaae8f345.mm.app.C5000x71a2fa35.f134767a;
        boolean z17 = true;
        java.util.List<java.util.concurrent.Callable> list = (java.util.List) ((com.p314xaae8f345.mm.app.m4) obj).c(true);
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
