package uk;

/* loaded from: classes13.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final uk.o f510027a = new uk.o(84298576);

    /* renamed from: b, reason: collision with root package name */
    public static final uk.o f510028b = new uk.o(50613072);

    /* renamed from: c, reason: collision with root package name */
    public static int f510029c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final uk.o f510030d = new uk.o(101010256);

    public static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        uk.o oVar = f510027a;
        oVar.a();
        byte[] bArr2 = new byte[4];
        wrap.get(bArr2);
        if (oVar.m168190xb2c87fbf(new uk.o(bArr2))) {
            return bArr;
        }
        uk.o oVar2 = f510028b;
        if (oVar2.m168190xb2c87fbf(new uk.o(bArr2))) {
            return bArr;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byteArrayOutputStream.write(oVar2.a());
        int length = bArr.length;
        byteArrayOutputStream.write(new byte[]{(byte) (length & 255), (byte) ((length & 65280) >> 8)});
        byteArrayOutputStream.write(bArr);
        return byteArrayOutputStream.toByteArray();
    }

    public static java.lang.String b(java.io.File file) {
        java.lang.System.err.println("enter getSecurityCode");
        java.io.RandomAccessFile randomAccessFile = null;
        if (file == null) {
            return null;
        }
        java.lang.System.err.println("apkFile filename:" + file.getName());
        try {
            java.io.RandomAccessFile randomAccessFile2 = new java.io.RandomAccessFile(file, "r");
            try {
                byte[] c17 = c(randomAccessFile2);
                if (c17 == null) {
                    java.lang.System.err.println("null == readComment");
                    java.lang.System.err.println("exit");
                    randomAccessFile2.close();
                    java.lang.System.err.println("exit getSecurityCode");
                    return null;
                }
                uk.e eVar = new uk.e(null);
                eVar.a(c17);
                java.lang.String property = eVar.f510025a.getProperty("apkSecurityCode");
                randomAccessFile2.close();
                java.lang.System.err.println("exit getSecurityCode");
                return property;
            } catch (java.lang.Throwable th6) {
                th = th6;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                java.lang.System.err.println("exit getSecurityCode");
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static byte[] c(java.io.RandomAccessFile randomAccessFile) {
        boolean z17;
        long length = randomAccessFile.length() - 22;
        randomAccessFile.seek(length);
        byte[] a17 = f510030d.a();
        int read = randomAccessFile.read();
        while (true) {
            if (read == -1) {
                z17 = false;
                break;
            }
            if (read == a17[0] && randomAccessFile.read() == a17[1] && randomAccessFile.read() == a17[2] && randomAccessFile.read() == a17[3]) {
                z17 = true;
                break;
            }
            length--;
            randomAccessFile.seek(length);
            read = randomAccessFile.read();
        }
        if (!z17) {
            java.lang.System.err.println("archive is not a ZIP archive");
            throw new java.util.zip.ZipException("archive is not a ZIP archive");
        }
        long j17 = length + 16 + 4;
        randomAccessFile.seek(j17);
        if (f510029c != j17) {
            f510029c = (int) j17;
        }
        byte[] bArr = new byte[2];
        randomAccessFile.readFully(bArr);
        java.io.PrintStream printStream = java.lang.System.err;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("readComment:length bytes data = ");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < 2; i17++) {
            sb7.append((int) bArr[i17]);
            sb7.append(",");
        }
        sb6.append(sb7.toString());
        printStream.println(sb6.toString());
        int i18 = ((bArr[1] << 8) & 65280) + (bArr[0] & 255);
        if (i18 == 0) {
            return null;
        }
        byte[] bArr2 = new byte[i18];
        randomAccessFile.read(bArr2);
        return bArr2;
    }

    public static void d(java.io.File file, java.lang.String str) {
        java.io.RandomAccessFile randomAccessFile;
        java.io.RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new java.io.RandomAccessFile(file, "rw");
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            byte[] a17 = a(c(randomAccessFile));
            uk.e eVar = new uk.e(null);
            eVar.a(a17);
            eVar.f510025a.setProperty("apkSecurityCode", str);
            byte[] b17 = eVar.b();
            randomAccessFile.seek(f510029c);
            int length = b17.length;
            randomAccessFile.write(new byte[]{(byte) (length & 255), (byte) ((length & 65280) >> 8)});
            randomAccessFile.write(b17);
            randomAccessFile.setLength(f510029c + b17.length + 2);
            java.lang.System.err.println("file length is = " + randomAccessFile.length());
            randomAccessFile.close();
            java.lang.System.err.println("exit writeSecurityCode");
        } catch (java.lang.Throwable th7) {
            th = th7;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            java.lang.System.err.println("exit writeSecurityCode");
            throw th;
        }
    }
}
