package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159269f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f159270g;

    public e0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Runnable runnable) {
        this.f159267d = str;
        this.f159268e = str2;
        this.f159269f = str3;
        this.f159270g = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        java.io.OutputStream outputStream;
        java.lang.String str = this.f159269f;
        java.lang.Runnable runnable = this.f159270g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.b.o());
        java.lang.String str2 = this.f159267d;
        sb6.append(str2);
        sb6.append("-");
        java.lang.String str3 = this.f159268e;
        sb6.append(str3);
        sb6.append("-");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(".js");
        java.lang.String sb7 = sb6.toString();
        java.io.OutputStream outputStream2 = null;
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.h2 d17 = com.p314xaae8f345.mm.p971x6de15a2e.n.d(str, null);
            d17.g(10000);
            d17.k(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
            d17.c("GET");
            d17.f();
            java.io.InputStream mo48349xc7995ab4 = d17.mo48349xc7995ab4();
            if (mo48349xc7995ab4 != 0) {
                try {
                    outputStream2 = com.p314xaae8f345.mm.vfs.w6.K(sb7, false);
                    s46.d.b(mo48349xc7995ab4, outputStream2);
                    outputStream2.flush();
                } catch (java.lang.Exception e17) {
                    e = e17;
                    outputStream = outputStream2;
                    outputStream2 = mo48349xc7995ab4;
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ForceOpenAppNotify", "try download autoTestInjectJs appId:%s, name:%s, url:%s, failed, exception=%s", str2, str3, str, e);
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
                    outputStream2 = mo48349xc7995ab4;
                    s46.d.a(outputStream2);
                    s46.d.a(outputStream);
                    runnable.run();
                    throw th;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.c0.c(str2, str3, sb7);
            s46.d.a(mo48349xc7995ab4);
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
