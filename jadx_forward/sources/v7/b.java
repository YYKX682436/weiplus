package v7;

/* loaded from: classes13.dex */
public class b implements u7.a {

    /* renamed from: a, reason: collision with root package name */
    public final v7.a f515123a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.File f515124b;

    /* renamed from: c, reason: collision with root package name */
    public java.io.RandomAccessFile f515125c;

    public b(java.io.File file, v7.a aVar) {
        java.io.File file2;
        try {
            if (aVar == null) {
                throw new java.lang.NullPointerException();
            }
            this.f515123a = aVar;
            v7.f.a(file.getParentFile());
            boolean exists = file.exists();
            if (exists) {
                file2 = file;
            } else {
                file2 = new java.io.File(file.getParentFile(), file.getName() + ".download");
            }
            this.f515124b = file2;
            this.f515125c = new java.io.RandomAccessFile(this.f515124b, exists ? "r" : "rw");
        } catch (java.io.IOException e17) {
            throw new u7.r("Error using file " + file + " as disc cache", e17);
        }
    }

    public synchronized void a(byte[] bArr, int i17) {
        try {
            if (e()) {
                throw new u7.r("Error append cache: cache file " + this.f515124b + " is completed!");
            }
            this.f515125c.seek(b());
            this.f515125c.write(bArr, 0, i17);
        } catch (java.io.IOException e17) {
            throw new u7.r(java.lang.String.format("Error writing %d bytes to %s from buffer with size %d", java.lang.Integer.valueOf(i17), this.f515125c, java.lang.Integer.valueOf(bArr.length)), e17);
        }
    }

    public synchronized long b() {
        try {
        } catch (java.io.IOException e17) {
            throw new u7.r("Error reading length of file " + this.f515124b, e17);
        }
        return (int) this.f515125c.length();
    }

    public synchronized void c() {
        try {
            this.f515125c.close();
            v7.a aVar = this.f515123a;
            java.io.File file = this.f515124b;
            v7.h hVar = (v7.h) aVar;
            hVar.getClass();
            hVar.f515128a.submit(new v7.g(hVar, file));
        } catch (java.io.IOException e17) {
            throw new u7.r("Error closing file " + this.f515124b, e17);
        }
    }

    public synchronized void d() {
        if (e()) {
            return;
        }
        c();
        java.io.File file = new java.io.File(this.f515124b.getParentFile(), this.f515124b.getName().substring(0, this.f515124b.getName().length() - 9));
        if (!this.f515124b.renameTo(file)) {
            throw new u7.r("Error renaming file " + this.f515124b + " to " + file + " for completion!");
        }
        this.f515124b = file;
        try {
            this.f515125c = new java.io.RandomAccessFile(this.f515124b, "r");
            v7.a aVar = this.f515123a;
            java.io.File file2 = this.f515124b;
            v7.h hVar = (v7.h) aVar;
            hVar.getClass();
            hVar.f515128a.submit(new v7.g(hVar, file2));
        } catch (java.io.IOException e17) {
            throw new u7.r("Error opening " + this.f515124b + " as disc cache", e17);
        }
    }

    public synchronized boolean e() {
        return !this.f515124b.getName().endsWith(".download");
    }
}
