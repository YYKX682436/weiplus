package c.t.m.p134x35c0ce.c;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static c.t.m.p134x35c0ce.c.d f118405a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f118406b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Map<java.lang.String, java.nio.channels.FileChannel> f118407c;

    public d(android.content.Context context) {
        this.f118407c = null;
        this.f118406b = context;
        this.f118407c = new java.util.HashMap(5);
    }

    public static synchronized c.t.m.p134x35c0ce.c.d a(android.content.Context context) {
        c.t.m.p134x35c0ce.c.d dVar;
        synchronized (c.t.m.p134x35c0ce.c.d.class) {
            if (f118405a == null) {
                f118405a = new c.t.m.p134x35c0ce.c.d(context);
            }
            dVar = f118405a;
        }
        return dVar;
    }

    public synchronized boolean b(java.lang.String str) {
        if (str != null) {
            if (str.trim().length() > 0) {
                java.io.File a17 = a(str);
                if (a17 == null) {
                    return true;
                }
                try {
                    java.nio.channels.FileChannel fileChannel = this.f118407c.get(str);
                    if (fileChannel == null || !fileChannel.isOpen()) {
                        fileChannel = new java.io.FileOutputStream(a17).getChannel();
                        this.f118407c.put(str, fileChannel);
                    }
                    java.nio.channels.FileLock lock = fileChannel.lock();
                    if (lock != null) {
                        if (lock.isValid()) {
                            return true;
                        }
                    }
                } catch (java.lang.Throwable unused) {
                }
                return false;
            }
        }
        return false;
    }

    public synchronized void c(java.lang.String str) {
        if (str != null) {
            if (str.trim().length() > 0) {
                try {
                    java.nio.channels.FileChannel fileChannel = this.f118407c.get(str);
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
        }
    }

    public synchronized java.io.File a(java.lang.String str) {
        java.io.File file;
        try {
            file = new java.io.File(this.f118406b.getFilesDir(), "TencentLocationCoverSDK_sapp_" + str + ".lock");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (java.io.IOException unused) {
            file = null;
        }
        return file;
    }
}
