package kg;

/* loaded from: classes16.dex */
public final class k1 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.l1 {

    /* renamed from: DECODER_TYPE_FIELD_NUMBER */
    public static final int f72515x1bf32bd8 = 1;

    /* renamed from: FILE_PATH_FIELD_NUMBER */
    public static final int f72517xb479fc25 = 3;

    /* renamed from: LAYER_INDEX_FIELD_NUMBER */
    public static final int f72518x6f041689 = 5;

    /* renamed from: LAYER_SPATIAL_DESC_FIELD_NUMBER */
    public static final int f72519xdb0a8d13 = 4;

    /* renamed from: TIMING_FILL_MODE_FIELD_NUMBER */
    public static final int f72521x2689f743 = 2;

    /* renamed from: serialVersionUID */
    private static final long f72522x3a3ed56c = 0;

    /* renamed from: decoderType_ */
    private int f72523xbbddc681;

    /* renamed from: filePath_ */
    private volatile java.lang.Object f72524xb0af48be;

    /* renamed from: layerIndex_ */
    private int f72525x81d3b27e;

    /* renamed from: layerSpatialDesc_ */
    private kg.p0 f72526xfcb813b;

    /* renamed from: memoizedIsInitialized */
    private byte f72527xf54bb1a0;

    /* renamed from: timingFillMode_ */
    private int f72528x88caf22f;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.k1 f72516xb3e828f3 = new kg.k1();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72520x8c3e301f = new kg.i1();

    /* renamed from: getDefaultInstance */
    public static kg.k1 m142869x7c90cfc0() {
        return f72516xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m142870xc1a58b65() {
        return kg.q2.C;
    }

    /* renamed from: newBuilder */
    public static kg.j1 m142871x3136c9db() {
        return f72516xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.k1 m142873x4a829d50(java.io.InputStream inputStream) {
        return (kg.k1) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72520x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.k1 m142881x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.k1) f72520x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m142885xc4ab3c1f() {
        return f72520x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.k1)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.k1 k1Var = (kg.k1) obj;
        if (this.f72523xbbddc681 == k1Var.f72523xbbddc681 && this.f72528x88caf22f == k1Var.f72528x88caf22f && m142888x5000ed37().equals(k1Var.m142888x5000ed37()) && m142896x5524565e() == k1Var.m142896x5524565e()) {
            return (!m142896x5524565e() || m142891xea6b5b1a().mo20583xb2c87fbf(k1Var.m142891xea6b5b1a())) && m142890xea2ec5f7() == k1Var.m142890xea2ec5f7() && this.f7874x4f0c37a3.m20941xb2c87fbf(k1Var.f7874x4f0c37a3);
        }
        return false;
    }

    /* renamed from: getDecoderType */
    public kg.h1 m142886x21f63468() {
        kg.h1 h1Var;
        int i17 = this.f72523xbbddc681;
        if (i17 == 0) {
            h1Var = kg.h1.StickerDecoderTypePlatform;
        } else if (i17 != 1) {
            kg.h1 h1Var2 = kg.h1.StickerDecoderTypePlatform;
            h1Var = null;
        } else {
            h1Var = kg.h1.StickerDecoderTypeWxAM;
        }
        return h1Var == null ? kg.h1.UNRECOGNIZED : h1Var;
    }

    /* renamed from: getDecoderTypeValue */
    public int m142887x1a2bede9() {
        return this.f72523xbbddc681;
    }

    /* renamed from: getFilePath */
    public java.lang.String m142888x5000ed37() {
        java.lang.Object obj = this.f72524xb0af48be;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
        this.f72524xb0af48be = r17;
        return r17;
    }

    /* renamed from: getFilePathBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y m142889x7e408d74() {
        java.lang.Object obj = this.f72524xb0af48be;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f72524xb0af48be = h17;
        return h17;
    }

    /* renamed from: getLayerIndex */
    public int m142890xea2ec5f7() {
        return this.f72525x81d3b27e;
    }

    /* renamed from: getLayerSpatialDesc */
    public kg.p0 m142891xea6b5b1a() {
        kg.p0 p0Var = this.f72526xfcb813b;
        return p0Var == null ? kg.p0.m143098x7c90cfc0() : p0Var;
    }

    /* renamed from: getLayerSpatialDescOrBuilder */
    public kg.q0 m142892xfd01463e() {
        return m142891xea6b5b1a();
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m142893x7ea0ace() {
        return f72520x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int f17 = this.f72523xbbddc681 != kg.h1.StickerDecoderTypePlatform.mo20656x276ffe3f() ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.f(1, this.f72523xbbddc681) : 0;
        if (this.f72528x88caf22f != kg.d2.TimingFillModeNone.mo20656x276ffe3f()) {
            f17 += com.p176xb6135e39.p283xc50a8b8b.k0.f(2, this.f72528x88caf22f);
        }
        if (!m142889x7e408d74().m20957x7aab3243()) {
            f17 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(3, this.f72524xb0af48be);
        }
        if (this.f72526xfcb813b != null) {
            f17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, m142891xea6b5b1a());
        }
        int i18 = this.f72525x81d3b27e;
        if (i18 != 0) {
            f17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(5, i18);
        }
        int mo20593x9d9c349b = f17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    /* renamed from: getTimingFillMode */
    public kg.d2 m142894xeabf6126() {
        kg.d2 d2Var;
        int i17 = this.f72528x88caf22f;
        if (i17 == 0) {
            d2Var = kg.d2.TimingFillModeNone;
        } else if (i17 == 1) {
            d2Var = kg.d2.TimingFillModeLooping;
        } else if (i17 != 2) {
            kg.d2 d2Var2 = kg.d2.TimingFillModeNone;
            d2Var = null;
        } else {
            d2Var = kg.d2.TimingFillModeLastFrame;
        }
        return d2Var == null ? kg.d2.UNRECOGNIZED : d2Var;
    }

    /* renamed from: getTimingFillModeValue */
    public int m142895xc07707eb() {
        return this.f72528x88caf22f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    /* renamed from: hasLayerSpatialDesc */
    public boolean m142896x5524565e() {
        return this.f72526xfcb813b != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m142870xc1a58b65().hashCode()) * 37) + 1) * 53) + this.f72523xbbddc681) * 37) + 2) * 53) + this.f72528x88caf22f) * 37) + 3) * 53) + m142888x5000ed37().hashCode();
        if (m142896x5524565e()) {
            hashCode = (((hashCode * 37) + 4) * 53) + m142891xea6b5b1a().mo20587x8cdac1b();
        }
        int m142890xea2ec5f7 = (((((hashCode * 37) + 5) * 53) + m142890xea2ec5f7()) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m142890xea2ec5f7;
        return m142890xea2ec5f7;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.D;
        j6Var.c(kg.k1.class, kg.j1.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72527xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72527xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.k1();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f72523xbbddc681 != kg.h1.StickerDecoderTypePlatform.mo20656x276ffe3f()) {
            k0Var.H(1, this.f72523xbbddc681);
        }
        if (this.f72528x88caf22f != kg.d2.TimingFillModeNone.mo20656x276ffe3f()) {
            k0Var.H(2, this.f72528x88caf22f);
        }
        if (!m142889x7e408d74().m20957x7aab3243()) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 3, this.f72524xb0af48be);
        }
        if (this.f72526xfcb813b != null) {
            k0Var.J(4, m142891xea6b5b1a());
        }
        int i17 = this.f72525x81d3b27e;
        if (i17 != 0) {
            k0Var.H(5, i17);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.j1 m142872x3136c9db(kg.k1 k1Var) {
        kg.j1 mo20599xaaa148a0 = f72516xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(k1Var);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.k1 m142882x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.k1) f72520x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private k1(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72527xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.k1 m142874x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.k1) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72520x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.k1 m142877x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.k1) f72520x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.k1 mo20559x786693c3() {
        return f72516xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.j1 mo20599xaaa148a0() {
        if (this == f72516xb3e828f3) {
            return new kg.j1(null);
        }
        kg.j1 j1Var = new kg.j1(null);
        j1Var.e(this);
        return j1Var;
    }

    /* renamed from: parseFrom */
    public static kg.k1 m142878x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.k1) f72520x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.j1 mo20596xab31548() {
        return m142871x3136c9db();
    }

    private k1() {
        this.f72527xf54bb1a0 = (byte) -1;
        this.f72523xbbddc681 = 0;
        this.f72528x88caf22f = 0;
        this.f72524xb0af48be = "";
    }

    /* renamed from: parseFrom */
    public static kg.k1 m142883x92b714fd(byte[] bArr) {
        return (kg.k1) f72520x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.j1 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.j1(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.k1 m142884x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.k1) f72520x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.k1 m142879x92b714fd(java.io.InputStream inputStream) {
        return (kg.k1) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72520x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.k1 m142880x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.k1) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72520x8c3e301f, inputStream, t4Var);
    }

    private k1(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 8) {
                            this.f72523xbbddc681 = d0Var.o();
                        } else if (F == 16) {
                            this.f72528x88caf22f = d0Var.o();
                        } else if (F == 26) {
                            this.f72524xb0af48be = d0Var.E();
                        } else if (F == 34) {
                            kg.p0 p0Var = this.f72526xfcb813b;
                            kg.o0 mo20599xaaa148a0 = p0Var != null ? p0Var.mo20599xaaa148a0() : null;
                            kg.p0 p0Var2 = (kg.p0) d0Var.v(kg.p0.m143114xc4ab3c1f(), t4Var);
                            this.f72526xfcb813b = p0Var2;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.e(p0Var2);
                                this.f72526xfcb813b = mo20599xaaa148a0.mo20557x85702333();
                            }
                        } else if (F != 40) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f72525x81d3b27e = d0Var.t();
                        }
                    }
                    z17 = true;
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                    e17.f127272d = this;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = this;
                    throw y6Var;
                }
            } finally {
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }

    /* renamed from: parseFrom */
    public static kg.k1 m142875x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.k1) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72520x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.k1 m142876x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.k1) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72520x8c3e301f, d0Var, t4Var);
    }
}
