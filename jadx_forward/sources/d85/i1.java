package d85;

/* loaded from: classes5.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final d85.i1 f308739a = new d85.i1();

    public final java.lang.String a(android.content.Context context, java.lang.String fileName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = context.getAssets().open(fileName);
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
                java.lang.String str = new java.lang.String(bArr, UTF_8);
                try {
                    inputStream.close();
                    return str;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SensitiveUtils", e17, "close", new java.lang.Object[0]);
                    return str;
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SensitiveUtils", e18, "getFromAssets", new java.lang.Object[0]);
                j85.g.f379784a.b("SensitiveUtils-getFromAssets", "[getFromAssets] catch: " + e18.getCause());
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SensitiveUtils", e19, "close", new java.lang.Object[0]);
                    }
                }
                return "";
            }
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SensitiveUtils", e27, "close", new java.lang.Object[0]);
                }
            }
            throw th6;
        }
    }
}
