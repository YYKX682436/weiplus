package mn2;

/* loaded from: classes10.dex */
public final class b1 extends zo0.g {
    @Override // zo0.g
    public void b(ip0.a item, ep0.h fileNameCreator, zo0.b callback) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileNameCreator, "fileNameCreator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        try {
            mn2.h3 h3Var = (mn2.h3) item.f375106a;
            java.lang.String mo148084xb5887639 = h3Var.mo148082x7f025288() == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e ? h3Var.mo148084xb5887639() : h3Var.l();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ImageDownloader", "loadDataImp http " + h3Var.mo148082x7f025288() + " thumbUrl " + h3Var.l() + " url " + h3Var.mo148084xb5887639());
            hp0.d a17 = mn2.a1.f411440a.a(mo148084xb5887639);
            if (a17 != null) {
                callback.b(a17);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                callback.a();
            }
        } catch (java.net.SocketTimeoutException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            callback.a();
        } catch (java.io.IOException e18) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            callback.a();
        } catch (java.lang.InterruptedException e19) {
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
            callback.a();
        } catch (java.net.SocketException e27) {
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e27));
            callback.a();
        } catch (java.net.UnknownHostException e28) {
            boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e28));
            callback.a();
        } catch (javax.net.ssl.SSLHandshakeException e29) {
            boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e29));
            callback.a();
        } catch (java.lang.Exception e37) {
            boolean z37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e37));
            callback.a();
        }
    }
}
