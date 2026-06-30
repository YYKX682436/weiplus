package hd1;

/* loaded from: classes7.dex */
public final class b0 implements hd1.e {

    /* renamed from: a, reason: collision with root package name */
    public static final hd1.b0 f361924a = new hd1.b0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f361925b = jz5.h.a(jz5.i.f384364f, hd1.a0.f361917d);

    @Override // hd1.e
    public void a(android.nfc.Tag tag, java.lang.String function, id1.a aVar, yz5.l callback) {
        java.lang.Object yVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(function, "function");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.nfc.tech.NfcA nfcA = android.nfc.tech.NfcA.get(tag);
        if (nfcA == null) {
            callback.mo146xb9724478(new hd1.x(13015, "unavailable tech"));
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(function, "getAtqa")) {
            byte[] atqa = nfcA.getAtqa();
            if (atqa == null) {
                atqa = (byte[]) f361925b.mo141623x754a37bb();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.util.Arrays.toString(atqa), "toString(...)");
            yVar = new hd1.y(atqa);
        } else {
            yVar = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(function, "getSak") ? new hd1.y(java.lang.Short.valueOf(nfcA.getSak())) : new hd1.x(13024, "function not support");
        }
        callback.mo146xb9724478(yVar);
    }
}
