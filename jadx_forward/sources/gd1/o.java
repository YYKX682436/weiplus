package gd1;

/* loaded from: classes.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final gd1.o f352039d = new gd1.o();

    public o() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (obj == null || !(obj instanceof byte[])) {
            return null;
        }
        byte[] encode = android.util.Base64.encode((byte[]) obj, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
        return new java.lang.String(encode, UTF_8);
    }
}
