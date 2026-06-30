package com.p159x477cd522.p160x333422;

/* renamed from: com.eclipsesource.mmv8.V8TypedArray */
/* loaded from: classes7.dex */
public class C1487x63ed6051 extends com.p159x477cd522.p160x333422.C1469x28b0ccd7 {

    /* renamed from: com.eclipsesource.mmv8.V8TypedArray$V8ArrayData */
    /* loaded from: classes7.dex */
    public static class V8ArrayData {

        /* renamed from: buffer */
        private com.p159x477cd522.p160x333422.C1470x40840ff7 f4830xaddb9440;

        /* renamed from: offset */
        private int f4831xc3376493;

        /* renamed from: size */
        private int f4832x35e001;

        /* renamed from: type */
        private int f4833x368f3a;

        public V8ArrayData(com.p159x477cd522.p160x333422.C1470x40840ff7 c1470x40840ff7, int i17, int i18, int i19) {
            this.f4830xaddb9440 = c1470x40840ff7;
            this.f4831xc3376493 = i17;
            this.f4832x35e001 = i18;
            this.f4833x368f3a = i19;
        }
    }

    public C1487x63ed6051(com.p159x477cd522.p160x333422.V8 v86, com.p159x477cd522.p160x333422.C1470x40840ff7 c1470x40840ff7, int i17, int i18, int i19) {
        super(v86, new com.p159x477cd522.p160x333422.C1487x63ed6051.V8ArrayData(c1470x40840ff7, i18, i19, i17));
    }

    /* renamed from: checkArrayProperties */
    private void m16458x4ddea244(com.p159x477cd522.p160x333422.C1487x63ed6051.V8ArrayData v8ArrayData) {
        m16459x26324fbb(v8ArrayData);
        m16460x17c17529(v8ArrayData);
    }

    /* renamed from: checkOffset */
    private void m16459x26324fbb(com.p159x477cd522.p160x333422.C1487x63ed6051.V8ArrayData v8ArrayData) {
        if (v8ArrayData.f4831xc3376493 % m16462xb01a4c5e(v8ArrayData.f4833x368f3a) == 0) {
            return;
        }
        throw new java.lang.IllegalStateException("RangeError: Start offset of Int32Array must be a multiple of " + m16462xb01a4c5e(v8ArrayData.f4833x368f3a));
    }

    /* renamed from: checkSize */
    private void m16460x17c17529(com.p159x477cd522.p160x333422.C1487x63ed6051.V8ArrayData v8ArrayData) {
        if (v8ArrayData.f4832x35e001 < 0) {
            throw new java.lang.IllegalStateException("RangeError: Invalid typed array length");
        }
        if ((v8ArrayData.f4832x35e001 * m16462xb01a4c5e(v8ArrayData.f4833x368f3a)) + v8ArrayData.f4831xc3376493 > v8ArrayData.f4830xaddb9440.m16341x3970ce7c().limit()) {
            throw new java.lang.IllegalStateException("RangeError: Invalid typed array length");
        }
    }

    /* renamed from: createTypedArray */
    private long m16461x32364e2b(long j17, com.p159x477cd522.p160x333422.C1487x63ed6051.V8ArrayData v8ArrayData) {
        int i17 = v8ArrayData.f4833x368f3a;
        if (i17 == 1) {
            return this.f125529v8.m16228xf4a85b1d(j17, v8ArrayData.f4830xaddb9440.f4856x9fca5247, v8ArrayData.f4831xc3376493, v8ArrayData.f4832x35e001);
        }
        if (i17 == 2) {
            return this.f125529v8.m16225x1fae2a91(j17, v8ArrayData.f4830xaddb9440.f4856x9fca5247, v8ArrayData.f4831xc3376493, v8ArrayData.f4832x35e001);
        }
        if (i17 == 9) {
            return this.f125529v8.m16229xbec1a0be(j17, v8ArrayData.f4830xaddb9440.f4856x9fca5247, v8ArrayData.f4831xc3376493, v8ArrayData.f4832x35e001);
        }
        switch (i17) {
            case 11:
                return this.f125529v8.m16233x3a0af6d(j17, v8ArrayData.f4830xaddb9440.f4856x9fca5247, v8ArrayData.f4831xc3376493, v8ArrayData.f4832x35e001);
            case 12:
                return this.f125529v8.m16234x3a1444b(j17, v8ArrayData.f4830xaddb9440.f4856x9fca5247, v8ArrayData.f4831xc3376493, v8ArrayData.f4832x35e001);
            case 13:
                return this.f125529v8.m16227x91af4717(j17, v8ArrayData.f4830xaddb9440.f4856x9fca5247, v8ArrayData.f4831xc3376493, v8ArrayData.f4832x35e001);
            case 14:
                return this.f125529v8.m16231xe8b20e48(j17, v8ArrayData.f4830xaddb9440.f4856x9fca5247, v8ArrayData.f4831xc3376493, v8ArrayData.f4832x35e001);
            case 15:
                return this.f125529v8.m16232x4bab224e(j17, v8ArrayData.f4830xaddb9440.f4856x9fca5247, v8ArrayData.f4831xc3376493, v8ArrayData.f4832x35e001);
            case 16:
                return this.f125529v8.m16224x7d91c790(j17, v8ArrayData.f4830xaddb9440.f4856x9fca5247, v8ArrayData.f4831xc3376493, v8ArrayData.f4832x35e001);
            default:
                throw new java.lang.IllegalArgumentException("Cannot create a typed array of type " + com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef.m16470x3b924fb4(v8ArrayData.f4833x368f3a));
        }
    }

    /* renamed from: getStructureSize */
    public static int m16462xb01a4c5e(int i17) {
        if (i17 == 1) {
            return 4;
        }
        if (i17 == 2) {
            return 8;
        }
        if (i17 != 9) {
            switch (i17) {
                case 11:
                case 12:
                    break;
                case 13:
                case 14:
                    return 2;
                case 15:
                case 16:
                    return 4;
                default:
                    throw new java.lang.IllegalArgumentException("Cannot create a typed array of type " + com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef.m16470x3b924fb4(i17));
            }
        }
        return 1;
    }

    @Override // com.p159x477cd522.p160x333422.C1469x28b0ccd7, com.p159x477cd522.p160x333422.C1477x4679881, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef
    /* renamed from: createTwin */
    public com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef mo16283x519cbe04() {
        return new com.p159x477cd522.p160x333422.C1487x63ed6051(this.f125529v8);
    }

    /* renamed from: getBuffer */
    public com.p159x477cd522.p160x333422.C1470x40840ff7 m16463x12f2b736() {
        return (com.p159x477cd522.p160x333422.C1470x40840ff7) get("buffer");
    }

    /* renamed from: getByteBuffer */
    public java.nio.ByteBuffer m16464xeed4b35e() {
        com.p159x477cd522.p160x333422.C1470x40840ff7 m16463x12f2b736 = m16463x12f2b736();
        try {
            return m16463x12f2b736.m16341x3970ce7c();
        } finally {
            m16463x12f2b736.mo15825x41012807();
        }
    }

    @Override // com.p159x477cd522.p160x333422.C1469x28b0ccd7, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef
    /* renamed from: initialize */
    public void mo15907x33ebcb90(long j17, java.lang.Object obj) {
        this.f125529v8.m16140x2edbf932();
        if (obj == null) {
            super.mo15907x33ebcb90(j17, obj);
            return;
        }
        com.p159x477cd522.p160x333422.C1487x63ed6051.V8ArrayData v8ArrayData = (com.p159x477cd522.p160x333422.C1487x63ed6051.V8ArrayData) obj;
        m16458x4ddea244(v8ArrayData);
        long m16461x32364e2b = m16461x32364e2b(j17, v8ArrayData);
        this.f4857xdf23d93d = false;
        m16471x9d95bbeb(m16461x32364e2b);
    }

    private C1487x63ed6051(com.p159x477cd522.p160x333422.V8 v86) {
        super(v86);
    }
}
