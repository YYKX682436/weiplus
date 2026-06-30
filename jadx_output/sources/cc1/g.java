package cc1;

/* loaded from: classes7.dex */
public abstract class g implements java.lang.AutoCloseable {
    public abstract java.lang.Object a(org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation);

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
        kotlin.jvm.internal.o.f(wrap, str);
        return wrap;
    }

    public abstract java.lang.Object c(org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation);
}
