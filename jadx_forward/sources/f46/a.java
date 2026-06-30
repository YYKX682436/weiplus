package f46;

/* loaded from: classes13.dex */
public class a extends a46.b {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f341091q = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.InputStream f341092e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f341093f;

    /* renamed from: h, reason: collision with root package name */
    public int f341095h;

    /* renamed from: n, reason: collision with root package name */
    public boolean f341098n;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f341094g = new byte[8192];

    /* renamed from: i, reason: collision with root package name */
    public java.util.zip.Inflater f341096i = new java.util.zip.Inflater(true);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.zip.CRC32 f341097m = new java.util.zip.CRC32();

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f341099o = new byte[1];

    /* renamed from: p, reason: collision with root package name */
    public final f46.b f341100p = new f46.b();

    public a(java.io.InputStream inputStream, boolean z17) {
        r46.g gVar = new r46.g(inputStream);
        if (gVar.markSupported()) {
            this.f341092e = gVar;
        } else {
            this.f341092e = new java.io.BufferedInputStream(gVar);
        }
        this.f341093f = z17;
        b(true);
    }

    public static byte[] c(java.io.DataInput dataInput) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        while (true) {
            try {
                int readUnsignedByte = dataInput.readUnsignedByte();
                if (readUnsignedByte == 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(readUnsignedByte);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Throwable th8) {
                        th6.addSuppressed(th8);
                    }
                    throw th7;
                }
            }
        }
    }

    public final boolean b(boolean z17) {
        java.io.InputStream inputStream = this.f341092e;
        int read = inputStream.read();
        if (read == -1 && !z17) {
            return false;
        }
        if (read != 31 || inputStream.read() != 139) {
            throw new java.io.IOException(z17 ? "Input is not in the .gz format" : "Garbage after a valid .gz stream");
        }
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if (readUnsignedByte != 8) {
            throw new java.io.IOException("Unsupported compression method " + readUnsignedByte + " in the .gz header");
        }
        int readUnsignedByte2 = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte2 & 224) != 0) {
            throw new java.io.IOException("Reserved flags are set in the .gz header");
        }
        r46.d.a(dataInputStream, 4);
        this.f341100p.getClass();
        dataInputStream.readUnsignedByte();
        dataInputStream.readUnsignedByte();
        if ((readUnsignedByte2 & 4) != 0) {
            int readUnsignedByte3 = (dataInputStream.readUnsignedByte() << 8) | dataInputStream.readUnsignedByte();
            while (true) {
                int i17 = readUnsignedByte3 - 1;
                if (readUnsignedByte3 <= 0) {
                    break;
                }
                dataInputStream.readUnsignedByte();
                readUnsignedByte3 = i17;
            }
        }
        if ((readUnsignedByte2 & 8) != 0) {
            new java.lang.String(c(dataInputStream), java.nio.charset.StandardCharsets.ISO_8859_1);
        }
        if ((readUnsignedByte2 & 16) != 0) {
            new java.lang.String(c(dataInputStream), java.nio.charset.StandardCharsets.ISO_8859_1);
        }
        if ((readUnsignedByte2 & 2) != 0) {
            dataInputStream.readShort();
        }
        this.f341096i.reset();
        this.f341097m.reset();
        return true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.util.zip.Inflater inflater = this.f341096i;
        if (inflater != null) {
            inflater.end();
            this.f341096i = null;
        }
        java.io.InputStream inputStream = this.f341092e;
        if (inputStream != java.lang.System.in) {
            inputStream.close();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f341099o;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        if (this.f341098n) {
            return -1;
        }
        int i19 = 0;
        while (i18 > 0) {
            boolean needsInput = this.f341096i.needsInput();
            java.io.InputStream inputStream = this.f341092e;
            if (needsInput) {
                byte[] bArr2 = this.f341094g;
                inputStream.mark(bArr2.length);
                int read = inputStream.read(bArr2);
                this.f341095h = read;
                if (read != -1) {
                    this.f341096i.setInput(bArr2, 0, read);
                } else {
                    throw new java.io.EOFException();
                }
            }
            try {
                int inflate = this.f341096i.inflate(bArr, i17, i18);
                java.util.zip.CRC32 crc32 = this.f341097m;
                crc32.update(bArr, i17, inflate);
                i17 += inflate;
                i18 -= inflate;
                i19 += inflate;
                a(inflate);
                if (this.f341096i.finished()) {
                    inputStream.reset();
                    long remaining = this.f341095h - this.f341096i.getRemaining();
                    if (r46.h.b(inputStream, remaining) == remaining) {
                        this.f341095h = 0;
                        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
                        if (r46.d.a(dataInputStream, 4) != crc32.getValue()) {
                            throw new java.io.IOException("Gzip-compressed data is corrupt (CRC32 error)");
                        }
                        if (r46.d.a(dataInputStream, 4) == (this.f341096i.getBytesWritten() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2)) {
                            if (!this.f341093f || !b(false)) {
                                this.f341096i.end();
                                this.f341096i = null;
                                this.f341098n = true;
                                if (i19 == 0) {
                                    return -1;
                                }
                                return i19;
                            }
                        } else {
                            throw new java.io.IOException("Gzip-compressed data is corrupt(uncompressed size mismatch)");
                        }
                    } else {
                        throw new java.io.IOException();
                    }
                }
            } catch (java.util.zip.DataFormatException unused) {
                throw new java.io.IOException("Gzip-compressed data is corrupt");
            }
        }
        return i19;
    }
}
