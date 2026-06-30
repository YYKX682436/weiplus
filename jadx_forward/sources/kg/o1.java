package kg;

/* loaded from: classes16.dex */
public final class o1 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.p1 {

    /* renamed from: LAYER_INDEX_FIELD_NUMBER */
    public static final int f72550x6f041689 = 6;

    /* renamed from: LAYER_SPATIAL_DESC_FIELD_NUMBER */
    public static final int f72551xdb0a8d13 = 4;

    /* renamed from: LAYER_STYLE_FIELD_NUMBER */
    public static final int f72552x3333440a = 3;

    /* renamed from: MAXIMUM_WIDTH_FIELD_NUMBER */
    public static final int f72553xf70e30e6 = 5;

    /* renamed from: TEXT_FIELD_NUMBER */
    public static final int f72555xf5f21820 = 1;

    /* renamed from: TEXT_STYLE_FIELD_NUMBER */
    public static final int f72556x20968a8e = 2;

    /* renamed from: serialVersionUID */
    private static final long f72557x3a3ed56c = 0;

    /* renamed from: layerIndex_ */
    private int f72558x81d3b27e;

    /* renamed from: layerSpatialDesc_ */
    private kg.p0 f72559xfcb813b;

    /* renamed from: layerStyle_ */
    private kg.t0 f72560x9342597f;

    /* renamed from: maximumWidth_ */
    private float f72561x30ed1599;

    /* renamed from: memoizedIsInitialized */
    private byte f72562xf54bb1a0;

    /* renamed from: textStyle_ */
    private kg.s1 f72563x6e64745b;

    /* renamed from: text_ */
    private volatile java.lang.Object f72564x69260d2;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.o1 f72549xb3e828f3 = new kg.o1();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72554x8c3e301f = new kg.m1();

    /* renamed from: getDefaultInstance */
    public static kg.o1 m142987x7c90cfc0() {
        return f72549xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m142988xc1a58b65() {
        return kg.q2.I;
    }

    /* renamed from: newBuilder */
    public static kg.n1 m142989x3136c9db() {
        return f72549xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.o1 m142991x4a829d50(java.io.InputStream inputStream) {
        return (kg.o1) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72554x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.o1 m142999x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.o1) f72554x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m143003xc4ab3c1f() {
        return f72554x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.o1)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.o1 o1Var = (kg.o1) obj;
        if (!m143011xfb85ada3().equals(o1Var.m143011xfb85ada3()) || m143017x80c1f70a() != o1Var.m143017x80c1f70a()) {
            return false;
        }
        if ((m143017x80c1f70a() && !m143013xc0ec8dce().mo20583xb2c87fbf(o1Var.m143013xc0ec8dce())) || m143016x2596791a() != o1Var.m143016x2596791a()) {
            return false;
        }
        if ((!m143016x2596791a() || m143007xeabebad6().mo20583xb2c87fbf(o1Var.m143007xeabebad6())) && m143015x5524565e() == o1Var.m143015x5524565e()) {
            return (!m143015x5524565e() || m143005xea6b5b1a().mo20583xb2c87fbf(o1Var.m143005xea6b5b1a())) && java.lang.Float.floatToIntBits(m143009x8bd0edfc()) == java.lang.Float.floatToIntBits(o1Var.m143009x8bd0edfc()) && m143004xea2ec5f7() == o1Var.m143004xea2ec5f7() && this.f7874x4f0c37a3.m20941xb2c87fbf(o1Var.f7874x4f0c37a3);
        }
        return false;
    }

    /* renamed from: getLayerIndex */
    public int m143004xea2ec5f7() {
        return this.f72558x81d3b27e;
    }

    /* renamed from: getLayerSpatialDesc */
    public kg.p0 m143005xea6b5b1a() {
        kg.p0 p0Var = this.f72559xfcb813b;
        return p0Var == null ? kg.p0.m143098x7c90cfc0() : p0Var;
    }

    /* renamed from: getLayerSpatialDescOrBuilder */
    public kg.q0 m143006xfd01463e() {
        return m143005xea6b5b1a();
    }

    /* renamed from: getLayerStyle */
    public kg.t0 m143007xeabebad6() {
        kg.t0 t0Var = this.f72560x9342597f;
        return t0Var == null ? kg.t0.m143217x7c90cfc0() : t0Var;
    }

    /* renamed from: getLayerStyleOrBuilder */
    public kg.u0 m143008x50f7da02() {
        return m143007xeabebad6();
    }

    /* renamed from: getMaximumWidth */
    public float m143009x8bd0edfc() {
        return this.f72561x30ed1599;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m143010x7ea0ace() {
        return f72554x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int m20743x690e0f49 = m143012xbfff3088().m20957x7aab3243() ? 0 : 0 + com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f72564x69260d2);
        if (this.f72563x6e64745b != null) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, m143013xc0ec8dce());
        }
        if (this.f72560x9342597f != null) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(3, m143007xeabebad6());
        }
        if (this.f72559xfcb813b != null) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, m143005xea6b5b1a());
        }
        float f17 = this.f72561x30ed1599;
        if (f17 != 0.0f) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.i(5, f17);
        }
        int i18 = this.f72558x81d3b27e;
        if (i18 != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.k(6, i18);
        }
        int mo20593x9d9c349b = m20743x690e0f49 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    /* renamed from: getText */
    public java.lang.String m143011xfb85ada3() {
        java.lang.Object obj = this.f72564x69260d2;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
        this.f72564x69260d2 = r17;
        return r17;
    }

    /* renamed from: getTextBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y m143012xbfff3088() {
        java.lang.Object obj = this.f72564x69260d2;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f72564x69260d2 = h17;
        return h17;
    }

    /* renamed from: getTextStyle */
    public kg.s1 m143013xc0ec8dce() {
        kg.s1 s1Var = this.f72563x6e64745b;
        return s1Var == null ? kg.s1.m143145x7c90cfc0() : s1Var;
    }

    /* renamed from: getTextStyleOrBuilder */
    public kg.t1 m143014x35bde0a() {
        return m143013xc0ec8dce();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    /* renamed from: hasLayerSpatialDesc */
    public boolean m143015x5524565e() {
        return this.f72559xfcb813b != null;
    }

    /* renamed from: hasLayerStyle */
    public boolean m143016x2596791a() {
        return this.f72560x9342597f != null;
    }

    /* renamed from: hasTextStyle */
    public boolean m143017x80c1f70a() {
        return this.f72563x6e64745b != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m142988xc1a58b65().hashCode()) * 37) + 1) * 53) + m143011xfb85ada3().hashCode();
        if (m143017x80c1f70a()) {
            hashCode = (((hashCode * 37) + 2) * 53) + m143013xc0ec8dce().mo20587x8cdac1b();
        }
        if (m143016x2596791a()) {
            hashCode = (((hashCode * 37) + 3) * 53) + m143007xeabebad6().mo20587x8cdac1b();
        }
        if (m143015x5524565e()) {
            hashCode = (((hashCode * 37) + 4) * 53) + m143005xea6b5b1a().mo20587x8cdac1b();
        }
        int floatToIntBits = (((((((((hashCode * 37) + 5) * 53) + java.lang.Float.floatToIntBits(m143009x8bd0edfc())) * 37) + 6) * 53) + m143004xea2ec5f7()) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = floatToIntBits;
        return floatToIntBits;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.f389131J;
        j6Var.c(kg.o1.class, kg.n1.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72562xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72562xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.o1();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (!m143012xbfff3088().m20957x7aab3243()) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f72564x69260d2);
        }
        if (this.f72563x6e64745b != null) {
            k0Var.J(2, m143013xc0ec8dce());
        }
        if (this.f72560x9342597f != null) {
            k0Var.J(3, m143007xeabebad6());
        }
        if (this.f72559xfcb813b != null) {
            k0Var.J(4, m143005xea6b5b1a());
        }
        float f17 = this.f72561x30ed1599;
        if (f17 != 0.0f) {
            k0Var.G(5, f17);
        }
        int i17 = this.f72558x81d3b27e;
        if (i17 != 0) {
            k0Var.H(6, i17);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.n1 m142990x3136c9db(kg.o1 o1Var) {
        kg.n1 mo20599xaaa148a0 = f72549xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(o1Var);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.o1 m143000x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.o1) f72554x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private o1(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72562xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.o1 m142992x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.o1) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72554x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.o1 m142995x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.o1) f72554x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.o1 mo20559x786693c3() {
        return f72549xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.n1 mo20599xaaa148a0() {
        if (this == f72549xb3e828f3) {
            return new kg.n1(null);
        }
        kg.n1 n1Var = new kg.n1(null);
        n1Var.e(this);
        return n1Var;
    }

    /* renamed from: parseFrom */
    public static kg.o1 m142996x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.o1) f72554x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.n1 mo20596xab31548() {
        return m142989x3136c9db();
    }

    private o1() {
        this.f72562xf54bb1a0 = (byte) -1;
        this.f72564x69260d2 = "";
    }

    /* renamed from: parseFrom */
    public static kg.o1 m143001x92b714fd(byte[] bArr) {
        return (kg.o1) f72554x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.n1 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.n1(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.o1 m143002x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.o1) f72554x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.o1 m142997x92b714fd(java.io.InputStream inputStream) {
        return (kg.o1) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72554x8c3e301f, inputStream);
    }

    private o1(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F != 10) {
                            if (F == 18) {
                                kg.s1 s1Var = this.f72563x6e64745b;
                                kg.r1 mo20599xaaa148a0 = s1Var != null ? s1Var.mo20599xaaa148a0() : null;
                                kg.s1 s1Var2 = (kg.s1) d0Var.v(kg.s1.m143161xc4ab3c1f(), t4Var);
                                this.f72563x6e64745b = s1Var2;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.e(s1Var2);
                                    this.f72563x6e64745b = mo20599xaaa148a0.mo20557x85702333();
                                }
                            } else if (F == 26) {
                                kg.t0 t0Var = this.f72560x9342597f;
                                kg.s0 mo20599xaaa148a02 = t0Var != null ? t0Var.mo20599xaaa148a0() : null;
                                kg.t0 t0Var2 = (kg.t0) d0Var.v(kg.t0.m143233xc4ab3c1f(), t4Var);
                                this.f72560x9342597f = t0Var2;
                                if (mo20599xaaa148a02 != null) {
                                    mo20599xaaa148a02.e(t0Var2);
                                    this.f72560x9342597f = mo20599xaaa148a02.mo20557x85702333();
                                }
                            } else if (F == 34) {
                                kg.p0 p0Var = this.f72559xfcb813b;
                                kg.o0 mo20599xaaa148a03 = p0Var != null ? p0Var.mo20599xaaa148a0() : null;
                                kg.p0 p0Var2 = (kg.p0) d0Var.v(kg.p0.m143114xc4ab3c1f(), t4Var);
                                this.f72559xfcb813b = p0Var2;
                                if (mo20599xaaa148a03 != null) {
                                    mo20599xaaa148a03.e(p0Var2);
                                    this.f72559xfcb813b = mo20599xaaa148a03.mo20557x85702333();
                                }
                            } else if (F == 45) {
                                this.f72561x30ed1599 = d0Var.r();
                            } else if (F != 48) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                this.f72558x81d3b27e = d0Var.t();
                            }
                        } else {
                            this.f72564x69260d2 = d0Var.E();
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
    public static kg.o1 m142998x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.o1) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72554x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.o1 m142993x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.o1) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72554x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.o1 m142994x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.o1) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72554x8c3e301f, d0Var, t4Var);
    }
}
