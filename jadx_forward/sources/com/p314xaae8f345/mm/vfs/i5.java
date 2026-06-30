package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class i5 implements java.io.Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f294529h = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.io.RandomAccessFile f294530d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.h5 f294531e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f294532f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f294533g;

    public i5(java.lang.String str, boolean z17) {
        int i17;
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, z17 ? "rw" : "r");
        this.f294532f = z17;
        try {
            android.system.StructStat fstat = android.system.Os.fstat(randomAccessFile.getFD());
            com.p314xaae8f345.mm.vfs.h5 h5Var = new com.p314xaae8f345.mm.vfs.h5(fstat.st_dev, fstat.st_ino);
            synchronized (f294529h) {
                while (true) {
                    java.util.HashMap hashMap = f294529h;
                    com.p314xaae8f345.mm.vfs.c5 c5Var = (com.p314xaae8f345.mm.vfs.c5) hashMap.get(h5Var);
                    if (c5Var != null) {
                        if (!z17 && (i17 = c5Var.f294405c) > 0) {
                            c5Var.f294405c = i17 + 1;
                            break;
                        } else {
                            try {
                                hashMap.wait();
                            } catch (java.lang.InterruptedException e17) {
                                throw new java.io.IOException(e17);
                            }
                        }
                    } else {
                        hashMap.put(h5Var, new com.p314xaae8f345.mm.vfs.c5(randomAccessFile, z17));
                        break;
                    }
                }
            }
            this.f294530d = randomAccessFile;
            this.f294531e = h5Var;
            this.f294533g = true;
        } catch (android.system.ErrnoException e18) {
            throw new java.io.IOException(e18);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f294533g) {
            java.util.HashMap hashMap = f294529h;
            synchronized (hashMap) {
                com.p314xaae8f345.mm.vfs.c5 c5Var = (com.p314xaae8f345.mm.vfs.c5) hashMap.get(this.f294531e);
                if (c5Var == null) {
                    this.f294530d.close();
                } else {
                    if (!this.f294532f) {
                        int i17 = c5Var.f294405c - 1;
                        c5Var.f294405c = i17;
                        if (i17 != 0) {
                            if (c5Var.f294403a == null) {
                                c5Var.f294403a = new java.util.ArrayList(4);
                            }
                            c5Var.f294403a.add(this.f294530d);
                        }
                    }
                    java.nio.channels.FileLock fileLock = c5Var.f294404b;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    java.util.ArrayList arrayList = c5Var.f294403a;
                    if (arrayList != null) {
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((java.io.RandomAccessFile) it.next()).close();
                        }
                    }
                    this.f294530d.close();
                    java.util.HashMap hashMap2 = f294529h;
                    hashMap2.remove(this.f294531e);
                    hashMap2.notifyAll();
                }
            }
            this.f294533g = false;
        }
    }

    /* renamed from: finalize */
    public void m82413xd764dc1e() {
        close();
    }
}
