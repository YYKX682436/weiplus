package org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440;

/* renamed from: org.msgpack.core.buffer.MessageBufferU */
/* loaded from: classes7.dex */
public class C29715x4f3922e extends org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f75072x7118e671 = false;

    /* renamed from: wrap */
    private final java.nio.ByteBuffer f75073x37d04a;

    public C29715x4f3922e(byte[] bArr, int i17, int i18) {
        super(bArr, i17, i18);
        this.f75073x37d04a = java.nio.ByteBuffer.wrap(bArr, i17, i18).slice();
    }

    /* renamed from: resetBufferPosition */
    private void m155011x4e8c44b8() {
        this.f75073x37d04a.position(0);
        this.f75073x37d04a.limit(this.f75087x35e001);
    }

    /* renamed from: array */
    public byte[] m155012x58c7259() {
        if (mo155023x6bd7fdf()) {
            return this.f75073x37d04a.array();
        }
        return null;
    }

    /* renamed from: copyTo */
    public void m155013xaf40b0d0(int i17, org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar, int i18, int i19) {
        try {
            this.f75073x37d04a.position(i17);
            hVar.mo155026xcc8a43d7(i18, this.f75073x37d04a, i19);
        } finally {
            m155011x4e8c44b8();
        }
    }

    /* renamed from: getBoolean */
    public boolean m155014x41a8a7f2(int i17) {
        return this.f75073x37d04a.get(i17) != 0;
    }

    @Override // org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h
    /* renamed from: getByte */
    public byte mo155015xfb7dc97e(int i17) {
        return this.f75073x37d04a.get(i17);
    }

    /* renamed from: getBytes */
    public void m155016x743b66b5(int i17, int i18, java.nio.ByteBuffer byteBuffer) {
        try {
            this.f75073x37d04a.position(i17);
            this.f75073x37d04a.limit(i17 + i18);
            byteBuffer.put(this.f75073x37d04a);
        } finally {
            m155011x4e8c44b8();
        }
    }

    /* renamed from: getDouble */
    public double m155018x160e9ec7(int i17) {
        return this.f75073x37d04a.getDouble(i17);
    }

    /* renamed from: getFloat */
    public float m155019x746dc8a6(int i17) {
        return this.f75073x37d04a.getFloat(i17);
    }

    @Override // org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h
    /* renamed from: getInt */
    public int mo155020xb58848b9(int i17) {
        return this.f75073x37d04a.getInt(i17);
    }

    @Override // org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h
    /* renamed from: getLong */
    public long mo155021xfb822ef2(int i17) {
        return this.f75073x37d04a.getLong(i17);
    }

    @Override // org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h
    /* renamed from: getShort */
    public short mo155022x75232ac6(int i17) {
        return this.f75073x37d04a.getShort(i17);
    }

    @Override // org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h
    /* renamed from: hasArray */
    public boolean mo155023x6bd7fdf() {
        return !this.f75073x37d04a.isDirect();
    }

    /* renamed from: putBoolean */
    public void m155024x1c849219(int i17, boolean z17) {
        this.f75073x37d04a.put(i17, z17 ? (byte) 1 : (byte) 0);
    }

    @Override // org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h
    /* renamed from: putByte */
    public void mo155025xf2e368b7(int i17, byte b17) {
        this.f75073x37d04a.put(i17, b17);
    }

    @Override // org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h
    /* renamed from: putByteBuffer */
    public void mo155026xcc8a43d7(int i17, java.nio.ByteBuffer byteBuffer, int i18) {
        if (byteBuffer.hasArray()) {
            mo155027x6989ae9c(i17, byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), i18);
            byteBuffer.position(byteBuffer.position() + i18);
            return;
        }
        int limit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i18);
            this.f75073x37d04a.position(i17);
            this.f75073x37d04a.put(byteBuffer);
        } finally {
            byteBuffer.limit(limit);
        }
    }

    @Override // org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h
    /* renamed from: putBytes */
    public void mo155027x6989ae9c(int i17, byte[] bArr, int i18, int i19) {
        try {
            this.f75073x37d04a.position(i17);
            this.f75073x37d04a.put(bArr, i18, i19);
        } finally {
            m155011x4e8c44b8();
        }
    }

    /* renamed from: putDouble */
    public void m155028xca8953c0(int i17, double d17) {
        this.f75073x37d04a.putDouble(i17, d17);
    }

    /* renamed from: putFloat */
    public void m155029x69bc108d(int i17, float f17) {
        this.f75073x37d04a.putFloat(i17, f17);
    }

    @Override // org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h
    /* renamed from: putInt */
    public void mo155030xc5c55e60(int i17, int i18) {
        this.f75073x37d04a.putInt(i17, i18);
    }

    @Override // org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h
    /* renamed from: putLong */
    public void mo155031xf2e7ce2b(int i17, long j17) {
        this.f75073x37d04a.putLong(i17, j17);
    }

    @Override // org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h
    /* renamed from: putMessageBuffer */
    public void mo155032xcf6e4c58(int i17, org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar, int i18, int i19) {
        mo155026xcc8a43d7(i17, hVar.mo155036x18a93ec(i18, i19), i19);
    }

    @Override // org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h
    /* renamed from: putShort */
    public void mo155033x6a7172ad(int i17, short s17) {
        this.f75073x37d04a.putShort(i17, s17);
    }

    @Override // org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h
    /* renamed from: sliceAsByteBuffer */
    public java.nio.ByteBuffer mo155036x18a93ec(int i17, int i18) {
        try {
            this.f75073x37d04a.position(i17);
            this.f75073x37d04a.limit(i17 + i18);
            return this.f75073x37d04a.slice();
        } finally {
            m155011x4e8c44b8();
        }
    }

    /* renamed from: toByteArray */
    public byte[] m155037x5f01b1f6() {
        int m155049x35e001 = m155049x35e001();
        byte[] bArr = new byte[m155049x35e001];
        mo155017x743b66b5(0, bArr, 0, m155049x35e001);
        return bArr;
    }

    @Override // org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h
    /* renamed from: slice */
    public org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.C29715x4f3922e mo155034x6873d92(int i17, int i18) {
        if (i17 == 0 && i18 == m155049x35e001()) {
            return this;
        }
        int i19 = i17 + i18;
        if (i19 <= m155049x35e001()) {
            try {
                this.f75073x37d04a.position(i17);
                this.f75073x37d04a.limit(i19);
                return new org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.C29715x4f3922e(this.f75085x2e06d1, i17 + this.f75084xbb979bf4, i18, this.f75073x37d04a.slice());
            } finally {
                m155011x4e8c44b8();
            }
        }
        throw new java.lang.IllegalArgumentException();
    }

    public C29715x4f3922e(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
        this.f75073x37d04a = byteBuffer.slice();
    }

    private C29715x4f3922e(java.lang.Object obj, long j17, int i17, java.nio.ByteBuffer byteBuffer) {
        super(obj, j17, i17);
        this.f75073x37d04a = byteBuffer;
    }

    @Override // org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h
    /* renamed from: getBytes */
    public void mo155017x743b66b5(int i17, byte[] bArr, int i18, int i19) {
        try {
            this.f75073x37d04a.position(i17);
            this.f75073x37d04a.get(bArr, i18, i19);
        } finally {
            m155011x4e8c44b8();
        }
    }

    /* renamed from: sliceAsByteBuffer */
    public java.nio.ByteBuffer m155035x18a93ec() {
        return mo155036x18a93ec(0, this.f75087x35e001);
    }
}
