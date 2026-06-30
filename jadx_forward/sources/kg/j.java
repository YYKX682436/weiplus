package kg;

/* loaded from: classes16.dex */
public final class j extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.k {

    /* renamed from: ASSET_FIELD_NUMBER */
    public static final int f72503x3903e35d = 1;

    /* renamed from: LOOPING_FIELD_NUMBER */
    public static final int f72505x23614a4f = 4;

    /* renamed from: TIME_RANGE_FIELD_NUMBER */
    public static final int f72507xe9e460e2 = 2;

    /* renamed from: VOLUME_FIELD_NUMBER */
    public static final int f72508x31964353 = 3;

    /* renamed from: serialVersionUID */
    private static final long f72509x3a3ed56c = 0;

    /* renamed from: asset_ */
    private kg.f f72510xac10736f;

    /* renamed from: looping_ */
    private boolean f72511x86983961;

    /* renamed from: memoizedIsInitialized */
    private byte f72512xf54bb1a0;

    /* renamed from: timeRange_ */
    private kg.a2 f72513x2c861fef;

    /* renamed from: volume_ */
    private float f72514x25b1fc85;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.j f72504xb3e828f3 = new kg.j();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72506x8c3e301f = new kg.h();

    /* renamed from: getDefaultInstance */
    public static kg.j m142827x7c90cfc0() {
        return f72504xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m142828xc1a58b65() {
        return kg.q2.f389154w;
    }

    /* renamed from: newBuilder */
    public static kg.i m142829x3136c9db() {
        return f72504xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.j m142831x4a829d50(java.io.InputStream inputStream) {
        return (kg.j) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72506x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.j m142839x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.j) f72506x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m142843xc4ab3c1f() {
        return f72506x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.j)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.j jVar = (kg.j) obj;
        if (m142851x6bdf876() != jVar.m142851x6bdf876()) {
            return false;
        }
        if ((!m142851x6bdf876() || m142844x742a913a().mo20583xb2c87fbf(jVar.m142844x742a913a())) && m142852xc0b288f6() == jVar.m142852xc0b288f6()) {
            return (!m142852xc0b288f6() || m142848xdd1fba().mo20583xb2c87fbf(jVar.m142848xdd1fba())) && java.lang.Float.floatToIntBits(m142850x34c20a10()) == java.lang.Float.floatToIntBits(jVar.m142850x34c20a10()) && m142846x52a8da88() == jVar.m142846x52a8da88() && this.f7874x4f0c37a3.m20941xb2c87fbf(jVar.f7874x4f0c37a3);
        }
        return false;
    }

    /* renamed from: getAsset */
    public kg.f m142844x742a913a() {
        kg.f fVar = this.f72510xac10736f;
        return fVar == null ? kg.f.m142704x7c90cfc0() : fVar;
    }

    /* renamed from: getAssetOrBuilder */
    public kg.g m142845x12cf41e() {
        return m142844x742a913a();
    }

    /* renamed from: getLooping */
    public boolean m142846x52a8da88() {
        return this.f72511x86983961;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m142847x7ea0ace() {
        return f72506x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.f72510xac10736f != null ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.n(1, m142844x742a913a()) : 0;
        if (this.f72513x2c861fef != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, m142848xdd1fba());
        }
        float f17 = this.f72514x25b1fc85;
        if (f17 != 0.0f) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.i(3, f17);
        }
        boolean z17 = this.f72511x86983961;
        if (z17) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.b(4, z17);
        }
        int mo20593x9d9c349b = n17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    /* renamed from: getTimeRange */
    public kg.a2 m142848xdd1fba() {
        kg.a2 a2Var = this.f72513x2c861fef;
        return a2Var == null ? kg.a2.m142579x7c90cfc0() : a2Var;
    }

    /* renamed from: getTimeRangeOrBuilder */
    public kg.b2 m142849x7e32b59e() {
        return m142848xdd1fba();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    /* renamed from: getVolume */
    public float m142850x34c20a10() {
        return this.f72514x25b1fc85;
    }

    /* renamed from: hasAsset */
    public boolean m142851x6bdf876() {
        return this.f72510xac10736f != null;
    }

    /* renamed from: hasTimeRange */
    public boolean m142852xc0b288f6() {
        return this.f72513x2c861fef != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m142828xc1a58b65().hashCode();
        if (m142851x6bdf876()) {
            hashCode = (((hashCode * 37) + 1) * 53) + m142844x742a913a().mo20587x8cdac1b();
        }
        if (m142852xc0b288f6()) {
            hashCode = (((hashCode * 37) + 2) * 53) + m142848xdd1fba().mo20587x8cdac1b();
        }
        int floatToIntBits = (((((((((hashCode * 37) + 3) * 53) + java.lang.Float.floatToIntBits(m142850x34c20a10())) * 37) + 4) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(m142846x52a8da88())) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = floatToIntBits;
        return floatToIntBits;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.f389155x;
        j6Var.c(kg.j.class, kg.i.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72512xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72512xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.j();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f72510xac10736f != null) {
            k0Var.J(1, m142844x742a913a());
        }
        if (this.f72513x2c861fef != null) {
            k0Var.J(2, m142848xdd1fba());
        }
        float f17 = this.f72514x25b1fc85;
        if (f17 != 0.0f) {
            k0Var.G(3, f17);
        }
        boolean z17 = this.f72511x86983961;
        if (z17) {
            k0Var.x(4, z17);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.i m142830x3136c9db(kg.j jVar) {
        kg.i mo20599xaaa148a0 = f72504xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(jVar);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.j m142840x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.j) f72506x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private j(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72512xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.j m142832x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.j) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72506x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.j m142835x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.j) f72506x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.j mo20559x786693c3() {
        return f72504xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.i mo20599xaaa148a0() {
        if (this == f72504xb3e828f3) {
            return new kg.i(null);
        }
        kg.i iVar = new kg.i(null);
        iVar.e(this);
        return iVar;
    }

    /* renamed from: parseFrom */
    public static kg.j m142836x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.j) f72506x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.i mo20596xab31548() {
        return m142829x3136c9db();
    }

    private j() {
        this.f72512xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseFrom */
    public static kg.j m142841x92b714fd(byte[] bArr) {
        return (kg.j) f72506x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.i mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.i(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.j m142842x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.j) f72506x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    private j(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
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
                                kg.f fVar = this.f72510xac10736f;
                                kg.d mo20599xaaa148a0 = fVar != null ? fVar.mo20599xaaa148a0() : null;
                                kg.f fVar2 = (kg.f) d0Var.v(kg.f.m142720xc4ab3c1f(), t4Var);
                                this.f72510xac10736f = fVar2;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.e(fVar2);
                                    this.f72510xac10736f = mo20599xaaa148a0.mo20557x85702333();
                                }
                            } else if (F == 18) {
                                kg.a2 a2Var = this.f72513x2c861fef;
                                kg.z1 mo20599xaaa148a02 = a2Var != null ? a2Var.mo20599xaaa148a0() : null;
                                kg.a2 a2Var2 = (kg.a2) d0Var.v(kg.a2.m142595xc4ab3c1f(), t4Var);
                                this.f72513x2c861fef = a2Var2;
                                if (mo20599xaaa148a02 != null) {
                                    mo20599xaaa148a02.e(a2Var2);
                                    this.f72513x2c861fef = mo20599xaaa148a02.mo20557x85702333();
                                }
                            } else if (F == 29) {
                                this.f72514x25b1fc85 = d0Var.r();
                            } else if (F != 32) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                this.f72511x86983961 = d0Var.l();
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
    public static kg.j m142837x92b714fd(java.io.InputStream inputStream) {
        return (kg.j) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72506x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.j m142838x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.j) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72506x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.j m142833x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.j) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72506x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.j m142834x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.j) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72506x8c3e301f, d0Var, t4Var);
    }
}
