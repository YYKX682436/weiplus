package vg;

/* loaded from: classes16.dex */
public final class d extends com.p176xb6135e39.p283xc50a8b8b.l6 implements vg.e {

    /* renamed from: DURATION_FIELD_NUMBER */
    public static final int f77307x134b3719 = 5;

    /* renamed from: START_TIME_FIELD_NUMBER */
    public static final int f77309x687b17c3 = 4;

    /* renamed from: SUB_TASK_ID_FIELD_NUMBER */
    public static final int f77310x4df1e4f7 = 10;

    /* renamed from: TASK_ID_FIELD_NUMBER */
    public static final int f77311x9bbb7838 = 1;

    /* renamed from: TASK_NAME_FIELD_NUMBER */
    public static final int f77312x1680ab48 = 2;

    /* renamed from: TASK_TAG_FIELD_NUMBER */
    public static final int f77313x5113c66d = 3;

    /* renamed from: TASK_TRAITS_FIELD_NUMBER */
    public static final int f77314x7349ea6e = 6;

    /* renamed from: serialVersionUID */
    private static final long f77315x3a3ed56c = 0;

    /* renamed from: duration_ */
    private double f77316x9f45654b;

    /* renamed from: memoizedIsInitialized */
    private byte f77317xf54bb1a0;

    /* renamed from: startTime_ */
    private double f77318xa19bbff0;

    /* renamed from: subTaskIdMemoizedSerializedSize */
    private int f77319x4b3340f;

    /* renamed from: subTaskId_ */
    private com.p176xb6135e39.p283xc50a8b8b.t6 f77320x4c0f907f;

    /* renamed from: taskId_ */
    private int f77321xa45f3edf;

    /* renamed from: taskName_ */
    private volatile java.lang.Object f77322x9d05caf;

    /* renamed from: taskTag_ */
    private volatile java.lang.Object f77323xe78d932a;

    /* renamed from: taskTraits_ */
    private long f77324x30ecc795;

    /* renamed from: DEFAULT_INSTANCE */
    private static final vg.d f77306xb3e828f3 = new vg.d();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f77308x8c3e301f = new vg.b();

    /* renamed from: getDefaultInstance */
    public static vg.d m171877x7c90cfc0() {
        return f77306xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m171878xc1a58b65() {
        return vg.i.f517975a;
    }

    /* renamed from: newBuilder */
    public static vg.c m171879x3136c9db() {
        return f77306xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static vg.d m171881x4a829d50(java.io.InputStream inputStream) {
        return (vg.d) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f77308x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static vg.d m171889x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (vg.d) f77308x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m171893xc4ab3c1f() {
        return f77308x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vg.d)) {
            return super.mo20583xb2c87fbf(obj);
        }
        vg.d dVar = (vg.d) obj;
        return m171900x30961476() == dVar.m171900x30961476() && m171901x63651726().equals(dVar.m171901x63651726()) && m171903xe22ca39f().equals(dVar.m171903xe22ca39f()) && java.lang.Double.doubleToLongBits(m171896x8082fb99()) == java.lang.Double.doubleToLongBits(dVar.m171896x8082fb99()) && java.lang.Double.doubleToLongBits(m171894x51e8b0a()) == java.lang.Double.doubleToLongBits(dVar.m171894x51e8b0a()) && m171905x29a33200() == dVar.m171905x29a33200() && m171899x498dce8().equals(dVar.m171899x498dce8()) && this.f7874x4f0c37a3.m20941xb2c87fbf(dVar.f7874x4f0c37a3);
    }

    /* renamed from: getDuration */
    public double m171894x51e8b0a() {
        return this.f77316x9f45654b;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m171895x7ea0ace() {
        return f77308x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int i18 = this.f77321xa45f3edf;
        int i19 = 0;
        int q17 = i18 != 0 ? com.p176xb6135e39.p283xc50a8b8b.k0.q(1, i18) + 0 : 0;
        if (!m171902x77e440e5().m20957x7aab3243()) {
            q17 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(2, this.f77322x9d05caf);
        }
        if (!m171904xd26e980c().m20957x7aab3243()) {
            q17 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(3, this.f77323xe78d932a);
        }
        double d17 = this.f77318xa19bbff0;
        if (d17 != 0.0d) {
            q17 += com.p176xb6135e39.p283xc50a8b8b.k0.e(4, d17);
        }
        double d18 = this.f77316x9f45654b;
        if (d18 != 0.0d) {
            q17 += com.p176xb6135e39.p283xc50a8b8b.k0.e(5, d18);
        }
        long j17 = this.f77324x30ecc795;
        if (j17 != 0) {
            q17 += com.p176xb6135e39.p283xc50a8b8b.k0.s(6, j17);
        }
        int i27 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.t6 t6Var = this.f77320x4c0f907f;
            if (i19 >= ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).f126862f) {
                break;
            }
            i27 += com.p176xb6135e39.p283xc50a8b8b.k0.r(((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).h(i19));
            i19++;
        }
        int i28 = q17 + i27;
        if (!m171899x498dce8().isEmpty()) {
            i28 = i28 + 1 + com.p176xb6135e39.p283xc50a8b8b.k0.l(i27);
        }
        this.f77319x4b3340f = i27;
        int mo20593x9d9c349b = i28 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    /* renamed from: getStartTime */
    public double m171896x8082fb99() {
        return this.f77318xa19bbff0;
    }

    /* renamed from: getSubTaskId */
    public int m171897xe91b5d2a(int i17) {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f77320x4c0f907f).h(i17);
    }

    /* renamed from: getSubTaskIdCount */
    public int m171898x8e06ae05() {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f77320x4c0f907f).f126862f;
    }

    /* renamed from: getSubTaskIdList */
    public java.util.List<java.lang.Integer> m171899x498dce8() {
        return this.f77320x4c0f907f;
    }

    /* renamed from: getTaskId */
    public int m171900x30961476() {
        return this.f77321xa45f3edf;
    }

    /* renamed from: getTaskName */
    public java.lang.String m171901x63651726() {
        java.lang.Object obj = this.f77322x9d05caf;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
        this.f77322x9d05caf = r17;
        return r17;
    }

    /* renamed from: getTaskNameBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y m171902x77e440e5() {
        java.lang.Object obj = this.f77322x9d05caf;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f77322x9d05caf = h17;
        return h17;
    }

    /* renamed from: getTaskTag */
    public java.lang.String m171903xe22ca39f() {
        java.lang.Object obj = this.f77323xe78d932a;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
        this.f77323xe78d932a = r17;
        return r17;
    }

    /* renamed from: getTaskTagBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y m171904xd26e980c() {
        java.lang.Object obj = this.f77323xe78d932a;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f77323xe78d932a = h17;
        return h17;
    }

    /* renamed from: getTaskTraits */
    public long m171905x29a33200() {
        return this.f77324x30ecc795;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m171878xc1a58b65().hashCode()) * 37) + 1) * 53) + m171900x30961476()) * 37) + 2) * 53) + m171901x63651726().hashCode()) * 37) + 3) * 53) + m171903xe22ca39f().hashCode()) * 37) + 4) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(java.lang.Double.doubleToLongBits(m171896x8082fb99()))) * 37) + 5) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(java.lang.Double.doubleToLongBits(m171894x51e8b0a()))) * 37) + 6) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(m171905x29a33200());
        if (m171898x8e06ae05() > 0) {
            hashCode = (((hashCode * 37) + 10) * 53) + m171899x498dce8().hashCode();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = vg.i.f517976b;
        j6Var.c(vg.d.class, vg.c.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f77317xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f77317xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new vg.d();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        mo20593x9d9c349b();
        int i17 = this.f77321xa45f3edf;
        if (i17 != 0) {
            k0Var.R(1, i17);
        }
        if (!m171902x77e440e5().m20957x7aab3243()) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 2, this.f77322x9d05caf);
        }
        if (!m171904xd26e980c().m20957x7aab3243()) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 3, this.f77323xe78d932a);
        }
        double d17 = this.f77318xa19bbff0;
        if (d17 != 0.0d) {
            k0Var.B(4, d17);
        }
        double d18 = this.f77316x9f45654b;
        if (d18 != 0.0d) {
            k0Var.B(5, d18);
        }
        long j17 = this.f77324x30ecc795;
        if (j17 != 0) {
            k0Var.T(6, j17);
        }
        if (m171899x498dce8().size() > 0) {
            k0Var.S(82);
            k0Var.S(this.f77319x4b3340f);
        }
        int i18 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.t6 t6Var = this.f77320x4c0f907f;
            if (i18 >= ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).f126862f) {
                this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
                return;
            } else {
                k0Var.S(((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).h(i18));
                i18++;
            }
        }
    }

    /* renamed from: newBuilder */
    public static vg.c m171880x3136c9db(vg.d dVar) {
        vg.c mo20599xaaa148a0 = f77306xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(dVar);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static vg.d m171890x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (vg.d) f77308x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private d(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f77319x4b3340f = -1;
        this.f77317xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static vg.d m171882x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (vg.d) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f77308x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static vg.d m171885x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (vg.d) f77308x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public vg.d mo20559x786693c3() {
        return f77306xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public vg.c mo20599xaaa148a0() {
        if (this == f77306xb3e828f3) {
            return new vg.c(null);
        }
        vg.c cVar = new vg.c(null);
        cVar.e(this);
        return cVar;
    }

    /* renamed from: parseFrom */
    public static vg.d m171886x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (vg.d) f77308x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public vg.c mo20596xab31548() {
        return m171879x3136c9db();
    }

    /* renamed from: parseFrom */
    public static vg.d m171891x92b714fd(byte[] bArr) {
        return (vg.d) f77308x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public vg.c mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new vg.c(r5Var, null);
    }

    private d() {
        this.f77319x4b3340f = -1;
        this.f77317xf54bb1a0 = (byte) -1;
        this.f77322x9d05caf = "";
        this.f77323xe78d932a = "";
        this.f77320x4c0f907f = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
    }

    /* renamed from: parseFrom */
    public static vg.d m171892x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (vg.d) f77308x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static vg.d m171887x92b714fd(java.io.InputStream inputStream) {
        return (vg.d) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f77308x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static vg.d m171888x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (vg.d) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f77308x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static vg.d m171883x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (vg.d) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f77308x8c3e301f, d0Var);
    }

    private d(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
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
                        if (F == 8) {
                            this.f77321xa45f3edf = d0Var.G();
                        } else if (F == 18) {
                            this.f77322x9d05caf = d0Var.E();
                        } else if (F == 26) {
                            this.f77323xe78d932a = d0Var.E();
                        } else if (F == 33) {
                            this.f77318xa19bbff0 = d0Var.n();
                        } else if (F == 41) {
                            this.f77316x9f45654b = d0Var.n();
                        } else if (F == 48) {
                            this.f77324x30ecc795 = d0Var.H();
                        } else if (F == 80) {
                            if (!(z18 & true)) {
                                this.f77320x4c0f907f = com.p176xb6135e39.p283xc50a8b8b.l6.m20759x981d076d();
                                z18 |= true;
                            }
                            ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f77320x4c0f907f).e(d0Var.G());
                        } else if (F != 82) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            int k17 = d0Var.k(d0Var.x());
                            if (!(z18 & true) && d0Var.d() > 0) {
                                this.f77320x4c0f907f = com.p176xb6135e39.p283xc50a8b8b.l6.m20759x981d076d();
                                z18 |= true;
                            }
                            while (d0Var.d() > 0) {
                                ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f77320x4c0f907f).e(d0Var.G());
                            }
                            d0Var.j(k17);
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
                if (z18 & true) {
                    ((com.p176xb6135e39.p283xc50a8b8b.h) this.f77320x4c0f907f).f126678d = false;
                }
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }

    /* renamed from: parseFrom */
    public static vg.d m171884x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (vg.d) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f77308x8c3e301f, d0Var, t4Var);
    }
}
