package kg;

/* loaded from: classes16.dex */
public final class h0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.i0 {

    /* renamed from: CANVAS_ORIGIN_TYPE_FIELD_NUMBER */
    public static final int f72495xece87761 = 2;

    /* renamed from: CANVAS_SIZE_FIELD_NUMBER */
    public static final int f72496x16e162a5 = 1;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.h0 f72497xb3e828f3 = new kg.h0();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72498x8c3e301f = new kg.f0();

    /* renamed from: serialVersionUID */
    private static final long f72499x3a3ed56c = 0;

    /* renamed from: canvasOriginType_ */
    private int f72500xd92c67;

    /* renamed from: canvasSize_ */
    private kg.g2 f72501x8fb45206;

    /* renamed from: memoizedIsInitialized */
    private byte f72502xf54bb1a0;

    /* renamed from: getDefaultInstance */
    public static kg.h0 m142792x7c90cfc0() {
        return f72497xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m142793xc1a58b65() {
        return kg.q2.M;
    }

    /* renamed from: newBuilder */
    public static kg.g0 m142794x3136c9db() {
        return f72497xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.h0 m142796x4a829d50(java.io.InputStream inputStream) {
        return (kg.h0) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72498x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.h0 m142804x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.h0) f72498x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m142808xc4ab3c1f() {
        return f72498x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.h0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.h0 h0Var = (kg.h0) obj;
        if (m142814x804fd3b3() != h0Var.m142814x804fd3b3()) {
            return false;
        }
        return (!m142814x804fd3b3() || m142811x4578156f().mo20583xb2c87fbf(h0Var.m142811x4578156f())) && this.f72500xd92c67 == h0Var.f72500xd92c67 && this.f7874x4f0c37a3.m20941xb2c87fbf(h0Var.f7874x4f0c37a3);
    }

    /* renamed from: getCanvasOriginType */
    public kg.l m142809xc0a59a6e() {
        kg.l lVar;
        int i17 = this.f72500xd92c67;
        if (i17 == 0) {
            lVar = kg.l.CanvasOriginTypeTopLeft;
        } else if (i17 != 1) {
            kg.l lVar2 = kg.l.CanvasOriginTypeTopLeft;
            lVar = null;
        } else {
            lVar = kg.l.CanvasOriginTypeBottomLeft;
        }
        return lVar == null ? kg.l.UNRECOGNIZED : lVar;
    }

    /* renamed from: getCanvasOriginTypeValue */
    public int m142810x69695ba3() {
        return this.f72500xd92c67;
    }

    /* renamed from: getCanvasSize */
    public kg.g2 m142811x4578156f() {
        kg.g2 g2Var = this.f72501x8fb45206;
        return g2Var == null ? kg.g2.m142765x7c90cfc0() : g2Var;
    }

    /* renamed from: getCanvasSizeOrBuilder */
    public kg.h2 m142812xc8085b89() {
        return m142811x4578156f();
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m142813x7ea0ace() {
        return f72498x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.f72501x8fb45206 != null ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.n(1, m142811x4578156f()) : 0;
        if (this.f72500xd92c67 != kg.l.CanvasOriginTypeTopLeft.mo20656x276ffe3f()) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.f(2, this.f72500xd92c67);
        }
        int mo20593x9d9c349b = n17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    /* renamed from: hasCanvasSize */
    public boolean m142814x804fd3b3() {
        return this.f72501x8fb45206 != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m142793xc1a58b65().hashCode();
        if (m142814x804fd3b3()) {
            hashCode = (((hashCode * 37) + 1) * 53) + m142811x4578156f().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (((((hashCode * 37) + 2) * 53) + this.f72500xd92c67) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.N;
        j6Var.c(kg.h0.class, kg.g0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72502xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72502xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.h0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f72501x8fb45206 != null) {
            k0Var.J(1, m142811x4578156f());
        }
        if (this.f72500xd92c67 != kg.l.CanvasOriginTypeTopLeft.mo20656x276ffe3f()) {
            k0Var.H(2, this.f72500xd92c67);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.g0 m142795x3136c9db(kg.h0 h0Var) {
        kg.g0 mo20599xaaa148a0 = f72497xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(h0Var);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.h0 m142805x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.h0) f72498x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private h0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72502xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.h0 m142797x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.h0) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72498x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.h0 m142800x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.h0) f72498x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.h0 mo20559x786693c3() {
        return f72497xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.g0 mo20599xaaa148a0() {
        if (this == f72497xb3e828f3) {
            return new kg.g0(null);
        }
        kg.g0 g0Var = new kg.g0(null);
        g0Var.e(this);
        return g0Var;
    }

    /* renamed from: parseFrom */
    public static kg.h0 m142801x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.h0) f72498x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.g0 mo20596xab31548() {
        return m142794x3136c9db();
    }

    private h0() {
        this.f72502xf54bb1a0 = (byte) -1;
        this.f72500xd92c67 = 0;
    }

    /* renamed from: parseFrom */
    public static kg.h0 m142806x92b714fd(byte[] bArr) {
        return (kg.h0) f72498x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.g0 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.g0(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.h0 m142807x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.h0) f72498x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.h0 m142802x92b714fd(java.io.InputStream inputStream) {
        return (kg.h0) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72498x8c3e301f, inputStream);
    }

    private h0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
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
                            kg.g2 g2Var = this.f72501x8fb45206;
                            kg.f2 mo20599xaaa148a0 = g2Var != null ? g2Var.mo20599xaaa148a0() : null;
                            kg.g2 g2Var2 = (kg.g2) d0Var.v(kg.g2.m142781xc4ab3c1f(), t4Var);
                            this.f72501x8fb45206 = g2Var2;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.e(g2Var2);
                                this.f72501x8fb45206 = mo20599xaaa148a0.mo20557x85702333();
                            }
                        } else if (F != 16) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f72500xd92c67 = d0Var.o();
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
    public static kg.h0 m142803x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.h0) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72498x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.h0 m142798x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.h0) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72498x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.h0 m142799x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.h0) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72498x8c3e301f, d0Var, t4Var);
    }
}
