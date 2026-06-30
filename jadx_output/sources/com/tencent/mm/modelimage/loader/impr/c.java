package com.tencent.mm.modelimage.loader.impr;

/* loaded from: classes11.dex */
public class c implements p11.c {
    @Override // p11.c
    public q11.b a(java.lang.String str, long j17) {
        try {
            return com.tencent.mm.modelimage.loader.impr.b.a(str, j17);
        } catch (java.io.IOException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return new q11.b(null, null);
        } catch (java.lang.InterruptedException e18) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            return new q11.b(null, null);
        } catch (java.net.SocketException e19) {
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
            return new q11.b(null, null);
        } catch (java.net.SocketTimeoutException e27) {
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e27));
            return new q11.b(null, null);
        } catch (java.net.UnknownHostException e28) {
            boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e28));
            return new q11.b(null, null);
        } catch (javax.net.ssl.SSLHandshakeException e29) {
            boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e29));
            return new q11.b(null, null);
        } catch (java.lang.Exception e37) {
            boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e37));
            return new q11.b(null, null);
        }
    }

    @Override // p11.c
    public q11.b b(java.lang.String str) {
        return a(str, 0L);
    }
}
