package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class c4 implements org.chromium.net.apihelpers.CronetRequestCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f89622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f89623b;

    public c4(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI, java.lang.String str2) {
        this.f89622a = r6Var;
        this.f89623b = appBrandDebugUI;
    }

    @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
    public void onCanceled(org.chromium.net.UrlResponseInfo urlResponseInfo) {
    }

    @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
    public void onFailed(org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDebugUI", "onFailed: info=" + urlResponseInfo + " exception=" + cronetException);
    }

    @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
    public void onSucceeded(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.Object obj) {
        com.tencent.mm.vfs.r6 r6Var = this.f89622a;
        java.lang.String a17 = kk.k.a(r6Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDebugUI", "download success: md5=" + a17 + " filePath=" + r6Var.o() + " isMatch=" + kotlin.jvm.internal.o.b(a17, "22ce9fe8fecba3a6996b60eb9207c862"));
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(this.f89623b.getCacheDir().getAbsolutePath(), "interrupted.jpg");
        r6Var2.l();
        r6Var2.k();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(r6Var.o());
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(r6Var2.o());
        byte[] bArr = new byte[new java.util.Random().nextInt(1048576)];
        fileOutputStream.write(bArr, 0, fileInputStream.read(bArr));
        com.tencent.mm.plugin.appbrand.appcache.b0.f75451a.a("https://pic-go-1252561521.cos.ap-guangzhou.myqcloud.com/157deb5c-3a30-4bc6-b12e-f10ac933b210.png", null, r6Var2, 60000L, new com.tencent.mm.plugin.appbrand.ui.b4(r6Var2, a17, "22ce9fe8fecba3a6996b60eb9207c862"), (r19 & 32) != 0 ? null : null, (r19 & 64) != 0 ? false : true);
    }
}
