package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public java.nio.ByteBuffer f132017a;

    /* renamed from: b, reason: collision with root package name */
    protected java.lang.String f132018b;

    /* renamed from: c, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.r f132019c;

    private n(java.nio.ByteBuffer byteBuffer) {
        this.f132018b = "GBK";
        this.f132017a = byteBuffer;
    }

    private java.nio.ByteBuffer b() {
        return this.f132017a;
    }

    private void c(java.lang.String str, int i17) {
        a(str.length() + 10);
        byte[] a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.i.a(str);
        if (a17.length > 255) {
            b((byte) 7, i17);
            this.f132017a.putInt(a17.length);
            this.f132017a.put(a17);
        } else {
            b((byte) 6, i17);
            this.f132017a.put((byte) a17.length);
            this.f132017a.put(a17);
        }
    }

    public final byte[] a() {
        byte[] bArr = new byte[this.f132017a.position()];
        java.lang.System.arraycopy(this.f132017a.array(), 0, bArr, 0, this.f132017a.position());
        return bArr;
    }

    private void b(byte b17, int i17) {
        if (i17 < 15) {
            this.f132017a.put((byte) (b17 | (i17 << 4)));
        } else {
            if (i17 < 256) {
                this.f132017a.put((byte) (b17 | 240));
                this.f132017a.put((byte) i17);
                return;
            }
            throw new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.l("tag is too large: ".concat(java.lang.String.valueOf(i17)));
        }
    }

    private void a(int i17) {
        if (this.f132017a.remaining() < i17) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate((this.f132017a.capacity() + i17) * 2);
            allocate.put(this.f132017a.array(), 0, this.f132017a.position());
            this.f132017a = allocate;
        }
    }

    public n(int i17) {
        this.f132018b = "GBK";
        this.f132017a = java.nio.ByteBuffer.allocate(i17);
    }

    private void b(java.lang.String str, int i17) {
        byte[] a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.i.a(str);
        a(a17.length + 10);
        if (a17.length > 255) {
            b((byte) 7, i17);
            this.f132017a.putInt(a17.length);
            this.f132017a.put(a17);
        } else {
            b((byte) 6, i17);
            this.f132017a.put((byte) a17.length);
            this.f132017a.put(a17);
        }
    }

    public n() {
        this(128);
    }

    public final void a(boolean z17, int i17) {
        a(z17 ? (byte) 1 : (byte) 0, i17);
    }

    public final void a(byte b17, int i17) {
        a(3);
        if (b17 == 0) {
            b((byte) 12, i17);
        } else {
            b((byte) 0, i17);
            this.f132017a.put(b17);
        }
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.r c() {
        return this.f132019c;
    }

    public final void a(short s17, int i17) {
        a(4);
        if (s17 >= -128 && s17 <= 127) {
            a((byte) s17, i17);
        } else {
            b((byte) 1, i17);
            this.f132017a.putShort(s17);
        }
    }

    private void b(java.lang.Object[] objArr, int i17) {
        a(8);
        b((byte) 9, i17);
        a(objArr.length, 0);
        for (java.lang.Object obj : objArr) {
            a(obj, 0);
        }
    }

    public final void a(int i17, int i18) {
        a(6);
        if (i17 >= -32768 && i17 <= 32767) {
            a((short) i17, i18);
        } else {
            b((byte) 2, i18);
            this.f132017a.putInt(i17);
        }
    }

    public final void a(long j17, int i17) {
        a(10);
        if (j17 >= -2147483648L && j17 <= 2147483647L) {
            a((int) j17, i17);
        } else {
            b((byte) 3, i17);
            this.f132017a.putLong(j17);
        }
    }

    public final void a(float f17, int i17) {
        a(6);
        b((byte) 4, i17);
        this.f132017a.putFloat(f17);
    }

    public final void a(double d17, int i17) {
        a(10);
        b((byte) 5, i17);
        this.f132017a.putDouble(d17);
    }

    public final void a(java.lang.String str, int i17) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f132018b);
        } catch (java.io.UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        a(bytes.length + 10);
        if (bytes.length > 255) {
            b((byte) 7, i17);
            this.f132017a.putInt(bytes.length);
            this.f132017a.put(bytes);
        } else {
            b((byte) 6, i17);
            this.f132017a.put((byte) bytes.length);
            this.f132017a.put(bytes);
        }
    }

    public final <K, V> void a(java.util.Map<K, V> map, int i17) {
        a(8);
        b((byte) 8, i17);
        a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                a(entry.getKey(), 0);
                a(entry.getValue(), 1);
            }
        }
    }

    private void a(boolean[] zArr, int i17) {
        a(8);
        b((byte) 9, i17);
        a(zArr.length, 0);
        for (boolean z17 : zArr) {
            a(z17, 0);
        }
    }

    public final void a(byte[] bArr, int i17) {
        a(bArr.length + 8);
        b((byte) 13, i17);
        b((byte) 0, 0);
        a(bArr.length, 0);
        this.f132017a.put(bArr);
    }

    private void a(short[] sArr, int i17) {
        a(8);
        b((byte) 9, i17);
        a(sArr.length, 0);
        for (short s17 : sArr) {
            a(s17, 0);
        }
    }

    private void a(int[] iArr, int i17) {
        a(8);
        b((byte) 9, i17);
        a(iArr.length, 0);
        for (int i18 : iArr) {
            a(i18, 0);
        }
    }

    private void a(long[] jArr, int i17) {
        a(8);
        b((byte) 9, i17);
        a(jArr.length, 0);
        for (long j17 : jArr) {
            a(j17, 0);
        }
    }

    private void a(float[] fArr, int i17) {
        a(8);
        b((byte) 9, i17);
        a(fArr.length, 0);
        for (float f17 : fArr) {
            a(f17, 0);
        }
    }

    private void a(double[] dArr, int i17) {
        a(8);
        b((byte) 9, i17);
        a(dArr.length, 0);
        for (double d17 : dArr) {
            a(d17, 0);
        }
    }

    private <T> void a(T[] tArr, int i17) {
        b(tArr, i17);
    }

    public final <T> void a(java.util.Collection<T> collection, int i17) {
        a(8);
        b((byte) 9, i17);
        a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                a(it.next(), 0);
            }
        }
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p pVar, int i17) {
        a(2);
        b((byte) 10, i17);
        pVar.mo36076x5f8be6ba(this);
        a(2);
        b((byte) 11, 0);
    }

    private void a(java.lang.Byte b17, int i17) {
        a(b17.byteValue(), i17);
    }

    private void a(java.lang.Boolean bool, int i17) {
        a(bool.booleanValue(), i17);
    }

    private void a(java.lang.Short sh6, int i17) {
        a(sh6.shortValue(), i17);
    }

    private void a(java.lang.Integer num, int i17) {
        a(num.intValue(), i17);
    }

    private void a(java.lang.Long l17, int i17) {
        a(l17.longValue(), i17);
    }

    private void a(java.lang.Float f17, int i17) {
        a(f17.floatValue(), i17);
    }

    private void a(java.lang.Double d17, int i17) {
        a(d17.doubleValue(), i17);
    }

    public final void a(java.lang.Object obj, int i17) {
        if (obj instanceof java.lang.Byte) {
            a(((java.lang.Byte) obj).byteValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            a(((java.lang.Boolean) obj).booleanValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Short) {
            a(((java.lang.Short) obj).shortValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Integer) {
            a(((java.lang.Integer) obj).intValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Long) {
            a(((java.lang.Long) obj).longValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Float) {
            a(((java.lang.Float) obj).floatValue(), i17);
            return;
        }
        if (obj instanceof java.lang.Double) {
            a(((java.lang.Double) obj).doubleValue(), i17);
            return;
        }
        if (obj instanceof java.lang.String) {
            a((java.lang.String) obj, i17);
            return;
        }
        if (obj instanceof java.util.Map) {
            a((java.util.Map) obj, i17);
            return;
        }
        if (obj instanceof java.util.List) {
            a((java.util.Collection) obj, i17);
            return;
        }
        if (obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p) {
            a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p) obj, i17);
            return;
        }
        if (obj instanceof byte[]) {
            a((byte[]) obj, i17);
            return;
        }
        if (obj instanceof boolean[]) {
            a((boolean[]) obj, i17);
            return;
        }
        if (obj instanceof short[]) {
            a((short[]) obj, i17);
            return;
        }
        if (obj instanceof int[]) {
            a((int[]) obj, i17);
            return;
        }
        if (obj instanceof long[]) {
            a((long[]) obj, i17);
            return;
        }
        if (obj instanceof float[]) {
            a((float[]) obj, i17);
            return;
        }
        if (obj instanceof double[]) {
            a((double[]) obj, i17);
            return;
        }
        if (obj.getClass().isArray()) {
            b((java.lang.Object[]) obj, i17);
        } else if (obj instanceof java.util.Collection) {
            a((java.util.Collection) obj, i17);
        } else {
            throw new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.l("write object error: unsupport type. " + obj.getClass());
        }
    }

    public final int a(java.lang.String str) {
        this.f132018b = str;
        return 0;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.r rVar) {
        this.f132019c = rVar;
    }
}
