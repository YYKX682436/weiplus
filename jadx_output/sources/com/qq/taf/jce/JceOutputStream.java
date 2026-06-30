package com.qq.taf.jce;

/* loaded from: classes13.dex */
public class JceOutputStream {

    /* renamed from: bs, reason: collision with root package name */
    private java.nio.ByteBuffer f45819bs;
    protected java.lang.String sServerEncoding;

    public JceOutputStream(java.nio.ByteBuffer byteBuffer) {
        this.sServerEncoding = "GBK";
        this.f45819bs = byteBuffer;
    }

    public static void main(java.lang.String[] strArr) {
        com.qq.taf.jce.JceOutputStream jceOutputStream = new com.qq.taf.jce.JceOutputStream();
        jceOutputStream.write(1311768467283714885L, 0);
        java.lang.System.out.println(com.qq.taf.jce.HexUtil.bytes2HexStr(jceOutputStream.getByteBuffer().array()));
        java.lang.System.out.println(java.util.Arrays.toString(jceOutputStream.toByteArray()));
    }

    private void writeArray(java.lang.Object[] objArr, int i17) {
        reserve(8);
        writeHead((byte) 9, i17);
        write(objArr.length, 0);
        for (java.lang.Object obj : objArr) {
            write(obj, 0);
        }
    }

    public java.nio.ByteBuffer getByteBuffer() {
        return this.f45819bs;
    }

    public void reserve(int i17) {
        if (this.f45819bs.remaining() < i17) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate((this.f45819bs.capacity() + i17) * 2);
            allocate.put(this.f45819bs.array(), 0, this.f45819bs.position());
            this.f45819bs = allocate;
        }
    }

    public int setServerEncoding(java.lang.String str) {
        this.sServerEncoding = str;
        return 0;
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[this.f45819bs.position()];
        java.lang.System.arraycopy(this.f45819bs.array(), 0, bArr, 0, this.f45819bs.position());
        return bArr;
    }

    public void write(boolean z17, int i17) {
        write(z17 ? (byte) 1 : (byte) 0, i17);
    }

    public void writeByteString(java.lang.String str, int i17) {
        reserve(str.length() + 10);
        byte[] hexStr2Bytes = com.qq.taf.jce.HexUtil.hexStr2Bytes(str);
        if (hexStr2Bytes.length > 255) {
            writeHead((byte) 7, i17);
            this.f45819bs.putInt(hexStr2Bytes.length);
            this.f45819bs.put(hexStr2Bytes);
        } else {
            writeHead((byte) 6, i17);
            this.f45819bs.put((byte) hexStr2Bytes.length);
            this.f45819bs.put(hexStr2Bytes);
        }
    }

    public void writeHead(byte b17, int i17) {
        if (i17 < 15) {
            this.f45819bs.put((byte) (b17 | (i17 << 4)));
        } else {
            if (i17 >= 256) {
                throw new com.qq.taf.jce.JceEncodeException("tag is too large: " + i17);
            }
            this.f45819bs.put((byte) (b17 | 240));
            this.f45819bs.put((byte) i17);
        }
    }

    public void writeStringByte(java.lang.String str, int i17) {
        byte[] hexStr2Bytes = com.qq.taf.jce.HexUtil.hexStr2Bytes(str);
        reserve(hexStr2Bytes.length + 10);
        if (hexStr2Bytes.length > 255) {
            writeHead((byte) 7, i17);
            this.f45819bs.putInt(hexStr2Bytes.length);
            this.f45819bs.put(hexStr2Bytes);
        } else {
            writeHead((byte) 6, i17);
            this.f45819bs.put((byte) hexStr2Bytes.length);
            this.f45819bs.put(hexStr2Bytes);
        }
    }

    public void write(byte b17, int i17) {
        reserve(3);
        if (b17 == 0) {
            writeHead((byte) 12, i17);
        } else {
            writeHead((byte) 0, i17);
            this.f45819bs.put(b17);
        }
    }

    public JceOutputStream(int i17) {
        this.sServerEncoding = "GBK";
        this.f45819bs = java.nio.ByteBuffer.allocate(i17);
    }

    public void write(short s17, int i17) {
        reserve(4);
        if (s17 >= -128 && s17 <= 127) {
            write((byte) s17, i17);
        } else {
            writeHead((byte) 1, i17);
            this.f45819bs.putShort(s17);
        }
    }

    public JceOutputStream() {
        this(128);
    }

    public void write(int i17, int i18) {
        reserve(6);
        if (i17 >= -32768 && i17 <= 32767) {
            write((short) i17, i18);
        } else {
            writeHead((byte) 2, i18);
            this.f45819bs.putInt(i17);
        }
    }

    public void write(long j17, int i17) {
        reserve(10);
        if (j17 >= -2147483648L && j17 <= 2147483647L) {
            write((int) j17, i17);
        } else {
            writeHead((byte) 3, i17);
            this.f45819bs.putLong(j17);
        }
    }

    public void write(float f17, int i17) {
        reserve(6);
        writeHead((byte) 4, i17);
        this.f45819bs.putFloat(f17);
    }

    public void write(double d17, int i17) {
        reserve(10);
        writeHead((byte) 5, i17);
        this.f45819bs.putDouble(d17);
    }

    public void write(java.lang.String str, int i17) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.sServerEncoding);
        } catch (java.io.UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        reserve(bytes.length + 10);
        if (bytes.length > 255) {
            writeHead((byte) 7, i17);
            this.f45819bs.putInt(bytes.length);
            this.f45819bs.put(bytes);
        } else {
            writeHead((byte) 6, i17);
            this.f45819bs.put((byte) bytes.length);
            this.f45819bs.put(bytes);
        }
    }

    public <K, V> void write(java.util.Map<K, V> map, int i17) {
        reserve(8);
        writeHead((byte) 8, i17);
        write(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                write(entry.getKey(), 0);
                write(entry.getValue(), 1);
            }
        }
    }

    public void write(boolean[] zArr, int i17) {
        reserve(8);
        writeHead((byte) 9, i17);
        write(zArr.length, 0);
        for (boolean z17 : zArr) {
            write(z17, 0);
        }
    }

    public void write(byte[] bArr, int i17) {
        reserve(bArr.length + 8);
        writeHead((byte) 13, i17);
        writeHead((byte) 0, 0);
        write(bArr.length, 0);
        this.f45819bs.put(bArr);
    }

    public void write(short[] sArr, int i17) {
        reserve(8);
        writeHead((byte) 9, i17);
        write(sArr.length, 0);
        for (short s17 : sArr) {
            write(s17, 0);
        }
    }

    public void write(int[] iArr, int i17) {
        reserve(8);
        writeHead((byte) 9, i17);
        write(iArr.length, 0);
        for (int i18 : iArr) {
            write(i18, 0);
        }
    }

    public void write(long[] jArr, int i17) {
        reserve(8);
        writeHead((byte) 9, i17);
        write(jArr.length, 0);
        for (long j17 : jArr) {
            write(j17, 0);
        }
    }

    public void write(float[] fArr, int i17) {
        reserve(8);
        writeHead((byte) 9, i17);
        write(fArr.length, 0);
        for (float f17 : fArr) {
            write(f17, 0);
        }
    }

    public void write(double[] dArr, int i17) {
        reserve(8);
        writeHead((byte) 9, i17);
        write(dArr.length, 0);
        for (double d17 : dArr) {
            write(d17, 0);
        }
    }

    public <T> void write(T[] tArr, int i17) {
        writeArray(tArr, i17);
    }

    public <T> void write(java.util.Collection<T> collection, int i17) {
        reserve(8);
        writeHead((byte) 9, i17);
        write(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                write(it.next(), 0);
            }
        }
    }

    public void write(com.qq.taf.jce.JceStruct jceStruct, int i17) {
        reserve(2);
        writeHead((byte) 10, i17);
        jceStruct.writeTo(this);
        reserve(2);
        writeHead((byte) 11, 0);
    }

    public void write(java.lang.Byte b17, int i17) {
        write(b17.byteValue(), i17);
    }

    public void write(java.lang.Boolean bool, int i17) {
        write(bool.booleanValue(), i17);
    }

    public void write(java.lang.Short sh6, int i17) {
        write(sh6.shortValue(), i17);
    }

    public void write(java.lang.Integer num, int i17) {
        write(num.intValue(), i17);
    }

    public void write(java.lang.Long l17, int i17) {
        write(l17.longValue(), i17);
    }

    public void write(java.lang.Float f17, int i17) {
        write(f17.floatValue(), i17);
    }

    public void write(java.lang.Double d17, int i17) {
        write(d17.doubleValue(), i17);
    }

    public void write(java.lang.Object obj, int i17) {
        if (obj instanceof java.lang.Byte) {
            write(((java.lang.Byte) obj).byteValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            write(((java.lang.Boolean) obj).booleanValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Short) {
            write(((java.lang.Short) obj).shortValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Integer) {
            write(((java.lang.Integer) obj).intValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Long) {
            write(((java.lang.Long) obj).longValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Float) {
            write(((java.lang.Float) obj).floatValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Double) {
            write(((java.lang.Double) obj).doubleValue(), i17);
            return;
        }
        if (obj instanceof java.lang.String) {
            write((java.lang.String) obj, i17);
            return;
        }
        if (obj instanceof java.util.Map) {
            write((java.util.Map) obj, i17);
            return;
        }
        if (obj instanceof java.util.List) {
            write((java.util.Collection) obj, i17);
            return;
        }
        if (obj instanceof com.qq.taf.jce.JceStruct) {
            write((com.qq.taf.jce.JceStruct) obj, i17);
            return;
        }
        if (obj instanceof byte[]) {
            write((byte[]) obj, i17);
            return;
        }
        if (obj instanceof boolean[]) {
            write((boolean[]) obj, i17);
            return;
        }
        if (obj instanceof short[]) {
            write((short[]) obj, i17);
            return;
        }
        if (obj instanceof int[]) {
            write((int[]) obj, i17);
            return;
        }
        if (obj instanceof long[]) {
            write((long[]) obj, i17);
            return;
        }
        if (obj instanceof float[]) {
            write((float[]) obj, i17);
            return;
        }
        if (obj instanceof double[]) {
            write((double[]) obj, i17);
            return;
        }
        if (obj.getClass().isArray()) {
            writeArray((java.lang.Object[]) obj, i17);
        } else if (obj instanceof java.util.Collection) {
            write((java.util.Collection) obj, i17);
        } else {
            throw new com.qq.taf.jce.JceEncodeException("write object error: unsupport type. " + obj.getClass());
        }
    }
}
