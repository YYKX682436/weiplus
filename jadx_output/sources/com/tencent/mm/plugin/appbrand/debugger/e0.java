package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77736f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f77737g;

    public e0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Runnable runnable) {
        this.f77734d = str;
        this.f77735e = str2;
        this.f77736f = str3;
        this.f77737g = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        java.io.OutputStream outputStream;
        java.lang.String str = this.f77736f;
        java.lang.Runnable runnable = this.f77737g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.b.o());
        java.lang.String str2 = this.f77734d;
        sb6.append(str2);
        sb6.append("-");
        java.lang.String str3 = this.f77735e;
        sb6.append(str3);
        sb6.append("-");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(".js");
        java.lang.String sb7 = sb6.toString();
        java.io.OutputStream outputStream2 = null;
        try {
            com.tencent.mm.network.h2 d17 = com.tencent.mm.network.n.d(str, null);
            d17.g(10000);
            d17.k(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
            d17.c("GET");
            d17.f();
            java.io.InputStream inputStream = d17.getInputStream();
            if (inputStream != 0) {
                try {
                    outputStream2 = com.tencent.mm.vfs.w6.K(sb7, false);
                    s46.d.b(inputStream, outputStream2);
                    outputStream2.flush();
                } catch (java.lang.Exception e17) {
                    e = e17;
                    outputStream = outputStream2;
                    outputStream2 = inputStream;
                    try {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ForceOpenAppNotify", "try download autoTestInjectJs appId:%s, name:%s, url:%s, failed, exception=%s", str2, str3, str, e);
                        s46.d.a(outputStream2);
                        s46.d.a(outputStream);
                        runnable.run();
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        s46.d.a(outputStream2);
                        s46.d.a(outputStream);
                        runnable.run();
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    outputStream = outputStream2;
                    outputStream2 = inputStream;
                    s46.d.a(outputStream2);
                    s46.d.a(outputStream);
                    runnable.run();
                    throw th;
                }
            }
            com.tencent.mm.plugin.appbrand.debugger.c0.c(str2, str3, sb7);
            s46.d.a(inputStream);
            s46.d.a(outputStream2);
        } catch (java.lang.Exception e18) {
            e = e18;
            outputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            outputStream = null;
        }
        runnable.run();
    }
}
