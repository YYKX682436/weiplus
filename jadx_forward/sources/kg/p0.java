package kg;

/* loaded from: classes16.dex */
public final class p0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.q0 {

    /* renamed from: ANCHOR_POINT_FIELD_NUMBER */
    public static final int f72586xd4861e87 = 4;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.p0 f72587xb3e828f3 = new kg.p0();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72588x8c3e301f = new kg.n0();

    /* renamed from: POSITION_FIELD_NUMBER */
    public static final int f72589x2ee525a4 = 3;

    /* renamed from: ROTATION_FIELD_NUMBER */
    public static final int f72590xf132616f = 2;

    /* renamed from: SCALE_FIELD_NUMBER */
    public static final int f72591x5d676743 = 1;

    /* renamed from: serialVersionUID */
    private static final long f72592x3a3ed56c = 0;

    /* renamed from: anchorPoint_ */
    private kg.g2 f72593xc0c26fe4;

    /* renamed from: memoizedIsInitialized */
    private byte f72594xf54bb1a0;

    /* renamed from: position_ */
    private kg.g2 f72595x65c08c56;

    /* renamed from: rotation_ */
    private float f72596xb588e0a1;

    /* renamed from: scale_ */
    private float f72597xc9de2055;

    /* renamed from: getDefaultInstance */
    public static kg.p0 m143098x7c90cfc0() {
        return f72587xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m143099xc1a58b65() {
        return kg.q2.f389148q;
    }

    /* renamed from: newBuilder */
    public static kg.o0 m143100x3136c9db() {
        return f72587xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.p0 m143102x4a829d50(java.io.InputStream inputStream) {
        return (kg.p0) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72588x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.p0 m143110x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.p0) f72588x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m143114xc4ab3c1f() {
        return f72588x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.p0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.p0 p0Var = (kg.p0) obj;
        if (java.lang.Float.floatToIntBits(m143121x7520af94()) != java.lang.Float.floatToIntBits(p0Var.m143121x7520af94()) || java.lang.Float.floatToIntBits(m143120x79734cf4()) != java.lang.Float.floatToIntBits(p0Var.m143120x79734cf4()) || m143123xd7e755e3() != p0Var.m143123xd7e755e3()) {
            return false;
        }
        if ((!m143123xd7e755e3() || m143118xa86cd69f().mo20583xb2c87fbf(p0Var.m143118xa86cd69f())) && m143122x9d155ce1() == p0Var.m143122x9d155ce1()) {
            return (!m143122x9d155ce1() || m143115x7cf552a5().mo20583xb2c87fbf(p0Var.m143115x7cf552a5())) && this.f7874x4f0c37a3.m20941xb2c87fbf(p0Var.f7874x4f0c37a3);
        }
        return false;
    }

    /* renamed from: getAnchorPoint */
    public kg.g2 m143115x7cf552a5() {
        kg.g2 g2Var = this.f72593xc0c26fe4;
        return g2Var == null ? kg.g2.m142765x7c90cfc0() : g2Var;
    }

    /* renamed from: getAnchorPointOrBuilder */
    public kg.h2 m143116xb49d9b13() {
        return m143115x7cf552a5();
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m143117x7ea0ace() {
        return f72588x8c3e301f;
    }

    /* renamed from: getPosition */
    public kg.g2 m143118xa86cd69f() {
        kg.g2 g2Var = this.f72595x65c08c56;
        return g2Var == null ? kg.g2.m142765x7c90cfc0() : g2Var;
    }

    /* renamed from: getPositionOrBuilder */
    public kg.h2 m143119xa3a1f059() {
        return m143118xa86cd69f();
    }

    /* renamed from: getRotation */
    public float m143120x79734cf4() {
        return this.f72596xb588e0a1;
    }

    /* renamed from: getScale */
    public float m143121x7520af94() {
        return this.f72597xc9de2055;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        float f17 = this.f72597xc9de2055;
        int i18 = f17 != 0.0f ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.i(1, f17) : 0;
        float f18 = this.f72596xb588e0a1;
        if (f18 != 0.0f) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.i(2, f18);
        }
        if (this.f72595x65c08c56 != null) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(3, m143118xa86cd69f());
        }
        if (this.f72593xc0c26fe4 != null) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, m143115x7cf552a5());
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

    /* renamed from: hasAnchorPoint */
    public boolean m143122x9d155ce1() {
        return this.f72593xc0c26fe4 != null;
    }

    /* renamed from: hasPosition */
    public boolean m143123xd7e755e3() {
        return this.f72595x65c08c56 != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m143099xc1a58b65().hashCode()) * 37) + 1) * 53) + java.lang.Float.floatToIntBits(m143121x7520af94())) * 37) + 2) * 53) + java.lang.Float.floatToIntBits(m143120x79734cf4());
        if (m143123xd7e755e3()) {
            hashCode = (((hashCode * 37) + 3) * 53) + m143118xa86cd69f().mo20587x8cdac1b();
        }
        if (m143122x9d155ce1()) {
            hashCode = (((hashCode * 37) + 4) * 53) + m143115x7cf552a5().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.f389149r;
        j6Var.c(kg.p0.class, kg.o0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72594xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72594xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.p0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        float f17 = this.f72597xc9de2055;
        if (f17 != 0.0f) {
            k0Var.G(1, f17);
        }
        float f18 = this.f72596xb588e0a1;
        if (f18 != 0.0f) {
            k0Var.G(2, f18);
        }
        if (this.f72595x65c08c56 != null) {
            k0Var.J(3, m143118xa86cd69f());
        }
        if (this.f72593xc0c26fe4 != null) {
            k0Var.J(4, m143115x7cf552a5());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.o0 m143101x3136c9db(kg.p0 p0Var) {
        kg.o0 mo20599xaaa148a0 = f72587xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(p0Var);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.p0 m143111x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.p0) f72588x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private p0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72594xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.p0 m143103x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.p0) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72588x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.p0 m143106x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.p0) f72588x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.p0 mo20559x786693c3() {
        return f72587xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.o0 mo20599xaaa148a0() {
        if (this == f72587xb3e828f3) {
            return new kg.o0(null);
        }
        kg.o0 o0Var = new kg.o0(null);
        o0Var.e(this);
        return o0Var;
    }

    /* renamed from: parseFrom */
    public static kg.p0 m143107x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.p0) f72588x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.o0 mo20596xab31548() {
        return m143100x3136c9db();
    }

    private p0() {
        this.f72594xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseFrom */
    public static kg.p0 m143112x92b714fd(byte[] bArr) {
        return (kg.p0) f72588x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.o0 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.o0(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.p0 m143113x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.p0) f72588x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    private p0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        this();
        kg.f2 mo20599xaaa148a0;
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 13) {
                                this.f72597xc9de2055 = d0Var.r();
                            } else if (F != 21) {
                                if (F == 26) {
                                    kg.g2 g2Var = this.f72595x65c08c56;
                                    mo20599xaaa148a0 = g2Var != null ? g2Var.mo20599xaaa148a0() : null;
                                    kg.g2 g2Var2 = (kg.g2) d0Var.v(kg.g2.m142781xc4ab3c1f(), t4Var);
                                    this.f72595x65c08c56 = g2Var2;
                                    if (mo20599xaaa148a0 != null) {
                                        mo20599xaaa148a0.e(g2Var2);
                                        this.f72595x65c08c56 = mo20599xaaa148a0.mo20557x85702333();
                                    }
                                } else if (F != 34) {
                                    if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                    }
                                } else {
                                    kg.g2 g2Var3 = this.f72593xc0c26fe4;
                                    mo20599xaaa148a0 = g2Var3 != null ? g2Var3.mo20599xaaa148a0() : null;
                                    kg.g2 g2Var4 = (kg.g2) d0Var.v(kg.g2.m142781xc4ab3c1f(), t4Var);
                                    this.f72593xc0c26fe4 = g2Var4;
                                    if (mo20599xaaa148a0 != null) {
                                        mo20599xaaa148a0.e(g2Var4);
                                        this.f72593xc0c26fe4 = mo20599xaaa148a0.mo20557x85702333();
                                    }
                                }
                            } else {
                                this.f72596xb588e0a1 = d0Var.r();
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
    public static kg.p0 m143108x92b714fd(java.io.InputStream inputStream) {
        return (kg.p0) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72588x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.p0 m143109x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.p0) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72588x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.p0 m143104x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.p0) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72588x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.p0 m143105x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.p0) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72588x8c3e301f, d0Var, t4Var);
    }
}
