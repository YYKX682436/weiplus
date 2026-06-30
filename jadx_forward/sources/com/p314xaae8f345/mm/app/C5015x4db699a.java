package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.MMCrashReportContents$$o */
/* loaded from: classes12.dex */
public final /* synthetic */ class C5015x4db699a implements com.p314xaae8f345.mm.app.b {
    @Override // com.p314xaae8f345.mm.app.b
    public final void a(java.lang.Object obj, java.lang.StringBuilder sb6, java.lang.String str) {
        java.lang.String str2 = com.p314xaae8f345.mm.app.C5000x71a2fa35.f134767a;
        sb6.append(str);
        java.lang.Long l17 = (java.lang.Long) ((com.p314xaae8f345.mm.app.m4) obj).c(true);
        if (l17 != null) {
            sb6.append(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", java.util.Locale.ENGLISH).format(l17));
        } else {
            sb6.append("null");
        }
    }
}
