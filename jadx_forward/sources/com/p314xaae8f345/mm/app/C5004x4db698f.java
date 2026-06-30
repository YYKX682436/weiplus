package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.MMCrashReportContents$$d */
/* loaded from: classes12.dex */
public final /* synthetic */ class C5004x4db698f implements com.p314xaae8f345.mm.app.b {
    @Override // com.p314xaae8f345.mm.app.b
    public final void a(java.lang.Object obj, java.lang.StringBuilder sb6, java.lang.String str) {
        java.lang.String str2 = com.p314xaae8f345.mm.app.C5000x71a2fa35.f134767a;
        boolean z17 = true;
        java.util.List<android.util.Pair> list = (java.util.List) ((com.p314xaae8f345.mm.app.m4) obj).c(true);
        if (list == null) {
            return;
        }
        for (android.util.Pair pair : list) {
            if (z17) {
                z17 = false;
            } else {
                sb6.append('\n');
            }
            java.lang.String str3 = (java.lang.String) pair.first;
            java.lang.Integer num = (java.lang.Integer) pair.second;
            sb6.append("#xwalk.");
            sb6.append(str3);
            sb6.append('=');
            sb6.append(num);
        }
    }
}
