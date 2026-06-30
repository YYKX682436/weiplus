package kg;

/* loaded from: classes16.dex */
public final class s1 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.t1 {

    /* renamed from: FILL_COLOR_FIELD_NUMBER */
    public static final int f72599x8cba9e06 = 1;

    /* renamed from: FONT_FILE_PATH_FIELD_NUMBER */
    public static final int f72600x72576e15 = 9;

    /* renamed from: FONT_NAME_FIELD_NUMBER */
    public static final int f72601x20622392 = 5;

    /* renamed from: FONT_SIZE_FIELD_NUMBER */
    public static final int f72602x5066cddc = 4;

    /* renamed from: SHADOW_COLOR_FIELD_NUMBER */
    public static final int f72604x4efe3749 = 7;

    /* renamed from: SHADOW_OFFSET_FIELD_NUMBER */
    public static final int f72605xa7bd5cdb = 6;

    /* renamed from: SHADOW_RADIUS_FIELD_NUMBER */
    public static final int f72606x84b58b3c = 8;

    /* renamed from: STROKE_COLOR_FIELD_NUMBER */
    public static final int f72607x58563331 = 2;

    /* renamed from: STROKE_WIDTH_FIELD_NUMBER */
    public static final int f72608xb1d0edae = 3;

    /* renamed from: serialVersionUID */
    private static final long f72609x3a3ed56c = 0;

    /* renamed from: fillColor_ */
    private kg.t f72610xc21830bf;

    /* renamed from: fontFilePath_ */
    private volatile java.lang.Object f72611x31e8c52f;

    /* renamed from: fontName_ */
    private volatile java.lang.Object f72612xa33f3425;

    /* renamed from: fontSize_ */
    private float f72613xa3897d6f;

    /* renamed from: memoizedIsInitialized */
    private byte f72614xf54bb1a0;

    /* renamed from: shadowColor_ */
    private kg.t f72615x8690ca9c;

    /* renamed from: shadowOffset_ */
    private kg.g2 f72616xb6a4c8ec;

    /* renamed from: shadowRadius_ */
    private float f72617x4caec0cd;

    /* renamed from: strokeColor_ */
    private kg.t f72618xc16595b4;

    /* renamed from: strokeWidth_ */
    private float f72619xe32e63b1;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.s1 f72598xb3e828f3 = new kg.s1();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72603x8c3e301f = new kg.q1();

    /* renamed from: getDefaultInstance */
    public static kg.s1 m143145x7c90cfc0() {
        return f72598xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m143146xc1a58b65() {
        return kg.q2.E;
    }

    /* renamed from: newBuilder */
    public static kg.r1 m143147x3136c9db() {
        return f72598xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.s1 m143149x4a829d50(java.io.InputStream inputStream) {
        return (kg.s1) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72603x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.s1 m143157x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.s1) f72603x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m143161xc4ab3c1f() {
        return f72603x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.s1)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.s1 s1Var = (kg.s1) obj;
        if (m143178x7b331e26() != s1Var.m143178x7b331e26()) {
            return false;
        }
        if ((m143178x7b331e26() && !m143162xbb5db4ea().mo20583xb2c87fbf(s1Var.m143162xbb5db4ea())) || m143181x6b8e3d11() != s1Var.m143181x6b8e3d11()) {
            return false;
        }
        if ((m143181x6b8e3d11() && !m143175x4b6e32d5().mo20583xb2c87fbf(s1Var.m143175x4b6e32d5())) || java.lang.Float.floatToIntBits(m143177x4c853138()) != java.lang.Float.floatToIntBits(s1Var.m143177x4c853138()) || java.lang.Float.floatToIntBits(m143168x91a4de66()) != java.lang.Float.floatToIntBits(s1Var.m143168x91a4de66()) || !m143166x91a278f0().equals(s1Var.m143166x91a278f0()) || !m143164xff75f3a6().equals(s1Var.m143164xff75f3a6()) || m143180xdf5d418d() != s1Var.m143180xdf5d418d()) {
            return false;
        }
        if ((!m143180xdf5d418d() || m143172xfb7c0449().mo20583xb2c87fbf(s1Var.m143172xfb7c0449())) && m143179x9b34cb29() == s1Var.m143179x9b34cb29()) {
            return (!m143179x9b34cb29() || m143170x7b14c0ed().mo20583xb2c87fbf(s1Var.m143170x7b14c0ed())) && java.lang.Float.floatToIntBits(m143174x530c48()) == java.lang.Float.floatToIntBits(s1Var.m143174x530c48()) && this.f7874x4f0c37a3.m20941xb2c87fbf(s1Var.f7874x4f0c37a3);
        }
        return false;
    }

    /* renamed from: getFillColor */
    public kg.t m143162xbb5db4ea() {
        kg.t tVar = this.f72610xc21830bf;
        return tVar == null ? kg.t.m143187x7c90cfc0() : tVar;
    }

    /* renamed from: getFillColorOrBuilder */
    public kg.u m143163x204ef66e() {
        return m143162xbb5db4ea();
    }

    /* renamed from: getFontFilePath */
    public java.lang.String m143164xff75f3a6() {
        java.lang.Object obj = this.f72611x31e8c52f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
        this.f72611x31e8c52f = r17;
        return r17;
    }

    /* renamed from: getFontFilePathBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y m143165x2a693465() {
        java.lang.Object obj = this.f72611x31e8c52f;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f72611x31e8c52f = h17;
        return h17;
    }

    /* renamed from: getFontName */
    public java.lang.String m143166x91a278f0() {
        java.lang.Object obj = this.f72612xa33f3425;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
        this.f72612xa33f3425 = r17;
        return r17;
    }

    /* renamed from: getFontNameBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y m143167x868e6d5b() {
        java.lang.Object obj = this.f72612xa33f3425;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f72612xa33f3425 = h17;
        return h17;
    }

    /* renamed from: getFontSize */
    public float m143168x91a4de66() {
        return this.f72613xa3897d6f;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m143169x7ea0ace() {
        return f72603x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.f72610xc21830bf != null ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.n(1, m143162xbb5db4ea()) : 0;
        if (this.f72618xc16595b4 != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, m143175x4b6e32d5());
        }
        float f17 = this.f72619xe32e63b1;
        if (f17 != 0.0f) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.i(3, f17);
        }
        float f18 = this.f72613xa3897d6f;
        if (f18 != 0.0f) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.i(4, f18);
        }
        if (!m143167x868e6d5b().m20957x7aab3243()) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(5, this.f72612xa33f3425);
        }
        if (this.f72616xb6a4c8ec != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(6, m143172xfb7c0449());
        }
        if (this.f72615x8690ca9c != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(7, m143170x7b14c0ed());
        }
        float f19 = this.f72617x4caec0cd;
        if (f19 != 0.0f) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.i(8, f19);
        }
        if (!m143165x2a693465().m20957x7aab3243()) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(9, this.f72611x31e8c52f);
        }
        int mo20593x9d9c349b = n17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    /* renamed from: getShadowColor */
    public kg.t m143170x7b14c0ed() {
        kg.t tVar = this.f72615x8690ca9c;
        return tVar == null ? kg.t.m143187x7c90cfc0() : tVar;
    }

    /* renamed from: getShadowColorOrBuilder */
    public kg.u m143171x6ca1bdcb() {
        return m143170x7b14c0ed();
    }

    /* renamed from: getShadowOffset */
    public kg.g2 m143172xfb7c0449() {
        kg.g2 g2Var = this.f72616xb6a4c8ec;
        return g2Var == null ? kg.g2.m142765x7c90cfc0() : g2Var;
    }

    /* renamed from: getShadowOffsetOrBuilder */
    public kg.h2 m143173x731a81ef() {
        return m143172xfb7c0449();
    }

    /* renamed from: getShadowRadius */
    public float m143174x530c48() {
        return this.f72617x4caec0cd;
    }

    /* renamed from: getStrokeColor */
    public kg.t m143175x4b6e32d5() {
        kg.t tVar = this.f72618xc16595b4;
        return tVar == null ? kg.t.m143187x7c90cfc0() : tVar;
    }

    /* renamed from: getStrokeColorOrBuilder */
    public kg.u m143176xbde5f0e3() {
        return m143175x4b6e32d5();
    }

    /* renamed from: getStrokeWidth */
    public float m143177x4c853138() {
        return this.f72619xe32e63b1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    /* renamed from: hasFillColor */
    public boolean m143178x7b331e26() {
        return this.f72610xc21830bf != null;
    }

    /* renamed from: hasShadowColor */
    public boolean m143179x9b34cb29() {
        return this.f72615x8690ca9c != null;
    }

    /* renamed from: hasShadowOffset */
    public boolean m143180xdf5d418d() {
        return this.f72616xb6a4c8ec != null;
    }

    /* renamed from: hasStrokeColor */
    public boolean m143181x6b8e3d11() {
        return this.f72618xc16595b4 != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m143146xc1a58b65().hashCode();
        if (m143178x7b331e26()) {
            hashCode = (((hashCode * 37) + 1) * 53) + m143162xbb5db4ea().mo20587x8cdac1b();
        }
        if (m143181x6b8e3d11()) {
            hashCode = (((hashCode * 37) + 2) * 53) + m143175x4b6e32d5().mo20587x8cdac1b();
        }
        int floatToIntBits = (((((((((((((((hashCode * 37) + 3) * 53) + java.lang.Float.floatToIntBits(m143177x4c853138())) * 37) + 4) * 53) + java.lang.Float.floatToIntBits(m143168x91a4de66())) * 37) + 5) * 53) + m143166x91a278f0().hashCode()) * 37) + 9) * 53) + m143164xff75f3a6().hashCode();
        if (m143180xdf5d418d()) {
            floatToIntBits = (((floatToIntBits * 37) + 6) * 53) + m143172xfb7c0449().mo20587x8cdac1b();
        }
        if (m143179x9b34cb29()) {
            floatToIntBits = (((floatToIntBits * 37) + 7) * 53) + m143170x7b14c0ed().mo20587x8cdac1b();
        }
        int floatToIntBits2 = (((((floatToIntBits * 37) + 8) * 53) + java.lang.Float.floatToIntBits(m143174x530c48())) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = floatToIntBits2;
        return floatToIntBits2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.F;
        j6Var.c(kg.s1.class, kg.r1.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72614xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72614xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.s1();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f72610xc21830bf != null) {
            k0Var.J(1, m143162xbb5db4ea());
        }
        if (this.f72618xc16595b4 != null) {
            k0Var.J(2, m143175x4b6e32d5());
        }
        float f17 = this.f72619xe32e63b1;
        if (f17 != 0.0f) {
            k0Var.G(3, f17);
        }
        float f18 = this.f72613xa3897d6f;
        if (f18 != 0.0f) {
            k0Var.G(4, f18);
        }
        if (!m143167x868e6d5b().m20957x7aab3243()) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 5, this.f72612xa33f3425);
        }
        if (this.f72616xb6a4c8ec != null) {
            k0Var.J(6, m143172xfb7c0449());
        }
        if (this.f72615x8690ca9c != null) {
            k0Var.J(7, m143170x7b14c0ed());
        }
        float f19 = this.f72617x4caec0cd;
        if (f19 != 0.0f) {
            k0Var.G(8, f19);
        }
        if (!m143165x2a693465().m20957x7aab3243()) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 9, this.f72611x31e8c52f);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.r1 m143148x3136c9db(kg.s1 s1Var) {
        kg.r1 mo20599xaaa148a0 = f72598xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(s1Var);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.s1 m143158x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.s1) f72603x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private s1(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72614xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.s1 m143150x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.s1) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72603x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.s1 m143153x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.s1) f72603x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.s1 mo20559x786693c3() {
        return f72598xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.r1 mo20599xaaa148a0() {
        if (this == f72598xb3e828f3) {
            return new kg.r1(null);
        }
        kg.r1 r1Var = new kg.r1(null);
        r1Var.e(this);
        return r1Var;
    }

    /* renamed from: parseFrom */
    public static kg.s1 m143154x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.s1) f72603x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.r1 mo20596xab31548() {
        return m143147x3136c9db();
    }

    private s1() {
        this.f72614xf54bb1a0 = (byte) -1;
        this.f72612xa33f3425 = "";
        this.f72611x31e8c52f = "";
    }

    /* renamed from: parseFrom */
    public static kg.s1 m143159x92b714fd(byte[] bArr) {
        return (kg.s1) f72603x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.r1 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.r1(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.s1 m143160x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.s1) f72603x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.s1 m143155x92b714fd(java.io.InputStream inputStream) {
        return (kg.s1) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72603x8c3e301f, inputStream);
    }

    private s1(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
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
                            kg.t tVar = this.f72610xc21830bf;
                            kg.s mo20599xaaa148a0 = tVar != null ? tVar.mo20599xaaa148a0() : null;
                            kg.t tVar2 = (kg.t) d0Var.v(kg.t.m143203xc4ab3c1f(), t4Var);
                            this.f72610xc21830bf = tVar2;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.e(tVar2);
                                this.f72610xc21830bf = mo20599xaaa148a0.mo20557x85702333();
                            }
                        } else if (F == 18) {
                            kg.t tVar3 = this.f72618xc16595b4;
                            kg.s mo20599xaaa148a02 = tVar3 != null ? tVar3.mo20599xaaa148a0() : null;
                            kg.t tVar4 = (kg.t) d0Var.v(kg.t.m143203xc4ab3c1f(), t4Var);
                            this.f72618xc16595b4 = tVar4;
                            if (mo20599xaaa148a02 != null) {
                                mo20599xaaa148a02.e(tVar4);
                                this.f72618xc16595b4 = mo20599xaaa148a02.mo20557x85702333();
                            }
                        } else if (F == 29) {
                            this.f72619xe32e63b1 = d0Var.r();
                        } else if (F == 37) {
                            this.f72613xa3897d6f = d0Var.r();
                        } else if (F == 42) {
                            this.f72612xa33f3425 = d0Var.E();
                        } else if (F == 50) {
                            kg.g2 g2Var = this.f72616xb6a4c8ec;
                            kg.f2 mo20599xaaa148a03 = g2Var != null ? g2Var.mo20599xaaa148a0() : null;
                            kg.g2 g2Var2 = (kg.g2) d0Var.v(kg.g2.m142781xc4ab3c1f(), t4Var);
                            this.f72616xb6a4c8ec = g2Var2;
                            if (mo20599xaaa148a03 != null) {
                                mo20599xaaa148a03.e(g2Var2);
                                this.f72616xb6a4c8ec = mo20599xaaa148a03.mo20557x85702333();
                            }
                        } else if (F == 58) {
                            kg.t tVar5 = this.f72615x8690ca9c;
                            kg.s mo20599xaaa148a04 = tVar5 != null ? tVar5.mo20599xaaa148a0() : null;
                            kg.t tVar6 = (kg.t) d0Var.v(kg.t.m143203xc4ab3c1f(), t4Var);
                            this.f72615x8690ca9c = tVar6;
                            if (mo20599xaaa148a04 != null) {
                                mo20599xaaa148a04.e(tVar6);
                                this.f72615x8690ca9c = mo20599xaaa148a04.mo20557x85702333();
                            }
                        } else if (F == 69) {
                            this.f72617x4caec0cd = d0Var.r();
                        } else if (F != 74) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f72611x31e8c52f = d0Var.E();
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
    public static kg.s1 m143156x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.s1) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72603x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.s1 m143151x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.s1) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72603x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.s1 m143152x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.s1) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72603x8c3e301f, d0Var, t4Var);
    }
}
