package androidx.camera.core.impl.utils;

/* loaded from: classes13.dex */
final class ByteOrderedDataInputStream extends java.io.InputStream implements java.io.DataInput {
    private java.nio.ByteOrder mByteOrder;
    private final java.io.DataInputStream mDataInputStream;
    final int mLength;
    int mPosition;
    private static final java.nio.ByteOrder LITTLE_ENDIAN = java.nio.ByteOrder.LITTLE_ENDIAN;
    private static final java.nio.ByteOrder BIG_ENDIAN = java.nio.ByteOrder.BIG_ENDIAN;

    public ByteOrderedDataInputStream(java.io.InputStream inputStream) {
        this(inputStream, java.nio.ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.mDataInputStream.available();
    }

    public int getLength() {
        return this.mLength;
    }

    @Override // java.io.InputStream
    public void mark(int i17) {
        synchronized (this.mDataInputStream) {
            this.mDataInputStream.mark(i17);
        }
    }

    public int peek() {
        return this.mPosition;
    }

    @Override // java.io.InputStream
    public int read() {
        this.mPosition++;
        return this.mDataInputStream.read();
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        this.mPosition++;
        return this.mDataInputStream.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() {
        int i17 = this.mPosition + 1;
        this.mPosition = i17;
        if (i17 > this.mLength) {
            throw new java.io.EOFException();
        }
        int read = this.mDataInputStream.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() {
        this.mPosition += 2;
        return this.mDataInputStream.readChar();
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
        int i19 = this.mPosition + i18;
        this.mPosition = i19;
        if (i19 <= this.mLength) {
            if (this.mDataInputStream.read(bArr, i17, i18) != i18) {
                throw new java.io.IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.DataInput
    public int readInt() {
        int i17 = this.mPosition + 4;
        this.mPosition = i17;
        if (i17 > this.mLength) {
            throw new java.io.EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        int read3 = this.mDataInputStream.read();
        int read4 = this.mDataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new java.io.IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public java.lang.String readLine() {
        throw new java.lang.UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public long readLong() {
        int i17 = this.mPosition + 8;
        this.mPosition = i17;
        if (i17 > this.mLength) {
            throw new java.io.EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        int read3 = this.mDataInputStream.read();
        int read4 = this.mDataInputStream.read();
        int read5 = this.mDataInputStream.read();
        int read6 = this.mDataInputStream.read();
        int read7 = this.mDataInputStream.read();
        int read8 = this.mDataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        throw new java.io.IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public short readShort() {
        int i17 = this.mPosition + 2;
        this.mPosition = i17;
        if (i17 > this.mLength) {
            throw new java.io.EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        if ((read | read2) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new java.io.IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public java.lang.String readUTF() {
        this.mPosition += 2;
        return this.mDataInputStream.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        this.mPosition++;
        return this.mDataInputStream.readUnsignedByte();
    }

    public long readUnsignedInt() {
        return readInt() & io.flutter.embedding.android.KeyboardMap.kValueMask;
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() {
        int i17 = this.mPosition + 2;
        this.mPosition = i17;
        if (i17 > this.mLength) {
            throw new java.io.EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        if ((read | read2) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new java.io.IOException("Invalid byte order: " + this.mByteOrder);
    }

    public void seek(long j17) {
        int i17 = this.mPosition;
        if (i17 > j17) {
            this.mPosition = 0;
            this.mDataInputStream.reset();
            this.mDataInputStream.mark(this.mLength);
        } else {
            j17 -= i17;
        }
        int i18 = (int) j17;
        if (skipBytes(i18) != i18) {
            throw new java.io.IOException("Couldn't seek up to the byteCount");
        }
    }

    public void setByteOrder(java.nio.ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.DataInput
    public int skipBytes(int i17) {
        int min = java.lang.Math.min(i17, this.mLength - this.mPosition);
        int i18 = 0;
        while (i18 < min) {
            i18 += this.mDataInputStream.skipBytes(min - i18);
        }
        this.mPosition += i18;
        return i18;
    }

    public ByteOrderedDataInputStream(java.io.InputStream inputStream, java.nio.ByteOrder byteOrder) {
        this.mByteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
        this.mDataInputStream = dataInputStream;
        int available = dataInputStream.available();
        this.mLength = available;
        this.mPosition = 0;
        dataInputStream.mark(available);
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int read = this.mDataInputStream.read(bArr, i17, i18);
        this.mPosition += read;
        return read;
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) {
        int length = this.mPosition + bArr.length;
        this.mPosition = length;
        if (length <= this.mLength) {
            if (this.mDataInputStream.read(bArr, 0, bArr.length) != bArr.length) {
                throw new java.io.IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new java.io.EOFException();
    }

    public ByteOrderedDataInputStream(byte[] bArr) {
        this(new java.io.ByteArrayInputStream(bArr));
    }
}
