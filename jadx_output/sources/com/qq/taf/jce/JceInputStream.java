package com.qq.taf.jce;

/* loaded from: classes13.dex */
public final class JceInputStream {

    /* renamed from: bs, reason: collision with root package name */
    private java.nio.ByteBuffer f45818bs;
    protected java.lang.String sServerEncoding = "GBK";

    /* loaded from: classes13.dex */
    public static class HeadData {
        public int tag;
        public byte type;

        public void clear() {
            this.type = (byte) 0;
            this.tag = 0;
        }
    }

    public JceInputStream() {
    }

    public static void main(java.lang.String[] strArr) {
    }

    private int peakHead(com.qq.taf.jce.JceInputStream.HeadData headData) {
        return readHead(headData, this.f45818bs.duplicate());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T[] readArrayImpl(T t17, int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        if (headData.type != 9) {
            throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
        }
        int read = read(0, 0, true);
        if (read < 0) {
            throw new com.qq.taf.jce.JceDecodeException("size invalid: " + read);
        }
        T[] tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(t17.getClass(), read));
        for (int i18 = 0; i18 < read; i18++) {
            tArr[i18] = read((com.qq.taf.jce.JceInputStream) t17, 0, true);
        }
        return tArr;
    }

    public static int readHead(com.qq.taf.jce.JceInputStream.HeadData headData, java.nio.ByteBuffer byteBuffer) {
        byte b17 = byteBuffer.get();
        headData.type = (byte) (b17 & 15);
        int i17 = (b17 & 240) >> 4;
        headData.tag = i17;
        if (i17 != 15) {
            return 1;
        }
        headData.tag = byteBuffer.get() & 255;
        return 2;
    }

    private void skip(int i17) {
        java.nio.ByteBuffer byteBuffer = this.f45818bs;
        byteBuffer.position(byteBuffer.position() + i17);
    }

    private void skipField() {
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        skipField(headData.type);
    }

    public com.qq.taf.jce.JceStruct directRead(com.qq.taf.jce.JceStruct jceStruct, int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return null;
        }
        try {
            com.qq.taf.jce.JceStruct newInit = jceStruct.newInit();
            com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
            readHead(headData);
            if (headData.type != 10) {
                throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
            }
            newInit.readFrom(this);
            skipToStructEnd();
            return newInit;
        } catch (java.lang.Exception e17) {
            throw new com.qq.taf.jce.JceDecodeException(e17.getMessage());
        }
    }

    public java.nio.ByteBuffer getBs() {
        return this.f45818bs;
    }

    public boolean read(boolean z17, int i17, boolean z18) {
        return read((byte) 0, i17, z18) != 0;
    }

    public <T> T[] readArray(T[] tArr, int i17, boolean z17) {
        if (tArr != null && tArr.length != 0) {
            return (T[]) readArrayImpl(tArr[0], i17, z17);
        }
        throw new com.qq.taf.jce.JceDecodeException("unable to get type of key and value.");
    }

    public java.lang.String readByteString(java.lang.String str, int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return str;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        byte b17 = headData.type;
        if (b17 == 6) {
            int i18 = this.f45818bs.get();
            if (i18 < 0) {
                i18 += 256;
            }
            byte[] bArr = new byte[i18];
            this.f45818bs.get(bArr);
            return com.qq.taf.jce.HexUtil.bytes2HexStr(bArr);
        }
        if (b17 != 7) {
            throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
        }
        int i19 = this.f45818bs.getInt();
        if (i19 > 104857600 || i19 < 0) {
            throw new com.qq.taf.jce.JceDecodeException("String too long: " + i19);
        }
        byte[] bArr2 = new byte[i19];
        this.f45818bs.get(bArr2);
        return com.qq.taf.jce.HexUtil.bytes2HexStr(bArr2);
    }

    public java.util.List readList(int i17, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (skipToTag(i17)) {
            com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
            readHead(headData);
            if (headData.type != 9) {
                throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
            }
            int read = read(0, 0, true);
            if (read < 0) {
                throw new com.qq.taf.jce.JceDecodeException("size invalid: " + read);
            }
            for (int i18 = 0; i18 < read; i18++) {
                com.qq.taf.jce.JceInputStream.HeadData headData2 = new com.qq.taf.jce.JceInputStream.HeadData();
                readHead(headData2);
                switch (headData2.type) {
                    case 0:
                        skip(1);
                        break;
                    case 1:
                        skip(2);
                        break;
                    case 2:
                        skip(4);
                        break;
                    case 3:
                        skip(8);
                        break;
                    case 4:
                        skip(4);
                        break;
                    case 5:
                        skip(8);
                        break;
                    case 6:
                        int i19 = this.f45818bs.get();
                        if (i19 < 0) {
                            i19 += 256;
                        }
                        skip(i19);
                        break;
                    case 7:
                        skip(this.f45818bs.getInt());
                        break;
                    case 8:
                    case 9:
                        break;
                    case 10:
                        try {
                            com.qq.taf.jce.JceStruct jceStruct = (com.qq.taf.jce.JceStruct) java.lang.Class.forName(com.qq.taf.jce.JceStruct.class.getName()).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                            jceStruct.readFrom(this);
                            skipToStructEnd();
                            arrayList.add(jceStruct);
                            break;
                        } catch (java.lang.Exception e17) {
                            throw new com.qq.taf.jce.JceDecodeException("type mismatch." + e17);
                        }
                    case 11:
                    default:
                        throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
                    case 12:
                        arrayList.add(new java.lang.Integer(0));
                        break;
                }
            }
        } else if (z17) {
            throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
        }
        return arrayList;
    }

    public <K, V> java.util.HashMap<K, V> readMap(java.util.Map<K, V> map, int i17, boolean z17) {
        return (java.util.HashMap) readMap(new java.util.HashMap(), map, i17, z17);
    }

    public java.lang.String readString(int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        byte b17 = headData.type;
        if (b17 == 6) {
            int i18 = this.f45818bs.get();
            if (i18 < 0) {
                i18 += 256;
            }
            byte[] bArr = new byte[i18];
            this.f45818bs.get(bArr);
            try {
                return new java.lang.String(bArr, this.sServerEncoding);
            } catch (java.io.UnsupportedEncodingException unused) {
                return new java.lang.String(bArr);
            }
        }
        if (b17 != 7) {
            throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
        }
        int i19 = this.f45818bs.getInt();
        if (i19 > 104857600 || i19 < 0) {
            throw new com.qq.taf.jce.JceDecodeException("String too long: " + i19);
        }
        byte[] bArr2 = new byte[i19];
        this.f45818bs.get(bArr2);
        try {
            return new java.lang.String(bArr2, this.sServerEncoding);
        } catch (java.io.UnsupportedEncodingException unused2) {
            return new java.lang.String(bArr2);
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> readStringMap(int i17, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (skipToTag(i17)) {
            com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
            readHead(headData);
            if (headData.type != 8) {
                throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
            }
            int read = read(0, 0, true);
            if (read < 0) {
                throw new com.qq.taf.jce.JceDecodeException("size invalid: " + read);
            }
            for (int i18 = 0; i18 < read; i18++) {
                hashMap.put(readString(0, true), readString(1, true));
            }
        } else if (z17) {
            throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
        }
        return hashMap;
    }

    public int setServerEncoding(java.lang.String str) {
        this.sServerEncoding = str;
        return 0;
    }

    public void skipToStructEnd() {
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        do {
            readHead(headData);
            skipField(headData.type);
        } while (headData.type != 11);
    }

    public boolean skipToTag(int i17) {
        int i18;
        try {
            com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
            while (true) {
                int peakHead = peakHead(headData);
                i18 = headData.tag;
                if (i17 <= i18 || headData.type == 11) {
                    break;
                }
                skip(peakHead);
                skipField(headData.type);
            }
        } catch (com.qq.taf.jce.JceDecodeException | java.nio.BufferUnderflowException unused) {
        }
        return i17 == i18;
    }

    public void warp(byte[] bArr) {
        wrap(bArr);
    }

    public void wrap(byte[] bArr) {
        this.f45818bs = java.nio.ByteBuffer.wrap(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> java.util.Map<K, V> readMap(java.util.Map<K, V> map, java.util.Map<K, V> map2, int i17, boolean z17) {
        if (map2 != null && !map2.isEmpty()) {
            java.util.Map.Entry<K, V> next = map2.entrySet().iterator().next();
            K key = next.getKey();
            V value = next.getValue();
            if (skipToTag(i17)) {
                com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
                readHead(headData);
                if (headData.type == 8) {
                    int read = read(0, 0, true);
                    if (read < 0) {
                        throw new com.qq.taf.jce.JceDecodeException("size invalid: " + read);
                    }
                    for (int i18 = 0; i18 < read; i18++) {
                        map.put(read((com.qq.taf.jce.JceInputStream) key, 0, true), read((com.qq.taf.jce.JceInputStream) value, 1, true));
                    }
                } else {
                    throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
                }
            } else if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return map;
        }
        return new java.util.HashMap();
    }

    public byte read(byte b17, int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return b17;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        byte b18 = headData.type;
        if (b18 == 0) {
            return this.f45818bs.get();
        }
        if (b18 == 12) {
            return (byte) 0;
        }
        throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
    }

    public JceInputStream(java.nio.ByteBuffer byteBuffer) {
        this.f45818bs = byteBuffer;
    }

    private void skipField(byte b17) {
        int i17 = 0;
        switch (b17) {
            case 0:
                skip(1);
                return;
            case 1:
                skip(2);
                return;
            case 2:
                skip(4);
                return;
            case 3:
                skip(8);
                return;
            case 4:
                skip(4);
                return;
            case 5:
                skip(8);
                return;
            case 6:
                int i18 = this.f45818bs.get();
                if (i18 < 0) {
                    i18 += 256;
                }
                skip(i18);
                return;
            case 7:
                skip(this.f45818bs.getInt());
                return;
            case 8:
                int read = read(0, 0, true);
                while (i17 < read * 2) {
                    skipField();
                    i17++;
                }
                return;
            case 9:
                int read2 = read(0, 0, true);
                while (i17 < read2) {
                    skipField();
                    i17++;
                }
                return;
            case 10:
                skipToStructEnd();
                return;
            case 11:
            case 12:
                return;
            case 13:
                com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
                readHead(headData);
                if (headData.type == 0) {
                    skip(read(0, 0, true));
                    return;
                }
                throw new com.qq.taf.jce.JceDecodeException("skipField with invalid type, type value: " + ((int) b17) + ", " + ((int) headData.type));
            default:
                throw new com.qq.taf.jce.JceDecodeException("invalid type.");
        }
    }

    public <T> java.util.List<T> readArray(java.util.List<T> list, int i17, boolean z17) {
        if (list != null && !list.isEmpty()) {
            java.lang.Object[] readArrayImpl = readArrayImpl(list.get(0), i17, z17);
            if (readArrayImpl == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : readArrayImpl) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        return new java.util.ArrayList();
    }

    public void readHead(com.qq.taf.jce.JceInputStream.HeadData headData) {
        readHead(headData, this.f45818bs);
    }

    public JceInputStream(byte[] bArr) {
        this.f45818bs = java.nio.ByteBuffer.wrap(bArr);
    }

    public JceInputStream(byte[] bArr, int i17) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        this.f45818bs = wrap;
        wrap.position(i17);
    }

    public short read(short s17, int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return s17;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        byte b17 = headData.type;
        if (b17 == 0) {
            return this.f45818bs.get();
        }
        if (b17 == 1) {
            return this.f45818bs.getShort();
        }
        if (b17 == 12) {
            return (short) 0;
        }
        throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
    }

    public int read(int i17, int i18, boolean z17) {
        if (!skipToTag(i18)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return i17;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        byte b17 = headData.type;
        if (b17 == 0) {
            return this.f45818bs.get();
        }
        if (b17 == 1) {
            return this.f45818bs.getShort();
        }
        if (b17 == 2) {
            return this.f45818bs.getInt();
        }
        if (b17 == 12) {
            return 0;
        }
        throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
    }

    public long read(long j17, int i17, boolean z17) {
        int i18;
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return j17;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        byte b17 = headData.type;
        if (b17 == 0) {
            i18 = this.f45818bs.get();
        } else if (b17 == 1) {
            i18 = this.f45818bs.getShort();
        } else {
            if (b17 != 2) {
                if (b17 == 3) {
                    return this.f45818bs.getLong();
                }
                if (b17 == 12) {
                    return 0L;
                }
                throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
            }
            i18 = this.f45818bs.getInt();
        }
        return i18;
    }

    public float read(float f17, int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return f17;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        byte b17 = headData.type;
        if (b17 == 4) {
            return this.f45818bs.getFloat();
        }
        if (b17 == 12) {
            return 0.0f;
        }
        throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
    }

    public double read(double d17, int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return d17;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        byte b17 = headData.type;
        if (b17 == 4) {
            return this.f45818bs.getFloat();
        }
        if (b17 == 5) {
            return this.f45818bs.getDouble();
        }
        if (b17 == 12) {
            return 0.0d;
        }
        throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
    }

    public java.lang.String read(java.lang.String str, int i17, boolean z17) {
        java.lang.String str2;
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return str;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        byte b17 = headData.type;
        if (b17 == 6) {
            int i18 = this.f45818bs.get();
            if (i18 < 0) {
                i18 += 256;
            }
            byte[] bArr = new byte[i18];
            this.f45818bs.get(bArr);
            try {
                str2 = new java.lang.String(bArr, this.sServerEncoding);
            } catch (java.io.UnsupportedEncodingException unused) {
                str2 = new java.lang.String(bArr);
            }
        } else if (b17 == 7) {
            int i19 = this.f45818bs.getInt();
            if (i19 <= 104857600 && i19 >= 0) {
                byte[] bArr2 = new byte[i19];
                this.f45818bs.get(bArr2);
                try {
                    str2 = new java.lang.String(bArr2, this.sServerEncoding);
                } catch (java.io.UnsupportedEncodingException unused2) {
                    str2 = new java.lang.String(bArr2);
                }
            } else {
                throw new com.qq.taf.jce.JceDecodeException("String too long: " + i19);
            }
        } else {
            throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
        }
        return str2;
    }

    public java.lang.String[] read(java.lang.String[] strArr, int i17, boolean z17) {
        return (java.lang.String[]) readArray(strArr, i17, z17);
    }

    public boolean[] read(boolean[] zArr, int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        if (headData.type == 9) {
            int read = read(0, 0, true);
            if (read >= 0) {
                boolean[] zArr2 = new boolean[read];
                for (int i18 = 0; i18 < read; i18++) {
                    zArr2[i18] = read(zArr2[0], 0, true);
                }
                return zArr2;
            }
            throw new com.qq.taf.jce.JceDecodeException("size invalid: " + read);
        }
        throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
    }

    public byte[] read(byte[] bArr, int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        byte b17 = headData.type;
        if (b17 == 9) {
            int read = read(0, 0, true);
            if (read >= 0) {
                byte[] bArr2 = new byte[read];
                for (int i18 = 0; i18 < read; i18++) {
                    bArr2[i18] = read(bArr2[0], 0, true);
                }
                return bArr2;
            }
            throw new com.qq.taf.jce.JceDecodeException("size invalid: " + read);
        }
        if (b17 == 13) {
            com.qq.taf.jce.JceInputStream.HeadData headData2 = new com.qq.taf.jce.JceInputStream.HeadData();
            readHead(headData2);
            if (headData2.type == 0) {
                int read2 = read(0, 0, true);
                if (read2 >= 0) {
                    byte[] bArr3 = new byte[read2];
                    this.f45818bs.get(bArr3);
                    return bArr3;
                }
                throw new com.qq.taf.jce.JceDecodeException("invalid size, tag: " + i17 + ", type: " + ((int) headData.type) + ", " + ((int) headData2.type) + ", size: " + read2);
            }
            throw new com.qq.taf.jce.JceDecodeException("type mismatch, tag: " + i17 + ", type: " + ((int) headData.type) + ", " + ((int) headData2.type));
        }
        throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
    }

    public short[] read(short[] sArr, int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        if (headData.type == 9) {
            int read = read(0, 0, true);
            if (read >= 0) {
                short[] sArr2 = new short[read];
                for (int i18 = 0; i18 < read; i18++) {
                    sArr2[i18] = read(sArr2[0], 0, true);
                }
                return sArr2;
            }
            throw new com.qq.taf.jce.JceDecodeException("size invalid: " + read);
        }
        throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
    }

    public int[] read(int[] iArr, int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        if (headData.type == 9) {
            int read = read(0, 0, true);
            if (read >= 0) {
                int[] iArr2 = new int[read];
                for (int i18 = 0; i18 < read; i18++) {
                    iArr2[i18] = read(iArr2[0], 0, true);
                }
                return iArr2;
            }
            throw new com.qq.taf.jce.JceDecodeException("size invalid: " + read);
        }
        throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
    }

    public long[] read(long[] jArr, int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        if (headData.type == 9) {
            int read = read(0, 0, true);
            if (read >= 0) {
                long[] jArr2 = new long[read];
                for (int i18 = 0; i18 < read; i18++) {
                    jArr2[i18] = read(jArr2[0], 0, true);
                }
                return jArr2;
            }
            throw new com.qq.taf.jce.JceDecodeException("size invalid: " + read);
        }
        throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
    }

    public float[] read(float[] fArr, int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        if (headData.type == 9) {
            int read = read(0, 0, true);
            if (read >= 0) {
                float[] fArr2 = new float[read];
                for (int i18 = 0; i18 < read; i18++) {
                    fArr2[i18] = read(fArr2[0], 0, true);
                }
                return fArr2;
            }
            throw new com.qq.taf.jce.JceDecodeException("size invalid: " + read);
        }
        throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
    }

    public double[] read(double[] dArr, int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
        readHead(headData);
        if (headData.type == 9) {
            int read = read(0, 0, true);
            if (read >= 0) {
                double[] dArr2 = new double[read];
                for (int i18 = 0; i18 < read; i18++) {
                    dArr2[i18] = read(dArr2[0], 0, true);
                }
                return dArr2;
            }
            throw new com.qq.taf.jce.JceDecodeException("size invalid: " + read);
        }
        throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
    }

    public com.qq.taf.jce.JceStruct read(com.qq.taf.jce.JceStruct jceStruct, int i17, boolean z17) {
        if (!skipToTag(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.JceDecodeException("require field not exist.");
            }
            return null;
        }
        try {
            com.qq.taf.jce.JceStruct jceStruct2 = (com.qq.taf.jce.JceStruct) jceStruct.getClass().newInstance();
            com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
            readHead(headData);
            if (headData.type == 10) {
                jceStruct2.readFrom(this);
                skipToStructEnd();
                return jceStruct2;
            }
            throw new com.qq.taf.jce.JceDecodeException("type mismatch.");
        } catch (java.lang.Exception e17) {
            throw new com.qq.taf.jce.JceDecodeException(e17.getMessage());
        }
    }

    public com.qq.taf.jce.JceStruct[] read(com.qq.taf.jce.JceStruct[] jceStructArr, int i17, boolean z17) {
        return (com.qq.taf.jce.JceStruct[]) readArray(jceStructArr, i17, z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> java.lang.Object read(T t17, int i17, boolean z17) {
        if (t17 instanceof java.lang.Byte) {
            return java.lang.Byte.valueOf(read((byte) 0, i17, z17));
        }
        if (t17 instanceof java.lang.Boolean) {
            return java.lang.Boolean.valueOf(read(false, i17, z17));
        }
        if (t17 instanceof java.lang.Short) {
            return java.lang.Short.valueOf(read((short) 0, i17, z17));
        }
        if (t17 instanceof java.lang.Integer) {
            return java.lang.Integer.valueOf(read(0, i17, z17));
        }
        if (t17 instanceof java.lang.Long) {
            return java.lang.Long.valueOf(read(0L, i17, z17));
        }
        if (t17 instanceof java.lang.Float) {
            return java.lang.Float.valueOf(read(0.0f, i17, z17));
        }
        if (t17 instanceof java.lang.Double) {
            return java.lang.Double.valueOf(read(0.0d, i17, z17));
        }
        if (t17 instanceof java.lang.String) {
            return readString(i17, z17);
        }
        if (t17 instanceof java.util.Map) {
            return readMap((java.util.Map) t17, i17, z17);
        }
        if (t17 instanceof java.util.List) {
            return readArray((java.util.List) t17, i17, z17);
        }
        if (t17 instanceof com.qq.taf.jce.JceStruct) {
            return read((com.qq.taf.jce.JceStruct) t17, i17, z17);
        }
        if (t17.getClass().isArray()) {
            if (!(t17 instanceof byte[]) && !(t17 instanceof java.lang.Byte[])) {
                if (t17 instanceof boolean[]) {
                    return read((boolean[]) null, i17, z17);
                }
                if (t17 instanceof short[]) {
                    return read((short[]) null, i17, z17);
                }
                if (t17 instanceof int[]) {
                    return read((int[]) null, i17, z17);
                }
                if (t17 instanceof long[]) {
                    return read((long[]) null, i17, z17);
                }
                if (t17 instanceof float[]) {
                    return read((float[]) null, i17, z17);
                }
                if (t17 instanceof double[]) {
                    return read((double[]) null, i17, z17);
                }
                return readArray((java.lang.Object[]) t17, i17, z17);
            }
            return read((byte[]) null, i17, z17);
        }
        throw new com.qq.taf.jce.JceDecodeException("read object error: unsupport type.");
    }
}
