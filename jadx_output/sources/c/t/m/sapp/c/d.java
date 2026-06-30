package c.t.m.sapp.c;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static c.t.m.sapp.c.d f36872a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f36873b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Map<java.lang.String, java.nio.channels.FileChannel> f36874c;

    public d(android.content.Context context) {
        this.f36874c = null;
        this.f36873b = context;
        this.f36874c = new java.util.HashMap(5);
    }

    public static synchronized c.t.m.sapp.c.d a(android.content.Context context) {
        c.t.m.sapp.c.d dVar;
        synchronized (c.t.m.sapp.c.d.class) {
            if (f36872a == null) {
                f36872a = new c.t.m.sapp.c.d(context);
            }
            dVar = f36872a;
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
                    java.nio.channels.FileChannel fileChannel = this.f36874c.get(str);
                    if (fileChannel == null || !fileChannel.isOpen()) {
                        fileChannel = new java.io.FileOutputStream(a17).getChannel();
                        this.f36874c.put(str, fileChannel);
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
                    java.nio.channels.FileChannel fileChannel = this.f36874c.get(str);
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
            file = new java.io.File(this.f36873b.getFilesDir(), "TencentLocationCoverSDK_sapp_" + str + ".lock");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (java.io.IOException unused) {
            file = null;
        }
        return file;
    }
}
