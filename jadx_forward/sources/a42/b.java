package a42;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a42.b f82729a = new a42.b();

    /* renamed from: b, reason: collision with root package name */
    public static byte[] f82730b;

    /* renamed from: c, reason: collision with root package name */
    public static byte[] f82731c;

    /* renamed from: d, reason: collision with root package name */
    public static byte[] f82732d;

    public final java.lang.String a(java.lang.String filePath, boolean z17) {
        byte[][] m46288xb1e9d5e6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        try {
            java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(filePath);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(E, "openRead(...)");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            for (int read = E.read(); read != -1; read = E.read()) {
                byteArrayOutputStream.write(read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteArray, "toByteArray(...)");
            if (z17) {
                com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46306x6ea14265(32);
                com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46306x6ea14265(12);
                m46288xb1e9d5e6 = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46288xb1e9d5e6(f82730b, f82731c, null, byteArray);
                byte[] bArr = m46288xb1e9d5e6[1];
            } else {
                f82731c = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46306x6ea14265(12);
                byte[] m46306x6ea14265 = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46306x6ea14265(32);
                f82730b = m46306x6ea14265;
                m46288xb1e9d5e6 = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46288xb1e9d5e6(m46306x6ea14265, f82731c, null, byteArray);
                f82732d = m46288xb1e9d5e6[1];
            }
            java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(filePath);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(r17);
            sb6.append("/enc_");
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(filePath);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            java.lang.String str2 = a17.f294812f;
            int lastIndexOf = str2.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str2 = str2.substring(lastIndexOf + 1);
            }
            sb6.append(str2);
            java.lang.String sb7 = sb6.toString();
            java.io.OutputStream K = com.p314xaae8f345.mm.vfs.w6.K(sb7, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(K, "openWrite(...)");
            K.write(m46288xb1e9d5e6[0]);
            K.flush();
            K.close();
            com.p314xaae8f345.mm.vfs.w6.k(sb7);
            return sb7;
        } catch (java.io.FileNotFoundException unused) {
            return "";
        }
    }
}
