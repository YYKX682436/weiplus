package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.ByteOrderedDataOutputStream */
/* loaded from: classes13.dex */
class C0780x6b695cf0 extends java.io.FilterOutputStream {

    /* renamed from: mByteOrder */
    private java.nio.ByteOrder f1865xff92e539;

    /* renamed from: mOutputStream */
    final java.io.OutputStream f1866x8fcfe8ee;

    public C0780x6b695cf0(java.io.OutputStream outputStream, java.nio.ByteOrder byteOrder) {
        super(outputStream);
        this.f1866x8fcfe8ee = outputStream;
        this.f1865xff92e539 = byteOrder;
    }

    /* renamed from: setByteOrder */
    public void m5800xe09ccce4(java.nio.ByteOrder byteOrder) {
        this.f1865xff92e539 = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.f1866x8fcfe8ee.write(bArr);
    }

    /* renamed from: writeByte */
    public void m5801xac252587(int i17) {
        this.f1866x8fcfe8ee.write(i17);
    }

    /* renamed from: writeInt */
    public void m5802x91f0c790(int i17) {
        java.nio.ByteOrder byteOrder = this.f1865xff92e539;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            this.f1866x8fcfe8ee.write((i17 >>> 0) & 255);
            this.f1866x8fcfe8ee.write((i17 >>> 8) & 255);
            this.f1866x8fcfe8ee.write((i17 >>> 16) & 255);
            this.f1866x8fcfe8ee.write((i17 >>> 24) & 255);
            return;
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            this.f1866x8fcfe8ee.write((i17 >>> 24) & 255);
            this.f1866x8fcfe8ee.write((i17 >>> 16) & 255);
            this.f1866x8fcfe8ee.write((i17 >>> 8) & 255);
            this.f1866x8fcfe8ee.write((i17 >>> 0) & 255);
        }
    }

    /* renamed from: writeShort */
    public void m5803xd9674fdd(short s17) {
        java.nio.ByteOrder byteOrder = this.f1865xff92e539;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            this.f1866x8fcfe8ee.write((s17 >>> 0) & 255);
            this.f1866x8fcfe8ee.write((s17 >>> 8) & 255);
        } else if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            this.f1866x8fcfe8ee.write((s17 >>> 8) & 255);
            this.f1866x8fcfe8ee.write((s17 >>> 0) & 255);
        }
    }

    /* renamed from: writeUnsignedInt */
    public void m5804x469c575b(long j17) {
        m5802x91f0c790((int) j17);
    }

    /* renamed from: writeUnsignedShort */
    public void m5805x116e18e8(int i17) {
        m5803xd9674fdd((short) i17);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        this.f1866x8fcfe8ee.write(bArr, i17, i18);
    }
}
