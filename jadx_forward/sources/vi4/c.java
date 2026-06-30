package vi4;

/* loaded from: classes10.dex */
public final class c extends zo0.g {
    @Override // zo0.g
    public void b(ip0.a url, ep0.h fileNameCreator, zo0.b callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.Object obj = url.f375106a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileNameCreator, "fileNameCreator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        try {
            byte[] u07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u0(((vi4.b) obj).f519140d);
            if (u07 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TextStatusLoader", "loadDataImp() data == null url = " + obj);
                callback.a();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLoader", "loadDataImp() finished with: url = " + obj);
            callback.b(new hp0.d(u07, "", new hp0.c(u07)));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatus.TextStatusLoader", th6, "loadDataImp err", new java.lang.Object[0]);
            callback.a();
        }
    }
}
