package kg;

/* loaded from: classes16.dex */
public final class t0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.u0 {

    /* renamed from: BACKGROUND_COLOR_FIELD_NUMBER */
    public static final int f72626xb549c7b = 4;

    /* renamed from: BORDER_COLOR_FIELD_NUMBER */
    public static final int f72627x54fc68bd = 2;

    /* renamed from: BORDER_WIDTH_FIELD_NUMBER */
    public static final int f72628xae77233a = 3;

    /* renamed from: CORNER_RADIUS_FIELD_NUMBER */
    public static final int f72629x2646d7f1 = 1;

    /* renamed from: EDGE_INSETS_FIELD_NUMBER */
    public static final int f72631x30fd3f75 = 5;

    /* renamed from: serialVersionUID */
    private static final long f72633x3a3ed56c = 0;

    /* renamed from: backgroundColor_ */
    private kg.t f72634x4a46e42a;

    /* renamed from: borderColor_ */
    private kg.t f72635x379b4ca8;

    /* renamed from: borderWidth_ */
    private float f72636x59641aa5;

    /* renamed from: cornerRadius_ */
    private float f72637x3655f1f8;

    /* renamed from: edgeInsets_ */
    private kg.k2 f72638xa62a47ac;

    /* renamed from: memoizedIsInitialized */
    private byte f72639xf54bb1a0;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.t0 f72630xb3e828f3 = new kg.t0();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72632x8c3e301f = new kg.r0();

    /* renamed from: getDefaultInstance */
    public static kg.t0 m143217x7c90cfc0() {
        return f72630xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m143218xc1a58b65() {
        return kg.q2.G;
    }

    /* renamed from: newBuilder */
    public static kg.s0 m143219x3136c9db() {
        return f72630xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.t0 m143221x4a829d50(java.io.InputStream inputStream) {
        return (kg.t0) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72632x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.t0 m143229x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.t0) f72632x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m143233xc4ab3c1f() {
        return f72632x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.t0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.t0 t0Var = (kg.t0) obj;
        if (java.lang.Float.floatToIntBits(m143239x83bb89bd()) != java.lang.Float.floatToIntBits(t0Var.m143239x83bb89bd()) || m143244x250bd79d() != t0Var.m143244x250bd79d()) {
            return false;
        }
        if ((m143244x250bd79d() && !m143236x4ebcd61().mo20583xb2c87fbf(t0Var.m143236x4ebcd61())) || java.lang.Float.floatToIntBits(m143238x602cbc4()) != java.lang.Float.floatToIntBits(t0Var.m143238x602cbc4()) || m143243xd17254db() != t0Var.m143243xd17254db()) {
            return false;
        }
        if ((!m143243xd17254db() || m143234x3119c89f().mo20583xb2c87fbf(t0Var.m143234x3119c89f())) && m143245xa211914d() == t0Var.m143245xa211914d()) {
            return (!m143245xa211914d() || m143240x6739d309().mo20583xb2c87fbf(t0Var.m143240x6739d309())) && this.f7874x4f0c37a3.m20941xb2c87fbf(t0Var.f7874x4f0c37a3);
        }
        return false;
    }

    /* renamed from: getBackgroundColor */
    public kg.t m143234x3119c89f() {
        kg.t tVar = this.f72634x4a46e42a;
        return tVar == null ? kg.t.m143187x7c90cfc0() : tVar;
    }

    /* renamed from: getBackgroundColorOrBuilder */
    public kg.u m143235x89653e59() {
        return m143234x3119c89f();
    }

    /* renamed from: getBorderColor */
    public kg.t m143236x4ebcd61() {
        kg.t tVar = this.f72635x379b4ca8;
        return tVar == null ? kg.t.m143187x7c90cfc0() : tVar;
    }

    /* renamed from: getBorderColorOrBuilder */
    public kg.u m143237x273f73d7() {
        return m143236x4ebcd61();
    }

    /* renamed from: getBorderWidth */
    public float m143238x602cbc4() {
        return this.f72636x59641aa5;
    }

    /* renamed from: getCornerRadius */
    public float m143239x83bb89bd() {
        return this.f72637x3655f1f8;
    }

    /* renamed from: getEdgeInsets */
    public kg.k2 m143240x6739d309() {
        kg.k2 k2Var = this.f72638xa62a47ac;
        return k2Var == null ? kg.k2.m142905x7c90cfc0() : k2Var;
    }

    /* renamed from: getEdgeInsetsOrBuilder */
    public kg.l2 m143241x3c194b2f() {
        return m143240x6739d309();
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m143242x7ea0ace() {
        return f72632x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        float f17 = this.f72637x3655f1f8;
        int i18 = f17 != 0.0f ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.i(1, f17) : 0;
        if (this.f72635x379b4ca8 != null) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, m143236x4ebcd61());
        }
        float f18 = this.f72636x59641aa5;
        if (f18 != 0.0f) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.i(3, f18);
        }
        if (this.f72634x4a46e42a != null) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, m143234x3119c89f());
        }
        if (this.f72638xa62a47ac != null) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(5, m143240x6739d309());
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

    /* renamed from: hasBackgroundColor */
    public boolean m143243xd17254db() {
        return this.f72634x4a46e42a != null;
    }

    /* renamed from: hasBorderColor */
    public boolean m143244x250bd79d() {
        return this.f72635x379b4ca8 != null;
    }

    /* renamed from: hasEdgeInsets */
    public boolean m143245xa211914d() {
        return this.f72638xa62a47ac != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m143218xc1a58b65().hashCode()) * 37) + 1) * 53) + java.lang.Float.floatToIntBits(m143239x83bb89bd());
        if (m143244x250bd79d()) {
            hashCode = (((hashCode * 37) + 2) * 53) + m143236x4ebcd61().mo20587x8cdac1b();
        }
        int floatToIntBits = (((hashCode * 37) + 3) * 53) + java.lang.Float.floatToIntBits(m143238x602cbc4());
        if (m143243xd17254db()) {
            floatToIntBits = (((floatToIntBits * 37) + 4) * 53) + m143234x3119c89f().mo20587x8cdac1b();
        }
        if (m143245xa211914d()) {
            floatToIntBits = (((floatToIntBits * 37) + 5) * 53) + m143240x6739d309().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (floatToIntBits * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.H;
        j6Var.c(kg.t0.class, kg.s0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72639xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72639xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.t0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        float f17 = this.f72637x3655f1f8;
        if (f17 != 0.0f) {
            k0Var.G(1, f17);
        }
        if (this.f72635x379b4ca8 != null) {
            k0Var.J(2, m143236x4ebcd61());
        }
        float f18 = this.f72636x59641aa5;
        if (f18 != 0.0f) {
            k0Var.G(3, f18);
        }
        if (this.f72634x4a46e42a != null) {
            k0Var.J(4, m143234x3119c89f());
        }
        if (this.f72638xa62a47ac != null) {
            k0Var.J(5, m143240x6739d309());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.s0 m143220x3136c9db(kg.t0 t0Var) {
        kg.s0 mo20599xaaa148a0 = f72630xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(t0Var);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.t0 m143230x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.t0) f72632x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private t0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72639xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.t0 m143222x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.t0) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72632x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.t0 m143225x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.t0) f72632x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.t0 mo20559x786693c3() {
        return f72630xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.s0 mo20599xaaa148a0() {
        if (this == f72630xb3e828f3) {
            return new kg.s0(null);
        }
        kg.s0 s0Var = new kg.s0(null);
        s0Var.e(this);
        return s0Var;
    }

    /* renamed from: parseFrom */
    public static kg.t0 m143226x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.t0) f72632x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.s0 mo20596xab31548() {
        return m143219x3136c9db();
    }

    private t0() {
        this.f72639xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseFrom */
    public static kg.t0 m143231x92b714fd(byte[] bArr) {
        return (kg.t0) f72632x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.s0 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.s0(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.t0 m143232x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.t0) f72632x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    private t0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
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
                            if (F != 13) {
                                if (F == 18) {
                                    kg.t tVar = this.f72635x379b4ca8;
                                    kg.s mo20599xaaa148a0 = tVar != null ? tVar.mo20599xaaa148a0() : null;
                                    kg.t tVar2 = (kg.t) d0Var.v(kg.t.m143203xc4ab3c1f(), t4Var);
                                    this.f72635x379b4ca8 = tVar2;
                                    if (mo20599xaaa148a0 != null) {
                                        mo20599xaaa148a0.e(tVar2);
                                        this.f72635x379b4ca8 = mo20599xaaa148a0.mo20557x85702333();
                                    }
                                } else if (F == 29) {
                                    this.f72636x59641aa5 = d0Var.r();
                                } else if (F == 34) {
                                    kg.t tVar3 = this.f72634x4a46e42a;
                                    kg.s mo20599xaaa148a02 = tVar3 != null ? tVar3.mo20599xaaa148a0() : null;
                                    kg.t tVar4 = (kg.t) d0Var.v(kg.t.m143203xc4ab3c1f(), t4Var);
                                    this.f72634x4a46e42a = tVar4;
                                    if (mo20599xaaa148a02 != null) {
                                        mo20599xaaa148a02.e(tVar4);
                                        this.f72634x4a46e42a = mo20599xaaa148a02.mo20557x85702333();
                                    }
                                } else if (F != 42) {
                                    if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                    }
                                } else {
                                    kg.k2 k2Var = this.f72638xa62a47ac;
                                    kg.j2 mo20599xaaa148a03 = k2Var != null ? k2Var.mo20599xaaa148a0() : null;
                                    kg.k2 k2Var2 = (kg.k2) d0Var.v(kg.k2.m142921xc4ab3c1f(), t4Var);
                                    this.f72638xa62a47ac = k2Var2;
                                    if (mo20599xaaa148a03 != null) {
                                        mo20599xaaa148a03.f(k2Var2);
                                        this.f72638xa62a47ac = mo20599xaaa148a03.mo20557x85702333();
                                    }
                                }
                            } else {
                                this.f72637x3655f1f8 = d0Var.r();
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
    public static kg.t0 m143227x92b714fd(java.io.InputStream inputStream) {
        return (kg.t0) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72632x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.t0 m143228x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.t0) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72632x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.t0 m143223x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.t0) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72632x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.t0 m143224x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.t0) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72632x8c3e301f, d0Var, t4Var);
    }
}
