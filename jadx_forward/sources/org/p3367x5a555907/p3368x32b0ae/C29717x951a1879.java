package org.p3367x5a555907.p3368x32b0ae;

/* renamed from: org.tensorflow.lite.Tensor */
/* loaded from: classes13.dex */
public final class C29717x951a1879 {

    /* renamed from: a, reason: collision with root package name */
    public long f429397a;

    /* renamed from: b, reason: collision with root package name */
    public final org.p3367x5a555907.p3368x32b0ae.a f429398b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f429399c;

    public C29717x951a1879(long j17) {
        this.f429397a = j17;
        int m155079x5b7bd9e = m155079x5b7bd9e(j17);
        for (org.p3367x5a555907.p3368x32b0ae.a aVar : org.p3367x5a555907.p3368x32b0ae.a.f429407n) {
            if (aVar.f429409d == m155079x5b7bd9e) {
                this.f429398b = aVar;
                this.f429399c = m155087x6854fa1(j17);
                m155088x82a36e17(j17);
                m155084x6c8b009(j17);
                m155085x78857f07(j17);
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DataType error: DataType ");
        sb6.append(m155079x5b7bd9e);
        sb6.append(" is not recognized in Java (version ");
        org.p3367x5a555907.p3368x32b0ae.C29718xd6a8d295.a();
        sb6.append(org.p3367x5a555907.p3368x32b0ae.C29718xd6a8d295.m155092xf1d689d7());
        sb6.append(")");
        throw new java.lang.IllegalArgumentException(sb6.toString());
    }

    /* renamed from: buffer */
    private static native java.nio.ByteBuffer m155076xaddb9440(long j17);

    public static int c(java.lang.Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (java.lang.reflect.Array.getLength(obj) != 0) {
            return c(java.lang.reflect.Array.get(obj, 0)) + 1;
        }
        throw new java.lang.IllegalArgumentException("Array lengths cannot be 0.");
    }

    /* renamed from: create */
    private static native long m155077xaf65a0fc(long j17, int i17);

    /* renamed from: delete */
    private static native void m155078xb06685ab(long j17);

    /* renamed from: dtype */
    private static native int m155079x5b7bd9e(long j17);

    public static void f(java.lang.Object obj, int i17, int[] iArr) {
        if (iArr == null || i17 == iArr.length) {
            return;
        }
        int length = java.lang.reflect.Array.getLength(obj);
        int i18 = iArr[i17];
        if (i18 == 0) {
            iArr[i17] = length;
        } else if (i18 != length) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Mismatched lengths (%d and %d) in dimension %d", java.lang.Integer.valueOf(iArr[i17]), java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(i17)));
        }
        for (int i19 = 0; i19 < length; i19++) {
            f(java.lang.reflect.Array.get(obj, i19), i17 + 1, iArr);
        }
    }

    public static org.p3367x5a555907.p3368x32b0ae.C29717x951a1879 g(long j17, int i17) {
        return new org.p3367x5a555907.p3368x32b0ae.C29717x951a1879(m155077xaf65a0fc(j17, i17));
    }

    /* renamed from: hasDelegateBufferHandle */
    private static native boolean m155080xecf04667(long j17);

    /* renamed from: index */
    private static native int m155081x5fb28d2(long j17);

    /* renamed from: name */
    private static native java.lang.String m155082x337a8b(long j17);

    /* renamed from: numBytes */
    private static native int m155083x8dd56885(long j17);

    /* renamed from: quantizationScale */
    private static native float m155084x6c8b009(long j17);

    /* renamed from: quantizationZeroPoint */
    private static native int m155085x78857f07(long j17);

    /* renamed from: readMultiDimensionalArray */
    private static native void m155086xa795a42b(long j17, java.lang.Object obj);

    /* renamed from: shape */
    private static native int[] m155087x6854fa1(long j17);

    /* renamed from: shapeSignature */
    private static native int[] m155088x82a36e17(long j17);

    /* renamed from: writeDirectBuffer */
    private static native void m155089x3f739f08(long j17, java.nio.Buffer buffer);

    /* renamed from: writeMultiDimensionalArray */
    private static native void m155090x7bd59d82(long j17, java.lang.Object obj);

    /* renamed from: writeScalar */
    private static native void m155091x5335c0ab(long j17, java.lang.Object obj);

    public final java.nio.ByteBuffer a() {
        return m155076xaddb9440(this.f429397a).order(java.nio.ByteOrder.nativeOrder());
    }

    public void b() {
        m155078xb06685ab(this.f429397a);
        this.f429397a = 0L;
    }

    public int[] d(java.lang.Object obj) {
        int c17 = c(obj);
        if (this.f429398b == org.p3367x5a555907.p3368x32b0ae.a.STRING) {
            java.lang.Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                while (cls.isArray()) {
                    cls = cls.getComponentType();
                }
                if (java.lang.Byte.TYPE.equals(cls)) {
                    c17--;
                }
            }
        }
        int[] iArr = new int[c17];
        f(obj, 0, iArr);
        return iArr;
    }

    public java.lang.Object e(java.lang.Object obj) {
        if (obj == null) {
            if (m155080xecf04667(this.f429397a)) {
                return obj;
            }
            throw new java.lang.IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
        }
        l(obj);
        boolean z17 = obj instanceof java.nio.Buffer;
        if (z17) {
            java.nio.Buffer buffer = (java.nio.Buffer) obj;
            int m155083x8dd56885 = m155083x8dd56885(this.f429397a);
            int capacity = obj instanceof java.nio.ByteBuffer ? buffer.capacity() : buffer.capacity() * this.f429398b.h();
            if (m155083x8dd56885 > capacity) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", h(), java.lang.Integer.valueOf(m155083x8dd56885), java.lang.Integer.valueOf(capacity)));
            }
        } else {
            int[] d17 = d(obj);
            if (!java.util.Arrays.equals(d17, this.f429399c)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy from a TensorFlowLite tensor (%s) with shape %s to a Java object with shape %s.", h(), java.util.Arrays.toString(this.f429399c), java.util.Arrays.toString(d17)));
            }
        }
        if (z17) {
            java.nio.Buffer buffer2 = (java.nio.Buffer) obj;
            if (buffer2 instanceof java.nio.ByteBuffer) {
                ((java.nio.ByteBuffer) buffer2).put(a());
            } else if (buffer2 instanceof java.nio.FloatBuffer) {
                ((java.nio.FloatBuffer) buffer2).put(a().asFloatBuffer());
            } else if (buffer2 instanceof java.nio.LongBuffer) {
                ((java.nio.LongBuffer) buffer2).put(a().asLongBuffer());
            } else {
                if (!(buffer2 instanceof java.nio.IntBuffer)) {
                    throw new java.lang.IllegalArgumentException("Unexpected output buffer type: " + buffer2);
                }
                ((java.nio.IntBuffer) buffer2).put(a().asIntBuffer());
            }
        } else {
            m155086xa795a42b(this.f429397a, obj);
        }
        return obj;
    }

    public java.lang.String h() {
        return m155082x337a8b(this.f429397a);
    }

    public int i() {
        int i17 = 1;
        for (int i18 : this.f429399c) {
            i17 *= i18;
        }
        return i17;
    }

    public void j() {
        this.f429399c = m155087x6854fa1(this.f429397a);
    }

    public void k(java.lang.Object obj) {
        if (obj == null) {
            if (!m155080xecf04667(this.f429397a)) {
                throw new java.lang.IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        l(obj);
        boolean z17 = obj instanceof java.nio.Buffer;
        if (z17) {
            java.nio.Buffer buffer = (java.nio.Buffer) obj;
            int m155083x8dd56885 = m155083x8dd56885(this.f429397a);
            int capacity = obj instanceof java.nio.ByteBuffer ? buffer.capacity() : buffer.capacity() * this.f429398b.h();
            if (m155083x8dd56885 != capacity) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", h(), java.lang.Integer.valueOf(m155083x8dd56885), java.lang.Integer.valueOf(capacity)));
            }
        } else {
            int[] d17 = d(obj);
            if (!java.util.Arrays.equals(d17, this.f429399c)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy to a TensorFlowLite tensor (%s) with shape %s from a Java object with shape %s.", h(), java.util.Arrays.toString(this.f429399c), java.util.Arrays.toString(d17)));
            }
        }
        if (!z17) {
            if (obj.getClass().isArray()) {
                m155090x7bd59d82(this.f429397a, obj);
                return;
            } else {
                m155091x5335c0ab(this.f429397a, obj);
                return;
            }
        }
        java.nio.Buffer buffer2 = (java.nio.Buffer) obj;
        if (buffer2 instanceof java.nio.ByteBuffer) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) buffer2;
            if (byteBuffer.isDirect() && byteBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
                m155089x3f739f08(this.f429397a, buffer2);
                return;
            } else {
                a().put(byteBuffer);
                return;
            }
        }
        if (buffer2 instanceof java.nio.LongBuffer) {
            java.nio.LongBuffer longBuffer = (java.nio.LongBuffer) buffer2;
            if (longBuffer.isDirect() && longBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
                m155089x3f739f08(this.f429397a, buffer2);
                return;
            } else {
                a().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer2 instanceof java.nio.FloatBuffer) {
            java.nio.FloatBuffer floatBuffer = (java.nio.FloatBuffer) buffer2;
            if (floatBuffer.isDirect() && floatBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
                m155089x3f739f08(this.f429397a, buffer2);
                return;
            } else {
                a().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (!(buffer2 instanceof java.nio.IntBuffer)) {
            throw new java.lang.IllegalArgumentException("Unexpected input buffer type: " + buffer2);
        }
        java.nio.IntBuffer intBuffer = (java.nio.IntBuffer) buffer2;
        if (intBuffer.isDirect() && intBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
            m155089x3f739f08(this.f429397a, buffer2);
        } else {
            a().asIntBuffer().put(intBuffer);
        }
    }

    public final void l(java.lang.Object obj) {
        org.p3367x5a555907.p3368x32b0ae.a aVar;
        if (obj instanceof java.nio.ByteBuffer) {
            return;
        }
        if (obj != null) {
            java.lang.Class<?> cls = obj.getClass();
            boolean isArray = cls.isArray();
            org.p3367x5a555907.p3368x32b0ae.a aVar2 = this.f429398b;
            if (!isArray) {
                if (java.lang.Float.class.equals(cls) || (obj instanceof java.nio.FloatBuffer)) {
                    aVar = org.p3367x5a555907.p3368x32b0ae.a.FLOAT32;
                } else if (java.lang.Integer.class.equals(cls) || (obj instanceof java.nio.IntBuffer)) {
                    aVar = org.p3367x5a555907.p3368x32b0ae.a.INT32;
                } else if (java.lang.Byte.class.equals(cls)) {
                    aVar = org.p3367x5a555907.p3368x32b0ae.a.UINT8;
                } else if (java.lang.Long.class.equals(cls) || (obj instanceof java.nio.LongBuffer)) {
                    aVar = org.p3367x5a555907.p3368x32b0ae.a.INT64;
                } else if (java.lang.Boolean.class.equals(cls)) {
                    aVar = org.p3367x5a555907.p3368x32b0ae.a.BOOL;
                } else if (java.lang.String.class.equals(cls)) {
                    aVar = org.p3367x5a555907.p3368x32b0ae.a.STRING;
                }
                if (aVar == aVar2) {
                    return;
                } else {
                    return;
                }
            }
            while (cls.isArray()) {
                cls = cls.getComponentType();
            }
            if (java.lang.Float.TYPE.equals(cls)) {
                aVar = org.p3367x5a555907.p3368x32b0ae.a.FLOAT32;
            } else if (java.lang.Integer.TYPE.equals(cls)) {
                aVar = org.p3367x5a555907.p3368x32b0ae.a.INT32;
            } else if (java.lang.Byte.TYPE.equals(cls)) {
                aVar = org.p3367x5a555907.p3368x32b0ae.a.STRING;
                if (aVar2 != aVar) {
                    aVar = org.p3367x5a555907.p3368x32b0ae.a.UINT8;
                }
            } else if (java.lang.Long.TYPE.equals(cls)) {
                aVar = org.p3367x5a555907.p3368x32b0ae.a.INT64;
            } else if (java.lang.Boolean.TYPE.equals(cls)) {
                aVar = org.p3367x5a555907.p3368x32b0ae.a.BOOL;
            } else if (java.lang.String.class.equals(cls)) {
                aVar = org.p3367x5a555907.p3368x32b0ae.a.STRING;
            }
            if (aVar == aVar2 && !aVar.i().equals(aVar2.i())) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", aVar2, obj.getClass().getName(), aVar));
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("DataType error: cannot resolve DataType of ".concat(obj.getClass().getName()));
    }
}
