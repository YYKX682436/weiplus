package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class b4 implements org.chromium.net.apihelpers.CronetRequestCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f89566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89568c;

    public b4(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, java.lang.String str2) {
        this.f89566a = r6Var;
        this.f89567b = str;
        this.f89568c = str2;
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
        com.tencent.mm.vfs.r6 r6Var = this.f89566a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDebugUI", "resume success: md5=" + this.f89567b + " filePath=" + r6Var.o() + " isMatch=" + kotlin.jvm.internal.o.b(kk.k.a(r6Var), this.f89568c));
    }
}
