package kg;

/* loaded from: classes16.dex */
public final class a2 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.b2 {

    /* renamed from: DURATION_FIELD_NUMBER */
    public static final int f72440x134b3719 = 2;

    /* renamed from: START_TIME_FIELD_NUMBER */
    public static final int f72442x687b17c3 = 1;

    /* renamed from: serialVersionUID */
    private static final long f72443x3a3ed56c = 0;

    /* renamed from: duration_ */
    private kg.w1 f72444x9f45654b;

    /* renamed from: memoizedIsInitialized */
    private byte f72445xf54bb1a0;

    /* renamed from: startTime_ */
    private kg.w1 f72446xa19bbff0;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.a2 f72439xb3e828f3 = new kg.a2();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72441x8c3e301f = new kg.y1();

    /* renamed from: getDefaultInstance */
    public static kg.a2 m142579x7c90cfc0() {
        return f72439xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m142580xc1a58b65() {
        return kg.q2.f389142k;
    }

    /* renamed from: newBuilder */
    public static kg.z1 m142581x3136c9db() {
        return f72439xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.a2 m142583x4a829d50(java.io.InputStream inputStream) {
        return (kg.a2) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72441x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.a2 m142591x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.a2) f72441x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m142595xc4ab3c1f() {
        return f72441x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.a2)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.a2 a2Var = (kg.a2) obj;
        if (m142602x405864d5() != a2Var.m142602x405864d5()) {
            return false;
        }
        if ((!m142602x405864d5() || m142599x8082fb99().mo20583xb2c87fbf(a2Var.m142599x8082fb99())) && m142601x34990a4e() == a2Var.m142601x34990a4e()) {
            return (!m142601x34990a4e() || m142596x51e8b0a().mo20583xb2c87fbf(a2Var.m142596x51e8b0a())) && this.f7874x4f0c37a3.m20941xb2c87fbf(a2Var.f7874x4f0c37a3);
        }
        return false;
    }

    /* renamed from: getDuration */
    public kg.w1 m142596x51e8b0a() {
        kg.w1 w1Var = this.f72444x9f45654b;
        return w1Var == null ? kg.w1.m143257x7c90cfc0() : w1Var;
    }

    /* renamed from: getDurationOrBuilder */
    public kg.x1 m142597xbc4d044e() {
        return m142596x51e8b0a();
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m142598x7ea0ace() {
        return f72441x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.f72446xa19bbff0 != null ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.n(1, m142599x8082fb99()) : 0;
        if (this.f72444x9f45654b != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, m142596x51e8b0a());
        }
        int mo20593x9d9c349b = n17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    /* renamed from: getStartTime */
    public kg.w1 m142599x8082fb99() {
        kg.w1 w1Var = this.f72446xa19bbff0;
        return w1Var == null ? kg.w1.m143257x7c90cfc0() : w1Var;
    }

    /* renamed from: getStartTimeOrBuilder */
    public kg.x1 m142600x67ecc49f() {
        return m142599x8082fb99();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    /* renamed from: hasDuration */
    public boolean m142601x34990a4e() {
        return this.f72444x9f45654b != null;
    }

    /* renamed from: hasStartTime */
    public boolean m142602x405864d5() {
        return this.f72446xa19bbff0 != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m142580xc1a58b65().hashCode();
        if (m142602x405864d5()) {
            hashCode = (((hashCode * 37) + 1) * 53) + m142599x8082fb99().mo20587x8cdac1b();
        }
        if (m142601x34990a4e()) {
            hashCode = (((hashCode * 37) + 2) * 53) + m142596x51e8b0a().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.f389143l;
        j6Var.c(kg.a2.class, kg.z1.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72445xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72445xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.a2();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f72446xa19bbff0 != null) {
            k0Var.J(1, m142599x8082fb99());
        }
        if (this.f72444x9f45654b != null) {
            k0Var.J(2, m142596x51e8b0a());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.z1 m142582x3136c9db(kg.a2 a2Var) {
        kg.z1 mo20599xaaa148a0 = f72439xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(a2Var);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.a2 m142592x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.a2) f72441x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private a2(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72445xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.a2 m142584x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.a2) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72441x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.a2 m142587x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.a2) f72441x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.a2 mo20559x786693c3() {
        return f72439xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.z1 mo20599xaaa148a0() {
        if (this == f72439xb3e828f3) {
            return new kg.z1(null);
        }
        kg.z1 z1Var = new kg.z1(null);
        z1Var.e(this);
        return z1Var;
    }

    /* renamed from: parseFrom */
    public static kg.a2 m142588x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.a2) f72441x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.z1 mo20596xab31548() {
        return m142581x3136c9db();
    }

    private a2() {
        this.f72445xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseFrom */
    public static kg.a2 m142593x92b714fd(byte[] bArr) {
        return (kg.a2) f72441x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.z1 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.z1(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.a2 m142594x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.a2) f72441x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    private a2(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        this();
        kg.v1 mo20599xaaa148a0;
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            kg.w1 w1Var = this.f72446xa19bbff0;
                            mo20599xaaa148a0 = w1Var != null ? w1Var.mo20599xaaa148a0() : null;
                            kg.w1 w1Var2 = (kg.w1) d0Var.v(kg.w1.m143273xc4ab3c1f(), t4Var);
                            this.f72446xa19bbff0 = w1Var2;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.e(w1Var2);
                                this.f72446xa19bbff0 = mo20599xaaa148a0.mo20557x85702333();
                            }
                        } else if (F != 18) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            kg.w1 w1Var3 = this.f72444x9f45654b;
                            mo20599xaaa148a0 = w1Var3 != null ? w1Var3.mo20599xaaa148a0() : null;
                            kg.w1 w1Var4 = (kg.w1) d0Var.v(kg.w1.m143273xc4ab3c1f(), t4Var);
                            this.f72444x9f45654b = w1Var4;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.e(w1Var4);
                                this.f72444x9f45654b = mo20599xaaa148a0.mo20557x85702333();
                            }
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
    public static kg.a2 m142589x92b714fd(java.io.InputStream inputStream) {
        return (kg.a2) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72441x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.a2 m142590x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.a2) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72441x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.a2 m142585x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.a2) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72441x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.a2 m142586x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.a2) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72441x8c3e301f, d0Var, t4Var);
    }
}
