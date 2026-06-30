package ap0;

/* loaded from: classes10.dex */
public class c extends zo0.g {
    @Override // zo0.g
    public void b(ip0.a aVar, ep0.h hVar, zo0.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data from url:%s", aVar);
        try {
            bVar.b(ap0.b.a((java.lang.String) aVar.f293573a));
        } catch (java.io.IOException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            bVar.a();
        } catch (java.lang.InterruptedException e18) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            bVar.a();
        } catch (java.net.SocketException e19) {
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            bVar.a();
        } catch (java.net.SocketTimeoutException e27) {
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e27));
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            bVar.a();
        } catch (java.net.UnknownHostException e28) {
            boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e28));
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            bVar.a();
        } catch (javax.net.ssl.SSLHandshakeException e29) {
            boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e29));
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            bVar.a();
        } catch (java.lang.Exception e37) {
            boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e37));
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            bVar.a();
        }
    }
}
