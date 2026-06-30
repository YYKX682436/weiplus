package kg;

/* loaded from: classes16.dex */
public final class x0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.y0 {

    /* renamed from: CONTENT_FIELD_NUMBER */
    public static final int f72666x6ec21c74 = 2;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.x0 f72667xb3e828f3 = new kg.x0();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72668x8c3e301f = new kg.v0();

    /* renamed from: TIME_RANGE_FIELD_NUMBER */
    public static final int f72669xe9e460e2 = 1;

    /* renamed from: serialVersionUID */
    private static final long f72670x3a3ed56c = 0;

    /* renamed from: content_ */
    private volatile java.lang.Object f72671xde2f5b06;

    /* renamed from: memoizedIsInitialized */
    private byte f72672xf54bb1a0;

    /* renamed from: timeRange_ */
    private kg.a2 f72673x2c861fef;

    /* renamed from: getDefaultInstance */
    public static kg.x0 m143345x7c90cfc0() {
        return f72667xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m143346xc1a58b65() {
        return kg.q2.A;
    }

    /* renamed from: newBuilder */
    public static kg.w0 m143347x3136c9db() {
        return f72667xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.x0 m143349x4a829d50(java.io.InputStream inputStream) {
        return (kg.x0) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72668x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.x0 m143357x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.x0) f72668x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m143361xc4ab3c1f() {
        return f72668x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.x0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.x0 x0Var = (kg.x0) obj;
        if (m143367xc0b288f6() != x0Var.m143367xc0b288f6()) {
            return false;
        }
        return (!m143367xc0b288f6() || m143365xdd1fba().mo20583xb2c87fbf(x0Var.m143365xdd1fba())) && m143362x76847043().equals(x0Var.m143362x76847043()) && this.f7874x4f0c37a3.m20941xb2c87fbf(x0Var.f7874x4f0c37a3);
    }

    /* renamed from: getContent */
    public java.lang.String m143362x76847043() {
        java.lang.Object obj = this.f72671xde2f5b06;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
        this.f72671xde2f5b06 = r17;
        return r17;
    }

    /* renamed from: getContentBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y m143363x90f111e8() {
        java.lang.Object obj = this.f72671xde2f5b06;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f72671xde2f5b06 = h17;
        return h17;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m143364x7ea0ace() {
        return f72668x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.f72673x2c861fef != null ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.n(1, m143365xdd1fba()) : 0;
        if (!m143363x90f111e8().m20957x7aab3243()) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(2, this.f72671xde2f5b06);
        }
        int mo20593x9d9c349b = n17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    /* renamed from: getTimeRange */
    public kg.a2 m143365xdd1fba() {
        kg.a2 a2Var = this.f72673x2c861fef;
        return a2Var == null ? kg.a2.m142579x7c90cfc0() : a2Var;
    }

    /* renamed from: getTimeRangeOrBuilder */
    public kg.b2 m143366x7e32b59e() {
        return m143365xdd1fba();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    /* renamed from: hasTimeRange */
    public boolean m143367xc0b288f6() {
        return this.f72673x2c861fef != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m143346xc1a58b65().hashCode();
        if (m143367xc0b288f6()) {
            hashCode = (((hashCode * 37) + 1) * 53) + m143365xdd1fba().mo20587x8cdac1b();
        }
        int hashCode2 = (((((hashCode * 37) + 2) * 53) + m143362x76847043().hashCode()) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = hashCode2;
        return hashCode2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.B;
        j6Var.c(kg.x0.class, kg.w0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72672xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72672xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.x0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f72673x2c861fef != null) {
            k0Var.J(1, m143365xdd1fba());
        }
        if (!m143363x90f111e8().m20957x7aab3243()) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 2, this.f72671xde2f5b06);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.w0 m143348x3136c9db(kg.x0 x0Var) {
        kg.w0 mo20599xaaa148a0 = f72667xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(x0Var);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.x0 m143358x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.x0) f72668x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private x0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72672xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.x0 m143350x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.x0) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72668x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.x0 m143353x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.x0) f72668x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.x0 mo20559x786693c3() {
        return f72667xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.w0 mo20599xaaa148a0() {
        if (this == f72667xb3e828f3) {
            return new kg.w0(null);
        }
        kg.w0 w0Var = new kg.w0(null);
        w0Var.e(this);
        return w0Var;
    }

    /* renamed from: parseFrom */
    public static kg.x0 m143354x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.x0) f72668x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.w0 mo20596xab31548() {
        return m143347x3136c9db();
    }

    private x0() {
        this.f72672xf54bb1a0 = (byte) -1;
        this.f72671xde2f5b06 = "";
    }

    /* renamed from: parseFrom */
    public static kg.x0 m143359x92b714fd(byte[] bArr) {
        return (kg.x0) f72668x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.w0 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.w0(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.x0 m143360x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.x0) f72668x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.x0 m143355x92b714fd(java.io.InputStream inputStream) {
        return (kg.x0) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72668x8c3e301f, inputStream);
    }

    private x0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            kg.a2 a2Var = this.f72673x2c861fef;
                            kg.z1 mo20599xaaa148a0 = a2Var != null ? a2Var.mo20599xaaa148a0() : null;
                            kg.a2 a2Var2 = (kg.a2) d0Var.v(kg.a2.m142595xc4ab3c1f(), t4Var);
                            this.f72673x2c861fef = a2Var2;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.e(a2Var2);
                                this.f72673x2c861fef = mo20599xaaa148a0.mo20557x85702333();
                            }
                        } else if (F != 18) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f72671xde2f5b06 = d0Var.E();
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
    public static kg.x0 m143356x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.x0) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72668x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.x0 m143351x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.x0) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72668x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.x0 m143352x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.x0) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72668x8c3e301f, d0Var, t4Var);
    }
}
