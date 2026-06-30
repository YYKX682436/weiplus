package com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b;

/* renamed from: com.tencent.wechat.zidl2.InvokerCodecEncoder */
/* loaded from: classes13.dex */
public class C27687xa835a820 {

    /* renamed from: CAPACITY */
    private static final int f60611x2a9b04ba = 4096;

    /* renamed from: buffer */
    private java.nio.ByteBuffer f60612xaddb9440;

    public C27687xa835a820() {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(4096);
        this.f60612xaddb9440 = allocateDirect;
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: ensureCapacity */
    private void m119493x61a3f718(int i17) {
        if (this.f60612xaddb9440.remaining() < i17) {
            int capacity = this.f60612xaddb9440.capacity();
            do {
                capacity *= 2;
            } while (capacity - this.f60612xaddb9440.position() < i17);
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(capacity);
            allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            this.f60612xaddb9440.flip();
            allocateDirect.put(this.f60612xaddb9440);
            this.f60612xaddb9440 = allocateDirect;
        }
    }

    /* renamed from: clear */
    public void m119494x5a5b64d() {
        this.f60612xaddb9440.clear();
    }

    /* renamed from: getByteBuffer */
    public java.nio.ByteBuffer m119495xeed4b35e() {
        this.f60612xaddb9440.flip();
        return this.f60612xaddb9440;
    }

    /* renamed from: writeBoolean */
    public void m119496xa577e349(boolean z17) {
        this.f60612xaddb9440.put(z17 ? (byte) 1 : (byte) 0);
    }

    /* renamed from: writeBooleanList */
    public void m119497x94f73b87(java.util.ArrayList<java.lang.Boolean> arrayList) {
        m119504xd8dd29ef(arrayList.size());
        java.util.Iterator<java.lang.Boolean> it = arrayList.iterator();
        while (it.hasNext()) {
            m119496xa577e349(it.next().booleanValue());
        }
    }

    /* renamed from: writeBytes */
    public void m119498xd87f8bcc(byte[] bArr) {
        m119493x61a3f718(bArr.length + 4);
        this.f60612xaddb9440.putInt(bArr.length);
        this.f60612xaddb9440.put(bArr);
    }

    /* renamed from: writeBytesList */
    public void m119499x3320ea8a(java.util.ArrayList<byte[]> arrayList) {
        m119504xd8dd29ef(arrayList.size());
        java.util.Iterator<byte[]> it = arrayList.iterator();
        while (it.hasNext()) {
            m119498xd87f8bcc(it.next());
        }
    }

    /* renamed from: writeDouble */
    public void m119500x3a4f1c90(double d17) {
        this.f60612xaddb9440.putDouble(d17);
    }

    /* renamed from: writeDoubleList */
    public void m119501xd72794e(java.util.ArrayList<java.lang.Double> arrayList) {
        m119504xd8dd29ef(arrayList.size());
        java.util.Iterator<java.lang.Double> it = arrayList.iterator();
        while (it.hasNext()) {
            m119500x3a4f1c90(it.next().doubleValue());
        }
    }

    /* renamed from: writeFloat */
    public void m119502xd8b1edbd(float f17) {
        this.f60612xaddb9440.putFloat(f17);
    }

    /* renamed from: writeFloatList */
    public void m119503x2e7eebfb(java.util.ArrayList<java.lang.Float> arrayList) {
        m119504xd8dd29ef(arrayList.size());
        java.util.Iterator<java.lang.Float> it = arrayList.iterator();
        while (it.hasNext()) {
            m119502xd8b1edbd(it.next().floatValue());
        }
    }

    /* renamed from: writeInt32 */
    public void m119504xd8dd29ef(int i17) {
        m119493x61a3f718(4);
        this.f60612xaddb9440.putInt(i17);
    }

    /* renamed from: writeInt32List */
    public void m119505x716cbf2d(java.util.ArrayList<java.lang.Integer> arrayList) {
        m119504xd8dd29ef(arrayList.size());
        java.util.Iterator<java.lang.Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            m119504xd8dd29ef(it.next().intValue());
        }
    }

    /* renamed from: writeInt64 */
    public void m119506xd8dd2a4e(long j17) {
        m119493x61a3f718(8);
        this.f60612xaddb9440.putLong(j17);
    }

    /* renamed from: writeInt64List */
    public void m119507x76a7780c(java.util.ArrayList<java.lang.Long> arrayList) {
        m119504xd8dd29ef(arrayList.size());
        java.util.Iterator<java.lang.Long> it = arrayList.iterator();
        while (it.hasNext()) {
            m119506xd8dd2a4e(it.next().longValue());
        }
    }

    /* renamed from: writeString */
    public void m119508x542d00d0(java.lang.String str) {
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        m119493x61a3f718(bytes.length + 4);
        this.f60612xaddb9440.putInt(bytes.length);
        this.f60612xaddb9440.put(bytes);
    }

    /* renamed from: writeStringList */
    public void m119509x81443d8e(java.util.ArrayList<java.lang.String> arrayList) {
        m119504xd8dd29ef(arrayList.size());
        java.util.Iterator<java.lang.String> it = arrayList.iterator();
        while (it.hasNext()) {
            m119508x542d00d0(it.next());
        }
    }

    /* renamed from: writeUInt32 */
    public void m119510x55370fd8(int i17) {
        m119504xd8dd29ef(i17);
    }

    /* renamed from: writeUInt32List */
    public void m119511xc11f8896(java.util.ArrayList<java.lang.Integer> arrayList) {
        m119504xd8dd29ef(arrayList.size());
        java.util.Iterator<java.lang.Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            m119510x55370fd8(it.next().intValue());
        }
    }

    /* renamed from: writeUInt64 */
    public void m119512x55371037(long j17) {
        m119506xd8dd2a4e(j17);
    }

    /* renamed from: writeUInt64List */
    public void m119513xc65a4175(java.util.ArrayList<java.lang.Long> arrayList) {
        m119504xd8dd29ef(arrayList.size());
        java.util.Iterator<java.lang.Long> it = arrayList.iterator();
        while (it.hasNext()) {
            m119512x55371037(it.next().longValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: writeValue */
    public <T> void m119514xd98e5cd2(T t17) {
        java.lang.Class<?> cls = t17.getClass();
        if (cls == java.lang.Integer.class) {
            this.f60612xaddb9440.putInt(((java.lang.Integer) t17).intValue());
            return;
        }
        if (cls == java.lang.Long.class) {
            this.f60612xaddb9440.putLong(((java.lang.Long) t17).longValue());
            return;
        }
        if (cls == java.lang.Float.class) {
            this.f60612xaddb9440.putFloat(((java.lang.Float) t17).floatValue());
            return;
        }
        if (cls == java.lang.Double.class) {
            this.f60612xaddb9440.putDouble(((java.lang.Double) t17).doubleValue());
            return;
        }
        if (cls == java.lang.Short.class) {
            this.f60612xaddb9440.putShort(((java.lang.Short) t17).shortValue());
        } else {
            if (cls != java.lang.Boolean.class) {
                throw new java.lang.RuntimeException(java.lang.String.format("Unsupported class %s", cls.getSimpleName()));
            }
            this.f60612xaddb9440.put(((java.lang.Boolean) t17).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: writeValueList */
    public <T> void m119515x7eb3c890(java.util.ArrayList<T> arrayList) {
        m119504xd8dd29ef(arrayList.size());
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            m119514xd98e5cd2(it.next());
        }
    }
}
