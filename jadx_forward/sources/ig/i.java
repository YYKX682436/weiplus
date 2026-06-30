package ig;

/* loaded from: classes16.dex */
public final class i extends com.p176xb6135e39.p283xc50a8b8b.l6 implements ig.j {

    /* renamed from: ERROR_CODE_FIELD_NUMBER */
    public static final int f70014x961400c9 = 2;

    /* renamed from: ERROR_MESSAGE_FIELD_NUMBER */
    public static final int f70015xf9c9099d = 3;

    /* renamed from: EXPANDS_FIELD_NUMBER */
    public static final int f70016x8f3c5fd4 = 6;

    /* renamed from: KEYS_FIELD_NUMBER */
    public static final int f70017x97f6eab9 = 4;

    /* renamed from: NAME_FIELD_NUMBER */
    public static final int f70018x73430b82 = 1;

    /* renamed from: TIME_STAMP_FIELD_NUMBER */
    public static final int f70020x655a01c = 7;

    /* renamed from: VALUES_FIELD_NUMBER */
    public static final int f70021xfce19a4b = 5;

    /* renamed from: serialVersionUID */
    private static final long f70022x3a3ed56c = 0;

    /* renamed from: bitField0_ */
    private int f70023x961a12dc;

    /* renamed from: errorCode_ */
    private volatile java.lang.Object f70024x5ff952ea;

    /* renamed from: errorMessage_ */
    private volatile java.lang.Object f70025xaf45af60;

    /* renamed from: expands_ */
    private com.p176xb6135e39.p283xc50a8b8b.g7 f70026x8c6bae66;

    /* renamed from: keys_ */
    private com.p176xb6135e39.p283xc50a8b8b.g7 f70027x61390eb;

    /* renamed from: name_ */
    private volatile java.lang.Object f70028x63bd734;

    /* renamed from: timeStamp_ */
    private long f70029x2f40e629;

    /* renamed from: values_ */
    private com.p176xb6135e39.p283xc50a8b8b.g7 f70030xdce077d;

    /* renamed from: DEFAULT_INSTANCE */
    private static final ig.i f70013xb3e828f3 = new ig.i();

    /* renamed from: PARSER */
    @java.lang.Deprecated
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f70019x8c3e301f = new ig.g();

    public /* synthetic */ i(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, ig.b bVar) {
        this(q5Var);
    }

    /* renamed from: getDefaultInstance */
    public static ig.i m135587x7c90cfc0() {
        return f70013xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m135588xc1a58b65() {
        return ig.y0.f372819a;
    }

    /* renamed from: newBuilder */
    public static ig.h m135589x3136c9db() {
        return f70013xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.i m135591x4a829d50(java.io.InputStream inputStream) {
        return (ig.i) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f70019x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.i m135599x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (ig.i) f70019x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m135603xc4ab3c1f() {
        return f70019x8c3e301f;
    }

    @Override // ig.j
    /* renamed from: getErrorCode */
    public java.lang.String mo135542x130a215f() {
        java.lang.Object obj = this.f70024x5ff952ea;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70024x5ff952ea = r17;
        }
        return r17;
    }

    @Override // ig.j
    /* renamed from: getErrorCodeBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135543x3919b24c() {
        java.lang.Object obj = this.f70024x5ff952ea;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70024x5ff952ea = h17;
        return h17;
    }

    @Override // ig.j
    /* renamed from: getErrorMessage */
    public java.lang.String mo135544xa8aa7f55() {
        java.lang.Object obj = this.f70025xaf45af60;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70025xaf45af60 = r17;
        }
        return r17;
    }

    @Override // ig.j
    /* renamed from: getErrorMessageBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135545x7df39e16() {
        java.lang.Object obj = this.f70025xaf45af60;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70025xaf45af60 = h17;
        return h17;
    }

    @Override // ig.j
    /* renamed from: getExpands */
    public java.lang.String mo135546xefc030e3(int i17) {
        return (java.lang.String) this.f70026x8c6bae66.get(i17);
    }

    @Override // ig.j
    /* renamed from: getExpandsBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135547x5814b548(int i17) {
        return this.f70026x8c6bae66.f(i17);
    }

    @Override // ig.j
    /* renamed from: getExpandsCount */
    public int mo135548x581e45ec() {
        return this.f70026x8c6bae66.size();
    }

    @Override // ig.j
    /* renamed from: getKeys */
    public java.lang.String mo135550xfb81966a(int i17) {
        return (java.lang.String) this.f70027x61390eb.get(i17);
    }

    @Override // ig.j
    /* renamed from: getKeysBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135551xbcc8ac21(int i17) {
        return this.f70027x61390eb.f(i17);
    }

    @Override // ig.j
    /* renamed from: getKeysCount */
    public int mo135552xbcd23cc5() {
        return this.f70027x61390eb.size();
    }

    @Override // ig.j
    /* renamed from: getName */
    public java.lang.String mo135554xfb82e301() {
        java.lang.Object obj = this.f70028x63bd734;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70028x63bd734 = r17;
        }
        return r17;
    }

    @Override // ig.j
    /* renamed from: getNameBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135555x4762a5ea() {
        java.lang.Object obj = this.f70028x63bd734;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70028x63bd734 = h17;
        return h17;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m135604x7ea0ace() {
        return f70019x8c3e301f;
    }

    @Override // ig.j
    /* renamed from: getTimeStamp */
    public long mo135556xf3aa40() {
        return this.f70029x2f40e629;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // ig.j
    /* renamed from: getValues */
    public java.lang.String mo135557x33fcc018(int i17) {
        return (java.lang.String) this.f70030xdce077d.get(i17);
    }

    @Override // ig.j
    /* renamed from: getValuesBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135558xb8ca5f33(int i17) {
        return this.f70030xdce077d.f(i17);
    }

    @Override // ig.j
    /* renamed from: getValuesCount */
    public int mo135559xb8d3efd7() {
        return this.f70030xdce077d.size();
    }

    @Override // ig.j
    /* renamed from: hasErrorCode */
    public boolean mo135561xd2df8a9b() {
        return (this.f70023x961a12dc & 2) != 0;
    }

    @Override // ig.j
    /* renamed from: hasErrorMessage */
    public boolean mo135562x8c8bbc99() {
        return (this.f70023x961a12dc & 4) != 0;
    }

    @Override // ig.j
    /* renamed from: hasName */
    public boolean mo135563x2987a445() {
        return (this.f70023x961a12dc & 1) != 0;
    }

    @Override // ig.j
    /* renamed from: hasTimeStamp */
    public boolean mo135564xc0c9137c() {
        return (this.f70023x961a12dc & 8) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372820b;
        j6Var.c(ig.i.class, ig.h.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new ig.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
    }

    /* renamed from: newBuilder */
    public static ig.h m135590x3136c9db(ig.i iVar) {
        return (ig.h) f70013xb3e828f3.mo20599xaaa148a0().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) iVar);
    }

    /* renamed from: parseFrom */
    public static ig.i m135600x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.i) f70019x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    @Override // ig.j
    /* renamed from: getExpandsList */
    public com.p176xb6135e39.p283xc50a8b8b.j9 mo135549xc0cb2c21() {
        return this.f70026x8c6bae66;
    }

    @Override // ig.j
    /* renamed from: getKeysList */
    public com.p176xb6135e39.p283xc50a8b8b.j9 mo135553x9ac07628() {
        return this.f70027x61390eb;
    }

    @Override // ig.j
    /* renamed from: getValuesList */
    public com.p176xb6135e39.p283xc50a8b8b.j9 mo135560x691318d6() {
        return this.f70030xdce077d;
    }

    private i() {
        this.f70028x63bd734 = "";
        this.f70024x5ff952ea = "";
        this.f70025xaf45af60 = "";
        com.p176xb6135e39.p283xc50a8b8b.g7 g7Var = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f70027x61390eb = g7Var;
        this.f70030xdce077d = g7Var;
        this.f70026x8c6bae66 = g7Var;
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.i m135592x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.i) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f70019x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.i m135595x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (ig.i) f70019x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.i mo20559x786693c3() {
        return f70013xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public ig.h mo20599xaaa148a0() {
        return this == f70013xb3e828f3 ? new ig.h() : (ig.h) new ig.h().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) this);
    }

    /* renamed from: parseFrom */
    public static ig.i m135596x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.i) f70019x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public ig.h mo20596xab31548() {
        return m135589x3136c9db();
    }

    /* renamed from: parseFrom */
    public static ig.i m135601x92b714fd(byte[] bArr) {
        return (ig.i) f70019x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public ig.h mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new ig.h(r5Var);
    }

    /* renamed from: parseFrom */
    public static ig.i m135602x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.i) f70019x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.i m135597x92b714fd(java.io.InputStream inputStream) {
        return (ig.i) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f70019x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.i m135598x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.i) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f70019x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.i m135593x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (ig.i) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f70019x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static ig.i m135594x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.i) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f70019x8c3e301f, d0Var, t4Var);
    }
}
