package vv5;

/* loaded from: classes13.dex */
public class a extends java.util.zip.DeflaterOutputStream {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f522062v = new byte[0];

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f522063w = {0};

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f522064d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f522065e;

    /* renamed from: f, reason: collision with root package name */
    public final int f522066f;

    /* renamed from: g, reason: collision with root package name */
    public final int f522067g;

    /* renamed from: h, reason: collision with root package name */
    public java.io.ByteArrayOutputStream f522068h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.zip.ZipEntry f522069i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.zip.CRC32 f522070m;

    /* renamed from: n, reason: collision with root package name */
    public long f522071n;

    /* renamed from: o, reason: collision with root package name */
    public int f522072o;

    /* renamed from: p, reason: collision with root package name */
    public int f522073p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f522074q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f522075r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f522076s;

    /* renamed from: t, reason: collision with root package name */
    public final int f522077t;

    /* renamed from: u, reason: collision with root package name */
    public int f522078u;

    public a(java.io.OutputStream outputStream) {
        super(outputStream, new java.util.zip.Deflater(-1, true));
        this.f522064d = f522062v;
        this.f522065e = new java.util.HashSet();
        this.f522066f = 8;
        this.f522067g = -1;
        this.f522068h = new java.io.ByteArrayOutputStream();
        this.f522070m = new java.util.zip.CRC32();
        this.f522071n = 0L;
        this.f522072o = 0;
        this.f522075r = false;
        this.f522076s = false;
        this.f522078u = 0;
        this.f522077t = 4;
    }

    public void a() {
        int i17;
        int i18;
        if (this.f522076s) {
            throw new java.io.IOException("Stream is closed");
        }
        java.util.zip.ZipEntry zipEntry = this.f522069i;
        if (zipEntry == null) {
            return;
        }
        if (zipEntry.getMethod() == 8) {
            super.finish();
        }
        int method = this.f522069i.getMethod();
        java.util.zip.CRC32 crc32 = this.f522070m;
        if (method == 0) {
            if (crc32.getValue() != this.f522069i.getCrc()) {
                throw new java.util.zip.ZipException("CRC mismatch");
            }
            if (this.f522069i.getSize() != this.f522071n) {
                throw new java.util.zip.ZipException("Size mismatch");
            }
        }
        if (this.f522069i.getMethod() != 0) {
            c(((java.util.zip.DeflaterOutputStream) this).out, 134695760L);
            this.f522069i.setCrc(crc32.getValue());
            c(((java.util.zip.DeflaterOutputStream) this).out, this.f522069i.getCrc());
            this.f522069i.setCompressedSize(((java.util.zip.DeflaterOutputStream) this).def.getTotalOut());
            c(((java.util.zip.DeflaterOutputStream) this).out, this.f522069i.getCompressedSize());
            this.f522069i.setSize(((java.util.zip.DeflaterOutputStream) this).def.getTotalIn());
            c(((java.util.zip.DeflaterOutputStream) this).out, this.f522069i.getSize());
            i17 = 46;
        } else {
            i17 = 30;
        }
        int i19 = this.f522069i.getMethod() == 0 ? 0 : 8;
        c(this.f522068h, 33639248L);
        f(this.f522068h, 20);
        f(this.f522068h, 20);
        f(this.f522068h, i19 | 2048);
        f(this.f522068h, this.f522069i.getMethod());
        f(this.f522068h, 0);
        f(this.f522068h, 33);
        c(this.f522068h, crc32.getValue());
        if (this.f522069i.getMethod() == 8) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = this.f522068h;
            long totalOut = ((java.util.zip.DeflaterOutputStream) this).def.getTotalOut();
            c(byteArrayOutputStream, totalOut);
            i18 = (int) (i17 + totalOut);
            c(this.f522068h, ((java.util.zip.DeflaterOutputStream) this).def.getTotalIn());
        } else {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = this.f522068h;
            long j17 = this.f522071n;
            c(byteArrayOutputStream2, j17);
            i18 = (int) (i17 + j17);
            c(this.f522068h, this.f522071n);
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream3 = this.f522068h;
        int i27 = this.f522073p;
        f(byteArrayOutputStream3, i27);
        int i28 = i18 + i27;
        if (this.f522069i.getExtra() != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream4 = this.f522068h;
            int length = this.f522069i.getExtra().length;
            f(byteArrayOutputStream4, length);
            i28 += length;
        } else {
            f(this.f522068h, 0);
        }
        java.lang.String comment = this.f522069i.getComment();
        byte[] bArr = f522062v;
        if (comment != null) {
            bArr = comment.getBytes(java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        }
        f(this.f522068h, bArr.length);
        f(this.f522068h, 0);
        f(this.f522068h, 0);
        c(this.f522068h, 0L);
        c(this.f522068h, this.f522072o);
        this.f522068h.write(this.f522074q);
        this.f522074q = null;
        if (this.f522069i.getExtra() != null) {
            this.f522068h.write(this.f522069i.getExtra());
        }
        this.f522072o += i28 + this.f522078u;
        this.f522078u = 0;
        if (bArr.length > 0) {
            this.f522068h.write(bArr);
        }
        this.f522069i = null;
        crc32.reset();
        this.f522071n = 0L;
        ((java.util.zip.DeflaterOutputStream) this).def.reset();
    }

    public void b(java.util.zip.ZipEntry zipEntry) {
        int i17;
        if (this.f522069i != null) {
            a();
        }
        int method = zipEntry.getMethod();
        if (method == -1) {
            method = this.f522066f;
        }
        if (method == 0) {
            if (zipEntry.getCompressedSize() == -1) {
                zipEntry.setCompressedSize(zipEntry.getSize());
            } else if (zipEntry.getSize() == -1) {
                zipEntry.setSize(zipEntry.getCompressedSize());
            }
            if (zipEntry.getCrc() == -1) {
                throw new java.util.zip.ZipException("STORED entry missing CRC");
            }
            if (zipEntry.getSize() == -1) {
                throw new java.util.zip.ZipException("STORED entry missing size");
            }
            if (zipEntry.getSize() != zipEntry.getCompressedSize()) {
                throw new java.util.zip.ZipException("STORED entry size/compressed size mismatch");
            }
        }
        if (this.f522076s) {
            throw new java.io.IOException("Stream is closed");
        }
        java.util.HashSet hashSet = this.f522065e;
        if (hashSet.contains(zipEntry.getName())) {
            throw new java.util.zip.ZipException("Entry already exists: " + zipEntry.getName());
        }
        if (hashSet.size() == 65535) {
            throw new java.util.zip.ZipException("Too many entries for the zip file format's 16-bit entry count");
        }
        byte[] bytes = zipEntry.getName().getBytes(java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        this.f522074q = bytes;
        int length = bytes.length;
        this.f522073p = length;
        if (length > 65535) {
            throw new java.lang.IllegalArgumentException("Name too long: " + this.f522073p + " UTF-8 bytes");
        }
        ((java.util.zip.DeflaterOutputStream) this).def.setLevel(this.f522067g);
        zipEntry.setMethod(method);
        this.f522069i = zipEntry;
        hashSet.add(zipEntry.getName());
        int i18 = method == 0 ? 0 : 8;
        c(((java.util.zip.DeflaterOutputStream) this).out, 67324752L);
        f(((java.util.zip.DeflaterOutputStream) this).out, 20);
        f(((java.util.zip.DeflaterOutputStream) this).out, i18 | 2048);
        f(((java.util.zip.DeflaterOutputStream) this).out, method);
        if (this.f522069i.getTime() == -1) {
            this.f522069i.setTime(java.lang.System.currentTimeMillis());
        }
        f(((java.util.zip.DeflaterOutputStream) this).out, 0);
        f(((java.util.zip.DeflaterOutputStream) this).out, 33);
        if (method == 0) {
            c(((java.util.zip.DeflaterOutputStream) this).out, this.f522069i.getCrc());
            c(((java.util.zip.DeflaterOutputStream) this).out, this.f522069i.getSize());
            c(((java.util.zip.DeflaterOutputStream) this).out, this.f522069i.getSize());
        } else {
            c(((java.util.zip.DeflaterOutputStream) this).out, 0L);
            c(((java.util.zip.DeflaterOutputStream) this).out, 0L);
            c(((java.util.zip.DeflaterOutputStream) this).out, 0L);
        }
        f(((java.util.zip.DeflaterOutputStream) this).out, this.f522073p);
        this.f522078u = (this.f522069i.getMethod() != 0 || (i17 = this.f522077t) == 0) ? 0 : (i17 - ((((this.f522072o + 30) + this.f522073p) + (this.f522069i.getExtra() != null ? this.f522069i.getExtra().length : 0)) % i17)) % i17;
        if (this.f522069i.getExtra() != null) {
            f(((java.util.zip.DeflaterOutputStream) this).out, this.f522069i.getExtra().length + this.f522078u);
        } else {
            f(((java.util.zip.DeflaterOutputStream) this).out, this.f522078u);
        }
        ((java.util.zip.DeflaterOutputStream) this).out.write(this.f522074q);
        if (this.f522069i.getExtra() != null) {
            ((java.util.zip.DeflaterOutputStream) this).out.write(this.f522069i.getExtra());
        }
        java.io.OutputStream outputStream = ((java.util.zip.DeflaterOutputStream) this).out;
        int i19 = this.f522078u;
        if (i19 <= 0) {
            return;
        }
        while (true) {
            int i27 = i19 - 1;
            if (i19 <= 0) {
                return;
            }
            outputStream.write(0);
            i19 = i27;
        }
    }

    public final long c(java.io.OutputStream outputStream, long j17) {
        outputStream.write((int) (255 & j17));
        outputStream.write(((int) (j17 >> 8)) & 255);
        outputStream.write(((int) (j17 >> 16)) & 255);
        outputStream.write(((int) (j17 >> 24)) & 255);
        return j17;
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f522076s) {
            return;
        }
        finish();
        ((java.util.zip.DeflaterOutputStream) this).def.end();
        ((java.util.zip.DeflaterOutputStream) this).out.close();
        ((java.util.zip.DeflaterOutputStream) this).out = null;
        this.f522076s = true;
    }

    public final int f(java.io.OutputStream outputStream, int i17) {
        if (i17 <= 65535) {
            outputStream.write(i17 & 255);
            outputStream.write((i17 >> 8) & 255);
            return i17;
        }
        throw new java.lang.IllegalArgumentException("value " + i17 + " is too large for type 'short'.");
    }

    @Override // java.util.zip.DeflaterOutputStream
    public void finish() {
        if (this.f522076s) {
            throw new java.io.IOException("Stream is closed");
        }
        if (this.f522075r) {
            return;
        }
        java.util.HashSet hashSet = this.f522065e;
        if (hashSet.isEmpty()) {
            throw new java.util.zip.ZipException("No entries");
        }
        if (this.f522069i != null) {
            a();
        }
        int size = this.f522068h.size();
        c(this.f522068h, 101010256L);
        f(this.f522068h, 0);
        f(this.f522068h, 0);
        f(this.f522068h, hashSet.size());
        f(this.f522068h, hashSet.size());
        c(this.f522068h, size);
        c(this.f522068h, this.f522072o + this.f522078u);
        java.io.ByteArrayOutputStream byteArrayOutputStream = this.f522068h;
        byte[] bArr = this.f522064d;
        f(byteArrayOutputStream, bArr.length);
        if (bArr.length > 0) {
            this.f522068h.write(bArr);
        }
        this.f522068h.writeTo(((java.util.zip.DeflaterOutputStream) this).out);
        this.f522068h = null;
        this.f522075r = true;
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i17) {
        byte[] bArr = f522063w;
        bArr[0] = (byte) (i17 & 255);
        write(bArr, 0, 1);
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        int length = bArr.length;
        if ((i17 | i18) >= 0 && i17 <= length && length - i17 >= i18) {
            java.util.zip.ZipEntry zipEntry = this.f522069i;
            if (zipEntry != null) {
                if (zipEntry.getMethod() == 0) {
                    ((java.util.zip.DeflaterOutputStream) this).out.write(bArr, i17, i18);
                } else {
                    super.write(bArr, i17, i18);
                }
                this.f522070m.update(bArr, i17, i18);
                this.f522071n += i18;
                return;
            }
            throw new java.util.zip.ZipException("No active entry");
        }
        throw new java.lang.ArrayIndexOutOfBoundsException("length=" + length + "; regionStart=" + i17 + "; regionLength=" + i18);
    }
}
