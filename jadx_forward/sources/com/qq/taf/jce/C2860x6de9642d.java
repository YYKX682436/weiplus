package com.qq.taf.jce;

/* renamed from: com.qq.taf.jce.JceOutputStream */
/* loaded from: classes13.dex */
public class C2860x6de9642d {

    /* renamed from: bs, reason: collision with root package name */
    private java.nio.ByteBuffer f127352bs;

    /* renamed from: sServerEncoding */
    protected java.lang.String f9752x91fd5509;

    public C2860x6de9642d(java.nio.ByteBuffer byteBuffer) {
        this.f9752x91fd5509 = "GBK";
        this.f127352bs = byteBuffer;
    }

    /* renamed from: main */
    public static void m21329x3305b9(java.lang.String[] strArr) {
        com.qq.taf.jce.C2860x6de9642d c2860x6de9642d = new com.qq.taf.jce.C2860x6de9642d();
        c2860x6de9642d.m21339x6c257df(1311768467283714885L, 0);
        java.lang.System.out.println(com.qq.taf.jce.C2855x93dd899d.m21238x223991d(c2860x6de9642d.m21331xeed4b35e().array()));
        java.lang.System.out.println(java.util.Arrays.toString(c2860x6de9642d.m21334x5f01b1f6()));
    }

    /* renamed from: writeArray */
    private void m21330xd86e3dba(java.lang.Object[] objArr, int i17) {
        m21332x41640cbc(8);
        m21363xac27925f((byte) 9, i17);
        m21338x6c257df(objArr.length, 0);
        for (java.lang.Object obj : objArr) {
            m21347x6c257df(obj, 0);
        }
    }

    /* renamed from: getByteBuffer */
    public java.nio.ByteBuffer m21331xeed4b35e() {
        return this.f127352bs;
    }

    /* renamed from: reserve */
    public void m21332x41640cbc(int i17) {
        if (this.f127352bs.remaining() < i17) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate((this.f127352bs.capacity() + i17) * 2);
            allocate.put(this.f127352bs.array(), 0, this.f127352bs.position());
            this.f127352bs = allocate;
        }
    }

    /* renamed from: setServerEncoding */
    public int m21333x26b402b8(java.lang.String str) {
        this.f9752x91fd5509 = str;
        return 0;
    }

    /* renamed from: toByteArray */
    public byte[] m21334x5f01b1f6() {
        byte[] bArr = new byte[this.f127352bs.position()];
        java.lang.System.arraycopy(this.f127352bs.array(), 0, bArr, 0, this.f127352bs.position());
        return bArr;
    }

    /* renamed from: write */
    public void m21353x6c257df(boolean z17, int i17) {
        m21335x6c257df(z17 ? (byte) 1 : (byte) 0, i17);
    }

    /* renamed from: writeByteString */
    public void m21362xfc98f078(java.lang.String str, int i17) {
        m21332x41640cbc(str.length() + 10);
        byte[] m21241x6cbe8fef = com.qq.taf.jce.C2855x93dd899d.m21241x6cbe8fef(str);
        if (m21241x6cbe8fef.length > 255) {
            m21363xac27925f((byte) 7, i17);
            this.f127352bs.putInt(m21241x6cbe8fef.length);
            this.f127352bs.put(m21241x6cbe8fef);
        } else {
            m21363xac27925f((byte) 6, i17);
            this.f127352bs.put((byte) m21241x6cbe8fef.length);
            this.f127352bs.put(m21241x6cbe8fef);
        }
    }

    /* renamed from: writeHead */
    public void m21363xac27925f(byte b17, int i17) {
        if (i17 < 15) {
            this.f127352bs.put((byte) (b17 | (i17 << 4)));
        } else {
            if (i17 >= 256) {
                throw new com.qq.taf.jce.C2858x349ca30d("tag is too large: " + i17);
            }
            this.f127352bs.put((byte) (b17 | 240));
            this.f127352bs.put((byte) i17);
        }
    }

    /* renamed from: writeStringByte */
    public void m21364x813fedf8(java.lang.String str, int i17) {
        byte[] m21241x6cbe8fef = com.qq.taf.jce.C2855x93dd899d.m21241x6cbe8fef(str);
        m21332x41640cbc(m21241x6cbe8fef.length + 10);
        if (m21241x6cbe8fef.length > 255) {
            m21363xac27925f((byte) 7, i17);
            this.f127352bs.putInt(m21241x6cbe8fef.length);
            this.f127352bs.put(m21241x6cbe8fef);
        } else {
            m21363xac27925f((byte) 6, i17);
            this.f127352bs.put((byte) m21241x6cbe8fef.length);
            this.f127352bs.put(m21241x6cbe8fef);
        }
    }

    /* renamed from: write */
    public void m21335x6c257df(byte b17, int i17) {
        m21332x41640cbc(3);
        if (b17 == 0) {
            m21363xac27925f((byte) 12, i17);
        } else {
            m21363xac27925f((byte) 0, i17);
            this.f127352bs.put(b17);
        }
    }

    public C2860x6de9642d(int i17) {
        this.f9752x91fd5509 = "GBK";
        this.f127352bs = java.nio.ByteBuffer.allocate(i17);
    }

    /* renamed from: write */
    public void m21352x6c257df(short s17, int i17) {
        m21332x41640cbc(4);
        if (s17 >= -128 && s17 <= 127) {
            m21335x6c257df((byte) s17, i17);
        } else {
            m21363xac27925f((byte) 1, i17);
            this.f127352bs.putShort(s17);
        }
    }

    public C2860x6de9642d() {
        this(128);
    }

    /* renamed from: write */
    public void m21338x6c257df(int i17, int i18) {
        m21332x41640cbc(6);
        if (i17 >= -32768 && i17 <= 32767) {
            m21352x6c257df((short) i17, i18);
        } else {
            m21363xac27925f((byte) 2, i18);
            this.f127352bs.putInt(i17);
        }
    }

    /* renamed from: write */
    public void m21339x6c257df(long j17, int i17) {
        m21332x41640cbc(10);
        if (j17 >= -2147483648L && j17 <= 2147483647L) {
            m21338x6c257df((int) j17, i17);
        } else {
            m21363xac27925f((byte) 3, i17);
            this.f127352bs.putLong(j17);
        }
    }

    /* renamed from: write */
    public void m21337x6c257df(float f17, int i17) {
        m21332x41640cbc(6);
        m21363xac27925f((byte) 4, i17);
        this.f127352bs.putFloat(f17);
    }

    /* renamed from: write */
    public void m21336x6c257df(double d17, int i17) {
        m21332x41640cbc(10);
        m21363xac27925f((byte) 5, i17);
        this.f127352bs.putDouble(d17);
    }

    /* renamed from: write */
    public void m21349x6c257df(java.lang.String str, int i17) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f9752x91fd5509);
        } catch (java.io.UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        m21332x41640cbc(bytes.length + 10);
        if (bytes.length > 255) {
            m21363xac27925f((byte) 7, i17);
            this.f127352bs.putInt(bytes.length);
            this.f127352bs.put(bytes);
        } else {
            m21363xac27925f((byte) 6, i17);
            this.f127352bs.put((byte) bytes.length);
            this.f127352bs.put(bytes);
        }
    }

    /* renamed from: write */
    public <K, V> void m21351x6c257df(java.util.Map<K, V> map, int i17) {
        m21332x41640cbc(8);
        m21363xac27925f((byte) 8, i17);
        m21338x6c257df(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                m21347x6c257df(entry.getKey(), 0);
                m21347x6c257df(entry.getValue(), 1);
            }
        }
    }

    /* renamed from: write */
    public void m21361x6c257df(boolean[] zArr, int i17) {
        m21332x41640cbc(8);
        m21363xac27925f((byte) 9, i17);
        m21338x6c257df(zArr.length, 0);
        for (boolean z17 : zArr) {
            m21353x6c257df(z17, 0);
        }
    }

    /* renamed from: write */
    public void m21354x6c257df(byte[] bArr, int i17) {
        m21332x41640cbc(bArr.length + 8);
        m21363xac27925f((byte) 13, i17);
        m21363xac27925f((byte) 0, 0);
        m21338x6c257df(bArr.length, 0);
        this.f127352bs.put(bArr);
    }

    /* renamed from: write */
    public void m21360x6c257df(short[] sArr, int i17) {
        m21332x41640cbc(8);
        m21363xac27925f((byte) 9, i17);
        m21338x6c257df(sArr.length, 0);
        for (short s17 : sArr) {
            m21352x6c257df(s17, 0);
        }
    }

    /* renamed from: write */
    public void m21357x6c257df(int[] iArr, int i17) {
        m21332x41640cbc(8);
        m21363xac27925f((byte) 9, i17);
        m21338x6c257df(iArr.length, 0);
        for (int i18 : iArr) {
            m21338x6c257df(i18, 0);
        }
    }

    /* renamed from: write */
    public void m21358x6c257df(long[] jArr, int i17) {
        m21332x41640cbc(8);
        m21363xac27925f((byte) 9, i17);
        m21338x6c257df(jArr.length, 0);
        for (long j17 : jArr) {
            m21339x6c257df(j17, 0);
        }
    }

    /* renamed from: write */
    public void m21356x6c257df(float[] fArr, int i17) {
        m21332x41640cbc(8);
        m21363xac27925f((byte) 9, i17);
        m21338x6c257df(fArr.length, 0);
        for (float f17 : fArr) {
            m21337x6c257df(f17, 0);
        }
    }

    /* renamed from: write */
    public void m21355x6c257df(double[] dArr, int i17) {
        m21332x41640cbc(8);
        m21363xac27925f((byte) 9, i17);
        m21338x6c257df(dArr.length, 0);
        for (double d17 : dArr) {
            m21336x6c257df(d17, 0);
        }
    }

    /* renamed from: write */
    public <T> void m21359x6c257df(T[] tArr, int i17) {
        m21330xd86e3dba(tArr, i17);
    }

    /* renamed from: write */
    public <T> void m21350x6c257df(java.util.Collection<T> collection, int i17) {
        m21332x41640cbc(8);
        m21363xac27925f((byte) 9, i17);
        m21338x6c257df(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                m21347x6c257df(it.next(), 0);
            }
        }
    }

    /* renamed from: write */
    public void m21340x6c257df(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921, int i17) {
        m21332x41640cbc(2);
        m21363xac27925f((byte) 10, i17);
        abstractC2861x7aec4921.mo21235x5f8be6ba(this);
        m21332x41640cbc(2);
        m21363xac27925f((byte) 11, 0);
    }

    /* renamed from: write */
    public void m21342x6c257df(java.lang.Byte b17, int i17) {
        m21335x6c257df(b17.byteValue(), i17);
    }

    /* renamed from: write */
    public void m21341x6c257df(java.lang.Boolean bool, int i17) {
        m21353x6c257df(bool.booleanValue(), i17);
    }

    /* renamed from: write */
    public void m21348x6c257df(java.lang.Short sh6, int i17) {
        m21352x6c257df(sh6.shortValue(), i17);
    }

    /* renamed from: write */
    public void m21345x6c257df(java.lang.Integer num, int i17) {
        m21338x6c257df(num.intValue(), i17);
    }

    /* renamed from: write */
    public void m21346x6c257df(java.lang.Long l17, int i17) {
        m21339x6c257df(l17.longValue(), i17);
    }

    /* renamed from: write */
    public void m21344x6c257df(java.lang.Float f17, int i17) {
        m21337x6c257df(f17.floatValue(), i17);
    }

    /* renamed from: write */
    public void m21343x6c257df(java.lang.Double d17, int i17) {
        m21336x6c257df(d17.doubleValue(), i17);
    }

    /* renamed from: write */
    public void m21347x6c257df(java.lang.Object obj, int i17) {
        if (obj instanceof java.lang.Byte) {
            m21335x6c257df(((java.lang.Byte) obj).byteValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            m21353x6c257df(((java.lang.Boolean) obj).booleanValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Short) {
            m21352x6c257df(((java.lang.Short) obj).shortValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Integer) {
            m21338x6c257df(((java.lang.Integer) obj).intValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Long) {
            m21339x6c257df(((java.lang.Long) obj).longValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Float) {
            m21337x6c257df(((java.lang.Float) obj).floatValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Double) {
            m21336x6c257df(((java.lang.Double) obj).doubleValue(), i17);
            return;
        }
        if (obj instanceof java.lang.String) {
            m21349x6c257df((java.lang.String) obj, i17);
            return;
        }
        if (obj instanceof java.util.Map) {
            m21351x6c257df((java.util.Map) obj, i17);
            return;
        }
        if (obj instanceof java.util.List) {
            m21350x6c257df((java.util.Collection) obj, i17);
            return;
        }
        if (obj instanceof com.qq.taf.jce.AbstractC2861x7aec4921) {
            m21340x6c257df((com.qq.taf.jce.AbstractC2861x7aec4921) obj, i17);
            return;
        }
        if (obj instanceof byte[]) {
            m21354x6c257df((byte[]) obj, i17);
            return;
        }
        if (obj instanceof boolean[]) {
            m21361x6c257df((boolean[]) obj, i17);
            return;
        }
        if (obj instanceof short[]) {
            m21360x6c257df((short[]) obj, i17);
            return;
        }
        if (obj instanceof int[]) {
            m21357x6c257df((int[]) obj, i17);
            return;
        }
        if (obj instanceof long[]) {
            m21358x6c257df((long[]) obj, i17);
            return;
        }
        if (obj instanceof float[]) {
            m21356x6c257df((float[]) obj, i17);
            return;
        }
        if (obj instanceof double[]) {
            m21355x6c257df((double[]) obj, i17);
            return;
        }
        if (obj.getClass().isArray()) {
            m21330xd86e3dba((java.lang.Object[]) obj, i17);
        } else if (obj instanceof java.util.Collection) {
            m21350x6c257df((java.util.Collection) obj, i17);
        } else {
            throw new com.qq.taf.jce.C2858x349ca30d("write object error: unsupport type. " + obj.getClass());
        }
    }
}
