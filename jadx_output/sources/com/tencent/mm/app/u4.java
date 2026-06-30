package com.tencent.mm.app;

/* loaded from: classes11.dex */
public class u4 implements com.tencent.mm.app.t2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mm.app.MMCrashReportContents.f53271z.e(java.lang.Boolean.FALSE);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mm.app.MMCrashReportContents.f53271z.e(java.lang.Boolean.TRUE);
    }
}
