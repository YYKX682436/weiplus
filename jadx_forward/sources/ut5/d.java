package ut5;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 f512726a = com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25509x39e6a13a.m94647x23af1886("Shadow.DexClassLoaderHelper");

    public static java.lang.ClassLoader a(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 c25507x83693462, java.lang.ClassLoader classLoader) {
        f512726a.mo46954x3164ae("DexClassLoaderHelper create for %s", c25507x83693462);
        if (c25507x83693462.f46642x1b64b1fd == null && c25507x83693462.f46641x58b6bfa == null) {
            throw new java.lang.IllegalArgumentException("InstalledApk not accept to ApkClassLoader");
        }
        android.os.ParcelFileDescriptor parcelFileDescriptor = c25507x83693462.f46641x58b6bfa;
        if (parcelFileDescriptor != null) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                return new dalvik.system.InMemoryDexClassLoader(c(parcelFileDescriptor), c25507x83693462.f46643xdba72780, classLoader);
            }
            throw new java.lang.IllegalStateException("Android Q及以上系统InMemoryDexClassLoader才开始支持指定librarySearchPath(load(libName)接口需要)");
        }
        java.io.File file = new java.io.File(c25507x83693462.f46642x1b64b1fd);
        if (file.exists()) {
            file.setReadable(true, false);
            file.setWritable(false, false);
        }
        return new dalvik.system.DexClassLoader(c25507x83693462.f46642x1b64b1fd, c25507x83693462.f46644xcae4856d, c25507x83693462.f46643xdba72780, classLoader);
    }

    public static java.nio.ByteBuffer[] b(java.io.FileInputStream fileInputStream) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream(fileInputStream));
        while (true) {
            java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                zipInputStream.close();
                zipInputStream.close();
                java.nio.ByteBuffer[] byteBufferArr = new java.nio.ByteBuffer[arrayList.size()];
                arrayList.toArray(byteBufferArr);
                return byteBufferArr;
            }
            if (nextEntry.getName().endsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55637xc33c4c99)) {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = zipInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                arrayList.add(java.nio.ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
            }
            zipInputStream.closeEntry();
        }
    }

    public static java.nio.ByteBuffer[] c(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        try {
            android.system.Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, android.system.OsConstants.SEEK_SET);
            return b(new java.io.FileInputStream(parcelFileDescriptor.getFileDescriptor()));
        } catch (android.system.ErrnoException e17) {
            throw new java.lang.RuntimeException(e17);
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException(e18);
        }
    }
}
