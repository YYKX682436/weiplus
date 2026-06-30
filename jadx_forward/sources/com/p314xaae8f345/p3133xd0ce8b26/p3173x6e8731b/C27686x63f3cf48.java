package com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b;

/* renamed from: com.tencent.wechat.zidl2.InvokerCodecDecoder */
/* loaded from: classes15.dex */
public class C27686x63f3cf48 {

    /* renamed from: buffer */
    private java.nio.ByteBuffer f60610xaddb9440;

    public C27686x63f3cf48(java.nio.ByteBuffer byteBuffer) {
        this.f60610xaddb9440 = byteBuffer;
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: readBoolean */
    public boolean m119473xd7c8d5b2() {
        return this.f60610xaddb9440.get() == 1;
    }

    /* renamed from: readBooleanList */
    public java.util.ArrayList<java.lang.Boolean> m119474x7746d170() {
        int m119481xbc69a298 = m119481xbc69a298();
        java.util.ArrayList<java.lang.Boolean> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < m119481xbc69a298; i17++) {
            arrayList.add(java.lang.Boolean.valueOf(m119473xd7c8d5b2()));
        }
        return arrayList;
    }

    /* renamed from: readBytes */
    public byte[] m119475xbc0c0475() {
        byte[] bArr = new byte[m119481xbc69a298()];
        this.f60610xaddb9440.get(bArr);
        return bArr;
    }

    /* renamed from: readBytesList */
    public java.util.ArrayList<byte[]> m119476x14fee6b3() {
        int m119481xbc69a298 = m119481xbc69a298();
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < m119481xbc69a298; i17++) {
            arrayList.add(m119475xbc0c0475());
        }
        return arrayList;
    }

    /* renamed from: readDouble */
    public double m119477xc851b907() {
        return this.f60610xaddb9440.getDouble();
    }

    /* renamed from: readDoubleList */
    public java.util.ArrayList<java.lang.Double> m119478x67540245() {
        int m119481xbc69a298 = m119481xbc69a298();
        java.util.ArrayList<java.lang.Double> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < m119481xbc69a298; i17++) {
            arrayList.add(java.lang.Double.valueOf(m119477xc851b907()));
        }
        return arrayList;
    }

    /* renamed from: readFloat */
    public float m119479xbc3e6666() {
        return this.f60610xaddb9440.getFloat();
    }

    /* renamed from: readFloatList */
    public java.util.ArrayList<java.lang.Float> m119480x105ce824() {
        int m119481xbc69a298 = m119481xbc69a298();
        java.util.ArrayList<java.lang.Float> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < m119481xbc69a298; i17++) {
            arrayList.add(java.lang.Float.valueOf(m119479xbc3e6666()));
        }
        return arrayList;
    }

    /* renamed from: readInt32 */
    public int m119481xbc69a298() {
        return this.f60610xaddb9440.getInt();
    }

    /* renamed from: readInt32List */
    public java.util.ArrayList<java.lang.Integer> m119482x534abb56() {
        int m119481xbc69a298 = m119481xbc69a298();
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < m119481xbc69a298; i17++) {
            arrayList.add(java.lang.Integer.valueOf(m119481xbc69a298()));
        }
        return arrayList;
    }

    /* renamed from: readInt64 */
    public long m119483xbc69a2f7() {
        return this.f60610xaddb9440.getLong();
    }

    /* renamed from: readInt64List */
    public java.util.ArrayList<java.lang.Long> m119484x58857435() {
        int m119481xbc69a298 = m119481xbc69a298();
        java.util.ArrayList<java.lang.Long> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < m119481xbc69a298; i17++) {
            arrayList.add(java.lang.Long.valueOf(m119483xbc69a2f7()));
        }
        return arrayList;
    }

    /* renamed from: readString */
    public java.lang.String m119485xe22f9d47() {
        byte[] bArr = new byte[m119481xbc69a298()];
        this.f60610xaddb9440.get(bArr);
        return new java.lang.String(bArr);
    }

    /* renamed from: readStringList */
    public java.util.ArrayList<java.lang.String> m119486xdb25c685() {
        int m119481xbc69a298 = m119481xbc69a298();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < m119481xbc69a298; i17++) {
            arrayList.add(m119485xe22f9d47());
        }
        return arrayList;
    }

    /* renamed from: readUInt32 */
    public int m119487xe339ac4f() {
        return m119481xbc69a298();
    }

    /* renamed from: readUInt32List */
    public java.util.ArrayList<java.lang.Integer> m119488x1b01118d() {
        int m119481xbc69a298 = m119481xbc69a298();
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < m119481xbc69a298; i17++) {
            arrayList.add(java.lang.Integer.valueOf(m119487xe339ac4f()));
        }
        return arrayList;
    }

    /* renamed from: readUInt64 */
    public long m119489xe339acae() {
        return m119483xbc69a2f7();
    }

    /* renamed from: readUInt64List */
    public java.util.ArrayList<java.lang.Long> m119490x203bca6c() {
        int m119481xbc69a298 = m119481xbc69a298();
        java.util.ArrayList<java.lang.Long> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < m119481xbc69a298; i17++) {
            arrayList.add(java.lang.Long.valueOf(m119489xe339acae()));
        }
        return arrayList;
    }

    /* renamed from: readValue */
    public <T> T m119491xbd1ad57b(java.lang.Class<?> cls) {
        if (cls == java.lang.Integer.class || cls == java.lang.Integer.TYPE) {
            return (T) java.lang.Integer.valueOf(this.f60610xaddb9440.getInt());
        }
        if (cls == java.lang.Long.class || cls == java.lang.Long.TYPE) {
            return (T) java.lang.Long.valueOf(this.f60610xaddb9440.getLong());
        }
        if (cls == java.lang.Float.class || cls == java.lang.Float.TYPE) {
            return (T) java.lang.Float.valueOf(this.f60610xaddb9440.getFloat());
        }
        if (cls == java.lang.Double.class || cls == java.lang.Double.TYPE) {
            return (T) java.lang.Double.valueOf(this.f60610xaddb9440.getDouble());
        }
        if (cls == java.lang.Short.class || cls == java.lang.Short.TYPE) {
            return (T) java.lang.Short.valueOf(this.f60610xaddb9440.getShort());
        }
        if (cls == java.lang.Boolean.class || cls == java.lang.Boolean.TYPE) {
            return (T) java.lang.Byte.valueOf(this.f60610xaddb9440.get());
        }
        throw new java.lang.RuntimeException(java.lang.String.format("Unsupported class %s", cls.getSimpleName()));
    }

    /* renamed from: readValueList */
    public <T> java.util.ArrayList<T> m119492x6091c4b9(java.lang.Class<?> cls) {
        int m119481xbc69a298 = m119481xbc69a298();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList();
        for (int i17 = 0; i17 < m119481xbc69a298; i17++) {
            b0Var.add(m119491xbd1ad57b(cls));
        }
        return b0Var;
    }
}
