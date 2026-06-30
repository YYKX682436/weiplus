package a7;

/* loaded from: classes13.dex */
public class f1 implements t6.d {

    /* renamed from: a, reason: collision with root package name */
    public final x6.b f1823a;

    public f1(x6.b bVar) {
        this.f1823a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // t6.d
    public boolean b(java.lang.Object obj, java.io.File file, t6.l lVar) {
        java.io.FileOutputStream fileOutputStream;
        java.io.InputStream inputStream = (java.io.InputStream) obj;
        x6.l lVar2 = (x6.l) this.f1823a;
        byte[] bArr = (byte[]) lVar2.c(65536, byte[].class);
        boolean z17 = false;
        ?? r27 = 0;
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        r27 = -1;
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (java.io.IOException unused) {
                        fileOutputStream2 = fileOutputStream;
                        android.util.Log.isLoggable("StreamEncoder", 3);
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (java.io.IOException unused2) {
                            }
                        }
                        lVar2.g(bArr);
                        r27 = fileOutputStream2;
                        return z17;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (java.io.IOException unused3) {
                            }
                        }
                        lVar2.g(bArr);
                        throw th;
                    }
                }
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                } catch (java.io.IOException unused4) {
                }
                lVar2.g(bArr);
                z17 = true;
            } catch (java.lang.Throwable th7) {
                th = th7;
                fileOutputStream = r27;
            }
        } catch (java.io.IOException unused5) {
        }
        return z17;
    }
}
