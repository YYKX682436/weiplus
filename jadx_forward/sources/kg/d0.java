package kg;

/* loaded from: classes16.dex */
public final class d0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.e0 {

    /* renamed from: FLIP_MODE_FIELD_NUMBER */
    public static final int f72464x1a5e1418 = 3;

    /* renamed from: ROTATION_MODE_FIELD_NUMBER */
    public static final int f72466xbf8d8e9 = 2;

    /* renamed from: SCALE_MODE_FIELD_NUMBER */
    public static final int f72467xeae25795 = 1;

    /* renamed from: serialVersionUID */
    private static final long f72468x3a3ed56c = 0;

    /* renamed from: flipMode_ */
    private int f72469x5c4146af;

    /* renamed from: memoizedIsInitialized */
    private byte f72470xf54bb1a0;

    /* renamed from: rotationMode_ */
    private int f72471xe2bfa3e;

    /* renamed from: scaleMode_ */
    private int f72472x71b23ff2;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.d0 f72463xb3e828f3 = new kg.d0();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72465x8c3e301f = new kg.b0();

    /* renamed from: getDefaultInstance */
    public static kg.d0 m142664x7c90cfc0() {
        return f72463xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m142665xc1a58b65() {
        return kg.q2.f389146o;
    }

    /* renamed from: newBuilder */
    public static kg.c0 m142666x3136c9db() {
        return f72463xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.d0 m142668x4a829d50(java.io.InputStream inputStream) {
        return (kg.d0) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72465x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.d0 m142676x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.d0) f72465x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m142680xc4ab3c1f() {
        return f72465x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.d0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.d0 d0Var = (kg.d0) obj;
        return this.f72472x71b23ff2 == d0Var.f72472x71b23ff2 && this.f72471xe2bfa3e == d0Var.f72471xe2bfa3e && this.f72469x5c4146af == d0Var.f72469x5c4146af && this.f7874x4f0c37a3.m20941xb2c87fbf(d0Var.f7874x4f0c37a3);
    }

    /* renamed from: getFlipMode */
    public kg.y m142681xea2eed26() {
        kg.y yVar;
        int i17 = this.f72469x5c4146af;
        if (i17 == 0) {
            yVar = kg.y.ContentFlipModeNone;
        } else if (i17 == 1) {
            yVar = kg.y.ContentFlipModeHorizontal;
        } else if (i17 == 2) {
            yVar = kg.y.ContentFlipModeVertical;
        } else if (i17 != 3) {
            kg.y yVar2 = kg.y.ContentFlipModeNone;
            yVar = null;
        } else {
            yVar = kg.y.ContentFlipModeHorizontalAndVertical;
        }
        return yVar == null ? kg.y.UNRECOGNIZED : yVar;
    }

    /* renamed from: getFlipModeValue */
    public int m142682xf4defbeb() {
        return this.f72469x5c4146af;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m142683x7ea0ace() {
        return f72465x8c3e301f;
    }

    /* renamed from: getRotationMode */
    public kg.z m142684xc48060b7() {
        kg.z zVar;
        int i17 = this.f72471xe2bfa3e;
        if (i17 == 0) {
            zVar = kg.z.ContentRotationModeNone;
        } else if (i17 == 1) {
            zVar = kg.z.ContentRotationModeCCW90;
        } else if (i17 == 2) {
            zVar = kg.z.ContentRotationMode180;
        } else if (i17 != 3) {
            kg.z zVar2 = kg.z.ContentRotationModeNone;
            zVar = null;
        } else {
            zVar = kg.z.ContentRotationModeCW90;
        }
        return zVar == null ? kg.z.UNRECOGNIZED : zVar;
    }

    /* renamed from: getRotationModeValue */
    public int m142685x19ec1afa() {
        return this.f72471xe2bfa3e;
    }

    /* renamed from: getScaleMode */
    public kg.a0 m142686x8f7b7357() {
        kg.a0 a0Var;
        int i17 = this.f72472x71b23ff2;
        if (i17 == 0) {
            a0Var = kg.a0.ContentScaleModeCenter;
        } else if (i17 == 1) {
            a0Var = kg.a0.ContentScaleModeFill;
        } else if (i17 == 2) {
            a0Var = kg.a0.ContentScaleModeAspectFit;
        } else if (i17 != 3) {
            kg.a0 a0Var2 = kg.a0.ContentScaleModeCenter;
            a0Var = null;
        } else {
            a0Var = kg.a0.ContentScaleModeAspectFill;
        }
        return a0Var == null ? kg.a0.UNRECOGNIZED : a0Var;
    }

    /* renamed from: getScaleModeValue */
    public int m142687xbc13ac5a() {
        return this.f72472x71b23ff2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int f17 = this.f72472x71b23ff2 != kg.a0.ContentScaleModeCenter.mo20656x276ffe3f() ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.f(1, this.f72472x71b23ff2) : 0;
        if (this.f72471xe2bfa3e != kg.z.ContentRotationModeNone.mo20656x276ffe3f()) {
            f17 += com.p176xb6135e39.p283xc50a8b8b.k0.f(2, this.f72471xe2bfa3e);
        }
        if (this.f72469x5c4146af != kg.y.ContentFlipModeNone.mo20656x276ffe3f()) {
            f17 += com.p176xb6135e39.p283xc50a8b8b.k0.f(3, this.f72469x5c4146af);
        }
        int mo20593x9d9c349b = f17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m142665xc1a58b65().hashCode()) * 37) + 1) * 53) + this.f72472x71b23ff2) * 37) + 2) * 53) + this.f72471xe2bfa3e) * 37) + 3) * 53) + this.f72469x5c4146af) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = hashCode;
        return hashCode;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.f389147p;
        j6Var.c(kg.d0.class, kg.c0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72470xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72470xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.d0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f72472x71b23ff2 != kg.a0.ContentScaleModeCenter.mo20656x276ffe3f()) {
            k0Var.H(1, this.f72472x71b23ff2);
        }
        if (this.f72471xe2bfa3e != kg.z.ContentRotationModeNone.mo20656x276ffe3f()) {
            k0Var.H(2, this.f72471xe2bfa3e);
        }
        if (this.f72469x5c4146af != kg.y.ContentFlipModeNone.mo20656x276ffe3f()) {
            k0Var.H(3, this.f72469x5c4146af);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.c0 m142667x3136c9db(kg.d0 d0Var) {
        kg.c0 mo20599xaaa148a0 = f72463xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(d0Var);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.d0 m142677x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.d0) f72465x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private d0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72470xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.d0 m142669x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.d0) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72465x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.d0 m142672x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.d0) f72465x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.d0 mo20559x786693c3() {
        return f72463xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.c0 mo20599xaaa148a0() {
        if (this == f72463xb3e828f3) {
            return new kg.c0(null);
        }
        kg.c0 c0Var = new kg.c0(null);
        c0Var.e(this);
        return c0Var;
    }

    /* renamed from: parseFrom */
    public static kg.d0 m142673x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.d0) f72465x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.c0 mo20596xab31548() {
        return m142666x3136c9db();
    }

    private d0() {
        this.f72470xf54bb1a0 = (byte) -1;
        this.f72472x71b23ff2 = 0;
        this.f72471xe2bfa3e = 0;
        this.f72469x5c4146af = 0;
    }

    /* renamed from: parseFrom */
    public static kg.d0 m142678x92b714fd(byte[] bArr) {
        return (kg.d0) f72465x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.c0 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.c0(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.d0 m142679x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.d0) f72465x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.d0 m142674x92b714fd(java.io.InputStream inputStream) {
        return (kg.d0) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72465x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.d0 m142675x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.d0) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72465x8c3e301f, inputStream, t4Var);
    }

    private d0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
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
                            this.f72472x71b23ff2 = d0Var.o();
                        } else if (F == 16) {
                            this.f72471xe2bfa3e = d0Var.o();
                        } else if (F != 24) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f72469x5c4146af = d0Var.o();
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
    public static kg.d0 m142670x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.d0) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72465x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.d0 m142671x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.d0) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72465x8c3e301f, d0Var, t4Var);
    }
}
