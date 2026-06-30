package ig;

/* loaded from: classes16.dex */
public final class a0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements ig.b0 {

    /* renamed from: ATTACHMENTS_JSON_FIELD_NUMBER */
    public static final int f69937xfe279d56 = 5;

    /* renamed from: CREATION_ID_FIELD_NUMBER */
    public static final int f69938x15f1b592 = 2;

    /* renamed from: DEFAULT_INSTANCE */
    private static final ig.a0 f69939xb3e828f3 = new ig.a0();

    /* renamed from: PARSER */
    @java.lang.Deprecated
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f69940x8c3e301f = new ig.y();

    /* renamed from: PROJECT_CLASSIFICATION_FIELD_NUMBER */
    public static final int f69941x26c905c1 = 4;

    /* renamed from: REQUEST_ID_FIELD_NUMBER */
    public static final int f69942x9253b522 = 1;

    /* renamed from: SCENE_TAG_FIELD_NUMBER */
    public static final int f69943x170f1e66 = 3;

    /* renamed from: serialVersionUID */
    private static final long f69944x3a3ed56c = 0;

    /* renamed from: attachmentsJson_ */
    private volatile java.lang.Object f69945x4450c2a7;

    /* renamed from: bitField0_ */
    private int f69946x961a12dc;

    /* renamed from: creationId_ */
    private volatile java.lang.Object f69947xea464f45;

    /* renamed from: projectClassification_ */
    private volatile java.lang.Object f69948x8abe00e0;

    /* renamed from: requestId_ */
    private long f69949x235ed95;

    /* renamed from: sceneTag_ */
    private volatile java.lang.Object f69950x67139ab1;

    public /* synthetic */ a0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, ig.b bVar) {
        this(q5Var);
    }

    /* renamed from: getDefaultInstance */
    public static ig.a0 m135249x7c90cfc0() {
        return f69939xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m135250xc1a58b65() {
        return ig.y0.f372827i;
    }

    /* renamed from: newBuilder */
    public static ig.z m135251x3136c9db() {
        return f69939xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.a0 m135253x4a829d50(java.io.InputStream inputStream) {
        return (ig.a0) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f69940x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.a0 m135261x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (ig.a0) f69940x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m135265xc4ab3c1f() {
        return f69940x8c3e301f;
    }

    @Override // ig.b0
    /* renamed from: getAttachmentsJson */
    public java.lang.String mo135266xbd4ba682() {
        java.lang.Object obj = this.f69945x4450c2a7;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f69945x4450c2a7 = r17;
        }
        return r17;
    }

    @Override // ig.b0
    /* renamed from: getAttachmentsJsonBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135267xffbceb09() {
        java.lang.Object obj = this.f69945x4450c2a7;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f69945x4450c2a7 = h17;
        return h17;
    }

    @Override // ig.b0
    /* renamed from: getCreationId */
    public java.lang.String mo135268x4021f450() {
        java.lang.Object obj = this.f69947xea464f45;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f69947xea464f45 = r17;
        }
        return r17;
    }

    @Override // ig.b0
    /* renamed from: getCreationIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135269x97550dfb() {
        java.lang.Object obj = this.f69947xea464f45;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f69947xea464f45 = h17;
        return h17;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m135270x7ea0ace() {
        return f69940x8c3e301f;
    }

    @Override // ig.b0
    /* renamed from: getProjectClassification */
    public java.lang.String mo135271xe6db3da9() {
        java.lang.Object obj = this.f69948x8abe00e0;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f69948x8abe00e0 = r17;
        }
        return r17;
    }

    @Override // ig.b0
    /* renamed from: getProjectClassificationBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135272x65e0b442() {
        java.lang.Object obj = this.f69948x8abe00e0;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f69948x8abe00e0 = h17;
        return h17;
    }

    @Override // ig.b0
    /* renamed from: getRequestId */
    public long mo135273x28ca0554() {
        return this.f69949x235ed95;
    }

    @Override // ig.b0
    /* renamed from: getSceneTag */
    public java.lang.String mo135274x4da110e4() {
        java.lang.Object obj = this.f69950x67139ab1;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f69950x67139ab1 = r17;
        }
        return r17;
    }

    @Override // ig.b0
    /* renamed from: getSceneTagBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135275xe574ade7() {
        java.lang.Object obj = this.f69950x67139ab1;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f69950x67139ab1 = h17;
        return h17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // ig.b0
    /* renamed from: hasAttachmentsJson */
    public boolean mo135276x5da432be() {
        return (this.f69946x961a12dc & 16) != 0;
    }

    @Override // ig.b0
    /* renamed from: hasCreationId */
    public boolean mo135277x7af9b294() {
        return (this.f69946x961a12dc & 2) != 0;
    }

    @Override // ig.b0
    /* renamed from: hasProjectClassification */
    public boolean mo135278x3390ace5() {
        return (this.f69946x961a12dc & 8) != 0;
    }

    @Override // ig.b0
    /* renamed from: hasRequestId */
    public boolean mo135279xe89f6e90() {
        return (this.f69946x961a12dc & 1) != 0;
    }

    @Override // ig.b0
    /* renamed from: hasSceneTag */
    public boolean mo135280x7d1b9028() {
        return (this.f69946x961a12dc & 4) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372828j;
        j6Var.c(ig.a0.class, ig.z.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new ig.a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
    }

    /* renamed from: newBuilder */
    public static ig.z m135252x3136c9db(ig.a0 a0Var) {
        return (ig.z) f69939xb3e828f3.mo20599xaaa148a0().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) a0Var);
    }

    /* renamed from: parseFrom */
    public static ig.a0 m135262x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.a0) f69940x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private a0() {
        this.f69947xea464f45 = "";
        this.f69950x67139ab1 = "";
        this.f69948x8abe00e0 = "";
        this.f69945x4450c2a7 = "";
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.a0 m135254x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.a0) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f69940x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.a0 m135257x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (ig.a0) f69940x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.a0 mo20559x786693c3() {
        return f69939xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public ig.z mo20599xaaa148a0() {
        return this == f69939xb3e828f3 ? new ig.z() : (ig.z) new ig.z().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) this);
    }

    /* renamed from: parseFrom */
    public static ig.a0 m135258x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.a0) f69940x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public ig.z mo20596xab31548() {
        return m135251x3136c9db();
    }

    /* renamed from: parseFrom */
    public static ig.a0 m135263x92b714fd(byte[] bArr) {
        return (ig.a0) f69940x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public ig.z mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new ig.z(r5Var);
    }

    /* renamed from: parseFrom */
    public static ig.a0 m135264x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.a0) f69940x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.a0 m135259x92b714fd(java.io.InputStream inputStream) {
        return (ig.a0) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f69940x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.a0 m135260x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.a0) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f69940x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.a0 m135255x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (ig.a0) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f69940x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static ig.a0 m135256x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.a0) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f69940x8c3e301f, d0Var, t4Var);
    }
}
