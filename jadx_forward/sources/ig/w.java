package ig;

/* loaded from: classes16.dex */
public final class w extends com.p176xb6135e39.p283xc50a8b8b.l6 implements ig.x {

    /* renamed from: MUSIC_ACTIONS_FIELD_NUMBER */
    public static final int f70272x3e46086a = 4;

    /* renamed from: PREVIEW_DURATION_MS_FIELD_NUMBER */
    public static final int f70274x87009453 = 3;

    /* renamed from: PREVIEW_TEMPLATE_ID_FIELD_NUMBER */
    public static final int f70275x736c0de4 = 1;

    /* renamed from: PREVIEW_TEMPLATE_SOURCE_TYPE_FIELD_NUMBER */
    public static final int f70276x67c6215d = 2;

    /* renamed from: serialVersionUID */
    private static final long f70277x3a3ed56c = 0;

    /* renamed from: bitField0_ */
    private int f70278x961a12dc;

    /* renamed from: musicActions_ */
    private java.util.List<ig.s> f70279x1e703447;

    /* renamed from: previewDurationMs_ */
    private long f70280xed4f205d;

    /* renamed from: previewTemplateId_ */
    private volatile java.lang.Object f70281x73485ee2;

    /* renamed from: previewTemplateSourceType_ */
    private int f70282x26ed8348;

    /* renamed from: DEFAULT_INSTANCE */
    private static final ig.w f70271xb3e828f3 = new ig.w();

    /* renamed from: PARSER */
    @java.lang.Deprecated
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f70273x8c3e301f = new ig.u();

    /* renamed from: getDefaultInstance */
    public static ig.w m136469x7c90cfc0() {
        return f70271xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m136470xc1a58b65() {
        return ig.y0.f372825g;
    }

    /* renamed from: newBuilder */
    public static ig.v m136471x3136c9db() {
        return f70271xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.w m136473x4a829d50(java.io.InputStream inputStream) {
        return (ig.w) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f70273x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.w m136481x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (ig.w) f70273x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m136485xc4ab3c1f() {
        return f70273x8c3e301f;
    }

    @Override // ig.x
    /* renamed from: getMusicActions */
    public ig.s mo136242x8b38418e(int i17) {
        return this.f70279x1e703447.get(i17);
    }

    @Override // ig.x
    /* renamed from: getMusicActionsCount */
    public int mo136245x98fce821() {
        return this.f70279x1e703447.size();
    }

    @Override // ig.x
    /* renamed from: getMusicActionsList */
    public java.util.List<ig.s> mo136246xcb24ef4c() {
        return this.f70279x1e703447;
    }

    @Override // ig.x
    /* renamed from: getMusicActionsOrBuilder */
    public ig.t mo136247x2e9e624a(int i17) {
        return this.f70279x1e703447.get(i17);
    }

    @Override // ig.x
    /* renamed from: getMusicActionsOrBuilderList */
    public java.util.List<? extends ig.t> mo136248x18d45208() {
        return this.f70279x1e703447;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m136486x7ea0ace() {
        return f70273x8c3e301f;
    }

    @Override // ig.x
    /* renamed from: getPreviewDurationMs */
    public long mo136249x73a26f8c() {
        return this.f70280xed4f205d;
    }

    @Override // ig.x
    /* renamed from: getPreviewTemplateId */
    public java.lang.String mo136250x77f4cc67() {
        java.lang.Object obj = this.f70281x73485ee2;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70281x73485ee2 = r17;
        }
        return r17;
    }

    @Override // ig.x
    /* renamed from: getPreviewTemplateIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136251x30c8ac44() {
        java.lang.Object obj = this.f70281x73485ee2;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70281x73485ee2 = h17;
        return h17;
    }

    @Override // ig.x
    /* renamed from: getPreviewTemplateSourceType */
    public ig.c0 mo136252x14d79941() {
        ig.c0 a17 = ig.c0.a(this.f70282x26ed8348);
        return a17 == null ? ig.c0.UNKNOWN : a17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // ig.x
    /* renamed from: hasPreviewDurationMs */
    public boolean mo136253x6008dcc8() {
        return (this.f70278x961a12dc & 4) != 0;
    }

    @Override // ig.x
    /* renamed from: hasPreviewTemplateId */
    public boolean mo136254x645b39a3() {
        return (this.f70278x961a12dc & 1) != 0;
    }

    @Override // ig.x
    /* renamed from: hasPreviewTemplateSourceType */
    public boolean mo136255x1e8b0a7d() {
        return (this.f70278x961a12dc & 2) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372826h;
        j6Var.c(ig.w.class, ig.v.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new ig.w();
    }

    private w(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
    }

    /* renamed from: newBuilder */
    public static ig.v m136472x3136c9db(ig.w wVar) {
        return (ig.v) f70271xb3e828f3.mo20599xaaa148a0().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) wVar);
    }

    /* renamed from: parseFrom */
    public static ig.w m136482x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.w) f70273x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private w() {
        this.f70281x73485ee2 = "";
        this.f70282x26ed8348 = 0;
        this.f70279x1e703447 = java.util.Collections.emptyList();
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.w m136474x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.w) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f70273x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.w m136477x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (ig.w) f70273x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.w mo20559x786693c3() {
        return f70271xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public ig.v mo20599xaaa148a0() {
        ig.b bVar = null;
        return this == f70271xb3e828f3 ? new ig.v() : (ig.v) new ig.v().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) this);
    }

    /* renamed from: parseFrom */
    public static ig.w m136478x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.w) f70273x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public ig.v mo20596xab31548() {
        return m136471x3136c9db();
    }

    /* renamed from: parseFrom */
    public static ig.w m136483x92b714fd(byte[] bArr) {
        return (ig.w) f70273x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public ig.v mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new ig.v(r5Var);
    }

    /* renamed from: parseFrom */
    public static ig.w m136484x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.w) f70273x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.w m136479x92b714fd(java.io.InputStream inputStream) {
        return (ig.w) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f70273x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.w m136480x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.w) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f70273x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.w m136475x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (ig.w) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f70273x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static ig.w m136476x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.w) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f70273x8c3e301f, d0Var, t4Var);
    }
}
