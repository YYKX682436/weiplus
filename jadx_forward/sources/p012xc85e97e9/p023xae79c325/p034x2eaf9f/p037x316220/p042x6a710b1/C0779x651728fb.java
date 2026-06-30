package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.ByteOrderedDataInputStream */
/* loaded from: classes13.dex */
final class C0779x651728fb extends java.io.InputStream implements java.io.DataInput {

    /* renamed from: mByteOrder */
    private java.nio.ByteOrder f1861xff92e539;

    /* renamed from: mDataInputStream */
    private final java.io.DataInputStream f1862xcd486db3;

    /* renamed from: mLength */
    final int f1863xd7a61b3;

    /* renamed from: mPosition */
    int f1864x519040b6;

    /* renamed from: LITTLE_ENDIAN */
    private static final java.nio.ByteOrder f1860x234d7504 = java.nio.ByteOrder.LITTLE_ENDIAN;

    /* renamed from: BIG_ENDIAN */
    private static final java.nio.ByteOrder f1859x2d7fcfda = java.nio.ByteOrder.BIG_ENDIAN;

    public C0779x651728fb(java.io.InputStream inputStream) {
        this(inputStream, java.nio.ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f1862xcd486db3.available();
    }

    /* renamed from: getLength */
    public int m5795x23255ddc() {
        return this.f1863xd7a61b3;
    }

    @Override // java.io.InputStream
    public void mark(int i17) {
        synchronized (this.f1862xcd486db3) {
            this.f1862xcd486db3.mark(i17);
        }
    }

    /* renamed from: peek */
    public int m5796x34715b() {
        return this.f1864x519040b6;
    }

    @Override // java.io.InputStream
    public int read() {
        this.f1864x519040b6++;
        return this.f1862xcd486db3.read();
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        this.f1864x519040b6++;
        return this.f1862xcd486db3.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() {
        int i17 = this.f1864x519040b6 + 1;
        this.f1864x519040b6 = i17;
        if (i17 > this.f1863xd7a61b3) {
            throw new java.io.EOFException();
        }
        int read = this.f1862xcd486db3.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() {
        this.f1864x519040b6 += 2;
        return this.f1862xcd486db3.readChar();
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
        int i19 = this.f1864x519040b6 + i18;
        this.f1864x519040b6 = i19;
        if (i19 <= this.f1863xd7a61b3) {
            if (this.f1862xcd486db3.read(bArr, i17, i18) != i18) {
                throw new java.io.IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.DataInput
    public int readInt() {
        int i17 = this.f1864x519040b6 + 4;
        this.f1864x519040b6 = i17;
        if (i17 > this.f1863xd7a61b3) {
            throw new java.io.EOFException();
        }
        int read = this.f1862xcd486db3.read();
        int read2 = this.f1862xcd486db3.read();
        int read3 = this.f1862xcd486db3.read();
        int read4 = this.f1862xcd486db3.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f1861xff92e539;
        if (byteOrder == f1860x234d7504) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == f1859x2d7fcfda) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new java.io.IOException("Invalid byte order: " + this.f1861xff92e539);
    }

    @Override // java.io.DataInput
    public java.lang.String readLine() {
        throw new java.lang.UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public long readLong() {
        int i17 = this.f1864x519040b6 + 8;
        this.f1864x519040b6 = i17;
        if (i17 > this.f1863xd7a61b3) {
            throw new java.io.EOFException();
        }
        int read = this.f1862xcd486db3.read();
        int read2 = this.f1862xcd486db3.read();
        int read3 = this.f1862xcd486db3.read();
        int read4 = this.f1862xcd486db3.read();
        int read5 = this.f1862xcd486db3.read();
        int read6 = this.f1862xcd486db3.read();
        int read7 = this.f1862xcd486db3.read();
        int read8 = this.f1862xcd486db3.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f1861xff92e539;
        if (byteOrder == f1860x234d7504) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == f1859x2d7fcfda) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        throw new java.io.IOException("Invalid byte order: " + this.f1861xff92e539);
    }

    @Override // java.io.DataInput
    public short readShort() {
        int i17 = this.f1864x519040b6 + 2;
        this.f1864x519040b6 = i17;
        if (i17 > this.f1863xd7a61b3) {
            throw new java.io.EOFException();
        }
        int read = this.f1862xcd486db3.read();
        int read2 = this.f1862xcd486db3.read();
        if ((read | read2) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f1861xff92e539;
        if (byteOrder == f1860x234d7504) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == f1859x2d7fcfda) {
            return (short) ((read << 8) + read2);
        }
        throw new java.io.IOException("Invalid byte order: " + this.f1861xff92e539);
    }

    @Override // java.io.DataInput
    public java.lang.String readUTF() {
        this.f1864x519040b6 += 2;
        return this.f1862xcd486db3.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        this.f1864x519040b6++;
        return this.f1862xcd486db3.readUnsignedByte();
    }

    /* renamed from: readUnsignedInt */
    public long m5797x28ebed44() {
        return readInt() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() {
        int i17 = this.f1864x519040b6 + 2;
        this.f1864x519040b6 = i17;
        if (i17 > this.f1863xd7a61b3) {
            throw new java.io.EOFException();
        }
        int read = this.f1862xcd486db3.read();
        int read2 = this.f1862xcd486db3.read();
        if ((read | read2) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f1861xff92e539;
        if (byteOrder == f1860x234d7504) {
            return (read2 << 8) + read;
        }
        if (byteOrder == f1859x2d7fcfda) {
            return (read << 8) + read2;
        }
        throw new java.io.IOException("Invalid byte order: " + this.f1861xff92e539);
    }

    /* renamed from: seek */
    public void m5798x35ce78(long j17) {
        int i17 = this.f1864x519040b6;
        if (i17 > j17) {
            this.f1864x519040b6 = 0;
            this.f1862xcd486db3.reset();
            this.f1862xcd486db3.mark(this.f1863xd7a61b3);
        } else {
            j17 -= i17;
        }
        int i18 = (int) j17;
        if (skipBytes(i18) != i18) {
            throw new java.io.IOException("Couldn't seek up to the byteCount");
        }
    }

    /* renamed from: setByteOrder */
    public void m5799xe09ccce4(java.nio.ByteOrder byteOrder) {
        this.f1861xff92e539 = byteOrder;
    }

    @Override // java.io.DataInput
    public int skipBytes(int i17) {
        int min = java.lang.Math.min(i17, this.f1863xd7a61b3 - this.f1864x519040b6);
        int i18 = 0;
        while (i18 < min) {
            i18 += this.f1862xcd486db3.skipBytes(min - i18);
        }
        this.f1864x519040b6 += i18;
        return i18;
    }

    public C0779x651728fb(java.io.InputStream inputStream, java.nio.ByteOrder byteOrder) {
        this.f1861xff92e539 = java.nio.ByteOrder.BIG_ENDIAN;
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
        this.f1862xcd486db3 = dataInputStream;
        int available = dataInputStream.available();
        this.f1863xd7a61b3 = available;
        this.f1864x519040b6 = 0;
        dataInputStream.mark(available);
        this.f1861xff92e539 = byteOrder;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int read = this.f1862xcd486db3.read(bArr, i17, i18);
        this.f1864x519040b6 += read;
        return read;
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) {
        int length = this.f1864x519040b6 + bArr.length;
        this.f1864x519040b6 = length;
        if (length <= this.f1863xd7a61b3) {
            if (this.f1862xcd486db3.read(bArr, 0, bArr.length) != bArr.length) {
                throw new java.io.IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new java.io.EOFException();
    }

    public C0779x651728fb(byte[] bArr) {
        this(new java.io.ByteArrayInputStream(bArr));
    }
}
