package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class m0 implements kq5.f {
    public m0(com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var) {
    }

    @Override // kq5.f
    public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.e(str, str2, objArr);
    }

    @Override // kq5.f
    public void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i(str, str2, objArr);
    }

    @Override // kq5.f
    public void printStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, str2, objArr);
    }
}
