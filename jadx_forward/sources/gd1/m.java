package gd1;

/* loaded from: classes.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final gd1.m f352038d = new gd1.m();

    public m() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
        byte[] encode = android.util.Base64.encode((obj == null || !(obj instanceof byte[])) ? new byte[0] : (byte[]) obj, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
        return new java.lang.String(encode, UTF_8);
    }
}
