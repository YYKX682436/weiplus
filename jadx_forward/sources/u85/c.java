package u85;

/* loaded from: classes10.dex */
public final class c extends zo0.g {
    @Override // zo0.g
    public void b(ip0.a url, ep0.h fileNameCreator, zo0.b callback) {
        java.io.InputStream inputStream;
        com.p314xaae8f345.mm.p971x6de15a2e.h2 d17;
        int f17;
        java.lang.String e17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileNameCreator, "fileNameCreator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        r45.o64 o64Var = ((u85.a) url.f375106a).f507229d.f464326e;
        java.io.InputStream inputStream2 = null;
        inputStream2 = null;
        java.lang.String str = o64Var != null ? o64Var.f463516d : null;
        java.lang.String str2 = o64Var != null ? o64Var.f463517e : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            callback.a();
            return;
        }
        try {
            try {
                d17 = com.p314xaae8f345.mm.p971x6de15a2e.n.d(str, new com.p314xaae8f345.mm.p971x6de15a2e.m(str));
                f17 = d17.f();
                inputStream = d17.mo48349xc7995ab4();
            } catch (java.lang.Exception e18) {
                e = e18;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            inputStream = inputStream2;
        }
        try {
            e17 = d17.e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LensIconDownloader", "http response: " + f17 + ", " + e17);
        } catch (java.lang.Exception e19) {
            e = e19;
            inputStream2 = inputStream;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LensIconDownloader", e, "", new java.lang.Object[0]);
            if (inputStream2 != null) {
                inputStream2.close();
            }
            callback.a();
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
        if (f17 != 200) {
            d17.mo48348x1f9d589c();
            callback.a();
            if (inputStream != null) {
                inputStream.close();
                return;
            }
            return;
        }
        byte[] c17 = inputStream != null ? vz5.a.c(inputStream) : null;
        d17.mo48348x1f9d589c();
        if (c17 == null) {
            callback.a();
            if (inputStream != null) {
                inputStream.close();
                return;
            }
            return;
        }
        byte[] a17 = kk.b.a(c17, android.util.Base64.encodeToString(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str2), 0));
        callback.b(new hp0.d(a17, e17, new hp0.c(a17)));
        if (inputStream != null) {
            inputStream.close();
        }
        callback.a();
    }
}
