package h7;

/* loaded from: classes13.dex */
public class p implements t6.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f360901a;

    /* renamed from: b, reason: collision with root package name */
    public final t6.n f360902b;

    /* renamed from: c, reason: collision with root package name */
    public final x6.b f360903c;

    public p(java.util.List list, t6.n nVar, x6.b bVar) {
        this.f360901a = list;
        this.f360902b = nVar;
        this.f360903c = bVar;
    }

    @Override // t6.n
    public w6.z0 a(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        byte[] bArr;
        java.io.InputStream inputStream = (java.io.InputStream) obj;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException unused) {
            android.util.Log.isLoggable("StreamGifDecoder", 5);
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f360902b.a(java.nio.ByteBuffer.wrap(bArr), i17, i18, lVar);
    }

    @Override // t6.n
    public boolean b(java.lang.Object obj, t6.l lVar) {
        return !((java.lang.Boolean) lVar.c(h7.o.f360900b)).booleanValue() && t6.g.b(this.f360901a, (java.io.InputStream) obj, this.f360903c) == com.p147xb1cd08cc.p148x5de23a5.p149x32c4e6.EnumC1427x7be2d498.GIF;
    }
}
