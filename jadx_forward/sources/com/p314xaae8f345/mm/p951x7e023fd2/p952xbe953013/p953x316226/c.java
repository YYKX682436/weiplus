package com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226;

/* loaded from: classes11.dex */
public class c implements p11.c {
    @Override // p11.c
    public q11.b a(java.lang.String str, long j17) {
        try {
            return com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.b.a(str, j17);
        } catch (java.io.IOException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return new q11.b(null, null);
        } catch (java.lang.InterruptedException e18) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            return new q11.b(null, null);
        } catch (java.net.SocketException e19) {
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
            return new q11.b(null, null);
        } catch (java.net.SocketTimeoutException e27) {
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e27));
            return new q11.b(null, null);
        } catch (java.net.UnknownHostException e28) {
            boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e28));
            return new q11.b(null, null);
        } catch (javax.net.ssl.SSLHandshakeException e29) {
            boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e29));
            return new q11.b(null, null);
        } catch (java.lang.Exception e37) {
            boolean z37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e37));
            return new q11.b(null, null);
        }
    }

    @Override // p11.c
    public q11.b b(java.lang.String str) {
        return a(str, 0L);
    }
}
