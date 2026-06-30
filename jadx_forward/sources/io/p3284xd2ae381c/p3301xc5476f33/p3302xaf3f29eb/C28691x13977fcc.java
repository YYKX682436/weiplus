package io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb;

/* renamed from: io.flutter.plugin.common.StandardMessageCodec */
/* loaded from: classes13.dex */
public class C28691x13977fcc implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> {

    /* renamed from: BIGINT */
    private static final byte f71621x74c5eeef = 5;

    /* renamed from: BYTE_ARRAY */
    private static final byte f71622x84815042 = 8;

    /* renamed from: DOUBLE */
    private static final byte f71623x788a6fd1 = 6;

    /* renamed from: DOUBLE_ARRAY */
    private static final byte f71624x12886c4b = 11;

    /* renamed from: FALSE */
    private static final byte f71625x3f92103 = 2;

    /* renamed from: FLOAT_ARRAY */
    private static final byte f71626x5f036a76 = 14;

    /* renamed from: INSTANCE */
    public static final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc f71627x4fbc8495 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
    private static final byte INT = 3;

    /* renamed from: INT_ARRAY */
    private static final byte f71628xef81a1c9 = 9;

    /* renamed from: LIST */
    private static final byte f71629x23a89e = 12;

    /* renamed from: LITTLE_ENDIAN */
    private static final boolean f71630x234d7504;

    /* renamed from: LONG */
    private static final byte f71631x23be7c = 4;

    /* renamed from: LONG_ARRAY */
    private static final byte f71632x3f38ceb6 = 10;
    private static final byte MAP = 13;

    /* renamed from: NULL */
    private static final byte f71633x24bd87 = 0;

    /* renamed from: STRING */
    private static final byte f71634x92685411 = 7;
    private static final java.lang.String TAG = "StandardMessageCodec#";

    /* renamed from: TRUE */
    private static final byte f71635x276d8e = 1;

    /* renamed from: UTF8 */
    private static final java.nio.charset.Charset f71636x27e791;

    /* renamed from: io.flutter.plugin.common.StandardMessageCodec$ExposedByteArrayOutputStream */
    /* loaded from: classes13.dex */
    public static final class ExposedByteArrayOutputStream extends java.io.ByteArrayOutputStream {
        /* renamed from: buffer */
        public byte[] m138459xaddb9440() {
            return ((java.io.ByteArrayOutputStream) this).buf;
        }
    }

    static {
        f71630x234d7504 = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.LITTLE_ENDIAN;
        f71636x27e791 = java.nio.charset.Charset.forName("UTF8");
    }

    /* renamed from: readAlignment */
    public static final void m138447xf798d0ed(java.nio.ByteBuffer byteBuffer, int i17) {
        int position = byteBuffer.position() % i17;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i17) - position);
        }
    }

    /* renamed from: readBytes */
    public static final byte[] m138448xbc0c0475(java.nio.ByteBuffer byteBuffer) {
        byte[] bArr = new byte[m138449xcc49f2b7(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: readSize */
    public static final int m138449xcc49f2b7(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalArgumentException("Message corrupted");
        }
        int i17 = byteBuffer.get() & 255;
        return i17 < 254 ? i17 : i17 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    /* renamed from: writeAlignment */
    public static final void m138450x15bad4c4(java.io.ByteArrayOutputStream byteArrayOutputStream, int i17) {
        int size = byteArrayOutputStream.size() % i17;
        if (size != 0) {
            for (int i18 = 0; i18 < i17 - size; i18++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    /* renamed from: writeBytes */
    public static final void m138451xd87f8bcc(java.io.ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        m138457xac2ca480(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    /* renamed from: writeChar */
    public static final void m138452xac2557d5(java.io.ByteArrayOutputStream byteArrayOutputStream, int i17) {
        if (f71630x234d7504) {
            byteArrayOutputStream.write(i17);
            byteArrayOutputStream.write(i17 >>> 8);
        } else {
            byteArrayOutputStream.write(i17 >>> 8);
            byteArrayOutputStream.write(i17);
        }
    }

    /* renamed from: writeDouble */
    public static final void m138453x3a4f1c90(java.io.ByteArrayOutputStream byteArrayOutputStream, double d17) {
        m138456xac298afb(byteArrayOutputStream, java.lang.Double.doubleToLongBits(d17));
    }

    /* renamed from: writeFloat */
    public static final void m138454xd8b1edbd(java.io.ByteArrayOutputStream byteArrayOutputStream, float f17) {
        m138455x91f0c790(byteArrayOutputStream, java.lang.Float.floatToIntBits(f17));
    }

    /* renamed from: writeInt */
    public static final void m138455x91f0c790(java.io.ByteArrayOutputStream byteArrayOutputStream, int i17) {
        if (f71630x234d7504) {
            byteArrayOutputStream.write(i17);
            byteArrayOutputStream.write(i17 >>> 8);
            byteArrayOutputStream.write(i17 >>> 16);
            byteArrayOutputStream.write(i17 >>> 24);
            return;
        }
        byteArrayOutputStream.write(i17 >>> 24);
        byteArrayOutputStream.write(i17 >>> 16);
        byteArrayOutputStream.write(i17 >>> 8);
        byteArrayOutputStream.write(i17);
    }

    /* renamed from: writeLong */
    public static final void m138456xac298afb(java.io.ByteArrayOutputStream byteArrayOutputStream, long j17) {
        if (f71630x234d7504) {
            byteArrayOutputStream.write((byte) j17);
            byteArrayOutputStream.write((byte) (j17 >>> 8));
            byteArrayOutputStream.write((byte) (j17 >>> 16));
            byteArrayOutputStream.write((byte) (j17 >>> 24));
            byteArrayOutputStream.write((byte) (j17 >>> 32));
            byteArrayOutputStream.write((byte) (j17 >>> 40));
            byteArrayOutputStream.write((byte) (j17 >>> 48));
            byteArrayOutputStream.write((byte) (j17 >>> 56));
            return;
        }
        byteArrayOutputStream.write((byte) (j17 >>> 56));
        byteArrayOutputStream.write((byte) (j17 >>> 48));
        byteArrayOutputStream.write((byte) (j17 >>> 40));
        byteArrayOutputStream.write((byte) (j17 >>> 32));
        byteArrayOutputStream.write((byte) (j17 >>> 24));
        byteArrayOutputStream.write((byte) (j17 >>> 16));
        byteArrayOutputStream.write((byte) (j17 >>> 8));
        byteArrayOutputStream.write((byte) j17);
    }

    /* renamed from: writeSize */
    public static final void m138457xac2ca480(java.io.ByteArrayOutputStream byteArrayOutputStream, int i17) {
        if (i17 < 254) {
            byteArrayOutputStream.write(i17);
        } else if (i17 <= 65535) {
            byteArrayOutputStream.write(254);
            m138452xac2557d5(byteArrayOutputStream, i17);
        } else {
            byteArrayOutputStream.write(255);
            m138455x91f0c790(byteArrayOutputStream, i17);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f
    /* renamed from: decodeMessage */
    public java.lang.Object mo138407x37439e39(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(java.nio.ByteOrder.nativeOrder());
        java.lang.Object m138458xbd1ad57b = m138458xbd1ad57b(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalArgumentException("Message corrupted");
        }
        return m138458xbd1ad57b;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f
    /* renamed from: encodeMessage */
    public java.nio.ByteBuffer mo138408x6b057511(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.ExposedByteArrayOutputStream();
        mo84733xd98e5cd2(exposedByteArrayOutputStream, obj);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        allocateDirect.put(exposedByteArrayOutputStream.m138459xaddb9440(), 0, exposedByteArrayOutputStream.size());
        return allocateDirect;
    }

    /* renamed from: readValue */
    public final java.lang.Object m138458xbd1ad57b(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return mo84732x8819c70c(byteBuffer.get(), byteBuffer);
        }
        throw new java.lang.IllegalArgumentException("Message corrupted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* renamed from: readValueOfType */
    public java.lang.Object mo84732x8819c70c(byte b17, java.nio.ByteBuffer byteBuffer) {
        java.lang.Object arrayList;
        int i17 = 0;
        switch (b17) {
            case 0:
                return null;
            case 1:
                return java.lang.Boolean.TRUE;
            case 2:
                return java.lang.Boolean.FALSE;
            case 3:
                return java.lang.Integer.valueOf(byteBuffer.getInt());
            case 4:
                return java.lang.Long.valueOf(byteBuffer.getLong());
            case 5:
                return new java.math.BigInteger(new java.lang.String(m138448xbc0c0475(byteBuffer), f71636x27e791), 16);
            case 6:
                m138447xf798d0ed(byteBuffer, 8);
                return java.lang.Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new java.lang.String(m138448xbc0c0475(byteBuffer), f71636x27e791);
            case 8:
                return m138448xbc0c0475(byteBuffer);
            case 9:
                int m138449xcc49f2b7 = m138449xcc49f2b7(byteBuffer);
                int[] iArr = new int[m138449xcc49f2b7];
                m138447xf798d0ed(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position(byteBuffer.position() + (m138449xcc49f2b7 * 4));
                return iArr;
            case 10:
                int m138449xcc49f2b72 = m138449xcc49f2b7(byteBuffer);
                long[] jArr = new long[m138449xcc49f2b72];
                m138447xf798d0ed(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position(byteBuffer.position() + (m138449xcc49f2b72 * 8));
                return jArr;
            case 11:
                int m138449xcc49f2b73 = m138449xcc49f2b7(byteBuffer);
                double[] dArr = new double[m138449xcc49f2b73];
                m138447xf798d0ed(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position(byteBuffer.position() + (m138449xcc49f2b73 * 8));
                return dArr;
            case 12:
                int m138449xcc49f2b74 = m138449xcc49f2b7(byteBuffer);
                arrayList = new java.util.ArrayList(m138449xcc49f2b74);
                while (i17 < m138449xcc49f2b74) {
                    arrayList.add(m138458xbd1ad57b(byteBuffer));
                    i17++;
                }
                break;
            case 13:
                int m138449xcc49f2b75 = m138449xcc49f2b7(byteBuffer);
                arrayList = new java.util.HashMap();
                while (i17 < m138449xcc49f2b75) {
                    arrayList.put(m138458xbd1ad57b(byteBuffer), m138458xbd1ad57b(byteBuffer));
                    i17++;
                }
                break;
            case 14:
                int m138449xcc49f2b76 = m138449xcc49f2b7(byteBuffer);
                float[] fArr = new float[m138449xcc49f2b76];
                m138447xf798d0ed(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position(byteBuffer.position() + (m138449xcc49f2b76 * 4));
                return fArr;
            default:
                throw new java.lang.IllegalArgumentException("Message corrupted");
        }
        return arrayList;
    }

    /* renamed from: writeValue */
    public void mo84733xd98e5cd2(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.Object obj) {
        int i17 = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            byteArrayOutputStream.write(((java.lang.Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        if (obj instanceof java.lang.Number) {
            if ((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Short) || (obj instanceof java.lang.Byte)) {
                byteArrayOutputStream.write(3);
                m138455x91f0c790(byteArrayOutputStream, ((java.lang.Number) obj).intValue());
                return;
            }
            if (obj instanceof java.lang.Long) {
                byteArrayOutputStream.write(4);
                m138456xac298afb(byteArrayOutputStream, ((java.lang.Long) obj).longValue());
                return;
            }
            if ((obj instanceof java.lang.Float) || (obj instanceof java.lang.Double)) {
                byteArrayOutputStream.write(6);
                m138450x15bad4c4(byteArrayOutputStream, 8);
                m138453x3a4f1c90(byteArrayOutputStream, ((java.lang.Number) obj).doubleValue());
                return;
            } else {
                if (!(obj instanceof java.math.BigInteger)) {
                    throw new java.lang.IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                byteArrayOutputStream.write(5);
                m138451xd87f8bcc(byteArrayOutputStream, ((java.math.BigInteger) obj).toString(16).getBytes(f71636x27e791));
                return;
            }
        }
        if (obj instanceof java.lang.CharSequence) {
            byteArrayOutputStream.write(7);
            m138451xd87f8bcc(byteArrayOutputStream, obj.toString().getBytes(f71636x27e791));
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            m138451xd87f8bcc(byteArrayOutputStream, (byte[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            m138457xac2ca480(byteArrayOutputStream, iArr.length);
            m138450x15bad4c4(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i17 < length) {
                m138455x91f0c790(byteArrayOutputStream, iArr[i17]);
                i17++;
            }
            return;
        }
        if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            m138457xac2ca480(byteArrayOutputStream, jArr.length);
            m138450x15bad4c4(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i17 < length2) {
                m138456xac298afb(byteArrayOutputStream, jArr[i17]);
                i17++;
            }
            return;
        }
        if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            m138457xac2ca480(byteArrayOutputStream, dArr.length);
            m138450x15bad4c4(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i17 < length3) {
                m138453x3a4f1c90(byteArrayOutputStream, dArr[i17]);
                i17++;
            }
            return;
        }
        if (obj instanceof java.util.List) {
            byteArrayOutputStream.write(12);
            java.util.List list = (java.util.List) obj;
            m138457xac2ca480(byteArrayOutputStream, list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                mo84733xd98e5cd2(byteArrayOutputStream, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            byteArrayOutputStream.write(13);
            java.util.Map map = (java.util.Map) obj;
            m138457xac2ca480(byteArrayOutputStream, map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                mo84733xd98e5cd2(byteArrayOutputStream, entry.getKey());
                mo84733xd98e5cd2(byteArrayOutputStream, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new java.lang.IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        byteArrayOutputStream.write(14);
        float[] fArr = (float[]) obj;
        m138457xac2ca480(byteArrayOutputStream, fArr.length);
        m138450x15bad4c4(byteArrayOutputStream, 4);
        int length4 = fArr.length;
        while (i17 < length4) {
            m138454xd8b1edbd(byteArrayOutputStream, fArr[i17]);
            i17++;
        }
    }
}
