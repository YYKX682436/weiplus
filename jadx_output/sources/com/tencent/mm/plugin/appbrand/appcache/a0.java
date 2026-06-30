package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.chromium.net.UrlRequest f75409d;

    public a0(org.chromium.net.UrlRequest urlRequest) {
        this.f75409d = urlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.chromium.net.UrlRequest request = this.f75409d;
        kotlin.jvm.internal.o.f(request, "$request");
        if (request.isDone()) {
            return;
        }
        request.cancel();
    }
}
