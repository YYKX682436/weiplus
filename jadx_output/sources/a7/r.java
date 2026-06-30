package a7;

/* loaded from: classes13.dex */
public class r implements a7.p {
    public r(a7.s sVar) {
    }

    public java.lang.Object a(java.lang.String str) {
        if (!str.startsWith("data:image")) {
            throw new java.lang.IllegalArgumentException("Not a valid image data URL.");
        }
        int indexOf = str.indexOf(44);
        if (indexOf == -1) {
            throw new java.lang.IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, indexOf).endsWith(";base64")) {
            return new java.io.ByteArrayInputStream(android.util.Base64.decode(str.substring(indexOf + 1), 0));
        }
        throw new java.lang.IllegalArgumentException("Not a base64 image data URL.");
    }
}
