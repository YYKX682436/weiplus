package kg;

/* loaded from: classes16.dex */
public final class t extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.u {

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.t f72620xb3e828f3 = new kg.t();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72621x8c3e301f = new kg.r();

    /* renamed from: RGBA_FIELD_NUMBER */
    public static final int f72622x9b70ff79 = 1;

    /* renamed from: serialVersionUID */
    private static final long f72623x3a3ed56c = 0;

    /* renamed from: memoizedIsInitialized */
    private byte f72624xf54bb1a0;

    /* renamed from: rgba_ */
    private kg.k2 f72625x676c5ab;

    /* renamed from: getDefaultInstance */
    public static kg.t m143187x7c90cfc0() {
        return f72620xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m143188xc1a58b65() {
        return kg.q2.f389138g;
    }

    /* renamed from: newBuilder */
    public static kg.s m143189x3136c9db() {
        return f72620xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.t m143191x4a829d50(java.io.InputStream inputStream) {
        return (kg.t) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72621x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.t m143199x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.t) f72621x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m143203xc4ab3c1f() {
        return f72621x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.t)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.t tVar = (kg.t) obj;
        if (m143207x29898aee() != tVar.m143207x29898aee()) {
            return false;
        }
        return (!m143207x29898aee() || m143205xfb84c9aa().mo20583xb2c87fbf(tVar.m143205xfb84c9aa())) && this.f7874x4f0c37a3.m20941xb2c87fbf(tVar.f7874x4f0c37a3);
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m143204x7ea0ace() {
        return f72621x8c3e301f;
    }

    /* renamed from: getRgba */
    public kg.k2 m143205xfb84c9aa() {
        kg.k2 k2Var = this.f72625x676c5ab;
        return k2Var == null ? kg.k2.m142905x7c90cfc0() : k2Var;
    }

    /* renamed from: getRgbaOrBuilder */
    public kg.l2 m143206xff339ae() {
        return m143205xfb84c9aa();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int n17 = (this.f72625x676c5ab != null ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.n(1, m143205xfb84c9aa()) : 0) + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = n17;
        return n17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    /* renamed from: hasRgba */
    public boolean m143207x29898aee() {
        return this.f72625x676c5ab != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m143188xc1a58b65().hashCode();
        if (m143207x29898aee()) {
            hashCode = (((hashCode * 37) + 1) * 53) + m143205xfb84c9aa().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.f389139h;
        j6Var.c(kg.t.class, kg.s.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72624xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72624xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.t();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f72625x676c5ab != null) {
            k0Var.J(1, m143205xfb84c9aa());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.s m143190x3136c9db(kg.t tVar) {
        kg.s mo20599xaaa148a0 = f72620xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(tVar);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.t m143200x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.t) f72621x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private t(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72624xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.t m143192x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.t) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72621x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.t m143195x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.t) f72621x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.t mo20559x786693c3() {
        return f72620xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.s mo20599xaaa148a0() {
        if (this == f72620xb3e828f3) {
            return new kg.s(null);
        }
        kg.s sVar = new kg.s(null);
        sVar.e(this);
        return sVar;
    }

    /* renamed from: parseFrom */
    public static kg.t m143196x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.t) f72621x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.s mo20596xab31548() {
        return m143189x3136c9db();
    }

    private t() {
        this.f72624xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseFrom */
    public static kg.t m143201x92b714fd(byte[] bArr) {
        return (kg.t) f72621x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.s mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.s(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.t m143202x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.t) f72621x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    private t(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
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
                            if (F != 10) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                kg.k2 k2Var = this.f72625x676c5ab;
                                kg.j2 mo20599xaaa148a0 = k2Var != null ? k2Var.mo20599xaaa148a0() : null;
                                kg.k2 k2Var2 = (kg.k2) d0Var.v(kg.k2.m142921xc4ab3c1f(), t4Var);
                                this.f72625x676c5ab = k2Var2;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.f(k2Var2);
                                    this.f72625x676c5ab = mo20599xaaa148a0.mo20557x85702333();
                                }
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
    public static kg.t m143197x92b714fd(java.io.InputStream inputStream) {
        return (kg.t) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72621x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.t m143198x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.t) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72621x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.t m143193x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.t) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72621x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.t m143194x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.t) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72621x8c3e301f, d0Var, t4Var);
    }
}
