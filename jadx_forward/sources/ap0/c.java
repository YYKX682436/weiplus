package ap0;

/* loaded from: classes10.dex */
public class c extends zo0.g {
    @Override // zo0.g
    public void b(ip0.a aVar, ep0.h hVar, zo0.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data from url:%s", aVar);
        try {
            bVar.b(ap0.b.a((java.lang.String) aVar.f375106a));
        } catch (java.io.IOException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            bVar.a();
        } catch (java.lang.InterruptedException e18) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            bVar.a();
        } catch (java.net.SocketException e19) {
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            bVar.a();
        } catch (java.net.SocketTimeoutException e27) {
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e27));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            bVar.a();
        } catch (java.net.UnknownHostException e28) {
            boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e28));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            bVar.a();
        } catch (javax.net.ssl.SSLHandshakeException e29) {
            boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e29));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            bVar.a();
        } catch (java.lang.Exception e37) {
            boolean z37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e37));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            bVar.a();
        }
    }
}
