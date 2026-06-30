package kg;

/* loaded from: classes16.dex */
public final class f extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.g {

    /* renamed from: FILE_PATH_FIELD_NUMBER */
    public static final int f72474xb479fc25 = 2;

    /* renamed from: PH_LOCAL_IDENTIFIER_FIELD_NUMBER */
    public static final int f72476x89c9b929 = 3;

    /* renamed from: serialVersionUID */
    private static final long f72477x3a3ed56c = 0;

    /* renamed from: identifierCase_ */
    private int f72478x7b43d006;

    /* renamed from: identifier_ */
    private java.lang.Object f72479x518ce8d6;

    /* renamed from: memoizedIsInitialized */
    private byte f72480xf54bb1a0;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.f f72473xb3e828f3 = new kg.f();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72475x8c3e301f = new kg.c();

    /* renamed from: getDefaultInstance */
    public static kg.f m142704x7c90cfc0() {
        return f72473xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m142705xc1a58b65() {
        return kg.q2.f389144m;
    }

    /* renamed from: newBuilder */
    public static kg.d m142706x3136c9db() {
        return f72473xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.f m142708x4a829d50(java.io.InputStream inputStream) {
        return (kg.f) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72475x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.f m142716x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.f) f72475x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m142720xc4ab3c1f() {
        return f72475x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.f)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.f fVar = (kg.f) obj;
        if (!m142723xb57ec6f().equals(fVar.m142723xb57ec6f())) {
            return false;
        }
        int i17 = this.f72478x7b43d006;
        if (i17 != 2) {
            if (i17 == 3 && !m142725xeae6e0a6().equals(fVar.m142725xeae6e0a6())) {
                return false;
            }
        } else if (!m142721x5000ed37().equals(fVar.m142721x5000ed37())) {
            return false;
        }
        return this.f7874x4f0c37a3.m20941xb2c87fbf(fVar.f7874x4f0c37a3);
    }

    /* renamed from: getFilePath */
    public java.lang.String m142721x5000ed37() {
        java.lang.String str = this.f72478x7b43d006 == 2 ? this.f72479x518ce8d6 : "";
        if (str instanceof java.lang.String) {
            return (java.lang.String) str;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) str).r();
        if (this.f72478x7b43d006 == 2) {
            this.f72479x518ce8d6 = r17;
        }
        return r17;
    }

    /* renamed from: getFilePathBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y m142722x7e408d74() {
        java.lang.String str = this.f72478x7b43d006 == 2 ? this.f72479x518ce8d6 : "";
        if (!(str instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) str;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) str);
        if (this.f72478x7b43d006 == 2) {
            this.f72479x518ce8d6 = h17;
        }
        return h17;
    }

    /* renamed from: getIdentifierCase */
    public kg.e m142723xb57ec6f() {
        int i17 = this.f72478x7b43d006;
        if (i17 == 0) {
            return kg.e.IDENTIFIER_NOT_SET;
        }
        if (i17 == 2) {
            return kg.e.FILE_PATH;
        }
        if (i17 != 3) {
            return null;
        }
        return kg.e.PH_LOCAL_IDENTIFIER;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m142724x7ea0ace() {
        return f72475x8c3e301f;
    }

    /* renamed from: getPhLocalIdentifier */
    public java.lang.String m142725xeae6e0a6() {
        java.lang.String str = this.f72478x7b43d006 == 3 ? this.f72479x518ce8d6 : "";
        if (str instanceof java.lang.String) {
            return (java.lang.String) str;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) str).r();
        if (this.f72478x7b43d006 == 3) {
            this.f72479x518ce8d6 = r17;
        }
        return r17;
    }

    /* renamed from: getPhLocalIdentifierBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y m142726x51846765() {
        java.lang.String str = this.f72478x7b43d006 == 3 ? this.f72479x518ce8d6 : "";
        if (!(str instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) str;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) str);
        if (this.f72478x7b43d006 == 3) {
            this.f72479x518ce8d6 = h17;
        }
        return h17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int m20743x690e0f49 = this.f72478x7b43d006 == 2 ? 0 + com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(2, this.f72479x518ce8d6) : 0;
        if (this.f72478x7b43d006 == 3) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(3, this.f72479x518ce8d6);
        }
        int mo20593x9d9c349b = m20743x690e0f49 + this.f7874x4f0c37a3.mo20593x9d9c349b();
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
        int i17;
        int hashCode;
        int i18 = this.f7868x8a222005;
        if (i18 != 0) {
            return i18;
        }
        int hashCode2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m142705xc1a58b65().hashCode();
        int i19 = this.f72478x7b43d006;
        if (i19 != 2) {
            if (i19 == 3) {
                i17 = ((hashCode2 * 37) + 3) * 53;
                hashCode = m142725xeae6e0a6().hashCode();
            }
            int m20942x8cdac1b = (hashCode2 * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
            this.f7868x8a222005 = m20942x8cdac1b;
            return m20942x8cdac1b;
        }
        i17 = ((hashCode2 * 37) + 2) * 53;
        hashCode = m142721x5000ed37().hashCode();
        hashCode2 = i17 + hashCode;
        int m20942x8cdac1b2 = (hashCode2 * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b2;
        return m20942x8cdac1b2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.f389145n;
        j6Var.c(kg.f.class, kg.d.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72480xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72480xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.f();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f72478x7b43d006 == 2) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 2, this.f72479x518ce8d6);
        }
        if (this.f72478x7b43d006 == 3) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 3, this.f72479x518ce8d6);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.d m142707x3136c9db(kg.f fVar) {
        kg.d mo20599xaaa148a0 = f72473xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(fVar);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.f m142717x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.f) f72475x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private f(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72478x7b43d006 = 0;
        this.f72480xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.f m142709x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.f) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72475x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.f m142712x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.f) f72475x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.f mo20559x786693c3() {
        return f72473xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.d mo20599xaaa148a0() {
        if (this == f72473xb3e828f3) {
            return new kg.d(null);
        }
        kg.d dVar = new kg.d(null);
        dVar.e(this);
        return dVar;
    }

    /* renamed from: parseFrom */
    public static kg.f m142713x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.f) f72475x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.d mo20596xab31548() {
        return m142706x3136c9db();
    }

    /* renamed from: parseFrom */
    public static kg.f m142718x92b714fd(byte[] bArr) {
        return (kg.f) f72475x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.d mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.d(r5Var, null);
    }

    private f() {
        this.f72478x7b43d006 = 0;
        this.f72480xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseFrom */
    public static kg.f m142719x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.f) f72475x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.f m142714x92b714fd(java.io.InputStream inputStream) {
        return (kg.f) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72475x8c3e301f, inputStream);
    }

    private f(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 18) {
                            java.lang.String E = d0Var.E();
                            this.f72478x7b43d006 = 2;
                            this.f72479x518ce8d6 = E;
                        } else if (F != 26) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            java.lang.String E2 = d0Var.E();
                            this.f72478x7b43d006 = 3;
                            this.f72479x518ce8d6 = E2;
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
    public static kg.f m142715x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.f) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72475x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.f m142710x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.f) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72475x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.f m142711x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.f) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72475x8c3e301f, d0Var, t4Var);
    }
}
