package com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8;

/* loaded from: classes16.dex */
public final class s extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: OFFSETHEIGHT_FIELD_NUMBER */
    public static final int f28948x77e4d6f3 = 1;

    /* renamed from: OFFSETTOPFROMLISTSTART_FIELD_NUMBER */
    public static final int f28949xc278b5b5 = 3;

    /* renamed from: OFFSETTOP_FIELD_NUMBER */
    public static final int f28950x72382fab = 2;

    /* renamed from: serialVersionUID */
    private static final long f28952x3a3ed56c = 0;

    /* renamed from: bitField0_ */
    private int f28953x961a12dc;

    /* renamed from: memoizedIsInitialized */
    private byte f28954xf54bb1a0;

    /* renamed from: offsetHeight_ */
    private int f28955xafcf0c05;

    /* renamed from: offsetTopFromListStart_ */
    private int f28956xe4ad2627;

    /* renamed from: offsetTop_ */
    private int f28957xd924c0dd;

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s f28947xb3e828f3 = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s();

    /* renamed from: PARSER */
    @java.lang.Deprecated
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f28951x8c3e301f = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.q();

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s m45613x7c90cfc0() {
        return f28947xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m45614xc1a58b65() {
        return com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149570i;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.r m45615x3136c9db() {
        return f28947xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s m45617x4a829d50(java.io.InputStream inputStream) {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f28951x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s m45625x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s) f28951x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m45629xc4ab3c1f() {
        return f28951x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s sVar = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s) obj;
        if (m45634x52c1b754() != sVar.m45634x52c1b754()) {
            return false;
        }
        if ((m45634x52c1b754() && m45630x6ee07a10() != sVar.m45630x6ee07a10()) || m45635x4a651248() != sVar.m45635x4a651248()) {
            return false;
        }
        if ((!m45635x4a651248() || m45631x8a8fa90c() == sVar.m45631x8a8fa90c()) && m45636x579f072() == sVar.m45636x579f072()) {
            return (!m45636x579f072() || m45632xbb81782e() == sVar.m45632xbb81782e()) && this.f7874x4f0c37a3.m20941xb2c87fbf(sVar.f7874x4f0c37a3);
        }
        return false;
    }

    /* renamed from: getOffsetHeight */
    public int m45630x6ee07a10() {
        return this.f28955xafcf0c05;
    }

    /* renamed from: getOffsetTop */
    public int m45631x8a8fa90c() {
        return this.f28957xd924c0dd;
    }

    /* renamed from: getOffsetTopFromListStart */
    public int m45632xbb81782e() {
        return this.f28956xe4ad2627;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m45633x7ea0ace() {
        return f28951x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int k17 = (this.f28953x961a12dc & 1) != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.k(1, this.f28955xafcf0c05) : 0;
        if ((this.f28953x961a12dc & 2) != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(2, this.f28957xd924c0dd);
        }
        if ((this.f28953x961a12dc & 4) != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(3, this.f28956xe4ad2627);
        }
        int mo20593x9d9c349b = k17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    /* renamed from: hasOffsetHeight */
    public boolean m45634x52c1b754() {
        return (this.f28953x961a12dc & 1) != 0;
    }

    /* renamed from: hasOffsetTop */
    public boolean m45635x4a651248() {
        return (this.f28953x961a12dc & 2) != 0;
    }

    /* renamed from: hasOffsetTopFromListStart */
    public boolean m45636x579f072() {
        return (this.f28953x961a12dc & 4) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m45614xc1a58b65().hashCode();
        if (m45634x52c1b754()) {
            hashCode = (((hashCode * 37) + 1) * 53) + m45630x6ee07a10();
        }
        if (m45635x4a651248()) {
            hashCode = (((hashCode * 37) + 2) * 53) + m45631x8a8fa90c();
        }
        if (m45636x579f072()) {
            hashCode = (((hashCode * 37) + 3) * 53) + m45632xbb81782e();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149571j;
        j6Var.c(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s.class, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.r.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f28954xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!m45634x52c1b754()) {
            this.f28954xf54bb1a0 = (byte) 0;
            return false;
        }
        if (m45635x4a651248()) {
            this.f28954xf54bb1a0 = (byte) 1;
            return true;
        }
        this.f28954xf54bb1a0 = (byte) 0;
        return false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f28953x961a12dc & 1) != 0) {
            k0Var.H(1, this.f28955xafcf0c05);
        }
        if ((this.f28953x961a12dc & 2) != 0) {
            k0Var.H(2, this.f28957xd924c0dd);
        }
        if ((this.f28953x961a12dc & 4) != 0) {
            k0Var.H(3, this.f28956xe4ad2627);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.r m45616x3136c9db(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s sVar) {
        return f28947xb3e828f3.mo20599xaaa148a0().m45600x60f45402(sVar);
    }

    /* renamed from: parseFrom */
    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s m45626x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s) f28951x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private s(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f28954xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s m45618x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f28951x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s m45621x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s) f28951x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s mo20559x786693c3() {
        return f28947xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.r mo20599xaaa148a0() {
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g gVar = null;
        return this == f28947xb3e828f3 ? new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.r() : new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.r().m45600x60f45402(this);
    }

    /* renamed from: parseFrom */
    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s m45622x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s) f28951x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.r mo20596xab31548() {
        return m45615x3136c9db();
    }

    private s() {
        this.f28954xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseFrom */
    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s m45627x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s) f28951x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.r mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.r(r5Var);
    }

    /* renamed from: parseFrom */
    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s m45628x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s) f28951x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    private s(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
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
                            this.f28953x961a12dc |= 1;
                            this.f28955xafcf0c05 = d0Var.t();
                        } else if (F == 16) {
                            this.f28953x961a12dc |= 2;
                            this.f28957xd924c0dd = d0Var.t();
                        } else if (F != 24) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f28953x961a12dc |= 4;
                            this.f28956xe4ad2627 = d0Var.t();
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
    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s m45623x92b714fd(java.io.InputStream inputStream) {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f28951x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s m45624x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f28951x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s m45619x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f28951x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s m45620x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f28951x8c3e301f, d0Var, t4Var);
    }
}
