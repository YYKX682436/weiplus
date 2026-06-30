package androidx.exifinterface.media;

/* loaded from: classes13.dex */
public class b extends java.io.InputStream implements java.io.DataInput {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.DataInputStream f11177d;

    /* renamed from: e, reason: collision with root package name */
    public int f11178e;

    /* renamed from: f, reason: collision with root package name */
    public java.nio.ByteOrder f11179f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f11180g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11181h;

    public b(byte[] bArr) {
        this(new java.io.ByteArrayInputStream(bArr), java.nio.ByteOrder.BIG_ENDIAN);
        this.f11181h = bArr.length;
    }

    public void a(int i17) {
        int i18 = 0;
        while (i18 < i17) {
            java.io.DataInputStream dataInputStream = this.f11177d;
            int i19 = i17 - i18;
            int skip = (int) dataInputStream.skip(i19);
            if (skip <= 0) {
                if (this.f11180g == null) {
                    this.f11180g = new byte[8192];
                }
                skip = dataInputStream.read(this.f11180g, 0, java.lang.Math.min(8192, i19));
                if (skip == -1) {
                    throw new java.io.EOFException("Reached EOF while skipping " + i17 + " bytes.");
                }
            }
            i18 += skip;
        }
        this.f11178e += i18;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f11177d.available();
    }

    @Override // java.io.InputStream
    public void mark(int i17) {
        throw new java.lang.UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public int read() {
        this.f11178e++;
        return this.f11177d.read();
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        this.f11178e++;
        return this.f11177d.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() {
        this.f11178e++;
        int read = this.f11177d.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() {
        this.f11178e += 2;
        return this.f11177d.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return java.lang.Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return java.lang.Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i17, int i18) {
        this.f11178e += i18;
        this.f11177d.readFully(bArr, i17, i18);
    }

    @Override // java.io.DataInput
    public int readInt() {
        this.f11178e += 4;
        java.io.DataInputStream dataInputStream = this.f11177d;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f11179f;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new java.io.IOException("Invalid byte order: " + this.f11179f);
    }

    @Override // java.io.DataInput
    public java.lang.String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public long readLong() {
        this.f11178e += 8;
        java.io.DataInputStream dataInputStream = this.f11177d;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f11179f;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        throw new java.io.IOException("Invalid byte order: " + this.f11179f);
    }

    @Override // java.io.DataInput
    public short readShort() {
        this.f11178e += 2;
        java.io.DataInputStream dataInputStream = this.f11177d;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f11179f;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new java.io.IOException("Invalid byte order: " + this.f11179f);
    }

    @Override // java.io.DataInput
    public java.lang.String readUTF() {
        this.f11178e += 2;
        return this.f11177d.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        this.f11178e++;
        return this.f11177d.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() {
        this.f11178e += 2;
        java.io.DataInputStream dataInputStream = this.f11177d;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f11179f;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new java.io.IOException("Invalid byte order: " + this.f11179f);
    }

    @Override // java.io.InputStream
    public void reset() {
        throw new java.lang.UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public int skipBytes(int i17) {
        throw new java.lang.UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(java.io.InputStream inputStream) {
        this(inputStream, java.nio.ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int read = this.f11177d.read(bArr, i17, i18);
        this.f11178e += read;
        return read;
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) {
        this.f11178e += bArr.length;
        this.f11177d.readFully(bArr);
    }

    public b(java.io.InputStream inputStream, java.nio.ByteOrder byteOrder) {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
        this.f11177d = dataInputStream;
        dataInputStream.mark(0);
        this.f11178e = 0;
        this.f11179f = byteOrder;
        this.f11181h = inputStream instanceof androidx.exifinterface.media.b ? ((androidx.exifinterface.media.b) inputStream).f11181h : -1;
    }
}
