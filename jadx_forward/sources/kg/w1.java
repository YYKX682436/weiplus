package kg;

/* loaded from: classes16.dex */
public final class w1 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.x1 {

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.w1 f72640xb3e828f3 = new kg.w1();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72641x8c3e301f = new kg.u1();

    /* renamed from: SCALE_FIELD_NUMBER */
    public static final int f72642x5d676743 = 3;

    /* renamed from: TYPE_FIELD_NUMBER */
    public static final int f72643x8a7d4b33 = 1;

    /* renamed from: VALUE_FIELD_NUMBER */
    public static final int f72644xe3c4967c = 2;

    /* renamed from: serialVersionUID */
    private static final long f72645x3a3ed56c = 0;

    /* renamed from: memoizedIsInitialized */
    private byte f72646xf54bb1a0;

    /* renamed from: scale_ */
    private int f72647xc9de2055;

    /* renamed from: type_ */
    private int f72648x69b5865;

    /* renamed from: value_ */
    private long f72649xcee59d0e;

    /* renamed from: getDefaultInstance */
    public static kg.w1 m143257x7c90cfc0() {
        return f72640xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m143258xc1a58b65() {
        return kg.q2.f389140i;
    }

    /* renamed from: newBuilder */
    public static kg.v1 m143259x3136c9db() {
        return f72640xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.w1 m143261x4a829d50(java.io.InputStream inputStream) {
        return (kg.w1) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72641x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.w1 m143269x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.w1) f72641x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m143273xc4ab3c1f() {
        return f72641x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.w1)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.w1 w1Var = (kg.w1) obj;
        return this.f72648x69b5865 == w1Var.f72648x69b5865 && m143278x754a37bb() == w1Var.m143278x754a37bb() && m143275x7520af94() == w1Var.m143275x7520af94() && this.f7874x4f0c37a3.m20941xb2c87fbf(w1Var.f7874x4f0c37a3);
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m143274x7ea0ace() {
        return f72641x8c3e301f;
    }

    /* renamed from: getScale */
    public int m143275x7520af94() {
        return this.f72647xc9de2055;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int f17 = this.f72648x69b5865 != kg.c2.TimeTypeNumeric.mo20656x276ffe3f() ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.f(1, this.f72648x69b5865) : 0;
        long j17 = this.f72649xcee59d0e;
        if (j17 != 0) {
            f17 += com.p176xb6135e39.p283xc50a8b8b.k0.m(2, j17);
        }
        int i18 = this.f72647xc9de2055;
        if (i18 != 0) {
            f17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(3, i18);
        }
        int mo20593x9d9c349b = f17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    /* renamed from: getType */
    public kg.c2 m143276xfb85f7b0() {
        kg.c2 c2Var;
        int i17 = this.f72648x69b5865;
        if (i17 == 0) {
            c2Var = kg.c2.TimeTypeNumeric;
        } else if (i17 == 1) {
            c2Var = kg.c2.TimeTypeInvalid;
        } else if (i17 == 2) {
            c2Var = kg.c2.TimeTypePositiveInfinity;
        } else if (i17 != 3) {
            kg.c2 c2Var2 = kg.c2.TimeTypeNumeric;
            c2Var = null;
        } else {
            c2Var = kg.c2.TimeTypeNegativeInfinity;
        }
        return c2Var == null ? kg.c2.UNRECOGNIZED : c2Var;
    }

    /* renamed from: getTypeValue */
    public int m143277x1ddaf7a1() {
        return this.f72648x69b5865;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    /* renamed from: getValue */
    public long m143278x754a37bb() {
        return this.f72649xcee59d0e;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m143258xc1a58b65().hashCode()) * 37) + 1) * 53) + this.f72648x69b5865) * 37) + 2) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(m143278x754a37bb())) * 37) + 3) * 53) + m143275x7520af94()) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = hashCode;
        return hashCode;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.f389141j;
        j6Var.c(kg.w1.class, kg.v1.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72646xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72646xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.w1();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f72648x69b5865 != kg.c2.TimeTypeNumeric.mo20656x276ffe3f()) {
            k0Var.H(1, this.f72648x69b5865);
        }
        long j17 = this.f72649xcee59d0e;
        if (j17 != 0) {
            k0Var.T(2, j17);
        }
        int i17 = this.f72647xc9de2055;
        if (i17 != 0) {
            k0Var.H(3, i17);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.v1 m143260x3136c9db(kg.w1 w1Var) {
        kg.v1 mo20599xaaa148a0 = f72640xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(w1Var);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.w1 m143270x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.w1) f72641x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private w1(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72646xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.w1 m143262x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.w1) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72641x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.w1 m143265x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.w1) f72641x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.w1 mo20559x786693c3() {
        return f72640xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.v1 mo20599xaaa148a0() {
        if (this == f72640xb3e828f3) {
            return new kg.v1(null);
        }
        kg.v1 v1Var = new kg.v1(null);
        v1Var.e(this);
        return v1Var;
    }

    /* renamed from: parseFrom */
    public static kg.w1 m143266x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.w1) f72641x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.v1 mo20596xab31548() {
        return m143259x3136c9db();
    }

    private w1() {
        this.f72646xf54bb1a0 = (byte) -1;
        this.f72648x69b5865 = 0;
    }

    /* renamed from: parseFrom */
    public static kg.w1 m143271x92b714fd(byte[] bArr) {
        return (kg.w1) f72641x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.v1 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.v1(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.w1 m143272x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.w1) f72641x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.w1 m143267x92b714fd(java.io.InputStream inputStream) {
        return (kg.w1) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72641x8c3e301f, inputStream);
    }

    private w1(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 8) {
                            this.f72648x69b5865 = d0Var.o();
                        } else if (F == 16) {
                            this.f72649xcee59d0e = d0Var.u();
                        } else if (F != 24) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f72647xc9de2055 = d0Var.t();
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
    public static kg.w1 m143268x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.w1) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72641x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.w1 m143263x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.w1) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72641x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.w1 m143264x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.w1) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72641x8c3e301f, d0Var, t4Var);
    }
}
