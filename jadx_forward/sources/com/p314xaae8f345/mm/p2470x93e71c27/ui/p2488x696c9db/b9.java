package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class b9 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f273066a;

    public b9(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d9 d9Var, byte[] bArr) {
        this.f273066a = bArr;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.w
    public void a(java.io.OutputStream outputStream) {
        try {
            byte[] bArr = this.f273066a;
            if (bArr != null) {
                outputStream.write(bArr);
                outputStream.flush();
            }
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            try {
                outputStream.close();
            } catch (java.lang.Exception unused2) {
            }
            throw th6;
        }
        try {
            outputStream.close();
        } catch (java.lang.Exception unused3) {
        }
    }
}
