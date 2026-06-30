package kg;

/* loaded from: classes16.dex */
public final class l0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.m0 {

    /* renamed from: ASSET_FIELD_NUMBER */
    public static final int f72537x3903e35d = 1;

    /* renamed from: CONTENT_CROP_RECT_FIELD_NUMBER */
    public static final int f72538x478780 = 4;

    /* renamed from: CONTENT_SPATIAL_DESC_FIELD_NUMBER */
    public static final int f72539xb7c44e3b = 3;

    /* renamed from: DURATION_FIELD_NUMBER */
    public static final int f72541x134b3719 = 2;

    /* renamed from: serialVersionUID */
    private static final long f72543x3a3ed56c = 0;

    /* renamed from: asset_ */
    private kg.f f72544xac10736f;

    /* renamed from: contentCropRect_ */
    private kg.f1 f72545xcaae35d2;

    /* renamed from: contentSpatialDesc_ */
    private kg.d0 f72546xfbc56463;

    /* renamed from: duration_ */
    private kg.w1 f72547x9f45654b;

    /* renamed from: memoizedIsInitialized */
    private byte f72548xf54bb1a0;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.l0 f72540xb3e828f3 = new kg.l0();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72542x8c3e301f = new kg.j0();

    public /* synthetic */ l0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, kg.b bVar) {
        this(d0Var, t4Var);
    }

    /* renamed from: access$11000 */
    public static /* synthetic */ boolean m142931x23f310d0() {
        return com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
    }

    /* renamed from: access$11202 */
    public static /* synthetic */ kg.f m142932x23f31854(kg.l0 l0Var, kg.f fVar) {
        l0Var.f72544xac10736f = fVar;
        return fVar;
    }

    /* renamed from: access$11302 */
    public static /* synthetic */ kg.w1 m142933x23f31c15(kg.l0 l0Var, kg.w1 w1Var) {
        l0Var.f72547x9f45654b = w1Var;
        return w1Var;
    }

    /* renamed from: access$11402 */
    public static /* synthetic */ kg.d0 m142934x23f31fd6(kg.l0 l0Var, kg.d0 d0Var) {
        l0Var.f72546xfbc56463 = d0Var;
        return d0Var;
    }

    /* renamed from: access$11502 */
    public static /* synthetic */ kg.f1 m142935x23f32397(kg.l0 l0Var, kg.f1 f1Var) {
        l0Var.f72545xcaae35d2 = f1Var;
        return f1Var;
    }

    /* renamed from: access$11600 */
    public static /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.wa m142936x23f32756(kg.l0 l0Var) {
        return l0Var.f7874x4f0c37a3;
    }

    /* renamed from: access$11700 */
    public static /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.e9 m142937x23f32b17() {
        return f72542x8c3e301f;
    }

    /* renamed from: getDefaultInstance */
    public static kg.l0 m142938x7c90cfc0() {
        return f72540xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m142939xc1a58b65() {
        return kg.q2.f389150s;
    }

    /* renamed from: newBuilder */
    public static kg.k0 m142940x3136c9db() {
        return f72540xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.l0 m142942x4a829d50(java.io.InputStream inputStream) {
        return (kg.l0) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72542x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.l0 m142950x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.l0) f72542x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m142954xc4ab3c1f() {
        return f72542x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.l0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.l0 l0Var = (kg.l0) obj;
        if (m142964x6bdf876() != l0Var.m142964x6bdf876()) {
            return false;
        }
        if ((m142964x6bdf876() && !m142955x742a913a().mo20583xb2c87fbf(l0Var.m142955x742a913a())) || m142967x34990a4e() != l0Var.m142967x34990a4e()) {
            return false;
        }
        if ((m142967x34990a4e() && !m142961x51e8b0a().mo20583xb2c87fbf(l0Var.m142961x51e8b0a())) || m142966x2f7fa7b6() != l0Var.m142966x2f7fa7b6()) {
            return false;
        }
        if ((!m142966x2f7fa7b6() || m142959x8f186d72().mo20583xb2c87fbf(l0Var.m142959x8f186d72())) && m142965x93862e33() == l0Var.m142965x93862e33()) {
            return (!m142965x93862e33() || m142957xf32da1f7().mo20583xb2c87fbf(l0Var.m142957xf32da1f7())) && this.f7874x4f0c37a3.m20941xb2c87fbf(l0Var.f7874x4f0c37a3);
        }
        return false;
    }

    /* renamed from: getAsset */
    public kg.f m142955x742a913a() {
        kg.f fVar = this.f72544xac10736f;
        return fVar == null ? kg.f.m142704x7c90cfc0() : fVar;
    }

    /* renamed from: getAssetOrBuilder */
    public kg.g m142956x12cf41e() {
        return m142955x742a913a();
    }

    /* renamed from: getContentCropRect */
    public kg.f1 m142957xf32da1f7() {
        kg.f1 f1Var = this.f72545xcaae35d2;
        return f1Var == null ? kg.f1.m142733x7c90cfc0() : f1Var;
    }

    /* renamed from: getContentCropRectOrBuilder */
    public kg.g1 m142958xa6d46801() {
        return m142957xf32da1f7();
    }

    /* renamed from: getContentSpatialDesc */
    public kg.d0 m142959x8f186d72() {
        kg.d0 d0Var = this.f72546xfbc56463;
        return d0Var == null ? kg.d0.m142664x7c90cfc0() : d0Var;
    }

    /* renamed from: getContentSpatialDescOrBuilder */
    public kg.e0 m142960x6e2756e6() {
        return m142959x8f186d72();
    }

    /* renamed from: getDuration */
    public kg.w1 m142961x51e8b0a() {
        kg.w1 w1Var = this.f72547x9f45654b;
        return w1Var == null ? kg.w1.m143257x7c90cfc0() : w1Var;
    }

    /* renamed from: getDurationOrBuilder */
    public kg.x1 m142962xbc4d044e() {
        return m142961x51e8b0a();
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m142963x7ea0ace() {
        return f72542x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.f72544xac10736f != null ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.n(1, m142955x742a913a()) : 0;
        if (this.f72547x9f45654b != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, m142961x51e8b0a());
        }
        if (this.f72546xfbc56463 != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(3, m142959x8f186d72());
        }
        if (this.f72545xcaae35d2 != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, m142957xf32da1f7());
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

    /* renamed from: hasAsset */
    public boolean m142964x6bdf876() {
        return this.f72544xac10736f != null;
    }

    /* renamed from: hasContentCropRect */
    public boolean m142965x93862e33() {
        return this.f72545xcaae35d2 != null;
    }

    /* renamed from: hasContentSpatialDesc */
    public boolean m142966x2f7fa7b6() {
        return this.f72546xfbc56463 != null;
    }

    /* renamed from: hasDuration */
    public boolean m142967x34990a4e() {
        return this.f72547x9f45654b != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m142939xc1a58b65().hashCode();
        if (m142964x6bdf876()) {
            hashCode = (((hashCode * 37) + 1) * 53) + m142955x742a913a().mo20587x8cdac1b();
        }
        if (m142967x34990a4e()) {
            hashCode = (((hashCode * 37) + 2) * 53) + m142961x51e8b0a().mo20587x8cdac1b();
        }
        if (m142966x2f7fa7b6()) {
            hashCode = (((hashCode * 37) + 3) * 53) + m142959x8f186d72().mo20587x8cdac1b();
        }
        if (m142965x93862e33()) {
            hashCode = (((hashCode * 37) + 4) * 53) + m142957xf32da1f7().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.f389151t;
        j6Var.c(kg.l0.class, kg.k0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72548xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72548xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.l0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f72544xac10736f != null) {
            k0Var.J(1, m142955x742a913a());
        }
        if (this.f72547x9f45654b != null) {
            k0Var.J(2, m142961x51e8b0a());
        }
        if (this.f72546xfbc56463 != null) {
            k0Var.J(3, m142959x8f186d72());
        }
        if (this.f72545xcaae35d2 != null) {
            k0Var.J(4, m142957xf32da1f7());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    public /* synthetic */ l0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, kg.b bVar) {
        this(q5Var);
    }

    /* renamed from: newBuilder */
    public static kg.k0 m142941x3136c9db(kg.l0 l0Var) {
        kg.k0 mo20599xaaa148a0 = f72540xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(l0Var);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.l0 m142951x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.l0) f72542x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72548xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.l0 m142943x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.l0) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72542x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.l0 m142946x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.l0) f72542x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.l0 mo20559x786693c3() {
        return f72540xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.k0 mo20599xaaa148a0() {
        if (this == f72540xb3e828f3) {
            return new kg.k0(null);
        }
        kg.k0 k0Var = new kg.k0(null);
        k0Var.e(this);
        return k0Var;
    }

    /* renamed from: parseFrom */
    public static kg.l0 m142947x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.l0) f72542x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.k0 mo20596xab31548() {
        return m142940x3136c9db();
    }

    private l0() {
        this.f72548xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseFrom */
    public static kg.l0 m142952x92b714fd(byte[] bArr) {
        return (kg.l0) f72542x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.k0 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.k0(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.l0 m142953x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.l0) f72542x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
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
                                kg.f fVar = this.f72544xac10736f;
                                kg.d mo20599xaaa148a0 = fVar != null ? fVar.mo20599xaaa148a0() : null;
                                kg.f fVar2 = (kg.f) d0Var.v(kg.f.m142720xc4ab3c1f(), t4Var);
                                this.f72544xac10736f = fVar2;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.e(fVar2);
                                    this.f72544xac10736f = mo20599xaaa148a0.mo20557x85702333();
                                }
                            } else if (F == 18) {
                                kg.w1 w1Var = this.f72547x9f45654b;
                                kg.v1 mo20599xaaa148a02 = w1Var != null ? w1Var.mo20599xaaa148a0() : null;
                                kg.w1 w1Var2 = (kg.w1) d0Var.v(kg.w1.m143273xc4ab3c1f(), t4Var);
                                this.f72547x9f45654b = w1Var2;
                                if (mo20599xaaa148a02 != null) {
                                    mo20599xaaa148a02.e(w1Var2);
                                    this.f72547x9f45654b = mo20599xaaa148a02.mo20557x85702333();
                                }
                            } else if (F == 26) {
                                kg.d0 d0Var2 = this.f72546xfbc56463;
                                kg.c0 mo20599xaaa148a03 = d0Var2 != null ? d0Var2.mo20599xaaa148a0() : null;
                                kg.d0 d0Var3 = (kg.d0) d0Var.v(kg.d0.m142680xc4ab3c1f(), t4Var);
                                this.f72546xfbc56463 = d0Var3;
                                if (mo20599xaaa148a03 != null) {
                                    mo20599xaaa148a03.e(d0Var3);
                                    this.f72546xfbc56463 = mo20599xaaa148a03.mo20557x85702333();
                                }
                            } else if (F != 34) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                kg.f1 f1Var = this.f72545xcaae35d2;
                                kg.e1 mo20599xaaa148a04 = f1Var != null ? f1Var.mo20599xaaa148a0() : null;
                                kg.f1 f1Var2 = (kg.f1) d0Var.v(kg.f1.m142749xc4ab3c1f(), t4Var);
                                this.f72545xcaae35d2 = f1Var2;
                                if (mo20599xaaa148a04 != null) {
                                    mo20599xaaa148a04.e(f1Var2);
                                    this.f72545xcaae35d2 = mo20599xaaa148a04.mo20557x85702333();
                                }
                            }
                        }
                        z17 = true;
                    } catch (java.io.IOException e17) {
                        com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e17);
                        y6Var.f127272d = this;
                        throw y6Var;
                    }
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e18) {
                    e18.f127272d = this;
                    throw e18;
                }
            } finally {
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }

    /* renamed from: parseFrom */
    public static kg.l0 m142948x92b714fd(java.io.InputStream inputStream) {
        return (kg.l0) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72542x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.l0 m142949x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.l0) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72542x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.l0 m142944x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.l0) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72542x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.l0 m142945x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.l0) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72542x8c3e301f, d0Var, t4Var);
    }
}
