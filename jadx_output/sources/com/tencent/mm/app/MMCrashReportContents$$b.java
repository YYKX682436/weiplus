package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class MMCrashReportContents$$b implements com.tencent.mm.app.b {
    @Override // com.tencent.mm.app.b
    public final void a(java.lang.Object obj, java.lang.StringBuilder sb6, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3 = com.tencent.mm.app.MMCrashReportContents.f53234a;
        sb6.append(str);
        com.tencent.mm.app.k4 k4Var = com.tencent.mm.app.MMCrashReportContents.D;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        boolean booleanValue = ((java.lang.Boolean) k4Var.d(false, bool)).booleanValue();
        long longValue = ((java.lang.Long) com.tencent.mm.app.MMCrashReportContents.E.d(false, 0L)).longValue();
        boolean booleanValue2 = ((java.lang.Boolean) com.tencent.mm.app.MMCrashReportContents.F.d(false, bool)).booleanValue();
        boolean booleanValue3 = ((java.lang.Boolean) com.tencent.mm.app.MMCrashReportContents.G.d(false, bool)).booleanValue();
        boolean booleanValue4 = ((java.lang.Boolean) com.tencent.mm.app.MMCrashReportContents.H.d(false, bool)).booleanValue();
        boolean z17 = booleanValue && longValue != 0 && !booleanValue2 && booleanValue3;
        boolean z18 = (!booleanValue || longValue == 0 || booleanValue2 || booleanValue3) ? false : true;
        boolean z19 = z17 || z18 || booleanValue4;
        if (!booleanValue) {
            str2 = "";
        } else if (longValue == 0) {
            str2 = "0";
        } else if (longValue > 0) {
            str2 = java.lang.Long.toString(longValue, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (longValue >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (longValue - (j17 * j18)), 10);
            for (long j19 = 0; j17 > j19; j19 = 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str2 = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(z19);
        sb6.append(':');
        sb6.append(str2);
        sb6.append(':');
        sb6.append(z17);
        sb6.append(':');
        sb6.append(z18);
        sb6.append(':');
        sb6.append(booleanValue4);
    }
}
