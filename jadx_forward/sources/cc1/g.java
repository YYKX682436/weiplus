package cc1;

/* loaded from: classes7.dex */
public abstract class g implements java.lang.AutoCloseable {
    public abstract java.lang.Object a(org.json.JSONObject jSONObject, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    public final java.nio.ByteBuffer b(byte[] bArr) {
        java.nio.ByteBuffer wrap;
        java.lang.String str;
        if (bArr == null) {
            wrap = java.nio.ByteBuffer.allocate(0);
            str = "allocate(...)";
        } else {
            wrap = java.nio.ByteBuffer.wrap(bArr);
            str = "wrap(...)";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wrap, str);
        return wrap;
    }

    public abstract java.lang.Object c(org.json.JSONObject jSONObject, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);
}
