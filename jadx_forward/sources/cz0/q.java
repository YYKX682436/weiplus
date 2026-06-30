package cz0;

/* loaded from: classes5.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final cz0.q f306495d = new cz0.q();

    public q() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = "";
        java.util.concurrent.locks.ReentrantLock reentrantLock = cz0.y.f306506e;
        reentrantLock.lock();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "checkSoSha1: ");
            cz0.y yVar = cz0.y.f306502a;
            java.lang.String f17 = yVar.f(yVar.g());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkSoSha1: so:");
            sb6.append(f17);
            sb6.append(" record:");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("maas_sdk");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
            java.lang.String string = M.getString("KEY_SDK_SHA1", "");
            if (string == null) {
                string = "";
            }
            sb6.append(string);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", sb6.toString());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("maas_sdk");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M2, "getMMKV(...)");
            java.lang.String string2 = M2.getString("KEY_SDK_SHA1", "");
            if (string2 != null) {
                str = string2;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f17, str)) {
                com.p314xaae8f345.mm.vfs.w6.h(yVar.g());
            }
            reentrantLock.unlock();
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            cz0.y.f306506e.unlock();
            throw th6;
        }
    }
}
