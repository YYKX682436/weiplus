package hd1;

/* loaded from: classes7.dex */
public final class f implements hd1.e {

    /* renamed from: a, reason: collision with root package name */
    public static final hd1.f f361931a = new hd1.f();

    @Override // hd1.e
    public void a(android.nfc.Tag tag, java.lang.String function, id1.a aVar, yz5.l callback) {
        java.lang.Object xVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(function, "function");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.nfc.tech.IsoDep isoDep = android.nfc.tech.IsoDep.get(tag);
        if (isoDep == null) {
            callback.mo146xb9724478(new hd1.x(13015, "unavailable tech"));
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(function, "getHistoricalBytes")) {
            byte[] historicalBytes = isoDep.getHistoricalBytes();
            if (historicalBytes != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.util.Arrays.toString(historicalBytes), "toString(...)");
            } else {
                historicalBytes = null;
            }
            xVar = new hd1.y(historicalBytes);
        } else {
            xVar = new hd1.x(13024, "function not support");
        }
        callback.mo146xb9724478(xVar);
    }
}
