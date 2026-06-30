package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class c9 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.io.InputStream f273081a;

    public c9(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d9 d9Var, java.io.InputStream inputStream) {
        this.f273081a = inputStream;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.w
    public void a(java.io.OutputStream outputStream) {
        try {
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = this.f273081a.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        outputStream.write(bArr, 0, read);
                    }
                }
                outputStream.flush();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUtil", "close os failed : %s", e17.getMessage());
            }
            try {
                outputStream.close();
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th6) {
            try {
                outputStream.close();
            } catch (java.lang.Exception unused2) {
            }
            throw th6;
        }
    }
}
