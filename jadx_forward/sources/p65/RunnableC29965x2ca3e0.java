package p65;

/* renamed from: p65.a$$a */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC29965x2ca3e0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        jz5.g gVar = fp.t.f346772a;
        try {
            if (((java.lang.Boolean) ((jz5.n) fp.t.f346772a).mo141623x754a37bb()).booleanValue()) {
                java.lang.String m139410xbca9ae01 = io.p3284xd2ae381c.p3319x36f002.C28969x6063ab6c.m139410xbca9ae01(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m139410xbca9ae01, "getCacheDirectory(...)");
                java.io.File file = new java.io.File(m139410xbca9ae01, fp.t.f346774c);
                if (file.exists()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterCacheUtil", "removeExpiredFlutterCache");
                    vz5.q.d(file);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FlutterCacheUtil", th6, "removeExpiredFlutterCache error", new java.lang.Object[0]);
        }
    }
}
