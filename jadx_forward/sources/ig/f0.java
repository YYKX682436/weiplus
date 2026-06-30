package ig;

/* loaded from: classes16.dex */
public final class f0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements ig.g0 {

    /* renamed from: KEYS_FIELD_NUMBER */
    public static final int f69999x97f6eab9 = 1;

    /* renamed from: VALUES_FIELD_NUMBER */
    public static final int f70001xfce19a4b = 2;

    /* renamed from: serialVersionUID */
    private static final long f70002x3a3ed56c = 0;

    /* renamed from: keys_ */
    private com.p176xb6135e39.p283xc50a8b8b.g7 f70003x61390eb;

    /* renamed from: values_ */
    private com.p176xb6135e39.p283xc50a8b8b.g7 f70004xdce077d;

    /* renamed from: DEFAULT_INSTANCE */
    private static final ig.f0 f69998xb3e828f3 = new ig.f0();

    /* renamed from: PARSER */
    @java.lang.Deprecated
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f70000x8c3e301f = new ig.d0();

    public /* synthetic */ f0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, ig.b bVar) {
        this(q5Var);
    }

    /* renamed from: getDefaultInstance */
    public static ig.f0 m135486x7c90cfc0() {
        return f69998xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m135487xc1a58b65() {
        return ig.y0.f372831m;
    }

    /* renamed from: newBuilder */
    public static ig.e0 m135488x3136c9db() {
        return f69998xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.f0 m135490x4a829d50(java.io.InputStream inputStream) {
        return (ig.f0) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f70000x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.f0 m135498x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (ig.f0) f70000x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m135502xc4ab3c1f() {
        return f70000x8c3e301f;
    }

    @Override // ig.g0
    /* renamed from: getKeys */
    public java.lang.String mo135464xfb81966a(int i17) {
        return (java.lang.String) this.f70003x61390eb.get(i17);
    }

    @Override // ig.g0
    /* renamed from: getKeysBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135465xbcc8ac21(int i17) {
        return this.f70003x61390eb.f(i17);
    }

    @Override // ig.g0
    /* renamed from: getKeysCount */
    public int mo135466xbcd23cc5() {
        return this.f70003x61390eb.size();
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m135503x7ea0ace() {
        return f70000x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // ig.g0
    /* renamed from: getValues */
    public java.lang.String mo135468x33fcc018(int i17) {
        return (java.lang.String) this.f70004xdce077d.get(i17);
    }

    @Override // ig.g0
    /* renamed from: getValuesBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135469xb8ca5f33(int i17) {
        return this.f70004xdce077d.f(i17);
    }

    @Override // ig.g0
    /* renamed from: getValuesCount */
    public int mo135470xb8d3efd7() {
        return this.f70004xdce077d.size();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372832n;
        j6Var.c(ig.f0.class, ig.e0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new ig.f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
    }

    /* renamed from: newBuilder */
    public static ig.e0 m135489x3136c9db(ig.f0 f0Var) {
        return (ig.e0) f69998xb3e828f3.mo20599xaaa148a0().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) f0Var);
    }

    /* renamed from: parseFrom */
    public static ig.f0 m135499x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.f0) f70000x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    @Override // ig.g0
    /* renamed from: getKeysList */
    public com.p176xb6135e39.p283xc50a8b8b.j9 mo135467x9ac07628() {
        return this.f70003x61390eb;
    }

    @Override // ig.g0
    /* renamed from: getValuesList */
    public com.p176xb6135e39.p283xc50a8b8b.j9 mo135471x691318d6() {
        return this.f70004xdce077d;
    }

    private f0() {
        com.p176xb6135e39.p283xc50a8b8b.g7 g7Var = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f70003x61390eb = g7Var;
        this.f70004xdce077d = g7Var;
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.f0 m135491x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.f0) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f70000x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.f0 m135494x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (ig.f0) f70000x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.f0 mo20559x786693c3() {
        return f69998xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public ig.e0 mo20599xaaa148a0() {
        return this == f69998xb3e828f3 ? new ig.e0() : (ig.e0) new ig.e0().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) this);
    }

    /* renamed from: parseFrom */
    public static ig.f0 m135495x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.f0) f70000x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public ig.e0 mo20596xab31548() {
        return m135488x3136c9db();
    }

    /* renamed from: parseFrom */
    public static ig.f0 m135500x92b714fd(byte[] bArr) {
        return (ig.f0) f70000x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public ig.e0 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new ig.e0(r5Var);
    }

    /* renamed from: parseFrom */
    public static ig.f0 m135501x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.f0) f70000x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.f0 m135496x92b714fd(java.io.InputStream inputStream) {
        return (ig.f0) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f70000x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.f0 m135497x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.f0) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f70000x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.f0 m135492x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (ig.f0) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f70000x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static ig.f0 m135493x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.f0) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f70000x8c3e301f, d0Var, t4Var);
    }
}
