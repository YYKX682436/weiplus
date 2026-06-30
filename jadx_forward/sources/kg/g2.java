package kg;

/* loaded from: classes16.dex */
public final class g2 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.h2 {

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.g2 f72489xb3e828f3 = new kg.g2();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72490x8c3e301f = new kg.e2();

    /* renamed from: X_FIELD_NUMBER */
    public static final int f72491x55ef12d5 = 1;

    /* renamed from: Y_FIELD_NUMBER */
    public static final int f72492x37ccdc74 = 2;

    /* renamed from: serialVersionUID */
    private static final long f72493x3a3ed56c = 0;

    /* renamed from: memoizedIsInitialized */
    private byte f72494xf54bb1a0;
    private float x_;
    private float y_;

    /* renamed from: getDefaultInstance */
    public static kg.g2 m142765x7c90cfc0() {
        return f72489xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m142766xc1a58b65() {
        return kg.q2.f389132a;
    }

    /* renamed from: newBuilder */
    public static kg.f2 m142767x3136c9db() {
        return f72489xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.g2 m142769x4a829d50(java.io.InputStream inputStream) {
        return (kg.g2) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72490x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.g2 m142777x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.g2) f72490x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m142781xc4ab3c1f() {
        return f72490x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.g2)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.g2 g2Var = (kg.g2) obj;
        return java.lang.Float.floatToIntBits(m142783x305bc2()) == java.lang.Float.floatToIntBits(g2Var.m142783x305bc2()) && java.lang.Float.floatToIntBits(m142784x305bc3()) == java.lang.Float.floatToIntBits(g2Var.m142784x305bc3()) && this.f7874x4f0c37a3.m20941xb2c87fbf(g2Var.f7874x4f0c37a3);
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m142782x7ea0ace() {
        return f72490x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        float f17 = this.x_;
        int i18 = f17 != 0.0f ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.i(1, f17) : 0;
        float f18 = this.y_;
        if (f18 != 0.0f) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.i(2, f18);
        }
        int mo20593x9d9c349b = i18 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    /* renamed from: getX */
    public float m142783x305bc2() {
        return this.x_;
    }

    /* renamed from: getY */
    public float m142784x305bc3() {
        return this.y_;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m142766xc1a58b65().hashCode()) * 37) + 1) * 53) + java.lang.Float.floatToIntBits(m142783x305bc2())) * 37) + 2) * 53) + java.lang.Float.floatToIntBits(m142784x305bc3())) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = hashCode;
        return hashCode;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.f389133b;
        j6Var.c(kg.g2.class, kg.f2.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72494xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72494xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.g2();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        float f17 = this.x_;
        if (f17 != 0.0f) {
            k0Var.G(1, f17);
        }
        float f18 = this.y_;
        if (f18 != 0.0f) {
            k0Var.G(2, f18);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.f2 m142768x3136c9db(kg.g2 g2Var) {
        kg.f2 mo20599xaaa148a0 = f72489xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(g2Var);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.g2 m142778x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.g2) f72490x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private g2(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72494xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.g2 m142770x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.g2) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72490x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.g2 m142773x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.g2) f72490x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.g2 mo20559x786693c3() {
        return f72489xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.f2 mo20599xaaa148a0() {
        if (this == f72489xb3e828f3) {
            return new kg.f2(null);
        }
        kg.f2 f2Var = new kg.f2(null);
        f2Var.e(this);
        return f2Var;
    }

    /* renamed from: parseFrom */
    public static kg.g2 m142774x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.g2) f72490x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.f2 mo20596xab31548() {
        return m142767x3136c9db();
    }

    private g2() {
        this.f72494xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseFrom */
    public static kg.g2 m142779x92b714fd(byte[] bArr) {
        return (kg.g2) f72490x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.f2 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.f2(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.g2 m142780x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.g2) f72490x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    private g2(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 13) {
                                this.x_ = d0Var.r();
                            } else if (F != 21) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                this.y_ = d0Var.r();
                            }
                        }
                        z17 = true;
                    } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                        e17.f127272d = this;
                        throw e17;
                    }
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
    public static kg.g2 m142775x92b714fd(java.io.InputStream inputStream) {
        return (kg.g2) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72490x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.g2 m142776x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.g2) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72490x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.g2 m142771x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.g2) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72490x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.g2 m142772x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.g2) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72490x8c3e301f, d0Var, t4Var);
    }
}
