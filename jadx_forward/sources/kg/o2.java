package kg;

/* loaded from: classes16.dex */
public final class o2 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.p2 {

    /* renamed from: ASSET_FIELD_NUMBER */
    public static final int f72565x3903e35d = 1;

    /* renamed from: CONTENT_CROP_RECT_FIELD_NUMBER */
    public static final int f72566x478780 = 4;

    /* renamed from: CONTENT_SPATIAL_DESC_FIELD_NUMBER */
    public static final int f72567xb7c44e3b = 3;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.o2 f72568xb3e828f3 = new kg.o2();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72569x8c3e301f = new kg.m2();

    /* renamed from: TIME_RANGE_FIELD_NUMBER */
    public static final int f72570xe9e460e2 = 2;

    /* renamed from: serialVersionUID */
    private static final long f72571x3a3ed56c = 0;

    /* renamed from: asset_ */
    private kg.f f72572xac10736f;

    /* renamed from: contentCropRect_ */
    private kg.f1 f72573xcaae35d2;

    /* renamed from: contentSpatialDesc_ */
    private kg.d0 f72574xfbc56463;

    /* renamed from: memoizedIsInitialized */
    private byte f72575xf54bb1a0;

    /* renamed from: timeRange_ */
    private kg.a2 f72576x2c861fef;

    public /* synthetic */ o2(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, kg.b bVar) {
        this(d0Var, t4Var);
    }

    /* renamed from: access$12300 */
    public static /* synthetic */ boolean m143019x23f39072() {
        return com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
    }

    /* renamed from: access$12502 */
    public static /* synthetic */ kg.f m143020x23f397f6(kg.o2 o2Var, kg.f fVar) {
        o2Var.f72572xac10736f = fVar;
        return fVar;
    }

    /* renamed from: access$12602 */
    public static /* synthetic */ kg.a2 m143021x23f39bb7(kg.o2 o2Var, kg.a2 a2Var) {
        o2Var.f72576x2c861fef = a2Var;
        return a2Var;
    }

    /* renamed from: access$12702 */
    public static /* synthetic */ kg.d0 m143022x23f39f78(kg.o2 o2Var, kg.d0 d0Var) {
        o2Var.f72574xfbc56463 = d0Var;
        return d0Var;
    }

    /* renamed from: access$12802 */
    public static /* synthetic */ kg.f1 m143023x23f3a339(kg.o2 o2Var, kg.f1 f1Var) {
        o2Var.f72573xcaae35d2 = f1Var;
        return f1Var;
    }

    /* renamed from: access$12900 */
    public static /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.wa m143024x23f3a6f8(kg.o2 o2Var) {
        return o2Var.f7874x4f0c37a3;
    }

    /* renamed from: access$13000 */
    public static /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.e9 m143025x23f3f98e() {
        return f72569x8c3e301f;
    }

    /* renamed from: getDefaultInstance */
    public static kg.o2 m143026x7c90cfc0() {
        return f72568xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m143027xc1a58b65() {
        return kg.q2.f389152u;
    }

    /* renamed from: newBuilder */
    public static kg.n2 m143028x3136c9db() {
        return f72568xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.o2 m143030x4a829d50(java.io.InputStream inputStream) {
        return (kg.o2) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72569x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.o2 m143038x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.o2) f72569x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m143042xc4ab3c1f() {
        return f72569x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.o2)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.o2 o2Var = (kg.o2) obj;
        if (m143052x6bdf876() != o2Var.m143052x6bdf876()) {
            return false;
        }
        if ((m143052x6bdf876() && !m143043x742a913a().mo20583xb2c87fbf(o2Var.m143043x742a913a())) || m143055xc0b288f6() != o2Var.m143055xc0b288f6()) {
            return false;
        }
        if ((m143055xc0b288f6() && !m143050xdd1fba().mo20583xb2c87fbf(o2Var.m143050xdd1fba())) || m143054x2f7fa7b6() != o2Var.m143054x2f7fa7b6()) {
            return false;
        }
        if ((!m143054x2f7fa7b6() || m143047x8f186d72().mo20583xb2c87fbf(o2Var.m143047x8f186d72())) && m143053x93862e33() == o2Var.m143053x93862e33()) {
            return (!m143053x93862e33() || m143045xf32da1f7().mo20583xb2c87fbf(o2Var.m143045xf32da1f7())) && this.f7874x4f0c37a3.m20941xb2c87fbf(o2Var.f7874x4f0c37a3);
        }
        return false;
    }

    /* renamed from: getAsset */
    public kg.f m143043x742a913a() {
        kg.f fVar = this.f72572xac10736f;
        return fVar == null ? kg.f.m142704x7c90cfc0() : fVar;
    }

    /* renamed from: getAssetOrBuilder */
    public kg.g m143044x12cf41e() {
        return m143043x742a913a();
    }

    /* renamed from: getContentCropRect */
    public kg.f1 m143045xf32da1f7() {
        kg.f1 f1Var = this.f72573xcaae35d2;
        return f1Var == null ? kg.f1.m142733x7c90cfc0() : f1Var;
    }

    /* renamed from: getContentCropRectOrBuilder */
    public kg.g1 m143046xa6d46801() {
        return m143045xf32da1f7();
    }

    /* renamed from: getContentSpatialDesc */
    public kg.d0 m143047x8f186d72() {
        kg.d0 d0Var = this.f72574xfbc56463;
        return d0Var == null ? kg.d0.m142664x7c90cfc0() : d0Var;
    }

    /* renamed from: getContentSpatialDescOrBuilder */
    public kg.e0 m143048x6e2756e6() {
        return m143047x8f186d72();
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m143049x7ea0ace() {
        return f72569x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.f72572xac10736f != null ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.n(1, m143043x742a913a()) : 0;
        if (this.f72576x2c861fef != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, m143050xdd1fba());
        }
        if (this.f72574xfbc56463 != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(3, m143047x8f186d72());
        }
        if (this.f72573xcaae35d2 != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, m143045xf32da1f7());
        }
        int mo20593x9d9c349b = n17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    /* renamed from: getTimeRange */
    public kg.a2 m143050xdd1fba() {
        kg.a2 a2Var = this.f72576x2c861fef;
        return a2Var == null ? kg.a2.m142579x7c90cfc0() : a2Var;
    }

    /* renamed from: getTimeRangeOrBuilder */
    public kg.b2 m143051x7e32b59e() {
        return m143050xdd1fba();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    /* renamed from: hasAsset */
    public boolean m143052x6bdf876() {
        return this.f72572xac10736f != null;
    }

    /* renamed from: hasContentCropRect */
    public boolean m143053x93862e33() {
        return this.f72573xcaae35d2 != null;
    }

    /* renamed from: hasContentSpatialDesc */
    public boolean m143054x2f7fa7b6() {
        return this.f72574xfbc56463 != null;
    }

    /* renamed from: hasTimeRange */
    public boolean m143055xc0b288f6() {
        return this.f72576x2c861fef != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m143027xc1a58b65().hashCode();
        if (m143052x6bdf876()) {
            hashCode = (((hashCode * 37) + 1) * 53) + m143043x742a913a().mo20587x8cdac1b();
        }
        if (m143055xc0b288f6()) {
            hashCode = (((hashCode * 37) + 2) * 53) + m143050xdd1fba().mo20587x8cdac1b();
        }
        if (m143054x2f7fa7b6()) {
            hashCode = (((hashCode * 37) + 3) * 53) + m143047x8f186d72().mo20587x8cdac1b();
        }
        if (m143053x93862e33()) {
            hashCode = (((hashCode * 37) + 4) * 53) + m143045xf32da1f7().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.f389153v;
        j6Var.c(kg.o2.class, kg.n2.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72575xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72575xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.o2();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f72572xac10736f != null) {
            k0Var.J(1, m143043x742a913a());
        }
        if (this.f72576x2c861fef != null) {
            k0Var.J(2, m143050xdd1fba());
        }
        if (this.f72574xfbc56463 != null) {
            k0Var.J(3, m143047x8f186d72());
        }
        if (this.f72573xcaae35d2 != null) {
            k0Var.J(4, m143045xf32da1f7());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    public /* synthetic */ o2(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, kg.b bVar) {
        this(q5Var);
    }

    /* renamed from: newBuilder */
    public static kg.n2 m143029x3136c9db(kg.o2 o2Var) {
        kg.n2 mo20599xaaa148a0 = f72568xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(o2Var);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.o2 m143039x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.o2) f72569x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o2(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72575xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.o2 m143031x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.o2) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72569x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.o2 m143034x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.o2) f72569x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.o2 mo20559x786693c3() {
        return f72568xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.n2 mo20599xaaa148a0() {
        if (this == f72568xb3e828f3) {
            return new kg.n2(null);
        }
        kg.n2 n2Var = new kg.n2(null);
        n2Var.e(this);
        return n2Var;
    }

    /* renamed from: parseFrom */
    public static kg.o2 m143035x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.o2) f72569x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.n2 mo20596xab31548() {
        return m143028x3136c9db();
    }

    private o2() {
        this.f72575xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseFrom */
    public static kg.o2 m143040x92b714fd(byte[] bArr) {
        return (kg.o2) f72569x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.n2 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.n2(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.o2 m143041x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.o2) f72569x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o2(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
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
                            if (F == 10) {
                                kg.f fVar = this.f72572xac10736f;
                                kg.d mo20599xaaa148a0 = fVar != null ? fVar.mo20599xaaa148a0() : null;
                                kg.f fVar2 = (kg.f) d0Var.v(kg.f.m142720xc4ab3c1f(), t4Var);
                                this.f72572xac10736f = fVar2;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.e(fVar2);
                                    this.f72572xac10736f = mo20599xaaa148a0.mo20557x85702333();
                                }
                            } else if (F == 18) {
                                kg.a2 a2Var = this.f72576x2c861fef;
                                kg.z1 mo20599xaaa148a02 = a2Var != null ? a2Var.mo20599xaaa148a0() : null;
                                kg.a2 a2Var2 = (kg.a2) d0Var.v(kg.a2.m142595xc4ab3c1f(), t4Var);
                                this.f72576x2c861fef = a2Var2;
                                if (mo20599xaaa148a02 != null) {
                                    mo20599xaaa148a02.e(a2Var2);
                                    this.f72576x2c861fef = mo20599xaaa148a02.mo20557x85702333();
                                }
                            } else if (F == 26) {
                                kg.d0 d0Var2 = this.f72574xfbc56463;
                                kg.c0 mo20599xaaa148a03 = d0Var2 != null ? d0Var2.mo20599xaaa148a0() : null;
                                kg.d0 d0Var3 = (kg.d0) d0Var.v(kg.d0.m142680xc4ab3c1f(), t4Var);
                                this.f72574xfbc56463 = d0Var3;
                                if (mo20599xaaa148a03 != null) {
                                    mo20599xaaa148a03.e(d0Var3);
                                    this.f72574xfbc56463 = mo20599xaaa148a03.mo20557x85702333();
                                }
                            } else if (F != 34) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                kg.f1 f1Var = this.f72573xcaae35d2;
                                kg.e1 mo20599xaaa148a04 = f1Var != null ? f1Var.mo20599xaaa148a0() : null;
                                kg.f1 f1Var2 = (kg.f1) d0Var.v(kg.f1.m142749xc4ab3c1f(), t4Var);
                                this.f72573xcaae35d2 = f1Var2;
                                if (mo20599xaaa148a04 != null) {
                                    mo20599xaaa148a04.e(f1Var2);
                                    this.f72573xcaae35d2 = mo20599xaaa148a04.mo20557x85702333();
                                }
                            }
                        }
                        z17 = true;
                    } catch (java.io.IOException e17) {
                        com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e17);
                        y6Var.f127272d = this;
                        throw y6Var;
                    }
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e18) {
                    e18.f127272d = this;
                    throw e18;
                }
            } finally {
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }

    /* renamed from: parseFrom */
    public static kg.o2 m143036x92b714fd(java.io.InputStream inputStream) {
        return (kg.o2) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72569x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.o2 m143037x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.o2) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72569x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.o2 m143032x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.o2) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72569x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.o2 m143033x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.o2) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72569x8c3e301f, d0Var, t4Var);
    }
}
