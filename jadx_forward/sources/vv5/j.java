package vv5;

/* loaded from: classes13.dex */
public abstract class j {
    public static void a(vv5.f fVar, java.io.File file, long j17, vv5.i iVar) {
        vv5.f fVar2 = new vv5.f(fVar);
        fVar2.a(0);
        fVar2.b(file.length());
        fVar2.f522088g = file.length();
        if (j17 < 0 || j17 > io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) {
            throw new java.lang.IllegalArgumentException("Bad CRC32: " + j17);
        }
        fVar2.f522087f = j17;
        java.io.BufferedInputStream bufferedInputStream = null;
        try {
            java.io.BufferedInputStream bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
            try {
                iVar.c(new vv5.f(fVar2));
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        iVar.b();
                        bufferedInputStream2.close();
                        return;
                    }
                    iVar.write(bArr, 0, read);
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static void b(vv5.h hVar, vv5.f fVar, vv5.i iVar) {
        java.io.InputStream inputStream;
        try {
            inputStream = hVar.c(fVar);
            try {
                iVar.c(new vv5.f(fVar));
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        iVar.b();
                        inputStream.close();
                        return;
                    }
                    iVar.write(bArr, 0, read);
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }
}
