package kg;

/* loaded from: classes16.dex */
public final class f1 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.g1 {

    /* renamed from: ORIGIN_FIELD_NUMBER */
    public static final int f72482x2109eec7 = 1;

    /* renamed from: SIZE_FIELD_NUMBER */
    public static final int f72484xa347b5cc = 2;

    /* renamed from: serialVersionUID */
    private static final long f72485x3a3ed56c = 0;

    /* renamed from: memoizedIsInitialized */
    private byte f72486xf54bb1a0;

    /* renamed from: origin_ */
    private kg.g2 f72487xb85435f9;

    /* renamed from: size_ */
    private kg.g2 f72488x686207e;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.f1 f72481xb3e828f3 = new kg.f1();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72483x8c3e301f = new kg.d1();

    /* renamed from: getDefaultInstance */
    public static kg.f1 m142733x7c90cfc0() {
        return f72481xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m142734xc1a58b65() {
        return kg.q2.f389136e;
    }

    /* renamed from: newBuilder */
    public static kg.e1 m142735x3136c9db() {
        return f72481xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.f1 m142737x4a829d50(java.io.InputStream inputStream) {
        return (kg.f1) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72483x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.f1 m142745x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.f1) f72483x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m142749xc4ab3c1f() {
        return f72483x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.f1)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.f1 f1Var = (kg.f1) obj;
        if (m142755xe8d25260() != f1Var.m142755xe8d25260()) {
            return false;
        }
        if ((!m142755xe8d25260() || m142750x28f8d21c().mo20583xb2c87fbf(f1Var.m142750x28f8d21c())) && m142756x298a09bb() == f1Var.m142756x298a09bb()) {
            return (!m142756x298a09bb() || m142753xfb854877().mo20583xb2c87fbf(f1Var.m142753xfb854877())) && this.f7874x4f0c37a3.m20941xb2c87fbf(f1Var.f7874x4f0c37a3);
        }
        return false;
    }

    /* renamed from: getOrigin */
    public kg.g2 m142750x28f8d21c() {
        kg.g2 g2Var = this.f72487xb85435f9;
        return g2Var == null ? kg.g2.m142765x7c90cfc0() : g2Var;
    }

    /* renamed from: getOriginOrBuilder */
    public kg.h2 m142751xd93c917c() {
        return m142750x28f8d21c();
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m142752x7ea0ace() {
        return f72483x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.f72487xb85435f9 != null ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.n(1, m142750x28f8d21c()) : 0;
        if (this.f72488x686207e != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, m142753xfb854877());
        }
        int mo20593x9d9c349b = n17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    /* renamed from: getSize */
    public kg.g2 m142753xfb854877() {
        kg.g2 g2Var = this.f72488x686207e;
        return g2Var == null ? kg.g2.m142765x7c90cfc0() : g2Var;
    }

    /* renamed from: getSizeOrBuilder */
    public kg.h2 m142754xd4701181() {
        return m142753xfb854877();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    /* renamed from: hasOrigin */
    public boolean m142755xe8d25260() {
        return this.f72487xb85435f9 != null;
    }

    /* renamed from: hasSize */
    public boolean m142756x298a09bb() {
        return this.f72488x686207e != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m142734xc1a58b65().hashCode();
        if (m142755xe8d25260()) {
            hashCode = (((hashCode * 37) + 1) * 53) + m142750x28f8d21c().mo20587x8cdac1b();
        }
        if (m142756x298a09bb()) {
            hashCode = (((hashCode * 37) + 2) * 53) + m142753xfb854877().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.f389137f;
        j6Var.c(kg.f1.class, kg.e1.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72486xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72486xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.f1();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f72487xb85435f9 != null) {
            k0Var.J(1, m142750x28f8d21c());
        }
        if (this.f72488x686207e != null) {
            k0Var.J(2, m142753xfb854877());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.e1 m142736x3136c9db(kg.f1 f1Var) {
        kg.e1 mo20599xaaa148a0 = f72481xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(f1Var);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.f1 m142746x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.f1) f72483x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private f1(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72486xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.f1 m142738x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.f1) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72483x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.f1 m142741x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.f1) f72483x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.f1 mo20559x786693c3() {
        return f72481xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.e1 mo20599xaaa148a0() {
        if (this == f72481xb3e828f3) {
            return new kg.e1(null);
        }
        kg.e1 e1Var = new kg.e1(null);
        e1Var.e(this);
        return e1Var;
    }

    /* renamed from: parseFrom */
    public static kg.f1 m142742x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.f1) f72483x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.e1 mo20596xab31548() {
        return m142735x3136c9db();
    }

    private f1() {
        this.f72486xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseFrom */
    public static kg.f1 m142747x92b714fd(byte[] bArr) {
        return (kg.f1) f72483x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.e1 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.e1(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.f1 m142748x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.f1) f72483x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    private f1(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        this();
        kg.f2 mo20599xaaa148a0;
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            kg.g2 g2Var = this.f72487xb85435f9;
                            mo20599xaaa148a0 = g2Var != null ? g2Var.mo20599xaaa148a0() : null;
                            kg.g2 g2Var2 = (kg.g2) d0Var.v(kg.g2.m142781xc4ab3c1f(), t4Var);
                            this.f72487xb85435f9 = g2Var2;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.e(g2Var2);
                                this.f72487xb85435f9 = mo20599xaaa148a0.mo20557x85702333();
                            }
                        } else if (F != 18) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            kg.g2 g2Var3 = this.f72488x686207e;
                            mo20599xaaa148a0 = g2Var3 != null ? g2Var3.mo20599xaaa148a0() : null;
                            kg.g2 g2Var4 = (kg.g2) d0Var.v(kg.g2.m142781xc4ab3c1f(), t4Var);
                            this.f72488x686207e = g2Var4;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.e(g2Var4);
                                this.f72488x686207e = mo20599xaaa148a0.mo20557x85702333();
                            }
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
    public static kg.f1 m142743x92b714fd(java.io.InputStream inputStream) {
        return (kg.f1) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72483x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.f1 m142744x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.f1) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72483x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.f1 m142739x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.f1) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72483x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.f1 m142740x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.f1) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72483x8c3e301f, d0Var, t4Var);
    }
}
