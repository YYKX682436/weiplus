package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class d implements bl.g {
    @Override // bl.g
    public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.e(str, str2, objArr);
    }

    @Override // bl.g
    public void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i(str, str2, objArr);
    }

    @Override // bl.g
    public void printStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, str2, objArr);
    }
}
