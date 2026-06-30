package com.p159x477cd522.p160x333422;

/* renamed from: com.eclipsesource.mmv8.V8Value */
/* loaded from: classes7.dex */
public abstract class AbstractC1488x29d0ebef implements com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98 {

    /* renamed from: BOOLEAN */
    public static final int f4834x2ea6f808 = 3;

    /* renamed from: BYTE */
    public static final int f4835x1f5908 = 9;

    /* renamed from: DOUBLE */
    public static final int f4836x788a6fd1 = 2;

    /* renamed from: FLOAT_32_ARRAY */
    public static final int f4837x99972afc = 16;

    /* renamed from: FLOAT_64_ARRAY */
    public static final int f4838x3b07281b = 2;

    /* renamed from: INTEGER */
    public static final int f4839x9f810d1e = 1;

    /* renamed from: INT_16_ARRAY */
    public static final int f4840x6d55e20f = 13;

    /* renamed from: INT_32_ARRAY */
    public static final int f4841x697f4ec9 = 1;

    /* renamed from: INT_8_ARRAY */
    public static final int f4842x4ecf5702 = 9;

    /* renamed from: NULL */
    public static final int f4843x24bd87 = 0;

    /* renamed from: STRING */
    public static final int f4844x92685411 = 4;

    /* renamed from: UNDEFINED */
    public static final int f4845x68377130 = 99;

    /* renamed from: UNKNOWN */
    public static final int f4846x19d1382a = 0;

    /* renamed from: UNSIGNED_INT_16_ARRAY */
    public static final int f4847xbe80ab19 = 14;

    /* renamed from: UNSIGNED_INT_32_ARRAY */
    public static final int f4848xbaaa17d3 = 15;

    /* renamed from: UNSIGNED_INT_8_ARRAY */
    public static final int f4849xa40244b8 = 11;

    /* renamed from: UNSIGNED_INT_8_CLAMPED_ARRAY */
    public static final int f4850xfc1373b3 = 12;

    /* renamed from: V8_ARRAY */
    public static final int f4851x1dd8e65c = 5;

    /* renamed from: V8_ARRAY_BUFFER */
    public static final int f4852xd942ff83 = 10;

    /* renamed from: V8_FUNCTION */
    public static final int f4853xfb3f60d5 = 7;

    /* renamed from: V8_OBJECT */
    public static final int f4854xb442af7c = 6;

    /* renamed from: V8_TYPED_ARRAY */
    public static final int f4855xb8bce3e7 = 8;

    /* renamed from: objectHandle */
    protected long f4856x9fca5247;

    /* renamed from: released */
    protected boolean f4857xdf23d93d = true;

    /* renamed from: v8, reason: collision with root package name */
    protected com.p159x477cd522.p160x333422.V8 f125529v8;

    public AbstractC1488x29d0ebef() {
    }

    @java.lang.Deprecated
    /* renamed from: getStringRepresentaion */
    public static java.lang.String m16469xe0e38768(int i17) {
        return m16470x3b924fb4(i17);
    }

    /* renamed from: getStringRepresentation */
    public static java.lang.String m16470x3b924fb4(int i17) {
        if (i17 == 99) {
            return "Undefined";
        }
        switch (i17) {
            case 0:
                return "Null";
            case 1:
                return com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56126xc3426119;
            case 2:
                return "Double";
            case 3:
                return "Boolean";
            case 4:
                return "String";
            case 5:
                return "V8Array";
            case 6:
                return "V8Object";
            case 7:
                return "V8Function";
            case 8:
                return "V8TypedArray";
            case 9:
                return "Byte";
            case 10:
                return "V8ArrayBuffer";
            case 11:
                return "UInt8Array";
            case 12:
                return "UInt8ClampedArray";
            case 13:
                return "Int16Array";
            case 14:
                return "UInt16Array";
            case 15:
                return "UInt32Array";
            case 16:
                return "Float32Array";
            default:
                throw new java.lang.IllegalArgumentException("Invalid V8 type: " + i17);
        }
    }

    /* renamed from: addObjectReference */
    public void m16471x9d95bbeb(long j17) {
        this.f4856x9fca5247 = j17;
        try {
            this.f125529v8.m16111xf838041d(this);
        } catch (java.lang.Error e17) {
            mo15825x41012807();
            throw e17;
        } catch (java.lang.RuntimeException e18) {
            mo15825x41012807();
            throw e18;
        }
    }

    /* renamed from: checkReleased */
    public void m16472x6f109a65() {
        if (this.f4857xdf23d93d) {
            throw new java.lang.IllegalStateException("Object released");
        }
    }

    /* renamed from: createTwin */
    public abstract com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef mo16283x519cbe04();

    /* renamed from: equals */
    public boolean mo16317xb2c87fbf(java.lang.Object obj) {
        return m16478x25c8cfe8(obj);
    }

    /* renamed from: getHandle */
    public long m16473x1c19911e() {
        m16472x6f109a65();
        return this.f4856x9fca5247;
    }

    /* renamed from: getRuntime */
    public com.p159x477cd522.p160x333422.V8 mo16331x9a3f0ba2() {
        return this.f125529v8;
    }

    /* renamed from: getV8Type */
    public int m16474x31b023d2() {
        if (mo16336x85ca346()) {
            return 99;
        }
        this.f125529v8.m16140x2edbf932();
        this.f125529v8.m16472x6f109a65();
        com.p159x477cd522.p160x333422.V8 v86 = this.f125529v8;
        return v86.m16213xfb85f7b0(v86.m16218xd618fe8e(), this.f4856x9fca5247);
    }

    /* renamed from: hashCode */
    public int mo16334x8cdac1b() {
        this.f125529v8.m16140x2edbf932();
        m16472x6f109a65();
        com.p159x477cd522.p160x333422.V8 v86 = this.f125529v8;
        return v86.m16219xf8c816ec(v86.m16218xd618fe8e(), m16473x1c19911e());
    }

    /* renamed from: initialize */
    public void mo15907x33ebcb90(long j17, java.lang.Object obj) {
        long m16230xe7671af1 = this.f125529v8.m16230xe7671af1(j17);
        this.f4857xdf23d93d = false;
        m16471x9d95bbeb(m16230xe7671af1);
    }

    /* renamed from: isReleased */
    public boolean mo16335xafdb8087() {
        return this.f4857xdf23d93d;
    }

    /* renamed from: isUndefined */
    public boolean mo16336x85ca346() {
        return false;
    }

    /* renamed from: isWeak */
    public boolean m16475xb9aa7bc2() {
        this.f125529v8.m16140x2edbf932();
        this.f125529v8.m16472x6f109a65();
        com.p159x477cd522.p160x333422.V8 v86 = this.f125529v8;
        return v86.m16236xb9aa7bc2(v86.m16218xd618fe8e(), m16473x1c19911e());
    }

    /* renamed from: jsEquals */
    public boolean m16476x42d69e68(java.lang.Object obj) {
        this.f125529v8.m16140x2edbf932();
        m16472x6f109a65();
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef)) {
            return false;
        }
        if (mo16336x85ca346() && ((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) obj).mo16336x85ca346()) {
            return true;
        }
        com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef = (com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) obj;
        if (abstractC1488x29d0ebef.mo16336x85ca346()) {
            return false;
        }
        com.p159x477cd522.p160x333422.V8 v86 = this.f125529v8;
        return v86.m16156xb2c87fbf(v86.m16218xd618fe8e(), m16473x1c19911e(), abstractC1488x29d0ebef.m16473x1c19911e());
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98
    /* renamed from: release */
    public void mo15825x41012807() {
        this.f125529v8.m16140x2edbf932();
        if (this.f4857xdf23d93d) {
            return;
        }
        try {
            this.f125529v8.m16259xb4340f03(this);
        } finally {
            this.f4857xdf23d93d = true;
            com.p159x477cd522.p160x333422.V8 v86 = this.f125529v8;
            v86.m16255x41012807(v86.m16218xd618fe8e(), this.f4856x9fca5247);
        }
    }

    /* renamed from: setWeak */
    public com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef m16477x7651cefa() {
        this.f125529v8.m16140x2edbf932();
        this.f125529v8.m16472x6f109a65();
        this.f125529v8.f4786x6c917f42.put(java.lang.Long.valueOf(m16473x1c19911e()), this);
        com.p159x477cd522.p160x333422.V8 v86 = this.f125529v8;
        v86.m16272x7651cefa(v86.m16218xd618fe8e(), m16473x1c19911e());
        return this;
    }

    /* renamed from: strictEquals */
    public boolean m16478x25c8cfe8(java.lang.Object obj) {
        this.f125529v8.m16140x2edbf932();
        m16472x6f109a65();
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef)) {
            return false;
        }
        if (mo16336x85ca346() && ((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) obj).mo16336x85ca346()) {
            return true;
        }
        com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef = (com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) obj;
        if (abstractC1488x29d0ebef.mo16336x85ca346()) {
            return false;
        }
        com.p159x477cd522.p160x333422.V8 v86 = this.f125529v8;
        return v86.m16274x25c8cfe8(v86.m16218xd618fe8e(), m16473x1c19911e(), abstractC1488x29d0ebef.m16473x1c19911e());
    }

    /* renamed from: twin */
    public com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef mo16314x3686e8() {
        if (mo16336x85ca346()) {
            return this;
        }
        this.f125529v8.m16140x2edbf932();
        this.f125529v8.m16472x6f109a65();
        com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef mo16283x519cbe04 = mo16283x519cbe04();
        this.f125529v8.m16147x519cbe04(this, mo16283x519cbe04);
        return mo16283x519cbe04;
    }

    public AbstractC1488x29d0ebef(com.p159x477cd522.p160x333422.V8 v86) {
        if (v86 == null) {
            this.f125529v8 = (com.p159x477cd522.p160x333422.V8) this;
        } else {
            this.f125529v8 = v86;
        }
    }
}
