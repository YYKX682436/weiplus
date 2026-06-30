package pm;

/* loaded from: classes9.dex */
public abstract class h {
    public static java.io.Serializable a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.lang.System.currentTimeMillis();
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(java.net.URLDecoder.decode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c).getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
        java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
        java.io.Serializable serializable = (java.io.Serializable) objectInputStream.readObject();
        objectInputStream.close();
        byteArrayInputStream.close();
        java.lang.System.currentTimeMillis();
        return serializable;
    }

    public static java.lang.String b(java.io.Serializable serializable) {
        if (serializable == null) {
            return "";
        }
        java.lang.System.currentTimeMillis();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(serializable);
        java.lang.String encode = java.net.URLEncoder.encode(byteArrayOutputStream.toString(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        objectOutputStream.close();
        byteArrayOutputStream.close();
        java.lang.System.currentTimeMillis();
        return encode;
    }
}
