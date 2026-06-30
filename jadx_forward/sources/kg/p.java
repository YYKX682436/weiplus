package kg;

/* loaded from: classes16.dex */
public final class p extends com.p176xb6135e39.p283xc50a8b8b.l6 implements kg.q {

    /* renamed from: AUDIO_CLIP_FIELD_NUMBER */
    public static final int f72577x4ad25694 = 3;

    /* renamed from: IMAGE_CLIP_FIELD_NUMBER */
    public static final int f72579x6a7aecd9 = 1;

    /* renamed from: VIDEO_CLIP_FIELD_NUMBER */
    public static final int f72581x7417cff9 = 2;

    /* renamed from: serialVersionUID */
    private static final long f72582x3a3ed56c = 0;

    /* renamed from: clipCase_ */
    private int f72583x9ee0e9bf;

    /* renamed from: clip_ */
    private java.lang.Object f72584x5a5c70f;

    /* renamed from: memoizedIsInitialized */
    private byte f72585xf54bb1a0;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.p f72578xb3e828f3 = new kg.p();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72580x8c3e301f = new kg.m();

    /* renamed from: getDefaultInstance */
    public static kg.p m143062x7c90cfc0() {
        return f72578xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m143063xc1a58b65() {
        return kg.q2.f389156y;
    }

    /* renamed from: newBuilder */
    public static kg.n m143064x3136c9db() {
        return f72578xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.p m143066x4a829d50(java.io.InputStream inputStream) {
        return (kg.p) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72580x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.p m143074x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.p) f72580x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m143078xc4ab3c1f() {
        return f72580x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.p)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.p pVar = (kg.p) obj;
        if (!m143081xb286a816().equals(pVar.m143081xb286a816())) {
            return false;
        }
        int i17 = this.f72583x9ee0e9bf;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 == 3 && !m143079xa9d4990().mo20583xb2c87fbf(pVar.m143079xa9d4990())) {
                    return false;
                }
            } else if (!m143085x4ed8e7b5().mo20583xb2c87fbf(pVar.m143085x4ed8e7b5())) {
                return false;
            }
        } else if (!m143082xcb0e0c95().mo20583xb2c87fbf(pVar.m143082xcb0e0c95())) {
            return false;
        }
        return this.f7874x4f0c37a3.m20941xb2c87fbf(pVar.f7874x4f0c37a3);
    }

    /* renamed from: getAudioClip */
    public kg.j m143079xa9d4990() {
        return this.f72583x9ee0e9bf == 3 ? (kg.j) this.f72584x5a5c70f : kg.j.m142827x7c90cfc0();
    }

    /* renamed from: getAudioClipOrBuilder */
    public kg.k m143080x64f53c88() {
        return this.f72583x9ee0e9bf == 3 ? (kg.j) this.f72584x5a5c70f : kg.j.m142827x7c90cfc0();
    }

    /* renamed from: getClipCase */
    public kg.o m143081xb286a816() {
        int i17 = this.f72583x9ee0e9bf;
        if (i17 == 0) {
            return kg.o.CLIP_NOT_SET;
        }
        if (i17 == 1) {
            return kg.o.IMAGE_CLIP;
        }
        if (i17 == 2) {
            return kg.o.VIDEO_CLIP;
        }
        if (i17 != 3) {
            return null;
        }
        return kg.o.AUDIO_CLIP;
    }

    /* renamed from: getImageClip */
    public kg.l0 m143082xcb0e0c95() {
        return this.f72583x9ee0e9bf == 1 ? (kg.l0) this.f72584x5a5c70f : kg.l0.m142938x7c90cfc0();
    }

    /* renamed from: getImageClipOrBuilder */
    public kg.m0 m143083xd91f0f23() {
        return this.f72583x9ee0e9bf == 1 ? (kg.l0) this.f72584x5a5c70f : kg.l0.m142938x7c90cfc0();
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m143084x7ea0ace() {
        return f72580x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.f72583x9ee0e9bf == 1 ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.n(1, (kg.l0) this.f72584x5a5c70f) : 0;
        if (this.f72583x9ee0e9bf == 2) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, (kg.o2) this.f72584x5a5c70f);
        }
        if (this.f72583x9ee0e9bf == 3) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(3, (kg.j) this.f72584x5a5c70f);
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

    /* renamed from: getVideoClip */
    public kg.o2 m143085x4ed8e7b5() {
        return this.f72583x9ee0e9bf == 2 ? (kg.o2) this.f72584x5a5c70f : kg.o2.m143026x7c90cfc0();
    }

    /* renamed from: getVideoClipOrBuilder */
    public kg.p2 m143086x5588b803() {
        return this.f72583x9ee0e9bf == 2 ? (kg.o2) this.f72584x5a5c70f : kg.o2.m143026x7c90cfc0();
    }

    /* renamed from: hasAudioClip */
    public boolean m143087xca72b2cc() {
        return this.f72583x9ee0e9bf == 3;
    }

    /* renamed from: hasImageClip */
    public boolean m143088x8ae375d1() {
        return this.f72583x9ee0e9bf == 1;
    }

    /* renamed from: hasVideoClip */
    public boolean m143089xeae50f1() {
        return this.f72583x9ee0e9bf == 2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17;
        int mo20587x8cdac1b;
        int i18 = this.f7868x8a222005;
        if (i18 != 0) {
            return i18;
        }
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m143063xc1a58b65().hashCode();
        int i19 = this.f72583x9ee0e9bf;
        if (i19 == 1) {
            i17 = ((hashCode * 37) + 1) * 53;
            mo20587x8cdac1b = m143082xcb0e0c95().mo20587x8cdac1b();
        } else {
            if (i19 != 2) {
                if (i19 == 3) {
                    i17 = ((hashCode * 37) + 3) * 53;
                    mo20587x8cdac1b = m143079xa9d4990().mo20587x8cdac1b();
                }
                int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
                this.f7868x8a222005 = m20942x8cdac1b;
                return m20942x8cdac1b;
            }
            i17 = ((hashCode * 37) + 2) * 53;
            mo20587x8cdac1b = m143085x4ed8e7b5().mo20587x8cdac1b();
        }
        hashCode = i17 + mo20587x8cdac1b;
        int m20942x8cdac1b2 = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b2;
        return m20942x8cdac1b2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.f389157z;
        j6Var.c(kg.p.class, kg.n.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72585xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72585xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.p();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f72583x9ee0e9bf == 1) {
            k0Var.J(1, (kg.l0) this.f72584x5a5c70f);
        }
        if (this.f72583x9ee0e9bf == 2) {
            k0Var.J(2, (kg.o2) this.f72584x5a5c70f);
        }
        if (this.f72583x9ee0e9bf == 3) {
            k0Var.J(3, (kg.j) this.f72584x5a5c70f);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static kg.n m143065x3136c9db(kg.p pVar) {
        kg.n mo20599xaaa148a0 = f72578xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.e(pVar);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.p m143075x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.p) f72580x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private p(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72583x9ee0e9bf = 0;
        this.f72585xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.p m143067x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.p) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72580x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.p m143070x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.p) f72580x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.p mo20559x786693c3() {
        return f72578xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.n mo20599xaaa148a0() {
        if (this == f72578xb3e828f3) {
            return new kg.n(null);
        }
        kg.n nVar = new kg.n(null);
        nVar.e(this);
        return nVar;
    }

    /* renamed from: parseFrom */
    public static kg.p m143071x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.p) f72580x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.n mo20596xab31548() {
        return m143064x3136c9db();
    }

    /* renamed from: parseFrom */
    public static kg.p m143076x92b714fd(byte[] bArr) {
        return (kg.p) f72580x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.n mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.n(r5Var, null);
    }

    private p() {
        this.f72583x9ee0e9bf = 0;
        this.f72585xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseFrom */
    public static kg.p m143077x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.p) f72580x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.p m143072x92b714fd(java.io.InputStream inputStream) {
        return (kg.p) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72580x8c3e301f, inputStream);
    }

    private p(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
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
                                kg.k0 mo20599xaaa148a0 = this.f72583x9ee0e9bf == 1 ? ((kg.l0) this.f72584x5a5c70f).mo20599xaaa148a0() : null;
                                com.p176xb6135e39.p283xc50a8b8b.o8 v17 = d0Var.v(kg.l0.m142954xc4ab3c1f(), t4Var);
                                this.f72584x5a5c70f = v17;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.e((kg.l0) v17);
                                    this.f72584x5a5c70f = mo20599xaaa148a0.mo20557x85702333();
                                }
                                this.f72583x9ee0e9bf = 1;
                            } else if (F == 18) {
                                kg.n2 mo20599xaaa148a02 = this.f72583x9ee0e9bf == 2 ? ((kg.o2) this.f72584x5a5c70f).mo20599xaaa148a0() : null;
                                com.p176xb6135e39.p283xc50a8b8b.o8 v18 = d0Var.v(kg.o2.m143042xc4ab3c1f(), t4Var);
                                this.f72584x5a5c70f = v18;
                                if (mo20599xaaa148a02 != null) {
                                    mo20599xaaa148a02.e((kg.o2) v18);
                                    this.f72584x5a5c70f = mo20599xaaa148a02.mo20557x85702333();
                                }
                                this.f72583x9ee0e9bf = 2;
                            } else if (F != 26) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                kg.i mo20599xaaa148a03 = this.f72583x9ee0e9bf == 3 ? ((kg.j) this.f72584x5a5c70f).mo20599xaaa148a0() : null;
                                com.p176xb6135e39.p283xc50a8b8b.o8 v19 = d0Var.v(kg.j.m142843xc4ab3c1f(), t4Var);
                                this.f72584x5a5c70f = v19;
                                if (mo20599xaaa148a03 != null) {
                                    mo20599xaaa148a03.e((kg.j) v19);
                                    this.f72584x5a5c70f = mo20599xaaa148a03.mo20557x85702333();
                                }
                                this.f72583x9ee0e9bf = 3;
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
    public static kg.p m143073x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.p) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72580x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.p m143068x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.p) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72580x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.p m143069x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.p) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72580x8c3e301f, d0Var, t4Var);
    }
}
