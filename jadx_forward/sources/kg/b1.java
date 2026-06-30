package kg;

/* loaded from: classes16.dex */
public final class b1 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.c1 {

    /* renamed from: LAYER_INDEX_FIELD_NUMBER */
    public static final int f72448x6f041689 = 6;

    /* renamed from: LAYER_SPATIAL_DESC_FIELD_NUMBER */
    public static final int f72449xdb0a8d13 = 2;

    /* renamed from: LAYER_STYLE_FIELD_NUMBER */
    public static final int f72450x3333440a = 4;

    /* renamed from: LYRIC_INFOS_FIELD_NUMBER */
    public static final int f72451x324b92e8 = 1;

    /* renamed from: MAXIMUM_WIDTH_FIELD_NUMBER */
    public static final int f72452xf70e30e6 = 5;

    /* renamed from: TEXT_STYLE_FIELD_NUMBER */
    public static final int f72454x20968a8e = 3;

    /* renamed from: serialVersionUID */
    private static final long f72455x3a3ed56c = 0;

    /* renamed from: layerIndex_ */
    private int f72456x81d3b27e;

    /* renamed from: layerSpatialDesc_ */
    private kg.p0 f72457xfcb813b;

    /* renamed from: layerStyle_ */
    private kg.t0 f72458x9342597f;

    /* renamed from: lyricInfos_ */
    private java.util.List<kg.x0> f72459xe0df8cb9;

    /* renamed from: maximumWidth_ */
    private float f72460x30ed1599;

    /* renamed from: memoizedIsInitialized */
    private byte f72461xf54bb1a0;

    /* renamed from: textStyle_ */
    private kg.s1 f72462x6e64745b;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.b1 f72447xb3e828f3 = new kg.b1();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72453x8c3e301f = new kg.z0();

    /* renamed from: getDefaultInstance */
    public static kg.b1 m142615x7c90cfc0() {
        return f72447xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m142616xc1a58b65() {
        return kg.q2.K;
    }

    /* renamed from: newBuilder */
    public static kg.a1 m142617x3136c9db() {
        return f72447xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.b1 m142619x4a829d50(java.io.InputStream inputStream) {
        return (kg.b1) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72453x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.b1 m142627x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.b1) f72453x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m142631xc4ab3c1f() {
        return f72453x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.b1)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.b1 b1Var = (kg.b1) obj;
        if (!m142639xad49cf1a().equals(b1Var.m142639xad49cf1a()) || m142646x5524565e() != b1Var.m142646x5524565e()) {
            return false;
        }
        if ((m142646x5524565e() && !m142633xea6b5b1a().mo20583xb2c87fbf(b1Var.m142633xea6b5b1a())) || m142648x80c1f70a() != b1Var.m142648x80c1f70a()) {
            return false;
        }
        if ((!m142648x80c1f70a() || m142644xc0ec8dce().mo20583xb2c87fbf(b1Var.m142644xc0ec8dce())) && m142647x2596791a() == b1Var.m142647x2596791a()) {
            return (!m142647x2596791a() || m142635xeabebad6().mo20583xb2c87fbf(b1Var.m142635xeabebad6())) && java.lang.Float.floatToIntBits(m142642x8bd0edfc()) == java.lang.Float.floatToIntBits(b1Var.m142642x8bd0edfc()) && m142632xea2ec5f7() == b1Var.m142632xea2ec5f7() && this.f7874x4f0c37a3.m20941xb2c87fbf(b1Var.f7874x4f0c37a3);
        }
        return false;
    }

    /* renamed from: getLayerIndex */
    public int m142632xea2ec5f7() {
        return this.f72456x81d3b27e;
    }

    /* renamed from: getLayerSpatialDesc */
    public kg.p0 m142633xea6b5b1a() {
        kg.p0 p0Var = this.f72457xfcb813b;
        return p0Var == null ? kg.p0.m143098x7c90cfc0() : p0Var;
    }

    /* renamed from: getLayerSpatialDescOrBuilder */
    public kg.q0 m142634xfd01463e() {
        return m142633xea6b5b1a();
    }

    /* renamed from: getLayerStyle */
    public kg.t0 m142635xeabebad6() {
        kg.t0 t0Var = this.f72458x9342597f;
        return t0Var == null ? kg.t0.m143217x7c90cfc0() : t0Var;
    }

    /* renamed from: getLayerStyleOrBuilder */
    public kg.u0 m142636x50f7da02() {
        return m142635xeabebad6();
    }

    /* renamed from: getLyricInfos */
    public kg.x0 m142637xb371385c(int i17) {
        return this.f72459xe0df8cb9.get(i17);
    }

    /* renamed from: getLyricInfosCount */
    public int m142638xfb740213() {
        return this.f72459xe0df8cb9.size();
    }

    /* renamed from: getLyricInfosList */
    public java.util.List<kg.x0> m142639xad49cf1a() {
        return this.f72459xe0df8cb9;
    }

    /* renamed from: getLyricInfosOrBuilder */
    public kg.y0 m142640xeb33333c(int i17) {
        return this.f72459xe0df8cb9.get(i17);
    }

    /* renamed from: getLyricInfosOrBuilderList */
    public java.util.List<? extends kg.y0> m142641xebd359fa() {
        return this.f72459xe0df8cb9;
    }

    /* renamed from: getMaximumWidth */
    public float m142642x8bd0edfc() {
        return this.f72460x30ed1599;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m142643x7ea0ace() {
        return f72453x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f72459xe0df8cb9.size(); i19++) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(1, this.f72459xe0df8cb9.get(i19));
        }
        if (this.f72457xfcb813b != null) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, m142633xea6b5b1a());
        }
        if (this.f72462x6e64745b != null) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(3, m142644xc0ec8dce());
        }
        if (this.f72458x9342597f != null) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, m142635xeabebad6());
        }
        float f17 = this.f72460x30ed1599;
        if (f17 != 0.0f) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.i(5, f17);
        }
        int i27 = this.f72456x81d3b27e;
        if (i27 != 0) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.k(6, i27);
        }
        int mo20593x9d9c349b = i18 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    /* renamed from: getTextStyle */
    public kg.s1 m142644xc0ec8dce() {
        kg.s1 s1Var = this.f72462x6e64745b;
        return s1Var == null ? kg.s1.m143145x7c90cfc0() : s1Var;
    }

    /* renamed from: getTextStyleOrBuilder */
    public kg.t1 m142645x35bde0a() {
        return m142644xc0ec8dce();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    /* renamed from: hasLayerSpatialDesc */
    public boolean m142646x5524565e() {
        return this.f72457xfcb813b != null;
    }

    /* renamed from: hasLayerStyle */
    public boolean m142647x2596791a() {
        return this.f72458x9342597f != null;
    }

    /* renamed from: hasTextStyle */
    public boolean m142648x80c1f70a() {
        return this.f72462x6e64745b != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m142616xc1a58b65().hashCode();
        if (m142638xfb740213() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + m142639xad49cf1a().hashCode();
        }
        if (m142646x5524565e()) {
            hashCode = (((hashCode * 37) + 2) * 53) + m142633xea6b5b1a().mo20587x8cdac1b();
        }
        if (m142648x80c1f70a()) {
            hashCode = (((hashCode * 37) + 3) * 53) + m142644xc0ec8dce().mo20587x8cdac1b();
        }
        if (m142647x2596791a()) {
            hashCode = (((hashCode * 37) + 4) * 53) + m142635xeabebad6().mo20587x8cdac1b();
        }
        int floatToIntBits = (((((((((hashCode * 37) + 5) * 53) + java.lang.Float.floatToIntBits(m142642x8bd0edfc())) * 37) + 6) * 53) + m142632xea2ec5f7()) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = floatToIntBits;
        return floatToIntBits;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.L;
        j6Var.c(kg.b1.class, kg.a1.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72461xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72461xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.b1();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        for (int i17 = 0; i17 < this.f72459xe0df8cb9.size(); i17++) {
            k0Var.J(1, this.f72459xe0df8cb9.get(i17));
        }
        if (this.f72457xfcb813b != null) {
            k0Var.J(2, m142633xea6b5b1a());
        }
        if (this.f72462x6e64745b != null) {
            k0Var.J(3, m142644xc0ec8dce());
        }
        if (this.f72458x9342597f != null) {
            k0Var.J(4, m142635xeabebad6());
        }
        float f17 = this.f72460x30ed1599;
        if (f17 != 0.0f) {
            k0Var.G(5, f17);
        }
        int i18 = this.f72456x81d3b27e;
        if (i18 != 0) {
            k0Var.H(6, i18);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.a1 m142618x3136c9db(kg.b1 b1Var) {
        kg.a1 mo20599xaaa148a0 = f72447xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.f(b1Var);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.b1 m142628x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.b1) f72453x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private b1(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72461xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.b1 m142620x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.b1) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72453x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.b1 m142623x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.b1) f72453x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.b1 mo20559x786693c3() {
        return f72447xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.a1 mo20599xaaa148a0() {
        if (this == f72447xb3e828f3) {
            return new kg.a1(null);
        }
        kg.a1 a1Var = new kg.a1(null);
        a1Var.f(this);
        return a1Var;
    }

    /* renamed from: parseFrom */
    public static kg.b1 m142624x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.b1) f72453x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.a1 mo20596xab31548() {
        return m142617x3136c9db();
    }

    private b1() {
        this.f72461xf54bb1a0 = (byte) -1;
        this.f72459xe0df8cb9 = java.util.Collections.emptyList();
    }

    /* renamed from: parseFrom */
    public static kg.b1 m142629x92b714fd(byte[] bArr) {
        return (kg.b1) f72453x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.a1 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.a1(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.b1 m142630x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.b1) f72453x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.b1 m142625x92b714fd(java.io.InputStream inputStream) {
        return (kg.b1) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72453x8c3e301f, inputStream);
    }

    private b1(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F != 10) {
                            if (F == 18) {
                                kg.p0 p0Var = this.f72457xfcb813b;
                                kg.o0 mo20599xaaa148a0 = p0Var != null ? p0Var.mo20599xaaa148a0() : null;
                                kg.p0 p0Var2 = (kg.p0) d0Var.v(kg.p0.m143114xc4ab3c1f(), t4Var);
                                this.f72457xfcb813b = p0Var2;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.e(p0Var2);
                                    this.f72457xfcb813b = mo20599xaaa148a0.mo20557x85702333();
                                }
                            } else if (F == 26) {
                                kg.s1 s1Var = this.f72462x6e64745b;
                                kg.r1 mo20599xaaa148a02 = s1Var != null ? s1Var.mo20599xaaa148a0() : null;
                                kg.s1 s1Var2 = (kg.s1) d0Var.v(kg.s1.m143161xc4ab3c1f(), t4Var);
                                this.f72462x6e64745b = s1Var2;
                                if (mo20599xaaa148a02 != null) {
                                    mo20599xaaa148a02.e(s1Var2);
                                    this.f72462x6e64745b = mo20599xaaa148a02.mo20557x85702333();
                                }
                            } else if (F == 34) {
                                kg.t0 t0Var = this.f72458x9342597f;
                                kg.s0 mo20599xaaa148a03 = t0Var != null ? t0Var.mo20599xaaa148a0() : null;
                                kg.t0 t0Var2 = (kg.t0) d0Var.v(kg.t0.m143233xc4ab3c1f(), t4Var);
                                this.f72458x9342597f = t0Var2;
                                if (mo20599xaaa148a03 != null) {
                                    mo20599xaaa148a03.e(t0Var2);
                                    this.f72458x9342597f = mo20599xaaa148a03.mo20557x85702333();
                                }
                            } else if (F == 45) {
                                this.f72460x30ed1599 = d0Var.r();
                            } else if (F != 48) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                this.f72456x81d3b27e = d0Var.t();
                            }
                        } else {
                            boolean z19 = (z18 ? 1 : 0) & true;
                            z18 = z18;
                            if (!z19) {
                                this.f72459xe0df8cb9 = new java.util.ArrayList();
                                z18 = (z18 ? 1 : 0) | true;
                            }
                            this.f72459xe0df8cb9.add((kg.x0) d0Var.v(kg.x0.m143361xc4ab3c1f(), t4Var));
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
                if ((z18 ? 1 : 0) & true) {
                    this.f72459xe0df8cb9 = java.util.Collections.unmodifiableList(this.f72459xe0df8cb9);
                }
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }

    /* renamed from: parseFrom */
    public static kg.b1 m142626x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.b1) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72453x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.b1 m142621x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.b1) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72453x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.b1 m142622x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.b1) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72453x8c3e301f, d0Var, t4Var);
    }
}
